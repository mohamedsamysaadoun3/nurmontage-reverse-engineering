// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.model.EffectAudio;

public interface EditMediaFragment$IEditMediaCallback
{
    void echoEffect();
    
    void enhanceVoice();
    
    void fadeffect();
    
    void noice();
    
    void onCmd(final String p0);
    
    void onCmdAll(final EffectAudio p0);
    
    void onCmdPlay(final String p0);
    
    void onCut();
    
    void onDelete();
    
    void onDone();
    
    void onDuplicate();
    
    void onReplace();
    
    void pausePreview();
    
    void pitchffect();
    
    void reverbEffect();
    
    void speedffect();
    
    void startPreview();
    
    void updateEntity(final EffectAudioType p0, final EntityAudio p1);
    
    void volumeEffect();
}
