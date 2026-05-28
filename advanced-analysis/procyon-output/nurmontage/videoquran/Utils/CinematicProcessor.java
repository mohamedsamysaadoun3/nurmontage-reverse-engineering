// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class CinematicProcessor
{
    public static Bitmap applyCinematicEffect(Bitmap copy) {
        if (copy == null) {
            return null;
        }
        final Bitmap$Config argb_8888 = Bitmap$Config.ARGB_8888;
        final boolean b = true;
        copy = copy.copy(argb_8888, b);
        final Canvas canvas = new Canvas(copy);
        applyColorGrade(canvas, copy, new Paint((int)(b ? 1 : 0)));
        applyVignette(canvas, copy);
        return copy;
    }
    
    private static void applyColorGrade(final Canvas canvas, final Bitmap bitmap, final Paint paint) {
        final ColorMatrix colorMatrix = new ColorMatrix();
        final float[] array2;
        final float[] array = array2 = new float[20];
        array2[0] = 1.1f;
        array2[1] = 0.1f;
        array2[3] = (array2[2] = 0.0f);
        array2[4] = -10.0f;
        array2[5] = 0.0f;
        array2[6] = 1.0f;
        array2[8] = (array2[7] = 0.0f);
        array2[9] = -10.0f;
        array2[10] = 0.0f;
        array2[11] = 0.1f;
        array2[12] = 1.2f;
        array2[13] = 0.0f;
        array2[14] = -10.0f;
        array2[15] = 0.0f;
        array2[17] = (array2[16] = 0.0f);
        array2[18] = 1.0f;
        array2[19] = 0.0f;
        colorMatrix.set(array);
        final ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(0.85f);
        colorMatrix.postConcat(colorMatrix2);
        paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }
    
    private static void applyVignette(final Canvas canvas, final Bitmap bitmap) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final double a = width;
        final double n = 2.0;
        final float n2 = (float)(Math.sqrt(Math.pow(a, n) + Math.pow(height, n)) * 0.7);
        final float n3 = (float)width;
        final float n4 = 2.0f;
        final float n5 = n3 / n4;
        final float n6 = (float)height;
        final float n7 = n6 / n4;
        final int[] array = { 0, 0, -1728053248 };
        final float[] array3;
        final float[] array2 = array3 = new float[3];
        array3[0] = 0.0f;
        array3[1] = 0.4f;
        array3[2] = 1.0f;
        final RadialGradient shader = new RadialGradient(n5, n7, n2, array, array2, Shader$TileMode.CLAMP);
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)shader);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_ATOP));
        canvas.drawRect(0.0f, 0.0f, n3, n6, paint);
    }
    
    public static Bitmap createGlassRect(final Bitmap bitmap, final int n) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(1);
        final float n2 = (float)n;
        final RectF rectF = new RectF(n2, n2, (float)(width - n), (float)(height - n));
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        final float n3 = 40.0f;
        canvas.drawRoundRect(rectF, n3, n3, paint);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        paint.setXfermode((Xfermode)null);
        return bitmap2;
    }
}
