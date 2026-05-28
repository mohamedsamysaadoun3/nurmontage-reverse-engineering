package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EntityBismilahTemplate implements Serializable {
    private String aya;
    private float btm_x;
    private float btm_y;
    private int color;
    private float end;
    private String file;
    private String file_in;
    private String file_out;
    private float height;
    private float left;
    private int preset;
    private MRectF rectF;
    private float right;
    private float start;
    private Transition transition;

    /* renamed from: x */
    private float f417x;

    /* renamed from: y */
    private float f418y;
    private float scale = 1.0f;
    private float factor_size = 1.0f;

    public void setRectF(MRectF mRectF) {
        this.rectF = mRectF;
    }

    public MRectF getRectF() {
        return this.rectF;
    }

    public void setHeight(float dimension) {
        this.height = dimension;
    }

    public float getHeight() {
        return this.height;
    }

    public float getFactor_size() {
        return this.factor_size;
    }

    public void setFactor_size(float dimension) {
        this.factor_size = dimension;
    }

    public void setX(float dimension) {
        this.f417x = dimension;
    }

    public float getX() {
        return this.f417x;
    }

    public float getY() {
        return this.f418y;
    }

    public void setY(float dimension) {
        this.f418y = dimension;
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

    public EntityBismilahTemplate(Transition transition, float dimension, float f2, float f3, float f4, float f5, float floatValue6, String filePath, int value, int value2) {
        this.aya = filePath;
        this.preset = value2;
        this.transition = transition;
        this.start = dimension;
        this.color = value;
        this.end = f2;
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

    public int getColor() {
        return this.color;
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
