/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Xfermode
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Xfermode;

public class ArtistLightEffect {
    public static Bitmap apply(Bitmap bitmap, float f, float f2) {
        Object object;
        int n = bitmap.getWidth();
        int n2 = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        Object object2 = bitmap;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        Object object3 = object2 = (Object)new float[20];
        object3[0] = (Bitmap)1.05f;
        object3[1] = (Bitmap)0.0f;
        object3[2] = (Bitmap)0.0f;
        object3[3] = (Bitmap)0.0f;
        object3[4] = (Bitmap)-6.0f;
        object3[5] = (Bitmap)0.0f;
        object3[6] = (Bitmap)1.02f;
        object3[7] = (Bitmap)0.0f;
        object3[8] = (Bitmap)0.0f;
        object3[9] = (Bitmap)-4.0f;
        object3[10] = (Bitmap)0.0f;
        object3[11] = (Bitmap)0.0f;
        object3[12] = (Bitmap)0.95f;
        object3[13] = (Bitmap)0.0f;
        object3[14] = (Bitmap)10.0f;
        object3[15] = (Bitmap)0.0f;
        object3[16] = (Bitmap)0.0f;
        object3[17] = (Bitmap)0.0f;
        object3[18] = (Bitmap)1.0f;
        object3[19] = (Bitmap)0.0f;
        ColorMatrix colorMatrix = new ColorMatrix((float[])object2);
        int n3 = 1;
        object2 = new Paint(n3);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        object2.setColorFilter((ColorFilter)colorMatrixColorFilter);
        canvas.drawBitmap((Bitmap)config, 0.0f, 0.0f, (Paint)object2);
        float f3 = n;
        float f4 = n2;
        colorMatrix = canvas;
        int n4 = canvas.saveLayer(0.0f, 0.0f, f3, f4, null);
        float f5 = (float)Math.max(n, n2) * 0.45f;
        int n5 = Color.parseColor((String)"#8844FFAA");
        int n6 = Color.parseColor((String)"#33226655");
        int[] nArray = new int[]{n5, n6, 0};
        float[] fArray = object = new float[3];
        object[0] = 0.0f;
        fArray[1] = 0.55f;
        fArray[2] = 1.0f;
        Object object4 = Shader.TileMode.CLAMP;
        ColorMatrix colorMatrix2 = colorMatrix;
        colorMatrix = new RadialGradient(f, f2, f5, nArray, object, object4);
        colorMatrix2 = new Paint(n3);
        colorMatrix2.setShader((Shader)colorMatrix);
        object = PorterDuff.Mode.OVERLAY;
        colorMatrix = new PorterDuffXfermode((PorterDuff.Mode)object);
        colorMatrix2.setXfermode((Xfermode)colorMatrix);
        colorMatrix = canvas;
        ColorMatrix colorMatrix3 = colorMatrix2;
        canvas.drawRect(0.0f, 0.0f, f3, f4, (Paint)colorMatrix2);
        canvas.restoreToCount(n4);
        n4 = canvas.saveLayer(0.0f, 0.0f, f3, f4, null);
        float f6 = (float)Math.max(n, n2) * 0.25f;
        n5 = Color.parseColor((String)"#5533FFAA");
        object4 = new int[]{n5, 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        f5 = f;
        float f7 = f2;
        colorMatrix = new RadialGradient(f, f2, f6, (int[])object4, null, tileMode);
        colorMatrix3 = new Paint(n3);
        colorMatrix3.setShader((Shader)colorMatrix);
        object = PorterDuff.Mode.ADD;
        colorMatrix = new PorterDuffXfermode((PorterDuff.Mode)object);
        colorMatrix3.setXfermode((Xfermode)colorMatrix);
        colorMatrix = canvas;
        canvas.drawRect(0.0f, 0.0f, f3, f4, (Paint)colorMatrix3);
        canvas.restoreToCount(n4);
        n4 = canvas.saveLayer(0.0f, 0.0f, f3, f4, null);
        float f8 = 2.0f;
        f5 = f3 / f8;
        f7 = f4 / f8;
        float f9 = Math.max(n, n2);
        n2 = Color.parseColor((String)"#44000000");
        object4 = new int[]{0, n2};
        Object object5 = new float[]{0.6f, 1.0f};
        tileMode = Shader.TileMode.CLAMP;
        f6 = f9;
        colorMatrix = new RadialGradient(f5, f7, f9, (int[])object4, object5, tileMode);
        colorMatrix3 = new Paint(n3);
        colorMatrix3.setShader((Shader)colorMatrix);
        object5 = PorterDuff.Mode.MULTIPLY;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)object5);
        colorMatrix3.setXfermode((Xfermode)porterDuffXfermode);
        colorMatrix = canvas;
        canvas.drawRect(0.0f, 0.0f, f3, f4, (Paint)colorMatrix3);
        canvas.restoreToCount(n4);
        return config;
    }
}

