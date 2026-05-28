// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;

class EditIconQuranFragment$3 implements IconQuranAdabters$IIconQuranCallback
{
    final /* synthetic */ EditIconQuranFragment this$0;
    
    EditIconQuranFragment$3(final EditIconQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onIcon(final String s) {
        EditIconQuranFragment.-$$Nest$fputicon(this.this$0, s);
        if (EditIconQuranFragment.-$$Nest$fgetiQuranIconCallback(this.this$0) != null) {
            EditIconQuranFragment.-$$Nest$fgetiQuranIconCallback(this.this$0).add(EditIconQuranFragment.-$$Nest$fgeticon(this.this$0));
        }
    }
}
