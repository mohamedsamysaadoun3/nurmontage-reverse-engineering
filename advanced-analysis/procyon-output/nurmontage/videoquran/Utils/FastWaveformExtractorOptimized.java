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

public class FastWaveformExtractorOptimized
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
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(dataSource);
        int n2 = 0;
        String s;
        while (true) {
            final int trackCount = mediaExtractor.getTrackCount();
            s = "mime";
            if (n2 >= trackCount) {
                n2 = -1;
                break;
            }
            if (mediaExtractor.getTrackFormat(n2).getString(s).startsWith("audio/")) {
                break;
            }
            ++n2;
        }
        mediaExtractor.selectTrack(n2);
        final MediaFormat trackFormat = mediaExtractor.getTrackFormat(n2);
        final MediaCodec decoderByType = MediaCodec.createDecoderByType(trackFormat.getString(s));
        decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
        decoderByType.start();
        final float[] array = new float[n];
        final long n3 = trackFormat.getLong("durationUs") / n;
        final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        final ByteBuffer[] inputBuffers = decoderByType.getInputBuffers();
        final ByteBuffer[] outputBuffers = decoderByType.getOutputBuffers();
        long n4 = 0L;
        double n5 = 0.0;
        int i = 0;
        long n6 = n4;
        while (i < n) {
            mediaExtractor.seekTo(n6, 2);
            final long n7 = n6 + n3;
            final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n4);
            int n8;
            long n9;
            double n10;
            if (dequeueInputBuffer >= 0) {
                final int sampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                if (sampleData < 0) {
                    break;
                }
                final long sampleTime = mediaExtractor.getSampleTime();
                n8 = i;
                decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, sampleTime, 0);
                mediaExtractor.advance();
                n9 = 0L;
                n10 = 0.0;
            }
            else {
                n8 = i;
                n9 = n4;
                n10 = n5;
            }
            final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo, n9);
            if (dequeueOutputBuffer >= 0) {
                final ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                i = n8 + 1;
                array[n8] = computeAmp(byteBuffer, mediaCodec$BufferInfo.size);
                decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            else {
                i = n8;
            }
            n4 = n9;
            n5 = n10;
            n6 = n7;
        }
        decoderByType.stop();
        decoderByType.release();
        mediaExtractor.release();
        return array;
    }
}
