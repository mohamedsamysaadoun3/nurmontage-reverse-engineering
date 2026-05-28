// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class FontFragment$2 implements View$OnClickListener
{
    final /* synthetic */ FontFragment this$0;
    
    FontFragment$2(final FontFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (FontFragment.-$$Nest$fgetiFontCallback(this.this$0) != null) {
            FontFragment.-$$Nest$fgetiFontCallback(this.this$0).onDone(FontFragment.-$$Nest$fgetfont_select(this.this$0), FontFragment.-$$Nest$fgettypeface(this.this$0));
        }
    }
}
