package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EffectAudio implements Serializable {
    private int decays;
    private String decays_cmd;
    private int delays;
    private String delays_cmd;
    private int duration;
    private float end;
    private int fade_in;
    private int fade_out;
    private boolean isEnhance;
    private boolean isRemoveNoice;
    private float outGain;
    private String reverbPreset;
    private int reverbPreset_index_list;
    private float start;
    private int volume_echo;
    private float volume = 1.0f;
    private float speed = 1.0f;

    public boolean isEnhance() {
        return this.isEnhance;
    }

    public void setEnhance(boolean isFlag) {
        this.isEnhance = isFlag;
    }

    public boolean isRemoveNoice() {
        return this.isRemoveNoice;
    }

    public float getStart() {
        return this.start;
    }

    public float getEnd() {
        return this.end;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setStart(float floatValue) {
        this.start = floatValue;
    }

    public void setEnd(float floatValue) {
        this.end = floatValue;
    }

    public void setReverbPreset_index_list(int duration) {
        this.reverbPreset_index_list = duration;
    }

    public int getReverbPreset_index_list() {
        return this.reverbPreset_index_list;
    }

    public void setRemoveNoice(boolean isFlag) {
        this.isRemoveNoice = isFlag;
    }

    public int getVolume_echo() {
        return this.volume_echo;
    }

    public void setVolume_echo(int duration) {
        this.volume_echo = duration;
    }

    public String getDecays_cmd() {
        return this.decays_cmd;
    }

    public String getDelays_cmd() {
        return this.delays_cmd;
    }

    public void setDecays(int duration) {
        this.decays = duration;
    }

    public void setDelays(int duration) {
        this.delays = duration;
    }

    public void setDecays_cmd(String textValue) {
        this.decays_cmd = textValue;
    }

    public void setDelays_cmd(String textValue) {
        this.delays_cmd = textValue;
    }

    public void setOutGain(float floatValue) {
        this.outGain = floatValue;
    }

    public int getDecays() {
        return this.decays;
    }

    public int getDelays() {
        return this.delays;
    }

    public float getOutGain() {
        return this.outGain;
    }

    public String getReverbPreset() {
        return this.reverbPreset;
    }

    public void setReverbPreset(String textValue) {
        this.reverbPreset = textValue;
    }

    public int getFade_in() {
        return this.fade_in;
    }

    public int getFade_out() {
        return this.fade_out;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setFade_in(int duration) {
        this.fade_in = duration;
    }

    public void setSpeed(float floatValue) {
        this.speed = floatValue;
    }

    public void setFade_out(int duration) {
        this.fade_out = duration;
    }

    public void setVolume(float floatValue) {
        this.volume = floatValue;
    }
}
