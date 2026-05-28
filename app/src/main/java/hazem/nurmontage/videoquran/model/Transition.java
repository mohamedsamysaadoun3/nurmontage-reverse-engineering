package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Transition implements Serializable {
    private float duration_both;
    private float duration_in;
    private float duration_out;
    private float fromW;
    private boolean isBoth;
    private boolean isIn;
    private boolean isOut;
    private float offset_frame_in;
    private float offset_frame_out;
    private String type_both;
    private String type_in;
    private String type_out;

    public void setFromW(float floatValue) {
        this.fromW = floatValue;
    }

    public float getFromW() {
        return this.fromW;
    }

    public Transition() {
        this.duration_in = 1.5f;
        this.duration_out = 1.5f;
        this.duration_both = 0.1f;
        this.type_out = "none";
        this.type_both = "none";
        this.type_in = "none";
    }

    public Transition(String textValue, String str2, String textValue3, float floatValue, float f2, float floatValue3, boolean isFlag, boolean z2, boolean z3) {
        this.type_in = textValue;
        this.type_out = str2;
        this.type_both = textValue3;
        this.duration_in = floatValue;
        this.duration_out = f2;
        this.duration_both = floatValue3;
        this.isIn = isFlag;
        this.isOut = z2;
        this.isBoth = z3;
    }

    public void setOffset_frame_in(float floatValue) {
        this.offset_frame_in = floatValue;
    }

    public float getOffset_frame_out() {
        return this.offset_frame_out;
    }

    public float getOffset_frame_in() {
        return this.offset_frame_in;
    }

    public void setOffset_frame_out(float floatValue) {
        this.offset_frame_out = floatValue;
    }

    public boolean isIn() {
        return this.isIn;
    }

    public boolean isOut() {
        return this.isOut;
    }

    public void setIn(boolean isFlag) {
        this.isIn = isFlag;
    }

    public void setOut(boolean isFlag) {
        this.isOut = isFlag;
    }

    public void setBoth(boolean isFlag) {
        this.isBoth = isFlag;
    }

    public boolean isBoth() {
        return this.isBoth;
    }

    public float getDuration_both() {
        return this.duration_both;
    }

    public float getDuration_in() {
        return this.duration_in;
    }

    public float getDuration_out() {
        return this.duration_out;
    }

    public void setDuration_both(float floatValue) {
        this.duration_both = floatValue;
    }

    public void setDuration_in(float floatValue) {
        this.duration_in = floatValue;
    }

    public void setDuration_out(float floatValue) {
        this.duration_out = floatValue;
    }

    public void setType_in(String textValue) {
        this.type_in = textValue;
    }

    public void setType_both(String textValue) {
        this.type_both = textValue;
    }

    public void setType_out(String textValue) {
        this.type_out = textValue;
    }

    public String getType_both() {
        return this.type_both;
    }

    public String getType_in() {
        return this.type_in;
    }

    public String getType_out() {
        return this.type_out;
    }

    public Transition duplicate() {
        Transition transition = new Transition(getType_in(), getType_out(), getType_both(), getDuration_in(), getDuration_out(), getDuration_both(), isIn(), isOut(), isBoth());
        transition.setOffset_frame_in(getOffset_frame_in());
        transition.setOffset_frame_out(getOffset_frame_out());
        transition.setFromW(this.fromW);
        return transition;
    }
}
