/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatTextView
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class AyaCircleBg
extends AppCompatTextView {
    private Paint bgPaint;
    private Path circlePath;
    private RectF circleRect;
    private Typeface typeface;

    public AyaCircleBg(Context context) {
        super(context);
        this.init(context);
    }

    public AyaCircleBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public AyaCircleBg(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(context);
    }

    private void init(Context context) {
        String string2;
        context = this.typeface;
        if (context == null) {
            context = this.getResources().getAssets();
            string2 = "fonts/arabic/\u0645\u062d\u0645\u062f\u064a.ttf";
            context = Typeface.createFromAsset((AssetManager)context, (String)string2);
            this.typeface = context;
            this.setTypeface((Typeface)context);
        }
        context = new Paint(1);
        this.bgPaint = context;
        string2 = Paint.Style.FILL;
        context.setStyle((Paint.Style)string2);
        context = new RectF();
        this.circleRect = context;
        context = new Path();
        this.circlePath = context;
    }

    protected void onDraw(Canvas canvas) {
        String string2 = ((Object)this.getText()).toString();
        TextPaint textPaint = this.getPaint();
        float f = textPaint.measureText(string2);
        textPaint = textPaint.getFontMetrics();
        float f2 = textPaint.descent;
        float f3 = textPaint.ascent;
        f2 -= f3;
        f3 = Math.max(f, f2);
        f2 = 2.0f;
        f3 = f3 / f2 + 20.0f;
        float f4 = (float)this.getWidth() / f2;
        float f5 = (float)this.getHeight() / f2;
        float f6 = f4 - (f /= f2);
        float f7 = f4 + f;
        int n = Color.parseColor((String)"#B7833AB4");
        int n2 = Color.parseColor((String)"#E1306C");
        int n3 = Color.parseColor((String)"#BCF58529");
        int[] nArray = new int[]{n, n2, n3};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(f6, f5, f7, f5, nArray, null, tileMode);
        this.bgPaint.setShader((Shader)linearGradient);
        string2 = this.bgPaint;
        canvas.drawCircle(f4, f5, f3, (Paint)string2);
        super.onDraw(canvas);
    }
}

