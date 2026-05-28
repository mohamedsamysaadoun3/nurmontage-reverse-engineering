package hazem.nurmontage.videoquran.Utils;

import android.graphics.Color;

/* loaded from: classes2.dex */
public class ColorSchemeGenerator {

    public static class Scheme {
        public int accent;
        public int body;
        public int circle;
        public int label;
        public int screen1;
        public int screen2;
        public int shadow;
    }

    public static Scheme generateScheme(int colorValue, float floatValue) {
        Scheme scheme = new Scheme();
        int rotateHue = rotateHue(colorValue, floatValue);
        scheme.screen1 = colorValue;
        scheme.screen2 = lightenColor(rotateHue, 0.15f);
        scheme.body = getComplementaryColor(rotateHue);
        scheme.shadow = darkenColor(scheme.body, 0.25f);
        scheme.label = generateLabelColor(scheme.body);
        scheme.accent = darkenColor(getComplementaryColor(rotateHue), 0.15f);
        return scheme;
    }

    public static int generateCircleColor(int colorValue) {
        float[] fArr = new float[3];
        Color.colorToHSV(colorValue, fArr);
        fArr[0] = (fArr[0] + 180.0f) % 360.0f;
        fArr[1] = Math.min(0.4f, fArr[1]);
        fArr[2] = 0.95f;
        return Color.HSVToColor(fArr);
    }

    public static int rotateHue(int colorValue, float floatValue) {
        float[] fArr = {r1, 0.0f, 0.0f};
        Color.colorToHSV(colorValue, fArr);
        float value = (fArr[0] + floatValue) % 360.0f;
        if (value < 0.0f) {
            fArr[0] = value + 360.0f;
        }
        return Color.HSVToColor(fArr);
    }

    public static Scheme generateScheme(int colorValue) {
        Scheme scheme = new Scheme();
        scheme.screen1 = colorValue;
        scheme.screen2 = lightenColor(colorValue, 0.15f);
        scheme.body = getComplementaryColor(colorValue);
        scheme.shadow = darkenColor(scheme.body, 0.25f);
        scheme.label = generateLabelColor(scheme.body);
        scheme.accent = darkenColor(getComplementaryColor(scheme.body), 0.15f);
        return scheme;
    }

    public static int lightenColor(int colorValue, float floatValue) {
        float[] fArr = new float[3];
        Color.colorToHSV(colorValue, fArr);
        fArr[2] = Math.min(1.0f, fArr[2] + floatValue);
        return Color.HSVToColor(fArr);
    }

    public static int darkenColor(int colorValue, float floatValue) {
        float[] fArr = new float[3];
        Color.colorToHSV(colorValue, fArr);
        fArr[2] = Math.max(0.0f, fArr[2] - floatValue);
        return Color.HSVToColor(fArr);
    }

    public static int getComplementaryColor(int colorValue) {
        float[] fArr = new float[3];
        Color.colorToHSV(colorValue, fArr);
        fArr[0] = (fArr[0] + 180.0f) % 360.0f;
        return Color.HSVToColor(fArr);
    }

    public static int generateLabelColor(int colorValue) {
        float[] fArr = new float[3];
        Color.colorToHSV(colorValue, fArr);
        float floatValue = fArr[0];
        fArr[1] = Math.max(0.0f, fArr[1] * 0.4f);
        float min = Math.min(1.0f, fArr[2] + 0.25f);
        fArr[2] = min;
        if (min < 0.75f) {
            fArr[2] = 0.85f;
        }
        fArr[0] = floatValue;
        return Color.HSVToColor(fArr);
    }

    public static int generateAccentColor(int colorValue) {
        float[] fArr = {30.0f, 0.8f, 0.9f};
        Color.colorToHSV(value, fArr);
        return Color.HSVToColor(fArr);
    }
}
