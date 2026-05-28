/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.MRectF;
import hazem.nurmontage.videoquran.model.Transition;
import java.io.Serializable;

public class EntityTranslationTemplate
implements Serializable {
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

    public EntityTranslationTemplate(Transition transition, float f, float f2, float f3, float f4, float f5, float f6, String string2, String string3, int n, int n2, int n3) {
        float f7;
        this.scale = f7 = 1.0f;
        this.factor_size = f7;
        this.factor_sizeTrl = f7;
        this.aya = string2;
        this.preset = n3;
        this.transition = transition;
        this.start = f;
        this.color = n2;
        this.end = f2;
        this.name_font = string3;
        this.number = n;
        this.right = f6;
        this.left = f5;
        this.btm_x = f3;
        this.btm_y = f4;
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

    public void setAya(String string2) {
        this.aya = string2;
    }

    public void setClr_bg(int n) {
        this.clr_bg = n;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setFactor_size(float f) {
        this.factor_size = f;
    }

    public void setFactor_sizeTrl(float f) {
        this.factor_sizeTrl = f;
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

    public void setHaveBg(boolean bl) {
        this.isHaveBg = bl;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void setPreset(int n) {
        this.preset = n;
    }

    public void setRectF(MRectF mRectF) {
        this.rectF = mRectF;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void setStart(float f) {
        this.start = f;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }
}

