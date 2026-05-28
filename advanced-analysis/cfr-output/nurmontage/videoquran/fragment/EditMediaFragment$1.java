/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.HorizontalScrollView
 */
package hazem.nurmontage.videoquran.fragment;

import android.widget.HorizontalScrollView;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;

class EditMediaFragment$1
implements Runnable {
    final /* synthetic */ EditMediaFragment this$0;
    final /* synthetic */ int val$scroled_x;
    final /* synthetic */ HorizontalScrollView val$scrollView;

    EditMediaFragment$1(EditMediaFragment editMediaFragment, HorizontalScrollView horizontalScrollView, int n) {
        this.this$0 = editMediaFragment;
        this.val$scrollView = horizontalScrollView;
        this.val$scroled_x = n;
    }

    public void run() {
        HorizontalScrollView horizontalScrollView = this.val$scrollView;
        int n = this.val$scroled_x;
        horizontalScrollView.scrollTo(n, 0);
    }
}

