package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;

/* loaded from: classes2.dex */
public class EntityQuranTimeline extends Entity {
    private float centerY;
    private float downX;
    private String file;
    private String file_in;
    private String file_out;

    /* renamed from: h */
    private float f412h;
    private float lastLeft;
    private float lastRight;
    private Paint paintText;
    private QuranEntity quranEntity;
    private Rect textBound;
    private Transition transition;

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void updateStartTrim() {
    }

    public Transition getTransition() {
        return this.transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public void setFile(String filePath) {
        this.file = filePath;
    }

    public void setFile_in(String filePath) {
        this.file_in = filePath;
    }

    public void setFile_out(String filePath) {
        this.file_out = filePath;
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

    public QuranEntity getQuranEntity() {
        return this.quranEntity;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setDownX(float floatValue) {
        this.downX = floatValue;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public float getH() {
        return this.f412h;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public float getLeft() {
        return this.left;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setLastLeft(float floatValue) {
        this.lastLeft = floatValue;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setLastRight(float floatValue) {
        this.lastRight = floatValue;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setX(float floatValue) {
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        this.rect.left = floatValue;
        this.left = floatValue;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public float getRight() {
        return this.right;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setRight(float floatValue) {
        this.right = floatValue;
        this.rect.right = floatValue;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void onUpRight() {
        this.right = this.lastRight;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void onUpLeft() {
        this.left = this.lastLeft;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public RectF getRect() {
        return this.rect;
    }

    public EntityQuranTimeline(QuranEntity quranEntity, float floatValue, float f2, float f3, float f4, float floatValue5) {
        super(floatValue5);
        this.f412h = f3;
        this.quranEntity = quranEntity;
        this.rect = new RectF(floatValue, f2, f4, f3);
        this.left = this.rect.left;
        this.right = this.rect.right;
        this.color = Common.COLOR_BLOCK_QURAN;
        Paint paint = new Paint(1);
        this.paintText = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paintText.setTextSize(this.rect.height() * 0.27f);
        this.paintText.setTypeface(getQuranEntity().getPaintAya().getTypeface());
        this.paintText.setColor(Common.COLOR_AYA);
        this.textBound = new Rect();
        this.paintText.getTextBounds(this.quranEntity.getTxt(), 0, this.quranEntity.getTxt().length(), this.textBound);
        this.centerY = this.rect.top + (this.rect.height() * 0.5f) + (this.textBound.height() * 0.5f);
        this.rectFLeft = new RectF(0.0f, 0.0f, 0.46f * f3, f3);
        this.rectFRight = new RectF(0.0f, 0.0f, this.rectFLeft.width(), f3);
        this.round = this.rectFRight.width() * 0.5f;
        this.padding = f3 * 0.07f;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setY(float floatValue) {
        this.rect.top = floatValue;
        this.rect.bottom = this.f412h + this.rect.top;
        this.centerY = this.rect.top + (this.rect.height() * 0.5f) + (this.textBound.height() * 0.5f);
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void draw(Canvas canvas) {
        canvas.drawText(this.quranEntity.getTxt().replace(Common.NUMBER_CHAR, "..."), this.round + this.rect.left, this.centerY, this.paintText);
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void draw(Canvas canvas, int i, int value2) {
        canvas.drawText(this.quranEntity.getTxt().replace(Common.NUMBER_CHAR, "..."), this.round + this.rect.left, this.centerY, this.paintText);
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public void setSelect(boolean isSelected) {
        this.isSelect = isSelected;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public boolean onTouch(PointF pointF) {
        this.selectTrim = null;
        this.downX = pointF.x;
        this.trim_type = -1;
        if (this.rectFLeft.contains(pointF.x, pointF.y)) {
            this.selectTrim = this.rectFLeft;
            this.trim_type = 0;
            this.isSelect = true;
        } else if (this.rectFRight.contains(pointF.x, pointF.y)) {
            this.selectTrim = this.rectFRight;
            this.trim_type = 1;
            this.isSelect = true;
        }
        return true;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public int getTrim_type() {
        return this.trim_type;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public RectF getSelectTrim() {
        return this.selectTrim;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public float getDownX() {
        return this.downX;
    }

    @Override // hazem.nurmontage.videoquran.entity_timeline.Entity
    public boolean contains(PointF pointF) {
        if (this.isSelect) {
            onTouch(pointF);
        }
        this.isSelect = this.rect.contains(pointF.x, pointF.y);
        return this.isSelect;
    }
}
