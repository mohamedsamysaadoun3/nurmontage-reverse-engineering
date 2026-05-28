// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class ColorAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView imageView;
    final /* synthetic */ ColorAdabter this$0;
    
    public ColorAdabter$ViewHolder(final ColorAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (ImageView)view.findViewById(R$id.image);
        view.setOnClickListener((View$OnClickListener)new ColorAdabter$ViewHolder$1(this, this$0));
    }
}
