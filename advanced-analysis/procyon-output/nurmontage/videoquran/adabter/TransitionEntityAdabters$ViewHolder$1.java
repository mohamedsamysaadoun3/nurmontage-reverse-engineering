// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class TransitionEntityAdabters$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ TransitionEntityAdabters$ViewHolder this$1;
    final /* synthetic */ TransitionEntityAdabters val$this$0;
    
    TransitionEntityAdabters$ViewHolder$1(final TransitionEntityAdabters$ViewHolder this$1, final TransitionEntityAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (TransitionEntityAdabters.-$$Nest$fgetiTransition(this.this$1.this$0) != null) {
            if (!TransitionEntityAdabters.-$$Nest$fgetisSubscribe(this.this$1.this$0) && this.this$1.getAdapterPosition() > 10) {
                TransitionEntityAdabters.-$$Nest$fgetiTransition(this.this$1.this$0).toSubscribe();
                return;
            }
            if (TransitionEntityAdabters.-$$Nest$fgetselect(this.this$1.this$0) == this.this$1.getAdapterPosition()) {
                return;
            }
            final int -$$Nest$fgetselect = TransitionEntityAdabters.-$$Nest$fgetselect(this.this$1.this$0);
            TransitionEntityAdabters.-$$Nest$fputselect(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselect);
            this.this$1.this$0.notifyItemChanged(TransitionEntityAdabters.-$$Nest$fgetselect(this.this$1.this$0));
            if (TransitionEntityAdabters.-$$Nest$fgettype(this.this$1.this$0) != null) {
                if (TransitionEntityAdabters.-$$Nest$fgettype(this.this$1.this$0).equals("in")) {
                    TransitionEntityAdabters.-$$Nest$fgetiTransition(this.this$1.this$0).in(TransitionEntityAdabters.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getType(), TransitionEntityAdabters.-$$Nest$fgetentityQuranTimeline(this.this$1.this$0));
                }
                else if (TransitionEntityAdabters.-$$Nest$fgettype(this.this$1.this$0).equals("out")) {
                    TransitionEntityAdabters.-$$Nest$fgetiTransition(this.this$1.this$0).out(TransitionEntityAdabters.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getType(), TransitionEntityAdabters.-$$Nest$fgetentityQuranTimeline(this.this$1.this$0));
                }
            }
        }
    }
}
