// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.animation.ValueAnimator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.view.View;

public class EyeView extends View
{
    private Bitmap background;
    private float centerX;
    private float centerY;
    private Bitmap eye;
    private float eyeCenterY;
    private float eyeHeight;
    private float eyeProgress;
    private RectF eyeRect;
    private float eyeWidth;
    private float lidBottomY;
    private float lidTopY;
    private Paint paint;
    
    public EyeView(final Context context) {
        super(context);
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }
    
    public EyeView(final Context context, final AttributeSet set) {
        super(context, set);
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }
    
    public EyeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }
    
    private Path createEyePath(final float n, final float n2, float n3, float n4) {
        final Path path = new Path();
        final float n5 = 2.0f;
        n3 /= n5;
        final float n6 = n - n3;
        n3 += n;
        path.moveTo(n6, n2);
        n4 /= n5;
        path.quadTo(n, n2 - n4, n3, n2);
        n4 += n2;
        path.quadTo(n, n4, n6, n2);
        path.close();
        return path;
    }
    
    public static Bitmap get(final Context context, final int n, final int n2, final int i) {
        final FutureTarget submit = ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)Glide.with(context).asBitmap().load(Integer.valueOf(i)).diskCacheStrategy(DiskCacheStrategy.NONE)).signature((Key)new ObjectKey((Object)AppUtils.getAppVersionName(context)))).override(n, n2)).centerInside()).submit();
        final Bitmap copy = ((Bitmap)submit.get()).copy(Bitmap$Config.ARGB_8888, true);
        Glide.with(context).clear((Target)submit);
        return copy;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Bitmap background = this.background;
        if (background == null) {
            return;
        }
        final Paint paint = new Paint(1);
        final float n = (float)this.getHeight();
        float n2 = 2.0f;
        float n3 = n / n2;
        float n4 = this.getWidth() / n2;
        final float eyeProgress = this.eyeProgress;
        final float n5 = (float)this.getWidth();
        final float n6 = 0.6f;
        final float n7 = n5 * n6;
        final float n8 = this.getHeight() * n6 * eyeProgress;
        canvas.drawBitmap(background, 0.0f, 0.0f, paint);
        final Path eyePath = this.createEyePath(n4, n3, n7, n8);
        int n9 = 0;
        while (true) {
            final int n10 = 60;
            if (n9 > n10) {
                break;
            }
            final float n11 = this.getWidth() * n9 / (float)n10;
            final float n12 = n7 / n2;
            final float a = n11 - n4;
            float n13;
            float n14;
            if (Math.abs(a) > n12) {
                n13 = n3;
                n14 = n4;
            }
            else {
                final float n15 = n8 / n2 * (1.0f - a * a / (n12 * n12));
                final float n16 = n3 - n15;
                final float n17 = n3 + n15;
                final int n18 = background.getWidth() * n9 / 60;
                final int n19 = n9 + 1;
                final int n20 = background.getWidth() * n19 / 60;
                final int n21 = background.getHeight() / 2;
                n13 = n3;
                final Rect rect = new Rect(n18, 0, n20, n21);
                final int n22 = background.getWidth() * n9 / 60;
                final int n23 = background.getHeight() / 2;
                final int n24 = n19 * background.getWidth();
                n14 = n4;
                final Rect rect2 = new Rect(n22, n23, n24 / 60, background.getHeight());
                final int width = this.getWidth();
                final int n25 = 60;
                final RectF rectF = new RectF(n11, 0.0f, width / n25 + n11, n16);
                final RectF rectF2 = new RectF(n11, n17, this.getWidth() / n25 + n11, (float)this.getHeight());
                canvas.drawBitmap(background, rect, rectF, paint);
                canvas.drawBitmap(background, rect2, rectF2, paint);
            }
            ++n9;
            n4 = n14;
            n3 = n13;
            n2 = 2.0f;
        }
        final int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), (Paint)null);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        canvas.drawPath(eyePath, paint);
        paint.setXfermode((Xfermode)null);
        canvas.restoreToCount(saveLayer);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        (this.eye = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888)).eraseColor(-16711936);
    }
    
    public void openEye() {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 0.0f;
        array2[1] = 1.0f;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setDuration(3000L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new EyeView$$ExternalSyntheticLambda0(this));
        ofFloat.setRepeatCount(5);
        ofFloat.start();
    }
    
    public void setBackground(final Bitmap background) {
        this.background = background;
        this.invalidate();
    }
    
    public void setEyeProgress(final float eyeProgress) {
        final Bitmap background = this.background;
        if (background == null) {
            return;
        }
        this.eyeProgress = eyeProgress;
        this.eyeWidth = background.getWidth() * 0.8f;
        this.eyeHeight = this.background.getHeight() * 0.6f * eyeProgress;
        this.invalidate();
    }
}
