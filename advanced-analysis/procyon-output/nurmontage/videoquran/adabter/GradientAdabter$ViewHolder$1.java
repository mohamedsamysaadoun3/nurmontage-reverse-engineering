// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.Gradient;
import android.view.View;
import android.view.View$OnClickListener;

class GradientAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ GradientAdabter$ViewHolder this$1;
    final /* synthetic */ GradientAdabter val$this$0;
    
    GradientAdabter$ViewHolder$1(final GradientAdabter$ViewHolder this$1, final GradientAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (this.this$1.this$0.iColorCallback != null) {
            if (!GradientAdabter.-$$Nest$fgetisSubscribe(this.this$1.this$0) && this.this$1.getAdapterPosition() > 1) {
                return;
            }
            if (GradientAdabter.-$$Nest$fgetpos_select(this.this$1.this$0) == this.this$1.getAdapterPosition()) {
                return;
            }
            final int -$$Nest$fgetpos_select = GradientAdabter.-$$Nest$fgetpos_select(this.this$1.this$0);
            GradientAdabter.-$$Nest$fputpos_select(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetpos_select);
            this.this$1.this$0.notifyItemChanged(GradientAdabter.-$$Nest$fgetpos_select(this.this$1.this$0));
            this.this$1.this$0.iColorCallback.onGradient(GradientAdabter.-$$Nest$fgetcolors(this.this$1.this$0).get(this.this$1.getAdapterPosition()), this.this$1.getAdapterPosition());
        }
    }
}
