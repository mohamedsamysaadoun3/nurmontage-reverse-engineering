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
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$ViewHolder;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.model.ItemDimension;
import java.util.List;

public class DimensionAdabters
extends RecyclerView.Adapter {
    private List listDim;
    private List mDimensionList;
    private DimensionAdabters$IDimensionCallback mIDimensionCallback;
    private int selected;

    static /* bridge */ /* synthetic */ List cfr_renamed_311(DimensionAdabters dimensionAdabters) {
        return dimensionAdabters.mDimensionList;
    }

    static /* bridge */ /* synthetic */ DimensionAdabters$IDimensionCallback cfr_renamed_308(DimensionAdabters dimensionAdabters) {
        return dimensionAdabters.mIDimensionCallback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_309(DimensionAdabters dimensionAdabters) {
        return dimensionAdabters.selected;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_310(DimensionAdabters dimensionAdabters, int n) {
        dimensionAdabters.selected = n;
    }

    public DimensionAdabters(List list, DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback, List list2) {
        this.selected = 0;
        this.mDimensionList = list;
        this.mIDimensionCallback = dimensionAdabters$IDimensionCallback;
        this.listDim = list2;
    }

    public DimensionAdabters(List list, DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback, List list2, int n) {
        this.mDimensionList = list;
        this.mIDimensionCallback = dimensionAdabters$IDimensionCallback;
        this.listDim = list2;
        this.selected = n;
    }

    public void clear() {
        List list = this.mDimensionList;
        if (list != null) {
            list.clear();
            this.mDimensionList = null;
        }
        this.mIDimensionCallback = null;
    }

    public int get() {
        List list = this.mDimensionList;
        int n = this.getSelected();
        return ((ItemDimension)list.get(n)).getResizeType().ordinal();
    }

    public int getItemCount() {
        List list = this.mDimensionList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public ResizeType getResizeSelected() {
        Object object = this.mDimensionList;
        if (object != null) {
            int n = this.getSelected();
            object = ((ItemDimension)object.get(n)).getResizeType();
        } else {
            object = ResizeType.SQUARE;
        }
        return object;
    }

    public int getSelected() {
        return this.selected;
    }

    public void onBindViewHolder(DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder, int n) {
        int n2;
        int n3;
        RequestBuilder requestBuilder = (String[])this.listDim.get(n);
        Object object = dimensionAdabters$ViewHolder.layout.getLayoutParams();
        object.width = n3 = ((Integer)requestBuilder.first).intValue();
        object = dimensionAdabters$ViewHolder.layout.getLayoutParams();
        object.height = n2 = ((Integer)requestBuilder.second).intValue();
        requestBuilder = ((ItemDimension)this.mDimensionList.get(n)).getName().split("\n");
        object = DimensionAdabters$ViewHolder.cfr_renamed_350(dimensionAdabters$ViewHolder);
        String string2 = requestBuilder[0];
        object.setText((CharSequence)string2);
        int n4 = ((String[])requestBuilder).length;
        n3 = 1;
        if (n4 > n3) {
            object = DimensionAdabters$ViewHolder.cfr_renamed_351(dimensionAdabters$ViewHolder);
            requestBuilder = requestBuilder[n3];
            object.setText((CharSequence)requestBuilder);
        }
        requestBuilder = (RequestBuilder)Glide.with((View)dimensionAdabters$ViewHolder.itemView).asBitmap().centerInside();
        object = DiskCacheStrategy.ALL;
        requestBuilder = (RequestBuilder)requestBuilder.diskCacheStrategy((DiskCacheStrategy)object);
        n4 = ((ItemDimension)this.mDimensionList.get(n)).getImage();
        object = n4;
        requestBuilder = requestBuilder.load((Integer)object);
        object = DimensionAdabters$ViewHolder.cfr_renamed_113(dimensionAdabters$ViewHolder);
        requestBuilder.into((ImageView)object);
        n2 = this.selected;
        if (n == n2) {
            dimensionAdabters$ViewHolder = dimensionAdabters$ViewHolder.layout;
            n = R$drawable.rect_btn_select;
            dimensionAdabters$ViewHolder.setBackgroundResource(n);
        } else {
            dimensionAdabters$ViewHolder = dimensionAdabters$ViewHolder.layout;
            n = R$drawable.rect_btn;
            dimensionAdabters$ViewHolder.setBackgroundResource(n);
        }
    }

    public DimensionAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_aspect;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder = new DimensionAdabters$ViewHolder(this, (View)viewGroup);
        return dimensionAdabters$ViewHolder;
    }

    public void setSelected(int n) {
        this.selected = n;
    }

    public void update(List list) {
        this.mDimensionList.clear();
        this.mDimensionList = list;
    }
}

