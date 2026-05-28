// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.fragment.audio_effect.Reverbe;
import android.view.View;
import android.view.View$OnClickListener;

class ReverbeAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ ReverbeAdabter$ViewHolder this$1;
    final /* synthetic */ ReverbeAdabter val$this$0;
    
    ReverbeAdabter$ViewHolder$1(final ReverbeAdabter$ViewHolder this$1, final ReverbeAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (ReverbeAdabter.-$$Nest$fgetiReverbCallback(this.this$1.this$0) != null) {
            ReverbeAdabter.-$$Nest$fgetiReverbCallback(this.this$1.this$0).pause();
            if (ReverbeAdabter.-$$Nest$fgetselect(this.this$1.this$0) == this.this$1.getAdapterPosition()) {
                final int -$$Nest$fgetselect = ReverbeAdabter.-$$Nest$fgetselect(this.this$1.this$0);
                ReverbeAdabter.-$$Nest$fputselect(this.this$1.this$0, -1);
                this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselect);
                this.this$1.this$0.notifyItemChanged(this.this$1.getAdapterPosition());
                return;
            }
            final int -$$Nest$fgetselect2 = ReverbeAdabter.-$$Nest$fgetselect(this.this$1.this$0);
            ReverbeAdabter.-$$Nest$fputselect(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselect2);
            this.this$1.this$0.notifyItemChanged(ReverbeAdabter.-$$Nest$fgetselect(this.this$1.this$0));
            ReverbeAdabter.-$$Nest$fgetiReverbCallback(this.this$1.this$0).cmd(ReverbeAdabter.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()).getCmd_ffmpeg(), this.this$1.getAdapterPosition());
        }
    }
}
