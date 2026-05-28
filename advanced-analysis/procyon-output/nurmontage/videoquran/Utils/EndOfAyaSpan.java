// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.VectorDrawable;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

public class EndOfAyaSpan extends ReplacementSpan
{
    private Typeface fontNumber;
    private String number;
    private VectorDrawable vectorDrawable;
    
    public EndOfAyaSpan(final VectorDrawable vectorDrawable, final Typeface fontNumber, final String number) {
        this.vectorDrawable = vectorDrawable;
        this.fontNumber = fontNumber;
        this.number = number;
    }
    
    public void draw(final Canvas canvas, final CharSequence charSequence, final int beginIndex, final int endIndex, final float n, final int n2, final int n3, final int n4, final Paint paint) {
        final String substring = charSequence.toString().substring(beginIndex, endIndex);
        if (substring != null && !substring.equals(" \u0646\u0635")) {
            canvas.drawText(charSequence, beginIndex, endIndex, n, (float)n3, paint);
            return;
        }
        final float measureText = paint.measureText(substring);
        final Typeface typeface = paint.getTypeface();
        final float textSize = paint.getTextSize();
        paint.setTypeface(this.fontNumber);
        paint.setFakeBoldText(true);
        final int length = this.number.length();
        final float n5 = 0.7f;
        final int n6 = 2;
        if (length > n6) {
            paint.setTextSize(paint.getTextSize() * 0.8f);
        }
        else {
            paint.setTextSize(paint.getTextSize() * n5);
        }
        final Rect rect = new Rect();
        final String number = this.number;
        paint.getTextBounds(number, 0, number.length(), rect);
        final RectF rectF = new RectF((float)(int)n, (float)n2, (float)(int)(measureText + n), (float)n4);
        final float n7 = rectF.width() * 0.43f;
        final float n8 = rectF.height() * 0.42f;
        this.vectorDrawable.setBounds((int)(rectF.centerX() - n7), (int)(rectF.centerY() - n8), (int)(rectF.centerX() + n7), (int)(rectF.centerY() + n8));
        this.vectorDrawable.setColorFilter(paint.getColor(), PorterDuff$Mode.SRC_IN);
        this.vectorDrawable.draw(canvas);
        final int length2 = this.number.length();
        final float n9 = 0.4f;
        if (length2 > n6) {
            paint.setTextSize(paint.getTextSize() * n5);
            canvas.drawText(this.number, rectF.centerX() - rect.width() * n9, rectF.centerY() + rect.height() * 0.35f, paint);
        }
        else {
            canvas.drawText(this.number, rectF.centerX() - rect.width() * 0.54f, rectF.centerY() + rect.height() * n9, paint);
        }
        paint.setTypeface(typeface);
        paint.setTextSize(textSize);
        paint.setFakeBoldText(false);
    }
    
    public int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        return Math.round(paint.measureText(charSequence, n, n2));
    }
}
