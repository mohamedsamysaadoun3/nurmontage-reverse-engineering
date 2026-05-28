/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Color;
import hazem.nurmontage.videoquran.Utils.ColorSchemeGenerator$Scheme;

public class ColorSchemeGenerator {
    public static int darkenColor(int n, float f) {
        float[] fArray = new float[3];
        Color.colorToHSV((int)n, (float[])fArray);
        n = 2;
        float f2 = fArray[n] - f;
        fArray[n] = f = Math.max(0.0f, f2);
        return Color.HSVToColor((float[])fArray);
    }

    public static int generateAccentColor(int n) {
        float[] fArray = new float[3];
        Color.colorToHSV((int)n, (float[])fArray);
        fArray[0] = 30.0f;
        fArray[1] = 0.8f;
        fArray[2] = 0.9f;
        return Color.HSVToColor((float[])fArray);
    }

    public static int generateCircleColor(int n) {
        float f;
        float f2;
        float[] fArray = new float[3];
        Color.colorToHSV((int)n, (float[])fArray);
        fArray[0] = f2 = (fArray[0] + 180.0f) % 360.0f;
        int n2 = 1;
        float f3 = fArray[n2];
        fArray[n2] = f = Math.min(0.4f, f3);
        fArray[2] = 0.95f;
        return Color.HSVToColor((float[])fArray);
    }

    public static int generateLabelColor(int n) {
        int n2 = 3;
        float[] fArray = new float[n2];
        Color.colorToHSV((int)n, (float[])fArray);
        n = 0;
        float f = fArray[0];
        int n3 = 1;
        float f2 = fArray[n3] * 0.4f;
        fArray[n3] = f2 = Math.max(0.0f, f2);
        n3 = 2;
        f2 = fArray[n3] + 0.25f;
        fArray[n3] = f2 = Math.min(1.0f, f2);
        float f3 = 0.75f;
        float f4 = f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
        if (f4 < 0) {
            f4 = 1062836634;
            fArray[n3] = f2 = 0.85f;
        }
        fArray[0] = f;
        return Color.HSVToColor((float[])fArray);
    }

    public static ColorSchemeGenerator$Scheme generateScheme(int n) {
        int n2;
        ColorSchemeGenerator$Scheme colorSchemeGenerator$Scheme = new ColorSchemeGenerator$Scheme();
        colorSchemeGenerator$Scheme.screen1 = n;
        float f = 0.15f;
        colorSchemeGenerator$Scheme.screen2 = n2 = ColorSchemeGenerator.lightenColor(n, f);
        colorSchemeGenerator$Scheme.body = n = ColorSchemeGenerator.getComplementaryColor(n);
        colorSchemeGenerator$Scheme.shadow = n = ColorSchemeGenerator.darkenColor(colorSchemeGenerator$Scheme.body, 0.25f);
        colorSchemeGenerator$Scheme.label = n = ColorSchemeGenerator.generateLabelColor(colorSchemeGenerator$Scheme.body);
        colorSchemeGenerator$Scheme.accent = n = ColorSchemeGenerator.darkenColor(ColorSchemeGenerator.getComplementaryColor(colorSchemeGenerator$Scheme.body), f);
        return colorSchemeGenerator$Scheme;
    }

    public static ColorSchemeGenerator$Scheme generateScheme(int n, float f) {
        int n2;
        ColorSchemeGenerator$Scheme colorSchemeGenerator$Scheme = new ColorSchemeGenerator$Scheme();
        int n3 = ColorSchemeGenerator.rotateHue(n, f);
        colorSchemeGenerator$Scheme.screen1 = n;
        float f2 = 0.15f;
        colorSchemeGenerator$Scheme.screen2 = n2 = ColorSchemeGenerator.lightenColor(n3, f2);
        colorSchemeGenerator$Scheme.body = n2 = ColorSchemeGenerator.getComplementaryColor(n3);
        colorSchemeGenerator$Scheme.shadow = n2 = ColorSchemeGenerator.darkenColor(colorSchemeGenerator$Scheme.body, 0.25f);
        colorSchemeGenerator$Scheme.label = n2 = ColorSchemeGenerator.generateLabelColor(colorSchemeGenerator$Scheme.body);
        colorSchemeGenerator$Scheme.accent = n = ColorSchemeGenerator.darkenColor(ColorSchemeGenerator.getComplementaryColor(n3), f2);
        return colorSchemeGenerator$Scheme;
    }

    public static int getComplementaryColor(int n) {
        float f;
        float[] fArray = new float[3];
        Color.colorToHSV((int)n, (float[])fArray);
        fArray[0] = f = (fArray[0] + 180.0f) % 360.0f;
        return Color.HSVToColor((float[])fArray);
    }

    public static int lightenColor(int n, float f) {
        float[] fArray = new float[3];
        Color.colorToHSV((int)n, (float[])fArray);
        n = 2;
        float f2 = fArray[n] + f;
        fArray[n] = f = Math.min(1.0f, f2);
        return Color.HSVToColor((float[])fArray);
    }

    public static int rotateHue(int n, float f) {
        int n2 = 3;
        float[] fArray = new float[n2];
        Color.colorToHSV((int)n, (float[])fArray);
        n = 0;
        float f2 = fArray[0] + f;
        f = 360.0f;
        fArray[0] = f2 %= f;
        float f3 = f2 - 0.0f;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 < 0) {
            fArray[0] = f2 += f;
        }
        return Color.HSVToColor((float[])fArray);
    }
}

