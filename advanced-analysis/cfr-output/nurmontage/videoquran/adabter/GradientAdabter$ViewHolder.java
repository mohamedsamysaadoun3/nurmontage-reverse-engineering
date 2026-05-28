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
import hazem.nurmontage.videoquran.adabter.GradientAdabter;

public class GradientAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageLayer;
    public ImageView imageView;
    final /* synthetic */ GradientAdabter this$0;

    public GradientAdabter$ViewHolder(GradientAdabter gradientAdabter, View view) {
        Object object;
        this.this$0 = gradientAdabter;
        super(view);
        int n = R$id.image;
        this.imageView = object = (ImageView)view.findViewById(n);
        n = R$id.layer;
        this.imageLayer = object = (ImageView)view.findViewById(n);
        gradientAdabter.setGradientBackground((View)object, -1895825408);
        super(this, gradientAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

