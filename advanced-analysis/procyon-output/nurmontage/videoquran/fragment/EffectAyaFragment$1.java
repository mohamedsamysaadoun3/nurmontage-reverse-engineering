// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;

class EffectAyaFragment$1 implements TabLayout$OnTabSelectedListener
{
    final /* synthetic */ EffectAyaFragment this$0;
    
    EffectAyaFragment$1(final EffectAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onTabReselected(final TabLayout$Tab tabLayout$Tab) {
    }
    
    public void onTabSelected(final TabLayout$Tab tabLayout$Tab) {
        EffectAyaFragment.-$$Nest$fputtab_selected(this.this$0, tabLayout$Tab.getPosition());
        this.this$0.loadTransition(tabLayout$Tab.getPosition());
    }
    
    public void onTabUnselected(final TabLayout$Tab tabLayout$Tab) {
    }
}
