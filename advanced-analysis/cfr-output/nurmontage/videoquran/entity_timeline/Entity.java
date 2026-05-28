/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PointF
 *  android.graphics.RectF
 */
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
import java.util.Vector;

public abstract class Entity {
    private String audio_id;
    protected int color;
    private int color_select_multiple;
    private StackEntity currentStackEntity;
    protected float end;
    private List entitiesGroup;
    private EntityAction entityAction;
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
    private float mScaleFactor = 1.0f;
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
    private Stack rectList;
    protected float right;
    protected float round;
    protected float second_in_screen;
    protected RectF selectTrim;
    protected float start;
    protected int trim_type;
    private Stack undoRect;
    private boolean visible;

    public Entity(float f) {
        EntityAction entityAction;
        Paint paint;
        this.undoRect = paint = new Stack();
        this.rectList = paint = new Stack();
        this.trim_type = -1;
        this.color_select_multiple = -409555;
        this.second_in_screen = f;
        this.entityAction = entityAction = EntityAction.ADD;
        int n = 1;
        this.visible = n;
        this.paintStroke = paint = new Paint(n);
        int n2 = this.color_select_multiple;
        paint.setColor(n2);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        this.paint = paint = new Paint(n);
    }

    public abstract boolean contains(PointF var1);

    public abstract void draw(Canvas var1);

    public abstract void draw(Canvas var1, int var2, int var3);

    public String getAudio_id() {
        return this.audio_id;
    }

    public StackEntity getCurrentStackEntity() {
        return this.currentStackEntity;
    }

    public abstract float getDownX();

    public List getEntitiesGroup() {
        return this.entitiesGroup;
    }

    public EntityView getEntityView() {
        return this.entityView;
    }

    public float getFade_in() {
        return this.fade_in;
    }

    public float getFade_out() {
        return this.fade_out;
    }

    public String getFrame_id() {
        return this.frame_id;
    }

    public abstract float getH();

