/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.core.text.HtmlCompat
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ModelAbout;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ViewHolder;
import java.util.List;

public class AboutAdabters
extends RecyclerView.Adapter {
    private final String APP_VERSION;
    private final Context mContext;
    private final int mDimensionH;
    private final int mDimensionW;
    private final List mModelAboutList;

    public AboutAdabters(Context context, String string2, List list, int n, int n2) {
        this.mContext = context;
        this.mModelAboutList = list;
        this.mDimensionW = n;
        this.mDimensionH = n2;
        this.APP_VERSION = string2;
    }

    public int getItemCount() {
        List list = this.mModelAboutList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onBindViewHolder(AboutAdabters$ViewHolder aboutAdabters$ViewHolder, int n) {
        Object object = (AboutAdabters$ModelAbout)this.mModelAboutList.get(n);
        TextView textView = aboutAdabters$ViewHolder.textView;
        int n2 = ((AboutAdabters$ModelAbout)object).geGravity();
        textView.setGravity(n2);
        int n3 = ((AboutAdabters$ModelAbout)object).getSizeText();
        n2 = 19;
        float f = 2.7E-44f;
        if (n3 == n2) {
            textView = aboutAdabters$ViewHolder.textView.getPaint();
            n2 = 1;
            f = Float.MIN_VALUE;
            textView.setFakeBoldText(n2 != 0);
        } else {
            textView = aboutAdabters$ViewHolder.textView.getPaint();
            textView.setFakeBoldText(false);
        }
        textView = aboutAdabters$ViewHolder.textView;
        f = ((AboutAdabters$ModelAbout)object).getSizeText();
        int n4 = 2;
        textView.setTextSize(n4, f);
        textView = aboutAdabters$ViewHolder.textView;
        Object object2 = HtmlCompat.fromHtml((String)((AboutAdabters$ModelAbout)object).getText(), (int)0);
        textView.setText((CharSequence)object2);
        n3 = ((AboutAdabters$ModelAbout)object).getImage_1();
        n2 = -1;
        f = 0.0f / 0.0f;
        if (n3 != n2) {
            aboutAdabters$ViewHolder.imageView_1.setVisibility(0);
            textView = Glide.with((Context)this.mContext).asBitmap();
            n = ((AboutAdabters$ModelAbout)object).getImage_1();
            object = n;
            object = textView.load((Integer)object);
            n3 = this.mDimensionW;
            n2 = this.mDimensionH;
            object = (RequestBuilder)((RequestBuilder)object.override(n3, n2)).centerInside();
            object2 = this.APP_VERSION;
            textView = new ObjectKey(object2);
            object = (RequestBuilder)object.signature((Key)textView);
            textView = DiskCacheStrategy.NONE;
            object = (RequestBuilder)object.diskCacheStrategy((DiskCacheStrategy)textView);
            aboutAdabters$ViewHolder = aboutAdabters$ViewHolder.imageView_1;
            object.into((ImageView)aboutAdabters$ViewHolder);
        } else {
            object = aboutAdabters$ViewHolder.imageView_1;
            n3 = 8;
            object.setVisibility(n3);
            object = Glide.with((Context)this.mContext);
            aboutAdabters$ViewHolder = aboutAdabters$ViewHolder.imageView_1;
            object.clear((View)aboutAdabters$ViewHolder);
        }
    }

    public AboutAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_billing;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        AboutAdabters$ViewHolder aboutAdabters$ViewHolder = new AboutAdabters$ViewHolder((View)viewGroup);
        return aboutAdabters$ViewHolder;
    }
}

