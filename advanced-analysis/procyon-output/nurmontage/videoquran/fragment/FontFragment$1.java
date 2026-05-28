// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import androidx.recyclerview.widget.RecyclerView$OnScrollListener;

class FontFragment$1 extends RecyclerView$OnScrollListener
{
    final /* synthetic */ FontFragment this$0;
    final /* synthetic */ FontTextAdabters val$adapter;
    final /* synthetic */ SnapHelper val$snapHelper;
    
    FontFragment$1(final FontFragment this$0, final SnapHelper val$snapHelper, final FontTextAdabters val$adapter) {
        this.this$0 = this$0;
        this.val$snapHelper = val$snapHelper;
        this.val$adapter = val$adapter;
    }
    
    public void onScrollStateChanged(final RecyclerView recyclerView, final int n) {
        super.onScrollStateChanged(recyclerView, n);
    }
    
    public void onScrolled(final RecyclerView recyclerView, final int n, final int n2) {
        super.onScrolled(recyclerView, n, n2);
        if (FontFragment.-$$Nest$fgetisInit(this.this$0)) {
            FontFragment.-$$Nest$fputisInit(this.this$0, false);
            return;
        }
        final View snapView = this.val$snapHelper.findSnapView((RecyclerView$LayoutManager)FontFragment.-$$Nest$fgetlinearLayoutManager(this.this$0));
        if (snapView != null) {
            FontFragment.-$$Nest$fgetrecyclerView(this.this$0).post((Runnable)new FontFragment$1$1(this, FontFragment.-$$Nest$fgetlinearLayoutManager(this.this$0).getPosition(snapView)));
        }
    }
}
