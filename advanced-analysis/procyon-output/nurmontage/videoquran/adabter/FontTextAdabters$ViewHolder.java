// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

class FontTextAdabters$ViewHolder extends RecyclerView$ViewHolder
{
    TextCustumFont nameFont;
    final /* synthetic */ FontTextAdabters this$0;
    TextCustumFont tvNumber;
    
    public FontTextAdabters$ViewHolder(final FontTextAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.nameFont = (TextCustumFont)view.findViewById(R$id.tv_font);
        this.tvNumber = (TextCustumFont)view.findViewById(R$id.tv_number);
        this.nameFont.setOnClickListener((View$OnClickListener)new FontTextAdabters$ViewHolder$1(this, this$0));
    }
}
