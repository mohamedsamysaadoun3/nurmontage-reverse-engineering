// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.load.MultiTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation$CornerType;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.model.YoutuberModel;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class YoutuberAdabter extends RecyclerView$Adapter
{
    private String APP_VERSION;
    private int h;
    private YoutuberAdabter$IYoutuber iYoutuber;
    private List images;
    private int w;
    
    public YoutuberAdabter(final YoutuberAdabter$IYoutuber iYoutuber, final List images, final String app_VERSION, final int w, final int h) {
        this.images = images;
        this.APP_VERSION = app_VERSION;
        this.iYoutuber = iYoutuber;
        this.w = w;
        this.h = h;
    }
    
    public int getItemCount() {
        final List images = this.images;
        if (images == null) {
            return 0;
        }
        return images.size();
    }
    
    public void onBindViewHolder(final YoutuberAdabter$ViewHolder youtuberAdabter$ViewHolder, final int n) {
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)Glide.with((View)youtuberAdabter$ViewHolder.imageView).asBitmap().load(Integer.valueOf(this.images.get(n).getImg())).override(this.w, this.h)).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).transform((Transformation)new MultiTransformation(new Transformation[] { (Transformation)new RoundedCornersTransformation(8, 0, RoundedCornersTransformation$CornerType.ALL) }))).into(youtuberAdabter$ViewHolder.imageView);
    }
    
    public YoutuberAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new YoutuberAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_img_bg, viewGroup, false));
    }
}
