/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.material.tabs.TabLayout$OnTabSelectedListener
 *  com.google.android.material.tabs.TabLayout$Tab
 */
package hazem.nurmontage.videoquran.fragment;

import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;

class EffectBismilahFragment$1
implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ EffectBismilahFragment this$0;

    EffectBismilahFragment$1(EffectBismilahFragment effectBismilahFragment) {
        this.this$0 = effectBismilahFragment;
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        EffectBismilahFragment effectBismilahFragment = this.this$0;
        int n = tab.getPosition();
        EffectBismilahFragment.cfr_renamed_194(effectBismilahFragment, n);
        effectBismilahFragment = this.this$0;
        int n2 = tab.getPosition();
        effectBismilahFragment.loadTransition(n2);
    }

    public void onTabUnselected(TabLayout.Tab tab) {
    }
}

