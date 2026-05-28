// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$OnScrollListener;

class ProVersionActivity$16$1 extends RecyclerView$OnScrollListener
{
    final /* synthetic */ ProVersionActivity$16 this$1;
    
    ProVersionActivity$16$1(final ProVersionActivity$16 this$1) {
        this.this$1 = this$1;
    }
    
    public void onScrollStateChanged(final RecyclerView recyclerView, int n) {
        super.onScrollStateChanged(recyclerView, n);
        final boolean b = true;
        if (n == (b ? 1 : 0)) {
            ProVersionActivity.-$$Nest$fputisUserScrolling(this.this$1.this$0, b);
        }
        else if (n == 0) {
            final ProVersionActivity this$0 = this.this$1.this$0;
            n = 0;
            ProVersionActivity.-$$Nest$fputisUserScrolling(this$0, false);
            ProVersionActivity.-$$Nest$mstartAutoScroll(this.this$1.this$0);
        }
    }
}
