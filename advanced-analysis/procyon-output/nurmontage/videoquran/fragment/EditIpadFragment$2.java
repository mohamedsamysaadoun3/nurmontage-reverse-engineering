// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import androidx.fragment.app.FragmentTransaction;
import hazem.nurmontage.videoquran.R$id;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;

class EditIpadFragment$2 implements TabLayout$OnTabSelectedListener
{
    final /* synthetic */ EditIpadFragment this$0;
    
    EditIpadFragment$2(final EditIpadFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onTabReselected(final TabLayout$Tab tabLayout$Tab) {
    }
    
    public void onTabSelected(final TabLayout$Tab tabLayout$Tab) {
        if (EditIpadFragment.-$$Nest$fgetmCurrentPosFragment(this.this$0) != tabLayout$Tab.getPosition()) {
            EditIpadFragment.-$$Nest$fputmCurrentPosFragment(this.this$0, tabLayout$Tab.getPosition());
            final FragmentTransaction beginTransaction = this.this$0.getChildFragmentManager().beginTransaction();
            final int container = R$id.container;
            final EditIpadFragment this$0 = this.this$0;
            beginTransaction.replace(container, EditIpadFragment.-$$Nest$mgetFragment(this$0, EditIpadFragment.-$$Nest$fgetmCurrentPosFragment(this$0))).addToBackStack((String)null).commit();
        }
    }
    
    public void onTabUnselected(final TabLayout$Tab tabLayout$Tab) {
    }
}
