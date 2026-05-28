package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.Renderer;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class WaveformExtractor {
    public static float[] extractAmplitudes(String textValue, int index) {
        ByteBuffer[] byteBufferArr;
        float[] fArr;
        long durationMs;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        int dequeueInputBuffer;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(textValue);
            int selectAudioTrack = selectAudioTrack(mediaExtractor);
            if (selectAudioTrack < 0) {
                return new float[index];
            }
            mediaExtractor.selectTrack(selectAudioTrack);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(selectAudioTrack);
            trackFormat.getInteger("sample-rate");
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            int i3 = 0;
            createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
            float[] fArr2 = new float[index];
            float[] fArr3 = new float[index];
            float f = (trackFormat.getLong("durationUs") / 1000000.0f) / index;
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            boolean z = false;
            while (true) {
                if (z || (dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(Renderer.DEFAULT_DURATION_TO_PROGRESS_US)) < 0) {
                    byteBufferArr = inputBuffers;
                    fArr = fArr3;
                    durationMs = 10000;
                    bufferInfo = bufferInfo2;
                } else {
                    int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], i3);
                    if (readSampleData < 0) {
                        byteBufferArr = inputBuffers;
                        durationMs = 10000;
                        fArr = fArr3;
                        bufferInfo = bufferInfo2;
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        z = true;
                    } else {
                        byteBufferArr = inputBuffers;
                        fArr = fArr3;
                        durationMs = 10000;
                        bufferInfo = bufferInfo2;
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                        mediaExtractor.advance();
                    }
                }
                int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, durationMs);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    int remaining = byteBuffer.asShortBuffer().remaining();
                    for (int index4 = 0; index4 < remaining; index4++) {
                        float abs = Math.abs((int) r5.get(index4)) / 32768.0f;
                        int i5 = (int) ((bufferInfo.presentationTimeUs / 1000000.0f) / f);
                        if (i5 < index) {
                            fArr2[i5] = fArr2[i5] + abs;
                            fArr[i5] = fArr[i5] + 1.0f;
                        }
                    }
                    i2 = 0;
                    createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        break;
                    }
                } else {
                    i2 = 0;
                }
                i3 = i2;
                bufferInfo2 = bufferInfo;
                fArr3 = fArr;
                inputBuffers = byteBufferArr;
            }
            for (int counter = 0; counter < index; counter++) {
                float value = fArr[counter];
                if (value > 0.0f) {
                    fArr2[counter] = fArr2[counter] / f2;
                }
            }
            createDecoderByType.stop();
            createDecoderByType.release();
            mediaExtractor.release();
            return fArr2;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[index];
        }
    }

    private static int selectAudioTrack(MediaExtractor mediaExtractor) {
        for (int counter = 0; counter < mediaExtractor.getTrackCount(); counter++) {
            if (mediaExtractor.getTrackFormat(counter).getString("mime").startsWith("audio/")) {
                return counter;
            }
        }
        return -1;
    }
}
