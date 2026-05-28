/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.fragment.app.Fragment
 *  com.google.android.material.tabs.TabLayout$OnTabSelectedListener
 *  com.google.android.material.tabs.TabLayout$Tab
 */
package hazem.nurmontage.videoquran.fragment;

import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment;

class EditIpadFragment$2
implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ EditIpadFragment this$0;

    EditIpadFragment$2(EditIpadFragment editIpadFragment) {
        this.this$0 = editIpadFragment;
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        int n;
        EditIpadFragment editIpadFragment = this.this$0;
        int n2 = EditIpadFragment.cfr_renamed_268(editIpadFragment);
        if (n2 != (n = tab.getPosition())) {
            editIpadFragment = this.this$0;
            int n3 = tab.getPosition();
            EditIpadFragment.cfr_renamed_269(editIpadFragment, n3);
            tab = this.this$0.getChildFragmentManager().beginTransaction();
            n2 = R$id.container;
            EditIpadFragment editIpadFragment2 = this.this$0;
            int n4 = EditIpadFragment.cfr_renamed_268(editIpadFragment2);
            editIpadFragment2 = EditIpadFragment.cfr_renamed_270(editIpadFragment2, n4);
            tab = tab.replace(n2, (Fragment)editIpadFragment2);
            n2 = 0;
            editIpadFragment = null;
            tab = tab.addToBackStack(null);
            tab.commit();
        }
    }

    public void onTabUnselected(TabLayout.Tab tab) {
    }
}

