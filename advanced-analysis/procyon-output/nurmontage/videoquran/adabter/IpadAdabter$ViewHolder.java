// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class IpadAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    public ImageView imageView;
    public ImageView iv_pro;
    public LinearLayout lyt_option;
    final /* synthetic */ IpadAdabter this$0;
    public View vDot1;
    public View vDot2;
    
    public IpadAdabter$ViewHolder(final IpadAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.iv_pro = (ImageView)view.findViewById(R$id.iv_pro);
        this.lyt_option = (LinearLayout)view.findViewById(R$id.view_option);
        this.imageView = (ImageView)view.findViewById(R$id.img);
        this.vDot1 = view.findViewById(R$id.dot1);
        this.vDot2 = view.findViewById(R$id.dot2);
        view.setOnClickListener((View$OnClickListener)new IpadAdabter$ViewHolder$1(this, this$0));
    }
}
