// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class ResizeFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ResizeFragment this$0;
    
    ResizeFragment$1(final ResizeFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ResizeFragment.-$$Nest$fgetiDimensionCallback(this.this$0) != null) {
            ResizeFragment.-$$Nest$fgetiDimensionCallback(this.this$0).done();
        }
    }
}
