/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.fragment.FontFragment$1;

class FontFragment$1$1
implements Runnable {
    final /* synthetic */ FontFragment$1 this$1;
    final /* synthetic */ int val$centerPosition;

    FontFragment$1$1(FontFragment$1 fontFragment$1, int n) {
        this.this$1 = fontFragment$1;
        this.val$centerPosition = n;
    }

    public void run() {
        FontTextAdabters fontTextAdabters = this.this$1.val$adapter;
        if (fontTextAdabters != null) {
            fontTextAdabters = this.this$1.val$adapter;
            int n = this.val$centerPosition;
            fontTextAdabters.setSelected(n);
        }
    }
}