    public int getIndex() {
        return this.index;
    }

    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }

    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }

    public abstract float getLeft();

    public float getOffset() {
        return this.offset;
    }

    public float getOffset_left() {
        return this.offset_left;
    }

    public float getOffset_right() {
        return this.offset_right;
    }

    public float getOnDown() {
        return this.onDown;
    }

    public float getOnTapTime() {
        return this.onTapTime;
    }

    public abstract RectF getRect();

    public abstract float getRight();

    public float getRound() {
        return this.round;
    }

    public float getSecond_in_screen() {
        return this.second_in_screen;
    }

    public abstract RectF getSelectTrim();

    public abstract int getTrim_type();

    public float getmScaleFactor() {
        return this.mScaleFactor;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public boolean isSelectMultiple() {
        return this.isSelectMultiple;
    }

    public boolean isSplit() {
        return this.isSplit;
    }

    public boolean isTrimLeft() {
        return this.isTrimLeft;
    }

    public void onChange() {
        Object object = this.currentStackEntity;
        if (object == null) {
            return;
        }
        this.rectList.push(object);
        object = this.rectList;
        float f = this.rect.left;
        float f2 = this.getmScaleFactor();
        f /= f2;
        f2 = this.rect.top;
        float f3 = this.getmScaleFactor();
        f2 /= f3;
        f3 = this.rect.right;
        float f4 = this.getmScaleFactor();
        f3 /= f4;
        f4 = this.rect.bottom;
        float f5 = this.getmScaleFactor();
        RectF rectF = new RectF(f, f2, f3, f4 /= f5);
        f2 = this.offset;
        f3 = this.end;
        f4 = this.start;
        f5 = this.left;
        float f6 = this.right;
        float f7 = this.max;
        float f8 = this.getOffset_right();
        float f9 = this.getOffset_left();
        StackEntity stackEntity = new StackEntity(rectF, f2, f3, f4, f5, f6, f7, f8, f9);
        ((Stack)object).push(stackEntity);
        this.currentStackEntity = null;
    }

    public abstract boolean onTouch(PointF var1);

    public abstract void onUpLeft();

    public abstract void onUpRight();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void redo() {
        Object object;
        block35: {
            try {
                object = this.undoRect;
            }
            catch (Exception exception) {
                return;
            }
            boolean bl = ((Vector)object).isEmpty();
            if (!bl) break block35;
            return;
        }
        object = this.undoRect;
        object = ((Stack)object).pop();
        object = (StackEntity)object;
        Object object2 = this.undoRect;
        object2 = ((Stack)object2).pop();
        object2 = (StackEntity)object2;
        Stack stack = this.rectList;
        stack.push(object);
        object = this.rectList;
        ((Stack)object).push(object2);
        float f = ((StackEntity)object2).getOffset_left();
        this.offset_left = f;
        f = ((StackEntity)object2).getOffset_right();
        this.offset_right = f;
        stack = ((StackEntity)object2).getRectF();
        float f2 = ((RectF)stack).left;
        float f3 = this.getmScaleFactor();
        f2 *= f3;
        RectF rectF = ((StackEntity)object2).getRectF();
        f3 = rectF.top;
        float f4 = this.getmScaleFactor();
        f3 *= f4;
        RectF rectF2 = ((StackEntity)object2).getRectF();
        f4 = rectF2.right;
        float f5 = this.getmScaleFactor();
        f4 *= f5;
        RectF rectF3 = ((StackEntity)object2).getRectF();
        f5 = rectF3.bottom;
        float f6 = this.getmScaleFactor();
        f5 *= f6;
        object = new RectF(f2, f3, f4, f5);
        this.rect = object;
        f = ((StackEntity)object2).getOffset();
        this.offset = f;
        f = ((StackEntity)object2).getEnd();
        this.end = f;
        f = ((StackEntity)object2).getStart();
        this.start = f;
        f = ((StackEntity)object2).getRight();
        this.right = f;
        f = ((StackEntity)object2).getLeft();
        this.left = f;
        f = ((StackEntity)object2).getMax();
        this.max = f;
    }

    public void release() {
    }

    public void resetTrim_type() {
        this.trim_type = -1;
    }

    public void setAudio_id(String string2) {
        this.audio_id = string2;
    }

    public void setColor_select_multiple(int n) {
        this.color_select_multiple = n;
    }

    public void setCurrentRect() {
        StackEntity stackEntity = this.currentStackEntity;
        if (stackEntity != null) {
            return;
        }
        float f = this.rect.left;
        float f2 = this.getmScaleFactor();
        f /= f2;
        f2 = this.rect.top;
        float f3 = this.getmScaleFactor();
        f2 /= f3;
        f3 = this.rect.right;
        float f4 = this.getmScaleFactor();
        f3 /= f4;
        f4 = this.rect.bottom;
        float f5 = this.getmScaleFactor();
        RectF rectF = new RectF(f, f2, f3, f4 /= f5);
        f2 = this.offset;
        f3 = this.end;
        f4 = this.start;
        f5 = this.left;
        float f6 = this.right;
        float f7 = this.max;
        float f8 = this.getOffset_right();
        float f9 = this.getOffset_left();
        this.currentStackEntity = stackEntity = new StackEntity(rectF, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public abstract void setDownX(float var1);

    public void setEntitiesGroup(List list) {
        this.entitiesGroup = list;
    }

    public void setEntityAction(EntityAction entityAction) {
        this.entityAction = entityAction;
    }

    public void setEntityView(EntityView entityView) {
        this.entityView = entityView;
    }

    public void setFade_in(float f) {
        this.fade_in = f;
    }

    public void setFade_out(float f) {
        this.fade_out = f;
    }

    public void setFrame_id(String string2) {
        this.frame_id = string2;
    }

    public void setIndex(int n) {
        this.index = n;
    }

    public abstract void setLastLeft(float var1);

    public abstract void setLastRight(float var1);

    public void setOffset(float f) {
        this.offset = f;
    }

    public void setOffset_left(float f) {
        this.offset_left = f;
    }

    public void setOffset_right(float f) {
        this.offset_right = f;
    }

    public void setOnTapTime(float f, float f2) {
        this.onTapTime = f;
        this.onDown = f2;
    }

    public abstract void setRight(float var1);

    public void setSecond_in_screen(float f) {
        this.second_in_screen = f;
    }

    public abstract void setSelect(boolean var1);

    public void setSelectMultiple(boolean bl) {
        this.isSelectMultiple = bl;
    }

    public void setSplit(boolean bl) {
        this.isSplit = bl;
    }

    public void setTrimLeft(boolean bl) {
        this.isTrimLeft = bl;
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public abstract void setX(float var1);

    public abstract void setY(float var1);

    public void setmScaleFactor(float f) {
        this.mScaleFactor = f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void undo() {
        Object object;
        block35: {
            try {
                object = this.rectList;
            }
            catch (Exception exception) {
                return;
            }
            boolean bl = ((Vector)object).isEmpty();
            if (!bl) break block35;
            return;
        }
        object = this.rectList;
        object = ((Stack)object).pop();
        object = (StackEntity)object;
        Object object2 = this.rectList;
        object2 = ((Stack)object2).pop();
        object2 = (StackEntity)object2;
        Stack stack = this.undoRect;
        stack.push(object);
        object = this.undoRect;
        ((Stack)object).push(object2);
        float f = ((StackEntity)object2).getOffset_left();
        this.offset_left = f;
        f = ((StackEntity)object2).getOffset_right();
        this.offset_right = f;
        stack = ((StackEntity)object2).getRectF();
        float f2 = ((RectF)stack).left;
        float f3 = this.getmScaleFactor();
        f2 *= f3;
        RectF rectF = ((StackEntity)object2).getRectF();
        f3 = rectF.top;
        float f4 = this.getmScaleFactor();
        f3 *= f4;
        RectF rectF2 = ((StackEntity)object2).getRectF();
        f4 = rectF2.right;
        float f5 = this.getmScaleFactor();
        f4 *= f5;
        RectF rectF3 = ((StackEntity)object2).getRectF();
        f5 = rectF3.bottom;
        float f6 = this.getmScaleFactor();
        f5 *= f6;
        object = new RectF(f2, f3, f4, f5);
        this.rect = object;
        f = ((StackEntity)object2).getOffset();
        this.offset = f;
        f = ((StackEntity)object2).getEnd();
        this.end = f;
        f = ((StackEntity)object2).getStart();
        this.start = f;
        f = ((StackEntity)object2).getRight();
        this.right = f;
        f = ((StackEntity)object2).getLeft();
        this.left = f;
        f = ((StackEntity)object2).getMax();
        this.max = f;
    }

    public void update(Canvas canvas) {
        float f;
        RectF rectF;
        Paint paint;
        float f2;
        Paint paint2 = this.paint;
        int n = this.color;
        paint2.setColor(n);
        int n2 = this.isVideo;
        if (n2 == 0) {
            paint2 = this.rect;
            f2 = this.round;
            paint = this.paint;
            canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
            canvas.save();
            paint2 = this.rect;
            canvas.clipRect((RectF)paint2);
            this.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            this.path.reset();
            paint2 = this.path;
            rectF = this.rect;
            f = this.round;
            Path.Direction direction = Path.Direction.CW;
            paint2.addRoundRect(rectF, f, f, direction);
            paint2 = this.path;
            canvas.clipPath((Path)paint2);
            this.draw(canvas);
            canvas.restore();
        }
        n2 = this.isSelect;
        if (n2 != 0) {
            paint2 = this.paintStroke;
            rectF = this.rect;
            f2 = rectF.height();
            f = 0.05f;
            paint2.setStrokeWidth(f2 *= f);
            paint2 = this.paintStroke;
            n = this.color_select_multiple;
            paint2.setColor(n);
            paint2 = this.rect;
            f2 = this.round;
            paint = this.paintStroke;
            canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
            paint2 = this.paint;
            n = this.color_select_multiple;
            paint2.setColor(n);
            n2 = this.getTrim_type();
            if (n2 == 0) {
                paint2 = this.rectFLeft;
                f2 = this.rect.left;
                f = this.rectFLeft.width();
                paint2.left = f2 -= f;
                paint2 = this.rectFLeft;
                paint2.right = f2 = this.rect.left;
                paint2 = this.rectFLeft;
                f2 = this.rect.top;
                f = this.padding;
                paint2.top = f2 += f;
                paint2 = this.rectFLeft;
                f2 = this.rect.bottom;
                f = this.padding;
                paint2.bottom = f2 -= f;
                paint2 = this.rectFLeft;
                f2 = this.round;
                paint = this.paint;
                canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
                return;
            }
            n2 = this.getTrim_type();
            n = 1;
            f2 = Float.MIN_VALUE;
            if (n2 == n) {
                paint2 = this.rectFRight;
                f2 = this.rect.right;
                f = this.rectFRight.width();
                paint2.right = f2 += f;
                paint2 = this.rectFRight;
                paint2.left = f2 = this.rect.right;
                paint2 = this.rectFRight;
                f2 = this.rect.top;
                f = this.padding;
                paint2.top = f2 += f;
                paint2 = this.rectFRight;
                f2 = this.rect.bottom;
                f = this.padding;
                paint2.bottom = f2 -= f;
                paint2 = this.rectFRight;
                f2 = this.round;
                paint = this.paint;
                canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
                return;
            }
            n2 = this.isSelectMultiple ? 1 : 0;
            if (n2 == 0) {
                paint2 = this.rectFRight;
                f2 = this.rect.right;
                f = this.rectFRight.width();
                paint2.right = f2 += f;
                paint2 = this.rectFRight;
                paint2.left = f2 = this.rect.right;
                paint2 = this.rectFRight;
                f2 = this.rect.top;
                f = this.padding;
                paint2.top = f2 += f;
                paint2 = this.rectFRight;
                f2 = this.rect.bottom;
                f = this.padding;
                paint2.bottom = f2 -= f;
                paint2 = this.rectFLeft;
                f2 = this.rect.left;
                f = this.rectFLeft.width();
                paint2.left = f2 -= f;
                paint2 = this.rectFLeft;
                paint2.right = f2 = this.rect.left;
                paint2 = this.rectFLeft;
                f2 = this.rect.top;
                f = this.padding;
                paint2.top = f2 += f;
                paint2 = this.rectFLeft;
                rectF = this.rect;
                f2 = rectF.bottom;
                f = this.padding;
                paint2.bottom = f2 -= f;
                paint2 = this.rectFLeft;
                f2 = this.round;
                paint = this.paint;
                canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
                paint2 = this.rectFRight;
                f2 = this.round;
                paint = this.paint;
                canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
            }
            return;
        }
        n2 = this.isVideo;
        if (n2 != 0) {
            paint2 = this.paintStroke;
            rectF = this.rect;
            f2 = rectF.height();
            f = 0.025f;
            paint2.setStrokeWidth(f2 *= f);
            paint2 = this.paintStroke;
            n = -8355712;
            paint2.setColor(n);
            paint2 = this.rect;
            f2 = this.round;
            paint = this.paintStroke;
            canvas.drawRoundRect((RectF)paint2, f2, f2, paint);
        }
    }

    public void update(Canvas canvas, int n, int n2) {
        Paint paint = this.paint;
        int n3 = this.color;
        paint.setColor(n3);
        int n4 = this.isVideo;
        if (n4 == 0) {
            paint = this.rect;
            float f = this.round;
            Paint paint2 = this.paint;
            canvas.drawRoundRect((RectF)paint, f, f, paint2);
            canvas.save();
            paint = this.rect;
            canvas.clipRect((RectF)paint);
            this.draw(canvas, n, n2);
            canvas.restore();
        } else {
            canvas.save();
            this.path.reset();
            paint = this.path;
            RectF rectF = this.rect;
            float f = this.round;
            Path.Direction direction = Path.Direction.CW;
            paint.addRoundRect(rectF, f, f, direction);
            paint = this.path;
            canvas.clipPath((Path)paint);
            this.draw(canvas, n, n2);
            canvas.restore();
        }
        n = this.isSelect ? 1 : 0;
        if (n != 0) {
            Paint paint3 = this.paintStroke;
            RectF rectF = this.rect;
            float f = rectF.height();
            n4 = 1028443341;
            float f2 = 0.05f;
            paint3.setStrokeWidth(f *= f2);
            paint3 = this.paint;
            n2 = this.color_select_multiple;
            paint3.setColor(n2);
            paint3 = this.paintStroke;
            n2 = this.color_select_multiple;
            paint3.setColor(n2);
            n = this.getTrim_type();
            if (n == 0) {
                paint3 = this.rectFLeft;
                f = this.rect.left;
                f2 = this.rectFLeft.width();
                paint3.left = f -= f2;
                paint3 = this.rectFLeft;
                paint3.right = f = this.rect.left;
                paint3 = this.rectFLeft;
                f = this.rect.top;
                f2 = this.padding;
                paint3.top = f += f2;
                paint3 = this.rectFLeft;
                rectF = this.rect;
                f = rectF.bottom;
                f2 = this.padding;
                paint3.bottom = f -= f2;
                paint3 = this.rectFLeft;
                f = this.round;
                paint = this.paint;
                canvas.drawRoundRect((RectF)paint3, f, f, paint);
            } else {
                n = this.getTrim_type();
                n2 = 1;
                f = Float.MIN_VALUE;
                if (n == n2) {
                    paint3 = this.rectFRight;
                    f = this.rect.right;
                    f2 = this.rectFRight.width();
                    paint3.right = f += f2;
                    paint3 = this.rectFRight;
                    paint3.left = f = this.rect.right;
                    paint3 = this.rectFRight;
                    f = this.rect.top;
                    f2 = this.padding;
                    paint3.top = f += f2;
                    paint3 = this.rectFRight;
                    rectF = this.rect;
                    f = rectF.bottom;
                    f2 = this.padding;
                    paint3.bottom = f -= f2;
                    paint3 = this.rectFRight;
                    f = this.round;
                    paint = this.paint;
                    canvas.drawRoundRect((RectF)paint3, f, f, paint);
                } else {
                    n = this.isSelectMultiple() ? 1 : 0;
                    if (n == 0) {
                        paint3 = this.rectFRight;
                        f = this.rect.right;
                        f2 = this.rectFRight.width();
                        paint3.right = f += f2;
                        paint3 = this.rectFRight;
                        paint3.left = f = this.rect.right;
                        paint3 = this.rectFRight;
                        f = this.rect.top;
                        f2 = this.padding;
                        paint3.top = f += f2;
                        paint3 = this.rectFRight;
                        f = this.rect.bottom;
                        f2 = this.padding;
                        paint3.bottom = f -= f2;
                        paint3 = this.rectFLeft;
                        f = this.rect.left;
                        f2 = this.rectFLeft.width();
                        paint3.left = f -= f2;
                        paint3 = this.rectFLeft;
                        paint3.right = f = this.rect.left;
                        paint3 = this.rectFLeft;
                        f = this.rect.top;
                        f2 = this.padding;
                        paint3.top = f += f2;
                        paint3 = this.rectFLeft;
                        rectF = this.rect;
                        f = rectF.bottom;
                        f2 = this.padding;
                        paint3.bottom = f -= f2;
                        paint3 = this.rectFLeft;
                        f = this.round;
                        paint = this.paint;
                        canvas.drawRoundRect((RectF)paint3, f, f, paint);
                        paint3 = this.rectFRight;
                        f = this.round;
                        paint = this.paint;
                        canvas.drawRoundRect((RectF)paint3, f, f, paint);
                    }
                }
            }
            paint3 = this.rect;
            f = this.round;
            paint = this.paintStroke;
            canvas.drawRoundRect((RectF)paint3, f, f, paint);
            return;
        }
        n = this.isVideo ? 1 : 0;
        if (n != 0) {
            Paint paint4 = this.paintStroke;
            RectF rectF = this.rect;
            float f = rectF.height();
            n4 = 0x3CCCCCCD;
            float f3 = 0.025f;
            paint4.setStrokeWidth(f *= f3);
            paint4 = this.paintStroke;
            n2 = -8355712;
            paint4.setColor(n2);
            paint4 = this.rect;
            f = this.round;
            paint = this.paintStroke;
            canvas.drawRoundRect((RectF)paint4, f, f, paint);
        }
    }

    public void updateRect(float f) {
        float f2 = this.mScaleFactor;
        float f3 = f - f2;
        float f4 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
        if (f4 == false) {
            return;
        }
        RectF rectF = this.rect;
        float f5 = rectF.left;
        float f6 = this.mScaleFactor;
        rectF.left = f5 = f5 / f6 * f;
        rectF = this.rect;
        f5 = rectF.right;
        f6 = this.mScaleFactor;
        rectF.right = f5 = f5 / f6 * f;
        f2 = this.rect.left;
        this.setX(f2);
        f2 = this.rect.right;
        this.setRight(f2);
        this.mScaleFactor = f;
    }

    public abstract void updateStartTrim();

    public void visible(boolean bl) {
        this.visible = bl;
    }

    public boolean visible() {
        return this.visible;
    }
}

