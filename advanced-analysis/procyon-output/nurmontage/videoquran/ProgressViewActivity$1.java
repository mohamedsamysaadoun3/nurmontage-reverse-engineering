// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class ProgressViewActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$1(final ProgressViewActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.dialog();
    }
}
