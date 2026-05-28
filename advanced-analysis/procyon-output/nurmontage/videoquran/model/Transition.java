// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class Transition implements Serializable
{
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
        final float n = 1.5f;
        this.duration_in = n;
        this.duration_out = n;
        this.duration_both = 0.1f;
        final String type_in = "none";
        this.type_out = type_in;
        this.type_both = type_in;
        this.type_in = type_in;
    }
    
    public Transition(final String type_in, final String type_out, final String type_both, final float duration_in, final float duration_out, final float duration_both, final boolean isIn, final boolean isOut, final boolean isBoth) {
        this.type_in = type_in;
        this.type_out = type_out;
        this.type_both = type_both;
        this.duration_in = duration_in;
        this.duration_out = duration_out;
        this.duration_both = duration_both;
        this.isIn = isIn;
        this.isOut = isOut;
        this.isBoth = isBoth;
    }
    
    public Transition duplicate() {
        final Transition transition = new Transition(this.getType_in(), this.getType_out(), this.getType_both(), this.getDuration_in(), this.getDuration_out(), this.getDuration_both(), this.isIn(), this.isOut(), this.isBoth());
        transition.setOffset_frame_in(this.getOffset_frame_in());
        transition.setOffset_frame_out(this.getOffset_frame_out());
        transition.setFromW(this.fromW);
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
    
    public void setBoth(final boolean isBoth) {
        this.isBoth = isBoth;
    }
    
    public void setDuration_both(final float duration_both) {
        this.duration_both = duration_both;
    }
    
    public void setDuration_in(final float duration_in) {
        this.duration_in = duration_in;
    }
    
    public void setDuration_out(final float duration_out) {
        this.duration_out = duration_out;
    }
    
    public void setFromW(final float fromW) {
        this.fromW = fromW;
    }
    
    public void setIn(final boolean isIn) {
        this.isIn = isIn;
    }
    
    public void setOffset_frame_in(final float offset_frame_in) {
        this.offset_frame_in = offset_frame_in;
    }
    
    public void setOffset_frame_out(final float offset_frame_out) {
        this.offset_frame_out = offset_frame_out;
    }
    
    public void setOut(final boolean isOut) {
        this.isOut = isOut;
    }
    
    public void setType_both(final String type_both) {
        this.type_both = type_both;
    }
    
    public void setType_in(final String type_in) {
        this.type_in = type_in;
    }
    
    public void setType_out(final String type_out) {
        this.type_out = type_out;
    }
}
