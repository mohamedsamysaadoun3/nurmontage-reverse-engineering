// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.IpadItem;
import android.view.View;
import android.view.View$OnClickListener;

class IpadAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ IpadAdabter$ViewHolder this$1;
    final /* synthetic */ IpadAdabter val$this$0;
    
    IpadAdabter$ViewHolder$1(final IpadAdabter$ViewHolder this$1, final IpadAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        final int -$$Nest$fgetpos_select = IpadAdabter.-$$Nest$fgetpos_select(this.this$1.this$0);
        final int adapterPosition = this.this$1.getAdapterPosition();
        final int n = 1;
        if (-$$Nest$fgetpos_select == adapterPosition) {
            if (!IpadAdabter.-$$Nest$misManyOption(this.this$1.this$0, this.this$1.getAdapterPosition())) {
                return;
            }
            IpadAdabter.-$$Nest$fputisGlass(this.this$1.this$0, (boolean)(((IpadAdabter.-$$Nest$fgetisGlass(this.this$1.this$0) ? 1 : 0) ^ n) != 0x0));
            this.this$1.this$0.ipadEditCallback.onGlassType(IpadAdabter.-$$Nest$fgetisGlass(this.this$1.this$0));
        }
        if (!IpadAdabter.-$$Nest$fgetisSubscribe(this.this$1.this$0) && this.this$1.getAdapterPosition() > n) {
            this.this$1.this$0.ipadEditCallback.onDialogPremium();
            return;
        }
        if (this.this$1.this$0.ipadEditCallback != null) {
            final IpadItem ipadItem = IpadAdabter.-$$Nest$fgetipadItems(this.this$1.this$0).get(this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(IpadAdabter.-$$Nest$fgetpos_select(this.this$1.this$0));
            IpadAdabter.-$$Nest$fputpos_select(this.this$1.this$0, this.this$1.getAdapterPosition());
            IpadAdabter.-$$Nest$fputipad_selected(this.this$1.this$0, ipadItem.getIpadType().ordinal());
            this.this$1.this$0.notifyItemChanged(IpadAdabter.-$$Nest$fgetpos_select(this.this$1.this$0));
            this.this$1.this$0.ipadEditCallback.onChangeType(IpadAdabter.-$$Nest$fgetipad_selected(this.this$1.this$0));
        }
    }
}
