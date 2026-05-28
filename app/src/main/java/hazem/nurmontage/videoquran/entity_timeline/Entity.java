package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.common.StackEntity;
import hazem.nurmontage.videoquran.constant.EntityAction;
import hazem.nurmontage.videoquran.model.EntityView;
import java.util.List;
import java.util.Stack;

/* loaded from: classes2.dex */
public abstract class Entity {
    private String audio_id;
    protected int color;
    private StackEntity currentStackEntity;
    protected float end;
    private List<Entity> entitiesGroup;
    private EntityView entityView;
    private float fade_in;
    private float fade_out;
    private String frame_id;
    private int index;
    protected int index_end_thumbnail;
    protected int index_start_thumbnail;
    protected boolean isSelect;
    private boolean isSelectMultiple;
    private boolean isSplit;
    private boolean isTrimLeft;
    private boolean isVideo;
    protected boolean isVisible;
    protected float left;
    protected float max;
    private float offset;
    private float offset_left;
    private float offset_right;
    private float onDown;
    private float onTapTime;
    protected float padding;
    private final Paint paint;
    private final Paint paintStroke;
    private Path path;
    protected RectF rect;
    protected RectF rectFLeft;
    protected RectF rectFRight;
    protected float right;
    protected float round;
    protected float second_in_screen;
    protected RectF selectTrim;
    protected float start;
    private float mScaleFactor = 1.0f;
    private Stack<StackEntity> undoRect = new Stack<>();
    private Stack<StackEntity> rectList = new Stack<>();
    protected int trim_type = -1;
    private int color_select_multiple = -409555;
    private EntityAction entityAction = EntityAction.ADD;
    private boolean visible = true;

    public abstract boolean contains(PointF pointF);

    public abstract void draw(Canvas canvas);

    public abstract void draw(Canvas canvas, int color, int value2);

    public abstract float getDownX();

    public abstract float getH();

    public abstract float getLeft();

    public abstract RectF getRect();

    public abstract float getRight();

    public abstract RectF getSelectTrim();

    public abstract int getTrim_type();

    public abstract boolean onTouch(PointF pointF);

    public abstract void onUpLeft();

    public abstract void onUpRight();

    public void release() {
    }

    public abstract void setDownX(float floatValue);

    public abstract void setLastLeft(float floatValue);

    public abstract void setLastRight(float floatValue);

    public abstract void setRight(float floatValue);

    public abstract void setSelect(boolean isSelected);

    public abstract void setX(float floatValue);

    public abstract void setY(float floatValue);

    public abstract void updateStartTrim();

    public List<Entity> getEntitiesGroup() {
        return this.entitiesGroup;
    }

    public void setEntitiesGroup(List<Entity> list) {
        this.entitiesGroup = list;
    }

    public void setSelectMultiple(boolean isSelected) {
        this.isSelectMultiple = isSelected;
    }

    public boolean isSelectMultiple() {
        return this.isSelectMultiple;
    }

    public void setVisible(boolean isSelected) {
        this.isVisible = isSelected;
    }

    public StackEntity getCurrentStackEntity() {
        return this.currentStackEntity;
    }

    public void setColor_select_multiple(int color) {
        this.color_select_multiple = color;
    }

    public void setSecond_in_screen(float floatValue) {
        this.second_in_screen = floatValue;
    }

    public float getSecond_in_screen() {
        return this.second_in_screen;
    }

    public void setAudio_id(String textValue) {
        this.audio_id = textValue;
    }

    public String getAudio_id() {
        return this.audio_id;
    }

    public void setFrame_id(String textValue) {
        this.frame_id = textValue;
    }

