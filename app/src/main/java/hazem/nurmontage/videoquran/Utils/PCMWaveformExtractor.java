package hazem.nurmontage.videoquran.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PCMWaveformExtractor {
    public static float[] extractWaveform(String textValue, int value) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(textValue);
        float[] fArr = new float[value];
        byte[] bArr = new byte[8192];
        float f = value;
        float length = ((int) (new File(textValue).length() / 2)) / f;
        int i2 = 0;
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read <= 0) {
                fileInputStream.close();
                return fArr;
            }
            for (int index = 0; index < read; index += 2) {
                float value = i2 / length;
                if (value >= f) {
                    break;
                }
                int i4 = (int) value;
                fArr[i4] = Math.max(fArr[i4], Math.abs((int) ((short) ((bArr[index + 1] << 8) | (bArr[index] & 255)))) / 32767.0f);
                i2++;
            }
        }
    }
}
