// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.DrawableHelper;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class IconQuranAdabters extends RecyclerView$Adapter
{
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private List list;
    private int select;
    
    public IconQuranAdabters(final IconQuranAdabters$IIconQuranCallback iconQuranCallback, final List list, final int select) {
        this.iconQuranCallback = iconQuranCallback;
        this.list = list;
        this.select = select;
        if (select >= list.size()) {
            this.select = 0;
        }
    }
    
    public int getItemCount() {
        final List list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
    
    public int getSelect() {
        return this.select;
    }
    
    public boolean isHaveSelect() {
        return this.select != -1;
    }
    
    public void onBindViewHolder(final IconQuranAdabters$ViewHolder iconQuranAdabters$ViewHolder, int n) {
        iconQuranAdabters$ViewHolder.animationItem.setImageResource(DrawableHelper.getIDDrawableIconByName(this.list.get(n)));
        if (n == this.select) {
            final ImageView animationItem = iconQuranAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            animationItem.setBackgroundResource(n);
        }
        else {
            final ImageView animationItem2 = iconQuranAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            animationItem2.setBackgroundResource(n);
        }
    }
    
    public IconQuranAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new IconQuranAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_anim, viewGroup, false));
    }
    
    public void unselect() {
        final int select = this.select;
        final int select2 = -1;
        if (select == select2) {
            return;
        }
        this.select = select2;
        this.notifyItemChanged(select);
    }
}
