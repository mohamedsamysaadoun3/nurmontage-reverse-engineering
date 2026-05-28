/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.MRectF;
import hazem.nurmontage.videoquran.model.Transition;
import java.io.Serializable;

public class EntityQuranTemplate
implements Serializable {
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
    private String icon = "hafes";
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

    public EntityQuranTemplate(Transition transition, float f, float f2, float f3, float f4, float f5, float f6, String string2, String string3, String string4, int n, int n2, int n3, int n4, int n5) {
        float f7;
        this.scale = f7 = 1.0f;
        this.factor_size = f7;
        this.factor_sizeTrl = f7;
        this.aya = string2;
        this.colorTrsl = n4;
        this.preset = n5;
        this.complete_aya = string3;
        this.transition = transition;
        f7 = f;
        this.start = f;
        this.color = n3;
        f7 = f2;
        this.end = f2;
        this.name_font = string4;
        this.number = n2;
        this.indexNumber = n;
        f7 = f6;
        this.right = f6;
        f7 = f5;
        this.left = f5;
        f7 = f3;
        this.btm_x = f3;
        f7 = f4;
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

    public void setAya(String string2) {
        this.aya = string2;
    }

    public void setColorTrsl(int n) {
        this.colorTrsl = n;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setEndWord_index(int n) {
        this.endWord_index = n;
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

    public void setHeight(float f) {
        this.height = f;
    }

    public void setIcon(String string2) {
        this.icon = string2;
    }

    public void setIndexNumber(int n) {
        this.indexNumber = n;
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

    public void setStartWord_index(int n) {
        this.startWord_index = n;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public void setTranslation(String string2) {
        this.translation = string2;
    }

    public void setTranslation_complete(String string2) {
        this.translation_complete = string2;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }
}

