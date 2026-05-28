// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;
import android.graphics.Canvas;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.common.Common;
import android.graphics.Rect;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.graphics.Matrix;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.view.View;

public class CropView extends View
{
    private static final int HINT_ANIMATION_DURATION = 700;
    private static final int HINT_ANIMATION_REPEATS = 2;
    private static final float HINT_SCALE_MAX_FACTOR = 1.0f;
    private static final float HINT_SCALE_MIN_FACTOR = 0.85f;
    private static final String TAG = "CropView";
    private Bitmap bitmap;
    private Paint bitmapPaint;
    private Paint cropPaint;
    private RectF cropRect;
    private boolean hintAnimationPlayed;
    private ValueAnimator hintAnimator;
    private CropView$ICropCallback iCropCallback;
    private float initialHintRectCenterX;
    private float initialHintRectCenterY;
    private float initialHintRectHeight;
    private float initialHintRectWidth;
    private boolean isDragging;
    private float lastFocusX;
    private float lastFocusY;
    private float mCanvas_height;
    private float mCanvas_width;
    private float mDrawingX;
    private float mDrawingY;
    private float mHeight;
    private float mWidth;
    private Matrix matrix;
    private float minH;
    private float minW;
    private int radius;
    private float scale;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    private float startX;
    private float startY;
    private int touchTolerance;
    
    public CropView(final Context context) {
        super(context);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        this.init();
    }
    
    public CropView(final Context context, final AttributeSet set) {
        super(context, set);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        this.init();
    }
    
