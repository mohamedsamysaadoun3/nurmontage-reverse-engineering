// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class FeaturesAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    private TextCustumFont text;
    final /* synthetic */ FeaturesAdabter this$0;
    
    public FeaturesAdabter$ViewHolder(final FeaturesAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.text = (TextCustumFont)view.findViewById(R$id.tv_feature);
    }
}
