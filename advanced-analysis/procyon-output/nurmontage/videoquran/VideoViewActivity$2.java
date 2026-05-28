// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

class VideoViewActivity$2 implements Runnable
{
    final /* synthetic */ VideoViewActivity this$0;
    
    VideoViewActivity$2(final VideoViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final float n = (float)VideoViewActivity.-$$Nest$fgetparentLayout(this.this$0).getWidth();
        final float n2 = 0.9f;
        final float b = n * n2;
        final float n3 = 50.0f;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)Glide.with((FragmentActivity)this.this$0).asBitmap().load(VideoViewActivity.-$$Nest$fgetmUri(this.this$0)).frame(1000000L)).centerInside()).override((int)Math.max(n3, b), (int)Math.max(n3, VideoViewActivity.-$$Nest$fgetparentLayout(this.this$0).getHeight() * n2))).diskCacheStrategy(DiskCacheStrategy.NONE)).signature((Key)new ObjectKey((Object)AppUtils.getAppVersionName((Context)this.this$0)))).into(VideoViewActivity.-$$Nest$fgetvideoView(this.this$0));
    }
}
