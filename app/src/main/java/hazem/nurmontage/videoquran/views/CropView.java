package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.common.Common;

/* loaded from: classes2.dex */
public class CropView extends View {
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
    private ICropCallback iCropCallback;
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

    public interface ICropCallback {
        void onSizeChange();
    }

    public void setiCropCallback(ICropCallback iCropCallback) {
        this.iCropCallback = iCropCallback;
    }

    public void setmDrawingX(float cropScale) {
        this.mDrawingX = cropScale;
    }

    public void setmDrawingY(float cropScale) {
        this.mDrawingY = cropScale;
    }

    public float getmDrawingX() {
        return this.mDrawingX;
    }

    public float getmDrawingY() {
        return this.mDrawingY;
    }

    public CropView(Context context) {
        super(context);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        init();
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        init();
    }

    public CropView(Context context, AttributeSet attributeSet, int index) {
        super(context, attributeSet, index);
        this.hintAnimationPlayed = false;
        this.scaleFactor = 1.0f;
        this.isDragging = false;
        this.touchTolerance = 10;
        init();
    }

    private void init() {
        this.matrix = new Matrix();
        Paint paint = new Paint();
        this.cropPaint = paint;
        paint.setColor(-15605);
        this.cropPaint.setStyle(Paint.Style.STROKE);
        this.cropPaint.setStrokeWidth(5.0f);
        this.cropPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        this.bitmapPaint.setFilterBitmap(true);
        this.cropRect = new RectF();
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
    }

    public Rect getRectSquare() {
        return new Rect(Math.round(this.cropRect.left / this.scale), Math.round(this.cropRect.top / this.scale), Math.round(this.cropRect.right / this.scale), Math.round(this.cropRect.bottom / this.scale));
    }

