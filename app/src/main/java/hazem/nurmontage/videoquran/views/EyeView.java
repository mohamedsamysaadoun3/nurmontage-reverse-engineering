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
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.common.C0366C;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class EyeView extends View {
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
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }

    public EyeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }

    public EyeView(Context context, AttributeSet attributeSet, int index) {
        super(context, attributeSet, index);
        this.paint = new Paint(1);
        this.eyeRect = new RectF();
        this.eyeProgress = 0.0f;
    }

    private Path createEyePath(float floatValue, float value, float value3, float floatValue4) {
        Path path = new Path();
        float f5 = value3 / 2.0f;
        float f6 = floatValue - f5;
        path.moveTo(f6, value);
        float f7 = floatValue4 / 2.0f;
        path.quadTo(floatValue, value - f7, f5 + floatValue, value);
        path.quadTo(floatValue, f7 + value, f6, value);
        path.close();
        return path;
    }

    @Override // android.view.View
    protected void onSizeChanged(int size, int i2, int size4, int size4) {
        super.onSizeChanged(size, i2, size4, size4);
        Bitmap createBitmap = Bitmap.createBitmap(size, i2, Bitmap.Config.ARGB_8888);
        this.eye = createBitmap;
        createBitmap.eraseColor(-16711936);
    }

    public void setBackground(Bitmap bitmap) {
        this.background = bitmap;
        invalidate();
    }

    public void setEyeProgress(float floatValue) {
        if (this.background == null) {
            return;
        }
        this.eyeProgress = floatValue;
        this.eyeWidth = r0.getWidth() * 0.8f;
        this.eyeHeight = this.background.getHeight() * 0.6f * floatValue;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float floatValue;
        float progressValue;
        boolean isPremium;
        super.onDraw(canvas);
        Bitmap bitmap = this.background;
        if (bitmap == null) {
            return;
        }
        Paint paint = new Paint(1);
        float progressValue8 = 2.0f;
        float height = getHeight() / 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = getWidth() * 0.6f;
        float height2 = getHeight() * 0.6f * this.eyeProgress;
        boolean isPremium8 = false;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Path createEyePath = createEyePath(width, height, width2, height2);
        int width10 = 0;
        while (width10 <= 60) {
            float width3 = (getWidth() * width10) / 60;
            float floatValue4 = width2 / progressValue8;
            float progressValue10 = width3 - width;
            if (Math.abs(progressValue10) > floatValue4) {
                floatValue = height;
                progressValue = width;
                isPremium = isPremium8;
            } else {
                float progressValue10 = (height2 / progressValue8) * (1.0f - ((progressValue10 * progressValue10) / (floatValue4 * floatValue4)));
                float f7 = height + progressValue10;
                int i2 = width10 + 1;
                floatValue = height;
                Rect rect = new Rect((bitmap.getWidth() * width10) / 60, 0, (bitmap.getWidth() * i2) / 60, bitmap.getHeight() / 2);
                progressValue = width;
                Rect rect2 = new Rect((bitmap.getWidth() * width10) / 60, bitmap.getHeight() / 2, (i2 * bitmap.getWidth()) / 60, bitmap.getHeight());
                isPremium = false;
                RectF rectF = new RectF(width3, 0.0f, (getWidth() / 60) + width3, height - progressValue10);
                RectF rectF2 = new RectF(width3, f7, (getWidth() / 60) + width3, getHeight());
                canvas.drawBitmap(bitmap, rect, rectF, paint);
                canvas.drawBitmap(bitmap, rect2, rectF2, paint);
            }
            value++;
            isPremium8 = isPremium;
            width = progressValue;
            height = floatValue;
            progressValue8 = 2.0f;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(createEyePath, paint);
        paint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap get(Context context, int value, int i2, int value3) throws ExecutionException, InterruptedException {
        FutureTarget submit = Glide.with(context).asBitmap().load(Integer.valueOf(value3)).diskCacheStrategy(DiskCacheStrategy.NONE).signature(new ObjectKey(AppUtils.getAppVersionName(context))).override(value, i2).centerInside().submit();
        Bitmap copy = ((Bitmap) submit.get()).copy(Bitmap.Config.ARGB_8888, true);
        Glide.with(context).clear(submit);
        return copy;
    }

    public void openEye() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(C0366C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hazem.nurmontage.videoquran.views.EyeView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EyeView.this.m1607lambda$openEye$0$hazemnurmontagevideoquranviewsEyeView(valueAnimator);
            }
        });
        ofFloat.setRepeatCount(5);
        ofFloat.start();
    }

    /* renamed from: lambda$openEye$0$hazem-nurmontage-videoquran-views-EyeView, reason: not valid java name */
    /* synthetic */ void m1607lambda$openEye$0$hazemnurmontagevideoquranviewsEyeView(ValueAnimator valueAnimator) {
        this.eyeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }
}
