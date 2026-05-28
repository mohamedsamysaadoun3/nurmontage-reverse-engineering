package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.common.Common;

/* loaded from: classes2.dex */
public class SquareImageView extends AppCompatImageView {
    private int anInt;

    /* renamed from: cx */
    private float f442cx;

    /* renamed from: cy */
    private float f443cy;
    private Drawable drawableDone;
    private boolean isSelect;
    private String number;
    private Paint paint;
    private Paint paintRect;

    /* renamed from: r */
    private float f444r;
    private TextPaint textPaint;

    /* renamed from: x */
    private float f445x;

    /* renamed from: y */
    private float f446y;

    public int getAnInt() {
        return this.anInt;
    }

    public void setNumber(int width) {
        if (width == 0) {
            return;
        }
        this.anInt = width;
        this.number = "" + width;
        this.f442cx = (getWidth() * 0.5f) - (this.textPaint.measureText(this.number) * 0.5f);
    }

    public boolean isMSelect() {
        return this.isSelect;
    }

    public SquareImageView(Context context) {
        super(context);
        this.paint = new Paint(1);
        this.paintRect = new Paint(1);
        this.textPaint = new TextPaint(1);
        init();
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint(1);
        this.paintRect = new Paint(1);
        this.textPaint = new TextPaint(1);
        init();
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int index) {
        super(context, attributeSet, index);
        this.paint = new Paint(1);
        this.paintRect = new Paint(1);
        this.textPaint = new TextPaint(1);
        init();
    }

    private void init() {
        this.textPaint.setColor(-1);
        this.textPaint.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "fonts/" + Common.english_app_font));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int width, int width8) {
        super.onMeasure(width, width8);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width9, int width9, int i3, int size4) {
        super.onSizeChanged(width9, width9, i3, size4);
        this.paintRect.setColor(-1056964608);
        float f = width9;
        this.paint.setStrokeWidth(0.02f * f);
        if (!this.isSelect) {
            this.paint.setColor(-8355712);
            this.paint.setStyle(Paint.Style.STROKE);
        } else {
            this.paint.setColor(-12190534);
            this.paint.setStyle(Paint.Style.FILL);
        }
        this.textPaint.setTextSize(0.25f * f);
        float xPosition = 0.1f * f;
        this.f444r = xPosition;
        this.f445x = f - (1.2f * xPosition);
        this.f446y = xPosition + this.paint.getStrokeWidth();
        if (this.number != null) {
            this.f442cx = (getWidth() * 0.5f) - (this.textPaint.measureText(this.number) * 0.5f);
        }
        this.f443cy = getHeight() * 0.5f;
        int i5 = (int) (f * 0.3f);
        int width = (int) (getWidth() * 0.5f);
        float f3 = this.f443cy;
        float f4 = i5;
        Rect rect = new Rect(width - i5, (int) (f3 - f4), width + i5, (int) (f3 + f4));
        Drawable drawable = ContextCompat.getDrawable(getContext(), C2014R.drawable.check_24px);
        this.drawableDone = drawable;
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.paint == null || !this.isSelect) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paintRect);
        Drawable drawable = this.drawableDone;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        String extension = this.number;
        if (extension != null) {
            canvas.drawText(extension, this.f442cx, this.f443cy, this.textPaint);
        }
    }

    public void onSelect(boolean isSelected) {
        this.isSelect = isSelected;
        if (!isSelected) {
            this.paint.setColor(-8355712);
            this.paint.setStyle(Paint.Style.STROKE);
        } else {
            this.paint.setColor(-12190534);
            this.paint.setStyle(Paint.Style.FILL);
        }
        invalidate();
    }
}
