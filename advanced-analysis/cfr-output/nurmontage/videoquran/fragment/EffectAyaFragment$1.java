/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.material.tabs.TabLayout$OnTabSelectedListener
 *  com.google.android.material.tabs.TabLayout$Tab
 */
package hazem.nurmontage.videoquran.fragment;

import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;

class EffectAyaFragment$1
implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$1(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        EffectAyaFragment effectAyaFragment = this.this$0;
        int n = tab.getPosition();
        EffectAyaFragment.cfr_renamed_194(effectAyaFragment, n);
        effectAyaFragment = this.this$0;
        int n2 = tab.getPosition();
        effectAyaFragment.loadTransition(n2);
    }

    public void onTabUnselected(TabLayout.Tab tab) {
    }
}

