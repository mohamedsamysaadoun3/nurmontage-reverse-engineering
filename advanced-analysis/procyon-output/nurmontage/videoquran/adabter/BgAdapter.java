// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.load.MultiTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.RequestBuilder;
import android.view.View;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.model.BgItem;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.List;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class BgAdapter extends RecyclerView$Adapter
{
    private final String APP_VERSION;
    private final ChangeBgFragment$IChangeBgCallback iBgCallback;
    private final List images;
    private int selected;
    private final int size;
    
    public BgAdapter(final String app_VERSION, final ChangeBgFragment$IChangeBgCallback iBgCallback, final List images, final int size, final int selected) {
        this.APP_VERSION = app_VERSION;
        this.iBgCallback = iBgCallback;
        this.images = images;
        this.size = size;
        this.selected = selected;
        this.setHasStableIds(true);
    }
    
    private void applyState(final BgAdapter$ViewHolder bgAdapter$ViewHolder, int n) {
        if (n == this.selected) {
            n = 1;
        }
        else {
            n = 0;
        }
        float alpha;
        if (n != 0) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.65f;
        }
        if (n != 0) {
            bgAdapter$ViewHolder.itemView.setBackgroundResource(R$drawable.ipad_selected);
        }
        else {
            bgAdapter$ViewHolder.itemView.setBackgroundColor(0);
        }
        bgAdapter$ViewHolder.imageView.setAlpha(alpha);
    }
    
    public void add(final BgItem bgItem) {
        final int size = this.images.size();
        this.images.add(bgItem);
        this.notifyItemInserted(size);
    }
    
    public int getItemCount() {
        final List images = this.images;
        int size;
        if (images == null) {
            size = 0;
        }
        else {
            size = images.size();
        }
        return size;
    }
    
    public long getItemId(final int n) {
        return this.images.get(n).getId();
    }
    
    public int getSelectedPosition() {
        return this.selected;
    }
    
    public void onBindViewHolder(final BgAdapter$ViewHolder bgAdapter$ViewHolder, final int n) {
        this.applyState(bgAdapter$ViewHolder, n);
    }
    
    public void onBindViewHolder(final BgAdapter$ViewHolder bgAdapter$ViewHolder, final int n, final List list) {
        if (!list.isEmpty()) {
            this.applyState(bgAdapter$ViewHolder, n);
            return;
        }
        final RequestBuilder load = Glide.with((View)bgAdapter$ViewHolder.imageView).load(Integer.valueOf(this.images.get(n).getId()));
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).transform((Transformation)new MultiTransformation(new Transformation[] { (Transformation)new CenterCrop(), (Transformation)new RoundedCornersTransformation(10, 8) }))).into(bgAdapter$ViewHolder.imageView);
        this.applyState(bgAdapter$ViewHolder, n);
    }
    
    public BgAdapter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new BgAdapter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_img_bg, viewGroup, false));
    }
}
