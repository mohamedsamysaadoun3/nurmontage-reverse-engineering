// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.util.AttributeSet;
import android.graphics.Color;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class GradientProgressBar extends View
{
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
    
    public GradientProgressBar(final Context context) {
        super(context);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        this.gradientColors = new int[] { Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853") };
        this.cornerRadius = 100.0f;
        this.init();
    }
    
    public GradientProgressBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        this.gradientColors = new int[] { Color.parseColor("#a8ce46"), Color.parseColor("#D2DE49"), Color.parseColor("#F4D853") };
        this.cornerRadius = 100.0f;
        this.init();
    }
    
    public GradientProgressBar(final Context context, final AttributeSet set, int color) {
        super(context, set, color);
        this.progress = 0;
        this.maxProgress = 100;
        this.trackColor = -1;
        final int color2 = Color.parseColor("#a8ce46");
        final int color3 = Color.parseColor("#D2DE49");
        color = Color.parseColor("#F4D853");
        this.gradientColors = new int[] { color2, color3, color };
        this.cornerRadius = 100.0f;
        this.init();
    }
    
    private void createProgressShader() {
        if (this.getWidth() > 0 && this.getHeight() > 0) {
            final LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float)this.getWidth(), 0.0f, this.gradientColors, (float[])null, Shader$TileMode.CLAMP);
            this.progressShader = linearGradient;
            this.progressPaint.setShader((Shader)linearGradient);
        }
    }
    
    private void init() {
        (this.trackPaint = new Paint()).setColor(this.trackColor);
        final Paint trackPaint = this.trackPaint;
        final boolean b = true;
        trackPaint.setAntiAlias(b);
        this.trackPaint.setStyle(Paint$Style.FILL);
        (this.progressPaint = new Paint()).setAntiAlias(b);
        this.progressPaint.setStyle(Paint$Style.FILL);
        this.trackRect = new RectF();
        this.progressRect = new RectF();
    }
    
    public int getMax() {
        return this.maxProgress;
    }
    
    public int getProgress() {
        return this.progress;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float n = (float)this.getWidth();
        final float n2 = (float)this.getHeight();
        this.trackRect.set(0.0f, 0.0f, n, n2);
        final RectF trackRect = this.trackRect;
        final float cornerRadius = this.cornerRadius;
        canvas.drawRoundRect(trackRect, cornerRadius, cornerRadius, this.trackPaint);
        this.progressRect.set(0.0f, 0.0f, n * (this.progress / (float)this.maxProgress), n2);
        final RectF progressRect = this.progressRect;
        final float cornerRadius2 = this.cornerRadius;
        canvas.drawRoundRect(progressRect, cornerRadius2, cornerRadius2, this.progressPaint);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.createProgressShader();
    }
    
    public void setCornerRadius(final float cornerRadius) {
        this.cornerRadius = cornerRadius;
        this.invalidate();
    }
    
    public void setGradientColors(final int[] gradientColors) {
        if (gradientColors != null && gradientColors.length > 0) {
            this.gradientColors = gradientColors;
            this.createProgressShader();
            this.invalidate();
        }
    }
    
    public void setMax(final int maxProgress) {
        this.maxProgress = maxProgress;
        this.invalidate();
    }
    
    public void setProgress(int progress) {
        if (progress < 0) {
            progress = 0;
            this.progress = 0;
        }
        else {
            final int maxProgress = this.maxProgress;
            if (progress > maxProgress) {
                this.progress = maxProgress;
            }
            else {
                this.progress = progress;
            }
        }
        this.invalidate();
    }
    
    public void setTrackColor(final int n) {
        this.trackColor = n;
        this.trackPaint.setColor(n);
        this.invalidate();
    }
}
