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
import hazem.nurmontage.videoquran.adabter.BgAdabterL;

public class BgAdabterL$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView;
    final /* synthetic */ BgAdabterL this$0;

    public BgAdabterL$ViewHolder(BgAdabterL bgAdabterL, View view) {
        Object object;
        this.this$0 = bgAdabterL;
        super(view);
        int n = R$id.img;
        this.imageView = object = (ImageView)view.findViewById(n);
        super(this, bgAdabterL);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

