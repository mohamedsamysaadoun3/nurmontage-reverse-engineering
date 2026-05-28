/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.MRectF;
import java.io.Serializable;

public class EntitySurahTemplate
implements Serializable {
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

    public EntitySurahTemplate(String string2, String string3, float f, float f2, MRectF mRectF, float f3, String string4, int n, int n2, int n3, int n4, boolean bl, int n5) {
        this.name = string2;
        this.clrBg = n5;
        this.isHaveBg = bl;
        this.style = n3;
        this.index_surah = n4;
        this.clr = n;
        this.preset = n2;
        this.reader = string3;
        this.left = f;
        this.top = f2;
        this.setRectF(mRectF);
        this.factor_scale = f3;
        this.name_font = string4;
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

    public void setClr(int n) {
        this.clr = n;
    }

    public void setClrBg(int n) {
        this.clrBg = n;
    }

    public void setFactor_scale(float f) {
        this.factor_scale = f;
    }

    public void setHaveBg(boolean bl) {
        this.isHaveBg = bl;
    }

    public void setIndex_surah(int n) {
        this.index_surah = n;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setName_font(String string2) {
        this.name_font = string2;
    }

    public void setPos(float f, float f2) {
        this.left = f;
        this.top = f2;
    }

    public void setPreset(int n) {
        this.preset = n;
    }

    public void setReader(String string2) {
        this.reader = string2;
    }

    public void setRectF(MRectF mRectF) {
        this.rectF = mRectF;
    }

    public void setStyle(int n) {
        this.style = n;
    }
}

