// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

public class FastWaveformExtractor
{
    private static float computeAmp(final ByteBuffer byteBuffer, final int n) {
        int i = 0;
        byteBuffer.position();
        float max = 0.0f;
        while (i < n - 1) {
            max = Math.max(max, Math.abs(byteBuffer.getShort(i)) / 32767.0f);
            i += 2;
        }
        return max;
    }
    
    public static float[] extract(final String dataSource, final int n) {
        int n2 = n;
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(dataSource);
        int n3 = 0;
        String s;
        while (true) {
            final int trackCount = mediaExtractor.getTrackCount();
            s = "mime";
            if (n3 >= trackCount) {
                n3 = -1;
                break;
            }
            if (mediaExtractor.getTrackFormat(n3).getString(s).startsWith("audio/")) {
                break;
            }
            ++n3;
        }
        mediaExtractor.selectTrack(n3);
        final MediaFormat trackFormat = mediaExtractor.getTrackFormat(n3);
        final MediaCodec decoderByType = MediaCodec.createDecoderByType(trackFormat.getString(s));
        decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
        decoderByType.start();
        final float[] array = new float[n2];
        final long n4 = trackFormat.getLong("durationUs") / n2;
        ByteBuffer[] inputBuffers = decoderByType.getInputBuffers();
        final ByteBuffer[] outputBuffers = decoderByType.getOutputBuffers();
        MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        long n5 = 0L;
        for (int i = 0; i < n2; n2 = n) {
            mediaExtractor.seekTo(n5, 2);
            final long n6 = n5 + n4;
            final long n7 = 5000L;
            final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n7);
            ByteBuffer[] array2;
            long n8;
            int n9;
            MediaCodec$BufferInfo mediaCodec$BufferInfo2;
            if (dequeueInputBuffer >= 0) {
                final int sampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                if (sampleData < 0) {
                    break;
                }
                final long sampleTime = mediaExtractor.getSampleTime();
                array2 = inputBuffers;
                n8 = n7;
                n9 = i;
                mediaCodec$BufferInfo2 = mediaCodec$BufferInfo;
                decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, sampleTime, 0);
                mediaExtractor.advance();
            }
            else {
                array2 = inputBuffers;
                n8 = n7;
                n9 = i;
                mediaCodec$BufferInfo2 = mediaCodec$BufferInfo;
            }
            final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo2, n8);
            if (dequeueOutputBuffer >= 0) {
                final float computeAmp = computeAmp(outputBuffers[dequeueOutputBuffer], mediaCodec$BufferInfo2.size);
                i = n9 + 1;
                array[n9] = computeAmp;
                decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            else {
                i = n9;
            }
            mediaCodec$BufferInfo = mediaCodec$BufferInfo2;
            n5 = n6;
            inputBuffers = array2;
        }
        decoderByType.stop();
        decoderByType.release();
        mediaExtractor.release();
        return array;
    }
}
