// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class WorkUserActivity$2 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$2(final WorkUserActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        this.this$0.startActivity(new Intent((Context)this.this$0, (Class)SeettingActivity.class));
        this.this$0.finish();
    }
}
