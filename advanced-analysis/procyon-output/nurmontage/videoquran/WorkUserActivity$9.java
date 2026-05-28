// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class WorkUserActivity$9 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$9(final WorkUserActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.this$0, (Class)EngineActivity.class);
        intent.addFlags(65536);
        this.this$0.startActivity(intent);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}
