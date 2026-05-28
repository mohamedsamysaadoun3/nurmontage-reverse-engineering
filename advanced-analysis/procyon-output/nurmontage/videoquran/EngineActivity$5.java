// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import android.view.View;
import android.net.Uri;
import android.view.View$OnClickListener;

class EngineActivity$5 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$5(final EngineActivity this$0, final Uri val$uri) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
    }
    
    public void onClick(final View view) {
        if (NetworkUtils.isNetworkAvailable((Context)this.this$0)) {
            EngineActivity.-$$Nest$mcancelDialogInternet(this.this$0);
            EngineActivity.-$$Nest$maddAudioTemplateHttp(this.this$0, this.val$uri, 0, (String)null);
        }
    }
}
