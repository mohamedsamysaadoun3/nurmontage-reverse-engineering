/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$3;

class AddQuranFragment$3$1
implements Runnable {
    final /* synthetic */ AddQuranFragment$3 this$1;
    final /* synthetic */ int val$from;
    final /* synthetic */ int val$surah;
    final /* synthetic */ int val$to;

    AddQuranFragment$3$1(AddQuranFragment$3 addQuranFragment$3, int n, int n2, int n3) {
        this.this$1 = addQuranFragment$3;
        this.val$from = n;
        this.val$to = n2;
        this.val$surah = n3;
    }

    public void run() {
        boolean bl;
        AddQuranFragment.cfr_renamed_185(this.this$1.this$0).progress();
        Object object = AddQuranFragment.cfr_renamed_199(this.this$1.this$0);
        if (object != null && (bl = (object = AddQuranFragment.cfr_renamed_199(this.this$1.this$0)).isChecked())) {
            object = AddQuranFragment.cfr_renamed_185(this.this$1.this$0);
            object.onBismilah();
        }
        object = this.this$1.this$0;
        int n = this.val$from;
        int n2 = this.val$to;
        int n3 = this.val$surah;
        ((AddQuranFragment)((Object)object)).addAyaEntityRecursive(n, n2, n3);
    }
}

