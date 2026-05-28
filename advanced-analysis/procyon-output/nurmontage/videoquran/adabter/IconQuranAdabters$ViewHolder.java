// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

class IconQuranAdabters$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView animationItem;
    public ImageView disableView;
    final /* synthetic */ IconQuranAdabters this$0;
    
    public IconQuranAdabters$ViewHolder(final IconQuranAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.animationItem = (ImageView)view.findViewById(R$id.anim_item);
        this.disableView = (ImageView)view.findViewById(R$id.iv_disable);
        view.setOnClickListener((View$OnClickListener)new IconQuranAdabters$ViewHolder$1(this, this$0));
    }
}
