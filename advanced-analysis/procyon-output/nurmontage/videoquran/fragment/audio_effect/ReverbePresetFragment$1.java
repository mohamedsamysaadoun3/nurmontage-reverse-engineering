// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.view.View;
import android.view.View$OnClickListener;

class ReverbePresetFragment$1 implements View$OnClickListener
{
    final /* synthetic */ ReverbePresetFragment this$0;
    
    ReverbePresetFragment$1(final ReverbePresetFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).pausePreview();
            ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).onDone();
        }
    }
}
