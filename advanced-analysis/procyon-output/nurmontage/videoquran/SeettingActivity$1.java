// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import androidx.activity.OnBackPressedCallback;

class SeettingActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ SeettingActivity this$0;
    
    SeettingActivity$1(final SeettingActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.startActivity(new Intent((Context)this.this$0, (Class)WorkUserActivity.class));
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}
