/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 *  androidx.recyclerview.widget.SnapHelper
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.fragment.FontFragment$1$1;

class FontFragment$1
extends RecyclerView.OnScrollListener {
    final /* synthetic */ FontFragment this$0;
    final /* synthetic */ FontTextAdabters val$adapter;
    final /* synthetic */ SnapHelper val$snapHelper;

    FontFragment$1(FontFragment fontFragment, SnapHelper snapHelper, FontTextAdabters fontTextAdabters) {
        this.this$0 = fontFragment;
        this.val$snapHelper = snapHelper;
        this.val$adapter = fontTextAdabters;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int n) {
        super.onScrollStateChanged(recyclerView, n);
    }

    public void onScrolled(RecyclerView object, int n, int n2) {
        super.onScrolled(object, n, n2);
        object = this.this$0;
        int n3 = FontFragment.cfr_renamed_250((FontFragment)((Object)object));
        if (n3 != 0) {
            FontFragment.cfr_renamed_263(this.this$0, false);
            return;
        }
        object = this.val$snapHelper;
        LinearLayoutManager linearLayoutManager = FontFragment.cfr_renamed_265(this.this$0);
        if ((object = object.findSnapView((RecyclerView.LayoutManager)linearLayoutManager)) != null) {
            n3 = FontFragment.cfr_renamed_265(this.this$0).getPosition((View)object);
            linearLayoutManager = FontFragment.cfr_renamed_93(this.this$0);
            FontFragment$1$1 fontFragment$1$1 = new FontFragment$1$1(this, n3);
            linearLayoutManager.post((Runnable)fontFragment$1$1);
        }
    }
}

