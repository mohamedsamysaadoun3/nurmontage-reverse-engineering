// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import android.graphics.Paint$Style;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;

public class EntitySelectTool
{
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
    
    public EntitySelectTool(int length, final Context context) {
        final Typeface loadFontFromAsset = UtilsFileLast.loadFontFromAsset(context, "fonts/arabic/\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf");
        String s;
        if (LocaleHelper.getLanguage(context).equals("ar")) {
            s = "\u062a\u0637\u0628\u064a\u0642 \u0639\u0644\u0649 \u0627\u0644\u0643\u0644";
        }
        else {
            s = "ApplyAll";
        }
        final Paint paint = new Paint(1);
        this.paint = paint;
        final int n = -409555;
        paint.setColor(n);
        final float n2 = (float)length;
        paint.setStrokeWidth(0.005f * n2);
        this.round = 0.02f * n2;
        length = (int)(n2 * 0.047f);
        final float n3 = (float)length;
        final RectF rectFScale = new RectF(0.0f, 0.0f, n3, n3);
        this.rectFScale = rectFScale;
        final RectF rectApplyAll = new RectF(0.0f, 0.0f, (float)(length * 4), rectFScale.height());
        this.rectApplyAll = rectApplyAll;
        this.offset_x = rectFScale.width() * 0.7f;
        final float strokeWidth = paint.getStrokeWidth();
        final float n4 = 0.5f;
        final float offset_y = strokeWidth * n4;
        this.offset_y = offset_y;
        this.offset_y_apply = offset_y * 3.0f;
        paint.setStyle(Paint$Style.FILL);
        final Drawable drawable = ContextCompat.getDrawable(context, R$drawable.ic_expand);
        final Bitmap bitmap = Bitmap.createBitmap(length, length, Bitmap$Config.ARGB_8888);
        this.bitmapScale = bitmap;
        final Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(canvas.getWidth() * n4, canvas.getHeight() * n4, n3 * n4, paint);
        final int n5 = (int)(n3 * 0.1f);
        length -= n5;
        if (drawable != null) {
            drawable.setBounds(n5, n5, length, length);
            drawable.draw(canvas);
        }
        length = (int)rectApplyAll.width();
        canvas.setBitmap(this.bitmapApplyAll = Bitmap.createBitmap(length, (int)rectApplyAll.height(), Bitmap$Config.ARGB_8888));
        final float n6 = (float)(int)(rectApplyAll.height() * 0.2f);
        canvas.drawRoundRect(rectApplyAll, n6, n6, paint);
        paint.setStyle(Paint$Style.FILL);
        paint.setColor(-14540254);
        paint.setTypeface(loadFontFromAsset);
        final float n7 = rectApplyAll.width() * 0.8f;
        final float n8 = rectApplyAll.height() * 0.6f;
        final float textSize = 100.0f;
        paint.setTextSize(textSize);
        final Rect rect = new Rect();
        paint.getTextBounds(s, 0, s.length(), rect);
        paint.setTextSize(Math.min(n7 / rect.width(), n8 / rect.height()) * textSize);
        length = s.length();
        paint.getTextBounds(s, 0, length, rect);
        canvas.drawText(s, rectApplyAll.centerX() - rect.width() * n4, rectApplyAll.centerY() - rect.exactCenterY(), paint);
        paint.setColor(n);
        paint.setStyle(Paint$Style.STROKE);
    }
    
    public void draw(final Canvas canvas, final EntityView entityView) {
        final RectF rect = entityView.getRect();
        final float round = this.round;
        canvas.drawRoundRect(rect, round, round, this.paint);
        if (entityView instanceof TranslationQuranEntity) {
            canvas.drawBitmap(this.bitmapScale, entityView.getRect().left, entityView.getRect().top - this.offset_y, (Paint)null);
        }
        else {
            canvas.drawBitmap(this.bitmapScale, entityView.getRect().left - this.offset_x, entityView.getRect().bottom - this.offset_y, (Paint)null);
        }
        if (this.isApply_all) {
            canvas.drawBitmap(this.bitmapApplyAll, entityView.getRect().right - this.bitmapApplyAll.getWidth(), entityView.getRect().top - this.bitmapApplyAll.getHeight() - this.offset_y_apply, (Paint)null);
        }
    }
    
    public boolean isApply(final EntityView entityView, final float n, final float n2) {
        if (this.isApply_all) {
            this.rectApplyAll.left = entityView.getRect().right - this.bitmapApplyAll.getWidth();
            this.rectApplyAll.right = entityView.getRect().right;
            this.rectApplyAll.top = entityView.getRect().top - this.bitmapApplyAll.getHeight() - this.offset_y_apply;
            this.rectApplyAll.bottom = entityView.getRect().top;
            if (this.rectApplyAll.contains(n, n2)) {
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
    
    public boolean isScale(final EntityView entityView, final float n, final float n2) {
        final boolean b = entityView instanceof TranslationQuranEntity;
        final float n3 = 2.0f;
        if (b) {
            this.rectFScale.top = entityView.getRect().top - this.offset_y * n3;
            this.rectFScale.left = entityView.getRect().left - this.offset_x;
        }
        else {
            this.rectFScale.left = entityView.getRect().left - this.offset_x * n3;
            this.rectFScale.top = entityView.getRect().bottom - this.offset_y * n3;
        }
        final RectF rectFScale = this.rectFScale;
        final float left = rectFScale.left;
        final float n4 = (float)this.bitmapScale.getWidth();
        final float n5 = 1.5f;
        rectFScale.right = left + n4 * n5;
        final RectF rectFScale2 = this.rectFScale;
        rectFScale2.bottom = rectFScale2.top + this.bitmapScale.getHeight() * n5;
        this.setApply_Scale(this.isOnScale = this.rectFScale.contains(n, n2));
        return this.isOnScale;
    }
    
    public void reset() {
        this.setApply_Move(false);
        this.setApply_Scale(false);
        this.setApply_all(false);
    }
    
    public void setApply_Move(final boolean isApply_Move) {
        this.isApply_Move = isApply_Move;
        if (isApply_Move) {
            this.setApply_Scale(false);
        }
    }
    
    public void setApply_Scale(final boolean isApply_Scale) {
        this.isApply_Scale = isApply_Scale;
        if (isApply_Scale) {
            this.setApply_Move(false);
        }
    }
    
    public void setApply_all(final boolean isApply_all) {
        this.isApply_all = isApply_all;
    }
    
    public void setClick_apply(final boolean isClick_apply) {
        this.isClick_apply = isClick_apply;
    }
    
    public void setOnProgress(final boolean isOnProgress) {
        this.isOnProgress = isOnProgress;
    }
}
