// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import android.view.View;
import java.util.List;
import android.view.View$OnClickListener;

class EngineActivity$7 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ List val$list;
    
    EngineActivity$7(final EngineActivity this$0, final List val$list) {
        this.this$0 = this$0;
        this.val$list = val$list;
    }
    
    public void onClick(final View view) {
        if (NetworkUtils.isNetworkAvailable((Context)this.this$0)) {
            EngineActivity.-$$Nest$mcancelDialogInternet(this.this$0);
            EngineActivity.-$$Nest$maddAudioRecitersTemplate(this.this$0, this.val$list, 0, (String)null);
        }
    }
}
