/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.model.EffectAudio;

public interface EditMediaFragment$IEditMediaCallback {
    public void echoEffect();

    public void enhanceVoice();

    public void fadeffect();

    public void noice();

    public void onCmd(String var1);

    public void onCmdAll(EffectAudio var1);

    public void onCmdPlay(String var1);

    public void onCut();

    public void onDelete();

    public void onDone();

    public void onDuplicate();

    public void onReplace();

    public void pausePreview();

    public void pitchffect();

    public void reverbEffect();

    public void speedffect();

    public void startPreview();

    public void updateEntity(EffectAudioType var1, EntityAudio var2);

    public void volumeEffect();
}

