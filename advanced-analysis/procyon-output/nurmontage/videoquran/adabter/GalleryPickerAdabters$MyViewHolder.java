// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.SquareImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class GalleryPickerAdabters$MyViewHolder extends RecyclerView$ViewHolder
{
    private SquareImageView imageView;
    final /* synthetic */ GalleryPickerAdabters this$0;
    
    public GalleryPickerAdabters$MyViewHolder(final GalleryPickerAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (SquareImageView)view.findViewById(R$id.img);
        view.setOnClickListener((View$OnClickListener)new GalleryPickerAdabters$MyViewHolder$1(this, this$0));
    }
}
