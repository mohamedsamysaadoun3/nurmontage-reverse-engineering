// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$OnScrollListener;

class ProVersionActivityDone$11$1 extends RecyclerView$OnScrollListener
{
    final /* synthetic */ ProVersionActivityDone$11 this$1;
    
    ProVersionActivityDone$11$1(final ProVersionActivityDone$11 this$1) {
        this.this$1 = this$1;
    }
    
    public void onScrollStateChanged(final RecyclerView recyclerView, int n) {
        super.onScrollStateChanged(recyclerView, n);
        final boolean b = true;
        if (n == (b ? 1 : 0)) {
            ProVersionActivityDone.-$$Nest$fputisUserScrolling(this.this$1.this$0, b);
        }
        else if (n == 0) {
            final ProVersionActivityDone this$0 = this.this$1.this$0;
            n = 0;
            ProVersionActivityDone.-$$Nest$fputisUserScrolling(this$0, false);
            ProVersionActivityDone.-$$Nest$mstartAutoScroll(this.this$1.this$0);
        }
    }
}
