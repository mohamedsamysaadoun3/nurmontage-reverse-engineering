// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;

class ShareWithMeActivity$1 implements Runnable
{
    final /* synthetic */ ShareWithMeActivity this$0;
    
    ShareWithMeActivity$1(final ShareWithMeActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        this.this$0.startActivity(new Intent((Context)this.this$0, (Class)WorkUserActivity.class));
        this.this$0.finish();
    }
}
