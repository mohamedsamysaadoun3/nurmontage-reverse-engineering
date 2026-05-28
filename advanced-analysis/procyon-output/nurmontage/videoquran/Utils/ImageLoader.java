// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.Glide;
import android.graphics.Bitmap;
import android.content.Context;

public class ImageLoader
{
    public static Bitmap loadAndCropAndBlur(final Context context, final Object o, final int n, final int n2) {
        return (Bitmap)Glide.with(context).asBitmap().load(o).apply((BaseRequestOptions)RequestOptions.bitmapTransform((Transformation)new ImageLoader$StoryCropTransformation(n, n2)).override(n, n2)).submit().get();
    }
}
