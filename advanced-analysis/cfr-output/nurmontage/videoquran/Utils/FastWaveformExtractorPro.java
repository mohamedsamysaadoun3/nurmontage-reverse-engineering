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

public class FastWaveformExtractorPro {
    private static float computeMaxAmp(ByteBuffer byteBuffer, int n) {
        int n2;
        byteBuffer.position(0);
        float f = 0.0f;
        for (int i = 0; i < (n2 = n + -1); i += 2) {
            n2 = Math.abs(byteBuffer.getShort(i));
            float f2 = n2;
            f = Math.max(f, f2);
        }
        return f / 32767.0f;
    }

    private static float[] downsample(float[] fArray, int n, int n2) {
        float[] fArray2 = new float[n2];
        float f = n;
        float f2 = n2;
        f /= f2;
        int n3 = 0;
        f2 = 0.0f;
        while (n3 < n2) {
            float f3 = (float)n3 * f;
            int n4 = n3 + 1;
            float f4 = (float)n4 * f;
            int n5 = (int)f4;
            float f5 = 0.0f;
            for (int i = (int)f3; i < n5 && i < n; ++i) {
                float f6 = fArray[i];
                f5 = Math.max(f5, f6);
            }
            fArray2[n3] = f5;
            n3 = n4;
        }
        return fArray2;
    }

    public static float[] extract(String string2, int n) {
        float[] fArray;
        Object object;
        String string3;
        Object object2;
        MediaFormat mediaFormat;
        int n2;
        MediaExtractor mediaExtractor;
        block9: {
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(string2);
            n2 = 0;
            mediaFormat = null;
            while (true) {
                int n3 = mediaExtractor.getTrackCount();
                object2 = "mime";
                if (n2 >= n3) break;
                string3 = mediaExtractor.getTrackFormat(n2).getString((String)object2);
                n3 = string3.startsWith((String)(object = "audio/")) ? 1 : 0;
                if (n3 == 0) {
                    ++n2;
                    continue;
                }
                break block9;
                break;
            }
            n2 = -1;
        }
        mediaExtractor.selectTrack(n2);
        mediaFormat = mediaExtractor.getTrackFormat(n2);
        string3 = MediaCodec.createDecoderByType((String)mediaFormat.getString((String)object2));
        int n4 = 0;
        object2 = null;
        string3.configure(mediaFormat, null, null, 0);
        string3.start();
        mediaFormat = new MediaCodec.BufferInfo();
        int n5 = 2000;
        float[] fArray2 = new float[n5];
        boolean bl = false;
        int n6 = 0;
        while (!bl) {
            int n7;
            block10: {
                long l;
                int n8;
                long l2 = 0L;
                int n9 = string3.dequeueInputBuffer(l2);
                boolean bl2 = true;
                if (n9 >= 0) {
                    int n10;
                    object2 = string3.getInputBuffer(n9);
                    n8 = mediaExtractor.readSampleData((ByteBuffer)object2, 0);
                    if (n8 < 0) {
                        long l3 = 0L;
                        double d = 0.0;
                        n10 = 4;
                        n7 = 0;
                        n8 = 0;
                        object2 = string3;
                        fArray = fArray2;
                        l = l2;
                        l2 = l3;
                        string3.queueInputBuffer(n9, 0, 0, l3, n10);
                        bl = bl2;
                    } else {
                        fArray = fArray2;
                        l = l2;
                        l2 = mediaExtractor.getSampleTime();
                        n10 = 0;
                        n7 = 0;
                        object2 = string3;
                        string3.queueInputBuffer(n9, 0, n8, l2, 0);
                        mediaExtractor.advance();
                    }
                } else {
                    fArray = fArray2;
                    l = l2;
                }
                while ((n4 = string3.dequeueOutputBuffer((MediaCodec.BufferInfo)mediaFormat, l)) >= 0) {
                    object = string3.getOutputBuffer(n4);
                    n7 = 2000;
                    if (n6 < n7) {
                        float f;
                        n8 = n6 + 1;
                        int n11 = mediaFormat.size;
                        fArray[n6] = f = FastWaveformExtractorPro.computeMaxAmp((ByteBuffer)object, n11);
                        n6 = n8;
                    }
                    string3.releaseOutputBuffer(n4, false);
                    n4 = mediaFormat.flags & 4;
                    if (n4 == 0) continue;
                    bl = bl2;
                    break block10;
                }
                n7 = 2000;
            }
            n5 = n7;
            fArray2 = fArray;
        }
        fArray = fArray2;
        string3.stop();
        string3.release();
        mediaExtractor.release();
        return FastWaveformExtractorPro.downsample(fArray2, n6, n);
    }
}

