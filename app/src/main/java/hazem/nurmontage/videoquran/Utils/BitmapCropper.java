package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class BitmapCropper {
    public static Bitmap cropTo16x9(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 16, 9);
    }

    public static Bitmap cropTo16x9(Bitmap bitmap, int i, int value2) {
        return cropToAspectRatioWithConstraint(bitmap, 16, 9, i, value2);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 9, 16);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap, int i, int value2) {
        return cropToAspectRatioWithConstraint(bitmap, 9, 16, i, value2);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 1, 1);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap, int i, int value2) {
        return cropToAspectRatioWithConstraint(bitmap, 1, 1, i, value2);
    }

    private static Bitmap cropToAspectRatio(Bitmap bitmap, int i, int value2) {
        int i3;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float floatValue = width;
        float f2 = height;
        float f3 = floatValue / f2;
        float f4 = i / value2;
        int value4 = 0;
        if (f3 > f4) {
            int roundEven = roundEven(f2 * f4);
            int i5 = (width - roundEven) / 2;
            width = roundEven;
            i3 = 0;
            value4 = i5;
        } else {
            if (f3 >= f4) {
                return bitmap;
            }
            int roundEven2 = roundEven(floatValue / f4);
            int i6 = (height - roundEven2) / 2;
            height = roundEven2;
            i3 = i6;
        }
        return Bitmap.createBitmap(bitmap, value4, i3, width, height);
    }

    private static Bitmap cropToAspectRatioWithConstraint(Bitmap bitmap, int i, int value2, int i3, int value4) {
        int i5;
        int roundEven;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, i3);
        int min2 = Math.min(height, value4);
        int i6 = (width - min) / 2;
        int i7 = (height - min2) / 2;
        float floatValue = i / value2;
        float f2 = min;
        float f3 = min2;
        float f4 = f2 / f3;
        if (f4 > floatValue) {
            i5 = roundEven(f3 * floatValue);
        } else {
            if (f4 < floatValue) {
                roundEven = roundEven(f2 / floatValue);
                i5 = min;
                int min3 = Math.min(i5, min) & (-2);
                int min4 = Math.min(roundEven, min2) & (-2);
                return Bitmap.createBitmap(bitmap, i6 + ((min - min3) / 2), i7 + ((min2 - min4) / 2), min3, min4);
            }
            i5 = min;
        }
        roundEven = min2;
        int min32 = Math.min(i5, min) & (-2);
        int min42 = Math.min(roundEven, min2) & (-2);
        return Bitmap.createBitmap(bitmap, i6 + ((min - min32) / 2), i7 + ((min2 - min42) / 2), min32, min42);
    }

    private static int roundEven(float floatValue) {
        int round = Math.round(floatValue);
        return (round & 1) == 0 ? round : round - 1;
    }
}