    public void setBitmapLast(Bitmap bitmap, Rect rect, int width10, boolean isFlag) {
        this.bitmap = bitmap;
        this.cropRect = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        this.radius = width10;
        this.mCanvas_width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        this.mCanvas_height = height;
        this.mDrawingY = (height - bitmap.getHeight()) * 0.5f;
        this.mWidth = this.mCanvas_width;
        this.mHeight = bitmap.getHeight();
        float cropScale = this.mCanvas_width / this.mWidth;
        Matrix matrix = new Matrix();
        matrix.postScale(cropScale, cropScale);
        matrix.postTranslate(0.0f, this.mDrawingY);
        invalidate();
        if (isFlag || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.initialHintRectWidth = this.cropRect.width();
        this.initialHintRectHeight = this.cropRect.height();
        this.initialHintRectCenterX = this.cropRect.centerX();
        this.initialHintRectCenterY = this.cropRect.centerY();
        startHintAnimation();
    }

    public void setBitmap(Bitmap bitmap, Rect rect, int width11, boolean isFlag) {
        this.bitmap = bitmap;
        this.radius = width11;
        this.mCanvas_width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        this.mCanvas_height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float min = Math.min(this.mCanvas_width / width, this.mCanvas_height / height);
        this.scale = min;
        float cropScale = width * min;
        this.mWidth = cropScale;
        float floatValue2 = height * min;
        this.mHeight = floatValue2;
        this.mDrawingX = (this.mCanvas_width - cropScale) * 0.5f;
        this.mDrawingY = (this.mCanvas_height - floatValue2) * 0.5f;
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        float f3 = this.scale;
        matrix.postScale(f3, f3);
        this.cropRect = new RectF(rect.left * this.scale, rect.top * this.scale, rect.right * this.scale, rect.bottom * this.scale);
        this.minH = Common.MIN_SQUARE_H * this.scale;
        this.minW = Common.MIN_SQUARE_W * this.scale;
        invalidate();
        if (isFlag || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.initialHintRectWidth = this.cropRect.width();
        this.initialHintRectHeight = this.cropRect.height();
        this.initialHintRectCenterX = this.cropRect.centerX();
        this.initialHintRectCenterY = this.cropRect.centerY();
        startHintAnimation();
    }

    private void startHintAnimation() {
        ValueAnimator valueAnimator = this.hintAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.hintAnimator.cancel();
        }
        this.hintAnimationPlayed = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.8f);
        this.hintAnimator = ofFloat;
        ofFloat.setDuration(700L);
        this.hintAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hintAnimator.setRepeatCount(3);
        this.hintAnimator.setRepeatMode(2);
        this.hintAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hazem.nurmontage.videoquran.views.CropView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float cropScale = ((Float) valueAnimator2.getAnimatedValue()).cropScale();
                float cropScale = CropView.this.initialHintRectWidth * cropScale;
                float floatValue2 = CropView.this.initialHintRectHeight * cropScale;
                float widthRatio = cropScale / 2.0f;
                float widthRatio13 = floatValue2 / 2.0f;
                CropView.this.cropRect.set(CropView.this.initialHintRectCenterX - widthRatio, CropView.this.initialHintRectCenterY - widthRatio13, CropView.this.initialHintRectCenterX + widthRatio, CropView.this.initialHintRectCenterY + widthRatio13);
                CropView.this.invalidate();
            }
        });
        this.hintAnimator.start();
    }

    @Override // android.view.View
    protected void onSizeChanged(int size, int i2, int i3, int size4) {
        super.onSizeChanged(value, i2, i3, size4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.bitmap != null) {
            canvas.save();
            canvas.translate(this.mDrawingX, this.mDrawingY);
            canvas.clipRect(0, 0, this.bitmap.getWidth(), this.bitmap.getHeight());
            canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
            RectF rectF = this.cropRect;
            int width = this.radius;
            canvas.drawRoundRect(rectF, width, width, this.cropPaint);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveCropRect(float cropScale, float floatValue2) {
        float xPosition = this.cropRect.left + cropScale;
        float xPosition17 = this.cropRect.top + floatValue2;
        float xPosition17 = this.cropRect.right + cropScale;
        float xPosition17 = this.cropRect.bottom + floatValue2;
        if (xPosition < 0.0f) {
            xPosition17 = this.cropRect.width();
            xPosition = 0.0f;
        }
        if (xPosition17 < 0.0f) {
            xPosition17 = this.cropRect.height();
            xPosition17 = 0.0f;
        }
        float xPosition17 = this.mWidth;
        if (xPosition17 > xPosition17) {
            xPosition = xPosition17 - this.cropRect.width();
            xPosition17 = xPosition17;
        }
        float xPosition = this.mHeight;
        if (xPosition17 > xPosition) {
            xPosition17 = xPosition - this.cropRect.height();
            xPosition17 = xPosition;
        }
        float f9 = xPosition17 - xPosition;
        float xPosition24 = this.minW;
        if (f9 < xPosition24) {
            if (cropScale > 0.0f) {
                xPosition17 = xPosition + xPosition24;
            } else {
                xPosition = xPosition17 - f10;
            }
        }
        float xPosition26 = xPosition17 - xPosition17;
        float xPosition26 = this.minH;
        if (xPosition26 < f12) {
            if (floatValue2 > 0.0f) {
                f6 = xPosition17 + f12;
            } else {
                f4 = f6 - f12;
            }
        }
        this.cropRect.set(f3, f4, f5, f6);
    }

    public float getmY() {
        if (this.bitmap == null) {
            return 0.4f;
        }
        return Math.max(this.cropRect.top / this.mHeight, 0.0f);
    }

    public float getmX() {
        if (this.bitmap == null) {
            return 0.4f;
        }
        return Math.max(this.cropRect.left / this.mWidth, 0.0f);
    }

    public float getmW() {
        if (this.bitmap == null) {
            return 1.0f;
        }
        return this.cropRect.width() / this.mWidth;
    }

    public float getmH() {
        if (this.bitmap == null) {
            return 1.0f;
        }
        return this.cropRect.height() / this.mHeight;
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

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            CropView.this.lastFocusX = scaleGestureDetector.getFocusX();
            CropView.this.lastFocusY = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            CropView.this.scaleFactor *= scaleFactor;
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float width = CropView.this.cropRect.width() * scaleFactor;
            float height = CropView.this.cropRect.height() * scaleFactor;
            if (width < CropView.this.minW) {
                width = CropView.this.minW;
            }
            if (height < CropView.this.minH) {
                height = CropView.this.minH;
            }
            if (width > CropView.this.mWidth) {
                width = CropView.this.cropRect.width();
            }
            if (height > CropView.this.mHeight) {
                height = CropView.this.cropRect.height();
            }
            float cropScale = focusX - CropView.this.lastFocusX;
            float floatValue2 = focusY - CropView.this.lastFocusY;
            float centerX = CropView.this.cropRect.centerX();
            float centerY = CropView.this.cropRect.centerY();
            float f3 = width / 2.0f;
            float f4 = height / 2.0f;
            CropView.this.cropRect.set(centerX - f3, centerY - f4, centerX + f3, centerY + f4);
            CropView.this.moveCropRect(cropScale, floatValue2);
            CropView.this.lastFocusX = focusX;
            CropView.this.lastFocusY = focusY;
            CropView.this.invalidate();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r2 != 6) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator = this.hintAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.hintAnimator.cancel();
            this.hintAnimationPlayed = true;
        }
        boolean onTouchEvent = this.scaleGestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            if (!this.scaleGestureDetector.isInProgress()) {
                this.isDragging = true;
                this.startX = x;
                this.startY = y;
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.isDragging = false;
                    } else if (actionMasked == 5) {
                        this.isDragging = false;
                    }
                } else if (!this.scaleGestureDetector.isInProgress() && this.isDragging && motionEvent.getPointerCount() == 1) {
                    moveCropRect(x - this.startX, y - this.startY);
                    this.startX = x;
                    this.startY = y;
                }
            }
            if (motionEvent.getActionIndex() == 0) {
                this.isDragging = false;
            }
        }
        if (onTouchEvent) {
            invalidate();
            return true;
        }
        if (this.isDragging || actionMasked == 0) {
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
