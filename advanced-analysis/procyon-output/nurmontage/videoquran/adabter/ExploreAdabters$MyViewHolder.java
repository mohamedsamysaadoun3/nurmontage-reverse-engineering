// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class ExploreAdabters$MyViewHolder extends RecyclerView$ViewHolder
{
    private SquareImageViewSimple imageView;
    final /* synthetic */ ExploreAdabters this$0;
    private TextCustumFont tv_name;
    private TextCustumFont tv_size;
    
    public ExploreAdabters$MyViewHolder(final ExploreAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (SquareImageViewSimple)view.findViewById(R$id.img);
        this.tv_name = (TextCustumFont)view.findViewById(R$id.tv_name);
        this.tv_size = (TextCustumFont)view.findViewById(R$id.tv_size);
        view.setOnClickListener((View$OnClickListener)new ExploreAdabters$MyViewHolder$1(this, this$0));
    }
}
