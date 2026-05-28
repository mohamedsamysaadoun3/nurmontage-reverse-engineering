package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class ColorUtils {
    private static float mapHueToRange(float floatValue, float f2, float f3, float f4, float floatValue5) {
        if (floatValue < f2) {
            return f4;
        }
        if (floatValue > f3) {
            return floatValue5;
        }
        float f6 = f3 - f2;
        return f6 == 0.0f ? (f4 + floatValue5) / 2.0f : (((floatValue - f2) * (floatValue5 - f4)) / f6) + f4;
    }

    public static int convertToEnergyColor(int color) {
        float min;
        float min2;
        float[] fArr = new float[3];
        Color.colorToHSV(color, fArr);
        float floatValue = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if (floatValue >= 60.0f && floatValue <= 300.0f) {
            if (floatValue >= 60.0f && floatValue < 170.0f) {
                floatValue = mapHueToRange((floatValue / 2.0f) + 30.0f, 60.0f, 170.0f, 20.0f, 60.0f);
            } else if (floatValue >= 170.0f && floatValue < 260.0f) {
                floatValue = ((floatValue - 180.0f) + 360.0f) % 360.0f;
                if (floatValue < 10.0f) {
                    floatValue += 10.0f;
                }
                if (floatValue > 60.0f) {
                    floatValue = 60.0f;
                }
            } else if (floatValue >= 260.0f && floatValue <= 300.0f) {
                floatValue = (floatValue + 60.0f) % 360.0f;
                if (floatValue < 300.0f && floatValue > 270.0f) {
                    floatValue = 300.0f;
                }
            }
            if (f2 < 0.5f) {
                min = Math.min(1.0f, f2 + 0.3f);
            } else {
                min = Math.min(1.0f, f2 + 0.15f);
            }
            if (f3 < 0.6f) {
                min2 = Math.min(1.0f, f3 + 0.25f);
            } else {
                min2 = Math.min(1.0f, f3 + 0.1f);
            }
            float f4 = fArr[0];
            if (f4 >= 60.0f && f4 <= 300.0f && floatValue >= 70.0f && floatValue <= 290.0f) {
                floatValue = Math.random() < 0.5d ? 30.0f : 50.0f;
            }
        } else {
            min = Math.min(1.0f, f2 + 0.1f);
            min2 = Math.min(1.0f, f3 + 0.05f);
        }
        fArr[0] = floatValue;
        fArr[1] = Math.max(0.4f, Math.min(1.0f, min));
        fArr[2] = Math.max(0.5f, Math.min(1.0f, min2));
        return Color.HSVToColor(Color.alpha(color), fArr);
    }

    public static int getSemiTransparentColorInt(int color, int color2) {
        return (color & ViewCompat.MEASURED_SIZE_MASK) | (Math.round((color2 * 255) / 100.0f) << 24);
    }

    public static String toHex(int color) {
        String hexString = Integer.toHexString(color);
        while (hexString.length() < 8) {
            hexString = "0" + hexString;
        }
        return "#" + hexString.toUpperCase();
    }

    public static boolean isColorDark(int color) {
        return 1.0d - ((((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / 255.0d) >= 0.3d;
    }

    public static int getAverageColor(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int color = 0;
        int color2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int value5 = 0; value5 < height; value5 += 20) {
            for (int value6 = 0; value6 < width; value6 += 20) {
                int pixel = bitmap.getPixel(value6, value5);
                color2 += Color.red(pixel);
                i3 += Color.green(pixel);
                i4 += Color.blue(pixel);
                color++;
            }
        }
        if (color > 0) {
            return Color.rgb(color2 / color, i3 / color, i4 / color);
        }
        return -7829368;
    }

    public static int darkenColor(int color, float floatValue) {
        float f2 = 1.0f - floatValue;
        return Color.rgb((int) (Color.red(color) * f2), (int) (Color.green(color) * f2), (int) (Color.blue(color) * f2));
    }

    public static int lightenColor(int color, float floatValue) {
        return Color.rgb((int) (Color.red(color) + ((255 - r0) * floatValue)), (int) (Color.green(color) + ((255 - r1) * floatValue)), (int) (Color.blue(color) + ((255 - r3) * floatValue)));
    }
}
