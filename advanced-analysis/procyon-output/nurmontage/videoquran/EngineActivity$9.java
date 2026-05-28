// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

class EngineActivity$9 implements AudioUtils$Callback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    
    EngineActivity$9(final EngineActivity this$0, final EntityMedia val$entityMedia) {
        this.this$0 = this$0;
        this.val$entityMedia = val$entityMedia;
    }
    
    public void onError(final Exception ex) {
        ex.printStackTrace();
    }
    
    public void onSuccess(String extension) {
        this.val$entityMedia.setVideo_path(extension);
        extension = EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getExtension();
        if (extension != null) {
            final EngineActivity this$0 = this.this$0;
            EngineActivity.-$$Nest$maddAudioFromVideoWithExtention(this$0, EngineActivity.-$$Nest$fgetmTemplate(this$0).getExtension(), this.val$entityMedia.getVideo_path(), 0);
        }
        else {
            EngineActivity.-$$Nest$fputstart_extenstion(this.this$0, 0);
            EngineActivity.-$$Nest$mextractAudioFromVideoRecursive(this.this$0, this.val$entityMedia.getVideo_path(), 0, true, 0);
        }
    }
}
