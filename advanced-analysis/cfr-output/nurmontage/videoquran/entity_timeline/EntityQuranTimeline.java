/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 */
package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;

public class EntityQuranTimeline
extends Entity {
    private float centerY;
    private float downX;
    private String file;
    private String file_in;
    private String file_out;
    private float h;
    private float lastLeft;
    private float lastRight;
    private Paint paintText;
    private QuranEntity quranEntity;
    private Rect textBound;
    private Transition transition;

    public EntityQuranTimeline(QuranEntity quranEntity, float f, float f2, float f3, float f4, float f5) {
        super(f5);
        float f6;
        this.h = f3;
        this.quranEntity = quranEntity;
        super(f, f2, f4, f3);
        this.rect = quranEntity;
        this.left = f6 = this.rect.left;
        this.right = f6 = this.rect.right;
        this.color = -5253382;
        super(1);
        this.paintText = quranEntity;
        Object object = Paint.Style.FILL;
        quranEntity.setStyle((Paint.Style)object);
        quranEntity = this.paintText;
        f = this.rect.height() * 0.27f;
        quranEntity.setTextSize(f);
        quranEntity = this.paintText;
        object = this.getQuranEntity().getPaintAya().getTypeface();
        quranEntity.setTypeface((Typeface)object);
        this.paintText.setColor(-16441312);
        super();
        this.textBound = quranEntity;
        quranEntity = this.paintText;
        object = this.quranEntity.getTxt();
        int n = this.quranEntity.getTxt().length();
        Rect rect = this.textBound;
        quranEntity.getTextBounds((String)object, 0, n, rect);
        f6 = this.rect.top;
        f = this.rect.height();
        f2 = 0.5f;
        f6 += (f *= f2);
        f = (float)this.textBound.height() * f2;
        this.centerY = f6 += f;
        f = 0.46f * f3;
        super(0.0f, 0.0f, f, f3);
        this.rectFLeft = quranEntity;
        f = this.rectFLeft.width();
        super(0.0f, 0.0f, f, f3);
        this.rectFRight = quranEntity;
        this.round = f6 = this.rectFRight.width() * f2;
        this.padding = f3 *= 0.07f;
    }

    public boolean contains(PointF pointF) {
        boolean bl;
        boolean bl2 = this.isSelect;
        if (bl2) {
            this.onTouch(pointF);
        }
        RectF rectF = this.rect;
        float f = pointF.x;
        float f2 = pointF.y;
        this.isSelect = bl = rectF.contains(f, f2);
        return this.isSelect;
    }

    public void draw(Canvas canvas) {
        String string2 = this.quranEntity.getTxt().replace("\u0646\u0635", "...");
        float f = this.round;
        float f2 = this.rect.left;
        f += f2;
        f2 = this.centerY;
        Paint paint = this.paintText;
        canvas.drawText(string2, f, f2, paint);
    }

    public void draw(Canvas canvas, int n, int n2) {
        String string2 = this.quranEntity.getTxt().replace("\u0646\u0635", "...");
        float f = this.round;
        float f2 = this.rect.left;
        f += f2;
        f2 = this.centerY;
        Paint paint = this.paintText;
        canvas.drawText(string2, f, f2, paint);
    }

    public float getDownX() {
        return this.downX;
    }

    public String getFile() {
        return this.file;
    }

    public String getFile_in() {
        return this.file_in;
    }

    public String getFile_out() {
        return this.file_out;
    }

    public float getH() {
        return this.h;
    }

    public float getLeft() {
        return this.left;
    }

    public QuranEntity getQuranEntity() {
        return this.quranEntity;
    }

    public RectF getRect() {
        return this.rect;
    }

    public float getRight() {
        return this.right;
    }

    public RectF getSelectTrim() {
        return this.selectTrim;
    }

    public Transition getTransition() {
        return this.transition;
    }

    public int getTrim_type() {
        return this.trim_type;
    }

    public boolean onTouch(PointF pointF) {
        float f;
        this.selectTrim = null;
        this.downX = f = pointF.x;
        f = 0.0f / 0.0f;
        this.trim_type = -1;
        RectF rectF = this.rectFLeft;
        float f2 = pointF.x;
        float f3 = pointF.y;
        boolean bl = rectF.contains(f2, f3);
        boolean bl2 = true;
        f2 = Float.MIN_VALUE;
        if (bl) {
            pointF = this.rectFLeft;
            this.selectTrim = pointF;
            boolean bl3 = false;
            float f4 = 0.0f;
            pointF = null;
            this.trim_type = 0;
            this.isSelect = bl2;
        } else {
            rectF = this.rectFRight;
            f3 = pointF.x;
            float f5 = pointF.y;
            boolean bl4 = rectF.contains(f3, f5);
            if (bl4) {
                pointF = this.rectFRight;
                this.selectTrim = pointF;
                this.trim_type = bl2 ? 1 : 0;
                this.isSelect = bl2;
            }
        }
        return bl2;
    }

    public void onUpLeft() {
        float f;
        this.left = f = this.lastLeft;
    }

    public void onUpRight() {
        float f;
        this.right = f = this.lastRight;
    }

    public void setDownX(float f) {
        this.downX = f;
    }

    public void setFile(String string2) {
        this.file = string2;
    }

    public void setFile_in(String string2) {
        this.file_in = string2;
    }

    public void setFile_out(String string2) {
        this.file_out = string2;
    }

    public void setLastLeft(float f) {
        this.lastLeft = f;
    }

    public void setLastRight(float f) {
        this.lastRight = f;
    }

    public void setRight(float f) {
        this.right = f;
        this.rect.right = f;
    }

    public void setSelect(boolean bl) {
        this.isSelect = bl;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public void setX(float f) {
        float f2 = f - 0.0f;
        float f3 = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
        if (f3 < 0) {
            f = 0.0f;
        }
        this.rect.left = f;
        this.left = f;
    }

    public void setY(float f) {
        this.rect.top = f;
        RectF rectF = this.rect;
        float f2 = this.h;
        float f3 = this.rect.top;
        rectF.bottom = f2 += f3;
        f = this.rect.top;
        f2 = this.rect.height();
        f3 = 0.5f;
        f += (f2 *= f3);
        f2 = (float)this.textBound.height() * f3;
        this.centerY = f += f2;
    }

    public void updateStartTrim() {
    }
}

