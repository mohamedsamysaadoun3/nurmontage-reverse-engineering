// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.model.Transition;
import android.graphics.Rect;
import hazem.nurmontage.videoquran.model.QuranEntity;
import android.graphics.Paint;

public class EntityQuranTimeline extends Entity
{
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
    
    public EntityQuranTimeline(final QuranEntity quranEntity, float textSize, float n, float n2, final float n3, final float n4) {
        super(n4);
        this.h = n2;
        this.quranEntity = quranEntity;
        this.rect = new RectF(textSize, n, n3, n2);
        this.left = this.rect.left;
        this.right = this.rect.right;
        this.color = -5253382;
        (this.paintText = new Paint(1)).setStyle(Paint$Style.FILL);
        final Paint paintText = this.paintText;
        textSize = this.rect.height() * 0.27f;
        paintText.setTextSize(textSize);
        this.paintText.setTypeface(this.getQuranEntity().getPaintAya().getTypeface());
        this.paintText.setColor(-16441312);
        this.textBound = new Rect();
        this.paintText.getTextBounds(this.quranEntity.getTxt(), 0, this.quranEntity.getTxt().length(), this.textBound);
        final float top = this.rect.top;
        textSize = this.rect.height();
        n = 0.5f;
        textSize *= n;
        final float n5 = top + textSize;
        textSize = this.textBound.height() * n;
        this.centerY = n5 + textSize;
        textSize = 0.46f * n2;
        this.rectFLeft = new RectF(0.0f, 0.0f, textSize, n2);
        textSize = this.rectFLeft.width();
        this.rectFRight = new RectF(0.0f, 0.0f, textSize, n2);
        this.round = this.rectFRight.width() * n;
        n2 *= 0.07f;
        this.padding = n2;
    }
    
    @Override
    public boolean contains(final PointF pointF) {
        if (this.isSelect) {
            this.onTouch(pointF);
        }
        return this.isSelect = this.rect.contains(pointF.x, pointF.y);
    }
    
    @Override
    public void draw(final Canvas canvas) {
        canvas.drawText(this.quranEntity.getTxt().replace("\u0646\u0635", "..."), this.round + this.rect.left, this.centerY, this.paintText);
    }
    
    @Override
    public void draw(final Canvas canvas, final int n, final int n2) {
        canvas.drawText(this.quranEntity.getTxt().replace("\u0646\u0635", "..."), this.round + this.rect.left, this.centerY, this.paintText);
    }
    
    @Override
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
    
    @Override
    public float getH() {
        return this.h;
    }
    
    @Override
    public float getLeft() {
        return this.left;
    }
    
    public QuranEntity getQuranEntity() {
        return this.quranEntity;
    }
    
    @Override
    public RectF getRect() {
        return this.rect;
    }
    
    @Override
    public float getRight() {
        return this.right;
    }
    
    @Override
    public RectF getSelectTrim() {
        return this.selectTrim;
    }
    
    public Transition getTransition() {
        return this.transition;
    }
    
    @Override
    public int getTrim_type() {
        return this.trim_type;
    }
    
    @Override
    public boolean onTouch(final PointF pointF) {
        this.selectTrim = null;
        this.downX = pointF.x;
        this.trim_type = -1;
        final boolean contains = this.rectFLeft.contains(pointF.x, pointF.y);
        final boolean isSelect = true;
        if (contains) {
            this.selectTrim = this.rectFLeft;
            this.trim_type = 0;
            this.isSelect = isSelect;
        }
        else if (this.rectFRight.contains(pointF.x, pointF.y)) {
            this.selectTrim = this.rectFRight;
            this.trim_type = (isSelect ? 1 : 0);
            this.isSelect = isSelect;
        }
        return isSelect;
    }
    
    @Override
    public void onUpLeft() {
        this.left = this.lastLeft;
    }
    
    @Override
    public void onUpRight() {
        this.right = this.lastRight;
    }
    
    @Override
    public void setDownX(final float downX) {
        this.downX = downX;
    }
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    public void setFile_in(final String file_in) {
        this.file_in = file_in;
    }
    
    public void setFile_out(final String file_out) {
        this.file_out = file_out;
    }
    
    @Override
    public void setLastLeft(final float lastLeft) {
        this.lastLeft = lastLeft;
    }
    
    @Override
    public void setLastRight(final float lastRight) {
        this.lastRight = lastRight;
    }
    
    @Override
    public void setRight(final float n) {
        this.right = n;
        this.rect.right = n;
    }
    
    @Override
    public void setSelect(final boolean isSelect) {
        this.isSelect = isSelect;
    }
    
    public void setTransition(final Transition transition) {
        this.transition = transition;
    }
    
    @Override
    public void setX(float n) {
        if (n < 0.0f) {
            n = 0.0f;
        }
        this.rect.left = n;
        this.left = n;
    }
    
    @Override
    public void setY(float top) {
        this.rect.top = top;
        this.rect.bottom = this.h + this.rect.top;
        top = this.rect.top;
        final float height = this.rect.height();
        final float n = 0.5f;
        top += height * n;
        top += this.textBound.height() * n;
        this.centerY = top;
    }
    
    @Override
    public void updateStartTrim() {
    }
}
