// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EntitySurahTemplate implements Serializable
{
    private int clr;
    private int clrBg;
    private float factor_scale;
    private int index_surah;
    private boolean isHaveBg;
    private float left;
    private String name;
    private String name_font;
    private int preset;
    private String reader;
    private MRectF rectF;
    private int style;
    private float top;
    
    public EntitySurahTemplate(final String name, final String reader, final float left, final float top, final MRectF rectF, final float factor_scale, final String name_font, final int clr, final int preset, final int style, final int index_surah, final boolean isHaveBg, final int clrBg) {
        this.name = name;
        this.clrBg = clrBg;
        this.isHaveBg = isHaveBg;
        this.style = style;
        this.index_surah = index_surah;
        this.clr = clr;
        this.preset = preset;
        this.reader = reader;
        this.left = left;
        this.top = top;
        this.setRectF(rectF);
        this.factor_scale = factor_scale;
        this.name_font = name_font;
    }
    
    public int getClr() {
        return this.clr;
    }
    
    public int getClrBg() {
        return this.clrBg;
    }
    
    public float getFactor_scale() {
        return this.factor_scale;
    }
    
    public int getIndex_surah() {
        return this.index_surah;
    }
    
    public float getLeft() {
        return this.left;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getName_font() {
        return this.name_font;
    }
    
    public int getPreset() {
        return this.preset;
    }
    
    public String getReader() {
        return this.reader;
    }
    
    public MRectF getRectF() {
        return this.rectF;
    }
    
    public int getStyle() {
        return this.style;
    }
    
    public float getTop() {
        return this.top;
    }
    
    public boolean isHaveBg() {
        return this.isHaveBg;
    }
    
    public void setClr(final int clr) {
        this.clr = clr;
    }
    
    public void setClrBg(final int clrBg) {
        this.clrBg = clrBg;
    }
    
    public void setFactor_scale(final float factor_scale) {
        this.factor_scale = factor_scale;
    }
    
    public void setHaveBg(final boolean isHaveBg) {
        this.isHaveBg = isHaveBg;
    }
    
    public void setIndex_surah(final int index_surah) {
        this.index_surah = index_surah;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setName_font(final String name_font) {
        this.name_font = name_font;
    }
    
    public void setPos(final float left, final float top) {
        this.left = left;
        this.top = top;
    }
    
    public void setPreset(final int preset) {
        this.preset = preset;
    }
    
    public void setReader(final String reader) {
        this.reader = reader;
    }
    
    public void setRectF(final MRectF rectF) {
        this.rectF = rectF;
    }
    
    public void setStyle(final int style) {
        this.style = style;
    }
}
