package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class BitmapCropper {
    public static Bitmap cropTo16x9(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 16, 9);
    }

    public static Bitmap cropTo16x9(Bitmap bitmap, int i, int index) {
        return cropToAspectRatioWithConstraint(bitmap, 16, 9, i, index);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 9, 16);
    }

    public static Bitmap cropTo9x16(Bitmap bitmap, int i, int index) {
        return cropToAspectRatioWithConstraint(bitmap, 9, 16, i, index);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap) {
        return cropToAspectRatio(bitmap, 1, 1);
    }

    public static Bitmap cropTo1x1(Bitmap bitmap, int i, int index) {
        return cropToAspectRatioWithConstraint(bitmap, 1, 1, i, index);
    }

    private static Bitmap cropToAspectRatio(Bitmap bitmap, int i, int width6) {
        int i3;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float floatValue = width;
        float widthRatio = height;
        float widthRatio6 = floatValue / widthRatio;
        float widthRatio6 = i / width6;
        int width6 = 0;
        if (widthRatio6 > widthRatio6) {
            int roundEven = roundEven(widthRatio * widthRatio6);
            int i5 = (width - roundEven) / 2;
            width = roundEven;
            i3 = 0;
            width6 = i5;
        } else {
            if (widthRatio6 >= widthRatio6) {
                return bitmap;
            }
            int roundEven2 = roundEven(floatValue / widthRatio6);
            int i6 = (height - roundEven2) / 2;
            height = roundEven2;
            i3 = i6;
        }
        return Bitmap.createBitmap(bitmap, value4, i3, width, height);
    }

    private static Bitmap cropToAspectRatioWithConstraint(Bitmap bitmap, int i, int width10, int i3, int width10) {
        int i5;
        int roundEven;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, i3);
        int min2 = Math.min(height, width10);
        int i6 = (width - min) / 2;
        int i7 = (height - min2) / 2;
        float floatValue = i / width10;
        float widthRatio = min;
        float widthRatio12 = min2;
        float widthRatio10 = widthRatio / f3;
        if (widthRatio10 > floatValue) {
            i5 = roundEven(f3 * floatValue);
        } else {
            if (widthRatio10 < floatValue) {
                roundEven = roundEven(widthRatio / floatValue);
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
