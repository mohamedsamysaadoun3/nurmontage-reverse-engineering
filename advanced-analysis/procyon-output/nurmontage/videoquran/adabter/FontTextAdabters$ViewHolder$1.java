// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class FontTextAdabters$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ FontTextAdabters$ViewHolder this$1;
    final /* synthetic */ FontTextAdabters val$this$0;
    
    FontTextAdabters$ViewHolder$1(final FontTextAdabters$ViewHolder this$1, final FontTextAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (FontTextAdabters.-$$Nest$fgetiFontCallback(this.this$1.this$0) != null) {
            if (FontTextAdabters.-$$Nest$fgetselected(this.this$1.this$0) != this.this$1.getAdapterPosition()) {
                final int -$$Nest$fgetselected = FontTextAdabters.-$$Nest$fgetselected(this.this$1.this$0);
                FontTextAdabters.-$$Nest$fputselected(this.this$1.this$0, this.this$1.getAdapterPosition());
                this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselected);
                this.this$1.this$0.notifyItemChanged(FontTextAdabters.-$$Nest$fgetselected(this.this$1.this$0));
                final String s = FontTextAdabters.-$$Nest$fgetfontList(this.this$1.this$0).get(FontTextAdabters.-$$Nest$fgetselected(this.this$1.this$0));
                FontTextAdabters.-$$Nest$fgetiFontCallback(this.this$1.this$0).onAdd(FontTextAdabters.-$$Nest$fgetfontProvider(this.this$1.this$0).getFullName(s), FontTextAdabters.-$$Nest$fgetfontProvider(this.this$1.this$0).getTypeface(s));
            }
        }
    }
}
