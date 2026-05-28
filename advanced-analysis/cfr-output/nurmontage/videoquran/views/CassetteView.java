/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.View
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CassetteView
extends View {
    private String labelText = "Titanium \u2013 David Guetta Ft. Sia";
    private Paint paintAccent;
    private Paint paintBody;
    private Paint paintFloor;
    private Paint paintHole;
    private Paint paintLabel;
    private Paint paintReel;
    private Paint paintScrew;
    private Paint paintShadow;
    private Paint paintText;

    public CassetteView(Context context) {
        super(context);
        this.init();
    }

    public CassetteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public CassetteView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init();
    }

    private void drawInnerGear(Canvas canvas, float f, float f2, float f3, float f4, int n, Paint paint) {
        Path path = new Path();
        int n2 = n * 2;
        double d = n2;
        double d2 = Math.PI * 2 / d;
        for (int i = 0; i < n2; ++i) {
            float f5;
            float f6;
            double d3 = (double)i * d2;
            int n3 = i % 2;
            if (n3 == 0) {
                f6 = f;
                f5 = f3;
            } else {
                f6 = f;
                f5 = f4;
            }
            double d4 = f6;
            double d5 = f5;
            double d6 = Math.cos(d3) * d5;
            f5 = (float)(d4 += d6);
            d6 = f2;
            d3 = Math.sin(d3);
            float f7 = (float)(d6 += (d5 *= d3));
            if (i == 0) {
                path.moveTo(f5, f7);
                continue;
            }
            path.lineTo(f5, f7);
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    private void init() {
        Paint paint;
        int n = 1;
        this.paintBody = paint = new Paint(n);
        int n2 = Color.parseColor((String)"#E74C3C");
        paint.setColor(n2);
        this.paintShadow = paint = new Paint(n);
        n2 = Color.parseColor((String)"#A93226");
        paint.setColor(n2);
        this.paintLabel = paint = new Paint(n);
        n2 = Color.parseColor((String)"#FAE5D3");
        paint.setColor(n2);
        this.paintReel = paint = new Paint(n);
        n2 = -16777216;
        paint.setColor(n2);
        this.paintHole = paint = new Paint(n);
        int n3 = Color.parseColor((String)"#5DADE2");
        paint.setColor(n3);
        this.paintAccent = paint = new Paint(n);
        n3 = Color.parseColor((String)"#E67E22");
        paint.setColor(n3);
        this.paintScrew = paint = new Paint(n);
        paint.setColor(-1);
        this.paintFloor = paint = new Paint(n);
        n3 = Color.parseColor((String)"#6EC6E9");
        paint.setColor(n3);
        this.paintText = paint = new Paint(n);
        paint.setColor(n2);
        this.paintText.setTextSize(36.0f);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n = this.getWidth();
        int n2 = this.getHeight();
        int n3 = Color.parseColor((String)"#87CEEB");
        canvas.drawColor(n3);
        Path path = new Path();
        float f = n2;
        float f2 = 0.7f * f;
        path.moveTo(0.0f, f2);
        float f3 = n;
        path.lineTo(f3, f2);
        path.lineTo(f3, f);
        path.lineTo(0.0f, f);
        path.close();
        Object object = this.paintFloor;
        canvas.drawPath(path, object);
        float f4 = 0.12f * f3;
        float f5 = 0.32f * f;
        float f6 = 0.92f * f3;
        float f7 = 0.72f * f;
        object = new RectF(f4, f5, f6, f7);
        f5 = 0.1f;
        f6 = f3 * f5;
        f7 = 0.3f;
        float f8 = f * f7;
        float f9 = 0.9f * f3;
        path = new RectF(f6, f8, f9, f2);
        Paint paint = this.paintShadow;
        float f10 = 20.0f;
        canvas.drawRoundRect((RectF)object, f10, f10, paint);
        object = this.paintBody;
        canvas.drawRoundRect((RectF)path, f10, f10, object);
        object = new Path();
        object.moveTo(f6, f8);
        object.lineTo(f9, f8);
        float f11 = f3 * 0.85f;
        f4 = 0.35f;
        f8 = f * f4;
        object.lineTo(f11, f8);
        f10 = 0.15f * f3;
        object.lineTo(f10, f8);
        object.close();
        Object object2 = this.paintAccent;
        canvas.drawPath((Path)object, object2);
        object = new Path();
        object.moveTo(f6, f2);
        object.lineTo(f9, f2);
        f2 = 0.65f;
        f6 = f * f2;
        object.lineTo(f11, f6);
        object.lineTo(f10, f6);
        object.close();
        Paint paint2 = this.paintAccent;
        canvas.drawPath((Path)object, paint2);
        f6 = 0.2f * f3;
        f8 = 0.36f * f;
        f9 = 0.8f * f3;
        float f12 = 0.44f * f;
        object = new RectF(f6, f8, f9, f12);
        object2 = this.paintLabel;
        canvas.drawRect((RectF)object, object2);
        object = this.paintText;
        object2 = this.labelText;
        float f13 = object.measureText((String)object2);
        f13 = (f3 - f13) / 2.0f;
        f8 = 0.415f * f;
        String string2 = this.labelText;
        Paint paint3 = this.paintText;
        canvas.drawText(string2, f13, f8, paint3);
        f8 = 0.48f * f;
        f12 = 0.62f * f;
        object = new RectF(f6, f8, f9, f12);
        paint2 = this.paintLabel;
        canvas.drawRect((RectF)object, paint2);
        f12 = f * f5;
        float f14 = f12 * f7;
        float f15 = f12 * 0.45f;
        f9 = f * 0.55f;
        f8 = f3 * f2;
        object = this.paintReel;
        canvas.drawCircle(f4 *= f3, f9, f12, object);
        Paint paint4 = this.paintHole;
        object = this;
        Canvas canvas2 = canvas;
        f5 = f9;
        f6 = f14;
        f7 = f15;
        float f16 = f11;
        f11 = f8;
        int n4 = 8;
        f8 = 1.1E-44f;
        float f17 = f10;
        f10 = f9;
        Paint paint5 = paint4;
        this.drawInnerGear(canvas, f4, f9, f14, f15, n4, paint4);
        object = this.paintReel;
        canvas.drawCircle(f11, f9, f12, object);
        paint5 = this.paintHole;
        object = this;
        f4 = f11;
        this.drawInnerGear(canvas, f11, f9, f14, f15, 8, paint5);
        f13 = 0.34f * f;
        canvas2 = this.paintScrew;
        f4 = f17;
        canvas.drawCircle(f17, f13, f3 *= 0.015f, (Paint)canvas2);
        canvas2 = this.paintScrew;
        f5 = f16;
        canvas.drawCircle(f16, f13, f3, (Paint)canvas2);
        object = this.paintScrew;
        canvas.drawCircle(f17, f *= 0.66f, f3, object);
        object = this.paintScrew;
        canvas.drawCircle(f16, f, f3, object);
    }
}

