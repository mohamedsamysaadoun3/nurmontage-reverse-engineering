// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;

public class BitmapCropper
{
    public static Bitmap cropTo16x9(final Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 16, 9);
    }
    
    public static Bitmap cropTo16x9(final Bitmap bitmap, final int n, final int n2) {
        return cropToAspectRatioWithConstraint(bitmap, 16, 9, n, n2);
    }
    
    public static Bitmap cropTo1x1(final Bitmap bitmap) {
        final int n = 1;
        return cropToAspectRatio(bitmap, n, n);
    }
    
    public static Bitmap cropTo1x1(final Bitmap bitmap, final int n, final int n2) {
        final int n3 = 1;
        return cropToAspectRatioWithConstraint(bitmap, n3, n3, n, n2);
    }
    
    public static Bitmap cropTo9x16(final Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 9, 16);
    }
    
    public static Bitmap cropTo9x16(final Bitmap bitmap, final int n, final int n2) {
        return cropToAspectRatioWithConstraint(bitmap, 9, 16, n, n2);
    }
    
    private static Bitmap cropToAspectRatio(Bitmap bitmap, int n, int n2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        final float n3 = (float)width;
        final float n4 = (float)height;
        final float n5 = n3 / n4;
        final float n6 = n / (float)n2;
        n2 = fcmpl(n5, n6);
        int n7 = 0;
        if (n2 > 0) {
            n = roundEven(n4 * n6);
            final int n8 = (width - n) / 2;
            width = n;
            n = 0;
            n7 = n8;
        }
        else {
            n2 = fcmpg(n5, n6);
            if (n2 >= 0) {
                return bitmap;
            }
            n = roundEven(n3 / n6);
            final int n9 = (height - n) / 2;
            height = n;
            n = n9;
        }
        bitmap = Bitmap.createBitmap(bitmap, n7, n, width, height);
        return bitmap;
    }
    
    private static Bitmap cropToAspectRatioWithConstraint(final Bitmap bitmap, int roundEven, int roundEven2, int min, int min2) {
        if (bitmap == null) {
            return null;
        }
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        min = Math.min(width, min);
        min2 = Math.min(height, min2);
        final int n = (width - min) / 2;
        final int n2 = (height - min2) / 2;
        final float n3 = roundEven / (float)roundEven2;
        final float n4 = (float)min;
        final float n5 = (float)min2;
        final float n6 = n4 / n5;
        Label_0148: {
            if (n6 > n3) {
                roundEven = roundEven(n5 * n3);
            }
            else {
                if (n6 < n3) {
                    roundEven2 = roundEven(n4 / n3);
                    roundEven = min;
                    break Label_0148;
                }
                roundEven = min;
            }
            roundEven2 = min2;
        }
        roundEven = (Math.min(roundEven, min) & 0xFFFFFFFE);
        roundEven2 = (Math.min(roundEven2, min2) & 0xFFFFFFFE);
        min = (min - roundEven) / 2;
        final int n7 = n + min;
        min2 = (min2 - roundEven2) / 2;
        return Bitmap.createBitmap(bitmap, n7, n2 + min2, roundEven, roundEven2);
    }
    
    private static int roundEven(final float a) {
        int round = Math.round(a);
        if ((round & 0x1) != 0x0) {
            --round;
        }
        return round;
    }
}
