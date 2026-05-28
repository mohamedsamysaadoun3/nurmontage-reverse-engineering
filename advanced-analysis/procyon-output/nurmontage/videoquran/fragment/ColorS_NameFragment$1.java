// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class ColorS_NameFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ColorS_NameFragment this$0;
    
    ColorS_NameFragment$1(final ColorS_NameFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ColorS_NameFragment.-$$Nest$fgetiEditSName(this.this$0) != null) {
            ColorS_NameFragment.-$$Nest$fgetiEditSName(this.this$0).onDone();
        }
    }
}
