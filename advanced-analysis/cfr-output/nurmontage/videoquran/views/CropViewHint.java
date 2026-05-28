/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.util.AttributeSet
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

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
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
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.views.CropViewHint$1;

public class CropViewHint
extends View {
    private int arrowHeadSize;
    private Paint arrowPaint;
    private Bitmap bitmap;
    private Paint cropPaint;
    private RectF cropRect;
    private float endLineX;
    private float endLineX_arrow;
    private float endLineY;
    private float endLineY_arrow;
    private float endX;
    private float endY;
    private Paint imagePaint;
    private Bitmap ipadBitmap;
    private Paint linePaint;
    private Rect mTextRect;
    private String mTittle;
    private float radius;
    private Paint textPaint;
    private float x_text;
    private float y_bitmap;
    private float y_text;

    static /* bridge */ /* synthetic */ void cfr_renamed_489(CropViewHint cropViewHint, Bitmap bitmap) {
        cropViewHint.bitmap = bitmap;
    }

    public CropViewHint(Context context) {
        super(context);
        this.init(context);
    }

    public CropViewHint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    private void drawArrowHead(Canvas canvas, float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        double d = f2 - f4;
        double d2 = f5;
        double d3 = Math.atan2(d, d2);
        double d4 = f;
        double d5 = this.arrowHeadSize;
        double d6 = d3 - 0.5235987755982988;
        double d7 = Math.cos(d6);
        float f6 = (float)(d4 - (d5 *= d7));
        d7 = f2;
        double d8 = this.arrowHeadSize;
        d6 = Math.sin(d6);
        float f7 = (float)(d7 - (d8 *= d6));
        d8 = this.arrowHeadSize;
        d6 = Math.cos(d3 += 0.5235987755982988);
        float f8 = (float)(d4 - (d8 *= d6));
        d8 = this.arrowHeadSize;
        d3 = Math.sin(d3);
        f5 = (float)(d7 - (d8 *= d3));
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f6, f7);
        path.lineTo(f8, f5);
        path.close();
        Paint paint = this.arrowPaint;
        canvas.drawPath(path, paint);
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
        Object object;
        Object object2 = new Paint();
        this.linePaint = object2;
        int n = -65536;
        object2.setColor(n);
        object2 = this.linePaint;
        float f = 5.0f;
        object2.setStrokeWidth(f);
        object2 = this.linePaint;
        Paint.Style style2 = Paint.Style.STROKE;
        object2.setStyle(style2);
        object2 = this.linePaint;
        int n2 = 1;
        object2.setAntiAlias(n2 != 0);
        object2 = new Paint();
        this.arrowPaint = object2;
        object2.setColor(n);
        object2 = this.arrowPaint;
        Object object3 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object3);
        this.arrowPaint.setAntiAlias(n2 != 0);
        object2 = new Paint();
        this.cropPaint = object2;
        object2.setColor(-15605);
        object2 = this.cropPaint;
        object3 = Paint.Style.STROKE;
        object2.setStyle((Paint.Style)object3);
        this.cropPaint.setStrokeWidth(f);
        this.cropPaint.setAntiAlias(n2 != 0);
        object2 = new Rect();
        this.mTextRect = object2;
        object2 = new Paint(n2);
        this.imagePaint = object2;
        object2 = new Paint(n2);
        this.textPaint = object2;
        n = -1;
        object2.setColor(n);
        object2 = LocaleHelper.getLanguage(context);
        boolean n3 = ((String)object2).equals("ar");
        object3 = "fonts/ReadexPro_Medium.ttf";
        if (n3) {
            this.mTittle = "\u062a\u062d\u0643\u0645 \u0641\u064a \u0634\u0627\u0634\u0629 \u0627\u0644\u0622\u064a\u0628\u0648\u062f";
            object2 = this.textPaint;
            object = this.getResources().getAssets();
            object3 = Typeface.createFromAsset((AssetManager)object, (String)object3);
            object2.setTypeface((Typeface)object3);
        } else {
            this.mTittle = "iPod screen selection";
            object2 = this.textPaint;
            object = this.getResources().getAssets();
            object3 = Typeface.createFromAsset((AssetManager)object, (String)object3);
            object2.setTypeface((Typeface)object3);
        }
        int n4 = (int)((float)ScreenUtils.getScreenWidth(CropViewHint.getActivity(context)) * 0.52f);
        ScreenUtils.getScreenWidth(CropViewHint.getActivity(context));
        object = new CropViewHint$1(this, context, n4);
        object3 = new Thread((Runnable)object);
        ((Thread)object3).start();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n = -16777216;
        float f = -1.7014118E38f;
        canvas.drawColor(n);
        Object object = this.bitmap;
        if (object != null) {
            float f2 = this.y_bitmap;
            Paint paint = this.imagePaint;
            int n2 = 0;
            float f3 = 0.0f;
            canvas.drawBitmap(object, 0.0f, f2, paint);
            object = this.mTittle;
            f2 = this.x_text;
            float f4 = this.y_text;
            Paint paint2 = this.textPaint;
            canvas.drawText((String)object, f2, f4, paint2);
            object = this.ipadBitmap;
            if (object != null) {
                float f5;
                Canvas canvas2;
                object = this.cropRect;
                if (object == null) {
                    RectF rectF;
                    f = (float)this.bitmap.getWidth() * 0.25f;
                    f2 = (float)this.bitmap.getWidth() * 0.35f;
                    paint = this.bitmap;
                    f4 = (float)paint.getHeight() * 0.08f;
                    f3 = this.y_bitmap;
                    f4 += f3;
                    paint2 = this.bitmap;
                    n2 = paint2.getHeight();
                    f3 = (float)n2 * 0.43f + f4;
                    this.cropRect = rectF = new RectF(f, f4, f2 += f, f3);
                    f = rectF.width();
                    f2 = this.cropRect.height();
                    this.radius = f = (float)((int)(Math.min(f, f2) * 0.10800001f));
                    this.arrowHeadSize = n = (int)((float)this.bitmap.getWidth() * 0.1f);
                    n = this.getWidth();
                    int n3 = this.ipadBitmap.getWidth();
                    this.endX = f = (float)(n - n3);
                    f = this.y_bitmap;
                    f2 = this.bitmap.getHeight();
                    this.endY = f += f2;
                    object = this.ipadBitmap;
                    n = object.getHeight();
                    f = (float)n * 0.28f;
                    canvas2 = this.ipadBitmap;
                    n3 = canvas2.getWidth();
                    f2 = n3;
                    f4 = this.endY;
                    this.endLineY_arrow = f3 = f4 + f;
                    f3 = this.endX;
                    this.endLineX_arrow = f5 = f3 + (f2 *= 0.3f);
                    f5 = 0.98f;
                    this.endLineY = f4 = f4 * f5 + f;
                    this.endLineX = f3 = f3 * f5 + f2;
                }
                object = this.cropRect;
                f2 = this.radius;
                paint = this.cropPaint;
                canvas.drawRoundRect((RectF)object, f2, f2, paint);
                object = this.ipadBitmap;
                f2 = this.endX;
                f4 = this.endY;
                paint2 = this.imagePaint;
                canvas.drawBitmap(object, f2, f4, paint2);
                f4 = this.cropRect.centerX();
                object = this.cropRect;
                f3 = object.centerY();
                f5 = this.endLineX;
                float f6 = this.endLineY;
                Paint paint3 = this.linePaint;
                canvas2 = canvas;
                canvas.drawLine(f4, f3, f5, f6, paint3);
                float f7 = this.endLineX_arrow;
                float f8 = this.endLineY_arrow;
                this.drawArrowHead(canvas, f7, f8, 0.0f, 0.0f);
            }
        }
    }

    protected void onMeasure(int n, int n2) {
        float f;
        super.onMeasure(n, n2);
        n = View.MeasureSpec.getSize((int)n);
        this.setMeasuredDimension(n, n);
        Paint paint = this.linePaint;
        float f2 = n;
        float f3 = 0.0085f * f2;
        paint.setStrokeWidth(f3);
        paint = this.textPaint;
        paint.setTextSize(f2 *= 0.045f);
        paint = this.textPaint;
        String string2 = this.mTittle;
        int n3 = string2.length();
        Rect rect = this.mTextRect;
        paint.getTextBounds(string2, 0, n3, rect);
        n2 = this.mTextRect.width();
        this.x_text = f = (float)(n - n2) * 0.5f;
        this.y_text = f = (float)this.mTextRect.height() * 1.2f;
        float f4 = this.mTextRect.height();
        this.y_bitmap = f += f4;
    }
}

