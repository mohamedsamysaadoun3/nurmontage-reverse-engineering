package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EntityQuranTemplate implements Serializable {
    private String aya;
    private float btm_x;
    private float btm_y;
    private int color;
    private int colorTrsl;
    private String complete_aya;
    private float end;
    private int endWord_index;
    private String file;
    private String file_in;
    private String file_out;
    private float height;
    private int indexNumber;
    private float left;
    private String name_font;
    private int number;
    private int preset;
    private MRectF rectF;
    private float right;
    private float start;
    private int startWord_index;
    private Transition transition;
    private String translation;
    private String translation_complete;

    /* renamed from: x */
    private float f423x;

    /* renamed from: y */
    private float f424y;
    private String icon = "hafes";
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
        this.f423x = dimension;
    }

    public float getX() {
        return this.f423x;
    }

    public float getY() {
        return this.f424y;
    }

    public void setY(float dimension) {
        this.f424y = dimension;
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float dimension) {
        this.scale = dimension;
    }

    public void setStartWord_index(int position) {
        this.startWord_index = position;
    }

    public void setEndWord_index(int position) {
        this.endWord_index = position;
    }

    public int getStartWord_index() {
        return this.startWord_index;
    }

    public int getEndWord_index() {
        return this.endWord_index;
    }

    public int getPreset() {
        return this.preset;
    }

    public void setPreset(int position) {
        this.preset = position;
    }

    public int getColorTrsl() {
        return this.colorTrsl;
    }

    public void setColorTrsl(int position) {
        this.colorTrsl = position;
    }

    public void setTranslation_complete(String textValue) {
        this.translation_complete = textValue;
    }

    public void setTranslation(String textValue) {
        this.translation = textValue;
    }

    public String getTranslation() {
        return this.translation;
    }

    public String getTranslation_complete() {
        return this.translation_complete;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String textValue) {
        this.icon = textValue;
    }

    public String getComplete_aya() {
        return this.complete_aya;
    }

    public void setFile(String textValue) {
        this.file = textValue;
    }

    public void setFile_in(String textValue) {
        this.file_in = textValue;
    }

    public void setFile_out(String textValue) {
        this.file_out = textValue;
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

    public EntityQuranTemplate(Transition transition, float dimension, float xPosition, float xPosition35, float xPosition35, float xPosition35, float floatValue6, String textValue, String name, String textValue3, int position, int i2, int i3, int i4, int ayaNumber) {
        this.aya = textValue;
        this.colorTrsl = i4;
        this.preset = ayaNumber;
        this.complete_aya = name;
        this.transition = transition;
        this.start = dimension;
        this.color = i3;
        this.end = xPosition;
        this.name_font = textValue3;
        this.number = i2;
        this.indexNumber = position;
        this.right = floatValue6;
        this.left = xPosition35;
        this.btm_x = xPosition35;
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

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(int position) {
        this.indexNumber = position;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int position) {
        this.number = position;
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

    public void setAya(String textValue) {
        this.aya = textValue;
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
