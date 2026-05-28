// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.MetricAffectingSpan;

public class CustomTypefaceSpan extends MetricAffectingSpan
{
    private final Typeface typeface;
    
    public CustomTypefaceSpan(final Typeface typeface) {
        this.typeface = typeface;
    }
    
    private static void applyCustomTypeFace(final Paint paint, final Typeface typeface) {
        paint.setTypeface(typeface);
    }
    
    public void updateDrawState(final TextPaint textPaint) {
        applyCustomTypeFace((Paint)textPaint, this.typeface);
    }
    
    public void updateMeasureState(final TextPaint textPaint) {
        applyCustomTypeFace((Paint)textPaint, this.typeface);
    }
}
