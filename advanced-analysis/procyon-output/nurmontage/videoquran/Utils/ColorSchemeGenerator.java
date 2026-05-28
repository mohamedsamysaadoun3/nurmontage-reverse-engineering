// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Color;

public class ColorSchemeGenerator
{
    public static int darkenColor(int n, float max) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        n = 2;
        max = Math.max(0.0f, array[n] - max);
        array[n] = max;
        return Color.HSVToColor(array);
    }
    
    public static int generateAccentColor(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[0] = 30.0f;
        array[1] = 0.8f;
        array[2] = 0.9f;
        return Color.HSVToColor(array);
    }
    
    public static int generateCircleColor(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[0] = (array[0] + 180.0f) % 360.0f;
        final int n2 = 1;
        array[n2] = Math.min(0.4f, array[n2]);
        array[2] = 0.95f;
        return Color.HSVToColor(array);
    }
    
    public static int generateLabelColor(int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        n = 0;
        final float n2 = array[0];
        final int n3 = 1;
        array[n3] = Math.max(0.0f, array[n3] * 0.4f);
        final int n4 = 2;
        final float min = Math.min(1.0f, array[n4] + 0.25f);
        array[n4] = min;
        if (min < 0.75f) {
            array[n4] = 0.85f;
        }
        array[0] = n2;
        return Color.HSVToColor(array);
    }
    
    public static ColorSchemeGenerator$Scheme generateScheme(int accent) {
        final ColorSchemeGenerator$Scheme colorSchemeGenerator$Scheme = new ColorSchemeGenerator$Scheme();
        colorSchemeGenerator$Scheme.screen1 = accent;
        final float n = 0.15f;
        colorSchemeGenerator$Scheme.screen2 = lightenColor(accent, n);
        accent = getComplementaryColor(accent);
        colorSchemeGenerator$Scheme.body = accent;
        accent = darkenColor(colorSchemeGenerator$Scheme.body, 0.25f);
        colorSchemeGenerator$Scheme.shadow = accent;
        accent = generateLabelColor(colorSchemeGenerator$Scheme.body);
        colorSchemeGenerator$Scheme.label = accent;
        accent = darkenColor(getComplementaryColor(colorSchemeGenerator$Scheme.body), n);
        colorSchemeGenerator$Scheme.accent = accent;
        return colorSchemeGenerator$Scheme;
    }
    
    public static ColorSchemeGenerator$Scheme generateScheme(int darkenColor, final float n) {
        final ColorSchemeGenerator$Scheme colorSchemeGenerator$Scheme = new ColorSchemeGenerator$Scheme();
        final int rotateHue = rotateHue(darkenColor, n);
        colorSchemeGenerator$Scheme.screen1 = darkenColor;
        final float n2 = 0.15f;
        colorSchemeGenerator$Scheme.screen2 = lightenColor(rotateHue, n2);
        colorSchemeGenerator$Scheme.body = getComplementaryColor(rotateHue);
        colorSchemeGenerator$Scheme.shadow = darkenColor(colorSchemeGenerator$Scheme.body, 0.25f);
        colorSchemeGenerator$Scheme.label = generateLabelColor(colorSchemeGenerator$Scheme.body);
        darkenColor = darkenColor(getComplementaryColor(rotateHue), n2);
        colorSchemeGenerator$Scheme.accent = darkenColor;
        return colorSchemeGenerator$Scheme;
    }
    
    public static int getComplementaryColor(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[0] = (array[0] + 180.0f) % 360.0f;
        return Color.HSVToColor(array);
    }
    
    public static int lightenColor(int n, float min) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        n = 2;
        min = Math.min(1.0f, array[n] + min);
        array[n] = min;
        return Color.HSVToColor(array);
    }
    
    public static int rotateHue(int n, float n2) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        n = 0;
        final float n3 = array[0] + n2;
        n2 = 360.0f;
        final float n4 = n3 % n2;
        array[0] = n4;
        if (n4 < 0.0f) {
            array[0] = n4 + n2;
        }
        return Color.HSVToColor(array);
    }
}
