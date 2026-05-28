// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.SquareImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class GalleryVideoAdabters$MyViewHolder extends RecyclerView$ViewHolder
{
    private SquareImageView imageView;
    final /* synthetic */ GalleryVideoAdabters this$0;
    private TextCustumFont tv_time;
    
    public GalleryVideoAdabters$MyViewHolder(final GalleryVideoAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (SquareImageView)view.findViewById(R$id.img);
        (this.tv_time = (TextCustumFont)view.findViewById(R$id.tv_time)).setVisibility(0);
        view.setOnClickListener((View$OnClickListener)new GalleryVideoAdabters$MyViewHolder$1(this, this$0));
    }
}
