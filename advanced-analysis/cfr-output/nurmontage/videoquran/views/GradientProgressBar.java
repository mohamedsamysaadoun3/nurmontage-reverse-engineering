/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.util.AttributeSet
 *  android.view.View
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class GradientProgressBar
extends View {
    private float cornerRadius;
    private int[] gradientColors;
    private int maxProgress = 100;
    private int progress = 0;
    private Paint progressPaint;
    private RectF progressRect;
    private LinearGradient progressShader;
    private int trackColor = -1;
    private Paint trackPaint;
    private RectF trackRect;

    public GradientProgressBar(Context object) {
        super(object);
        int n = Color.parseColor((String)"#a8ce46");
        int n2 = Color.parseColor((String)"#D2DE49");
        int n3 = Color.parseColor((String)"#F4D853");
        object = new int[]{n, n2, n3};
        this.gradientColors = (int[])object;
        this.cornerRadius = 100.0f;
        this.init();
    }

    public GradientProgressBar(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        int n = Color.parseColor((String)"#a8ce46");
        int n2 = Color.parseColor((String)"#D2DE49");
        int n3 = Color.parseColor((String)"#F4D853");
        object = new int[]{n, n2, n3};
        this.gradientColors = (int[])object;
        this.cornerRadius = 100.0f;
        this.init();
    }

    public GradientProgressBar(Context object, AttributeSet attributeSet, int n) {
        super(object, attributeSet, n);
        int n2 = Color.parseColor((String)"#a8ce46");
        int n3 = Color.parseColor((String)"#D2DE49");
        n = Color.parseColor((String)"#F4D853");
        object = new int[]{n2, n3, n};
        this.gradientColors = (int[])object;
        this.cornerRadius = 100.0f;
        this.init();
    }

    private void createProgressShader() {
        int n = this.getWidth();
        if (n > 0 && (n = this.getHeight()) > 0) {
            LinearGradient linearGradient;
            int n2 = this.getWidth();
            float f = n2;
            int[] nArray = this.gradientColors;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient2 = linearGradient;
            this.progressShader = linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, nArray, null, tileMode);
            linearGradient2 = this.progressPaint;
            linearGradient2.setShader((Shader)linearGradient);
        }
    }

    private void init() {
        Paint paint;
        this.trackPaint = paint = new Paint();
        int bl = this.trackColor;
        paint.setColor(bl);
        paint = this.trackPaint;
        boolean bl2 = true;
        paint.setAntiAlias(bl2);
        paint = this.trackPaint;
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        this.progressPaint = paint = new Paint();
        paint.setAntiAlias(bl2);
        paint = this.progressPaint;
        Paint.Style style3 = Paint.Style.FILL;
        paint.setStyle(style3);
        paint = new RectF();
        this.trackRect = paint;
        paint = new RectF();
        this.progressRect = paint;
    }

    public int getMax() {
        return this.maxProgress;
    }

    public int getProgress() {
        return this.progress;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.getWidth();
        float f2 = this.getHeight();
        this.trackRect.set(0.0f, 0.0f, f, f2);
        RectF rectF = this.trackRect;
        float f3 = this.cornerRadius;
        Paint paint = this.trackPaint;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.progress;
        f3 = this.maxProgress;
        this.progressRect.set(0.0f, 0.0f, f *= (f4 /= f3), f2);
        RectF rectF2 = this.progressRect;
        f2 = this.cornerRadius;
        rectF = this.progressPaint;
        canvas.drawRoundRect(rectF2, f2, f2, (Paint)rectF);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.createProgressShader();
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
        this.invalidate();
    }

    public void setGradientColors(int[] nArray) {
        int n;
        if (nArray != null && (n = nArray.length) > 0) {
            this.gradientColors = nArray;
            this.createProgressShader();
            this.invalidate();
        }
    }

    public void setMax(int n) {
        this.maxProgress = n;
        this.invalidate();
    }

    public void setProgress(int n) {
        if (n < 0) {
            n = 0;
            this.progress = 0;
        } else {
            int n2 = this.maxProgress;
            this.progress = n > n2 ? n2 : n;
        }
        this.invalidate();
    }

    public void setTrackColor(int n) {
        this.trackColor = n;
        this.trackPaint.setColor(n);
        this.invalidate();
    }
}

