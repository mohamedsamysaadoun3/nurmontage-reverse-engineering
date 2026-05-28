/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultCallback
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 */
package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$68$1;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;

class EngineActivity$68
implements ActivityResultCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$68(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void onActivityResult(ActivityResult object) {
        EngineActivity engineActivity;
        EngineActivity engineActivity2 = this.this$0;
        int n = 0;
        Object var3_10 = null;
        EngineActivity.cfr_renamed_117(engineActivity2, false);
        try {
            AddQuranFragment addQuranFragment = AddQuranFragment.instance;
            if (addQuranFragment != null) {
                AddQuranFragment addQuranFragment2 = AddQuranFragment.instance;
                addQuranFragment2.addAyaIndex();
                return;
            }
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
        n = R$id.m_container;
        EngineActivity engineActivity5 = this.this$0;
        Fragment fragment = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, fragment);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        EngineActivity$68$1 engineActivity$68$1 = new EngineActivity$68$1(this);
        engineActivity6.runOnUiThread(engineActivity$68$1);
    }
}

