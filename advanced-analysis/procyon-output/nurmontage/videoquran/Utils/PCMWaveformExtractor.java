// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.File;
import java.io.FileInputStream;

public class PCMWaveformExtractor
{
    public static float[] extractWaveform(final String s, final int n) {
        final FileInputStream fileInputStream = new FileInputStream(s);
        final int n2 = (int)(new File(s).length() / 2);
        final float[] array = new float[n];
        final byte[] b = new byte[8192];
        final float n3 = (float)n2;
        final float n4 = (float)n;
        final float n5 = n3 / n4;
        int n6 = 0;
        while (true) {
            final int read = fileInputStream.read(b);
            if (read <= 0) {
                break;
            }
            for (int i = 0; i < read; i += 2) {
                final float n7 = n6 / n5;
                if (n7 >= n4) {
                    break;
                }
                final short a = (short)(b[i + 1] << 8 | (b[i] & 0xFF));
                final int n8 = (int)n7;
                array[n8] = Math.max(array[n8], Math.abs(a) / 32767.0f);
                ++n6;
            }
        }
        fileInputStream.close();
        return array;
    }
}
