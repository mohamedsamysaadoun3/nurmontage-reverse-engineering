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
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
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
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.IpadAdabter$ViewHolder;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.model.IpadItem;
import java.util.List;

public class IpadAdabter
extends RecyclerView.Adapter {
    public EditIpadFragment$IIpadEditCallback ipadEditCallback;
    private List ipadItems;
    private int ipad_selected;
    private boolean isGlass;
    private boolean isSubscribe;
    private int pos_select;

    static /* bridge */ /* synthetic */ List cfr_renamed_329(IpadAdabter ipadAdabter) {
        return ipadAdabter.ipadItems;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_331(IpadAdabter ipadAdabter) {
        return ipadAdabter.ipad_selected;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_327(IpadAdabter ipadAdabter) {
        return ipadAdabter.isGlass;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_303(IpadAdabter ipadAdabter) {
        return ipadAdabter.isSubscribe;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_320(IpadAdabter ipadAdabter) {
        return ipadAdabter.pos_select;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_330(IpadAdabter ipadAdabter, int n) {
        ipadAdabter.ipad_selected = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_328(IpadAdabter ipadAdabter, boolean bl) {
        ipadAdabter.isGlass = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_321(IpadAdabter ipadAdabter, int n) {
        ipadAdabter.pos_select = n;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_326(IpadAdabter ipadAdabter, int n) {
        return ipadAdabter.isManyOption(n);
    }

    public IpadAdabter(boolean bl, int n, int n2, EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, List list, boolean bl2) {
        this.ipadItems = list;
        this.pos_select = n;
        this.ipadEditCallback = editIpadFragment$IIpadEditCallback;
        this.ipad_selected = n2;
        this.isGlass = bl2;
        this.isSubscribe = bl;
    }

    private boolean isManyOption(int n) {
        int n2;
        int n3 = 1;
        if (n != 0 && n != n3 && n != (n2 = 7) && n != (n2 = 8) && n != (n2 = 9)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    private void updateDote(View view, View view2) {
        boolean bl = this.isGlass;
        float f = 0.5f;
        float f2 = 1.0f;
        if (bl) {
            view.setAlpha(f2);
            view2.setAlpha(f);
        } else {
            view2.setAlpha(f2);
            view.setAlpha(f);
        }
    }

    public int getItemCount() {
        List list = this.ipadItems;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPos_select() {
        return this.pos_select;
    }

    public void onBindViewHolder(IpadAdabter$ViewHolder ipadAdabter$ViewHolder, int n) {
        Object object = (IpadItem)this.ipadItems.get(n);
        RequestBuilder requestBuilder = Glide.with((View)ipadAdabter$ViewHolder.imageView).asBitmap();
        Integer n2 = ((IpadItem)object).getImg();
        requestBuilder = requestBuilder.load(n2);
        n2 = DiskCacheStrategy.NONE;
        requestBuilder = (RequestBuilder)requestBuilder.diskCacheStrategy((DiskCacheStrategy)n2);
        n2 = ipadAdabter$ViewHolder.imageView;
        requestBuilder.into((ImageView)n2);
        int n3 = this.isManyOption(n);
        n2 = null;
        int n4 = 8;
        if (n3 != 0) {
            ipadAdabter$ViewHolder.lyt_option.setVisibility(0);
            requestBuilder = ipadAdabter$ViewHolder.vDot1;
            View view = ipadAdabter$ViewHolder.vDot2;
            this.updateDote((View)requestBuilder, view);
        } else {
            requestBuilder = ipadAdabter$ViewHolder.lyt_option;
            requestBuilder.setVisibility(n4);
        }
        object = ((IpadItem)object).getIpadType();
        int n5 = ((Enum)object).ordinal();
        n3 = this.ipad_selected;
        if (n5 == n3) {
            object = ipadAdabter$ViewHolder.itemView;
            float f = 1.0f;
            object.setAlpha(f);
            object = ipadAdabter$ViewHolder.imageView;
            n3 = R$drawable.ipad_selected;
            object.setBackgroundResource(n3);
            this.pos_select = n;
        } else {
            object = ipadAdabter$ViewHolder.itemView;
            float f = 0.4f;
            object.setAlpha(f);
            object = ipadAdabter$ViewHolder.imageView;
            n3 = R$drawable.watch_btn_outline;
            object.setBackgroundResource(n3);
        }
        n5 = this.isSubscribe ? 1 : 0;
        if (n5 == 0) {
            n5 = 1;
            if (n > n5) {
                ipadAdabter$ViewHolder = ipadAdabter$ViewHolder.iv_pro;
                ipadAdabter$ViewHolder.setVisibility(0);
            } else {
                ipadAdabter$ViewHolder = ipadAdabter$ViewHolder.iv_pro;
                ipadAdabter$ViewHolder.setVisibility(n4);
            }
        }
    }

    public IpadAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_ipad;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new IpadAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

