// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.HorizontalScrollView;

class EditMediaFragment$1 implements Runnable
{
    final /* synthetic */ EditMediaFragment this$0;
    final /* synthetic */ int val$scroled_x;
    final /* synthetic */ HorizontalScrollView val$scrollView;
    
    EditMediaFragment$1(final EditMediaFragment this$0, final HorizontalScrollView val$scrollView, final int val$scroled_x) {
        this.this$0 = this$0;
        this.val$scrollView = val$scrollView;
        this.val$scroled_x = val$scroled_x;
    }
    
    public void run() {
        this.val$scrollView.scrollTo(this.val$scroled_x, 0);
    }
}
