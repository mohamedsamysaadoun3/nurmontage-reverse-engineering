/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;

class AboutAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView_1;
    public TextView textView;

    public AboutAdabters$ViewHolder(View view) {
        super(view);
        TextView textView;
        int n = R$id.tv;
        this.textView = textView = (TextView)view.findViewById(n);
        n = R$id.img;
        view = (ImageView)view.findViewById(n);
        this.imageView_1 = view;
    }
}

