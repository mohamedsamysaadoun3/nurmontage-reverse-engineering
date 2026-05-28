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
import hazem.nurmontage.videoquran.adabter.ColorAdabter;

public class ColorAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView;
    final /* synthetic */ ColorAdabter this$0;

    public ColorAdabter$ViewHolder(ColorAdabter colorAdabter, View view) {
        Object object;
        this.this$0 = colorAdabter;
        super(view);
        int n = R$id.image;
        this.imageView = object = (ImageView)view.findViewById(n);
        super(this, colorAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

