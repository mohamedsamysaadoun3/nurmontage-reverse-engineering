// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class PlayVideoActivity$4 implements View$OnClickListener
{
    final /* synthetic */ PlayVideoActivity this$0;
    
    PlayVideoActivity$4(final PlayVideoActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        PlayVideoActivity.-$$Nest$mpause(this.this$0);
        this.this$0.finish();
    }
}
