/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.MRectF;
import hazem.nurmontage.videoquran.model.Transition;
import java.io.Serializable;

public class EntityBismilahTemplate
implements Serializable {
    private String aya;
    private float btm_x;
    private float btm_y;
    private int color;
    private float end;
    private float factor_size;
    private String file;
    private String file_in;
    private String file_out;
    private float height;
    private float left;
    private int preset;
    private MRectF rectF;
    private float right;
    private float scale;
    private float start;
    private Transition transition;
    private float x;
    private float y;

    public EntityBismilahTemplate(Transition transition, float f, float f2, float f3, float f4, float f5, float f6, String string2, int n, int n2) {
        float f7;
        this.scale = f7 = 1.0f;
        this.factor_size = f7;
        this.aya = string2;
        this.preset = n2;
        this.transition = transition;
        this.start = f;
        this.color = n;
        this.end = f2;
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

    public int getColor() {
        return this.color;
    }

    public float getEnd() {
        return this.end;
    }

    public float getFactor_size() {
        return this.factor_size;
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

    public void setAya(String string2) {
        this.aya = string2;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setFactor_size(float f) {
        this.factor_size = f;
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

    public void setHeight(float f) {
        this.height = f;
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

