// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class WorkUserAdabter$ViewHolder extends RecyclerView$ViewHolder
{
    private ImageButton btn_menu;
    public ImageView imageView;
    public ImageView iv_ratio;
    final /* synthetic */ WorkUserAdabter this$0;
    private TextView tvDate;
    private TextView tvName;
    
    public WorkUserAdabter$ViewHolder(final WorkUserAdabter this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.imageView = (ImageView)view.findViewById(R$id.imageView);
        this.btn_menu = (ImageButton)view.findViewById(R$id.btn_menu);
        this.iv_ratio = (ImageView)view.findViewById(R$id.iv_ratio);
        this.tvName = (TextView)view.findViewById(R$id.tv_name);
        this.tvDate = (TextView)view.findViewById(R$id.tv_date);
        this.btn_menu.setOnClickListener((View$OnClickListener)new WorkUserAdabter$ViewHolder$1(this, this$0));
        view.setOnClickListener((View$OnClickListener)new WorkUserAdabter$ViewHolder$2(this, this$0));
    }
}
