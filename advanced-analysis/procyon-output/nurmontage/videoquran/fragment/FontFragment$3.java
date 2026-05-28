// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class FontFragment$3 implements View$OnClickListener
{
    final /* synthetic */ FontFragment this$0;
    
    FontFragment$3(final FontFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (FontFragment.-$$Nest$fgetiFontCallback(this.this$0) != null && FontFragment.-$$Nest$fgetlast_font(this.this$0) != null && FontFragment.-$$Nest$fgetlastTypeface(this.this$0) != null) {
            FontFragment.-$$Nest$fgetiFontCallback(this.this$0).onCancel(FontFragment.-$$Nest$fgetlast_font(this.this$0), FontFragment.-$$Nest$fgetlastTypeface(this.this$0));
        }
    }
}
