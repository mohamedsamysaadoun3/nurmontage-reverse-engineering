/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatImageView
 *  androidx.core.content.ContextCompat
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.common.Common;

public class SquareImageView
extends AppCompatImageView {
    private int anInt;
    private float cx;
    private float cy;
    private Drawable drawableDone;
    private boolean isSelect;
    private String number;
    private Paint paint;
    private Paint paintRect;
    private float r;
    private TextPaint textPaint;
    private float x;
    private float y;

    public SquareImageView(Context context) {
        super(context);
        int n = 1;
        super(n);
        this.paint = context;
        super(n);
        this.paintRect = context;
        super(n);
        this.textPaint = context;
        this.init();
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n = 1;
        super(n);
        this.paint = context;
        super(n);
        this.paintRect = context;
        super(n);
        this.textPaint = context;
        this.init();
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        int n2 = 1;
        super(n2);
        this.paint = context;
        super(n2);
        this.paintRect = context;
        super(n2);
        this.textPaint = context;
        this.init();
    }

    private void init() {
        this.textPaint.setColor(-1);
        TextPaint textPaint = this.textPaint;
        AssetManager assetManager = this.getResources().getAssets();
        CharSequence charSequence = new StringBuilder("fonts/");
        String string2 = Common.english_app_font;
        charSequence = charSequence.append(string2).toString();
        assetManager = Typeface.createFromAsset((AssetManager)assetManager, (String)charSequence);
        textPaint.setTypeface((Typeface)assetManager);
    }

    public int getAnInt() {
        return this.anInt;
    }

    public boolean isMSelect() {
        return this.isSelect;
    }

    protected void onDraw(Canvas canvas) {
        int n;
        super.onDraw(canvas);
        Object object = this.paint;
        if (object != null && (n = this.isSelect) != 0) {
            float f = this.getWidth();
            n = this.getHeight();
            float f2 = n;
            Paint paint = this.paintRect;
            float f3 = 0.0f;
            TextPaint textPaint = null;
            canvas.drawRect(0.0f, 0.0f, f, f2, paint);
            object = this.drawableDone;
            if (object != null) {
                object.draw(canvas);
            }
            if ((object = this.number) != null) {
                float f4 = this.cx;
                f3 = this.cy;
                textPaint = this.textPaint;
                canvas.drawText((String)object, f4, f3, (Paint)textPaint);
            }
        }
    }

    protected void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        n = this.getMeasuredWidth();
        this.setMeasuredDimension(n, n);
    }

    public void onSelect(boolean bl) {
        this.isSelect = bl;
        if (!bl) {
            Paint paint = this.paint;
            int n = -8355712;
            paint.setColor(n);
            paint = this.paint;
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
        } else {
            Paint paint = this.paint;
            int n = -12190534;
            paint.setColor(n);
            paint = this.paint;
            Paint.Style style3 = Paint.Style.FILL;
            paint.setStyle(style3);
        }
        this.invalidate();
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        float f;
        Paint.Style style2;
        super.onSizeChanged(n, n2, n3, n4);
        this.paintRect.setColor(-1056964608);
        float f2 = n;
        Object object = this.paint;
        n3 = 1017370378;
        float f3 = 0.02f * f2;
        object.setStrokeWidth(f3);
        n2 = this.isSelect ? 1 : 0;
        if (n2 == 0) {
            object = this.paint;
            n3 = -8355712;
            f3 = 0.0f / 0.0f;
            object.setColor(n3);
            object = this.paint;
            style2 = Paint.Style.STROKE;
            object.setStyle(style2);
        } else {
            object = this.paint;
            n3 = -12190534;
            f3 = -2.6317015E38f;
            object.setColor(n3);
            object = this.paint;
            style2 = Paint.Style.FILL;
            object.setStyle(style2);
        }
        object = this.textPaint;
        f3 = 0.25f * f2;
        object.setTextSize(f3);
        n2 = 0x3DCCCCCD;
        this.r = f = 0.1f * f2;
        f3 = 1.2f * f;
        this.x = f3 = f2 - f3;
        style2 = this.paint;
        f3 = style2.getStrokeWidth();
        this.y = f += f3;
        object = this.number;
        n3 = 0x3F000000;
        f3 = 0.5f;
        if (object != null) {
            n2 = this.getWidth();
            f = (float)n2 * f3;
            TextPaint textPaint = this.textPaint;
            String string2 = this.number;
            float f4 = textPaint.measureText(string2) * f3;
            this.cx = f -= f4;
        }
        this.cy = f = (float)this.getHeight() * f3;
        n = (int)(f2 * 0.3f);
        n2 = (int)((float)this.getWidth() * f3);
        n4 = n2 - n;
        float f5 = this.cy;
        float f6 = n;
        int n5 = (int)(f5 - f6);
        n2 += n;
        n = (int)(f5 + f6);
        style2 = new Rect(n4, n5, n2, n);
        Context context = this.getContext();
        n2 = R$drawable.check_24px;
        context = ContextCompat.getDrawable((Context)context, (int)n2);
        this.drawableDone = context;
        n2 = style2.left;
        n4 = style2.top;
        int n6 = style2.right;
        n3 = style2.bottom;
        context.setBounds(n2, n4, n6, n3);
    }

    public void setNumber(int n) {
        String string2;
        if (n == 0) {
            return;
        }
        this.anInt = n;
        StringBuilder stringBuilder = new StringBuilder("");
        this.number = string2 = stringBuilder.append(n).toString();
        float f = this.getWidth();
        float f2 = 0.5f;
        f *= f2;
        TextPaint textPaint = this.textPaint;
        String string3 = this.number;
        float f3 = textPaint.measureText(string3) * f2;
        this.cx = f -= f3;
    }
}

