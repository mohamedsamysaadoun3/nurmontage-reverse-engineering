/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class WaveformRendererPro {
    public static Bitmap drawWave(int n, int n2, float[] fArray, int n3, float f, float f2, float f3) {
        float f4;
        int n4;
        float[] fArray2 = fArray;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        int n5 = 1;
        float f5 = Float.MIN_VALUE;
        Paint paint = new Paint(n5);
        int n6 = n3;
        paint.setColor(n3);
        paint.setAlpha(100);
        float f6 = n;
        float f7 = n2;
        float f8 = (float)fArray.length * f3;
        n6 = (int)f8;
        if (n6 < n5) {
            return config;
        }
        f5 = n6;
        float f9 = (f6 /= f5) - f;
        int n7 = 1065353216;
        float f10 = 1.0f;
        float f11 = f9 - f10;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (f12 < 0) {
            f9 = f10;
        }
        n7 = fArray2.length;
        f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (n4 = 0; n4 < n7; ++n4) {
            f4 = fArray2[n4];
            f15 = Math.max(f15, f4);
        }
        n7 = 1008981770;
        f10 = 0.01f;
        float f16 = f15 - f10;
        n4 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (n4 < 0) {
            f15 = f10;
        }
        while (f12 < n6) {
            f10 = (float)f12 / f5;
            f14 = fArray2.length;
            n7 = (int)(f10 * f14);
            f10 = fArray2[n7] / f15 * f7;
            n4 = canvas.getHeight();
            f14 = (float)n4 - f10;
            f4 = f13 + f9;
            int n8 = canvas.getHeight();
            float f17 = n8;
            RectF rectF = new RectF(f13, f14, f4, f17);
            f14 = f2;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            f13 += f6;
            ++f12;
        }
        return config;
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArray, int n, float f, float f2, float f3) {
        float f4;
        int n2;
        RectF rectF2 = rectF;
        float[] fArray2 = fArray;
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        Paint paint = new Paint(n3);
        int n4 = n;
        paint.setColor(n);
        n4 = 100;
        paint.setAlpha(n4);
        float f6 = rectF.width();
        float f7 = rectF.height() * 0.85f;
        float f8 = (float)fArray.length * f3;
        int n5 = (int)f8;
        if (n5 < n3) {
            return;
        }
        f5 = n5;
        float f9 = (f6 /= f5) - f;
        int n6 = 1065353216;
        float f10 = 1.0f;
        float f11 = f9 - f10;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (f12 < 0) {
            f9 = f10;
        }
        n6 = fArray2.length;
        f12 = 0.0f;
        float f13 = 0.0f;
        RectF rectF3 = null;
        float f14 = 0.0f;
        for (n2 = 0; n2 < n6; ++n2) {
            f4 = fArray2[n2];
            f13 = Math.max(f13, f4);
        }
        n6 = 1008981770;
        f10 = 0.01f;
        float f15 = f13 - f10;
        n2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (n2 < 0) {
            f13 = f10;
        }
        f10 = rectF2.left;
        while (f12 < n5) {
            f14 = (float)f12 / f5;
            int n7 = fArray2.length;
            f4 = n7;
            n2 = (int)(f14 * f4);
            f14 = fArray2[n2] / f13 * f7;
            f4 = rectF2.bottom - f14;
            float f16 = f10 + f9;
            float f17 = rectF2.bottom;
            rectF3 = new RectF(f10, f4, f16, f17);
            f16 = f2;
            canvas.drawRoundRect(rectF3, f2, f2, paint);
            f10 += f6;
            ++f12;
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArray, int n, float f, float f2, float f3, float f4, float f5) {
        float f6;
        int n2;
        int n3;
        Paint paint = new Paint(1);
        paint.setColor(n);
        n = 100;
        paint.setAlpha(n);
        float f7 = rectF.height() * 0.85f;
        float f8 = f4 * f3;
        f4 = (f4 + f) * f3;
        int n4 = (int)(f5 /= f4);
        int n5 = 0;
        f3 = 0.0f;
        RectF rectF2 = null;
        if (n4 < 0) {
            n4 = 0;
            f = 0.0f;
        }
        if ((n3 = (int)(f5 = rectF.width() / f4) + 2 + n4) > (n2 = fArray.length)) {
            n3 = fArray.length;
        }
        float f9 = rectF.left;
        int n6 = fArray.length;
        float f10 = 0.0f;
        while (n5 < n6) {
            f6 = fArray[n5];
            f10 = Math.max(f10, f6);
            ++n5;
        }
        n5 = 1008981770;
        f3 = 0.01f;
        float f11 = f10 - f3;
        n6 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (n6 < 0) {
            f10 = f3;
        }
        while (n4 < n3) {
            f3 = fArray[n4] / f10 * f7;
            float f12 = rectF.bottom - f3;
            f6 = f9 + f8;
            float f13 = rectF.bottom;
            rectF2 = new RectF(f9, f12, f6, f13);
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            f9 += f4;
            ++n4;
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArray, int n, float f, float f2, float f3, int n2) {
        int n3;
        RectF rectF2 = rectF;
        float[] fArray2 = fArray;
        if (fArray != null && (n3 = fArray.length) != 0) {
            int n4;
            float f4;
            int n5;
            int n6;
            int n7;
            int n8 = 1;
            Paint paint = new Paint(n8);
            int n9 = n;
            paint.setColor(n);
            n9 = 100;
            paint.setAlpha(n9);
            float f5 = rectF.width();
            float f6 = rectF.height() * 0.85f;
            float f7 = (float)fArray.length * f3;
            int n10 = (int)f7;
            if (n10 < n8) {
                return;
            }
            n8 = 0;
            int n11 = n2 < 0 ? 0 : n2;
            if (n11 > (n7 = fArray2.length - n10)) {
                n11 = fArray2.length - n10;
            }
            float f8 = n10;
            n7 = 1065353216;
            float f9 = (f5 /= f8) - f;
            f8 = Math.max(1.0f, f9);
            f9 = rectF2.left;
            float f10 = 0.0f;
            for (n6 = n11; n6 < (n5 = n11 + n10); ++n6) {
                f4 = fArray2[n6];
                f10 = Math.max(f10, f4);
            }
            n6 = 1008981770;
            float f11 = 0.01f;
            float f12 = f10 - f11;
            n5 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (n5 < 0) {
                f10 = f11;
            }
            RectF rectF3 = new RectF();
            while (n8 < n10 && (n5 = n11 + n8) < (n4 = fArray2.length)) {
                f4 = fArray2[n5] / f10 * f6;
                float f13 = rectF2.bottom - f4;
                f4 = f9 + f8;
                float f14 = rectF2.bottom;
                rectF3.set(f9, f13, f4, f14);
                f13 = f2;
                canvas.drawRoundRect(rectF3, f2, f2, paint);
                f9 += f5;
                ++n8;
            }
        }
    }

    public static void drawWaveProportional(Canvas canvas, RectF rectF, float[] fArray, int n, float f, float f2, float f3, float f4, float f5) {
        int n2;
        RectF rectF2 = rectF;
        float[] fArray2 = fArray;
        if (fArray != null && (n2 = fArray.length) != 0) {
            float f6;
            int n3;
            int n4;
            int n5 = 1;
            Paint paint = new Paint(n5);
            int n6 = n;
            paint.setColor(n);
            n6 = 100;
            paint.setAlpha(n6);
            float f7 = rectF.width();
            float f8 = rectF.height() * 0.85f;
            float f9 = (f5 + f) * f3;
            float f10 = f4 / f9;
            int n7 = (int)f10;
            int n8 = 0;
            if (n7 < 0) {
                n7 = 0;
                f10 = 0.0f;
            }
            if (n7 >= (n4 = fArray2.length)) {
                n7 = fArray2.length - n5;
            }
            if ((n6 = (int)(f7 /= f9) + 2 + n7) > (n4 = fArray2.length)) {
                n6 = fArray2.length;
            }
            n4 = fArray2.length;
            float f11 = 0.0f;
            RectF rectF3 = null;
            float f12 = 0.0f;
            for (n3 = 0; n3 < n4; ++n3) {
                f6 = fArray2[n3];
                float f13 = f6 - f11;
                float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                if (f14 <= 0) continue;
                f11 = f6;
            }
            n4 = 1008981770;
            float f15 = 0.01f;
            float f16 = f11 - f15;
            n3 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (n3 < 0) {
                f11 = f15;
            }
            f15 = rectF2.left;
            f12 = f4 % f9;
            f15 -= f12;
            n6 -= n7;
            while (n8 < n6) {
                f12 = n8;
                f6 = n6;
                f12 /= f6;
                f6 = fArray2.length - n7;
                n3 = (int)(f12 *= f6) + n7;
                int n9 = fArray2.length;
                if (n3 >= n9) {
                    n3 = fArray2.length - n5;
                }
                f12 = fArray2[n3] / f11 * f8;
                f6 = rectF2.bottom - f12;
                float f17 = f5 * f3 + f15;
                float f18 = rectF2.bottom;
                rectF3 = new RectF(f15, f6, f17, f18);
                f17 = f2;
                canvas.drawRoundRect(rectF3, f2, f2, paint);
                f12 = rectF2.right;
                float f19 = (f15 += f9) - f12;
                n3 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                if (n3 > 0) break;
                ++n8;
            }
        }
    }

    public static Bitmap drawWaveformBottom(float[] fArray, int n, int n2, int n3, int n4, float f, int n5) {
        float f2;
        int n6;
        float[] fArray2 = fArray;
        int n7 = n2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        float f3 = Float.MIN_VALUE;
        Paint paint = new Paint(1);
        int n8 = n3;
        paint.setColor(n3);
        n8 = fArray.length;
        float f4 = 0.0f;
        int n9 = 0;
        for (n6 = 0; n6 < n8; ++n6) {
            f2 = fArray2[n6];
            f4 = Math.max(f4, f2);
        }
        n8 = 1008981770;
        f3 = 0.01f;
        float f5 = f4 - f3;
        n6 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
        if (n6 < 0) {
            f4 = f3;
        }
        n8 = fArray2.length;
        n6 = 0;
        while (n9 < n8) {
            f2 = fArray2[n9] / f4;
            float f6 = n7;
            int n10 = (int)(f2 * f6);
            n10 = n7 - n10;
            f2 = n10;
            float f7 = n6;
            int n11 = n6 + n5;
            float f8 = n11;
            RectF rectF = new RectF(f7, f2, f8, f6);
            f2 = f;
            canvas.drawRoundRect(rectF, f, f, paint);
            int n12 = n5 + n4;
            n6 += n12;
            ++n9;
        }
        return config;
    }
}

