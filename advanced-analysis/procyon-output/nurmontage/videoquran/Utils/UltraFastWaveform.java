// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.io.IOException;
import android.media.MediaCodec$BufferInfo;
import java.util.ArrayList;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import android.media.MediaExtractor;

public class UltraFastWaveform
{
    private static short[] decodeToPCM(final String dataSource) {
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(dataSource);
        int i = 0;
        MediaFormat trackFormat = null;
        int n = 0;
        String s;
        int n2;
        while (true) {
            final int trackCount = mediaExtractor.getTrackCount();
            s = "mime";
            n2 = -1;
            if (n >= trackCount) {
                n = n2;
                break;
            }
            trackFormat = mediaExtractor.getTrackFormat(n);
            if (trackFormat.getString(s).startsWith("audio/")) {
                break;
            }
            ++n;
        }
        if (n != n2) {
            mediaExtractor.selectTrack(n);
            final MediaCodec decoderByType = MediaCodec.createDecoderByType(trackFormat.getString(s));
            decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
            decoderByType.start();
            final ArrayList<Short> list = new ArrayList<Short>();
            final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
            int j = 0;
            while (j == 0) {
                final long n3 = 1000L;
                final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n3);
                final int n4 = 1;
                if (dequeueInputBuffer >= 0) {
                    final int sampleData = mediaExtractor.readSampleData(decoderByType.getInputBuffer(dequeueInputBuffer), 0);
                    if (sampleData < 0) {
                        decoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        j = n4;
                    }
                    else {
                        decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                        mediaExtractor.advance();
                    }
                }
                while (true) {
                    final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo, n3);
                    if (dequeueOutputBuffer < 0) {
                        break;
                    }
                    final ByteBuffer outputBuffer = decoderByType.getOutputBuffer(dequeueOutputBuffer);
                    outputBuffer.position();
                    while (outputBuffer.remaining() > n4) {
                        list.add(outputBuffer.getShort());
                    }
                    decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
            decoderByType.stop();
            decoderByType.release();
            mediaExtractor.release();
            final short[] array = new short[list.size()];
            while (i < list.size()) {
                array[i] = list.get(i);
                ++i;
            }
            return array;
        }
        throw new IOException("No audio track found");
    }
    
    public static float[] extractAmplitudes(final String s, final int n) {
        final short[] decodeToPCM = decodeToPCM(s);
        final int length = decodeToPCM.length;
        final float[] array = new float[n];
        final double n2 = length / (double)n;
        int n3;
        for (int i = 0; i < n; i = n3) {
            int j = (int)(i * n2);
            n3 = i + 1;
            final int min = Math.min((int)(n3 * n2), length);
            float max = 0.0f;
            while (j < min) {
                max = Math.max(max, Math.abs(decodeToPCM[j]) / 32767.0f);
                ++j;
            }
            array[i] = max;
        }
        return array;
    }
}
