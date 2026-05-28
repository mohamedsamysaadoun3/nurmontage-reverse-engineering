/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 */
package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.model.Template;

class EngineActivity$34
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$34(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onClick(View object) {
        boolean bl;
        int n;
        EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback;
        int n2;
        Resources resources;
        EngineActivity engineActivity;
        FragmentTransaction fragmentTransaction;
        block31: {
            EngineActivity engineActivity2;
            EngineActivity engineActivity3 = this.this$0;
            EngineActivity.cfr_renamed_68(engineActivity3);
            try {
                engineActivity2 = this.this$0;
            }
            catch (Exception exception) {
                return;
            }
            FragmentManager fragmentManager = engineActivity2.getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            engineActivity = this.this$0;
            resources = EngineActivity.cfr_renamed_90(engineActivity);
            Object object2 = this.this$0;
            object2 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object2));
            n2 = ((Template)object2).getIpad_type();
            EngineActivity engineActivity4 = this.this$0;
            editIpadFragment$IIpadEditCallback = EngineActivity.cfr_renamed_172(engineActivity4);
            Object object3 = this.this$0;
            object3 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object3));
            n = ((Template)object3).getIndex_color();
            Object object4 = this.this$0;
            object4 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object4));
            object4 = ((Template)object4).getGradient();
            if (object4 != null) {
                bl = true;
                break block31;
            }
            bl = false;
            object4 = null;
        }
        Object object5 = this.this$0;
        object5 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object5));
        boolean bl2 = ((Template)object5).isGlass();
        EditIpadFragment editIpadFragment = EditIpadFragment.getInstance(resources, n2, editIpadFragment$IIpadEditCallback, n, bl, bl2);
        EngineActivity.cfr_renamed_70(engineActivity, editIpadFragment);
        int n3 = R$id.m_container;
        EngineActivity engineActivity5 = this.this$0;
        Fragment fragment = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n3, fragment);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        Resources resources2 = EngineActivity.cfr_renamed_90(engineActivity6);
        int n4 = R$string.ipad;
        String string2 = resources2.getString(n4);
        EngineActivity.cfr_renamed_274(engineActivity6, string2);
    }
}

