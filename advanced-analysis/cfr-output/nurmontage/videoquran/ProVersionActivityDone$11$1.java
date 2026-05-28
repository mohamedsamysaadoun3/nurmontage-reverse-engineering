/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 */
package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import hazem.nurmontage.videoquran.ProVersionActivityDone$11;

class ProVersionActivityDone$11$1
extends RecyclerView.OnScrollListener {
    final /* synthetic */ ProVersionActivityDone$11 this$1;

    ProVersionActivityDone$11$1(ProVersionActivityDone$11 proVersionActivityDone$11) {
        this.this$1 = proVersionActivityDone$11;
    }

    public void onScrollStateChanged(RecyclerView object, int n) {
        super.onScrollStateChanged(object, n);
        int n2 = 1;
        if (n == n2) {
            ProVersionActivityDone proVersionActivityDone = this.this$1.this$0;
            ProVersionActivityDone.cfr_renamed_98(proVersionActivityDone, n2 != 0);
        } else if (n == 0) {
            object = this.this$1.this$0;
            n = 0;
            Object var4_5 = null;
            ProVersionActivityDone.cfr_renamed_98((ProVersionActivityDone)((Object)object), false);
            object = this.this$1.this$0;
            ProVersionActivityDone.cfr_renamed_105((ProVersionActivityDone)((Object)object));
        }
    }
}

