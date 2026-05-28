/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;

class IconQuranAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView animationItem;
    public ImageView disableView;
    final /* synthetic */ IconQuranAdabters this$0;

    public IconQuranAdabters$ViewHolder(IconQuranAdabters iconQuranAdabters, View view) {
        Object object;
        this.this$0 = iconQuranAdabters;
        super(view);
        int n = R$id.anim_item;
        this.animationItem = object = (ImageView)view.findViewById(n);
        n = R$id.iv_disable;
        this.disableView = object = (ImageView)view.findViewById(n);
        super(this, iconQuranAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

