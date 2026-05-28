// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.R$drawable;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class TransitionBismilahAdabters extends RecyclerView$Adapter
{
    private EntityBismilahTimeline entityQuranTimeline;
    private EffectBismilahFragment$ITransition iTransition;
    private List list;
    private int max;
    private int select;
    private String type;
    
    public TransitionBismilahAdabters(final EffectBismilahFragment$ITransition iTransition, final List list, final int select, final EntityBismilahTimeline entityQuranTimeline) {
        this.type = "in";
        this.iTransition = iTransition;
        this.select = select;
        this.list = list;
        this.max = list.size();
        this.entityQuranTimeline = entityQuranTimeline;
    }
    
    public int getItemCount() {
        return this.max;
    }
    
    public int getSelect() {
        return this.select;
    }
    
    public boolean isHaveSelect() {
        return this.select != -1;
    }
    
    public void onBindViewHolder(final TransitionBismilahAdabters$ViewHolder transitionBismilahAdabters$ViewHolder, int n) {
        transitionBismilahAdabters$ViewHolder.animationItem.setRotation((float)this.list.get(n).getAngle());
        transitionBismilahAdabters$ViewHolder.animationItem.setImageResource(this.list.get(n).getId_ressource());
        if (n == this.select) {
            final ImageView animationItem = transitionBismilahAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            animationItem.setBackgroundResource(n);
        }
        else {
            final ImageView animationItem2 = transitionBismilahAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            animationItem2.setBackgroundResource(n);
        }
    }
    
    public TransitionBismilahAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new TransitionBismilahAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_anim, viewGroup, false));
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
    
    public void update(final List list, final String type, final int select) {
        this.select = select;
        this.list = list;
        this.type = type;
        this.max = list.size();
        this.notifyDataSetChanged();
    }
}
