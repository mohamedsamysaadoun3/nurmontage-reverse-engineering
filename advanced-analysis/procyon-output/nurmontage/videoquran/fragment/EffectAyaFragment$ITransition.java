// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

public interface EffectAyaFragment$ITransition
{
    void applyAll(final int p0, final EntityQuranTimeline p1);
    
    void destroy(final EntityQuranTimeline p0);
    
    void in(final String p0, final EntityQuranTimeline p1);
    
    void onHideFragment(final EntityQuranTimeline p0);
    
    void out(final String p0, final EntityQuranTimeline p1);
    
    void playing(final EntityQuranTimeline p0);
    
    void remove(final int p0, final EntityQuranTimeline p1);
    
    void toSubscribe();
    
    void updateDurationIn(final float p0, final EntityQuranTimeline p1);
    
    void updateDurationOut(final float p0, final EntityQuranTimeline p1);
}
