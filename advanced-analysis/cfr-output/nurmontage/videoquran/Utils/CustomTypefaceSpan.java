/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class CustomTypefaceSpan
extends MetricAffectingSpan {
    private final Typeface typeface;

    public CustomTypefaceSpan(Typeface typeface) {
        this.typeface = typeface;
    }

    private static void applyCustomTypeFace(Paint paint, Typeface typeface) {
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.typeface;
        CustomTypefaceSpan.applyCustomTypeFace((Paint)textPaint, typeface);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.typeface;
        CustomTypefaceSpan.applyCustomTypeFace((Paint)textPaint, typeface);
    }
}

