// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class AddAudioFragment$3 implements View$OnClickListener
{
    final /* synthetic */ AddAudioFragment this$0;
    
    AddAudioFragment$3(final AddAudioFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (AddAudioFragment.-$$Nest$fgetiAudioCallback(this.this$0) != null) {
            AddAudioFragment.-$$Nest$fgetiAudioCallback(this.this$0).cancel();
        }
    }
}
