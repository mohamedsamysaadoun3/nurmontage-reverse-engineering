// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.Template;
import android.view.View;
import android.view.View$OnClickListener;

class WorkUserAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ WorkUserAdabter$ViewHolder this$1;
    final /* synthetic */ WorkUserAdabter val$this$0;
    
    WorkUserAdabter$ViewHolder$1(final WorkUserAdabter$ViewHolder this$1, final WorkUserAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (this.this$1.this$0.iWorkUserCallback != null) {
            this.this$1.this$0.iWorkUserCallback.toMenu(WorkUserAdabter.-$$Nest$fgetimages(this.this$1.this$0).get(this.this$1.getAdapterPosition()), view, this.this$1.getAdapterPosition());
        }
    }
}
