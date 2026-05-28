// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.Resource;
import android.content.Context;
import com.bumptech.glide.load.Transformation;

public class ImageLoader$StoryCropTransformation implements Transformation
{
    private final int targetHeight;
    private final int targetWidth;
    
    public ImageLoader$StoryCropTransformation(final int targetWidth, final int targetHeight) {
        this.targetWidth = targetWidth;
        this.targetHeight = targetHeight;
    }
    
    public Resource transform(final Context context, final Resource resource, final int n, final int n2) {
        return null;
    }
    
    public Resource transform(final BitmapPool bitmapPool, final Resource resource, int width, int height) {
        Bitmap bitmap = (Bitmap)resource.get();
        width = bitmap.getWidth();
        height = bitmap.getHeight();
        final float n = (float)width;
        final float n2 = (float)height;
        final float n3 = n / n2;
        final float n4 = this.targetWidth / (float)this.targetHeight;
        if (n3 > n4) {
            final int n5 = (int)(n2 * n4);
            width = (width - n5) / 2;
            bitmap = Bitmap.createBitmap(bitmap, width, 0, n5, height);
        }
        else if (n3 < n4) {
            final int n6 = (int)(n / n4);
            height = (height - n6) / 2;
            bitmap = Bitmap.createBitmap(bitmap, 0, height, width, n6);
        }
        return (Resource)BitmapResource.obtain(bitmap, bitmapPool);
    }
    
    public void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(("storyCrop(targetWidth=" + this.targetWidth + ", targetHeight=" + this.targetHeight + ")").getBytes(StandardCharsets.UTF_8));
    }
}
