// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EntityTranslationTemplate implements Serializable
{
    private String aya;
    private float btm_x;
    private float btm_y;
    private int clr_bg;
    private int color;
    private float end;
    private float factor_size;
    private float factor_sizeTrl;
    private String file;
    private String file_in;
    private String file_out;
    private float height;
    private boolean isHaveBg;
    private float left;
    private String name_font;
    private int number;
    private int preset;
    private MRectF rectF;
    private float right;
    private float scale;
    private float start;
    private Transition transition;
    private float x;
    private float y;
    
    public EntityTranslationTemplate(final Transition transition, final float start, final float end, final float btm_x, final float btm_y, final float left, final float right, final String aya, final String name_font, final int number, final int color, final int preset) {
        final float factor_sizeTrl = 1.0f;
        this.scale = factor_sizeTrl;
        this.factor_size = factor_sizeTrl;
        this.factor_sizeTrl = factor_sizeTrl;
        this.aya = aya;
        this.preset = preset;
        this.transition = transition;
        this.start = start;
        this.color = color;
        this.end = end;
        this.name_font = name_font;
        this.number = number;
        this.right = right;
        this.left = left;
        this.btm_x = btm_x;
        this.btm_y = btm_y;
    }
    
    public String getAya() {
        return this.aya;
    }
    
    public float getBtm_x() {
        return this.btm_x;
    }
    
    public float getBtm_y() {
        return this.btm_y;
    }
    
    public int getClr_bg() {
        return this.clr_bg;
    }
    
    public int getColor() {
        return this.color;
    }
    
    public float getEnd() {
        return this.end;
    }
    
    public float getFactor_size() {
        return this.factor_size;
    }
    
    public float getFactor_sizeTrl() {
        return this.factor_sizeTrl;
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
    
    public float getHeight() {
        return this.height;
    }
    
    public float getLeft() {
        return this.left;
    }
    
    public String getName_font() {
        return this.name_font;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public int getPreset() {
        return this.preset;
    }
    
    public MRectF getRectF() {
        return this.rectF;
    }
    
    public float getRight() {
        return this.right;
    }
    
    public float getScale() {
        return this.scale;
    }
    
    public float getStart() {
        return this.start;
    }
    
    public Transition getTransition() {
        return this.transition;
    }
    
    public float getX() {
        return this.x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public boolean isHaveBg() {
        return this.isHaveBg;
    }
    
    public void setAya(final String aya) {
        this.aya = aya;
    }
    
    public void setClr_bg(final int clr_bg) {
        this.clr_bg = clr_bg;
    }
    
    public void setEnd(final float end) {
        this.end = end;
    }
    
    public void setFactor_size(final float factor_size) {
        this.factor_size = factor_size;
    }
    
    public void setFactor_sizeTrl(final float factor_sizeTrl) {
        this.factor_sizeTrl = factor_sizeTrl;
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
    
    public void setHaveBg(final boolean isHaveBg) {
        this.isHaveBg = isHaveBg;
    }
    
    public void setHeight(final float height) {
        this.height = height;
    }
    
    public void setNumber(final int number) {
        this.number = number;
    }
    
    public void setPreset(final int preset) {
        this.preset = preset;
    }
    
    public void setRectF(final MRectF rectF) {
        this.rectF = rectF;
    }
    
    public void setScale(final float scale) {
        this.scale = scale;
    }
    
    public void setStart(final float start) {
        this.start = start;
    }
    
    public void setTransition(final Transition transition) {
        this.transition = transition;
    }
    
    public void setX(final float x) {
        this.x = x;
    }
    
    public void setY(final float y) {
        this.y = y;
    }
}
