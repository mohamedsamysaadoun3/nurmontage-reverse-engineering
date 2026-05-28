/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;

public class BitmapCropper {
    public static Bitmap cropTo16x9(Bitmap bitmap) {
        return BitmapCropper.cropToAspectRatio(bitmap, 16, 9);
    }

    public static Bitmap cropTo16x9(Bitmap bitmap, int n, int n2) {
        return BitmapCropper.cropToAspectRatioWithConstraint(bitmap, 16, 9, n, n2);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap) {
        int n = 1;
        return BitmapCropper.cropToAspectRatio(bitmap, n, n);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap, int n, int n2) {
        int n3 = 1;
        return BitmapCropper.cropToAspectRatioWithConstraint(bitmap, n3, n3, n, n2);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap) {
        return BitmapCropper.cropToAspectRatio(bitmap, 9, 16);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap, int n, int n2) {
        return BitmapCropper.cropToAspectRatioWithConstraint(bitmap, 9, 16, n, n2);
    }

    private static Bitmap cropToAspectRatio(Bitmap bitmap, int n, int n2) {
        block6: {
            int n3;
            int n4;
            int n5;
            block5: {
                float f;
                float f2;
                block4: {
                    if (bitmap == null) {
                        return null;
                    }
                    n5 = bitmap.getWidth();
                    n4 = bitmap.getHeight();
                    float f3 = n5;
                    float f4 = n4;
                    f2 = f3 / f4;
                    f = n;
                    float f5 = n2;
                    float f6 = f2 - (f /= f5);
                    n2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                    n3 = 0;
                    if (n2 <= 0) break block4;
                    n = BitmapCropper.roundEven(f4 *= f);
                    int n6 = (n5 - n) / 2;
                    n5 = n;
                    n = 0;
                    f = 0.0f;
                    n3 = n6;
                    break block5;
                }
                n2 = f2 == f ? 0 : (f2 < f ? -1 : 1);
                if (n2 >= 0) break block6;
                n = BitmapCropper.roundEven(f3 /= f);
                int n7 = (n4 - n) / 2;
                n4 = n;
                n = n7;
            }
            bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n3, (int)n, (int)n5, (int)n4);
        }
        return bitmap;
    }

    /*
     * Unable to fully structure code
     */
    private static Bitmap cropToAspectRatioWithConstraint(Bitmap var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        if (var0 == null) {
            return null;
        }
        var5_5 = var0.getWidth();
        var6_6 = var0.getHeight();
        var3_3 = Math.min(var5_5, var3_3);
        var4_4 = Math.min(var6_6, var4_4);
        var5_5 = (var5_5 - var3_3) / 2;
        var6_6 = (var6_6 - var4_4) / 2;
        var7_7 = var1_1;
        var8_8 = var2_2;
        var8_8 = var3_3;
        var9_9 = var4_4;
        var10_10 = var8_8 / var9_9;
        cfr_temp_0 = var10_10 - (var7_7 /= var8_8);
        var11_11 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var11_11 > 0) {
            var1_1 = BitmapCropper.roundEven(var9_9 *= var7_7);
lbl18:
            // 2 sources

            while (true) {
                var2_2 = var4_4;
                break;
            }
        } else {
            var12_12 = var10_10 == var7_7 ? 0 : (var10_10 < var7_7 ? -1 : 1);
            if (var12_12 < 0) {
                var2_2 = BitmapCropper.roundEven(var8_8 /= var7_7);
                var1_1 = var3_3;
            } else {
                var1_1 = var3_3;
                ** continue;
            }
        }
        var1_1 = Math.min(var1_1, var3_3) & -2;
        var2_2 = Math.min(var2_2, var4_4) & -2;
        var3_3 = (var3_3 - var1_1) / 2;
        var4_4 = (var4_4 - var2_2) / 2;
        return Bitmap.createBitmap((Bitmap)var0, (int)(var5_5 += var3_3), (int)(var6_6 += var4_4), (int)var1_1, (int)var2_2);
    }

    private static int roundEven(float f) {
        int n = Math.round(f);
        int n2 = n & 1;
        if (n2 != 0) {
            n += -1;
        }
        return n;
    }
}

