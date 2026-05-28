// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.constant.AyaTextPreset;

public interface EditEntityFragment$IEditEntityCallback
{
    void fromNow();
    
    void fromTheStart();
    
    void onAnim();
    
    void onColor();
    
    void onCut();
    
    void onDelete();
    
    void onDone();
    
    void onDuplicate();
    
    void onEdit();
    
    void onFont();
    
    void onIcon();
    
    void untilNow();
    
    void untilTheEnd();
    
    void updateAya(final int p0);
    
    void updatePreset(final AyaTextPreset p0);
    
    void updateTrsl(final int p0);
}
