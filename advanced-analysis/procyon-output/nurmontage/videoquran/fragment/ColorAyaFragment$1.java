// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class ColorAyaFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ColorAyaFragment this$0;
    
    ColorAyaFragment$1(final ColorAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ColorAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            ColorAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).onDone();
        }
    }
}
