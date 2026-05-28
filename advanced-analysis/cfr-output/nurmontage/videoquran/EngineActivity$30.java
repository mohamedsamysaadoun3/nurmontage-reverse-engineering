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
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;

class EngineActivity$30
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$30(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onClick(View object) {
        EngineActivity engineActivity;
        EngineActivity engineActivity2 = this.this$0;
        EngineActivity.cfr_renamed_68(engineActivity2);
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        FragmentManager fragmentManager = engineActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity3 = this.this$0;
        AddQuranFragment$IAddQuran addQuranFragment$IAddQuran = EngineActivity.cfr_renamed_185(engineActivity3);
        EngineActivity engineActivity4 = this.this$0;
        engineActivity4 = EngineActivity.cfr_renamed_90(engineActivity4);
        AddQuranFragment addQuranFragment = AddQuranFragment.getInstance(addQuranFragment$IAddQuran, (Resources)engineActivity4);
        EngineActivity.cfr_renamed_70(engineActivity3, addQuranFragment);
        int n = R$id.m_container;
        EngineActivity engineActivity5 = this.this$0;
        Fragment fragment = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, fragment);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        Resources resources = EngineActivity.cfr_renamed_90(engineActivity6);
        int n2 = R$string.quran;
        String string2 = resources.getString(n2);
        EngineActivity.cfr_renamed_274(engineActivity6, string2);
    }
}

