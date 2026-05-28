/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.ImgAdapter;

public class ImgAdapter$ViewHolder
extends RecyclerView.ViewHolder {
    ImageView imageView;
    final /* synthetic */ ImgAdapter this$0;

    public ImgAdapter$ViewHolder(ImgAdapter imgAdapter, View view) {
        this.this$0 = imgAdapter;
        super(view);
        int n = R$id.img;
        imgAdapter = (ImageView)view.findViewById(n);
        this.imageView = imgAdapter;
    }
}

