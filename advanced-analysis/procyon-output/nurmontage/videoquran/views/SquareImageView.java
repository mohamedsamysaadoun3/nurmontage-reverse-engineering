// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import android.graphics.Rect;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.common.Common;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView extends AppCompatImageView
{
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
    
    public SquareImageView(final Context context) {
        super(context);
        final int n = 1;
        this.paint = new Paint(n);
        this.paintRect = new Paint(n);
        this.textPaint = new TextPaint(n);
        this.init();
    }
    
    public SquareImageView(final Context context, final AttributeSet set) {
        super(context, set);
        final int n = 1;
        this.paint = new Paint(n);
        this.paintRect = new Paint(n);
        this.textPaint = new TextPaint(n);
        this.init();
    }
    
    public SquareImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final int n2 = 1;
        this.paint = new Paint(n2);
        this.paintRect = new Paint(n2);
        this.textPaint = new TextPaint(n2);
        this.init();
    }
    
    private void init() {
        this.textPaint.setColor(-1);
        this.textPaint.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/" + Common.english_app_font));
    }
    
    public int getAnInt() {
        return this.anInt;
    }
    
    public boolean isMSelect() {
        return this.isSelect;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.paint != null) {
            if (this.isSelect) {
                canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.paintRect);
                final Drawable drawableDone = this.drawableDone;
                if (drawableDone != null) {
                    drawableDone.draw(canvas);
                }
                final String number = this.number;
                if (number != null) {
                    canvas.drawText(number, this.cx, this.cy, (Paint)this.textPaint);
                }
            }
        }
    }
    
    protected void onMeasure(int measuredWidth, final int n) {
        super.onMeasure(measuredWidth, n);
        measuredWidth = this.getMeasuredWidth();
        this.setMeasuredDimension(measuredWidth, measuredWidth);
    }
    
    public void onSelect(final boolean isSelect) {
        if (!(this.isSelect = isSelect)) {
            this.paint.setColor(-8355712);
            this.paint.setStyle(Paint$Style.STROKE);
        }
        else {
            this.paint.setColor(-12190534);
            this.paint.setStyle(Paint$Style.FILL);
        }
        this.invalidate();
    }
    
    protected void onSizeChanged(int n, int n2, int bottom, int top) {
        super.onSizeChanged(n, n2, bottom, top);
        this.paintRect.setColor(-1056964608);
        final float n3 = (float)n;
        final Paint paint = this.paint;
        bottom = 1017370378;
        paint.setStrokeWidth(0.02f * n3);
        n2 = (this.isSelect ? 1 : 0);
        if (n2 == 0) {
            final Paint paint2 = this.paint;
            bottom = -8355712;
            paint2.setColor(bottom);
            this.paint.setStyle(Paint$Style.STROKE);
        }
        else {
            final Paint paint3 = this.paint;
            bottom = -12190534;
            paint3.setColor(bottom);
            this.paint.setStyle(Paint$Style.FILL);
        }
        this.textPaint.setTextSize(0.25f * n3);
        n2 = 1036831949;
        final float r = 0.1f * n3;
        this.r = r;
        this.x = n3 - 1.2f * r;
        this.y = r + this.paint.getStrokeWidth();
        final String number = this.number;
        bottom = 1056964608;
        final float n4 = 0.5f;
        if (number != null) {
            n2 = this.getWidth();
            this.cx = n2 * n4 - this.textPaint.measureText(this.number) * n4;
        }
        this.cy = this.getHeight() * n4;
        n = (int)(n3 * 0.3f);
        n2 = (int)(this.getWidth() * n4);
        top = n2 - n;
        final float cy = this.cy;
        final float n5 = (float)n;
        final int n6 = (int)(cy - n5);
        n2 += n;
        n = (int)(cy + n5);
        final Rect rect = new Rect(top, n6, n2, n);
        final Context context = this.getContext();
        n2 = R$drawable.check_24px;
        final Drawable drawable = ContextCompat.getDrawable(context, n2);
        this.drawableDone = drawable;
        n2 = rect.left;
        top = rect.top;
        final int right = rect.right;
        bottom = rect.bottom;
        drawable.setBounds(n2, top, right, bottom);
    }
    
    public void setNumber(final int n) {
        if (n == 0) {
            return;
        }
        this.anInt = n;
        this.number = "" + n;
        final float n2 = (float)this.getWidth();
        final float n3 = 0.5f;
        this.cx = n2 * n3 - this.textPaint.measureText(this.number) * n3;
    }
}
