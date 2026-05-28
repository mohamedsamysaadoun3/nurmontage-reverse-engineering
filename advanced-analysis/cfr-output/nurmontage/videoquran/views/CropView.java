/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.View
 *  android.view.animation.AccelerateDecelerateInterpolator
 */
package hazem.nurmontage.videoquran.views;

import android.animation.TimeInterpolator;
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
import hazem.nurmontage.videoquran.views.CropView$1;
import hazem.nurmontage.videoquran.views.CropView$ICropCallback;
import hazem.nurmontage.videoquran.views.CropView$ScaleListener;

public class CropView
extends View {
    private static final int HINT_ANIMATION_DURATION = 700;
    private static final int HINT_ANIMATION_REPEATS = 2;
    private static final float HINT_SCALE_MAX_FACTOR = 1.0f;
    private static final float HINT_SCALE_MIN_FACTOR = 0.85f;
    private static final String TAG = "CropView";
    private Bitmap bitmap;
    private Paint bitmapPaint;
    private Paint cropPaint;
    private RectF cropRect;
    private boolean hintAnimationPlayed = false;
    private ValueAnimator hintAnimator;
    private CropView$ICropCallback iCropCallback;
    private float initialHintRectCenterX;
    private float initialHintRectCenterY;
    private float initialHintRectHeight;
    private float initialHintRectWidth;
    private boolean isDragging = false;
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
    private float scaleFactor = 1.0f;
    private ScaleGestureDetector scaleGestureDetector;
    private float startX;
    private float startY;
    private int touchTolerance = 10;

    static /* bridge */ /* synthetic */ RectF cfr_renamed_471(CropView cropView) {
        return cropView.cropRect;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_472(CropView cropView) {
        return cropView.initialHintRectCenterX;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_473(CropView cropView) {
        return cropView.initialHintRectCenterY;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_474(CropView cropView) {
        return cropView.initialHintRectHeight;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_475(CropView cropView) {
        return cropView.initialHintRectWidth;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_476(CropView cropView) {
        return cropView.lastFocusX;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_477(CropView cropView) {
        return cropView.lastFocusY;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_478(CropView cropView) {
        return cropView.mHeight;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_479(CropView cropView) {
        return cropView.mWidth;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_480(CropView cropView) {
        return cropView.minH;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_481(CropView cropView) {
        return cropView.minW;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_446(CropView cropView) {
        return cropView.scaleFactor;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_482(CropView cropView, float f) {
        cropView.lastFocusX = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_483(CropView cropView, float f) {
        cropView.lastFocusY = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_467(CropView cropView, float f) {
        cropView.scaleFactor = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_484(CropView cropView, float f, float f2) {
        cropView.moveCropRect(f, f2);
    }

    public CropView(Context context) {
        super(context);
        this.init();
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public CropView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init();
    }

    private void init() {
        Matrix matrix;
        this.matrix = matrix = new Matrix();
        matrix = new Paint();
        this.cropPaint = matrix;
        matrix.setColor(-15605);
        matrix = this.cropPaint;
        Paint.Style style2 = Paint.Style.STROKE;
        matrix.setStyle(style2);
        this.cropPaint.setStrokeWidth(5.0f);
        matrix = this.cropPaint;
        boolean bl = true;
        matrix.setAntiAlias(bl);
        matrix = new Paint();
        this.bitmapPaint = matrix;
        matrix.setAntiAlias(bl);
        this.bitmapPaint.setFilterBitmap(bl);
        matrix = new RectF();
        this.cropRect = matrix;
        style2 = this.getContext();
        CropView$ScaleListener cropView$ScaleListener = new CropView$ScaleListener(this, null);
        matrix = new ScaleGestureDetector((Context)style2, (ScaleGestureDetector.OnScaleGestureListener)cropView$ScaleListener);
        this.scaleGestureDetector = matrix;
    }

    private void moveCropRect(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        RectF rectF = this.cropRect;
        float f12 = rectF.left + f;
        RectF rectF2 = this.cropRect;
        float f13 = rectF2.top + f2;
        RectF rectF3 = this.cropRect;
        float f14 = rectF3.right + f;
        RectF rectF4 = this.cropRect;
        float f15 = rectF4.bottom + f2;
        float f16 = f12 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (f17 < 0) {
            f14 = this.cropRect.width();
            rectF = null;
            f12 = 0.0f;
        }
        if ((f17 = (f11 = f13 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0) {
            f15 = this.cropRect.height();
            rectF2 = null;
            f13 = 0.0f;
        }
        if ((f10 = (f9 = f14 - (f8 = this.mWidth)) == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1)) > 0) {
            rectF = this.cropRect;
            f12 = rectF.width();
            f12 = f8 - f12;
            f14 = f8;
        }
        if ((f10 = (f7 = f15 - (f8 = this.mHeight)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            rectF2 = this.cropRect;
            f13 = rectF2.height();
            f13 = f8 - f13;
            f15 = f8;
        }
        if ((f17 = (f6 = (f8 = f14 - f12) - (f5 = this.minW)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            float f18 = f - 0.0f;
            f4 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            if (f4 > 0) {
                f14 = f12 + f5;
            } else {
                f12 = f14 - f5;
            }
        }
        if ((f4 = (f3 = (f = f15 - f13) - (f8 = this.minH)) == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1)) < 0) {
            float f19 = f2 - 0.0f;
            f4 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            if (f4 > 0) {
                f15 = f13 + f8;
            } else {
                f13 = f15 - f8;
            }
        }
        this.cropRect.set(f12, f13, f14, f15);
    }

    private void startHintAnimation() {
        int n;
        ValueAnimator valueAnimator = this.hintAnimator;
        if (valueAnimator != null && (n = valueAnimator.isRunning()) != 0) {
            valueAnimator = this.hintAnimator;
            valueAnimator.cancel();
        }
        this.hintAnimationPlayed = true;
        n = 2;
        Object object = new float[n];
        object[0] = 1.0f;
        object[1] = 1.8f;
        object = ValueAnimator.ofFloat((float[])object);
        this.hintAnimator = (ValueAnimator)object;
        object.setDuration(700L);
        object = this.hintAnimator;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        object.setInterpolator((TimeInterpolator)accelerateDecelerateInterpolator);
        this.hintAnimator.setRepeatCount(3);
        this.hintAnimator.setRepeatMode(n);
        valueAnimator = this.hintAnimator;
        object = new CropView$1;
        object(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        this.hintAnimator.start();
    }

    public RectF getCropRect() {
        return this.cropRect;
    }

    public Bitmap getCroppedBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return null;
        }
        bitmap = this.cropRect;
        float f = bitmap.left;
        float f2 = this.scale;
        int n = Math.round(f /= f2);
        RectF rectF = this.cropRect;
        f2 = rectF.top;
        float f3 = this.scale;
        int n2 = Math.round(f2 /= f3);
        int n3 = 0;
        f3 = 0.0f;
        if (n < 0) {
            n = 0;
            bitmap = null;
            f = 0.0f;
        }
        if (n2 < 0) {
            n2 = 0;
            rectF = null;
            f2 = 0.0f;
        }
        f3 = this.cropRect.right;
        float f4 = this.scale;
        n3 = Math.round(f3 / f4);
        f4 = this.cropRect.bottom;
        float f5 = this.scale;
        int n4 = Math.round(f4 / f5);
        int n5 = this.bitmap.getWidth();
        n3 = Math.min(n3, n5);
        n5 = this.bitmap.getHeight();
        n4 = Math.min(n4, n5);
        Rect rect = new Rect(n, n2, n3, n4);
        bitmap = this.bitmap;
        n2 = this.radius;
        n3 = Common.MIN_SQUARE_W;
        n4 = Common.MIN_SQUARE_H;
        return UtilsBitmap.cropToSquareWithRoundCornersPlusScale(bitmap, rect, n2, n3, n4);
    }

    public Rect getRectSquare() {
        float f = this.cropRect.left;
        float f2 = this.scale;
        int n = Math.round(f / f2);
        f2 = this.cropRect.top;
        float f3 = this.scale;
        int n2 = Math.round(f2 / f3);
        f3 = this.cropRect.right;
        float f4 = this.scale;
        int n3 = Math.round(f3 / f4);
        f4 = this.cropRect.bottom;
        float f5 = this.scale;
        int n4 = Math.round(f4 / f5);
        Rect rect = new Rect(n, n2, n3, n4);
        return rect;
    }

    public float getmDrawingX() {
        return this.mDrawingX;
    }

    public float getmDrawingY() {
        return this.mDrawingY;
    }

    public float getmH() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1.0f;
        }
        float f = this.cropRect.height();
        float f2 = this.mHeight;
        return f / f2;
    }

    public float getmW() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1.0f;
        }
        float f = this.cropRect.width();
        float f2 = this.mWidth;
        return f / f2;
    }

    public float getmX() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 0.4f;
        }
        float f = this.cropRect.left;
        float f2 = this.mWidth;
        return Math.max(f / f2, 0.0f);
    }

    public float getmY() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 0.4f;
        }
        float f = this.cropRect.top;
        float f2 = this.mHeight;
        return Math.max(f / f2, 0.0f);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.save();
            float f = this.mDrawingX;
            float f2 = this.mDrawingY;
            canvas.translate(f, f2);
            int n = this.bitmap.getWidth();
            int n2 = this.bitmap.getHeight();
            canvas.clipRect(0, 0, n, n2);
            bitmap = this.bitmap;
            Matrix matrix = this.matrix;
            Paint paint = this.bitmapPaint;
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap = this.cropRect;
            n2 = this.radius;
            float f3 = n2;
            f2 = n2;
            Paint paint2 = this.cropPaint;
            canvas.drawRoundRect((RectF)bitmap, f3, f2, paint2);
            canvas.restore();
        }
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n;
        boolean bl;
        int n2;
        block11: {
            float f;
            float f2;
            block6: {
                int n3;
                block7: {
                    float f3;
                    ScaleGestureDetector scaleGestureDetector;
                    float f4;
                    int n4;
                    block8: {
                        block9: {
                            block10: {
                                ValueAnimator valueAnimator = this.hintAnimator;
                                n2 = 1;
                                if (valueAnimator != null && (bl = valueAnimator.isRunning())) {
                                    valueAnimator = this.hintAnimator;
                                    valueAnimator.cancel();
                                    this.hintAnimationPlayed = n2;
                                }
                                valueAnimator = this.scaleGestureDetector;
                                bl = valueAnimator.onTouchEvent(motionEvent);
                                n = motionEvent.getActionMasked();
                                f2 = motionEvent.getX();
                                f = motionEvent.getY();
                                if (n == 0) break block6;
                                n4 = 0;
                                f4 = 0.0f;
                                scaleGestureDetector = null;
                                if (n == n2) break block7;
                                int n5 = 2;
                                f3 = 2.8E-45f;
                                if (n == n5) break block8;
                                n3 = 3;
                                f2 = 4.2E-45f;
                                if (n == n3) break block9;
                                n3 = 5;
                                f2 = 7.0E-45f;
                                if (n == n3) break block10;
                                n3 = 6;
                                f2 = 8.4E-45f;
                                if (n == n3) break block7;
                                break block11;
                            }
                            this.isDragging = false;
                            break block11;
                        }
                        this.isDragging = false;
                        break block11;
                    }
                    scaleGestureDetector = this.scaleGestureDetector;
                    n4 = scaleGestureDetector.isInProgress();
                    if (n4 == 0 && (n4 = this.isDragging) != 0 && (n4 = motionEvent.getPointerCount()) == n2) {
                        f4 = this.startX;
                        f4 = f2 - f4;
                        f3 = this.startY;
                        f3 = f - f3;
                        this.moveCropRect(f4, f3);
                        this.startX = f2;
                        this.startY = f;
                    }
                    break block11;
                }
                if ((n3 = motionEvent.getActionIndex()) == 0) {
                    this.isDragging = false;
                }
                break block11;
            }
            ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
            boolean bl2 = scaleGestureDetector.isInProgress();
            if (!bl2) {
                this.isDragging = n2;
                this.startX = f2;
                this.startY = f;
            }
        }
        if (bl) {
            this.invalidate();
            return n2 != 0;
        }
        bl = this.isDragging;
        if (!bl && n != 0) {
            return super.onTouchEvent(motionEvent);
        }
        this.invalidate();
        return n2 != 0;
    }

    public void setBitmap(Bitmap bitmap, Rect rect, int n, boolean bl) {
        float f;
        this.bitmap = bitmap;
        this.radius = n;
        n = this.getWidth();
        int n2 = this.getPaddingStart();
        n -= n2;
        n2 = this.getPaddingEnd();
        this.mCanvas_width = f = (float)(n - n2);
        n = this.getHeight();
        n2 = this.getPaddingTop();
        n -= n2;
        n2 = this.getPaddingBottom();
        this.mCanvas_height = f = (float)(n - n2);
        n = bitmap.getWidth();
        int n3 = bitmap.getHeight();
        float f2 = this.mCanvas_width;
        f = n;
        f2 /= f;
        float f3 = this.mCanvas_height;
        float f4 = n3;
        this.scale = f2 = Math.min(f2, f3 /= f4);
        this.mWidth = f *= f2;
        this.mHeight = f4 *= f2;
        f2 = this.mCanvas_width - f;
        f = 0.5f;
        this.mDrawingX = f2 *= f;
        this.mDrawingY = f2 = (this.mCanvas_height - f4) * f;
        bitmap = new Matrix();
        this.matrix = bitmap;
        f = this.scale;
        bitmap.postScale(f, f);
        n = rect.left;
        f = n;
        f2 = this.scale;
        f *= f2;
        n2 = rect.top;
        f2 = n2;
        f3 = this.scale;
        f2 *= f3;
        int n4 = rect.right;
        f3 = n4;
        float f5 = this.scale;
        f3 *= f5;
        int n5 = rect.bottom;
        float f6 = n5;
        f5 = this.scale;
        bitmap = new RectF(f, f2, f3, f6 *= f5);
        this.cropRect = bitmap;
        f4 = Common.MIN_SQUARE_H;
        f6 = this.scale;
        this.minH = f4 *= f6;
        n3 = Common.MIN_SQUARE_W;
        f4 = n3;
        f6 = this.scale;
        this.minW = f4 *= f6;
        this.invalidate();
        if (!bl && (n3 = this.getWidth()) > 0 && (n3 = this.getHeight()) > 0) {
            this.initialHintRectWidth = f4 = this.cropRect.width();
            this.initialHintRectHeight = f4 = this.cropRect.height();
            this.initialHintRectCenterX = f4 = this.cropRect.centerX();
            bitmap = this.cropRect;
            this.initialHintRectCenterY = f4 = bitmap.centerY();
            this.startHintAnimation();
        }
    }

    public void setBitmapLast(Bitmap bitmap, Rect rect, int n, boolean bl) {
        float f;
        RectF rectF;
        this.bitmap = bitmap;
        int n2 = rect.left;
        float f2 = n2;
        int n3 = rect.top;
        float f3 = n3;
        int n4 = rect.right;
        float f4 = n4;
        float f5 = rect.bottom;
        this.cropRect = rectF = new RectF(f2, f3, f4, f5);
        this.radius = n;
        int n5 = this.getWidth();
        n = this.getPaddingStart();
        n5 -= n;
        n = this.getPaddingEnd();
        this.mCanvas_width = f5 = (float)(n5 - n);
        n5 = this.getHeight();
        n = this.getPaddingTop();
        n5 -= n;
        n = this.getPaddingBottom();
        this.mCanvas_height = f5 = (float)(n5 -= n);
        float f6 = bitmap.getHeight();
        f5 -= f6;
        n = 0x3F000000;
        this.mDrawingY = f5 *= 0.5f;
        this.mWidth = f5 = this.mCanvas_width;
        this.mHeight = f = (float)bitmap.getHeight();
        f = this.mCanvas_width;
        f5 = this.mWidth;
        rect = new Matrix();
        rect.postScale(f /= f5, f);
        int n6 = 0;
        f = 0.0f;
        bitmap = null;
        f6 = this.mDrawingY;
        rect.postTranslate(0.0f, f6);
        this.invalidate();
        if (!bl && (n6 = this.getWidth()) > 0 && (n6 = this.getHeight()) > 0) {
            this.initialHintRectWidth = f = this.cropRect.width();
            this.initialHintRectHeight = f = this.cropRect.height();
            this.initialHintRectCenterX = f = this.cropRect.centerX();
            bitmap = this.cropRect;
            this.initialHintRectCenterY = f = bitmap.centerY();
            this.startHintAnimation();
        }
    }

    public void setiCropCallback(CropView$ICropCallback cropView$ICropCallback) {
        this.iCropCallback = cropView$ICropCallback;
    }

    public void setmDrawingX(float f) {
        this.mDrawingX = f;
    }

    public void setmDrawingY(float f) {
        this.mDrawingY = f;
    }
}

