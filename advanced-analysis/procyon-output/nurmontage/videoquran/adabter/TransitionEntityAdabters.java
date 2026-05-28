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
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class TransitionEntityAdabters extends RecyclerView$Adapter
{
    private EntityQuranTimeline entityQuranTimeline;
    private EffectAyaFragment$ITransition iTransition;
    private boolean isSubscribe;
    private List list;
    private int max;
    private int select;
    private String type;
    
    public TransitionEntityAdabters(final boolean isSubscribe, final EffectAyaFragment$ITransition iTransition, final List list, final int select, final EntityQuranTimeline entityQuranTimeline) {
        this.type = "in";
        this.iTransition = iTransition;
        this.select = select;
        this.list = list;
        this.max = list.size();
        this.isSubscribe = isSubscribe;
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
    
    public void onBindViewHolder(final TransitionEntityAdabters$ViewHolder transitionEntityAdabters$ViewHolder, int n) {
        if (!this.isSubscribe) {
            if (n > 10) {
                transitionEntityAdabters$ViewHolder.disableView.setVisibility(0);
            }
            else {
                transitionEntityAdabters$ViewHolder.disableView.setVisibility(8);
            }
        }
        transitionEntityAdabters$ViewHolder.animationItem.setRotation((float)this.list.get(n).getAngle());
        transitionEntityAdabters$ViewHolder.animationItem.setImageResource(this.list.get(n).getId_ressource());
        if (n == this.select) {
            final ImageView animationItem = transitionEntityAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            animationItem.setBackgroundResource(n);
        }
        else {
            final ImageView animationItem2 = transitionEntityAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            animationItem2.setBackgroundResource(n);
        }
    }
    
    public TransitionEntityAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new TransitionEntityAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_anim, viewGroup, false));
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
