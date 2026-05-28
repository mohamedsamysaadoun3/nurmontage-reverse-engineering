// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.Glide;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class AboutAdabters extends RecyclerView$Adapter
{
    private final String APP_VERSION;
    private final Context mContext;
    private final int mDimensionH;
    private final int mDimensionW;
    private final List mModelAboutList;
    
    public AboutAdabters(final Context mContext, final String app_VERSION, final List mModelAboutList, final int mDimensionW, final int mDimensionH) {
        this.mContext = mContext;
        this.mModelAboutList = mModelAboutList;
        this.mDimensionW = mDimensionW;
        this.mDimensionH = mDimensionH;
        this.APP_VERSION = app_VERSION;
    }
    
    public int getItemCount() {
        final List mModelAboutList = this.mModelAboutList;
        if (mModelAboutList != null) {
            return mModelAboutList.size();
        }
        return 0;
    }
    
    public void onBindViewHolder(final AboutAdabters$ViewHolder aboutAdabters$ViewHolder, int image_1) {
        final AboutAdabters$ModelAbout aboutAdabters$ModelAbout = this.mModelAboutList.get(image_1);
        aboutAdabters$ViewHolder.textView.setGravity(aboutAdabters$ModelAbout.geGravity());
        if (aboutAdabters$ModelAbout.getSizeText() == 19) {
            aboutAdabters$ViewHolder.textView.getPaint().setFakeBoldText(true);
        }
        else {
            aboutAdabters$ViewHolder.textView.getPaint().setFakeBoldText(false);
        }
        aboutAdabters$ViewHolder.textView.setTextSize(2, (float)aboutAdabters$ModelAbout.getSizeText());
        aboutAdabters$ViewHolder.textView.setText((CharSequence)HtmlCompat.fromHtml(aboutAdabters$ModelAbout.getText(), 0));
        if (aboutAdabters$ModelAbout.getImage_1() != -1) {
            aboutAdabters$ViewHolder.imageView_1.setVisibility(0);
            final RequestBuilder bitmap = Glide.with(this.mContext).asBitmap();
            image_1 = aboutAdabters$ModelAbout.getImage_1();
            ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)bitmap.load(Integer.valueOf(image_1)).override(this.mDimensionW, this.mDimensionH)).centerInside()).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).into(aboutAdabters$ViewHolder.imageView_1);
        }
        else {
            aboutAdabters$ViewHolder.imageView_1.setVisibility(8);
            Glide.with(this.mContext).clear((View)aboutAdabters$ViewHolder.imageView_1);
        }
    }
    
    public AboutAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new AboutAdabters$ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_billing, viewGroup, false));
    }
}
