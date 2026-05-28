// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.YoutuberModel;
import android.view.View;
import android.view.View$OnClickListener;

class YoutuberAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ YoutuberAdabter$ViewHolder this$1;
    final /* synthetic */ YoutuberAdabter val$this$0;
    
    YoutuberAdabter$ViewHolder$1(final YoutuberAdabter$ViewHolder this$1, final YoutuberAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (YoutuberAdabter.-$$Nest$fgetiYoutuber(this.this$1.this$0) != null) {
            YoutuberAdabter.-$$Nest$fgetiYoutuber(this.this$1.this$0).onClick(YoutuberAdabter.-$$Nest$fgetimages(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getLnk());
        }
    }
}
