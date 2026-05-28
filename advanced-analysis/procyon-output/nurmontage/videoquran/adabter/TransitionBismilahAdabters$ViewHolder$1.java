// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class TransitionBismilahAdabters$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ TransitionBismilahAdabters$ViewHolder this$1;
    final /* synthetic */ TransitionBismilahAdabters val$this$0;
    
    TransitionBismilahAdabters$ViewHolder$1(final TransitionBismilahAdabters$ViewHolder this$1, final TransitionBismilahAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (TransitionBismilahAdabters.-$$Nest$fgetiTransition(this.this$1.this$0) != null) {
            if (TransitionBismilahAdabters.-$$Nest$fgetselect(this.this$1.this$0) == this.this$1.getAdapterPosition()) {
                return;
            }
            final int -$$Nest$fgetselect = TransitionBismilahAdabters.-$$Nest$fgetselect(this.this$1.this$0);
            TransitionBismilahAdabters.-$$Nest$fputselect(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselect);
            this.this$1.this$0.notifyItemChanged(TransitionBismilahAdabters.-$$Nest$fgetselect(this.this$1.this$0));
            if (TransitionBismilahAdabters.-$$Nest$fgettype(this.this$1.this$0) != null) {
                if (TransitionBismilahAdabters.-$$Nest$fgettype(this.this$1.this$0).equals("in")) {
                    TransitionBismilahAdabters.-$$Nest$fgetiTransition(this.this$1.this$0).in(TransitionBismilahAdabters.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getType(), TransitionBismilahAdabters.-$$Nest$fgetentityQuranTimeline(this.this$1.this$0));
                }
                else if (TransitionBismilahAdabters.-$$Nest$fgettype(this.this$1.this$0).equals("out")) {
                    TransitionBismilahAdabters.-$$Nest$fgetiTransition(this.this$1.this$0).out(TransitionBismilahAdabters.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getType(), TransitionBismilahAdabters.-$$Nest$fgetentityQuranTimeline(this.this$1.this$0));
                }
            }
        }
    }
}
