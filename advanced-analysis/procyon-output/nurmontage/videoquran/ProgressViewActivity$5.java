// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.io.File;

class ProgressViewActivity$5 implements Runnable
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$5(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (ProgressViewActivity.-$$Nest$fgetmTemplate(this.this$0) != null) {
            ProgressViewActivity.-$$Nest$mdeleteFolderWithCommonsIO(this.this$0, new File(ProgressViewActivity.-$$Nest$fgetmTemplate(this.this$0).getFolder_template()));
        }
    }
}
