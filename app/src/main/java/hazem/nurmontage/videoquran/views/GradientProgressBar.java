package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class GradientProgressBar extends View {
    private float cornerRadius;
    private int[] gradientColors;
    private int maxProgress;
    private int progress;
    private Paint progressPaint;
    private RectF progressRect;
    private LinearGradient progressShader;
    private int trackColor;
    private Paint trackPaint;
    private RectF trackRect;

    public GradientProgressBar(Context context) {
        super(context);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        this.cornerRadius = 100.0f;
        init();
    }

    public GradientProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        this.cornerRadius = 100.0f;
        init();
    }

    public GradientProgressBar(Context context, AttributeSet attributeSet, int value) {
        super(context, attributeSet, value);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        this.cornerRadius = 100.0f;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.trackPaint = paint;
        paint.setColor(this.trackColor);
        this.trackPaint.setAntiAlias(true);
        this.trackPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.progressPaint = paint2;
        paint2.setAntiAlias(true);
        this.progressPaint.setStyle(Paint.Style.FILL);
        this.trackRect = new RectF();
        this.progressRect = new RectF();
    }

    @Override // android.view.View
    protected void onSizeChanged(int value, int i2, int i3, int size4) {
        super.onSizeChanged(value, i2, i3, size4);
        createProgressShader();
    }

    private void createProgressShader() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.gradientColors, (float[]) null, Shader.TileMode.CLAMP);
        this.progressShader = linearGradient;
        this.progressPaint.setShader(linearGradient);
    }

    public void setProgress(int value) {
        if (value < 0) {
            this.progress = 0;
        } else {
            int i2 = this.maxProgress;
            if (value > i2) {
                this.progress = i2;
            } else {
                this.progress = value;
            }
        }
        invalidate();
    }

    public int getProgress() {
        return this.progress;
    }

    public void setMax(int value) {
        this.maxProgress = value;
        invalidate();
    }

    public void setTrackColor(int value) {
        this.trackColor = value;
        this.trackPaint.setColor(value);
        invalidate();
    }

    public void setGradientColors(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        this.gradientColors = iArr;
        createProgressShader();
        invalidate();
    }

    public void setCornerRadius(float floatValue) {
        this.cornerRadius = floatValue;
        invalidate();
    }

    public int getMax() {
        return this.maxProgress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        this.trackRect.set(0.0f, 0.0f, width, height);
        RectF rectF = this.trackRect;
        float floatValue = this.cornerRadius;
        canvas.drawRoundRect(rectF, floatValue, floatValue, this.trackPaint);
        this.progressRect.set(0.0f, 0.0f, width * (this.progress / this.maxProgress), height);
        RectF rectF2 = this.progressRect;
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(rectF2, f2, f2, this.progressPaint);
    }
}
