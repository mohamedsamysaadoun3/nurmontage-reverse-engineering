// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EffectAudio implements Serializable
{
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
        final float n = 1.0f;
        this.volume = n;
        this.speed = n;
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
    
    public void setDecays(final int decays) {
        this.decays = decays;
    }
    
    public void setDecays_cmd(final String decays_cmd) {
        this.decays_cmd = decays_cmd;
    }
    
    public void setDelays(final int delays) {
        this.delays = delays;
    }
    
    public void setDelays_cmd(final String delays_cmd) {
        this.delays_cmd = delays_cmd;
    }
    
    public void setDuration(final int duration) {
        this.duration = duration;
    }
    
    public void setEnd(final float end) {
        this.end = end;
    }
    
    public void setEnhance(final boolean isEnhance) {
        this.isEnhance = isEnhance;
    }
    
    public void setFade_in(final int fade_in) {
        this.fade_in = fade_in;
    }
    
    public void setFade_out(final int fade_out) {
        this.fade_out = fade_out;
    }
    
    public void setOutGain(final float outGain) {
        this.outGain = outGain;
    }
    
    public void setRemoveNoice(final boolean isRemoveNoice) {
        this.isRemoveNoice = isRemoveNoice;
    }
    
    public void setReverbPreset(final String reverbPreset) {
        this.reverbPreset = reverbPreset;
    }
    
    public void setReverbPreset_index_list(final int reverbPreset_index_list) {
        this.reverbPreset_index_list = reverbPreset_index_list;
    }
    
    public void setSpeed(final float speed) {
        this.speed = speed;
    }
    
    public void setStart(final float start) {
        this.start = start;
    }
    
    public void setVolume(final float volume) {
        this.volume = volume;
    }
    
    public void setVolume_echo(final int volume_echo) {
        this.volume_echo = volume_echo;
    }
}
