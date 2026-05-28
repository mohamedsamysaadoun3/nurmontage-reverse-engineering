// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.BgItem;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class BgAdapter$ViewHolder extends RecyclerView$ViewHolder
{
    ImageView imageView;
    final /* synthetic */ BgAdapter this$0;
    
    public BgAdapter$ViewHolder(final BgAdapter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (ImageView)view.findViewById(R$id.img);
        view.setOnClickListener((View$OnClickListener)new BgAdapter$ViewHolder$$ExternalSyntheticLambda0(this));
    }
}
