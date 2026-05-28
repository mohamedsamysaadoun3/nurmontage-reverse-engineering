package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class UltraFastWaveform {
    public static float[] extractAmplitudes(String textValue, int value) throws IOException {
        int length = decodeToPCM(textValue).length;
        float[] fArr = new float[value];
        double d = length / value;
        int value2 = 0;
        while (value2 < value) {
            int i3 = value2 + 1;
            int min = Math.min((int) (i3 * d), length);
            float f = 0.0f;
            for (int counter = (int) (value2 * d); counter < min; counter++) {
                f = Math.max(f, Math.abs((int) r11[counter]) / 32767.0f);
            }
            fArr[value2] = f;
            value2 = i3;
        }
        return fArr;
    }

    private static short[] decodeToPCM(String textValue) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(textValue);
        MediaFormat mediaFormat = null;
        int value = 0;
        while (true) {
            if (value >= mediaExtractor.getTrackCount()) {
                value = -1;
                break;
            }
            mediaFormat = mediaExtractor.getTrackFormat(value);
            if (mediaFormat.getString("mime").startsWith("audio/")) {
                break;
            }
            value++;
        }
        if (value == -1) {
            throw new IOException("No audio track found");
        }
        mediaExtractor.selectTrack(value);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        ArrayList arrayList = new ArrayList();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z = false;
        while (!z) {
            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(1000L);
            if (dequeueInputBuffer >= 0) {
                int readSampleData = mediaExtractor.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData < 0) {
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    z = true;
                } else {
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                }
            }
            while (true) {
                int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, 1000L);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(dequeueOutputBuffer);
                    outputBuffer.position(0);
                    while (outputBuffer.remaining() > 1) {
                        arrayList.add(Short.valueOf(outputBuffer.getShort()));
                    }
                    createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        }
        createDecoderByType.stop();
        createDecoderByType.release();
        mediaExtractor.release();
        short[] sArr = new short[arrayList.size()];
        for (int value2 = 0; value2 < arrayList.size(); value2++) {
            sArr[value2] = ((Short) arrayList.get(value2)).shortValue();
        }
        return sArr;
    }
}
