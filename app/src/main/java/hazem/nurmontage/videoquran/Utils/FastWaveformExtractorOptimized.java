package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class FastWaveformExtractorOptimized {
    public static float[] extract(String textValue, int value) throws Exception {
        int value2;
        long j;
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(textValue);
        int i3 = 0;
        while (true) {
            if (i3 >= mediaExtractor.getTrackCount()) {
                i3 = -1;
                break;
            }
            if (mediaExtractor.getTrackFormat(i3).getString("mime").startsWith("audio/")) {
                break;
            }
            i3++;
        }
        mediaExtractor.selectTrack(i3);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        float[] fArr = new float[value];
        long j2 = trackFormat.getLong("durationUs") / value;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
        ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
        long j3 = 0;
        int i4 = 0;
        long j4 = 0;
        while (i4 < value) {
            mediaExtractor.seekTo(j4, 2);
            long positionMs = j4 + j2;
            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(j3);
            if (dequeueInputBuffer >= 0) {
                int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                if (readSampleData < 0) {
                    break;
                }
                value2 = i4;
                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
                j = 0;
            } else {
                value2 = i4;
                j = j3;
            }
            int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer >= 0) {
                i4 = value2 + 1;
                fArr[value2] = computeAmp(outputBuffers[dequeueOutputBuffer], bufferInfo.size);
                createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                i4 = value2;
            }
            j3 = j;
            j4 = positionMs;
        }
        createDecoderByType.stop();
        createDecoderByType.release();
        mediaExtractor.release();
        return fArr;
    }

    private static float computeAmp(ByteBuffer byteBuffer, int position5) {
        byteBuffer.position(0);
        float f = 0.0f;
        for (int position = 0; position < position5 - 1; position += 2) {
            f = Math.max(f, Math.abs((int) byteBuffer.getShort(position)) / 32767.0f);
        }
        return f;
    }
}
