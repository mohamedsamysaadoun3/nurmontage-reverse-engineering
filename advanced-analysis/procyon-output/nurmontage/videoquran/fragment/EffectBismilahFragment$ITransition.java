// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;

public interface EffectBismilahFragment$ITransition
{
    void applyAll(final EntityBismilahTimeline p0);
    
    void destroy(final EntityBismilahTimeline p0);
    
    void in(final String p0, final EntityBismilahTimeline p1);
    
    void onHideFragment(final EntityBismilahTimeline p0);
    
    void out(final String p0, final EntityBismilahTimeline p1);
    
    void playing(final EntityBismilahTimeline p0);
    
    void remove(final int p0, final EntityBismilahTimeline p1);
    
    void updateDurationIn(final float p0, final EntityBismilahTimeline p1);
    
    void updateDurationOut(final float p0, final EntityBismilahTimeline p1);
}
