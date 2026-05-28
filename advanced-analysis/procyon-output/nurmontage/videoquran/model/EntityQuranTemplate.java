// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EntityQuranTemplate implements Serializable
{
    private String aya;
    private float btm_x;
    private float btm_y;
    private int color;
    private int colorTrsl;
    private String complete_aya;
    private float end;
    private int endWord_index;
    private float factor_size;
    private float factor_sizeTrl;
    private String file;
    private String file_in;
    private String file_out;
    private float height;
    private String icon;
    private int indexNumber;
    private float left;
    private String name_font;
    private int number;
    private int preset;
    private MRectF rectF;
    private float right;
    private float scale;
    private float start;
    private int startWord_index;
    private Transition transition;
    private String translation;
    private String translation_complete;
    private float x;
    private float y;
    
    public EntityQuranTemplate(final Transition transition, final float start, final float end, final float btm_x, final float btm_y, final float left, final float right, final String aya, final String complete_aya, final String name_font, final int indexNumber, final int number, final int color, final int colorTrsl, final int preset) {
        this.icon = "hafes";
        final float factor_sizeTrl = 1.0f;
        this.scale = factor_sizeTrl;
        this.factor_size = factor_sizeTrl;
        this.factor_sizeTrl = factor_sizeTrl;
        this.aya = aya;
        this.colorTrsl = colorTrsl;
        this.preset = preset;
        this.complete_aya = complete_aya;
        this.transition = transition;
        this.start = start;
        this.color = color;
        this.end = end;
        this.name_font = name_font;
        this.number = number;
        this.indexNumber = indexNumber;
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
    
    public int getColor() {
        return this.color;
    }
    
    public int getColorTrsl() {
        return this.colorTrsl;
    }
    
    public String getComplete_aya() {
        return this.complete_aya;
    }
    
    public float getEnd() {
        return this.end;
    }
    
    public int getEndWord_index() {
        return this.endWord_index;
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
    
    public String getIcon() {
        return this.icon;
    }
    
    public int getIndexNumber() {
        return this.indexNumber;
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
    
    public int getStartWord_index() {
        return this.startWord_index;
    }
    
    public Transition getTransition() {
        return this.transition;
    }
    
    public String getTranslation() {
        return this.translation;
    }
    
    public String getTranslation_complete() {
        return this.translation_complete;
    }
    
    public float getX() {
        return this.x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setAya(final String aya) {
        this.aya = aya;
    }
    
    public void setColorTrsl(final int colorTrsl) {
        this.colorTrsl = colorTrsl;
    }
    
    public void setEnd(final float end) {
        this.end = end;
    }
    
    public void setEndWord_index(final int endWord_index) {
        this.endWord_index = endWord_index;
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
    
    public void setHeight(final float height) {
        this.height = height;
    }
    
    public void setIcon(final String icon) {
        this.icon = icon;
    }
    
    public void setIndexNumber(final int indexNumber) {
        this.indexNumber = indexNumber;
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
    
    public void setStartWord_index(final int startWord_index) {
        this.startWord_index = startWord_index;
    }
    
    public void setTransition(final Transition transition) {
        this.transition = transition;
    }
    
    public void setTranslation(final String translation) {
        this.translation = translation;
    }
    
    public void setTranslation_complete(final String translation_complete) {
        this.translation_complete = translation_complete;
    }
    
    public void setX(final float x) {
        this.x = x;
    }
    
    public void setY(final float y) {
        this.y = y;
    }
}
