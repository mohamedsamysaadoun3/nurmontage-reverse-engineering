// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.view.View$OnClickListener;

class EditMediaFragment$9 implements View$OnClickListener
{
    final /* synthetic */ EditMediaFragment this$0;
    final /* synthetic */ HorizontalScrollView val$scrollView;
    
    EditMediaFragment$9(final EditMediaFragment this$0, final HorizontalScrollView val$scrollView) {
        this.this$0 = this$0;
        this.val$scrollView = val$scrollView;
    }
    
    public void onClick(final View view) {
        if (EditMediaFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            MyPrefereces.putScrollX(this.this$0.getContext(), this.val$scrollView.getScrollX());
            EditMediaFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).volumeEffect();
        }
    }
}
