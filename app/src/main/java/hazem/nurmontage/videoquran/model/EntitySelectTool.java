package hazem.nurmontage.videoquran.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;

/* loaded from: classes2.dex */
public class EntitySelectTool {
    private final Bitmap bitmapApplyAll;
    private final Bitmap bitmapScale;
    private boolean isApply_Move;
    private boolean isApply_Scale;
    private boolean isApply_all;
    private boolean isClick_apply;
    private boolean isOnProgress;
    private boolean isOnScale;
    private final float offset_x;
    private final float offset_y;
    private final float offset_y_apply;
    private final Paint paint;
    private final RectF rectApplyAll;
    private final RectF rectFScale;
    private float round;

    public void setClick_apply(boolean isClicked) {
        this.isClick_apply = isClicked;
    }

    public boolean isClick_apply() {
        return this.isClick_apply;
    }

    public void setOnProgress(boolean isClicked) {
        this.isOnProgress = isClicked;
    }

    public boolean isOnProgress() {
        return this.isOnProgress;
    }

    public void setApply_Move(boolean isClicked) {
        this.isApply_Move = isClicked;
        if (isClicked) {
            setApply_Scale(false);
        }
    }

    public boolean isApply_Move() {
        return this.isApply_Move;
    }

    public boolean isApply_Scale() {
        return this.isApply_Scale;
    }

    public void setApply_Scale(boolean isClicked) {
        this.isApply_Scale = isClicked;
        if (isClicked) {
            setApply_Move(false);
        }
    }

    public void setApply_all(boolean isClicked) {
        this.isApply_all = isClicked;
    }

    public EntitySelectTool(int count, Context context) {
        Typeface loadFontFromAsset = UtilsFileLast.loadFontFromAsset(context, "fonts/arabic/خط الإبل.otf");
        String value = LocaleHelper.getLanguage(context).equals("ar") ? "تطبيق على الكل" : "ApplyAll";
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-409555);
        float f = count;
        paint.setStrokeWidth(0.005f * f);
        this.round = 0.02f * f;
        int i2 = (int) (f * 0.047f);
        float floatValue2 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, floatValue2, floatValue2);
        this.rectFScale = rectF;
        RectF rectF2 = new RectF(0.0f, 0.0f, i2 * 4, rectF.height());
        this.rectApplyAll = rectF2;
        this.offset_x = rectF.width() * 0.7f;
        float strokeWidth = paint.getStrokeWidth() * 0.5f;
        this.offset_y = strokeWidth;
        this.offset_y_apply = strokeWidth * 3.0f;
        paint.setStyle(Paint.Style.FILL);
        Drawable drawable = ContextCompat.getDrawable(context, C2014R.drawable.ic_expand);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        this.bitmapScale = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f, floatValue2 * 0.5f, paint);
        int i3 = (int) (floatValue2 * 0.1f);
        int i4 = i2 - i3;
        if (drawable != null) {
            drawable.setBounds(i3, i3, i4, i4);
            drawable.draw(canvas);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_8888);
        this.bitmapApplyAll = createBitmap2;
        canvas.setBitmap(createBitmap2);
        float height = (int) (rectF2.height() * 0.2f);
        canvas.drawRoundRect(rectF2, height, height, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-14540254);
        paint.setTypeface(loadFontFromAsset);
        float width = rectF2.width() * 0.8f;
        float height2 = rectF2.height() * 0.6f;
        paint.setTextSize(100.0f);
        Rect rect = new Rect();
        paint.getTextBounds(value, 0, value.length(), rect);
        paint.setTextSize(Math.min(width / rect.width(), height2 / rect.height()) * 100.0f);
        paint.getTextBounds(value, 0, value.length(), rect);
        canvas.drawText(value, rectF2.centerX() - (rect.width() * 0.5f), rectF2.centerY() - rect.exactCenterY(), paint);
        paint.setColor(-409555);
        paint.setStyle(Paint.Style.STROKE);
    }

    public boolean isApply_all() {
        return this.isApply_all;
    }

    public boolean isApply(EntityView entityView, float f, float floatValue2) {
        if (!this.isApply_all) {
            return false;
        }
        this.rectApplyAll.left = entityView.getRect().right - this.bitmapApplyAll.getWidth();
        this.rectApplyAll.right = entityView.getRect().right;
        this.rectApplyAll.top = (entityView.getRect().top - this.bitmapApplyAll.getHeight()) - this.offset_y_apply;
        this.rectApplyAll.bottom = entityView.getRect().top;
        return this.rectApplyAll.contains(f, floatValue2);
    }

    public boolean isScale(EntityView entityView, float f, float floatValue2) {
        if (entityView instanceof TranslationQuranEntity) {
            this.rectFScale.top = entityView.getRect().top - (this.offset_y * 2.0f);
            this.rectFScale.left = entityView.getRect().left - this.offset_x;
        } else {
            this.rectFScale.left = entityView.getRect().left - (this.offset_x * 2.0f);
            this.rectFScale.top = entityView.getRect().bottom - (this.offset_y * 2.0f);
        }
        RectF rectF = this.rectFScale;
        rectF.right = rectF.left + (this.bitmapScale.getWidth() * 1.5f);
        RectF rectF2 = this.rectFScale;
        rectF2.bottom = rectF2.top + (this.bitmapScale.getHeight() * 1.5f);
        boolean contains = this.rectFScale.contains(f, floatValue2);
        this.isOnScale = contains;
        setApply_Scale(contains);
        return this.isOnScale;
    }

    public void draw(Canvas canvas, EntityView entityView) {
        RectF rect = entityView.getRect();
        float f = this.round;
        canvas.drawRoundRect(rect, f, f, this.paint);
        if (entityView instanceof TranslationQuranEntity) {
            canvas.drawBitmap(this.bitmapScale, entityView.getRect().left, entityView.getRect().top - this.offset_y, (Paint) null);
        } else {
            canvas.drawBitmap(this.bitmapScale, entityView.getRect().left - this.offset_x, entityView.getRect().bottom - this.offset_y, (Paint) null);
        }
        if (this.isApply_all) {
            canvas.drawBitmap(this.bitmapApplyAll, entityView.getRect().right - this.bitmapApplyAll.getWidth(), (entityView.getRect().top - this.bitmapApplyAll.getHeight()) - this.offset_y_apply, (Paint) null);
        }
    }

    public void reset() {
        setApply_Move(false);
        setApply_Scale(false);
        setApply_all(false);
    }
}
