// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Paint$FontMetrics;
import android.text.TextPaint;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

public class AyaCircleBg extends AppCompatTextView
{
    private Paint bgPaint;
    private Path circlePath;
    private RectF circleRect;
    private Typeface typeface;
    
    public AyaCircleBg(final Context context) {
        super(context);
        this.init(context);
    }
    
    public AyaCircleBg(final Context context, final AttributeSet set) {
        super(context, set);
        this.init(context);
    }
    
    public AyaCircleBg(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.init(context);
    }
    
    private void init(final Context context) {
        if (this.typeface == null) {
            this.setTypeface(this.typeface = Typeface.createFromAsset(this.getResources().getAssets(), "fonts/arabic/\u0645\u062d\u0645\u062f\u064a.ttf"));
        }
        (this.bgPaint = new Paint(1)).setStyle(Paint$Style.FILL);
        this.circleRect = new RectF();
        this.circlePath = new Path();
    }
    
    protected void onDraw(final Canvas canvas) {
        final String string = this.getText().toString();
        final TextPaint paint = this.getPaint();
        final float measureText = ((Paint)paint).measureText(string);
        final Paint$FontMetrics fontMetrics = ((Paint)paint).getFontMetrics();
        final float max = Math.max(measureText, fontMetrics.descent - fontMetrics.ascent);
        final float n = 2.0f;
        final float n2 = max / n + 20.0f;
        final float n3 = this.getWidth() / n;
        final float n4 = this.getHeight() / n;
        final float n5 = measureText / n;
        this.bgPaint.setShader((Shader)new LinearGradient(n3 - n5, n4, n3 + n5, n4, new int[] { Color.parseColor("#B7833AB4"), Color.parseColor("#E1306C"), Color.parseColor("#BCF58529") }, (float[])null, Shader$TileMode.CLAMP));
        canvas.drawCircle(n3, n4, n2, this.bgPaint);
        super.onDraw(canvas);
    }
}
