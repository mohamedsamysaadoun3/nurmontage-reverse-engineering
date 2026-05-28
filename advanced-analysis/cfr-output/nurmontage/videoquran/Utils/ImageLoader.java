/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.load.Transformation
 *  com.bumptech.glide.request.BaseRequestOptions
 *  com.bumptech.glide.request.RequestOptions
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import hazem.nurmontage.videoquran.Utils.ImageLoader$StoryCropTransformation;

public class ImageLoader {
    public static Bitmap loadAndCropAndBlur(Context context, Object object, int n, int n2) {
        ImageLoader$StoryCropTransformation imageLoader$StoryCropTransformation = new ImageLoader$StoryCropTransformation(n, n2);
        RequestOptions requestOptions = (RequestOptions)RequestOptions.bitmapTransform((Transformation)imageLoader$StoryCropTransformation).override(n, n2);
        return (Bitmap)Glide.with((Context)context).asBitmap().load(object).apply((BaseRequestOptions)requestOptions).submit().get();
    }
}

