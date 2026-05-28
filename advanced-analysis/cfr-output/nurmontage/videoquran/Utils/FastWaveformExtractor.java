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

public class FastWaveformExtractor {
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
        float f;
        Object object2;
        int n2;
        int n3;
        MediaExtractor mediaExtractor;
        int n4;
        block7: {
            n4 = n;
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(string2);
            n3 = 0;
            n2 = 0;
            object2 = null;
            f = 0.0f;
            while (true) {
                String string4;
                int n5 = mediaExtractor.getTrackCount();
                object = "mime";
                if (n2 >= n5) break;
                string3 = mediaExtractor.getTrackFormat(n2).getString((String)object);
                n5 = string3.startsWith(string4 = "audio/") ? 1 : 0;
                if (n5 == 0) {
                    ++n2;
                    continue;
                }
                break block7;
                break;
            }
            n2 = -1;
            f = 0.0f / 0.0f;
        }
        mediaExtractor.selectTrack(n2);
        object2 = mediaExtractor.getTrackFormat(n2);
        string3 = MediaCodec.createDecoderByType((String)object2.getString((String)object));
        int n6 = 0;
        string3.configure((MediaFormat)object2, null, null, 0);
        string3.start();
        float[] fArray = new float[n4];
        object = "durationUs";
        long l = object2.getLong((String)object);
        long l2 = n4;
        long l3 = l / l2;
        object2 = string3.getInputBuffers();
        ByteBuffer[] byteBufferArray = string3.getOutputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        l = 0L;
        int n7 = 0;
        while (n7 < n4) {
            MediaCodec.BufferInfo bufferInfo2;
            int n8;
            long l4;
            ByteBuffer[] byteBufferArray2;
            int n9 = 2;
            mediaExtractor.seekTo(l, n9);
            long l5 = l + l3;
            l2 = 5000L;
            int n10 = string3.dequeueInputBuffer(l2);
            if (n10 >= 0) {
                object = object2[n10];
                int n11 = mediaExtractor.readSampleData((ByteBuffer)object, 0);
                if (n11 < 0) break;
                long l6 = mediaExtractor.getSampleTime();
                object = string3;
                byteBufferArray2 = object2;
                l4 = l2;
                n9 = 0;
                n8 = n7;
                bufferInfo2 = bufferInfo;
                bufferInfo = null;
                string3.queueInputBuffer(n10, 0, n11, l6, 0);
                mediaExtractor.advance();
            } else {
                byteBufferArray2 = object2;
                l4 = l2;
                n8 = n7;
                bufferInfo2 = bufferInfo;
            }
            n3 = string3.dequeueOutputBuffer(bufferInfo2, l4);
            if (n3 >= 0) {
                object2 = byteBufferArray[n3];
                n6 = bufferInfo2.size;
                f = FastWaveformExtractor.computeAmp((ByteBuffer)object2, n6);
                n7 = n8 + 1;
                fArray[n8] = f;
                n2 = 0;
                f = 0.0f;
                object2 = null;
                string3.releaseOutputBuffer(n3, false);
            } else {
                n2 = 0;
                f = 0.0f;
                object2 = null;
                n7 = n8;
            }
            bufferInfo = bufferInfo2;
            n3 = 0;
            l = l5;
            object2 = byteBufferArray2;
            n4 = n;
        }
        string3.stop();
        string3.release();
        mediaExtractor.release();
        return fArray;
    }
}

