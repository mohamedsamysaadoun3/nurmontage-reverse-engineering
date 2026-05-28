// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.EntityMedia;

class EngineActivity$10 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    
    EngineActivity$10(final EngineActivity this$0, final EntityMedia val$entityMedia) {
        this.this$0 = this$0;
        this.val$entityMedia = val$entityMedia;
    }
    
    public void run() {
        this.this$0.dialogNoInternetList(this.val$entityMedia.getPaths_https());
    }
}
