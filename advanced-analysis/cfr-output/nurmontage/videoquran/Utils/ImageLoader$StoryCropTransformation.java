/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  com.bumptech.glide.load.Transformation
 *  com.bumptech.glide.load.engine.Resource
 *  com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
 *  com.bumptech.glide.load.resource.bitmap.BitmapResource
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ImageLoader$StoryCropTransformation
implements Transformation {
    private final int targetHeight;
    private final int targetWidth;

    public ImageLoader$StoryCropTransformation(int n, int n2) {
        this.targetWidth = n;
        this.targetHeight = n2;
    }

    public Resource transform(Context context, Resource resource, int n, int n2) {
        return null;
    }

    public Resource transform(BitmapPool bitmapPool, Resource resource, int n, int n2) {
        resource = (Bitmap)resource.get();
        n = resource.getWidth();
        n2 = resource.getHeight();
        float f = n;
        float f2 = n2;
        float f3 = f / f2;
        int n3 = this.targetWidth;
        float f4 = n3;
        float f5 = this.targetHeight;
        float f6 = f3 - (f4 /= f5);
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 > 0) {
            int n4 = (int)(f2 *= f4);
            n = (n - n4) / 2;
            resource = Bitmap.createBitmap((Bitmap)resource, (int)n, (int)0, (int)n4, (int)n2);
        } else {
            float f8 = f3 == f4 ? 0 : (f3 < f4 ? -1 : 1);
            if (f8 < 0) {
                int n5 = (int)(f /= f4);
                n2 = (n2 - n5) / 2;
                resource = Bitmap.createBitmap((Bitmap)resource, (int)0, (int)n2, (int)n, (int)n5);
            }
        }
        return BitmapResource.obtain((Bitmap)resource, (BitmapPool)bitmapPool);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Object object = new StringBuilder("storyCrop(targetWidth=");
        int n = this.targetWidth;
        object = ((StringBuilder)object).append(n).append(", targetHeight=");
        n = this.targetHeight;
        object = ((StringBuilder)object).append(n).append(")").toString();
        Charset charset = StandardCharsets.UTF_8;
        object = ((String)object).getBytes(charset);
        messageDigest.update((byte[])object);
    }
}

