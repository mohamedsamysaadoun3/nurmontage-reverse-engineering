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
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.MultiTransformation
 *  com.bumptech.glide.load.Transformation
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
 *  jp.wasabeef.glide.transformations.RoundedCornersTransformation
 *  jp.wasabeef.glide.transformations.RoundedCornersTransformation$CornerType
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
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$IYoutuber;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.YoutuberModel;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class YoutuberAdabter
extends RecyclerView.Adapter {
    private String APP_VERSION;
    private int h;
    private YoutuberAdabter$IYoutuber iYoutuber;
    private List images;
    private int w;

    static /* bridge */ /* synthetic */ YoutuberAdabter$IYoutuber cfr_renamed_344(YoutuberAdabter youtuberAdabter) {
        return youtuberAdabter.iYoutuber;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_316(YoutuberAdabter youtuberAdabter) {
        return youtuberAdabter.images;
    }

    public YoutuberAdabter(YoutuberAdabter$IYoutuber youtuberAdabter$IYoutuber, List list, String string2, int n, int n2) {
        this.images = list;
        this.APP_VERSION = string2;
        this.iYoutuber = youtuberAdabter$IYoutuber;
        this.w = n;
        this.h = n2;
    }

    public int getItemCount() {
        List list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void onBindViewHolder(YoutuberAdabter$ViewHolder youtuberAdabter$ViewHolder, int n) {
        RequestBuilder requestBuilder = Glide.with((View)youtuberAdabter$ViewHolder.imageView).asBitmap();
        Integer n2 = ((YoutuberModel)this.images.get(n)).getImg();
        n2 = requestBuilder.load(n2);
        int n3 = this.w;
        int n4 = this.h;
        n2 = (RequestBuilder)n2.override(n3, n4);
        Transformation[] transformationArray = this.APP_VERSION;
        requestBuilder = new ObjectKey((Object)transformationArray);
        n2 = (RequestBuilder)n2.signature((Key)requestBuilder);
        requestBuilder = DiskCacheStrategy.NONE;
        n2 = (RequestBuilder)n2.diskCacheStrategy((DiskCacheStrategy)requestBuilder);
        transformationArray = new Transformation[1];
        RoundedCornersTransformation.CornerType cornerType = RoundedCornersTransformation.CornerType.ALL;
        RoundedCornersTransformation roundedCornersTransformation = new RoundedCornersTransformation(8, 0, cornerType);
        transformationArray[0] = roundedCornersTransformation;
        requestBuilder = new MultiTransformation(transformationArray);
        n2 = (RequestBuilder)n2.transform((Transformation)requestBuilder);
        youtuberAdabter$ViewHolder = youtuberAdabter$ViewHolder.imageView;
        n2.into((ImageView)youtuberAdabter$ViewHolder);
    }

    public YoutuberAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_img_bg;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new YoutuberAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

