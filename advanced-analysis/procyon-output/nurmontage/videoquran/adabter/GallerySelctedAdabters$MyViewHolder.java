// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.SquareImageView;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class GallerySelctedAdabters$MyViewHolder extends RecyclerView$ViewHolder
{
    private ImageButton btnDeleted;
    private SquareImageView imageView;
    final /* synthetic */ GallerySelctedAdabters this$0;
    private TextCustumFont tv_time;
    
    public GallerySelctedAdabters$MyViewHolder(final GallerySelctedAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (SquareImageView)view.findViewById(R$id.img);
        this.tv_time = (TextCustumFont)view.findViewById(R$id.tv_time);
        (this.btnDeleted = (ImageButton)view.findViewById(R$id.btn_deleted)).setVisibility(0);
        this.tv_time.setVisibility(0);
        this.btnDeleted.setOnClickListener((View$OnClickListener)new GallerySelctedAdabters$MyViewHolder$1(this, this$0));
    }
}
