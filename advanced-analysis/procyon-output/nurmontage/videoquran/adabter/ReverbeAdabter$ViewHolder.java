// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class ReverbeAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    private ImageView iv_btn_play;
    private TextCustumFont text;
    final /* synthetic */ ReverbeAdabter this$0;
    
    public ReverbeAdabter$ViewHolder(final ReverbeAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.text = (TextCustumFont)view.findViewById(R$id.word_aya);
        this.iv_btn_play = (ImageView)view.findViewById(R$id.iv_btn_play);
        view.setOnClickListener((View$OnClickListener)new ReverbeAdabter$ViewHolder$1(this, this$0));
    }
}
