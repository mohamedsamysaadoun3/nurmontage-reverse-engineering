// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.common.Common;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import android.content.ContextWrapper;
import android.app.Activity;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.view.View;

public class BeforeAfterView extends View
{
    private Bitmap afterImage;
    private Bitmap beforeImage;
    private Paint circlePaint;
    private float circleRadius;
    private float dividerX;
    private ValueAnimator hintAnimator;
    private Paint imagePaint;
    private boolean isShowTxt;
    private boolean isStartAnim;
    private Paint linePaint;
    private Paint textPaint;
    private String txt;
    private float x_text;
    private float y_text;
    
    public BeforeAfterView(final Context context) {
        super(context);
        this.dividerX = -1.0f;
        this.init(context);
    }
    
    public BeforeAfterView(final Context context, final AttributeSet set) {
        super(context, set);
        this.dividerX = -1.0f;
        this.init(context);
    }
    
    private void drawArrows(final Canvas canvas, float n, float n2) {
        final float n3 = this.circleRadius / 3.0f;
        final Path path = new Path();
        final float circleRadius = this.circleRadius;
        final float n4 = 2.0f;
        path.moveTo(n - circleRadius / n4, n2);
        final float n5 = n2 - n3;
        path.lineTo(n - this.circleRadius / n4 + n3, n5);
        final float n6 = n2 + n3;
        path.lineTo(n - this.circleRadius / n4 + n3, n6);
        path.close();
        final Path path2 = new Path();
        path2.moveTo(this.circleRadius / n4 + n, n2);
        n2 = this.circleRadius / n4 + n - n3;
        path2.lineTo(n2, n5);
        n2 = this.circleRadius / n4;
        n = n + n2 - n3;
        path2.lineTo(n, n6);
        path2.close();
        final Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint$Style.FILL);
        canvas.drawPath(path, paint);
        canvas.drawPath(path2, paint);
    }
    
    public static Bitmap get(final Context context, final int n, final int n2, final int i) {
        final FutureTarget submit = ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)Glide.with(context).asBitmap().load(Integer.valueOf(i)).diskCacheStrategy(DiskCacheStrategy.NONE)).signature((Key)new ObjectKey((Object)AppUtils.getAppVersionName(context)))).override(n, n2)).centerInside()).submit();
        final Bitmap copy = ((Bitmap)submit.get()).copy(Bitmap$Config.ARGB_8888, true);
        Glide.with(context).clear((Target)submit);
        return copy;
    }
    
    public static Activity getActivity(final Context context) {
        if (context instanceof ContextWrapper && context instanceof Activity) {
            return (Activity)context;
        }
        return null;
    }
    
    private void init(final Context context) {
        final int n = 1;
        final Paint linePaint = new Paint(n);
        this.linePaint = linePaint;
        final int n2 = -65536;
        linePaint.setColor(n2);
        (this.circlePaint = new Paint(n)).setColor(n2);
        this.circlePaint.setStyle(Paint$Style.FILL);
        this.imagePaint = new Paint(n);
        ScreenUtils.getScreenWidth(getActivity(context));
        new Thread(new BeforeAfterView$1(this, context)).start();
    }
    
    private void initHintAnimation(final int n) {
        final ValueAnimator hintAnimator = this.hintAnimator;
        if (hintAnimator == null || !hintAnimator.isRunning()) {
            final float dividerX = this.dividerX;
            final float n2 = n * 0.065f + dividerX;
            final int repeatMode = 2;
            final float[] array = new float[repeatMode];
            array[0] = dividerX;
            array[1] = n2;
            (this.hintAnimator = ValueAnimator.ofFloat(array)).setDuration(700L);
            this.hintAnimator.setRepeatMode(repeatMode);
            this.hintAnimator.setRepeatCount(-1);
            this.hintAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new BeforeAfterView$2(this));
        }
    }
    
    public void addTextPaint(final Bitmap bitmap, final Bitmap bitmap2, final Context context) {
        final Paint paint = new Paint(1);
        final float n = (float)bitmap.getWidth();
        final float n2 = 0.025f;
        paint.setTextSize(n * n2);
        paint.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/arabic/" + Common.english_app_font));
        final Canvas canvas = new Canvas();
        final float n3 = bitmap.getWidth() * 0.04f;
        final float n4 = bitmap.getHeight() * n2;
        final boolean equals = LocaleHelper.getLanguage(context).equals("ar");
        final int n5 = -15605;
        final int n6 = -7829368;
        if (equals) {
            paint.setColor(n6);
            canvas.setBitmap(bitmap);
            canvas.drawText("\u0642\u0628\u0644", n3, n4, paint);
            canvas.setBitmap(bitmap2);
            final String s = "\u0628\u0639\u062f";
            final float n7 = bitmap.getWidth() - paint.measureText(s) - n3;
            paint.setColor(n5);
            canvas.drawText(s, n7, n4, paint);
            return;
        }
        paint.setColor(n6);
        canvas.setBitmap(bitmap);
        canvas.drawText("BEFORE", n3, n4, paint);
        canvas.setBitmap(bitmap2);
        final String s2 = "AFTER";
        final float measureText = paint.measureText(s2);
        paint.setColor(n5);
        canvas.drawText(s2, bitmap.getWidth() - measureText - n3, n4, paint);
    }
    
    public float calculateTextSize(final String s, final int n, final Paint paint) {
        float n2 = 400.0f;
        paint.setTextSize(n2);
        final Rect rect = new Rect();
        while (rect.width() > n || rect.height() > n) {
            --n2;
            paint.setTextSize(n2);
            paint.getTextBounds(s, 0, s.length(), rect);
        }
        final float n3 = (float)n;
        final float n4 = 2.0f;
        final float n5 = n3 / n4;
        this.x_text = n5 - rect.width() / n4;
        this.y_text = n5 + rect.height() / n4;
        return n2;
    }
    
    public boolean isShowTxt() {
        return this.isShowTxt;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        final boolean isShowTxt = this.isShowTxt;
        final float n = 2.0f;
        if (isShowTxt) {
            canvas.drawColor(-1);
            canvas.save();
            canvas.clipRect(this.dividerX, 0.0f, (float)this.getWidth(), (float)this.getHeight());
            canvas.drawText(this.txt, this.x_text, this.y_text, this.imagePaint);
            canvas.restore();
            final float dividerX = this.dividerX;
            canvas.drawLine(dividerX, 0.0f, dividerX, (float)this.getHeight(), this.linePaint);
            canvas.drawCircle(this.dividerX, this.getHeight() / n, this.circleRadius, this.circlePaint);
            this.drawArrows(canvas, this.dividerX, this.getHeight() / n);
        }
        else {
            final Bitmap beforeImage = this.beforeImage;
            if (beforeImage != null && this.afterImage != null) {
                canvas.drawBitmap(beforeImage, 0.0f, 0.0f, this.imagePaint);
                canvas.save();
                canvas.clipRect(this.dividerX, 0.0f, (float)this.getWidth(), (float)this.getHeight());
                canvas.drawBitmap(this.afterImage, 0.0f, 0.0f, this.imagePaint);
                canvas.restore();
                final float dividerX2 = this.dividerX;
                canvas.drawLine(dividerX2, 0.0f, dividerX2, (float)this.getHeight(), this.linePaint);
                canvas.drawCircle(this.dividerX, this.getHeight() / n, this.circleRadius, this.circlePaint);
                this.drawArrows(canvas, this.dividerX, this.getHeight() / n);
            }
        }
        if (this.isStartAnim) {
            return;
        }
        final ValueAnimator hintAnimator = this.hintAnimator;
        if (hintAnimator != null) {
            hintAnimator.start();
        }
        this.isStartAnim = true;
    }
    
    protected void onMeasure(int size, final int n) {
        super.onMeasure(size, n);
        size = View$MeasureSpec.getSize(size);
        this.setMeasuredDimension(size, size);
        final float n2 = (float)size;
        this.dividerX = n2 / 2.0f;
        final float circleRadius = n2 * 0.05f;
        this.circleRadius = circleRadius;
        this.linePaint.setStrokeWidth(circleRadius * 0.1f);
        this.initHintAnimation(size);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.isStartAnim && motionEvent.getAction() == 0) {
            final ValueAnimator hintAnimator = this.hintAnimator;
            if (hintAnimator != null) {
                hintAnimator.cancel();
            }
        }
        final int action = motionEvent.getAction();
        final int n = 2;
        final boolean b = true;
        if (action != n) {
            return b;
        }
        this.dividerX = motionEvent.getX();
        this.invalidate();
        return b;
    }
    
    public void release() {
        final Bitmap afterImage = this.afterImage;
        if (afterImage != null && !afterImage.isRecycled()) {
            this.afterImage.recycle();
        }
        final Bitmap beforeImage = this.beforeImage;
        if (beforeImage != null) {
            if (!beforeImage.isRecycled()) {
                this.beforeImage.recycle();
            }
        }
    }
    
    public void setBeforeImage(final Bitmap beforeImage) {
        final Bitmap beforeImage2 = this.beforeImage;
        if (beforeImage2 != null && !beforeImage2.isRecycled()) {
            this.beforeImage.recycle();
        }
        this.beforeImage = beforeImage;
    }
    
    public void setTxt(final String txt) {
        this.txt = txt;
    }
    
    public void showText(final int n) {
        this.isShowTxt = true;
        (this.textPaint = new Paint()).setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/arabic/\u0641\u0631\u0634\u0629.ttf"));
        final Paint textPaint = this.textPaint;
        textPaint.setTextSize(this.calculateTextSize(this.txt, n, textPaint));
    }
}
