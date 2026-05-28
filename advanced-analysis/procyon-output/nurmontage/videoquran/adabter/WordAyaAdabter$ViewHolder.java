// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class WordAyaAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    private TextCustumFont text;
    final /* synthetic */ WordAyaAdabter this$0;
    
    public WordAyaAdabter$ViewHolder(final WordAyaAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        (this.text = (TextCustumFont)view.findViewById(R$id.word_aya)).setOnClickListener((View$OnClickListener)new WordAyaAdabter$ViewHolder$1(this, this$0));
    }
}
