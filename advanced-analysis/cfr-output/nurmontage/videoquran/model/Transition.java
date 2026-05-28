/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class Transition
implements Serializable {
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

    public Transition() {
        String string2;
        float f;
        this.duration_in = f = 1.5f;
        this.duration_out = f;
        this.duration_both = 0.1f;
        this.type_out = string2 = "none";
        this.type_both = string2;
        this.type_in = string2;
    }

    public Transition(String string2, String string3, String string4, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3) {
        this.type_in = string2;
        this.type_out = string3;
        this.type_both = string4;
        this.duration_in = f;
        this.duration_out = f2;
        this.duration_both = f3;
        this.isIn = bl;
        this.isOut = bl2;
        this.isBoth = bl3;
    }

    public Transition duplicate() {
        String string2 = this.getType_in();
        String string3 = this.getType_out();
        String string4 = this.getType_both();
        float f = this.getDuration_in();
        float f2 = this.getDuration_out();
        float f3 = this.getDuration_both();
        boolean bl = this.isIn();
        boolean bl2 = this.isOut();
        boolean bl3 = this.isBoth();
        Transition transition = new Transition(string2, string3, string4, f, f2, f3, bl, bl2, bl3);
        float f4 = this.getOffset_frame_in();
        transition.setOffset_frame_in(f4);
        f4 = this.getOffset_frame_out();
        transition.setOffset_frame_out(f4);
        f4 = this.fromW;
        transition.setFromW(f4);
        return transition;
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

    public float getFromW() {
        return this.fromW;
    }

    public float getOffset_frame_in() {
        return this.offset_frame_in;
    }

    public float getOffset_frame_out() {
        return this.offset_frame_out;
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

    public boolean isBoth() {
        return this.isBoth;
    }

    public boolean isIn() {
        return this.isIn;
    }

    public boolean isOut() {
        return this.isOut;
    }

    public void setBoth(boolean bl) {
        this.isBoth = bl;
    }

    public void setDuration_both(float f) {
        this.duration_both = f;
    }

    public void setDuration_in(float f) {
        this.duration_in = f;
    }

    public void setDuration_out(float f) {
        this.duration_out = f;
    }

    public void setFromW(float f) {
        this.fromW = f;
    }

    public void setIn(boolean bl) {
        this.isIn = bl;
    }

    public void setOffset_frame_in(float f) {
        this.offset_frame_in = f;
    }

    public void setOffset_frame_out(float f) {
        this.offset_frame_out = f;
    }

    public void setOut(boolean bl) {
        this.isOut = bl;
    }

    public void setType_both(String string2) {
        this.type_both = string2;
    }

    public void setType_in(String string2) {
        this.type_in = string2;
    }

    public void setType_out(String string2) {
        this.type_out = string2;
    }
}

