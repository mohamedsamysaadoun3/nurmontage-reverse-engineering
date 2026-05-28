/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaExtractor
 *  android.media.MediaFormat
 */
package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public class FastWaveformExtractorOptimized {
    private static float computeAmp(ByteBuffer byteBuffer, int n) {
        int n2;
        byteBuffer.position(0);
        float f = 0.0f;
        for (int i = 0; i < (n2 = n + -1); i += 2) {
            n2 = Math.abs(byteBuffer.getShort(i));
            float f2 = n2;
            float f3 = 32767.0f;
            f = Math.max(f, f2 /= f3);
        }
        return f;
    }

    public static float[] extract(String string2, int n) {
        String string3;
        Object object;
        MediaFormat mediaFormat;
        int n2;
        MediaExtractor mediaExtractor;
        int n3;
        block7: {
            n3 = n;
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(string2);
            n2 = 0;
            mediaFormat = null;
            while (true) {
                String string4;
                int n4 = mediaExtractor.getTrackCount();
                object = "mime";
                if (n2 >= n4) break;
                string3 = mediaExtractor.getTrackFormat(n2).getString((String)object);
                n4 = string3.startsWith(string4 = "audio/") ? 1 : 0;
                if (n4 == 0) {
                    ++n2;
                    continue;
                }
                break block7;
                break;
            }
            n2 = -1;
        }
        mediaExtractor.selectTrack(n2);
        mediaFormat = mediaExtractor.getTrackFormat(n2);
        string3 = MediaCodec.createDecoderByType((String)mediaFormat.getString((String)object));
        string3.configure(mediaFormat, null, null, 0);
        string3.start();
        float[] fArray = new float[n3];
        object = "durationUs";
        long l = mediaFormat.getLong((String)object);
        long l2 = n3;
        long l3 = l / l2;
        mediaFormat = new MediaCodec.BufferInfo();
        ByteBuffer[] byteBufferArray = string3.getInputBuffers();
        ByteBuffer[] byteBufferArray2 = string3.getOutputBuffers();
        long l4 = 0L;
        double d = 0.0;
        int n5 = 0;
        l = l4;
        double d2 = d;
        while (n5 < n3) {
            int n6;
            int n7 = 2;
            mediaExtractor.seekTo(l, n7);
            long l5 = l + l3;
            int n8 = string3.dequeueInputBuffer(l4);
            if (n8 >= 0) {
                object = byteBufferArray[n8];
                int n9 = mediaExtractor.readSampleData((ByteBuffer)object, 0);
                if (n9 < 0) break;
                long l6 = mediaExtractor.getSampleTime();
                n7 = 0;
                object = string3;
                l4 = l6;
                n6 = n5;
                n5 = 0;
                string3.queueInputBuffer(n8, 0, n9, l6, 0);
                mediaExtractor.advance();
                l = 0L;
                d2 = 0.0;
            } else {
                n6 = n5;
                l = l4;
                d2 = d;
            }
            n7 = string3.dequeueOutputBuffer((MediaCodec.BufferInfo)mediaFormat, l);
            if (n7 >= 0) {
                float f;
                ByteBuffer byteBuffer = byteBufferArray2[n7];
                n5 = n6 + 1;
                int n10 = mediaFormat.size;
                fArray[n6] = f = FastWaveformExtractorOptimized.computeAmp(byteBuffer, n10);
                string3.releaseOutputBuffer(n7, false);
            } else {
                n5 = n6;
            }
            l4 = l;
            d = d2;
            l = l5;
        }
        string3.stop();
        string3.release();
        mediaExtractor.release();
        return fArray;
    }
}

