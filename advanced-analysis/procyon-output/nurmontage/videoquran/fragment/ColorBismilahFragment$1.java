// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class ColorBismilahFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ColorBismilahFragment this$0;
    
    ColorBismilahFragment$1(final ColorBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ColorBismilahFragment.-$$Nest$fgetiEditSName(this.this$0) != null) {
            ColorBismilahFragment.-$$Nest$fgetiEditSName(this.this$0).onDone();
        }
    }
}
