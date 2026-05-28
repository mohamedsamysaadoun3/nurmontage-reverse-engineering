/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

public interface EffectAyaFragment$ITransition {
    public void applyAll(int var1, EntityQuranTimeline var2);

    public void destroy(EntityQuranTimeline var1);

    public void in(String var1, EntityQuranTimeline var2);

    public void onHideFragment(EntityQuranTimeline var1);

    public void out(String var1, EntityQuranTimeline var2);

    public void playing(EntityQuranTimeline var1);

    public void remove(int var1, EntityQuranTimeline var2);

    public void toSubscribe();

    public void updateDurationIn(float var1, EntityQuranTimeline var2);

    public void updateDurationOut(float var1, EntityQuranTimeline var2);
}

