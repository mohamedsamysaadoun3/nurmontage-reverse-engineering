// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Color;

public class ColorUtils
{
    public static int convertToEnergyColor(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        float mapHueToRange = array[0];
        final int n2 = 1;
        final float n3 = array[n2];
        final int n4 = 2;
        final float n5 = array[n4];
        final float n6 = 60.0f;
        final float n7 = fcmpl(mapHueToRange, n6);
        final float a = 0.5f;
        final float n8 = 0.1f;
        final float n9 = 1.0f;
        float b = 0.0f;
        float b2 = 0.0f;
        Label_0593: {
            if (n7 >= 0) {
                final float n10 = 300.0f;
                if (mapHueToRange <= n10) {
                    final float n11 = 30.0f;
                    final float n12 = 170.0f;
                    if (n7 >= 0 && mapHueToRange < n12) {
                        mapHueToRange = mapHueToRange(mapHueToRange / 2.0f + n11, n6, n12, 20.0f, n6);
                    }
                    else {
                        final float n13 = fcmpl(mapHueToRange, n12);
                        final float n14 = 260.0f;
                        final float n15 = 360.0f;
                        if (n13 >= 0 && mapHueToRange < n14) {
                            mapHueToRange = (mapHueToRange - 180.0f + n15) % n15;
                            final float n16 = 10.0f;
                            if (mapHueToRange < n16) {
                                mapHueToRange += n16;
                            }
                            if (mapHueToRange > n6) {
                                mapHueToRange = n6;
                            }
                        }
                        else if (mapHueToRange >= n14 && mapHueToRange <= n10) {
                            mapHueToRange = (mapHueToRange + n6) % n15;
                            if (mapHueToRange < n10 && mapHueToRange > 270.0f) {
                                mapHueToRange = n10;
                            }
                        }
                    }
                    if (n3 < a) {
                        b = Math.min(n9, n3 + 0.3f);
                    }
                    else {
                        b = Math.min(n9, n3 + 0.15f);
                    }
                    if (n5 < 0.6f) {
                        b2 = Math.min(n9, n5 + 0.25f);
                    }
                    else {
                        b2 = Math.min(n9, n5 + n8);
                    }
                    final float n17 = array[0];
                    if (n17 < n6 || n17 > n10 || mapHueToRange < 70.0f || mapHueToRange > 290.0f) {
                        break Label_0593;
                    }
                    if (Math.random() < 0.5) {
                        mapHueToRange = n11;
                        break Label_0593;
                    }
                    mapHueToRange = 50.0f;
                    break Label_0593;
                }
            }
            b = Math.min(n9, n3 + n8);
            b2 = Math.min(n9, n5 + 0.05f);
        }
        array[0] = mapHueToRange;
        array[n2] = Math.max(0.4f, Math.min(n9, b));
        array[n4] = Math.max(a, Math.min(n9, b2));
        return Color.HSVToColor(Color.alpha(n), array);
    }
    
    public static int darkenColor(int blue, final float n) {
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        final float n2 = (float)red;
        final float n3 = 1.0f - n;
        final int n4 = (int)(n2 * n3);
        final int n5 = (int)(green * n3);
        blue *= (int)n3;
        return Color.rgb(n4, n5, blue);
    }
    
    public static int getAverageColor(final Bitmap bitmap) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        int i = 0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (i < height) {
            for (int j = 0; j < width; j += 20) {
                final int pixel = bitmap.getPixel(j, i);
                n2 += Color.red(pixel);
                n3 += Color.green(pixel);
                n4 += Color.blue(pixel);
                ++n;
            }
            i += 20;
        }
        if (n > 0) {
            return Color.rgb(n2 / n, n3 / n, n4 / n);
        }
        return -7829368;
    }
    
    public static int getSemiTransparentColorInt(int n, int round) {
        round = Math.round(round * 255 / 100.0f);
        n &= 0xFFFFFF;
        round <<= 24;
        return n | round;
    }
    
    public static boolean isColorDark(int n) {
        n = dcmpl(1.0 - (Color.red(n) * 0.299 + Color.green(n) * 0.587 + Color.blue(n) * 0.114) / 255.0, 0.3);
        if (n >= 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n != 0;
    }
    
    public static int lightenColor(int blue, final float n) {
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        final int n2 = (int)(red + (255 - red) * n);
        final int n3 = (int)(green + (255 - green) * n);
        blue += (int)((255 - blue) * n);
        return Color.rgb(n2, n3, blue);
    }
    
    private static float mapHueToRange(final float n, final float n2, float n3, final float n4, final float n5) {
        if (n < n2) {
            return n4;
        }
        if (n > n3) {
            return n5;
        }
        n3 -= n2;
        final float n6 = n5 - n4;
        if (n3 == 0.0f) {
            return (n4 + n5) / 2.0f;
        }
        return (n - n2) * n6 / n3 + n4;
    }
    
    public static String toHex(final int i) {
        String str;
        for (str = Integer.toHexString(i); str.length() < 8; str = "0" + str) {}
        return "#" + str.toUpperCase();
    }
}
