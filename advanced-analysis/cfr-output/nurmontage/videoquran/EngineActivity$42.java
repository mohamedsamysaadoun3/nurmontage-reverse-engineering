/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;

class EngineActivity$42
implements Runnable {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$p;
    final /* synthetic */ int val$size;

    EngineActivity$42(EngineActivity engineActivity, int n, int n2) {
        this.this$0 = engineActivity;
        this.val$p = n;
        this.val$size = n2;
    }

    public void run() {
        ProgressViewFragment progressViewFragment = ProgressViewFragment.instance;
        if (progressViewFragment != null) {
            progressViewFragment = ProgressViewFragment.instance;
            int n = this.val$p;
            int n2 = this.val$size;
            progressViewFragment.update(n, n2);
        }
    }
}

