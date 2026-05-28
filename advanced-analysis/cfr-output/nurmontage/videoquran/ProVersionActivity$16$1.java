/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 */
package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.ProVersionActivity$16;

class ProVersionActivity$16$1
extends RecyclerView.OnScrollListener {
    final /* synthetic */ ProVersionActivity$16 this$1;

    ProVersionActivity$16$1(ProVersionActivity$16 proVersionActivity$16) {
        this.this$1 = proVersionActivity$16;
    }

    public void onScrollStateChanged(RecyclerView object, int n) {
        super.onScrollStateChanged(object, n);
        int n2 = 1;
        if (n == n2) {
            ProVersionActivity proVersionActivity = this.this$1.this$0;
            ProVersionActivity.cfr_renamed_98(proVersionActivity, n2 != 0);
        } else if (n == 0) {
            object = this.this$1.this$0;
            n = 0;
            Object var4_5 = null;
            ProVersionActivity.cfr_renamed_98((ProVersionActivity)((Object)object), false);
            object = this.this$1.this$0;
            ProVersionActivity.cfr_renamed_105((ProVersionActivity)((Object)object));
        }
    }
}

