// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

class AboutAdabters$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView imageView_1;
    public TextView textView;
    
    public AboutAdabters$ViewHolder(final View view) {
        super(view);
        this.textView = (TextView)view.findViewById(R$id.tv);
        this.imageView_1 = (ImageView)view.findViewById(R$id.img);
    }
}
