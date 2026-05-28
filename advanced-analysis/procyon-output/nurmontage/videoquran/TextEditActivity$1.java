// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import androidx.activity.OnBackPressedCallback;

class TextEditActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ TextEditActivity this$0;
    
    TextEditActivity$1(final TextEditActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.setResult(-1, (Intent)null);
        this.this$0.finish();
    }
}
