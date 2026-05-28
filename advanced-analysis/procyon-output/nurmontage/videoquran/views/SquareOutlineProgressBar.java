// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Rect;
import android.view.View$MeasureSpec;
import java.util.Locale;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.graphics.Typeface;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.graphics.Color;
import android.content.Context;
import android.text.TextPaint;
import android.graphics.RectF;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.view.View;

public class SquareOutlineProgressBar extends View
{
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
    private float xH;
    private float xP;
    private float y_hint;
    private float y_progrees;
    
    public SquareOutlineProgressBar(final Context context) {
        super(context);
        final int n = 1;
        this.trackPaint = new Paint(n);
        this.progressPaint = new Paint(n);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(n);
        this.trackColor = 587202559;
        this.gradientColors = new int[] { Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853") };
        this.init();
    }
    
    public SquareOutlineProgressBar(final Context context, final AttributeSet set) {
        super(context, set);
        final int n = 1;
        this.trackPaint = new Paint(n);
        this.progressPaint = new Paint(n);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(n);
        this.trackColor = 587202559;
        this.gradientColors = new int[] { Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853") };
        this.init();
    }
    
    public SquareOutlineProgressBar(final Context context, final AttributeSet set, int color) {
        super(context, set, color);
        final int n = 1;
        this.trackPaint = new Paint(n);
        this.progressPaint = new Paint(n);
        this.rect = new RectF();
        this.path = new Path();
        this.partialPath = new Path();
        this.pathMeasure = new PathMeasure();
        this.progress = 0;
        this.maxProgress = 100;
        this.textPaint = new TextPaint(n);
        this.trackColor = 587202559;
        final int color2 = Color.parseColor("#a8ce46");
        final int color3 = Color.parseColor("#D2DE49");
        color = Color.parseColor("#F4D853");
        this.gradientColors = new int[] { color2, color3, color };
        this.init();
    }
    
    private void init() {
        this.trackPaint.setStyle(Paint$Style.STROKE);
        this.trackPaint.setStrokeCap(Paint$Cap.ROUND);
        this.trackPaint.setStrokeJoin(Paint$Join.ROUND);
        this.trackPaint.setColor(this.trackColor);
        this.progressPaint.setStyle(Paint$Style.STROKE);
        this.progressPaint.setStrokeCap(Paint$Cap.ROUND);
        this.progressPaint.setStrokeJoin(Paint$Join.ROUND);
        this.textPaint.setColor(-1);
        final Typeface fromAsset = Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf");
        if (LocaleHelper.getLanguage(this.getContext()).equals("ar")) {
            this.strHint = "\u064a\u0631\u062c\u0649 \u0639\u062f\u0645 \u0642\u0641\u0644 \u0627\u0644\u0634\u0627\u0634\u0629 \u0623\u0648 \u0627\u0644\u062a\u0628\u062f\u064a\u0644 \u0625\u0644\u0649 \u062a\u0637\u0628\u064a\u0642\u0627\u062a \u0623\u062e\u0631\u0649.";
        }
        else {
            this.strHint = "Please don't lock the screen or switch to other apps.";
        }
        this.textPaint.setTypeface(fromAsset);
    }
    
    private void updateShader(final int n, final int n2) {
        if (n != 0) {
            if (n2 != 0) {
                final LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float)n, (float)n2, this.gradientColors, (float[])null, Shader$TileMode.CLAMP);
                this.progressShader = linearGradient;
                this.progressPaint.setShader((Shader)linearGradient);
            }
        }
    }
    
    public int getMax() {
        return this.maxProgress;
    }
    
