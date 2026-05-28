// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;

class EngineActivity$11 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$11(final EngineActivity this$0, final Uri val$uri) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
    }
    
    public void run() {
        this.this$0.dialogNoInternet(this.val$uri);
    }
}
