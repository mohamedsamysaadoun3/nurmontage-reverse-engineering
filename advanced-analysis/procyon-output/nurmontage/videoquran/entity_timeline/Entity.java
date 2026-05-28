// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Paint$Style;
import java.util.Stack;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.constant.EntityAction;
import java.util.List;
import hazem.nurmontage.videoquran.common.StackEntity;

public abstract class Entity
{
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
    private float mScaleFactor;
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
    
    public Entity(final float second_in_screen) {
        this.mScaleFactor = 1.0f;
        this.undoRect = new Stack();
        this.rectList = new Stack();
        this.trim_type = -1;
        this.color_select_multiple = -409555;
        this.second_in_screen = second_in_screen;
        this.entityAction = EntityAction.ADD;
        final boolean visible = true;
        this.visible = visible;
        final Paint paintStroke = new Paint((int)(visible ? 1 : 0));
        (this.paintStroke = paintStroke).setColor(this.color_select_multiple);
        paintStroke.setStyle(Paint$Style.STROKE);
        this.paint = new Paint((int)(visible ? 1 : 0));
    }
    
    public abstract boolean contains(final PointF p0);
    
    public abstract void draw(final Canvas p0);
    
    public abstract void draw(final Canvas p0, final int p1, final int p2);
    
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
        final StackEntity currentStackEntity = this.currentStackEntity;
        if (currentStackEntity == null) {
            return;
        }
        this.rectList.push(currentStackEntity);
        this.rectList.push(new StackEntity(new RectF(this.rect.left / this.getmScaleFactor(), this.rect.top / this.getmScaleFactor(), this.rect.right / this.getmScaleFactor(), this.rect.bottom / this.getmScaleFactor()), this.offset, this.end, this.start, this.left, this.right, this.max, this.getOffset_right(), this.getOffset_left()));
        this.currentStackEntity = null;
    }
    
    public abstract boolean onTouch(final PointF p0);
    
    public abstract void onUpLeft();
    
    public abstract void onUpRight();
    
    public void redo() {
        try {
            final Stack undoRect = this.undoRect;
            try {
                if (undoRect.isEmpty()) {
                    return;
                }
                final Stack undoRect2 = this.undoRect;
                try {
                    final Object pop = undoRect2.pop();
                    try {
                        final StackEntity item = (StackEntity)pop;
                        try {
                            final Stack undoRect3 = this.undoRect;
                            try {
                                final Object pop2 = undoRect3.pop();
                                try {
                                    final StackEntity item2 = (StackEntity)pop2;
                                    try {
                                        this.rectList.push(item);
                                        this.rectList.push(item2);
                                        this.offset_left = item2.getOffset_left();
                                        this.offset_right = item2.getOffset_right();
                                        try {
                                            final RectF rectF = item2.getRectF();
                                            try {
                                                final float left = rectF.left;
                                                try {
                                                    final float n = left * this.getmScaleFactor();
                                                    final RectF rectF2 = item2.getRectF();
                                                    try {
                                                        final float top = rectF2.top;
                                                        try {
                                                            final float n2 = top * this.getmScaleFactor();
                                                            final RectF rectF3 = item2.getRectF();
                                                            try {
                                                                final float right = rectF3.right;
                                                                try {
                                                                    final float n3 = right * this.getmScaleFactor();
                                                                    final RectF rectF4 = item2.getRectF();
                                                                    try {
                                                                        final float bottom = rectF4.bottom;
                                                                        try {
                                                                            final RectF rect = new RectF(n, n2, n3, bottom * this.getmScaleFactor());
                                                                            try {
                                                                                this.rect = rect;
                                                                                this.offset = item2.getOffset();
                                                                                this.end = item2.getEnd();
                                                                                this.start = item2.getStart();
                                                                                this.right = item2.getRight();
                                                                                this.left = item2.getLeft();
                                                                                this.max = item2.getMax();
                                                                            }
                                                                            catch (final Exception ex) {}
                                                                        }
                                                                        catch (final Exception ex2) {}
                                                                    }
                                                                    catch (final Exception ex3) {}
                                                                }
                                                                catch (final Exception ex4) {}
                                                            }
                                                            catch (final Exception ex5) {}
                                                        }
                                                        catch (final Exception ex6) {}
                                                    }
                                                    catch (final Exception ex7) {}
                                                }
                                                catch (final Exception ex8) {}
                                            }
                                            catch (final Exception ex9) {}
                                        }
                                        catch (final Exception ex10) {}
                                    }
                                    catch (final Exception ex11) {}
                                }
                                catch (final Exception ex12) {}
                            }
                            catch (final Exception ex13) {}
                        }
                        catch (final Exception ex14) {}
                    }
                    catch (final Exception ex15) {}
                }
                catch (final Exception ex16) {}
            }
            catch (final Exception ex17) {}
        }
        catch (final Exception ex18) {}
    }
    
    public void release() {
    }
    
    public void resetTrim_type() {
        this.trim_type = -1;
    }
    
    public void setAudio_id(final String audio_id) {
        this.audio_id = audio_id;
    }
    
    public void setColor_select_multiple(final int color_select_multiple) {
        this.color_select_multiple = color_select_multiple;
    }
    
    public void setCurrentRect() {
        if (this.currentStackEntity != null) {
            return;
        }
        this.currentStackEntity = new StackEntity(new RectF(this.rect.left / this.getmScaleFactor(), this.rect.top / this.getmScaleFactor(), this.rect.right / this.getmScaleFactor(), this.rect.bottom / this.getmScaleFactor()), this.offset, this.end, this.start, this.left, this.right, this.max, this.getOffset_right(), this.getOffset_left());
    }
    
    public abstract void setDownX(final float p0);
    
    public void setEntitiesGroup(final List entitiesGroup) {
        this.entitiesGroup = entitiesGroup;
    }
    
    public void setEntityAction(final EntityAction entityAction) {
        this.entityAction = entityAction;
    }
    
    public void setEntityView(final EntityView entityView) {
        this.entityView = entityView;
    }
    
    public void setFade_in(final float fade_in) {
        this.fade_in = fade_in;
    }
    
    public void setFade_out(final float fade_out) {
        this.fade_out = fade_out;
    }
    
    public void setFrame_id(final String frame_id) {
        this.frame_id = frame_id;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public abstract void setLastLeft(final float p0);
    
    public abstract void setLastRight(final float p0);
    
    public void setOffset(final float offset) {
        this.offset = offset;
    }
    
    public void setOffset_left(final float offset_left) {
        this.offset_left = offset_left;
    }
    
    public void setOffset_right(final float offset_right) {
        this.offset_right = offset_right;
    }
    
    public void setOnTapTime(final float onTapTime, final float onDown) {
        this.onTapTime = onTapTime;
        this.onDown = onDown;
    }
    
    public abstract void setRight(final float p0);
    
    public void setSecond_in_screen(final float second_in_screen) {
        this.second_in_screen = second_in_screen;
    }
    
    public abstract void setSelect(final boolean p0);
    
    public void setSelectMultiple(final boolean isSelectMultiple) {
        this.isSelectMultiple = isSelectMultiple;
    }
    
    public void setSplit(final boolean isSplit) {
        this.isSplit = isSplit;
    }
    
    public void setTrimLeft(final boolean isTrimLeft) {
        this.isTrimLeft = isTrimLeft;
    }
    
    public void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    public abstract void setX(final float p0);
    
    public abstract void setY(final float p0);
    
    public void setmScaleFactor(final float mScaleFactor) {
        this.mScaleFactor = mScaleFactor;
    }
    
    public void undo() {
        try {
            final Stack rectList = this.rectList;
            try {
                if (rectList.isEmpty()) {
                    return;
                }
                final Stack rectList2 = this.rectList;
                try {
                    final Object pop = rectList2.pop();
                    try {
                        final StackEntity item = (StackEntity)pop;
                        try {
                            final Stack rectList3 = this.rectList;
                            try {
                                final Object pop2 = rectList3.pop();
                                try {
                                    final StackEntity item2 = (StackEntity)pop2;
                                    try {
                                        this.undoRect.push(item);
                                        this.undoRect.push(item2);
                                        this.offset_left = item2.getOffset_left();
                                        this.offset_right = item2.getOffset_right();
                                        try {
                                            final RectF rectF = item2.getRectF();
                                            try {
                                                final float left = rectF.left;
                                                try {
                                                    final float n = left * this.getmScaleFactor();
                                                    final RectF rectF2 = item2.getRectF();
                                                    try {
                                                        final float top = rectF2.top;
                                                        try {
                                                            final float n2 = top * this.getmScaleFactor();
                                                            final RectF rectF3 = item2.getRectF();
                                                            try {
                                                                final float right = rectF3.right;
                                                                try {
                                                                    final float n3 = right * this.getmScaleFactor();
                                                                    final RectF rectF4 = item2.getRectF();
                                                                    try {
                                                                        final float bottom = rectF4.bottom;
                                                                        try {
                                                                            final RectF rect = new RectF(n, n2, n3, bottom * this.getmScaleFactor());
                                                                            try {
                                                                                this.rect = rect;
                                                                                this.offset = item2.getOffset();
                                                                                this.end = item2.getEnd();
                                                                                this.start = item2.getStart();
                                                                                this.right = item2.getRight();
                                                                                this.left = item2.getLeft();
                                                                                this.max = item2.getMax();
                                                                            }
                                                                            catch (final Exception ex) {}
                                                                        }
                                                                        catch (final Exception ex2) {}
                                                                    }
                                                                    catch (final Exception ex3) {}
                                                                }
                                                                catch (final Exception ex4) {}
                                                            }
                                                            catch (final Exception ex5) {}
                                                        }
                                                        catch (final Exception ex6) {}
                                                    }
                                                    catch (final Exception ex7) {}
                                                }
                                                catch (final Exception ex8) {}
                                            }
                                            catch (final Exception ex9) {}
                                        }
                                        catch (final Exception ex10) {}
                                    }
                                    catch (final Exception ex11) {}
                                }
                                catch (final Exception ex12) {}
                            }
                            catch (final Exception ex13) {}
                        }
                        catch (final Exception ex14) {}
                    }
                    catch (final Exception ex15) {}
                }
                catch (final Exception ex16) {}
            }
            catch (final Exception ex17) {}
        }
        catch (final Exception ex18) {}
    }
    
    public void update(final Canvas canvas) {
        this.paint.setColor(this.color);
        if (!this.isVideo) {
            final RectF rect = this.rect;
            final float round = this.round;
            canvas.drawRoundRect(rect, round, round, this.paint);
            canvas.save();
            canvas.clipRect(this.rect);
            this.draw(canvas);
            canvas.restore();
        }
        else {
            canvas.save();
            this.path.reset();
            final Path path = this.path;
            final RectF rect2 = this.rect;
            final float round2 = this.round;
            path.addRoundRect(rect2, round2, round2, Path$Direction.CW);
            canvas.clipPath(this.path);
            this.draw(canvas);
            canvas.restore();
        }
        if (!this.isSelect) {
            if (this.isVideo) {
                this.paintStroke.setStrokeWidth(this.rect.height() * 0.025f);
                this.paintStroke.setColor(-8355712);
                final RectF rect3 = this.rect;
                final float round3 = this.round;
                canvas.drawRoundRect(rect3, round3, round3, this.paintStroke);
            }
            return;
        }
        this.paintStroke.setStrokeWidth(this.rect.height() * 0.05f);
        this.paintStroke.setColor(this.color_select_multiple);
        final RectF rect4 = this.rect;
        final float round4 = this.round;
        canvas.drawRoundRect(rect4, round4, round4, this.paintStroke);
        this.paint.setColor(this.color_select_multiple);
        if (this.getTrim_type() == 0) {
            this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
            this.rectFLeft.right = this.rect.left;
            this.rectFLeft.top = this.rect.top + this.padding;
            this.rectFLeft.bottom = this.rect.bottom - this.padding;
            final RectF rectFLeft = this.rectFLeft;
            final float round5 = this.round;
            canvas.drawRoundRect(rectFLeft, round5, round5, this.paint);
            return;
        }
        if (this.getTrim_type() == 1) {
            this.rectFRight.right = this.rect.right + this.rectFRight.width();
            this.rectFRight.left = this.rect.right;
            this.rectFRight.top = this.rect.top + this.padding;
            this.rectFRight.bottom = this.rect.bottom - this.padding;
            final RectF rectFRight = this.rectFRight;
            final float round6 = this.round;
            canvas.drawRoundRect(rectFRight, round6, round6, this.paint);
            return;
        }
        if (!this.isSelectMultiple) {
            this.rectFRight.right = this.rect.right + this.rectFRight.width();
            this.rectFRight.left = this.rect.right;
            this.rectFRight.top = this.rect.top + this.padding;
            this.rectFRight.bottom = this.rect.bottom - this.padding;
            this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
            this.rectFLeft.right = this.rect.left;
            this.rectFLeft.top = this.rect.top + this.padding;
            this.rectFLeft.bottom = this.rect.bottom - this.padding;
            final RectF rectFLeft2 = this.rectFLeft;
            final float round7 = this.round;
            canvas.drawRoundRect(rectFLeft2, round7, round7, this.paint);
            final RectF rectFRight2 = this.rectFRight;
            final float round8 = this.round;
            canvas.drawRoundRect(rectFRight2, round8, round8, this.paint);
        }
    }
    
    public void update(final Canvas canvas, int n, int color) {
        this.paint.setColor(this.color);
        if (!this.isVideo) {
            final RectF rect = this.rect;
            final float round = this.round;
            canvas.drawRoundRect(rect, round, round, this.paint);
            canvas.save();
            canvas.clipRect(this.rect);
            this.draw(canvas, n, color);
            canvas.restore();
        }
        else {
            canvas.save();
            this.path.reset();
            final Path path = this.path;
            final RectF rect2 = this.rect;
            final float round2 = this.round;
            path.addRoundRect(rect2, round2, round2, Path$Direction.CW);
            canvas.clipPath(this.path);
            this.draw(canvas, n, color);
            canvas.restore();
        }
        n = (this.isSelect ? 1 : 0);
        if (n != 0) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.05f);
            final Paint paint = this.paint;
            color = this.color_select_multiple;
            paint.setColor(color);
            final Paint paintStroke = this.paintStroke;
            color = this.color_select_multiple;
            paintStroke.setColor(color);
            n = this.getTrim_type();
            if (n == 0) {
                this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
                this.rectFLeft.right = this.rect.left;
                this.rectFLeft.top = this.rect.top + this.padding;
                this.rectFLeft.bottom = this.rect.bottom - this.padding;
                final RectF rectFLeft = this.rectFLeft;
                final float round3 = this.round;
                canvas.drawRoundRect(rectFLeft, round3, round3, this.paint);
            }
            else {
                n = this.getTrim_type();
                color = 1;
                if (n == color) {
                    this.rectFRight.right = this.rect.right + this.rectFRight.width();
                    this.rectFRight.left = this.rect.right;
                    this.rectFRight.top = this.rect.top + this.padding;
                    this.rectFRight.bottom = this.rect.bottom - this.padding;
                    final RectF rectFRight = this.rectFRight;
                    final float round4 = this.round;
                    canvas.drawRoundRect(rectFRight, round4, round4, this.paint);
                }
                else {
                    n = (this.isSelectMultiple() ? 1 : 0);
                    if (n == 0) {
                        this.rectFRight.right = this.rect.right + this.rectFRight.width();
                        this.rectFRight.left = this.rect.right;
                        this.rectFRight.top = this.rect.top + this.padding;
                        this.rectFRight.bottom = this.rect.bottom - this.padding;
                        this.rectFLeft.left = this.rect.left - this.rectFLeft.width();
                        this.rectFLeft.right = this.rect.left;
                        this.rectFLeft.top = this.rect.top + this.padding;
                        this.rectFLeft.bottom = this.rect.bottom - this.padding;
                        final RectF rectFLeft2 = this.rectFLeft;
                        final float round5 = this.round;
                        canvas.drawRoundRect(rectFLeft2, round5, round5, this.paint);
                        final RectF rectFRight2 = this.rectFRight;
                        final float round6 = this.round;
                        canvas.drawRoundRect(rectFRight2, round6, round6, this.paint);
                    }
                }
            }
            final RectF rect3 = this.rect;
            final float round7 = this.round;
            canvas.drawRoundRect(rect3, round7, round7, this.paintStroke);
            return;
        }
        n = (this.isVideo ? 1 : 0);
        if (n != 0) {
            this.paintStroke.setStrokeWidth(this.rect.height() * 0.025f);
            final Paint paintStroke2 = this.paintStroke;
            color = -8355712;
            paintStroke2.setColor(color);
            final RectF rect4 = this.rect;
            final float round8 = this.round;
            canvas.drawRoundRect(rect4, round8, round8, this.paintStroke);
        }
    }
    
    public void updateRect(final float mScaleFactor) {
        if (mScaleFactor == this.mScaleFactor) {
            return;
        }
        final RectF rect = this.rect;
        rect.left = rect.left / this.mScaleFactor * mScaleFactor;
        final RectF rect2 = this.rect;
        rect2.right = rect2.right / this.mScaleFactor * mScaleFactor;
        this.setX(this.rect.left);
        this.setRight(this.rect.right);
        this.mScaleFactor = mScaleFactor;
    }
    
    public abstract void updateStartTrim();
    
    public void visible(final boolean visible) {
        this.visible = visible;
    }
    
    public boolean visible() {
        return this.visible;
    }
}
