// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class YoutuberAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView imageView;
    final /* synthetic */ YoutuberAdabter this$0;
    
    public YoutuberAdabter$ViewHolder(final YoutuberAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (ImageView)view.findViewById(R$id.img);
        view.findViewById(R$id.thumbnail_ytb).setVisibility(0);
        view.setOnClickListener((View$OnClickListener)new YoutuberAdabter$ViewHolder$1(this, this$0));
    }
}