    public CropView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        this.init();
    }
    
    private void init() {
        this.matrix = new Matrix();
        (this.cropPaint = new Paint()).setColor(-15605);
        this.cropPaint.setStyle(Paint$Style.STROKE);
        this.cropPaint.setStrokeWidth(5.0f);
        final Paint cropPaint = this.cropPaint;
        final boolean filterBitmap = true;
        cropPaint.setAntiAlias(filterBitmap);
        (this.bitmapPaint = new Paint()).setAntiAlias(filterBitmap);
        this.bitmapPaint.setFilterBitmap(filterBitmap);
        this.cropRect = new RectF();
        this.scaleGestureDetector = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector$OnScaleGestureListener)new CropView$ScaleListener(this, null));
    }
    
    private void moveCropRect(float n, final float n2) {
        float n3 = this.cropRect.left + n;
        float n4 = this.cropRect.top + n2;
        float width = this.cropRect.right + n;
        float height = this.cropRect.bottom + n2;
        if (n3 < 0.0f) {
            width = this.cropRect.width();
            n3 = 0.0f;
        }
        if (n4 < 0.0f) {
            height = this.cropRect.height();
            n4 = 0.0f;
        }
        final float mWidth = this.mWidth;
        if (width > mWidth) {
            n3 = mWidth - this.cropRect.width();
            width = mWidth;
        }
        final float mHeight = this.mHeight;
        if (height > mHeight) {
            n4 = mHeight - this.cropRect.height();
            height = mHeight;
        }
        final float n5 = width - n3;
        final float minW = this.minW;
        if (n5 < minW) {
            if (n > 0.0f) {
                width = n3 + minW;
            }
            else {
                n3 = width - minW;
            }
        }
        n = height - n4;
        final float minH = this.minH;
        if (n < minH) {
            if (n2 > 0.0f) {
                height = n4 + minH;
            }
            else {
                n4 = height - minH;
            }
        }
        this.cropRect.set(n3, n4, width, height);
    }
    
    private void startHintAnimation() {
        final ValueAnimator hintAnimator = this.hintAnimator;
        if (hintAnimator != null && hintAnimator.isRunning()) {
            this.hintAnimator.cancel();
        }
        this.hintAnimationPlayed = true;
        final int repeatMode = 2;
        final float[] array2;
        final float[] array = array2 = new float[repeatMode];
        array2[0] = 1.0f;
        array2[1] = 1.8f;
        (this.hintAnimator = ValueAnimator.ofFloat(array)).setDuration(700L);
        this.hintAnimator.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        this.hintAnimator.setRepeatCount(3);
        this.hintAnimator.setRepeatMode(repeatMode);
        this.hintAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new CropView$1(this));
        this.hintAnimator.start();
    }
    
    public RectF getCropRect() {
        return this.cropRect;
    }
    
    public Bitmap getCroppedBitmap() {
        if (this.bitmap == null) {
            return null;
        }
        int round = Math.round(this.cropRect.left / this.scale);
        int round2 = Math.round(this.cropRect.top / this.scale);
        if (round < 0) {
            round = 0;
        }
        if (round2 < 0) {
            round2 = 0;
        }
        return UtilsBitmap.cropToSquareWithRoundCornersPlusScale(this.bitmap, new Rect(round, round2, Math.min(Math.round(this.cropRect.right / this.scale), this.bitmap.getWidth()), Math.min(Math.round(this.cropRect.bottom / this.scale), this.bitmap.getHeight())), this.radius, Common.MIN_SQUARE_W, Common.MIN_SQUARE_H);
    }
    
    public Rect getRectSquare() {
        return new Rect(Math.round(this.cropRect.left / this.scale), Math.round(this.cropRect.top / this.scale), Math.round(this.cropRect.right / this.scale), Math.round(this.cropRect.bottom / this.scale));
    }
    
    public float getmDrawingX() {
        return this.mDrawingX;
    }
    
    public float getmDrawingY() {
        return this.mDrawingY;
    }
    
    public float getmH() {
        if (this.bitmap == null) {
            return 1.0f;
        }
        return this.cropRect.height() / this.mHeight;
    }
    
    public float getmW() {
        if (this.bitmap == null) {
            return 1.0f;
        }
        return this.cropRect.width() / this.mWidth;
    }
    
    public float getmX() {
        if (this.bitmap == null) {
            return 0.4f;
        }
        return Math.max(this.cropRect.left / this.mWidth, 0.0f);
    }
    
    public float getmY() {
        if (this.bitmap == null) {
            return 0.4f;
        }
        return Math.max(this.cropRect.top / this.mHeight, 0.0f);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.bitmap != null) {
            canvas.save();
            canvas.translate(this.mDrawingX, this.mDrawingY);
            canvas.clipRect(0, 0, this.bitmap.getWidth(), this.bitmap.getHeight());
            canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
            final RectF cropRect = this.cropRect;
            final int radius = this.radius;
            canvas.drawRoundRect(cropRect, (float)radius, (float)radius, this.cropPaint);
            canvas.restore();
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final ValueAnimator hintAnimator = this.hintAnimator;
        final boolean b = true;
        if (hintAnimator != null && hintAnimator.isRunning()) {
            this.hintAnimator.cancel();
            this.hintAnimationPlayed = b;
        }
        final boolean onTouchEvent = this.scaleGestureDetector.onTouchEvent(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        Label_0308: {
            if (actionMasked != 0) {
                if (actionMasked != (b ? 1 : 0)) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.isDragging = false;
                            break Label_0308;
                        }
                        if (actionMasked == 5) {
                            this.isDragging = false;
                            break Label_0308;
                        }
                        if (actionMasked != 6) {
                            break Label_0308;
                        }
                    }
                    else {
                        if (!this.scaleGestureDetector.isInProgress() && this.isDragging && motionEvent.getPointerCount() == (b ? 1 : 0)) {
                            this.moveCropRect(x - this.startX, y - this.startY);
                            this.startX = x;
                            this.startY = y;
                        }
                        break Label_0308;
                    }
                }
                if (motionEvent.getActionIndex() == 0) {
                    this.isDragging = false;
                }
            }
            else if (!this.scaleGestureDetector.isInProgress()) {
                this.isDragging = b;
                this.startX = x;
                this.startY = y;
            }
        }
        if (onTouchEvent) {
            this.invalidate();
            return b;
        }
        if (!this.isDragging && actionMasked != 0) {
            return super.onTouchEvent(motionEvent);
        }
        this.invalidate();
        return b;
    }
    
    public void setBitmap(final Bitmap bitmap, final Rect rect, int radius, final boolean b) {
        this.bitmap = bitmap;
        this.radius = radius;
        radius = this.getWidth();
        radius -= this.getPaddingStart();
        this.mCanvas_width = (float)(radius - this.getPaddingEnd());
        radius = this.getHeight();
        radius -= this.getPaddingTop();
        this.mCanvas_height = (float)(radius - this.getPaddingBottom());
        radius = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final float mCanvas_width = this.mCanvas_width;
        final float n = (float)radius;
        final float a = mCanvas_width / n;
        final float mCanvas_height = this.mCanvas_height;
        final float n2 = (float)height;
        final float min = Math.min(a, mCanvas_height / n2);
        this.scale = min;
        final float mWidth = n * min;
        this.mWidth = mWidth;
        final float mHeight = n2 * min;
        this.mHeight = mHeight;
        final float n3 = this.mCanvas_width - mWidth;
        final float n4 = 0.5f;
        this.mDrawingX = n3 * n4;
        this.mDrawingY = (this.mCanvas_height - mHeight) * n4;
        final Matrix matrix = new Matrix();
        this.matrix = matrix;
        final float scale = this.scale;
        matrix.postScale(scale, scale);
        radius = rect.left;
        this.cropRect = new RectF(radius * this.scale, rect.top * this.scale, rect.right * this.scale, rect.bottom * this.scale);
        this.minH = Common.MIN_SQUARE_H * this.scale;
        this.minW = Common.MIN_SQUARE_W * this.scale;
        this.invalidate();
        if (!b && this.getWidth() > 0 && this.getHeight() > 0) {
            this.initialHintRectWidth = this.cropRect.width();
            this.initialHintRectHeight = this.cropRect.height();
            this.initialHintRectCenterX = this.cropRect.centerX();
            this.initialHintRectCenterY = this.cropRect.centerY();
            this.startHintAnimation();
        }
    }
    
    public void setBitmapLast(final Bitmap bitmap, final Rect rect, int radius, final boolean b) {
        this.bitmap = bitmap;
        this.cropRect = new RectF((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom);
        this.radius = radius;
        final int width = this.getWidth();
        radius = this.getPaddingStart();
        final int n = width - radius;
        radius = this.getPaddingEnd();
        this.mCanvas_width = (float)(n - radius);
        final int height = this.getHeight();
        radius = this.getPaddingTop();
        final int n2 = height - radius;
        radius = this.getPaddingBottom();
        final float mCanvas_height = (float)(n2 - radius);
        this.mCanvas_height = mCanvas_height;
        final float n3 = mCanvas_height - bitmap.getHeight();
        radius = 1056964608;
        this.mDrawingY = n3 * 0.5f;
        this.mWidth = this.mCanvas_width;
        this.mHeight = (float)bitmap.getHeight();
        final float n4 = this.mCanvas_width / this.mWidth;
        final Matrix matrix = new Matrix();
        matrix.postScale(n4, n4);
        matrix.postTranslate(0.0f, this.mDrawingY);
        this.invalidate();
        if (!b && this.getWidth() > 0 && this.getHeight() > 0) {
            this.initialHintRectWidth = this.cropRect.width();
            this.initialHintRectHeight = this.cropRect.height();
            this.initialHintRectCenterX = this.cropRect.centerX();
            this.initialHintRectCenterY = this.cropRect.centerY();
            this.startHintAnimation();
        }
    }
    
    public void setiCropCallback(final CropView$ICropCallback iCropCallback) {
        this.iCropCallback = iCropCallback;
    }
    
    public void setmDrawingX(final float mDrawingX) {
        this.mDrawingX = mDrawingX;
    }
    
    public void setmDrawingY(final float mDrawingY) {
        this.mDrawingY = mDrawingY;
    }
}
