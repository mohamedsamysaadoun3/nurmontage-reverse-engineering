/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.HorizontalScrollView
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;

class EditMediaFragment$5
implements View.OnClickListener {
    final /* synthetic */ EditMediaFragment this$0;
    final /* synthetic */ HorizontalScrollView val$scrollView;

    EditMediaFragment$5(EditMediaFragment editMediaFragment, HorizontalScrollView horizontalScrollView) {
        this.this$0 = editMediaFragment;
        this.val$scrollView = horizontalScrollView;
    }

    public void onClick(View object) {
        object = EditMediaFragment.cfr_renamed_69(this.this$0);
        if (object != null) {
            object = this.this$0.getContext();
            HorizontalScrollView horizontalScrollView = this.val$scrollView;
            int n = horizontalScrollView.getScrollX();
            MyPrefereces.putScrollX((Context)object, n);
            object = EditMediaFragment.cfr_renamed_69(this.this$0);
            object.reverbEffect();
        }
    }
}

