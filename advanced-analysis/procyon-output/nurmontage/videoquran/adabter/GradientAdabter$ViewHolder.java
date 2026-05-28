// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class GradientAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView imageLayer;
    public ImageView imageView;
    final /* synthetic */ GradientAdabter this$0;
    
    public GradientAdabter$ViewHolder(final GradientAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (ImageView)view.findViewById(R$id.image);
        this$0.setGradientBackground((View)(this.imageLayer = (ImageView)view.findViewById(R$id.layer)), -1895825408);
        view.setOnClickListener((View$OnClickListener)new GradientAdabter$ViewHolder$1(this, this$0));
    }
}
