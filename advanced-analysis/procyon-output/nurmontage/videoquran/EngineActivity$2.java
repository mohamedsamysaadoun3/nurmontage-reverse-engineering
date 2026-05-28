// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$2 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$2(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        LocalPersistence.deleteTemplate((Context)this.this$0, "template_tmp");
        EngineActivity.-$$Nest$mcancelDialog(this.this$0);
        this.this$0.startActivity(new Intent((Context)this.this$0, (Class)WorkUserActivity.class));
        this.this$0.finish();
    }
}
