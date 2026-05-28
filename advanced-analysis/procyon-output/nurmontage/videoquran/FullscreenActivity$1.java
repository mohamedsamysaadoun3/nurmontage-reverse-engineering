// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

class FullscreenActivity$1 implements Runnable
{
    final /* synthetic */ FullscreenActivity this$0;
    final /* synthetic */ Map val$all;
    
    FullscreenActivity$1(final FullscreenActivity this$0, final Map val$all) {
        this.this$0 = this$0;
        this.val$all = val$all;
    }
    
    public void run() {
        if (this.this$0.getIntent() != null && this.this$0.getIntent().getBooleanExtra("from_setting", false)) {
            this.this$0.startActivity(new Intent((Context)this.this$0, (Class)SeettingActivity.class));
            this.this$0.finish();
            return;
        }
        Intent intent = null;
        Label_0149: {
            if (LocalPersistence.readObjectFromFile((Context)this.this$0, "template_tmp") == null) {
                final Map val$all = this.val$all;
                if (val$all != null && !val$all.isEmpty()) {
                    intent = new Intent((Context)this.this$0, (Class)WorkUserActivity.class);
                    break Label_0149;
                }
            }
            intent = new Intent((Context)this.this$0, (Class)EngineActivity.class);
        }
        this.this$0.startActivity(intent);
        this.this$0.finish();
    }
}
