// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class ColorTrslAyaFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ColorTrslAyaFragment this$0;
    
    ColorTrslAyaFragment$1(final ColorTrslAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ColorTrslAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            ColorTrslAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).onDone();
        }
    }
}
