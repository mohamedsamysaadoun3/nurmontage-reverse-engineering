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

public class FastWaveformExtractorPro
{
    private static float computeMaxAmp(final ByteBuffer byteBuffer, final int n) {
        int i = 0;
        byteBuffer.position();
        float max = 0.0f;
        while (i < n - 1) {
            max = Math.max(max, (float)Math.abs(byteBuffer.getShort(i)));
            i += 2;
        }
        return max / 32767.0f;
    }
    
    private static float[] downsample(final float[] array, final int n, final int n2) {
        final float[] array2 = new float[n2];
        final float n3 = n / (float)n2;
        int n5;
        for (int i = 0; i < n2; i = n5) {
            int n4 = (int)(i * n3);
            n5 = i + 1;
            final int n6 = (int)(n5 * n3);
            float max = 0.0f;
            while (n4 < n6 && n4 < n) {
                max = Math.max(max, array[n4]);
                ++n4;
            }
            array2[i] = max;
        }
        return array2;
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
        final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        float[] array = new float[2000];
        int i = 0;
        int n3 = 0;
    Label_0148:
        while (i == 0) {
            final long n4 = 0L;
            final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n4);
            final int n5 = 1;
            float[] array2;
            long n8;
            if (dequeueInputBuffer >= 0) {
                final int sampleData = mediaExtractor.readSampleData(decoderByType.getInputBuffer(dequeueInputBuffer), 0);
                if (sampleData < 0) {
                    final long n6 = 0L;
                    final int n7 = 4;
                    array2 = array;
                    n8 = n4;
                    decoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, n6, n7);
                    i = n5;
                }
                else {
                    array2 = array;
                    n8 = n4;
                    decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                }
            }
            else {
                array2 = array;
                n8 = n4;
            }
            while (true) {
                do {
                    final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo, n8);
                    if (dequeueOutputBuffer < 0) {
                        final int n9 = 2000;
                        array = array2;
                        continue Label_0148;
                    }
                    final ByteBuffer outputBuffer = decoderByType.getOutputBuffer(dequeueOutputBuffer);
                    final int n9 = 2000;
                    if (n3 < n9) {
                        final int n10 = n3 + 1;
                        array2[n3] = computeMaxAmp(outputBuffer, mediaCodec$BufferInfo.size);
                        n3 = n10;
                    }
                    decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                } while ((mediaCodec$BufferInfo.flags & 0x4) == 0x0);
                i = n5;
                continue;
            }
        }
        decoderByType.stop();
        decoderByType.release();
        mediaExtractor.release();
        return downsample(array, n3, n);
    }
}
