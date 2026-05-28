package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EntitySurahTemplate implements Serializable {
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

    public void setRectF(MRectF mRectF) {
        this.rectF = mRectF;
    }

    public MRectF getRectF() {
        return this.rectF;
    }

    public void setStyle(int value) {
        this.style = value;
    }

    public void setIndex_surah(int value) {
        this.index_surah = value;
    }

    public int getIndex_surah() {
        return this.index_surah;
    }

    public int getStyle() {
        return this.style;
    }

    public void setPreset(int value) {
        this.preset = value;
    }

    public void setClr(int value) {
        this.clr = value;
    }

    public int getPreset() {
        return this.preset;
    }

    public int getClr() {
        return this.clr;
    }

    public void setName_font(String name) {
        this.name_font = name;
    }

    public String getName_font() {
        return this.name_font;
    }

    public float getFactor_scale() {
        return this.factor_scale;
    }

    public void setFactor_scale(float scale) {
        this.factor_scale = scale;
    }

    public int getClrBg() {
        return this.clrBg;
    }

    public void setClrBg(int value) {
        this.clrBg = value;
    }

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public void setHaveBg(boolean isFlag) {
        this.isHaveBg = isFlag;
    }

    public EntitySurahTemplate(String name, String str2, float scale, float floatValue2, MRectF mRectF, float floatValue3, String surahName3, int value, int i2, int i3, int i4, boolean isFlag, int value5) {
        this.name = name;
        this.clrBg = value5;
        this.isHaveBg = isFlag;
        this.style = i3;
        this.index_surah = i4;
        this.clr = value;
        this.preset = i2;
        this.reader = str2;
        this.left = scale;
        this.top = floatValue2;
        setRectF(mRectF);
        this.factor_scale = floatValue3;
        this.name_font = surahName3;
    }

    public void setPos(float scale, float floatValue2) {
        this.left = scale;
        this.top = floatValue2;
    }

    public float getLeft() {
        return this.left;
    }

    public float getTop() {
        return this.top;
    }

    public String getName() {
        return this.name;
    }

    public String getReader() {
        return this.reader;
    }

    public void setReader(String name) {
        this.reader = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
