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
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class EyeOpenView extends View {
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

    private float map(float f, float value, float value0, float value0, float floatValue5) {
        return value0 + (((f - value) / (value0 - value)) * (floatValue5 - f4));
    }

    public EyeOpenView(Context context) {
        super(context);
        this.paint = new Paint(1);
        this.clearPaint = new Paint(1);
        this.eyePath = new Path();
        this.eyeRect = new RectF();
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        init();
    }

    public EyeOpenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint(1);
        this.clearPaint = new Paint(1);
        this.eyePath = new Path();
        this.eyeRect = new RectF();
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        init();
    }

    private void init() {
        this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        invalidate();
    }

    public void startEyeOpenAnimation(long durationMs) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.radiusYFull);
        ofFloat.setDuration(durationMs);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hazem.nurmontage.videoquran.views.EyeOpenView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EyeOpenView.this.m665x427c16e7(valueAnimator);
            }
        });
        ofFloat.setRepeatCount(5);
        ofFloat.start();
    }

    /* renamed from: lambda$startEyeOpenAnimation$0$hazem-nurmontage-videoquran-views-EyeOpenView */
    /* synthetic */ void m665x427c16e7(ValueAnimator valueAnimator) {
        this.currentRY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int size4) {
        float f = i;
        this.centerX = f / 2.0f;
        float fontSize = i2;
        this.centerY = fontSize / 2.0f;
        this.radiusX = f * 0.4f;
        this.radiusYFull = fontSize * 0.2f;
        super.onSizeChanged(i, i2, i3, size4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
        this.eyePath.reset();
        RectF rectF = this.eyeRect;
        float f = this.centerX;
        float scaleFactor = this.radiusX;
        float scaleFactor9 = this.centerY;
        float scaleFactor9 = this.currentRY;
        rectF.set(f - scaleFactor, scaleFactor9 - scaleFactor9, f + scaleFactor, scaleFactor9 + scaleFactor9);
        this.eyePath.addOval(this.eyeRect, Path.Direction.CW);
        canvas.saveLayer(null, null, 31);
        canvas.drawPath(this.eyePath, this.clearPaint);
        canvas.restore();
        float map = map(this.currentRY, 0.0f, this.radiusYFull, 1.0f, 0.0f);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.centerY - this.currentRY);
        canvas.scale(1.0f, map, this.centerX, this.centerY - this.currentRY);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
        float map2 = map(this.currentRY, 0.0f, this.radiusYFull, 1.0f, 0.0f);
        canvas.save();
        canvas.clipRect(0.0f, this.centerY + this.currentRY, getWidth(), getHeight());
        canvas.scale(1.0f, map2, this.centerX, this.centerY + this.currentRY);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
    }
}
