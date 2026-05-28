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
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter;

public class ColorBgAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView;
    final /* synthetic */ ColorBgAdabter this$0;

    public ColorBgAdabter$ViewHolder(ColorBgAdabter colorBgAdabter, View view) {
        Object object;
        this.this$0 = colorBgAdabter;
        super(view);
        int n = R$id.image;
        this.imageView = object = (ImageView)view.findViewById(n);
        super(this, colorBgAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