    public String getFrame_id() {
        return this.frame_id;
    }

    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }

    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }

    public void setTrimLeft(boolean isSelected) {
        this.isTrimLeft = isSelected;
    }

    public boolean isTrimLeft() {
        return this.isTrimLeft;
    }

    public void setSplit(boolean isSelected) {
        this.isSplit = isSelected;
    }

    public float getRound() {
        return this.round;
    }

    public boolean isSplit() {
        return this.isSplit;
    }

    public float getFade_in() {
        return this.fade_in;
    }

    public float getFade_out() {
        return this.fade_out;
    }

    public void setFade_in(float floatValue) {
        this.fade_in = floatValue;
    }

    public void setFade_out(float floatValue) {
        this.fade_out = floatValue;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setEntityAction(EntityAction entityAction) {
        this.entityAction = entityAction;
    }

    public void setCurrentRect() {
        if (this.currentStackEntity != null) {
            return;
        }
        this.currentStackEntity = new StackEntity(new RectF(this.rect.left / getmScaleFactor(), this.rect.top / getmScaleFactor(), this.rect.right / getmScaleFactor(), this.rect.bottom / getmScaleFactor()), this.offset, this.end, this.start, this.left, this.right, this.max, getOffset_right(), getOffset_left());
    }

    public void setIndex(int color) {
        this.index = color;
    }

    public int getIndex() {
        return this.index;
    }

    public void setEntityView(EntityView entityView) {
        this.entityView = entityView;
    }

    public EntityView getEntityView() {
        return this.entityView;
    }

    public Entity(float floatValue) {
        this.second_in_screen = floatValue;
        Paint paint = new Paint(1);
        this.paintStroke = paint;
        paint.setColor(this.color_select_multiple);
        paint.setStyle(Paint.Style.STROKE);
        this.paint = new Paint(1);
    }

    public boolean visible() {
        return this.visible;
    }

    public void visible(boolean isSelected) {
        this.visible = isSelected;
    }

    public void setmScaleFactor(float floatValue) {
        this.mScaleFactor = floatValue;
    }

    public float getmScaleFactor() {
        return this.mScaleFactor;
    }

    public void updateRect(float floatValue) {
        if (floatValue == this.mScaleFactor) {
            return;
        }
        RectF rectF = this.rect;
        rectF.left = (rectF.left / this.mScaleFactor) * floatValue;
        RectF rectF2 = this.rect;
        rectF2.right = (rectF2.right / this.mScaleFactor) * floatValue;
        setX(this.rect.left);
        setRight(this.rect.right);
        this.mScaleFactor = floatValue;
    }

    public void update(Canvas canvas) {
        this.paint.setColor(this.color);
        if (!this.isVideo) {
            RectF rectF = this.rect;
            float floatValue = this.round;
            canvas.drawRoundRect(rectF, floatValue, floatValue, this.paint);
            canvas.save();
            canvas.clipRect(this.rect);
            draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            this.path.reset();
            Path path = this.path;
            RectF rectF2 = this.rect;
            float floatValue2 = this.round;
            path.addRoundRect(rectF2, floatValue2, floatValue2, Path.Direction.CW);
            canvas.clipPath(this.path);
            draw(canvas);
            canvas.restore();
        }
        if (this.isSelect) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.05f);
            this.paintStroke.setColor(this.color_select_multiple);
            RectF rectF3 = this.rect;
            float xPosition = this.round;
            canvas.drawRoundRect(rectF3, xPosition, xPosition, this.paintStroke);
            this.paint.setColor(this.color_select_multiple);
            if (getTrim_type() == 0) {
                this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
                this.rectFLeft.right = this.rect.left;
                this.rectFLeft.top = this.rect.top + this.padding;
                this.rectFLeft.bottom = this.rect.bottom - this.padding;
                RectF rectF4 = this.rectFLeft;
                float f4 = this.round;
                canvas.drawRoundRect(rectF4, f4, f4, this.paint);
                return;
            }
            if (getTrim_type() == 1) {
                this.rectFRight.right = this.rect.right + this.rectFRight.width();
                this.rectFRight.left = this.rect.right;
                this.rectFRight.top = this.rect.top + this.padding;
                this.rectFRight.bottom = this.rect.bottom - this.padding;
                RectF rectF5 = this.rectFRight;
                float f5 = this.round;
                canvas.drawRoundRect(rectF5, f5, f5, this.paint);
                return;
            }
            if (this.isSelectMultiple) {
                return;
            }
            this.rectFRight.right = this.rect.right + this.rectFRight.width();
            this.rectFRight.left = this.rect.right;
            this.rectFRight.top = this.rect.top + this.padding;
            this.rectFRight.bottom = this.rect.bottom - this.padding;
            this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
            this.rectFLeft.right = this.rect.left;
            this.rectFLeft.top = this.rect.top + this.padding;
            this.rectFLeft.bottom = this.rect.bottom - this.padding;
            RectF rectF6 = this.rectFLeft;
            float f6 = this.round;
            canvas.drawRoundRect(rectF6, f6, f6, this.paint);
            RectF rectF7 = this.rectFRight;
            float f7 = this.round;
            canvas.drawRoundRect(rectF7, f7, f7, this.paint);
            return;
        }
        if (this.isVideo) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.025f);
            this.paintStroke.setColor(-8355712);
            RectF rectF8 = this.rect;
            float widthRatio = this.round;
            canvas.drawRoundRect(rectF8, widthRatio, widthRatio, this.paintStroke);
        }
    }

    public void update(Canvas canvas, int color, int width45) {
        this.paint.setColor(this.color);
        if (!this.isVideo) {
            RectF rectF = this.rect;
            float floatValue = this.round;
            canvas.drawRoundRect(rectF, floatValue, floatValue, this.paint);
            canvas.save();
            canvas.clipRect(this.rect);
            draw(canvas, color, width45);
            canvas.restore();
        } else {
            canvas.save();
            this.path.reset();
            Path path = this.path;
            RectF rectF2 = this.rect;
            float floatValue2 = this.round;
            path.addRoundRect(rectF2, floatValue2, floatValue2, Path.Direction.CW);
            canvas.clipPath(this.path);
            draw(canvas, color, width45);
            canvas.restore();
        }
        if (this.isSelect) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.05f);
            this.paint.setColor(this.color_select_multiple);
            this.paintStroke.setColor(this.color_select_multiple);
            if (getTrim_type() == 0) {
                this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
                this.rectFLeft.right = this.rect.left;
                this.rectFLeft.top = this.rect.top + this.padding;
                this.rectFLeft.bottom = this.rect.bottom - this.padding;
                RectF rectF3 = this.rectFLeft;
                float f3 = this.round;
                canvas.drawRoundRect(rectF3, f3, f3, this.paint);
            } else if (getTrim_type() == 1) {
                this.rectFRight.right = this.rect.right + this.rectFRight.width();
                this.rectFRight.left = this.rect.right;
                this.rectFRight.top = this.rect.top + this.padding;
                this.rectFRight.bottom = this.rect.bottom - this.padding;
                RectF rectF4 = this.rectFRight;
                float f4 = this.round;
                canvas.drawRoundRect(rectF4, f4, f4, this.paint);
            } else if (!isSelectMultiple()) {
                this.rectFRight.right = this.rect.right + this.rectFRight.width();
                this.rectFRight.left = this.rect.right;
                this.rectFRight.top = this.rect.top + this.padding;
                this.rectFRight.bottom = this.rect.bottom - this.padding;
                this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
                this.rectFLeft.right = this.rect.left;
                this.rectFLeft.top = this.rect.top + this.padding;
                this.rectFLeft.bottom = this.rect.bottom - this.padding;
                RectF rectF5 = this.rectFLeft;
                float f5 = this.round;
                canvas.drawRoundRect(rectF5, f5, f5, this.paint);
                RectF rectF6 = this.rectFRight;
                float f6 = this.round;
                canvas.drawRoundRect(rectF6, f6, f6, this.paint);
            }
            RectF rectF7 = this.rect;
            float f7 = this.round;
            canvas.drawRoundRect(rectF7, f7, f7, this.paintStroke);
            return;
        }
        if (this.isVideo) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.025f);
            this.paintStroke.setColor(-8355712);
            RectF rectF8 = this.rect;
            float widthRatio = this.round;
            canvas.drawRoundRect(rectF8, f8, f8, this.paintStroke);
        }
    }

    public void setOffset_left(float floatValue) {
        this.offset_left = floatValue;
    }

    public float getOffset_left() {
        return this.offset_left;
    }

    public float getOffset() {
        return this.offset;
    }

    public float getOffset_right() {
        return this.offset_right;
    }

    public void setOffset_right(float floatValue) {
        this.offset_right = floatValue;
    }

    public float getOnDown() {
        return this.onDown;
    }

    public void setOffset(float floatValue) {
        this.offset = floatValue;
    }

    public void setOnTapTime(float floatValue, float floatValue2) {
        this.onTapTime = floatValue;
        this.onDown = floatValue2;
    }

    public float getOnTapTime() {
        return this.onTapTime;
    }

    public void resetTrim_type() {
        this.trim_type = -1;
    }

    public void onChange() {
        StackEntity stackEntity = this.currentStackEntity;
        if (stackEntity == null) {
            return;
        }
        this.rectList.push(stackEntity);
        this.rectList.push(new StackEntity(new RectF(this.rect.left / getmScaleFactor(), this.rect.top / getmScaleFactor(), this.rect.right / getmScaleFactor(), this.rect.bottom / getmScaleFactor()), this.offset, this.end, this.start, this.left, this.right, this.max, getOffset_right(), getOffset_left()));
        this.currentStackEntity = null;
    }

    public void undo() {
        try {
            if (this.rectList.isEmpty()) {
                return;
            }
            StackEntity pop = this.rectList.pop();
            StackEntity pop2 = this.rectList.pop();
            this.undoRect.push(pop);
            this.undoRect.push(pop2);
            this.offset_left = pop2.getOffset_left();
            this.offset_right = pop2.getOffset_right();
            this.rect = new RectF(pop2.getRectF().left * getmScaleFactor(), pop2.getRectF().top * getmScaleFactor(), pop2.getRectF().right * getmScaleFactor(), pop2.getRectF().bottom * getmScaleFactor());
            this.offset = pop2.getOffset();
            this.end = pop2.getEnd();
            this.start = pop2.getStart();
            this.right = pop2.getRight();
            this.left = pop2.getLeft();
            this.max = pop2.getMax();
        } catch (Exception unused) {
        }
    }

    public void redo() {
        try {
            if (this.undoRect.isEmpty()) {
                return;
            }
            StackEntity pop = this.undoRect.pop();
            StackEntity pop2 = this.undoRect.pop();
            this.rectList.push(pop);
            this.rectList.push(pop2);
            this.offset_left = pop2.getOffset_left();
            this.offset_right = pop2.getOffset_right();
            this.rect = new RectF(pop2.getRectF().left * getmScaleFactor(), pop2.getRectF().top * getmScaleFactor(), pop2.getRectF().right * getmScaleFactor(), pop2.getRectF().bottom * getmScaleFactor());
            this.offset = pop2.getOffset();
            this.end = pop2.getEnd();
            this.start = pop2.getStart();
            this.right = pop2.getRight();
            this.left = pop2.getLeft();
            this.max = pop2.getMax();
        } catch (Exception unused) {
        }
    }
}
