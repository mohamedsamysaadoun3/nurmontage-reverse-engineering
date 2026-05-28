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
import java.util.List;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class BgAdabterL extends RecyclerView$Adapter
{
    private String APP_VERSION;
    public ChangeBgFragment$IChangeBgCallback iBgCallback;
    private List images;
    private int selected;
    private int size;
    
    public BgAdabterL(final String app_VERSION, final ChangeBgFragment$IChangeBgCallback iBgCallback, final List images, final int size) {
        this.selected = 0;
        this.images = images;
        this.size = size;
        this.iBgCallback = iBgCallback;
        this.APP_VERSION = app_VERSION;
    }
    
    public void add(final BgItem bgItem) {
        try {
            this.images.add(bgItem);
            final List images = this.images;
            try {
                this.notifyItemInserted(images.size());
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
    }
    
    public int getItemCount() {
        final List images = this.images;
        if (images == null) {
            return 0;
        }
        return images.size();
    }
    
    public int getPos_select() {
        return this.selected;
    }
    
    public void onBindViewHolder(final BgAdabterL$ViewHolder bgAdabterL$ViewHolder, final int n) {
        final RequestBuilder load = Glide.with((View)bgAdabterL$ViewHolder.imageView).asBitmap().load(Integer.valueOf(this.images.get(n).getId()));
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).transform((Transformation)new MultiTransformation(new Transformation[] { (Transformation)new CenterCrop(), (Transformation)new RoundedCornersTransformation(8, 0, RoundedCornersTransformation$CornerType.ALL) }))).into(bgAdabterL$ViewHolder.imageView);
    }
    
    public BgAdabterL$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new BgAdabterL$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_img_bg, viewGroup, false));
    }
}
