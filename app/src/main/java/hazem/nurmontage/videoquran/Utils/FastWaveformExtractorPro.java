package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class FastWaveformExtractorPro {
    public static float[] extract(String textValue, int value) throws Exception {
        float[] fArr;
        long j;
        char c;
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(textValue);
        int value2 = 0;
        while (true) {
            if (value2 >= mediaExtractor.getTrackCount()) {
                value2 = -1;
                break;
            }
            if (mediaExtractor.getTrackFormat(value2).getString("mime").startsWith("audio/")) {
                break;
            }
            value2++;
        }
        mediaExtractor.selectTrack(value2);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(value2);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        float[] fArr2 = new float[2000];
        boolean z = false;
        int i3 = 0;
        while (!z) {
            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                int readSampleData = mediaExtractor.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData < 0) {
                    fArr = fArr2;
                    j = 0;
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    z = true;
                } else {
                    fArr = fArr2;
                    j = 0;
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                }
            } else {
                fArr = fArr2;
                j = 0;
            }
            while (true) {
                int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                if (dequeueOutputBuffer < 0) {
                    c = 2000;
                    break;
                }
                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(dequeueOutputBuffer);
                c = 2000;
                if (i3 < 2000) {
                    fArr[i3] = computeMaxAmp(outputBuffer, bufferInfo.size);
                    i3++;
                }
                createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    z = true;
                    break;
                }
            }
            fArr2 = fArr;
        }
        createDecoderByType.stop();
        createDecoderByType.release();
        mediaExtractor.release();
        return downsample(fArr2, i3, value);
    }

    private static float computeMaxAmp(ByteBuffer byteBuffer, int value) {
        byteBuffer.position(0);
        float f = 0.0f;
        for (int value2 = 0; value2 < value - 1; value2 += 2) {
            f = Math.max(f, Math.abs((int) byteBuffer.getShort(value2)));
        }
        return f / 32767.0f;
    }

    private static float[] downsample(float[] fArr, int value, int value2) {
        float[] fArr2 = new float[value2];
        float f = value / value2;
        int i3 = 0;
        while (i3 < value2) {
            int i4 = i3 + 1;
            int i5 = (int) (i4 * f);
            float f2 = 0.0f;
            for (int value6 = (int) (i3 * f); value6 < i5 && value6 < value; value6++) {
                f2 = Math.max(f2, fArr[value6]);
            }
            fArr2[i3] = f2;
            i3 = i4;
        }
        return fArr2;
    }
}
