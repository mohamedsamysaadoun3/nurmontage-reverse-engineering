/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  androidx.core.content.ContextCompat
 */
package hazem.nurmontage.videoquran.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;

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

    public EntitySelectTool(int n, Context context) {
        Bitmap bitmap;
        RectF rectF;
        RectF rectF2;
        Typeface typeface = UtilsFileLast.loadFontFromAsset(context, "fonts/arabic/\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf");
        String string2 = LocaleHelper.getLanguage(context);
        String string3 = "ar";
        boolean bl = string2.equals(string3);
        string2 = bl ? "\u062a\u0637\u0628\u064a\u0642 \u0639\u0644\u0649 \u0627\u0644\u0643\u0644" : "ApplyAll";
        super(1);
        this.paint = string3;
        int n2 = -409555;
        string3.setColor(n2);
        float f = n;
        float f2 = 0.005f * f;
        string3.setStrokeWidth(f2);
        this.round = f2 = 0.02f * f;
        n = (int)(f *= 0.047f);
        float f3 = n;
        this.rectFScale = rectF2 = new RectF(0.0f, 0.0f, f3, f3);
        float f4 = n * 4;
        float f5 = rectF2.height();
        this.rectApplyAll = rectF = new RectF(0.0f, 0.0f, f4, f5);
        this.offset_x = f2 = rectF2.width() * 0.7f;
        f2 = string3.getStrokeWidth();
        float f6 = 0.5f;
        this.offset_y = f2 *= f6;
        f4 = 3.0f;
        this.offset_y_apply = f2 *= f4;
        rectF2 = Paint.Style.FILL;
        string3.setStyle((Paint.Style)rectF2);
        int n3 = R$drawable.ic_expand;
        context = ContextCompat.getDrawable((Context)context, (int)n3);
        rectF2 = Bitmap.Config.ARGB_8888;
        rectF2 = Bitmap.createBitmap((int)n, (int)n, (Bitmap.Config)rectF2);
        this.bitmapScale = rectF2;
        Canvas canvas = new Canvas((Bitmap)rectF2);
        f2 = (float)canvas.getWidth() * f6;
        int n4 = canvas.getHeight();
        f5 = (float)n4 * f6;
        float f7 = f3 * f6;
        canvas.drawCircle(f2, f5, f7, (Paint)string3);
        f2 = 0.1f;
        n3 = (int)(f3 *= f2);
        n -= n3;
        if (context != null) {
            context.setBounds(n3, n3, n, n);
            context.draw(canvas);
        }
        n = (int)rectF.width();
        int n5 = (int)rectF.height();
        rectF2 = Bitmap.Config.ARGB_8888;
        this.bitmapApplyAll = bitmap = Bitmap.createBitmap((int)n, (int)n5, (Bitmap.Config)rectF2);
        canvas.setBitmap(bitmap);
        f = (int)(rectF.height() * 0.2f);
        canvas.drawRoundRect(rectF, f, f, (Paint)string3);
        bitmap = Paint.Style.FILL;
        string3.setStyle((Paint.Style)bitmap);
        string3.setColor(-14540254);
        string3.setTypeface(typeface);
        f = rectF.width() * 0.8f;
        float f8 = rectF.height() * 0.6f;
        float f9 = 100.0f;
        string3.setTextSize(f9);
        super();
        int n6 = string2.length();
        string3.getTextBounds(string2, 0, n6, (Rect)rectF2);
        f3 = rectF2.width();
        f /= f3;
        f3 = rectF2.height();
        f = Math.min(f, f8 /= f3) * f9;
        string3.setTextSize(f);
        n = string2.length();
        string3.getTextBounds(string2, 0, n, (Rect)rectF2);
        f = rectF.centerX();
        f8 = (float)rectF2.width() * f6;
        f -= f8;
        f8 = rectF.centerY();
        f9 = rectF2.exactCenterY();
        canvas.drawText(string2, f, f8 -= f9, (Paint)string3);
        string3.setColor(n2);
        bitmap = Paint.Style.STROKE;
        string3.setStyle((Paint.Style)bitmap);
    }

    public void draw(Canvas canvas, EntityView entityView) {
        float f;
        RectF rectF;
        float f2;
        RectF rectF2 = entityView.getRect();
        float f3 = this.round;
        Paint paint = this.paint;
        canvas.drawRoundRect(rectF2, f3, f3, paint);
        boolean bl = entityView instanceof TranslationQuranEntity;
        f3 = 0.0f;
        if (bl) {
            rectF2 = this.bitmapScale;
            paint = entityView.getRect();
            f2 = paint.left;
            rectF = entityView.getRect();
            f = rectF.top;
            float f4 = this.offset_y;
            canvas.drawBitmap((Bitmap)rectF2, f2, f -= f4, null);
        } else {
            rectF2 = this.bitmapScale;
            paint = entityView.getRect();
            f2 = paint.left;
            f = this.offset_x;
            f2 -= f;
            rectF = entityView.getRect();
            f = rectF.bottom;
            float f5 = this.offset_y;
            canvas.drawBitmap((Bitmap)rectF2, f2, f -= f5, null);
        }
        bl = this.isApply_all;
        if (bl) {
            rectF2 = this.bitmapApplyAll;
            paint = entityView.getRect();
            f2 = paint.right;
            f = this.bitmapApplyAll.getWidth();
            f2 -= f;
            entityView = entityView.getRect();
            float f6 = ((RectF)entityView).top;
            rectF = this.bitmapApplyAll;
            int n = rectF.getHeight();
            f = n;
            f6 -= f;
            f = this.offset_y_apply;
            canvas.drawBitmap((Bitmap)rectF2, f2, f6 -= f, null);
        }
    }

    public boolean isApply(EntityView entityView, float f, float f2) {
        boolean bl = this.isApply_all;
        if (bl) {
            float f3;
            RectF rectF = this.rectApplyAll;
            float f4 = entityView.getRect().right;
            float f5 = this.bitmapApplyAll.getWidth();
            rectF.left = f4 -= f5;
            rectF = this.rectApplyAll;
            rectF.right = f4 = entityView.getRect().right;
            rectF = this.rectApplyAll;
            RectF rectF2 = entityView.getRect();
            f4 = rectF2.top;
            Bitmap bitmap = this.bitmapApplyAll;
            int n = bitmap.getHeight();
            f5 = n;
            f4 -= f5;
            f5 = this.offset_y_apply;
            rectF.top = f4 -= f5;
            rectF = this.rectApplyAll;
            rectF.bottom = f3 = entityView.getRect().top;
            entityView = this.rectApplyAll;
            boolean bl2 = entityView.contains(f, f2);
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    public boolean isApply_Move() {
        return this.isApply_Move;
    }

    public boolean isApply_Scale() {
        return this.isApply_Scale;
    }

    public boolean isApply_all() {
        return this.isApply_all;
    }

    public boolean isClick_apply() {
        return this.isClick_apply;
    }

    public boolean isOnProgress() {
        return this.isOnProgress;
    }

    public boolean isScale(EntityView entityView, float f, float f2) {
        boolean bl;
        float f3;
        boolean bl2 = entityView instanceof TranslationQuranEntity;
        float f4 = 2.0f;
        if (bl2) {
            RectF rectF = this.rectFScale;
            RectF rectF2 = entityView.getRect();
            f3 = rectF2.top;
            float f5 = this.offset_y * f4;
            rectF.top = f3 -= f5;
            rectF = this.rectFScale;
            entityView = entityView.getRect();
            float f6 = ((RectF)entityView).left;
            f4 = this.offset_x;
            rectF.left = f6 -= f4;
        } else {
            RectF rectF = this.rectFScale;
            RectF rectF3 = entityView.getRect();
            f3 = rectF3.left;
            float f7 = this.offset_x * f4;
            rectF.left = f3 -= f7;
            rectF = this.rectFScale;
            entityView = entityView.getRect();
            float f8 = ((RectF)entityView).bottom;
            f3 = this.offset_y * f4;
            rectF.top = f8 -= f3;
        }
        entityView = this.rectFScale;
        float f9 = ((RectF)entityView).left;
        f4 = this.bitmapScale.getWidth();
        f3 = 1.5f;
        ((RectF)entityView).right = f9 += (f4 *= f3);
        entityView = this.rectFScale;
        f9 = ((RectF)entityView).top;
        f4 = (float)this.bitmapScale.getHeight() * f3;
        ((RectF)entityView).bottom = f9 += f4;
        this.isOnScale = bl = this.rectFScale.contains(f, f2);
        this.setApply_Scale(bl);
        return this.isOnScale;
    }

    public void reset() {
        this.setApply_Move(false);
        this.setApply_Scale(false);
        this.setApply_all(false);
    }

    public void setApply_Move(boolean bl) {
        this.isApply_Move = bl;
        if (bl) {
            bl = false;
            this.setApply_Scale(false);
        }
    }

    public void setApply_Scale(boolean bl) {
        this.isApply_Scale = bl;
        if (bl) {
            bl = false;
            this.setApply_Move(false);
        }
    }

    public void setApply_all(boolean bl) {
        this.isApply_all = bl;
    }

    public void setClick_apply(boolean bl) {
        this.isClick_apply = bl;
    }

    public void setOnProgress(boolean bl) {
        this.isOnProgress = bl;
    }
}

