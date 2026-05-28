/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Xfermode
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;

public class CinematicProcessor {
    public static Bitmap applyCinematicEffect(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int n = 1;
        bitmap = bitmap.copy(config, n != 0);
        config = new Canvas(bitmap);
        Paint paint = new Paint(n);
        CinematicProcessor.applyColorGrade((Canvas)config, bitmap, paint);
        CinematicProcessor.applyVignette((Canvas)config, bitmap);
        return bitmap;
    }

    private static void applyColorGrade(Canvas canvas, Bitmap bitmap, Paint paint) {
        Object object;
        ColorMatrix colorMatrix = new ColorMatrix();
        float[] fArray = object = new float[20];
        float[] fArray2 = object;
        fArray[0] = 1.1f;
        fArray2[1] = 0.1f;
        fArray[2] = 0.0f;
        fArray2[3] = 0.0f;
        fArray[4] = -10.0f;
        fArray2[5] = 0.0f;
        fArray[6] = 1.0f;
        fArray2[7] = 0.0f;
        fArray[8] = 0.0f;
        fArray2[9] = -10.0f;
        fArray[10] = 0.0f;
        fArray2[11] = 0.1f;
        fArray[12] = 1.2f;
        fArray2[13] = 0.0f;
        fArray[14] = -10.0f;
        fArray2[15] = 0.0f;
        fArray[16] = 0.0f;
        fArray2[17] = 0.0f;
        fArray[18] = 1.0f;
        fArray2[19] = 0.0f;
        colorMatrix.set(object);
        object = new ColorMatrix;
        object();
        object.setSaturation(0.85f);
        colorMatrix.postConcat((ColorMatrix)object);
        object = new ColorMatrixColorFilter;
        object(colorMatrix);
        paint.setColorFilter((ColorFilter)object);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    private static void applyVignette(Canvas canvas, Bitmap bitmap) {
        float[] fArray;
        int n = bitmap.getWidth();
        int n2 = bitmap.getHeight();
        double d = n;
        double d2 = 2.0;
        d = Math.pow(d, d2);
        d2 = Math.pow(n2, d2);
        float f = (float)(Math.sqrt(d + d2) * 0.7);
        float f2 = n;
        float f3 = 2.0f;
        float f4 = f2 / f3;
        float f5 = n2;
        float f6 = f5 / f3;
        Object object = new int[]{0, 0, -1728053248};
        float[] fArray2 = fArray = new float[3];
        fArray[0] = 0.0f;
        fArray2[1] = 0.4f;
        fArray2[2] = 1.0f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(f4, f6, f, object, fArray, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)radialGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        bitmap = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)bitmap);
        object = canvas;
        canvas.drawRect(0.0f, 0.0f, f2, f5, paint);
    }

    public static Bitmap createGlassRect(Bitmap bitmap, int n) {
        int n2 = bitmap.getWidth();
        int n3 = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n2, (int)n3, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        Paint paint = new Paint(1);
        float f = n;
        float f2 = n2 - n;
        float f3 = n3 - n;
        RectF rectF = new RectF(f, f, f2, f3);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        f3 = 40.0f;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)porterDuffXfermode);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        paint.setXfermode(null);
        return config;
    }
}

