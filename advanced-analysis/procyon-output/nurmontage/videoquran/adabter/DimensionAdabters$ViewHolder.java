// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

class DimensionAdabters$ViewHolder extends RecyclerView$ViewHolder
{
    private final TextCustumFont dimension;
    private final ImageView imageView;
    public FrameLayout layout;
    private final TextCustumFont name;
    final /* synthetic */ DimensionAdabters this$0;
    
    public DimensionAdabters$ViewHolder(final DimensionAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.layout = (FrameLayout)view.findViewById(R$id.layout);
        this.imageView = (ImageView)view.findViewById(R$id.icon);
        this.name = (TextCustumFont)view.findViewById(R$id.aspect_name);
        this.dimension = (TextCustumFont)view.findViewById(R$id.aspect_size);
        view.setOnClickListener((View$OnClickListener)new DimensionAdabters$ViewHolder$1(this, this$0));
    }
}
