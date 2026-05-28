/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;

public interface EffectBismilahFragment$ITransition {
    public void applyAll(EntityBismilahTimeline var1);

    public void destroy(EntityBismilahTimeline var1);

    public void in(String var1, EntityBismilahTimeline var2);

    public void onHideFragment(EntityBismilahTimeline var1);

    public void out(String var1, EntityBismilahTimeline var2);

    public void playing(EntityBismilahTimeline var1);

    public void remove(int var1, EntityBismilahTimeline var2);

    public void updateDurationIn(float var1, EntityBismilahTimeline var2);

    public void updateDurationOut(float var1, EntityBismilahTimeline var2);
}

