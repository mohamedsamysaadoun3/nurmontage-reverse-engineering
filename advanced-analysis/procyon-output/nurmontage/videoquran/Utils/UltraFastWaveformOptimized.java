// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.io.IOException;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import android.media.MediaExtractor;

public class UltraFastWaveformOptimized
{
    public static float[] extractAmplitudes(final String dataSource, final int n) {
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(dataSource);
        MediaFormat trackFormat = null;
        int n2 = 0;
        String s;
        int n3;
        while (true) {
            final int trackCount = mediaExtractor.getTrackCount();
            s = "mime";
            n3 = -1;
            if (n2 >= trackCount) {
                n2 = n3;
                break;
            }
            trackFormat = mediaExtractor.getTrackFormat(n2);
            if (trackFormat.getString(s).startsWith("audio/")) {
                break;
            }
            ++n2;
        }
        if (n2 != n3) {
            mediaExtractor.selectTrack(n2);
            final MediaCodec decoderByType = MediaCodec.createDecoderByType(trackFormat.getString(s));
            decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
            decoderByType.start();
            final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
            final float[] array = new float[n];
            trackFormat.getLong("durationUs");
            final int[] array2 = new int[n];
            int i = 0;
            int n4 = 0;
            while (i == 0) {
                final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(1000L);
                if (dequeueInputBuffer >= 0) {
                    final int sampleData = mediaExtractor.readSampleData(decoderByType.getInputBuffer(dequeueInputBuffer), 0);
                    if (sampleData < 0) {
                        decoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        i = 1;
                    }
                    else {
                        decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                        mediaExtractor.advance();
                    }
                }
                while (true) {
                    final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo, 1000L);
                    if (dequeueOutputBuffer < 0) {
                        break;
                    }
                    final ByteBuffer outputBuffer = decoderByType.getOutputBuffer(dequeueOutputBuffer);
                    outputBuffer.position();
                    final int n5 = mediaCodec$BufferInfo.size / 2;
                    final float n6 = n5 / (float)n;
                    for (int j = 0; j < n5; j += 2) {
                        final short short1 = outputBuffer.getShort(j);
                        final int n7 = (int)(n4 / n6);
                        if (n7 >= n) {
                            break;
                        }
                        array[n7] = Math.max(array[n7], Math.abs(short1) / 32767.0f);
                        ++n4;
                    }
                    decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
            decoderByType.stop();
            decoderByType.release();
            mediaExtractor.release();
            return array;
        }
        throw new IOException("No audio track found");
    }
}
