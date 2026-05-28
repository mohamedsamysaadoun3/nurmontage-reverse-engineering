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

public class NeumorphicRectView
extends View {
    private Paint backgroundPaint;
    private int baseColor;
    private float cornerRadius = 40.0f;
    private int darkShadowColor;
    private Paint darkShadowPaint;
    private int lightShadowColor;
    private Paint lightShadowPaint;
    private RectF rect;
    private float shadowOffset = 20.0f;

    public NeumorphicRectView(Context context) {
        super(context);
        int n;
        this.baseColor = n = Color.parseColor((String)"#398B89");
        this.lightShadowColor = n = Color.parseColor((String)"#57A9A7");
        this.darkShadowColor = n = Color.parseColor((String)"#1B6D6B");
        this.init();
    }

    public NeumorphicRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n;
        this.baseColor = n = Color.parseColor((String)"#398B89");
        this.lightShadowColor = n = Color.parseColor((String)"#57A9A7");
        this.darkShadowColor = n = Color.parseColor((String)"#1B6D6B");
        this.init();
    }

    public NeumorphicRectView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        int n2;
        this.baseColor = n2 = Color.parseColor((String)"#398B89");
        this.lightShadowColor = n2 = Color.parseColor((String)"#57A9A7");
        this.darkShadowColor = n2 = Color.parseColor((String)"#1B6D6B");
        this.init();
    }

    private void init() {
        Paint paint;
        int n = 1;
        this.setLayerType(n, null);
        this.backgroundPaint = paint = new Paint(n);
        int n2 = this.baseColor;
        paint.setColor(n2);
        paint = this.backgroundPaint;
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        this.lightShadowPaint = paint = new Paint(n);
        n2 = this.baseColor;
        paint.setColor(n2);
        paint = this.lightShadowPaint;
        style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        paint = this.lightShadowPaint;
        float f = this.shadowOffset;
        float f2 = -f;
        float f3 = -f;
        int n3 = this.lightShadowColor;
        paint.setShadowLayer(f, f2, f3, n3);
        this.darkShadowPaint = paint = new Paint(n);
        n = this.baseColor;
        paint.setColor(n);
        paint = this.darkShadowPaint;
        Paint.Style style3 = Paint.Style.FILL;
        paint.setStyle(style3);
        paint = this.darkShadowPaint;
        float f4 = this.shadowOffset;
        n2 = this.darkShadowColor;
        paint.setShadowLayer(f4, f4, f4, n2);
        paint = new RectF();
        this.rect = paint;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.rect;
        float f = this.cornerRadius;
        Paint paint = this.lightShadowPaint;
        canvas.drawRoundRect(rectF, f, f, paint);
        rectF = this.rect;
        f = this.cornerRadius;
        paint = this.darkShadowPaint;
        canvas.drawRoundRect(rectF, f, f, paint);
        rectF = this.rect;
        f = this.cornerRadius;
        paint = this.backgroundPaint;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        float f = this.shadowOffset;
        float f2 = 1.5f;
        float f3 = f * f2;
        float f4 = f * f2;
        float f5 = n;
        float f6 = f * f2;
        float f7 = n2;
        this.rect.set(f3, f4, f5 -= f6, f7 -= (f *= f2));
        Paint paint = this.backgroundPaint;
        f4 = this.rect.left;
        f6 = this.rect.top;
        float f8 = this.rect.right;
        float f9 = this.rect.bottom;
        f = Color.red((int)this.baseColor);
        f2 = 1.1f;
        n3 = (int)(f * f2);
        int n5 = (int)((float)Color.green((int)this.baseColor) * f2);
        n4 = (int)((float)Color.blue((int)this.baseColor) * f2);
        int n6 = 255;
        n3 = Color.argb((int)n6, (int)n3, (int)n5, (int)n4);
        f2 = Color.red((int)this.baseColor);
        f3 = 0.9f;
        n4 = (int)(f2 * f3);
        int n7 = (int)((float)Color.green((int)this.baseColor) * f3);
        n5 = (int)((float)Color.blue((int)this.baseColor) * f3);
        n7 = Color.argb((int)n6, (int)n4, (int)n7, (int)n5);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        n6 = n3;
        LinearGradient linearGradient = new LinearGradient(f4, f6, f8, f9, n3, n7, tileMode);
        paint.setShader((Shader)linearGradient);
    }
}

