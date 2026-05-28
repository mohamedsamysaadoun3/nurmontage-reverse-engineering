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
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters$TransitionItem;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters$ViewHolder;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import java.util.List;

public class TransitionEntityAdabters
extends RecyclerView.Adapter {
    private EntityQuranTimeline entityQuranTimeline;
    private EffectAyaFragment$ITransition iTransition;
    private boolean isSubscribe;
    private List list;
    private int max;
    private int select;
    private String type = "in";

    static /* bridge */ /* synthetic */ EntityQuranTimeline cfr_renamed_174(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.entityQuranTimeline;
    }

    static /* bridge */ /* synthetic */ EffectAyaFragment$ITransition cfr_renamed_173(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.iTransition;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_303(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.isSubscribe;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_307(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.list;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_304(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.select;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_306(TransitionEntityAdabters transitionEntityAdabters) {
        return transitionEntityAdabters.type;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_305(TransitionEntityAdabters transitionEntityAdabters, int n) {
        transitionEntityAdabters.select = n;
    }

    public TransitionEntityAdabters(boolean bl, EffectAyaFragment$ITransition effectAyaFragment$ITransition, List list, int n, EntityQuranTimeline entityQuranTimeline) {
        int n2;
        this.iTransition = effectAyaFragment$ITransition;
        this.select = n;
        this.list = list;
        this.max = n2 = list.size();
        this.isSubscribe = bl;
        this.entityQuranTimeline = entityQuranTimeline;
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

    public void onBindViewHolder(TransitionEntityAdabters$ViewHolder transitionEntityAdabters$ViewHolder, int n) {
        TransitionEntityAdabters$TransitionItem transitionEntityAdabters$TransitionItem;
        float f;
        int n2;
        ImageView imageView;
        int n3 = this.isSubscribe;
        if (n3 == 0) {
            n3 = 10;
            if (n > n3) {
                imageView = transitionEntityAdabters$ViewHolder.disableView;
                n2 = 0;
                f = 0.0f;
                transitionEntityAdabters$TransitionItem = null;
                imageView.setVisibility(0);
            } else {
                imageView = transitionEntityAdabters$ViewHolder.disableView;
                n2 = 8;
                f = 1.1E-44f;
                imageView.setVisibility(n2);
            }
        }
        imageView = transitionEntityAdabters$ViewHolder.animationItem;
        f = ((TransitionEntityAdabters$TransitionItem)this.list.get(n)).getAngle();
        imageView.setRotation(f);
        imageView = transitionEntityAdabters$ViewHolder.animationItem;
        transitionEntityAdabters$TransitionItem = (TransitionEntityAdabters$TransitionItem)this.list.get(n);
        n2 = transitionEntityAdabters$TransitionItem.getId_ressource();
        imageView.setImageResource(n2);
        n3 = this.select;
        if (n == n3) {
            transitionEntityAdabters$ViewHolder = transitionEntityAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            transitionEntityAdabters$ViewHolder.setBackgroundResource(n);
        } else {
            transitionEntityAdabters$ViewHolder = transitionEntityAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            transitionEntityAdabters$ViewHolder.setBackgroundResource(n);
        }
    }

    public TransitionEntityAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_anim;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        TransitionEntityAdabters$ViewHolder transitionEntityAdabters$ViewHolder = new TransitionEntityAdabters$ViewHolder(this, (View)viewGroup);
        return transitionEntityAdabters$ViewHolder;
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

