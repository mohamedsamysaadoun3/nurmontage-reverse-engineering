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
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter;

public class YoutuberAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView;
    final /* synthetic */ YoutuberAdabter this$0;

    public YoutuberAdabter$ViewHolder(YoutuberAdabter youtuberAdabter, View view) {
        Object object;
        this.this$0 = youtuberAdabter;
        super(view);
        int n = R$id.img;
        this.imageView = object = (ImageView)view.findViewById(n);
        n = R$id.thumbnail_ytb;
        view.findViewById(n).setVisibility(0);
        super(this, youtuberAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

