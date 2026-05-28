package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EntityTranslationTemplate implements Serializable {
    private String aya;
    private float btm_x;
    private float btm_y;
    private int clr_bg;
    private int color;
    private float end;
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
    private float start;
    private Transition transition;

    /* renamed from: x */
    private float f425x;

    /* renamed from: y */
    private float f426y;
    private float scale = 1.0f;
    private float factor_size = 1.0f;
    private float factor_sizeTrl = 1.0f;

    public void setRectF(MRectF mRectF) {
        this.rectF = mRectF;
    }

    public MRectF getRectF() {
        return this.rectF;
    }

    public float getFactor_sizeTrl() {
        return this.factor_sizeTrl;
    }

    public void setHeight(float dimension) {
        this.height = dimension;
    }

    public float getHeight() {
        return this.height;
    }

    public void setFactor_sizeTrl(float dimension) {
        this.factor_sizeTrl = dimension;
    }

    public float getFactor_size() {
        return this.factor_size;
    }

    public void setFactor_size(float dimension) {
        this.factor_size = dimension;
    }

    public void setX(float dimension) {
        this.f425x = dimension;
    }

    public float getX() {
        return this.f425x;
    }

    public float getY() {
        return this.f426y;
    }

    public void setY(float dimension) {
        this.f426y = dimension;
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float dimension) {
        this.scale = dimension;
    }

    public int getPreset() {
        return this.preset;
    }

    public void setPreset(int value) {
        this.preset = value;
    }

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public void setHaveBg(boolean isFlag) {
        this.isHaveBg = isFlag;
    }

    public void setClr_bg(int value) {
        this.clr_bg = value;
    }

    public int getClr_bg() {
        return this.clr_bg;
    }

    public void setFile(String filePath) {
        this.file = filePath;
    }

    public void setFile_in(String filePath) {
        this.file_in = filePath;
    }

    public void setFile_out(String filePath) {
        this.file_out = filePath;
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

    public EntityTranslationTemplate(Transition transition, float dimension, float f2, float f3, float f4, float f5, float floatValue6, String filePath, String textValue2, int value, int i2, int value3) {
        this.aya = filePath;
        this.preset = value3;
        this.transition = transition;
        this.start = dimension;
        this.color = i2;
        this.end = f2;
        this.name_font = textValue2;
        this.number = value;
        this.right = floatValue6;
        this.left = f5;
        this.btm_x = f3;
        this.btm_y = f4;
    }

    public Transition getTransition() {
        return this.transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public String getName_font() {
        return this.name_font;
    }

    public int getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int value) {
        this.number = value;
    }

    public float getLeft() {
        return this.left;
    }

    public float getBtm_x() {
        return this.btm_x;
    }

    public float getBtm_y() {
        return this.btm_y;
    }

    public float getRight() {
        return this.right;
    }

    public void setAya(String filePath) {
        this.aya = filePath;
    }

    public void setEnd(float dimension) {
        this.end = dimension;
    }

    public void setStart(float dimension) {
        this.start = dimension;
    }

    public float getEnd() {
        return this.end;
    }

    public float getStart() {
        return this.start;
    }

    public String getAya() {
        return this.aya;
    }
}
