/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.VectorDrawable
 *  android.text.style.ReplacementSpan
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.VectorDrawable;
import android.text.style.ReplacementSpan;

public class EndOfAyaSpan
extends ReplacementSpan {
    private Typeface fontNumber;
    private String number;
    private VectorDrawable vectorDrawable;

    public EndOfAyaSpan(VectorDrawable vectorDrawable, Typeface typeface, String string2) {
        this.vectorDrawable = vectorDrawable;
        this.fontNumber = typeface;
        this.number = string2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int n, int n2, float f, int n3, int n4, int n5, Paint paint) {
        String string2;
        int n6;
        EndOfAyaSpan endOfAyaSpan = this;
        Canvas canvas2 = canvas;
        float f2 = f;
        Paint paint2 = paint;
        CharSequence charSequence2 = ((Object)charSequence).toString().substring(n, n2);
        if (charSequence2 != null && (n6 = ((String)charSequence2).equals(string2 = " \u0646\u0635")) == 0) {
            n6 = n4;
            float f3 = n4;
            charSequence2 = charSequence;
            canvas.drawText(charSequence, n, n2, f, f3, paint);
            return;
        }
        float f4 = paint2.measureText((String)charSequence2);
        Typeface typeface = paint.getTypeface();
        float f5 = paint.getTextSize();
        string2 = endOfAyaSpan.fontNumber;
        paint2.setTypeface((Typeface)string2);
        float f6 = Float.MIN_VALUE;
        paint2.setFakeBoldText(true);
        string2 = endOfAyaSpan.number;
        n6 = string2.length();
        float f7 = 0.7f;
        int n7 = 2;
        float f8 = 2.8E-45f;
        if (n6 > n7) {
            f6 = paint.getTextSize();
            float f9 = 0.8f;
            paint2.setTextSize(f6 *= f9);
        } else {
            f6 = paint.getTextSize() * f7;
            paint2.setTextSize(f6);
        }
        string2 = new Rect();
        String string3 = endOfAyaSpan.number;
        int n8 = string3.length();
        paint2.getTextBounds(string3, 0, n8, (Rect)string2);
        float f10 = (int)f2;
        int n9 = n3;
        float f11 = n3;
        f4 = (int)(f4 + f2);
        int n10 = n5;
        f2 = n5;
        string3 = new RectF(f10, f11, f4, f2);
        f4 = string3.width() * 0.43f;
        f2 = string3.height();
        n8 = 1054280253;
        f10 = 0.42f;
        VectorDrawable vectorDrawable = endOfAyaSpan.vectorDrawable;
        f11 = string3.centerX() - f4;
        n9 = (int)f11;
        float f12 = string3.centerY() - (f2 *= f10);
        int n11 = (int)f12;
        int n12 = (int)(string3.centerX() + f4);
        float f13 = string3.centerY() + f2;
        n10 = (int)f13;
        vectorDrawable.setBounds(n9, n11, n12, n10);
        charSequence2 = endOfAyaSpan.vectorDrawable;
        n10 = paint.getColor();
        vectorDrawable = PorterDuff.Mode.SRC_IN;
        charSequence2.setColorFilter(n10, (PorterDuff.Mode)vectorDrawable);
        endOfAyaSpan.vectorDrawable.draw(canvas2);
        charSequence2 = endOfAyaSpan.number;
        n12 = ((String)charSequence2).length();
        n10 = 1053609165;
        f2 = 0.4f;
        if (n12 > n7) {
            f4 = paint.getTextSize() * f7;
            paint2.setTextSize(f4);
            charSequence2 = endOfAyaSpan.number;
            f7 = string3.centerX();
            f8 = (float)string2.width() * f2;
            f7 -= f8;
            f2 = string3.centerY();
            n6 = string2.height();
            f6 = n6;
            n7 = 0x3EB33333;
            f8 = 0.35f;
            canvas2.drawText((String)charSequence2, f7, f2 += (f6 *= f8), paint2);
        } else {
            charSequence2 = endOfAyaSpan.number;
            f7 = string3.centerX();
            n7 = string2.width();
            f8 = n7;
            n8 = 1057635697;
            f10 = 0.54f;
            f8 = string3.centerY();
            n6 = string2.height();
            f6 = (float)n6 * f2;
            canvas2.drawText((String)charSequence2, f7 -= (f8 *= f10), f8 += f6, paint2);
        }
        paint2.setTypeface(typeface);
        paint2.setTextSize(f5);
        paint2.setFakeBoldText(false);
    }

    public int getSize(Paint paint, CharSequence charSequence, int n, int n2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round(paint.measureText(charSequence, n, n2));
    }
}

