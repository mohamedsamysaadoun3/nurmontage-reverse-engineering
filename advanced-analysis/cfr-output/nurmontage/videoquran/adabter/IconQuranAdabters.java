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
import hazem.nurmontage.videoquran.Utils.DrawableHelper;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$ViewHolder;
import java.util.List;

public class IconQuranAdabters
extends RecyclerView.Adapter {
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private List list;
    private int select;

    static /* bridge */ /* synthetic */ IconQuranAdabters$IIconQuranCallback cfr_renamed_349(IconQuranAdabters iconQuranAdabters) {
        return iconQuranAdabters.iconQuranCallback;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_307(IconQuranAdabters iconQuranAdabters) {
        return iconQuranAdabters.list;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_304(IconQuranAdabters iconQuranAdabters) {
        return iconQuranAdabters.select;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_305(IconQuranAdabters iconQuranAdabters, int n) {
        iconQuranAdabters.select = n;
    }

    public IconQuranAdabters(IconQuranAdabters$IIconQuranCallback iconQuranAdabters$IIconQuranCallback, List list, int n) {
        this.iconQuranCallback = iconQuranAdabters$IIconQuranCallback;
        this.list = list;
        this.select = n;
        int n2 = list.size();
        if (n >= n2) {
            n2 = 0;
            iconQuranAdabters$IIconQuranCallback = null;
            this.select = 0;
        }
    }

    public int getItemCount() {
        List list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
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

    public void onBindViewHolder(IconQuranAdabters$ViewHolder iconQuranAdabters$ViewHolder, int n) {
        ImageView imageView = iconQuranAdabters$ViewHolder.animationItem;
        String string2 = (String)this.list.get(n);
        int n2 = DrawableHelper.getIDDrawableIconByName(string2);
        imageView.setImageResource(n2);
        int n3 = this.select;
        if (n == n3) {
            iconQuranAdabters$ViewHolder = iconQuranAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_item_menu_select;
            iconQuranAdabters$ViewHolder.setBackgroundResource(n);
        } else {
            iconQuranAdabters$ViewHolder = iconQuranAdabters$ViewHolder.animationItem;
            n = R$drawable.circle_effect;
            iconQuranAdabters$ViewHolder.setBackgroundResource(n);
        }
    }

    public IconQuranAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_anim;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        IconQuranAdabters$ViewHolder iconQuranAdabters$ViewHolder = new IconQuranAdabters$ViewHolder(this, (View)viewGroup);
        return iconQuranAdabters$ViewHolder;
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
}

