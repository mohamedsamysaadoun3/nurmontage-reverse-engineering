/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import java.io.File;
import java.io.FileInputStream;

public class PCMWaveformExtractor {
    public static float[] extractWaveform(String string2, int n) {
        int n2;
        FileInputStream fileInputStream = new FileInputStream(string2);
        Object object = new File(string2);
        long l = ((File)object).length();
        long l2 = 2;
        int n3 = (int)(l /= l2);
        object = new float[n];
        int n4 = 8192;
        byte[] byArray = new byte[n4];
        float f = n3;
        float f2 = n;
        f /= f2;
        int n5 = 0;
        while ((n2 = fileInputStream.read(byArray)) > 0) {
            float f3;
            float f4;
            float f5;
            for (int i = 0; i < n2 && (f5 = (f4 = (f3 = (float)n5 / f) - f2) == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1)) < 0; i += 2) {
                f5 = i + 1;
                f5 = byArray[f5] << 8;
                int n6 = byArray[i] & 0xFF;
                f5 = (short)(f5 | n6);
                int n7 = (int)f3;
                Object object2 = object[n7];
                f5 = Math.abs((int)f5);
                float f6 = f5;
                float f7 = 32767.0f;
                f6 /= f7;
                f6 = Math.max((float)object2, f6);
                object[n7] = f6;
                ++n5;
            }
        }
        fileInputStream.close();
        return object;
    }
}

