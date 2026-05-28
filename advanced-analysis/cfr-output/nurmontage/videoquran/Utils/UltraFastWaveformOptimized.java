/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaExtractor
 */
package hazem.nurmontage.videoquran.Utils;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.io.IOException;
import java.nio.ByteBuffer;

public class UltraFastWaveformOptimized {
    public static float[] extractAmplitudes(String string2, int n) {
        Object object;
        Object object2;
        int n2;
        String string3;
        int n3;
        MediaCodec mediaCodec;
        int n4;
        Object object3;
        boolean bl;
        String string4;
        MediaExtractor mediaExtractor;
        int n5;
        block9: {
            n5 = n;
            mediaExtractor = new MediaExtractor();
            string4 = string2;
            mediaExtractor.setDataSource(string2);
            string4 = null;
            bl = false;
            object3 = null;
            n4 = 0;
            mediaCodec = null;
            while (true) {
                n3 = mediaExtractor.getTrackCount();
                string3 = "mime";
                n2 = -1;
                if (n4 >= n3) break;
                object3 = mediaExtractor.getTrackFormat(n4);
                object2 = object3.getString(string3);
                n3 = ((String)object2).startsWith((String)(object = "audio/")) ? 1 : 0;
                if (n3 == 0) {
                    ++n4;
                    continue;
                }
                break block9;
                break;
            }
            n4 = n2;
        }
        if (n4 != n2) {
            mediaExtractor.selectTrack(n4);
            mediaCodec = MediaCodec.createDecoderByType((String)object3.getString(string3));
            mediaCodec.configure(object3, null, null, 0);
            mediaCodec.start();
            string4 = new MediaCodec.BufferInfo();
            float[] fArray = new float[n5];
            object2 = "durationUs";
            object3.getLong((String)object2);
            object3 = new int[n5];
            bl = false;
            object3 = null;
            int n6 = 0;
            while (!bl) {
                long l;
                float f;
                int n7;
                long l2 = 1000L;
                int n8 = mediaCodec.dequeueInputBuffer(l2);
                if (n8 >= 0) {
                    object2 = mediaCodec.getInputBuffer(n8);
                    int n9 = mediaExtractor.readSampleData((ByteBuffer)object2, 0);
                    if (n9 < 0) {
                        long l3 = 0L;
                        n7 = 4;
                        f = 5.6E-45f;
                        n2 = 0;
                        n9 = 0;
                        object = null;
                        object2 = mediaCodec;
                        l2 = l3;
                        mediaCodec.queueInputBuffer(n8, 0, 0, l3, n7);
                        bl = true;
                    } else {
                        l2 = mediaExtractor.getSampleTime();
                        n7 = 0;
                        f = 0.0f;
                        n2 = 0;
                        object2 = mediaCodec;
                        mediaCodec.queueInputBuffer(n8, 0, n9, l2, 0);
                        mediaExtractor.advance();
                    }
                }
                while ((n2 = mediaCodec.dequeueOutputBuffer((MediaCodec.BufferInfo)string4, l = 1000L)) >= 0) {
                    object = mediaCodec.getOutputBuffer(n2);
                    ((ByteBuffer)object).position(0);
                    int n10 = ((MediaCodec.BufferInfo)string4).size / 2;
                    float f2 = n10;
                    f = n5;
                    f2 /= f;
                    f = 0.0f;
                    for (n7 = 0; n7 < n10; n7 += 2) {
                        int n11 = ((ByteBuffer)object).getShort(n7);
                        float f3 = (float)n6 / f2;
                        n3 = (int)f3;
                        if (n3 >= n5) break;
                        float f4 = fArray[n3];
                        n11 = Math.abs(n11);
                        float f5 = n11;
                        float f6 = 32767.0f;
                        fArray[n3] = f4 = Math.max(f4, f5 /= f6);
                        ++n6;
                        l = 1000L;
                    }
                    mediaCodec.releaseOutputBuffer(n2, false);
                }
            }
            mediaCodec.stop();
            mediaCodec.release();
            mediaExtractor.release();
            return fArray;
        }
        IOException iOException = new IOException("No audio track found");
        throw iOException;
    }
}

