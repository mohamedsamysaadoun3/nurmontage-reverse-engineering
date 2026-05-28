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
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;

class TransitionBismilahAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView animationItem;
    public ImageView disableView;
    final /* synthetic */ TransitionBismilahAdabters this$0;

    public TransitionBismilahAdabters$ViewHolder(TransitionBismilahAdabters transitionBismilahAdabters, View view) {
        Object object;
        this.this$0 = transitionBismilahAdabters;
        super(view);
        int n = R$id.anim_item;
        this.animationItem = object = (ImageView)view.findViewById(n);
        n = R$id.iv_disable;
        this.disableView = object = (ImageView)view.findViewById(n);
        super(this, transitionBismilahAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

