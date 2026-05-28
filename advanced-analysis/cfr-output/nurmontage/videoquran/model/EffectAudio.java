/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EffectAudio
implements Serializable {
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
    private float speed;
    private float start;
    private float volume;
    private int volume_echo;

    public EffectAudio() {
        float f;
        this.volume = f = 1.0f;
        this.speed = f;
    }

    public int getDecays() {
        return this.decays;
    }

    public String getDecays_cmd() {
        return this.decays_cmd;
    }

    public int getDelays() {
        return this.delays;
    }

    public String getDelays_cmd() {
        return this.delays_cmd;
    }

    public int getDuration() {
        return this.duration;
    }

    public float getEnd() {
        return this.end;
    }

    public int getFade_in() {
        return this.fade_in;
    }

    public int getFade_out() {
        return this.fade_out;
    }

    public float getOutGain() {
        return this.outGain;
    }

    public String getReverbPreset() {
        return this.reverbPreset;
    }

    public int getReverbPreset_index_list() {
        return this.reverbPreset_index_list;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getStart() {
        return this.start;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getVolume_echo() {
        return this.volume_echo;
    }

    public boolean isEnhance() {
        return this.isEnhance;
    }

    public boolean isRemoveNoice() {
        return this.isRemoveNoice;
    }

    public void setDecays(int n) {
        this.decays = n;
    }

    public void setDecays_cmd(String string2) {
        this.decays_cmd = string2;
    }

    public void setDelays(int n) {
        this.delays = n;
    }

    public void setDelays_cmd(String string2) {
        this.delays_cmd = string2;
    }

    public void setDuration(int n) {
        this.duration = n;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setEnhance(boolean bl) {
        this.isEnhance = bl;
    }

    public void setFade_in(int n) {
        this.fade_in = n;
    }

    public void setFade_out(int n) {
        this.fade_out = n;
    }

    public void setOutGain(float f) {
        this.outGain = f;
    }

    public void setRemoveNoice(boolean bl) {
        this.isRemoveNoice = bl;
    }

    public void setReverbPreset(String string2) {
        this.reverbPreset = string2;
    }

    public void setReverbPreset_index_list(int n) {
        this.reverbPreset_index_list = n;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setStart(float f) {
        this.start = f;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public void setVolume_echo(int n) {
        this.volume_echo = n;
    }
}

