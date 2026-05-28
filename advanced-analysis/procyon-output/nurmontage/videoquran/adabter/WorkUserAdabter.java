// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.R$drawable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.model.Template;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class WorkUserAdabter extends RecyclerView$Adapter
{
    private final String APP_VERSION;
    private int h;
    public WorkUserAdabter$IWorkUserCallback iWorkUserCallback;
    private List images;
    private int w;
    
    public WorkUserAdabter(final String app_VERSION, final List images, final WorkUserAdabter$IWorkUserCallback iWorkUserCallback, final int w, final int h) {
        this.images = images;
        this.iWorkUserCallback = iWorkUserCallback;
        this.w = w;
        this.h = h;
        this.APP_VERSION = app_VERSION;
    }
    
    public void add(final int n, final Template template) {
        try {
            final List images = this.images;
            try {
                if (n < images.size()) {
                    this.images.add(n, template);
                }
                else {
                    this.images.add(template);
                }
                try {
                    this.notifyItemInserted(n);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    public int getItemCount() {
        return this.images.size();
    }
    
    public void onBindViewHolder(final WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder, final int n) {
        final Template template = this.images.get(n);
        if (template.getFileInfo() != null) {
            WorkUserAdabter$ViewHolder.-$$Nest$fgettvName(workUserAdabter$ViewHolder).setText((CharSequence)template.getFileInfo().formattedDate);
            WorkUserAdabter$ViewHolder.-$$Nest$fgettvDate(workUserAdabter$ViewHolder).setText((CharSequence)template.getFileInfo().timedDate);
        }
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)Glide.with((View)workUserAdabter$ViewHolder.imageView).asBitmap().load(template.getUri_video()).frame(1000000L)).centerInside()).override(this.w, this.h)).diskCacheStrategy(DiskCacheStrategy.NONE)).signature((Key)new ObjectKey((Object)this.APP_VERSION))).placeholder(R$drawable.broken_image_24px)).into(workUserAdabter$ViewHolder.imageView);
    }
    
    public WorkUserAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new WorkUserAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_work_user, viewGroup, false));
    }
    
    public void remove(final int n) {
        try {
            final List images = this.images;
            try {
                if (n < images.size()) {
                    this.images.remove(n);
                }
                try {
                    this.notifyItemRemoved(n);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
