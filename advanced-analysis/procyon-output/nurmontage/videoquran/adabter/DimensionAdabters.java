// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.R$drawable;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.model.ItemDimension;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class DimensionAdabters extends RecyclerView$Adapter
{
    private List listDim;
    private List mDimensionList;
    private DimensionAdabters$IDimensionCallback mIDimensionCallback;
    private int selected;
    
    public DimensionAdabters(final List mDimensionList, final DimensionAdabters$IDimensionCallback miDimensionCallback, final List listDim) {
        this.selected = 0;
        this.mDimensionList = mDimensionList;
        this.mIDimensionCallback = miDimensionCallback;
        this.listDim = listDim;
    }
    
    public DimensionAdabters(final List mDimensionList, final DimensionAdabters$IDimensionCallback miDimensionCallback, final List listDim, final int selected) {
        this.mDimensionList = mDimensionList;
        this.mIDimensionCallback = miDimensionCallback;
        this.listDim = listDim;
        this.selected = selected;
    }
    
    public void clear() {
        final List mDimensionList = this.mDimensionList;
        if (mDimensionList != null) {
            mDimensionList.clear();
            this.mDimensionList = null;
        }
        this.mIDimensionCallback = null;
    }
    
    public int get() {
        return this.mDimensionList.get(this.getSelected()).getResizeType().ordinal();
    }
    
    public int getItemCount() {
        final List mDimensionList = this.mDimensionList;
        if (mDimensionList != null) {
            return mDimensionList.size();
        }
        return 0;
    }
    
    public ResizeType getResizeSelected() {
        final List mDimensionList = this.mDimensionList;
        ResizeType resizeType;
        if (mDimensionList != null) {
            resizeType = mDimensionList.get(this.getSelected()).getResizeType();
        }
        else {
            resizeType = ResizeType.SQUARE;
        }
        return resizeType;
    }
    
    public int getSelected() {
        return this.selected;
    }
    
    public void onBindViewHolder(final DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder, int n) {
        final Pair pair = this.listDim.get(n);
        dimensionAdabters$ViewHolder.layout.getLayoutParams().width = (int)pair.first;
        dimensionAdabters$ViewHolder.layout.getLayoutParams().height = (int)pair.second;
        final String[] split = this.mDimensionList.get(n).getName().split("\n");
        DimensionAdabters$ViewHolder.-$$Nest$fgetname(dimensionAdabters$ViewHolder).setText((CharSequence)split[0]);
        final int length = split.length;
        final int n2 = 1;
        if (length > n2) {
            DimensionAdabters$ViewHolder.-$$Nest$fgetdimension(dimensionAdabters$ViewHolder).setText((CharSequence)split[n2]);
        }
        ((RequestBuilder)((RequestBuilder)Glide.with(dimensionAdabters$ViewHolder.itemView).asBitmap().centerInside()).diskCacheStrategy(DiskCacheStrategy.ALL)).load(Integer.valueOf(this.mDimensionList.get(n).getImage())).into(DimensionAdabters$ViewHolder.-$$Nest$fgetimageView(dimensionAdabters$ViewHolder));
        if (n == this.selected) {
            final FrameLayout layout = dimensionAdabters$ViewHolder.layout;
            n = R$drawable.rect_btn_select;
            layout.setBackgroundResource(n);
        }
        else {
            final FrameLayout layout2 = dimensionAdabters$ViewHolder.layout;
            n = R$drawable.rect_btn;
            layout2.setBackgroundResource(n);
        }
    }
    
    public DimensionAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new DimensionAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_aspect, viewGroup, false));
    }
    
    public void setSelected(final int selected) {
        this.selected = selected;
    }
    
    public void update(final List mDimensionList) {
        this.mDimensionList.clear();
        this.mDimensionList = mDimensionList;
    }
}
