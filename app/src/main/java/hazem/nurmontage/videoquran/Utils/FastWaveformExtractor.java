package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class FastWaveformExtractor {
    public static float[] extract(String textValue, int value) throws Exception {
        ByteBuffer[] byteBufferArr;
        long j;
        int value2;
        MediaCodec.BufferInfo bufferInfo;
        int i3;
        int i4 = value;
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(textValue);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= mediaExtractor.getTrackCount()) {
                i6 = -1;
                break;
            }
            if (mediaExtractor.getTrackFormat(i6).getString("mime").startsWith("audio/")) {
                break;
            }
            i6++;
        }
        mediaExtractor.selectTrack(i6);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i6);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        float[] fArr = new float[i4];
        long j2 = trackFormat.getLong("durationUs") / i4;
        ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
        ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        long j3 = 0;
        int i7 = 0;
        while (i7 < i4) {
            mediaExtractor.seekTo(j3, 2);
            long positionMs = j3 + j2;
            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(5000L);
            if (dequeueInputBuffer >= 0) {
                int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], i5);
                if (readSampleData < 0) {
                    break;
                }
                byteBufferArr = inputBuffers;
                j = 5000;
                value2 = i7;
                bufferInfo = bufferInfo2;
                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
            } else {
                byteBufferArr = inputBuffers;
                j = 5000;
                value2 = i7;
                bufferInfo = bufferInfo2;
            }
            int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer >= 0) {
                i7 = value2 + 1;
                fArr[value2] = computeAmp(outputBuffers[dequeueOutputBuffer], bufferInfo.size);
                i3 = 0;
                createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                i3 = 0;
                i7 = value2;
            }
            bufferInfo2 = bufferInfo;
            i5 = i3;
            j3 = positionMs;
            inputBuffers = byteBufferArr;
            i4 = value;
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
