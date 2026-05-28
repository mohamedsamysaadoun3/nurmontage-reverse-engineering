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
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.BgAdapter$ViewHolder;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.model.BgItem;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class BgAdapter
extends RecyclerView.Adapter {
    private final String APP_VERSION;
    private final ChangeBgFragment$IChangeBgCallback iBgCallback;
    private final List images;
    private int selected;
    private final int size;

    static /* bridge */ /* synthetic */ ChangeBgFragment$IChangeBgCallback cfr_renamed_333(BgAdapter bgAdapter) {
        return bgAdapter.iBgCallback;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_316(BgAdapter bgAdapter) {
        return bgAdapter.images;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_309(BgAdapter bgAdapter) {
        return bgAdapter.selected;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_310(BgAdapter bgAdapter, int n) {
        bgAdapter.selected = n;
    }

    public BgAdapter(String string2, ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback, List list, int n, int n2) {
        this.APP_VERSION = string2;
        this.iBgCallback = changeBgFragment$IChangeBgCallback;
        this.images = list;
        this.size = n;
        this.selected = n2;
        this.setHasStableIds(true);
    }

    private void applyState(BgAdapter$ViewHolder bgAdapter$ViewHolder, int n) {
        float f;
        View view;
        int n2 = this.selected;
        int n3 = 0;
        if (n == n2) {
            n = 1;
        } else {
            n = 0;
            view = null;
        }
        if (n != 0) {
            n2 = 1065353216;
            f = 1.0f;
        } else {
            n2 = 1059481190;
            f = 0.65f;
        }
        if (n != 0) {
            view = bgAdapter$ViewHolder.itemView;
            n3 = R$drawable.ipad_selected;
            view.setBackgroundResource(n3);
        } else {
            view = bgAdapter$ViewHolder.itemView;
            view.setBackgroundColor(0);
        }
        bgAdapter$ViewHolder.imageView.setAlpha(f);
    }

    public void add(BgItem bgItem) {
        int n = this.images.size();
        this.images.add(bgItem);
        this.notifyItemInserted(n);
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
        return ((BgItem)this.images.get(n)).getId();
    }

    public int getSelectedPosition() {
        return this.selected;
    }

    public void onBindViewHolder(BgAdapter$ViewHolder bgAdapter$ViewHolder, int n) {
        this.applyState(bgAdapter$ViewHolder, n);
    }

    public void onBindViewHolder(BgAdapter$ViewHolder bgAdapter$ViewHolder, int n, List list) {
        boolean bl = list.isEmpty();
        if (!bl) {
            this.applyState(bgAdapter$ViewHolder, n);
            return;
        }
        list = Glide.with((View)bgAdapter$ViewHolder.imageView);
        Integer n2 = ((BgItem)this.images.get(n)).getId();
        list = list.load(n2);
        int n3 = this.size;
        list = (RequestBuilder)list.override(n3, n3);
        Transformation[] transformationArray = this.APP_VERSION;
        n2 = new ObjectKey((Object)transformationArray);
        list = (RequestBuilder)list.signature((Key)n2);
        n2 = DiskCacheStrategy.NONE;
        list = (RequestBuilder)list.diskCacheStrategy((DiskCacheStrategy)n2);
        transformationArray = new Transformation[2];
        CenterCrop centerCrop = new CenterCrop();
        transformationArray[0] = centerCrop;
        centerCrop = new RoundedCornersTransformation(10, 8);
        transformationArray[1] = centerCrop;
        n2 = new MultiTransformation(transformationArray);
        list = (RequestBuilder)list.transform((Transformation)n2);
        n2 = bgAdapter$ViewHolder.imageView;
        list.into((ImageView)n2);
        this.applyState(bgAdapter$ViewHolder, n);
    }

    public BgAdapter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_img_bg;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new BgAdapter$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

