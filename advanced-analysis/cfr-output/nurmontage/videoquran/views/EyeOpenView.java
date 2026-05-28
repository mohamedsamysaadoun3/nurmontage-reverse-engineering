/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.util.AttributeSet
 *  android.view.View
 */
package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import hazem.nurmontage.videoquran.views.EyeOpenView$$ExternalSyntheticLambda0;

public class EyeOpenView
extends View {
    private Bitmap bitmap;
    private float centerX;
    private float centerY;
    private Paint clearPaint;
    private float currentRY;
    private Path eyePath;
    private RectF eyeRect;
    private Paint paint;
    private float radiusX;
    private float radiusYFull;
    private float wrapOffset;

    public EyeOpenView(Context context) {
        super(context);
        int n = 1;
        super(n);
        this.paint = context;
        super(n);
        this.clearPaint = context;
        super();
        this.eyePath = context;
        super();
        this.eyeRect = context;
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        this.init();
    }

    public EyeOpenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n = 1;
        super(n);
        this.paint = context;
        super(n);
        this.clearPaint = context;
        super();
        this.eyePath = context;
        super();
        this.eyeRect = context;
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        this.init();
    }

    private void init() {
        Paint paint = this.clearPaint;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)porterDuffXfermode);
    }

    private float map(float f, float f2, float f3, float f4, float f5) {
        f -= f2;
        f /= (f3 -= f2);
        return f4 + (f *= (f5 -= f4));
    }

    /* synthetic */ void cfr_renamed_506(ValueAnimator valueAnimator) {
        float f;
        this.currentRY = f = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        Paint paint = this.paint;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        this.eyePath.reset();
        bitmap = this.eyeRect;
        float f = this.centerX;
        float f2 = this.radiusX;
        float f3 = f - f2;
        float f4 = this.centerY;
        float f5 = this.currentRY;
        float f6 = f4 - f5;
        bitmap.set(f3, f6, f += f2, f4 += f5);
        bitmap = this.eyePath;
        paint = this.eyeRect;
        Object object = Path.Direction.CW;
        bitmap.addOval((RectF)paint, object);
        canvas.saveLayer(null, null, 31);
        bitmap = this.eyePath;
        paint = this.clearPaint;
        canvas.drawPath((Path)bitmap, paint);
        canvas.restore();
        f3 = this.currentRY;
        f5 = this.radiusYFull;
        object = this;
        float f7 = this.map(f3, 0.0f, f5, 1.0f, 0.0f);
        canvas.save();
        f = this.getWidth();
        f2 = this.centerY;
        f3 = this.currentRY;
        canvas.clipRect(0.0f, 0.0f, f, f2 -= f3);
        f = this.centerX;
        f2 = this.centerY;
        f3 = this.currentRY;
        f2 -= f3;
        f3 = 1.0f;
        canvas.scale(f3, f7, f, f2);
        bitmap = this.bitmap;
        paint = this.paint;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        f5 = this.currentRY;
        float f8 = this.radiusYFull;
        f7 = this.map(f5, 0.0f, f8, 1.0f, 0.0f);
        canvas.save();
        f = this.centerY;
        f2 = this.currentRY;
        f += f2;
        f2 = this.getWidth();
        f4 = this.getHeight();
        canvas.clipRect(0.0f, f, f2, f4);
        f = this.centerX;
        f2 = this.centerY;
        f4 = this.currentRY;
        canvas.scale(f3, f7, f, f2 += f4);
        bitmap = this.bitmap;
        paint = this.paint;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        float f;
        float f2 = n;
        float f3 = 2.0f;
        this.centerX = f = f2 / f3;
        f = n2;
        this.centerY = f3 = f / f3;
        this.radiusX = f2 *= 0.4f;
        this.radiusYFull = f *= 0.2f;
        super.onSizeChanged(n, n2, n3, n4);
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.invalidate();
    }

    public void startEyeOpenAnimation(long l) {
        float f = this.radiusYFull;
        float[] fArray = new float[]{0.0f, f};
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])fArray);
        valueAnimator.setDuration(l);
        EyeOpenView$$ExternalSyntheticLambda0 eyeOpenView$$ExternalSyntheticLambda0 = new EyeOpenView$$ExternalSyntheticLambda0(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)eyeOpenView$$ExternalSyntheticLambda0);
        valueAnimator.setRepeatCount(5);
        valueAnimator.start();
    }
}

