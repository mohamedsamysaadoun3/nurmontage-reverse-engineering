package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SquareOutlineProgressBar extends View {
    private float cornerRadius;
    private int[] gradientColors;
    private int maxProgress;
    private final Path partialPath;
    private final Path path;
    private final PathMeasure pathMeasure;
    private int progress;
    private final Paint progressPaint;
    private LinearGradient progressShader;
    private final RectF rect;
    private String strHint;
    private float strokeWidth;
    private final TextPaint textPaint;
    private int trackColor;
    private final Paint trackPaint;

    /* renamed from: xH */
    private float f447xH;

    /* renamed from: xP */
    private float f448xP;
    private float y_hint;
    private float y_progrees;

    public int getMax() {
        return this.maxProgress;
    }

    public SquareOutlineProgressBar(Context context) {
        super(context);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(1);
        this.trackColor = 587202559;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        init();
    }

    public SquareOutlineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(1);
        this.trackColor = 587202559;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        init();
    }

    public SquareOutlineProgressBar(Context context, AttributeSet attributeSet, int trackIndex) {
        super(context, attributeSet, trackIndex);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(1);
        this.trackColor = 587202559;
        this.gradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853")};
        init();
    }

    private void init() {
        this.trackPaint.setStyle(Paint.Style.STROKE);
        this.trackPaint.setStrokeCap(Paint.Cap.ROUND);
        this.trackPaint.setStrokeJoin(Paint.Join.ROUND);
        this.trackPaint.setColor(this.trackColor);
        this.progressPaint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setStrokeJoin(Paint.Join.ROUND);
        this.textPaint.setColor(-1);
        Typeface createFromAsset = Typeface.createFromAsset(getResources().getAssets(), "fonts/ReadexPro_Medium.ttf");
        if (LocaleHelper.getLanguage(getContext()).equals("ar")) {
            this.strHint = "يرجى عدم قفل الشاشة أو التبديل إلى تطبيقات أخرى.";
        } else {
            this.strHint = "Please don't lock the screen or switch to other apps.";
        }
        this.textPaint.setTypeface(createFromAsset);
    }

    @Override // android.view.View
    protected void onMeasure(int size5, int size5) {
        int size = View.MeasureSpec.getSize(size5);
        setMeasuredDimension((int) (size / 1.618034f), size);
    }

    @Override // android.view.View
    protected void onSizeChanged(int index, int index6, int i3, int size4) {
        super.onSizeChanged(index, index6, i3, size4);
        updateShader(index, index6);
        float floatValue = index;
        this.textPaint.setTextSize(0.033f * floatValue);
        Rect rect = new Rect();
        this.cornerRadius = 0.04f * floatValue;
        float progressValue = floatValue * 0.0085f;
        this.strokeWidth = progressValue;
        this.trackPaint.setStrokeWidth(progressValue);
        this.progressPaint.setStrokeWidth(this.strokeWidth);
        TextPaint textPaint = this.textPaint;
        String str = this.strHint;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        float f3 = this.strokeWidth / 2.0f;
        this.rect.set(f3, f3, getWidth() - f3, getHeight() - f3);
        this.y_progrees = this.rect.centerY() - rect.height();
        this.y_hint = this.rect.centerY() + rect.height();
        this.f447xH = this.rect.centerX() - (rect.width() * 0.5f);
        this.textPaint.getTextBounds("100", 0, 3, rect);
        this.f448xP = this.rect.centerX() - (rect.width() * 0.5f);
    }

    private void updateShader(int colorValue, int colorValue7) {
        if (colorValue == 0 || colorValue7 == 0) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, colorValue, colorValue7, this.gradientColors, (float[]) null, Shader.TileMode.CLAMP);
        this.progressShader = linearGradient;
        this.progressPaint.setShader(linearGradient);
    }

    public void setProgress(int resourceId) {
        int max = Math.max(0, Math.min(resourceId, this.maxProgress));
        if (this.progress != max) {
            this.progress = max;
            invalidate();
        }
    }

    public int getProgress() {
        return this.progress;
    }

    public void setMaxProgress(int resourceId) {
        this.maxProgress = Math.max(1, value);
        invalidate();
    }

    public void setCornerRadius(float floatValue) {
        this.cornerRadius = floatValue;
        invalidate();
    }

    public void setStrokeWidth(float floatValue) {
        this.strokeWidth = floatValue;
        this.trackPaint.setStrokeWidth(floatValue);
        this.progressPaint.setStrokeWidth(floatValue);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float floatValue = this.rect.left;
        float progressValue = this.rect.top;
        float progressValue15 = this.rect.right;
        float progressValue15 = this.rect.bottom;
        float progressValue15 = this.cornerRadius;
        canvas.drawRoundRect(this.rect, progressValue15, progressValue15, this.trackPaint);
        canvas.drawText(String.format(Locale.US, "%% %d", Integer.valueOf(this.progress)), this.f448xP, this.y_progrees, this.textPaint);
        canvas.drawText(this.strHint, this.f447xH, this.y_hint, this.textPaint);
        this.path.reset();
        this.partialPath.reset();
        float f6 = floatValue + progressValue15;
        this.path.moveTo(f6, progressValue);
        this.path.lineTo(progressValue15 - progressValue15, progressValue);
        float f7 = 2.0f * progressValue15;
        float f8 = progressValue15 - f7;
        float f9 = progressValue + f7;
        this.path.arcTo(new RectF(f8, progressValue, progressValue15, f9), -90.0f, 90.0f, false);
        this.path.lineTo(progressValue15, progressValue15 - progressValue15);
        float f10 = progressValue15 - f7;
        this.path.arcTo(new RectF(f8, f10, progressValue15, progressValue15), 0.0f, 90.0f, false);
        this.path.lineTo(f6, progressValue15);
        float f11 = f7 + floatValue;
        this.path.arcTo(new RectF(floatValue, f10, f11, progressValue15), 90.0f, 90.0f, false);
        this.path.lineTo(floatValue, progressValue15 + progressValue);
        this.path.arcTo(new RectF(floatValue, progressValue, f11, f9), 180.0f, 90.0f, false);
        this.path.close();
        this.pathMeasure.setPath(this.path, false);
        this.pathMeasure.getSegment(0.0f, this.pathMeasure.getLength() * (this.progress / this.maxProgress), this.partialPath, true);
        canvas.drawPath(this.partialPath, this.progressPaint);
    }
}
