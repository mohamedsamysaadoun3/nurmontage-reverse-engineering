/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$TransitionItem;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$ViewHolder;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;
import java.util.List;

public class TransitionBismilahAdabters
extends RecyclerView.Adapter {
    private EntityBismilahTimeline entityQuranTimeline;
    private EffectBismilahFragment$ITransition iTransition;
    private List list;
    private int max;
    private int select;
    private String type = "in";

    static /* bridge */ /* synthetic */ EntityBismilahTimeline cfr_renamed_174(TransitionBismilahAdabters transitionBismilahAdabters) {
        return transitionBismilahAdabters.entityQuranTimeline;
    }

    static /* bridge */ /* synthetic */ EffectBismilahFragment$ITransition cfr_renamed_173(TransitionBismilahAdabters transitionBismilahAdabters) {
        return transitionBismilahAdabters.iTransition;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_307(TransitionBismilahAdabters transitionBismilahAdabters) {
        return transitionBismilahAdabters.list;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_304(TransitionBismilahAdabters transitionBismilahAdabters) {
        return transitionBismilahAdabters.select;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_306(TransitionBismilahAdabters transitionBismilahAdabters) {
        return transitionBismilahAdabters.type;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_305(TransitionBismilahAdabters transitionBismilahAdabters, int n) {
        transitionBismilahAdabters.select = n;
    }

    public TransitionBismilahAdabters(EffectBismilahFragment$ITransition effectBismilahFragment$ITransition, List list, int n, EntityBismilahTimeline entityBismilahTimeline) {
        int n2;
        this.iTransition = effectBismilahFragment$ITransition;
        this.select = n;
        this.list = list;
        this.max = n2 = list.size();
        this.entityQuranTimeline = entityBismilahTimeline;
    }

    public int getItemCount() {
        return this.max;
    }

    public int getSelect() {
        return this.select;
    }

    public boolean isHaveSelect() {
        int n = this.select;
        int n2 = -1;
        n = n != n2 ? 1 : 0;
        return n != 0;
    }

    public void onBindViewHolder(TransitionBismilahAdabters$ViewHolder transitionBismilahAdabters$ViewHolder, int n) {
        ImageView imageView = transitionBismilahAdabters$ViewHolder.animationItem;
        float f = ((TransitionBismilahAdabters$TransitionItem)this.list.get(n)).getAngle();
        imageView.setRotation(f);
        imageView = transitionBismilahAdabters$ViewHolder.animationItem;
        TransitionBismilahAdabters$TransitionItem transitionBismilahAdabters$TransitionItem = (TransitionBismilahAdabters$TransitionItem)this.list.get(n);
        int n2 = transitionBismilahAdabters$TransitionItem.getId_ressource();
        imageView.setImageResource(n2);
        int n3 = this.select;
        if (n == n3) {
            transitionBismilahAdabters$ViewHolder = transitionBismilahAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            transitionBismilahAdabters$ViewHolder.setBackgroundResource(n);
        } else {
            transitionBismilahAdabters$ViewHolder = transitionBismilahAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            transitionBismilahAdabters$ViewHolder.setBackgroundResource(n);
        }
    }

    public TransitionBismilahAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_anim;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        TransitionBismilahAdabters$ViewHolder transitionBismilahAdabters$ViewHolder = new TransitionBismilahAdabters$ViewHolder(this, (View)viewGroup);
        return transitionBismilahAdabters$ViewHolder;
    }

    public void unselect() {
        int n = this.select;
        int n2 = -1;
        if (n == n2) {
            return;
        }
        this.select = n2;
        this.notifyItemChanged(n);
    }

    public void update(List list, String string2, int n) {
        int n2;
        this.select = n;
        this.list = list;
        this.type = string2;
        this.max = n2 = list.size();
        this.notifyDataSetChanged();
    }
}

