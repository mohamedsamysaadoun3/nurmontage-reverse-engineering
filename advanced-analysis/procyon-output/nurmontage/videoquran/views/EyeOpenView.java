// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.animation.ValueAnimator;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.view.View;

public class EyeOpenView extends View
{
    private Bitmap bitmap;
    private float centerX;
    private float centerY;
    private Paint clearPaint;
    private float currentRY;
    private Path eyePath;
    private RectF eyeRect;
    private Paint paint;
    private float radiusX;
    private float radiusYFull;
    private float wrapOffset;
    
    public EyeOpenView(final Context context) {
        super(context);
        final int n = 1;
        this.paint = new Paint(n);
        this.clearPaint = new Paint(n);
        this.eyePath = new Path();
        this.eyeRect = new RectF();
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        this.init();
    }
    
    public EyeOpenView(final Context context, final AttributeSet set) {
        super(context, set);
        final int n = 1;
        this.paint = new Paint(n);
        this.clearPaint = new Paint(n);
        this.eyePath = new Path();
        this.eyeRect = new RectF();
        this.currentRY = 0.0f;
        this.wrapOffset = 50.0f;
        this.init();
    }
    
    private void init() {
        this.clearPaint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
    }
    
    private float map(float n, final float n2, float n3, final float n4, float n5) {
        n -= n2;
        n3 -= n2;
        n /= n3;
        n5 -= n4;
        n *= n5;
        return n4 + n;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
        this.eyePath.reset();
        final RectF eyeRect = this.eyeRect;
        final float centerX = this.centerX;
        final float radiusX = this.radiusX;
        final float n = centerX - radiusX;
        final float centerY = this.centerY;
        final float currentRY = this.currentRY;
        eyeRect.set(n, centerY - currentRY, centerX + radiusX, centerY + currentRY);
        this.eyePath.addOval(this.eyeRect, Path$Direction.CW);
        canvas.saveLayer((RectF)null, (Paint)null, 31);
        canvas.drawPath(this.eyePath, this.clearPaint);
        canvas.restore();
        final float map = this.map(this.currentRY, 0.0f, this.radiusYFull, 1.0f, 0.0f);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, (float)this.getWidth(), this.centerY - this.currentRY);
        final float centerX2 = this.centerX;
        final float n2 = this.centerY - this.currentRY;
        final float n3 = 1.0f;
        canvas.scale(n3, map, centerX2, n2);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
        final float map2 = this.map(this.currentRY, 0.0f, this.radiusYFull, 1.0f, 0.0f);
        canvas.save();
        canvas.clipRect(0.0f, this.centerY + this.currentRY, (float)this.getWidth(), (float)this.getHeight());
        canvas.scale(n3, map2, this.centerX, this.centerY + this.currentRY);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        final float n5 = (float)n;
        final float n6 = 2.0f;
        this.centerX = n5 / n6;
        final float n7 = (float)n2;
        this.centerY = n7 / n6;
        this.radiusX = n5 * 0.4f;
        this.radiusYFull = n7 * 0.2f;
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    public void setBitmap(final Bitmap bitmap) {
        this.bitmap = bitmap;
        this.invalidate();
    }
    
    public void startEyeOpenAnimation(final long duration) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, this.radiusYFull });
        ofFloat.setDuration(duration);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new EyeOpenView$$ExternalSyntheticLambda0(this));
        ofFloat.setRepeatCount(5);
        ofFloat.start();
    }
}