    public int getProgress() {
        return this.progress;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float left = this.rect.left;
        final float top = this.rect.top;
        final float right = this.rect.right;
        final float bottom = this.rect.bottom;
        final float cornerRadius = this.cornerRadius;
        canvas.drawRoundRect(this.rect, cornerRadius, cornerRadius, this.trackPaint);
        canvas.drawText(String.format(Locale.US, "%% %d", this.progress), this.xP, this.y_progrees, (Paint)this.textPaint);
        canvas.drawText(this.strHint, this.xH, this.y_hint, (Paint)this.textPaint);
        this.path.reset();
        this.partialPath.reset();
        final Path path = this.path;
        final float n = left + cornerRadius;
        path.moveTo(n, top);
        this.path.lineTo(right - cornerRadius, top);
        final Path path2 = this.path;
        final float n2 = 2.0f * cornerRadius;
        final float n3 = right - n2;
        final float n4 = top + n2;
        final RectF rectF = new RectF(n3, top, right, n4);
        final float n5 = 90.0f;
        path2.arcTo(rectF, -90.0f, n5, false);
        this.path.lineTo(right, bottom - cornerRadius);
        final Path path3 = this.path;
        final float n6 = bottom - n2;
        path3.arcTo(new RectF(n3, n6, right, bottom), 0.0f, n5, false);
        this.path.lineTo(n, bottom);
        final Path path4 = this.path;
        final float n7 = n2 + left;
        path4.arcTo(new RectF(left, n6, n7, bottom), n5, n5, false);
        this.path.lineTo(left, cornerRadius + top);
        this.path.arcTo(new RectF(left, top, n7, n4), 180.0f, n5, false);
        this.path.close();
        this.pathMeasure.setPath(this.path, false);
        this.pathMeasure.getSegment(0.0f, this.pathMeasure.getLength() * (this.progress / (float)this.maxProgress), this.partialPath, true);
        canvas.drawPath(this.partialPath, this.progressPaint);
    }
    
    protected void onMeasure(int size, int n) {
        size = View$MeasureSpec.getSize(size);
        n = (int)(size / 1.618034f);
        this.setMeasuredDimension(n, size);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, int length) {
        super.onSizeChanged(n, n2, n3, length);
        this.updateShader(n, n2);
        final TextPaint textPaint = this.textPaint;
        final float n4 = (float)n;
        textPaint.setTextSize(0.033f * n4);
        final Rect rect = new Rect();
        this.cornerRadius = 0.04f * n4;
        final float n5 = n4 * 0.0085f;
        this.strokeWidth = n5;
        this.trackPaint.setStrokeWidth(n5);
        this.progressPaint.setStrokeWidth(this.strokeWidth);
        final TextPaint textPaint2 = this.textPaint;
        final String strHint = this.strHint;
        length = strHint.length();
        textPaint2.getTextBounds(strHint, 0, length, rect);
        final float n6 = this.strokeWidth / 2.0f;
        this.rect.set(n6, n6, this.getWidth() - n6, this.getHeight() - n6);
        this.y_progrees = this.rect.centerY() - rect.height();
        this.y_hint = this.rect.centerY() + rect.height();
        final float centerX = this.rect.centerX();
        final float n7 = (float)rect.width();
        final float n8 = 0.5f;
        this.xH = centerX - n7 * n8;
        this.textPaint.getTextBounds("100", 0, 3, rect);
        this.xP = this.rect.centerX() - rect.width() * n8;
    }
    
    public void setCornerRadius(final float cornerRadius) {
        this.cornerRadius = cornerRadius;
        this.invalidate();
    }
    
    public void setMaxProgress(int max) {
        max = Math.max(1, max);
        this.maxProgress = max;
        this.invalidate();
    }
    
    public void setProgress(int progress) {
        progress = Math.min(progress, this.maxProgress);
        progress = Math.max(0, progress);
        if (this.progress != progress) {
            this.progress = progress;
            this.invalidate();
        }
    }
    
    public void setStrokeWidth(final float strokeWidth) {
        this.strokeWidth = strokeWidth;
        this.trackPaint.setStrokeWidth(strokeWidth);
        this.progressPaint.setStrokeWidth(strokeWidth);
        this.invalidate();
    }
}
