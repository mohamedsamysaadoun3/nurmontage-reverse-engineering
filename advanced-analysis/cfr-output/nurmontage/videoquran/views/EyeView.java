/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.util.AttributeSet
 *  android.view.View
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.request.FutureTarget
 *  com.bumptech.glide.request.target.Target
 *  com.bumptech.glide.signature.ObjectKey
 */
package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.views.EyeView$$ExternalSyntheticLambda0;

public class EyeView
extends View {
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

    public EyeView(Context context) {
        super(context);
        super(1);
        this.paint = context;
        super();
        this.eyeRect = context;
        this.eyeProgress = 0.0f;
    }

    public EyeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super(1);
        this.paint = context;
        super();
        this.eyeRect = context;
        this.eyeProgress = 0.0f;
    }

    public EyeView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        super(1);
        this.paint = context;
        super();
        this.eyeRect = context;
        this.eyeProgress = 0.0f;
    }

    private Path createEyePath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = 2.0f;
        float f6 = f - (f3 /= f5);
        path.moveTo(f6, f2);
        f4 /= f5;
        f5 = f2 - f4;
        path.quadTo(f, f5, f3 += f, f2);
        path.quadTo(f, f4 += f2, f6, f2);
        path.close();
        return path;
    }

    public static Bitmap get(Context context, int n, int n2, int n3) {
        RequestBuilder requestBuilder = Glide.with((Context)context).asBitmap();
        Integer n4 = n3;
        n4 = requestBuilder.load(n4);
        requestBuilder = DiskCacheStrategy.NONE;
        n4 = (RequestBuilder)n4.diskCacheStrategy((DiskCacheStrategy)requestBuilder);
        String string2 = AppUtils.getAppVersionName(context);
        requestBuilder = new ObjectKey((Object)string2);
        FutureTarget futureTarget = ((RequestBuilder)((RequestBuilder)((RequestBuilder)n4.signature((Key)requestBuilder)).override(n, n2)).centerInside()).submit();
        Bitmap bitmap = (Bitmap)futureTarget.get();
        n4 = Bitmap.Config.ARGB_8888;
        bitmap = bitmap.copy((Bitmap.Config)n4, true);
        Glide.with((Context)context).clear((Target)futureTarget);
        return bitmap;
    }

    /* synthetic */ void cfr_renamed_494(ValueAnimator valueAnimator) {
        float f;
        this.eyeProgress = f = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        PorterDuff.Mode mode;
        int n;
        int n2;
        EyeView eyeView = this;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        Bitmap bitmap = this.background;
        if (bitmap == null) {
            return;
        }
        Paint paint = new Paint(1);
        int n3 = this.getHeight();
        float f = n3;
        float f2 = 2.0f;
        f /= f2;
        int n4 = this.getWidth();
        float f3 = (float)n4 / f2;
        float f4 = this.eyeProgress;
        int n5 = this.getWidth();
        float f5 = n5;
        float f6 = 0.6f;
        f5 *= f6;
        int n6 = this.getHeight();
        float f7 = (float)n6 * f6 * f4;
        f4 = 0.0f;
        Rect rect = null;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Path path = this.createEyePath(f3, f, f5, f7);
        for (int i = 0; i <= (n2 = 60); ++i) {
            float f8;
            float f9;
            int n7 = this.getWidth() * i;
            float f10 = n7;
            float f11 = n2;
            f10 /= f11;
            f11 = f5 / f2;
            float f12 = f10 - f3;
            float f13 = Math.abs(f12);
            float f14 = f13 - f11;
            float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (f15 > 0) {
                f9 = f;
                f8 = f3;
                n2 = 0;
            } else {
                f13 = f7 / f2;
                f12 *= f12;
                f11 *= f11;
                f12 /= f11;
                f11 = 1.0f - f12;
                f13 *= f11;
                f11 = f - f13;
                f2 = f + f13;
                int n8 = bitmap.getWidth() * i / 60;
                int n9 = i + 1;
                n = bitmap.getWidth() * n9 / 60;
                int n10 = bitmap.getHeight();
                n2 = n10 / 2;
                f9 = f;
                f = 0.0f;
                rect = new Rect(n8, 0, n, n2);
                n8 = bitmap.getWidth() * i / 60;
                n3 = bitmap.getHeight() / 2;
                int n11 = bitmap.getWidth();
                f8 = f3;
                n4 = (n9 *= n11) / 60;
                n2 = bitmap.getHeight();
                eyeView = new Rect(n8, n3, n4, n2);
                n4 = this.getWidth();
                n8 = 60;
                f3 = (float)(n4 /= n8) + f10;
                n2 = 0;
                mode = new RectF(f10, 0.0f, f3, f11);
                float f16 = (float)(this.getWidth() / n8) + f10;
                int n12 = this.getHeight();
                f11 = n12;
                RectF rectF = new RectF(f10, f2, f16, f11);
                canvas2.drawBitmap(bitmap, rect, (RectF)mode, paint);
                canvas2.drawBitmap(bitmap, (Rect)eyeView, rectF, paint);
            }
            eyeView = this;
            rect = null;
            f4 = 0.0f;
            f3 = f8;
            f = f9;
            f2 = 2.0f;
        }
        f3 = this.getWidth();
        f4 = this.getHeight();
        bitmap = canvas;
        n = canvas.saveLayer(0.0f, 0.0f, f3, f4, null);
        mode = PorterDuff.Mode.CLEAR;
        bitmap = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)bitmap);
        canvas2.drawPath(path, paint);
        paint.setXfermode(null);
        canvas2.restoreToCount(n);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        Bitmap bitmap;
        super.onSizeChanged(n, n2, n3, n4);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.eye = bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        bitmap.eraseColor(-16711936);
    }

    public void openEye() {
        Object object = new float[]{0.0f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        object.setDuration(3000L);
        EyeView$$ExternalSyntheticLambda0 eyeView$$ExternalSyntheticLambda0 = new EyeView$$ExternalSyntheticLambda0(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)eyeView$$ExternalSyntheticLambda0);
        object.setRepeatCount(5);
        object.start();
    }

    public void setBackground(Bitmap bitmap) {
        this.background = bitmap;
        this.invalidate();
    }

    public void setEyeProgress(float f) {
        float f2;
        Bitmap bitmap = this.background;
        if (bitmap == null) {
            return;
        }
        this.eyeProgress = f;
        this.eyeWidth = f2 = (float)bitmap.getWidth() * 0.8f;
        this.eyeHeight = f2 = (float)this.background.getHeight() * 0.6f * f;
        this.invalidate();
    }
}

