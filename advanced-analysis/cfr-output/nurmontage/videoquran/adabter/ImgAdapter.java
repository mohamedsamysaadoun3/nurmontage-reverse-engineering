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
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.RequestManager
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.ImgAdapter$ViewHolder;
import java.util.List;

public class ImgAdapter
extends RecyclerView.Adapter {
    private final String APP_VERSION;
    private final List images;
    private final int size;

    public ImgAdapter(String string2, List list, int n) {
        this.APP_VERSION = string2;
        this.images = list;
        this.size = n;
        this.setHasStableIds(true);
    }

    public int getItemCount() {
        int n;
        List list = this.images;
        if (list == null) {
            n = 0;
            list = null;
        } else {
            n = list.size();
        }
        return n;
    }

    public long getItemId(int n) {
        return ((Integer)this.images.get(n)).intValue();
    }

    public void onBindViewHolder(ImgAdapter$ViewHolder imgAdapter$ViewHolder, int n) {
        RequestManager requestManager = Glide.with((View)imgAdapter$ViewHolder.imageView);
        Integer n2 = (Integer)this.images.get(n);
        n2 = requestManager.load(n2);
        int n3 = this.size;
        n2 = (RequestBuilder)n2.override(n3, n3);
        String string2 = this.APP_VERSION;
        requestManager = new ObjectKey((Object)string2);
        n2 = (RequestBuilder)n2.signature((Key)requestManager);
        requestManager = DiskCacheStrategy.NONE;
        n2 = (RequestBuilder)((RequestBuilder)n2.diskCacheStrategy((DiskCacheStrategy)requestManager)).centerCrop();
        imgAdapter$ViewHolder = imgAdapter$ViewHolder.imageView;
        n2.into((ImageView)imgAdapter$ViewHolder);
    }

    public ImgAdapter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_img_bg;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new ImgAdapter$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

