package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class ImageLoader {
    public static Bitmap loadAndCropAndBlur(Context context, Object obj, int i, int value2) throws ExecutionException, InterruptedException {
        return Glide.with(context).asBitmap().load(obj).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new StoryCropTransformation(i, value2)).override(i, value2)).submit().get();
    }

    public static class StoryCropTransformation implements Transformation<Bitmap> {
        private final int targetHeight;
        private final int targetWidth;

        @Override // com.bumptech.glide.load.Transformation
        public Resource<Bitmap> transform(Context context, Resource<Bitmap> resource, int i, int index) {
            return null;
        }

        public StoryCropTransformation(int i, int width) {
            this.targetWidth = i;
            this.targetHeight = width;
        }

        public Resource<Bitmap> transform(BitmapPool bitmapPool, Resource<Bitmap> resource, int i, int index) {
            Bitmap bitmap = resource.get();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = width;
            float widthRatio = height;
            float widthRatio2 = f / widthRatio;
            float widthRatio2 = this.targetWidth / this.targetHeight;
            if (widthRatio2 > widthRatio2) {
                int i3 = (int) (widthRatio * widthRatio2);
                bitmap = Bitmap.createBitmap(bitmap, (width - i3) / 2, 0, i3, height);
            } else if (widthRatio2 < widthRatio2) {
                int i4 = (int) (f / widthRatio2);
                bitmap = Bitmap.createBitmap(bitmap, 0, (height - i4) / 2, width, i4);
            }
            return BitmapResource.obtain(bitmap, bitmapPool);
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) {
            messageDigest.update(("storyCrop(targetWidth=" + this.targetWidth + ", targetHeight=" + this.targetHeight + ")").getBytes(StandardCharsets.UTF_8));
        }
    }
}
