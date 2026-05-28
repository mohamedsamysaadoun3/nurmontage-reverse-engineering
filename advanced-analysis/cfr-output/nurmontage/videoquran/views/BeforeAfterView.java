/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
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
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.views.BeforeAfterView$1;
import hazem.nurmontage.videoquran.views.BeforeAfterView$2;

public class BeforeAfterView
extends View {
    private Bitmap afterImage;
    private Bitmap beforeImage;
    private Paint circlePaint;
    private float circleRadius;
    private float dividerX = -1.0f;
    private ValueAnimator hintAnimator;
    private Paint imagePaint;
    private boolean isShowTxt;
    private boolean isStartAnim;
    private Paint linePaint;
    private Paint textPaint;
    private String txt;
    private float x_text;
    private float y_text;

    static /* bridge */ /* synthetic */ Bitmap cfr_renamed_486(BeforeAfterView beforeAfterView) {
        return beforeAfterView.afterImage;
    }

    static /* bridge */ /* synthetic */ Bitmap cfr_renamed_487(BeforeAfterView beforeAfterView) {
        return beforeAfterView.beforeImage;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_488(BeforeAfterView beforeAfterView, float f) {
        beforeAfterView.dividerX = f;
    }

    public BeforeAfterView(Context context) {
        super(context);
        this.init(context);
    }

    public BeforeAfterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    private void drawArrows(Canvas canvas, float f, float f2) {
        float f3 = this.circleRadius / 3.0f;
        Path path = new Path();
        float f4 = this.circleRadius;
        float f5 = 2.0f;
        f4 /= f5;
        f4 = f - f4;
        path.moveTo(f4, f2);
        f4 = f2 - f3;
        float f6 = this.circleRadius / f5;
        f6 = f - f6 + f3;
        path.lineTo(f6, f4);
        f6 = f2 + f3;
        float f7 = this.circleRadius / f5;
        f7 = f - f7 + f3;
        path.lineTo(f7, f6);
        path.close();
        Path path2 = new Path();
        float f8 = this.circleRadius / f5 + f;
        path2.moveTo(f8, f2);
        f2 = this.circleRadius / f5 + f - f3;
        path2.lineTo(f2, f4);
        f2 = this.circleRadius / f5;
        f = f + f2 - f3;
        path2.lineTo(f, f6);
        path2.close();
        Paint paint = new Paint(1);
        paint.setColor(-1);
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        canvas.drawPath(path, paint);
        canvas.drawPath(path2, paint);
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

    public static Activity getActivity(Context context) {
        boolean bl = context instanceof ContextWrapper;
        if (bl && (bl = context instanceof Activity)) {
            return (Activity)context;
        }
        return null;
    }

    private void init(Context context) {
        int n = 1;
        Object object = new Paint(n);
        this.linePaint = object;
        int n2 = -65536;
        object.setColor(n2);
        object = new Paint(n);
        this.circlePaint = object;
        object.setColor(n2);
        object = this.circlePaint;
        Paint.Style style2 = Paint.Style.FILL;
        object.setStyle(style2);
        object = new Paint(n);
        this.imagePaint = object;
        ScreenUtils.getScreenWidth(BeforeAfterView.getActivity(context));
        BeforeAfterView$1 beforeAfterView$1 = new BeforeAfterView$1(this, context);
        object = new Thread(beforeAfterView$1);
        ((Thread)object).start();
    }

    private void initHintAnimation(int n) {
        int n2;
        Object object = this.hintAnimator;
        if (object == null || (n2 = object.isRunning()) == 0) {
            ValueAnimator valueAnimator;
            float f = this.dividerX;
            float f2 = (float)n * 0.065f + f;
            int n3 = 2;
            float[] fArray = new float[n3];
            fArray[0] = f;
            fArray[1] = f2;
            this.hintAnimator = valueAnimator = ValueAnimator.ofFloat((float[])fArray);
            long l = 700L;
            valueAnimator.setDuration(l);
            this.hintAnimator.setRepeatMode(n3);
            valueAnimator = this.hintAnimator;
            n2 = -1;
            f = 0.0f / 0.0f;
            valueAnimator.setRepeatCount(n2);
            valueAnimator = this.hintAnimator;
            object = new BeforeAfterView$2(this);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }
    }

    public void addTextPaint(Bitmap bitmap, Bitmap object, Context object2) {
        Paint paint = new Paint(1);
        int n = bitmap.getWidth();
        float f = n;
        float f2 = 0.025f;
        paint.setTextSize(f *= f2);
        AssetManager assetManager = this.getResources().getAssets();
        CharSequence charSequence = new StringBuilder("fonts/arabic/");
        String string2 = Common.english_app_font;
        charSequence = charSequence.append(string2).toString();
        assetManager = Typeface.createFromAsset((AssetManager)assetManager, (String)charSequence);
        paint.setTypeface((Typeface)assetManager);
        assetManager = new Canvas();
        int n2 = bitmap.getWidth();
        float f3 = (float)n2 * 0.04f;
        int n3 = bitmap.getHeight();
        float f4 = (float)n3 * f2;
        object2 = LocaleHelper.getLanguage((Context)object2);
        String string3 = "ar";
        boolean bl = ((String)object2).equals(string3);
        int n4 = -15605;
        f2 = 0.0f / 0.0f;
        int n5 = -7829368;
        if (bl) {
            paint.setColor(n5);
            assetManager.setBitmap(bitmap);
            assetManager.drawText("\u0642\u0628\u0644", f3, f4, paint);
            assetManager.setBitmap(object);
            object = "\u0628\u0639\u062f";
            float f5 = paint.measureText((String)object);
            float f6 = (float)bitmap.getWidth() - f5 - f3;
            paint.setColor(n4);
            assetManager.drawText((String)object, f6, f4, paint);
            return;
        }
        paint.setColor(n5);
        assetManager.setBitmap(bitmap);
        assetManager.drawText("BEFORE", f3, f4, paint);
        assetManager.setBitmap(object);
        object = "AFTER";
        float f7 = paint.measureText((String)object);
        paint.setColor(n4);
        float f8 = (float)bitmap.getWidth() - f7 - f3;
        assetManager.drawText((String)object, f8, f4, paint);
    }

    public float calculateTextSize(String string2, int n, Paint paint) {
        float f = 400.0f;
        paint.setTextSize(f);
        Rect rect = new Rect();
        while (true) {
            int n2;
            if ((n2 = rect.width()) <= n && (n2 = rect.height()) <= n) {
                float f2 = n;
                float f3 = 2.0f;
                float f4 = (float)rect.width() / f3;
                this.x_text = f4 = (f2 /= f3) - f4;
                f4 = (float)rect.height() / f3;
                this.y_text = f2 += f4;
                return f;
            }
            paint.setTextSize(f -= 1.0f);
            n2 = 0;
            int n3 = string2.length();
            paint.getTextBounds(string2, 0, n3, rect);
        }
    }

    public boolean isShowTxt() {
        return this.isShowTxt;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = -1.7014118E38f;
        canvas.drawColor(-16777216);
        int n = this.isShowTxt;
        float f2 = 2.0f;
        int n2 = 0;
        float f3 = 0.0f;
        if (n != 0) {
            canvas.drawColor(-1);
            canvas.save();
            f = this.dividerX;
            int n3 = this.getWidth();
            float f4 = n3;
            int n4 = this.getHeight();
            float f5 = n4;
            canvas.clipRect(f, 0.0f, f4, f5);
            String string2 = this.txt;
            f3 = this.x_text;
            f4 = this.y_text;
            Paint paint = this.imagePaint;
            canvas.drawText(string2, f3, f4, paint);
            canvas.restore();
            float f6 = this.dividerX;
            n = this.getHeight();
            float f7 = n;
            Paint paint2 = this.linePaint;
            float f8 = 0.0f;
            canvas.drawLine(f6, 0.0f, f6, f7, paint2);
            f = this.dividerX;
            f3 = (float)this.getHeight() / f2;
            f4 = this.circleRadius;
            paint = this.circlePaint;
            canvas.drawCircle(f, f3, f4, paint);
            f = this.dividerX;
            n2 = this.getHeight();
            f3 = (float)n2 / f2;
            this.drawArrows(canvas, f, f3);
        } else {
            Bitmap bitmap;
            Bitmap bitmap2 = this.beforeImage;
            if (bitmap2 != null && (bitmap = this.afterImage) != null) {
                bitmap = this.imagePaint;
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint)bitmap);
                canvas.save();
                f = this.dividerX;
                int n5 = this.getWidth();
                float f9 = n5;
                int n6 = this.getHeight();
                float f10 = n6;
                canvas.clipRect(f, 0.0f, f9, f10);
                bitmap2 = this.afterImage;
                bitmap = this.imagePaint;
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint)bitmap);
                canvas.restore();
                float f11 = this.dividerX;
                n = this.getHeight();
                float f12 = n;
                Paint paint = this.linePaint;
                Canvas canvas2 = canvas;
                canvas.drawLine(f11, 0.0f, f11, f12, paint);
                f = this.dividerX;
                f3 = (float)this.getHeight() / f2;
                f9 = this.circleRadius;
                canvas2 = this.circlePaint;
                canvas.drawCircle(f, f3, f9, (Paint)canvas2);
                f = this.dividerX;
                n2 = this.getHeight();
                f3 = (float)n2 / f2;
                this.drawArrows(canvas, f, f3);
            }
        }
        boolean bl = this.isStartAnim;
        if (bl) {
            return;
        }
        canvas = this.hintAnimator;
        if (canvas != null) {
            canvas.start();
        }
        this.isStartAnim = true;
    }

    protected void onMeasure(int n, int n2) {
        float f;
        super.onMeasure(n, n2);
        n = View.MeasureSpec.getSize((int)n);
        this.setMeasuredDimension(n, n);
        float f2 = n;
        this.dividerX = f = f2 / 2.0f;
        this.circleRadius = f2 *= 0.05f;
        Paint paint = this.linePaint;
        paint.setStrokeWidth(f2 *= 0.1f);
        this.initHintAnimation(n);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        ValueAnimator valueAnimator;
        int n = this.isStartAnim;
        if (n != 0 && (n = motionEvent.getAction()) == 0 && (valueAnimator = this.hintAnimator) != null) {
            valueAnimator.cancel();
        }
        n = motionEvent.getAction();
        int n2 = 2;
        boolean bl = true;
        if (n != n2) {
            return bl;
        }
        this.dividerX = f = motionEvent.getX();
        this.invalidate();
        return bl;
    }

    public void release() {
        boolean bl;
        Bitmap bitmap = this.afterImage;
        if (bitmap != null && !(bl = bitmap.isRecycled())) {
            bitmap = this.afterImage;
            bitmap.recycle();
        }
        if ((bitmap = this.beforeImage) != null && !(bl = bitmap.isRecycled())) {
            bitmap = this.beforeImage;
            bitmap.recycle();
        }
    }

    public void setBeforeImage(Bitmap bitmap) {
        boolean bl;
        Bitmap bitmap2 = this.beforeImage;
        if (bitmap2 != null && !(bl = bitmap2.isRecycled())) {
            bitmap2 = this.beforeImage;
            bitmap2.recycle();
        }
        this.beforeImage = bitmap;
    }

    public void setTxt(String string2) {
        this.txt = string2;
    }

    public void showText(int n) {
        Paint paint;
        this.isShowTxt = true;
        this.textPaint = paint = new Paint();
        Object object = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/arabic/\u0641\u0631\u0634\u0629.ttf");
        paint.setTypeface(object);
        paint = this.textPaint;
        object = this.txt;
        float f = this.calculateTextSize((String)object, n, paint);
        paint.setTextSize(f);
    }
}

