// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class QuranSearchActivity$2 extends OnBackPressedCallback
{
    final /* synthetic */ QuranSearchActivity this$0;
    
    QuranSearchActivity$2(final QuranSearchActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        this.this$0.setResult(0);
        this.this$0.finish();
    }
}
