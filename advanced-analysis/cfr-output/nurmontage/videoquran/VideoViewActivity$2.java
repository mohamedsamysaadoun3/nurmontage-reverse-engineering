/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ImageView
 *  androidx.fragment.app.FragmentActivity
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.VideoViewActivity;

class VideoViewActivity$2
implements Runnable {
    final /* synthetic */ VideoViewActivity this$0;

    VideoViewActivity$2(VideoViewActivity videoViewActivity) {
        this.this$0 = videoViewActivity;
    }

    public void run() {
        float f = VideoViewActivity.cfr_renamed_154(this.this$0).getWidth();
        float f2 = 0.9f;
        float f3 = 50.0f;
        int n = (int)Math.max(f3, f *= f2);
        float f4 = (float)VideoViewActivity.cfr_renamed_154(this.this$0).getHeight() * f2;
        int n2 = (int)Math.max(f3, f4);
        Object object = Glide.with((FragmentActivity)this.this$0).asBitmap();
        String string2 = VideoViewActivity.cfr_renamed_23(this.this$0);
        RequestBuilder requestBuilder = (RequestBuilder)((RequestBuilder)((RequestBuilder)object.load(string2).frame(1000000L)).centerInside()).override(n, n2);
        DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.NONE;
        requestBuilder = (RequestBuilder)requestBuilder.diskCacheStrategy(diskCacheStrategy);
        object = AppUtils.getAppVersionName((Context)this.this$0);
        diskCacheStrategy = new ObjectKey(object);
        requestBuilder = (RequestBuilder)requestBuilder.signature((Key)diskCacheStrategy);
        diskCacheStrategy = VideoViewActivity.cfr_renamed_155(this.this$0);
        requestBuilder.into((ImageView)diskCacheStrategy);
    }
}

