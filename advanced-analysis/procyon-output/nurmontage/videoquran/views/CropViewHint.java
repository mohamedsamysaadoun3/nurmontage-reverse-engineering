// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.View$MeasureSpec;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.graphics.Paint$Style;
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
import android.graphics.Path;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;

public class CropViewHint extends View
{
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
    
    public CropViewHint(final Context context) {
        super(context);
        this.init(context);
    }
    
    public CropViewHint(final Context context, final AttributeSet set) {
        super(context, set);
        this.init(context);
    }
    
    private void drawArrowHead(final Canvas canvas, final float n, final float n2, final float n3, final float n4) {
        final double atan2 = Math.atan2(n2 - n4, n - n3);
        final double n5 = n;
        final double n6 = this.arrowHeadSize;
        final double n7 = atan2 - 0.5235987755982988;
        final float n8 = (float)(n5 - n6 * Math.cos(n7));
        final double n9 = n2;
        final float n10 = (float)(n9 - this.arrowHeadSize * Math.sin(n7));
        final double n11 = this.arrowHeadSize;
        final double n12 = atan2 + 0.5235987755982988;
        final float n13 = (float)(n5 - n11 * Math.cos(n12));
        final float n14 = (float)(n9 - this.arrowHeadSize * Math.sin(n12));
        final Path path = new Path();
        path.moveTo(n, n2);
        path.lineTo(n8, n10);
        path.lineTo(n13, n14);
        path.close();
        canvas.drawPath(path, this.arrowPaint);
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
        final Paint linePaint = new Paint();
        this.linePaint = linePaint;
        final int n = -65536;
        linePaint.setColor(n);
        final Paint linePaint2 = this.linePaint;
        final float n2 = 5.0f;
        linePaint2.setStrokeWidth(n2);
        this.linePaint.setStyle(Paint$Style.STROKE);
        final Paint linePaint3 = this.linePaint;
        final boolean antiAlias = true;
        linePaint3.setAntiAlias(antiAlias);
        (this.arrowPaint = new Paint()).setColor(n);
        this.arrowPaint.setStyle(Paint$Style.FILL);
        this.arrowPaint.setAntiAlias(antiAlias);
        (this.cropPaint = new Paint()).setColor(-15605);
        this.cropPaint.setStyle(Paint$Style.STROKE);
        this.cropPaint.setStrokeWidth(n2);
        this.cropPaint.setAntiAlias(antiAlias);
        this.mTextRect = new Rect();
        this.imagePaint = new Paint((int)(antiAlias ? 1 : 0));
        (this.textPaint = new Paint((int)(antiAlias ? 1 : 0))).setColor(-1);
        final boolean equals = LocaleHelper.getLanguage(context).equals("ar");
        final String s = "fonts/ReadexPro_Medium.ttf";
        if (equals) {
            this.mTittle = "\u062a\u062d\u0643\u0645 \u0641\u064a \u0634\u0627\u0634\u0629 \u0627\u0644\u0622\u064a\u0628\u0648\u062f";
            this.textPaint.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), s));
        }
        else {
            this.mTittle = "iPod screen selection";
            this.textPaint.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), s));
        }
        final int n3 = (int)(ScreenUtils.getScreenWidth(getActivity(context)) * 0.52f);
        ScreenUtils.getScreenWidth(getActivity(context));
        new Thread(new CropViewHint$1(this, context, n3)).start();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        final Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, this.y_bitmap, this.imagePaint);
            canvas.drawText(this.mTittle, this.x_text, this.y_text, this.textPaint);
            if (this.ipadBitmap != null) {
                if (this.cropRect == null) {
                    final float n = this.bitmap.getWidth() * 0.25f;
                    final float n2 = this.bitmap.getWidth() * 0.35f;
                    final float n3 = this.bitmap.getHeight() * 0.08f + this.y_bitmap;
                    final RectF cropRect = new RectF(n, n3, n2 + n, this.bitmap.getHeight() * 0.43f + n3);
                    this.cropRect = cropRect;
                    this.radius = (float)(int)(Math.min(cropRect.width(), this.cropRect.height()) * 0.10800001f);
                    this.arrowHeadSize = (int)(this.bitmap.getWidth() * 0.1f);
                    this.endX = (float)(this.getWidth() - this.ipadBitmap.getWidth());
                    this.endY = this.y_bitmap + this.bitmap.getHeight();
                    final float n4 = this.ipadBitmap.getHeight() * 0.28f;
                    final float n5 = this.ipadBitmap.getWidth() * 0.3f;
                    final float endY = this.endY;
                    this.endLineY_arrow = endY + n4;
                    final float endX = this.endX;
                    this.endLineX_arrow = endX + n5;
                    final float n6 = 0.98f;
                    this.endLineY = endY * n6 + n4;
                    this.endLineX = endX * n6 + n5;
                }
                final RectF cropRect2 = this.cropRect;
                final float radius = this.radius;
                canvas.drawRoundRect(cropRect2, radius, radius, this.cropPaint);
                canvas.drawBitmap(this.ipadBitmap, this.endX, this.endY, this.imagePaint);
                canvas.drawLine(this.cropRect.centerX(), this.cropRect.centerY(), this.endLineX, this.endLineY, this.linePaint);
                this.drawArrowHead(canvas, this.endLineX_arrow, this.endLineY_arrow, 0.0f, 0.0f);
            }
        }
    }
    
    protected void onMeasure(int size, int width) {
        super.onMeasure(size, width);
        size = View$MeasureSpec.getSize(size);
        this.setMeasuredDimension(size, size);
        final Paint linePaint = this.linePaint;
        final float n = (float)size;
        linePaint.setStrokeWidth(0.0085f * n);
        this.textPaint.setTextSize(n * 0.045f);
        final Paint textPaint = this.textPaint;
        final String mTittle = this.mTittle;
        textPaint.getTextBounds(mTittle, 0, mTittle.length(), this.mTextRect);
        width = this.mTextRect.width();
        this.x_text = (size - width) * 0.5f;
        final float y_text = this.mTextRect.height() * 1.2f;
        this.y_text = y_text;
        this.y_bitmap = y_text + this.mTextRect.height();
    }
}
