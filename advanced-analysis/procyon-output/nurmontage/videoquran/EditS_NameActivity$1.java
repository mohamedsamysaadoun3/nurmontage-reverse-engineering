// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import androidx.activity.OnBackPressedCallback;

class EditS_NameActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ EditS_NameActivity this$0;
    
    EditS_NameActivity$1(final EditS_NameActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        this.this$0.setResult(0, (Intent)null);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}
