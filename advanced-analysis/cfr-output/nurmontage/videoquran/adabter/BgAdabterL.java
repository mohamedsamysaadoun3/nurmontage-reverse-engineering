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
 *  com.bumptech.glide.load.resource.bitmap.CenterCrop
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
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.BgAdabterL$ViewHolder;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.model.BgItem;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class BgAdabterL
extends RecyclerView.Adapter {
    private String APP_VERSION;
    public ChangeBgFragment$IChangeBgCallback iBgCallback;
    private List images;
    private int selected = 0;
    private int size;

    static /* bridge */ /* synthetic */ List cfr_renamed_316(BgAdabterL bgAdabterL) {
        return bgAdabterL.images;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_310(BgAdabterL bgAdabterL, int n) {
        bgAdabterL.selected = n;
    }

    public BgAdabterL(String string2, ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback, List list, int n) {
        this.images = list;
        this.size = n;
        this.iBgCallback = changeBgFragment$IChangeBgCallback;
        this.APP_VERSION = string2;
    }

    public void add(BgItem object) {
        List list = this.images;
        list.add(object);
        object = this.images;
        int n = object.size();
        try {
            this.notifyItemInserted(n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int getItemCount() {
        List list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPos_select() {
        return this.selected;
    }

    public void onBindViewHolder(BgAdabterL$ViewHolder bgAdabterL$ViewHolder, int n) {
        RequestBuilder requestBuilder = Glide.with((View)bgAdabterL$ViewHolder.imageView).asBitmap();
        Integer n2 = ((BgItem)this.images.get(n)).getId();
        n2 = requestBuilder.load(n2);
        int n3 = this.size;
        n2 = (RequestBuilder)n2.override(n3, n3);
        Transformation[] transformationArray = this.APP_VERSION;
        requestBuilder = new ObjectKey((Object)transformationArray);
        n2 = (RequestBuilder)n2.signature((Key)requestBuilder);
        requestBuilder = DiskCacheStrategy.NONE;
        n2 = (RequestBuilder)n2.diskCacheStrategy((DiskCacheStrategy)requestBuilder);
        transformationArray = new Transformation[2];
        CenterCrop centerCrop = new CenterCrop();
        transformationArray[0] = centerCrop;
        RoundedCornersTransformation.CornerType cornerType = RoundedCornersTransformation.CornerType.ALL;
        centerCrop = new RoundedCornersTransformation(8, 0, cornerType);
        transformationArray[1] = centerCrop;
        requestBuilder = new MultiTransformation(transformationArray);
        n2 = (RequestBuilder)n2.transform((Transformation)requestBuilder);
        bgAdabterL$ViewHolder = bgAdabterL$ViewHolder.imageView;
        n2.into((ImageView)bgAdabterL$ViewHolder);
    }

    public BgAdabterL$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_img_bg;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new BgAdabterL$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

