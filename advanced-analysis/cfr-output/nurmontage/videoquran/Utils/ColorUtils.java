/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Color;

public class ColorUtils {
    /*
     * Enabled aggressive block sorting
     */
    public static int convertToEnergyColor(int n) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArray;
        block14: {
            float f7;
            float f8;
            int n2;
            block15: {
                float f9;
                float f10;
                int n3;
                float f11;
                int n4 = 3;
                fArray = new float[n4];
                Color.colorToHSV((int)n, (float[])fArray);
                f6 = 0.0f;
                f5 = fArray[0];
                int n5 = 1;
                f4 = fArray[n5];
                int n6 = 2;
                f3 = fArray[n6];
                n2 = 1114636288;
                f8 = 60.0f;
                float f12 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
                f2 = 0.5f;
                f7 = 0.1f;
                f = 1.0f;
                if (f12 < 0) break block15;
                int n7 = 1133903872;
                float f13 = 300.0f;
                float f14 = f5 - f13;
                float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                if (f15 > 0) break block15;
                f15 = 1106247680;
                float f16 = 30.0f;
                int n8 = 1126825984;
                float f17 = 170.0f;
                if (f12 >= 0 && (f12 = f5 == f17 ? 0 : (f5 < f17 ? -1 : 1)) < 0) {
                    f5 = f5 / 2.0f + f16;
                    f12 = 1101004800;
                    f11 = 20.0f;
                    f5 = ColorUtils.mapHueToRange(f5, f8, f17, f11, f8);
                } else {
                    f12 = f5 == f17 ? 0 : (f5 > f17 ? 1 : -1);
                    n8 = 1132593152;
                    f17 = 260.0f;
                    float f18 = 360.0f;
                    if (f12 >= 0 && (f12 = f5 == f17 ? 0 : (f5 < f17 ? -1 : 1)) < 0) {
                        f5 = (f5 - 180.0f + f18) % f18;
                        f12 = 1092616192;
                        f11 = 10.0f;
                        float f19 = f5 - f11;
                        n8 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                        if (n8 < 0) {
                            f5 += f11;
                        }
                        if ((f12 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1)) > 0) {
                            n3 = n2;
                            f5 = f8;
                        }
                    } else {
                        float f20;
                        float f21;
                        f12 = f5 == f17 ? 0 : (f5 > f17 ? 1 : -1);
                        if (f12 >= 0 && (f12 = f5 == f13 ? 0 : (f5 < f13 ? -1 : 1)) <= 0 && (f12 = (f21 = (f5 = (f5 + f8) % f18) - f13) == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1)) < 0 && (f12 = (f20 = f5 - (f11 = 270.0f)) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1)) > 0) {
                            n3 = n7;
                            f5 = f13;
                        }
                    }
                }
                f12 = f4 == f2 ? 0 : (f4 < f2 ? -1 : 1);
                if (f12 < 0) {
                    f12 = 1050253722;
                    f11 = 0.3f;
                    f4 += f11;
                    f4 = Math.min(f, f4);
                } else {
                    f12 = 1041865114;
                    f11 = 0.15f;
                    f4 += f11;
                    f4 = Math.min(f, f4);
                }
                f11 = 0.6f;
                f12 = f3 == f11 ? 0 : (f3 < f11 ? -1 : 1);
                if (f12 < 0) {
                    f12 = 1048576000;
                    f11 = 0.25f;
                    f3 += f11;
                    f3 = Math.min(f, f3);
                } else {
                    f3 += f7;
                    f3 = Math.min(f, f3);
                }
                f11 = fArray[0];
                n2 = f11 == f8 ? 0 : (f11 > f8 ? 1 : -1);
                if (n2 >= 0 && (n2 = (int)(f11 == f13 ? 0 : (f11 < f13 ? -1 : 1))) <= 0 && (n2 = (int)((f10 = f5 - (f8 = 70.0f)) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1))) >= 0 && (n2 = (int)((f9 = f5 - (f8 = 290.0f)) == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1))) <= 0) {
                    double d;
                    double d2 = Math.random();
                    double d3 = d2 - (d = 0.5);
                    n3 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                    if (n3 < 0) {
                        n3 = (int)f15;
                        f5 = f16;
                        break block14;
                    } else {
                        n3 = 1112014848;
                        f5 = 50.0f;
                    }
                }
                break block14;
            }
            f4 += f7;
            f4 = Math.min(f, f4);
            n2 = 1028443341;
            f8 = 0.05f;
            f3 += f8;
            f3 = Math.min(f, f3);
        }
        fArray[0] = f5;
        f5 = Math.min(f, f4);
        fArray[n5] = f6 = Math.max(0.4f, f5);
        f6 = Math.min(f, f3);
        fArray[n6] = f6 = Math.max(f2, f6);
        return Color.HSVToColor((int)Color.alpha((int)n), (float[])fArray);
    }

    public static int darkenColor(int n, float f) {
        int n2 = Color.red((int)n);
        int n3 = Color.green((int)n);
        n = Color.blue((int)n);
        float f2 = n2;
        float f3 = 1.0f - f;
        int n4 = (int)(f2 * f3);
        n2 = (int)((float)n3 * f3);
        n = (int)((float)n * f3);
        return Color.rgb((int)n4, (int)n2, (int)n);
    }

    public static int getAverageColor(Bitmap bitmap) {
        int n = bitmap.getWidth();
        int n2 = bitmap.getHeight();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < n2; i += 20) {
            for (int j = 0; j < n; j += 20) {
                int n7 = bitmap.getPixel(j, i);
                int n8 = Color.red((int)n7);
                n4 += n8;
                n8 = Color.green((int)n7);
                n5 += n8;
                n7 = Color.blue((int)n7);
                n6 += n7;
                ++n3;
            }
        }
        if (n3 > 0) {
            return Color.rgb((int)(n4 /= n3), (int)(n5 /= n3), (int)(n6 /= n3));
        }
        return -7829368;
    }

    public static int getSemiTransparentColorInt(int n, int n2) {
        n2 = Math.round((float)(n2 * 255) / 100.0f);
        return (n &= 0xFFFFFF) | (n2 <<= 24);
    }

    public static boolean isColorDark(int n) {
        int n2 = Color.red((int)n);
        double d = (double)n2 * 0.299;
        int n3 = Color.green((int)n);
        double d2 = (double)n3 * 0.587;
        d += d2;
        d2 = Color.blue((int)n);
        double d3 = 0.114;
        d = (d + (d2 *= d3)) / 255.0;
        d2 = 1.0 - d;
        double d4 = d2 - (d = 0.3);
        n = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
        n = n >= 0 ? 1 : 0;
        return n != 0;
    }

    public static int lightenColor(int n, float f) {
        int n2 = Color.red((int)n);
        int n3 = Color.green((int)n);
        n = Color.blue((int)n);
        float f2 = n2;
        float f3 = (float)(255 - n2) * f;
        n2 = (int)(f2 + f3);
        f2 = n3;
        float f4 = (float)(255 - n3) * f;
        n3 = (int)(f2 + f4);
        f2 = n;
        float f5 = (float)(255 - n) * f;
        n = (int)(f2 + f5);
        return Color.rgb((int)n2, (int)n3, (int)n);
    }

    private static float mapHueToRange(float f, float f2, float f3, float f4, float f5) {
        float f6 = f == f2 ? 0 : (f < f2 ? -1 : 1);
        if (f6 < 0) {
            return f4;
        }
        f6 = f == f3 ? 0 : (f > f3 ? 1 : -1);
        if (f6 > 0) {
            return f5;
        }
        float f7 = f5 - f4;
        float f8 = (f3 -= f2) - 0.0f;
        float f9 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f9 == false) {
            return (f4 + f5) / 2.0f;
        }
        return (f - f2) * f7 / f3 + f4;
    }

    public static String toHex(int n) {
        StringBuilder stringBuilder;
        int n2;
        int n3;
        String string2 = Integer.toHexString(n);
        while ((n3 = string2.length()) < (n2 = 8)) {
            String string3 = "0";
            stringBuilder = new StringBuilder(string3);
            string2 = stringBuilder.append(string2).toString();
        }
        stringBuilder = new StringBuilder("#");
        string2 = string2.toUpperCase();
        return stringBuilder.append(string2).toString();
    }
}

