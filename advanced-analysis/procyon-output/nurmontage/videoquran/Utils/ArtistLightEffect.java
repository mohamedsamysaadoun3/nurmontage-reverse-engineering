// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class ArtistLightEffect
{
    public static Bitmap apply(final Bitmap bitmap, final float n, final float n2) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
        final float[] array2;
        final float[] array = array2 = new float[20];
        array2[0] = 1.05f;
        array2[1] = 0.0f;
        array2[3] = (array2[2] = 0.0f);
        array2[4] = -6.0f;
        array2[5] = 0.0f;
        array2[6] = 1.02f;
        array2[8] = (array2[7] = 0.0f);
        array2[9] = -4.0f;
        array2[11] = (array2[10] = 0.0f);
        array2[12] = 0.95f;
        array2[13] = 0.0f;
        array2[14] = 10.0f;
        array2[15] = 0.0f;
        array2[17] = (array2[16] = 0.0f);
        array2[18] = 1.0f;
        array2[19] = 0.0f;
        final ColorMatrix colorMatrix = new ColorMatrix(array);
        final int n3 = 1;
        final Paint paint = new Paint(n3);
        paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        final float n4 = (float)width;
        final float n5 = (float)height;
        final int saveLayer = canvas.saveLayer(0.0f, 0.0f, n4, n5, (Paint)null);
        final float n6 = Math.max(width, height) * 0.45f;
        final int[] array3 = { Color.parseColor("#8844FFAA"), Color.parseColor("#33226655"), 0 };
        final float[] array5;
        final float[] array4 = array5 = new float[3];
        array5[0] = 0.0f;
        array5[1] = 0.55f;
        array5[2] = 1.0f;
        final RadialGradient shader = new RadialGradient(n, n2, n6, array3, array4, Shader$TileMode.CLAMP);
        final Paint paint2 = new Paint(n3);
        paint2.setShader((Shader)shader);
        paint2.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.OVERLAY));
        canvas.drawRect(0.0f, 0.0f, n4, n5, paint2);
        canvas.restoreToCount(saveLayer);
        final int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, n4, n5, (Paint)null);
        final RadialGradient shader2 = new RadialGradient(n, n2, Math.max(width, height) * 0.25f, new int[] { Color.parseColor("#5533FFAA"), 0 }, (float[])null, Shader$TileMode.CLAMP);
        final Paint paint3 = new Paint(n3);
        paint3.setShader((Shader)shader2);
        paint3.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.ADD));
        canvas.drawRect(0.0f, 0.0f, n4, n5, paint3);
        canvas.restoreToCount(saveLayer2);
        final int saveLayer3 = canvas.saveLayer(0.0f, 0.0f, n4, n5, (Paint)null);
        final float n7 = 2.0f;
        final float n8 = n4 / n7;
        final float n9 = n5 / n7;
        final float n10 = (float)Math.max(width, height);
        final int[] array6 = { 0, Color.parseColor("#44000000") };
        final float[] array8;
        final float[] array7 = array8 = new float[2];
        array8[0] = 0.6f;
        array8[1] = 1.0f;
        final RadialGradient shader3 = new RadialGradient(n8, n9, n10, array6, array7, Shader$TileMode.CLAMP);
        final Paint paint4 = new Paint(n3);
        paint4.setShader((Shader)shader3);
        paint4.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.MULTIPLY));
        canvas.drawRect(0.0f, 0.0f, n4, n5, paint4);
        canvas.restoreToCount(saveLayer3);
        return bitmap2;
    }
}
