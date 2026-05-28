// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.RequestBuilder;
import android.view.View;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ImgAdapter extends RecyclerView$Adapter
{
    private final String APP_VERSION;
    private final List images;
    private final int size;
    
    public ImgAdapter(final String app_VERSION, final List images, final int size) {
        this.APP_VERSION = app_VERSION;
        this.images = images;
        this.size = size;
        this.setHasStableIds(true);
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
        return this.images.get(n);
    }
    
    public void onBindViewHolder(final ImgAdapter$ViewHolder imgAdapter$ViewHolder, final int n) {
        final RequestBuilder load = Glide.with((View)imgAdapter$ViewHolder.imageView).load(Integer.valueOf(this.images.get(n)));
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).centerCrop()).into(imgAdapter$ViewHolder.imageView);
    }
    
    public ImgAdapter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ImgAdapter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_img_bg, viewGroup, false));
    }
}
