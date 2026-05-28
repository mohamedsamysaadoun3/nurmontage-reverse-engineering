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
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class WaveformExtractor {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static float[] extractAmplitudes(String string2, int n) {
        void var35_40;
        int n2 = n;
        MediaExtractor mediaExtractor = new MediaExtractor();
        String string3 = string2;
        mediaExtractor.setDataSource(string2);
        int n3 = WaveformExtractor.selectAudioTrack(mediaExtractor);
        if (n3 < 0) {
            return new float[n];
        }
        mediaExtractor.selectTrack(n3);
        string3 = mediaExtractor.getTrackFormat(n3);
        String string4 = "sample-rate";
        string3.getInteger(string4);
        string4 = "mime";
        string4 = string3.getString(string4);
        string4 = MediaCodec.createDecoderByType((String)string4);
        int n4 = 0;
        float f = 0.0f;
        Object object = null;
        int n5 = 0;
        string4.configure((MediaFormat)string3, null, null, 0);
        string4.start();
        ByteBuffer[] byteBufferArray = string4.getInputBuffers();
        ByteBuffer[] byteBufferArray2 = string4.getOutputBuffers();
        float[] fArray = new float[n];
        float[] fArray2 = new float[n];
        object = "durationUs";
        long l = string3.getLong((String)object);
        float f2 = l;
        float f3 = 1000000.0f;
        f2 /= f3;
        f = n;
        f2 /= f;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean bl = false;
        while (true) {
            void var14_19;
            ByteBuffer[] byteBufferArray3;
            block50: {
                Buffer buffer;
                float f4;
                int n6;
                int n7;
                int n8;
                block49: {
                    block48: {
                        long l2;
                        block47: {
                            void var19_25;
                            void var14_15;
                            long l3;
                            block45: {
                                l3 = 10000L;
                                if (!bl) {
                                    block46: {
                                        n8 = string4.dequeueInputBuffer(l3);
                                        if (n8 < 0) break block45;
                                        object = byteBufferArray[n8];
                                        n7 = mediaExtractor.readSampleData((ByteBuffer)object, 0);
                                        if (n7 >= 0) break block46;
                                        long l4 = 0L;
                                        double d = 0.0;
                                        int n9 = 4;
                                        float f5 = 5.6E-45f;
                                        n6 = 0;
                                        n7 = 0;
                                        object = string4;
                                        byteBufferArray3 = byteBufferArray;
                                        l2 = l3;
                                        l3 = l4;
                                        var35_40 = var14_15;
                                        void var14_16 = var19_25;
                                        f4 = f5;
                                        string4.queueInputBuffer(n8, 0, 0, l4, n9);
                                        bl = true;
                                        break block47;
                                    }
                                    byteBufferArray3 = byteBufferArray;
                                    var35_40 = var14_15;
                                    l2 = l3;
                                    void var14_17 = var19_25;
                                    l3 = mediaExtractor.getSampleTime();
                                    n6 = 0;
                                    f4 = 0.0f;
                                    Object var19_26 = null;
                                    object = string4;
                                    string4.queueInputBuffer(n8, 0, n7, l3, 0);
                                    mediaExtractor.advance();
                                    break block47;
                                }
                            }
                            byteBufferArray3 = byteBufferArray;
                            var35_40 = var14_15;
                            l2 = l3;
                            void var14_18 = var19_25;
                        }
                        n4 = string4.dequeueOutputBuffer((MediaCodec.BufferInfo)var14_19, l2);
                        if (n4 < 0) break block48;
                        buffer = byteBufferArray2[n4];
                        n6 = var14_19.offset;
                        ((ByteBuffer)buffer).position(n6);
                        n6 = var14_19.offset;
                        n7 = var14_19.size;
                        n6 += n7;
                        ((ByteBuffer)buffer).limit(n6);
                        buffer = ((ByteBuffer)buffer).asShortBuffer();
                        n6 = buffer.remaining();
                        break block49;
                    }
                    n8 = 0;
                    buffer = null;
                    break block50;
                }
                for (n7 = 0; n7 < n6; ++n7) {
                    int n10 = ((ShortBuffer)buffer).get(n7);
                    n10 = Math.abs(n10);
                    float f6 = n10;
                    int n11 = 0x47000000;
                    float f7 = 32768.0f;
                    f6 /= f7;
                    long l5 = var14_19.presentationTimeUs;
                    f7 = (float)l5 / f3 / f2;
                    n11 = (int)f7;
                    if (n11 >= n2) continue;
                    f4 = fArray[n11] + f6;
                    fArray[n11] = f4;
                    f6 = var35_40[n11];
                    f4 = 1.0f;
                    f6 += f4;
                    var35_40[n11] = f6;
                }
                n8 = 0;
                buffer = null;
                string4.releaseOutputBuffer(n4, false);
                n4 = var14_19.flags & 4;
                if (n4 == 0) break block50;
                break;
            }
            n5 = 0;
            void var19_28 = var14_19;
            void var14_20 = var35_40;
            byteBufferArray = byteBufferArray3;
        }
        for (n5 = 0; n5 < n2; ++n5) {
            f2 = var35_40[n5];
            f = 0.0f;
            object = null;
            float f8 = f2 - 0.0f;
            n4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (n4 <= 0) continue;
            f = fArray[n5] / f2;
            fArray[n5] = f;
        }
        try {
            string4.stop();
            string4.release();
            mediaExtractor.release();
            return fArray;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new float[n2];
        }
    }

    private static int selectAudioTrack(MediaExtractor mediaExtractor) {
        int n;
        for (int i = 0; i < (n = mediaExtractor.getTrackCount()); ++i) {
            String string2;
            String string3 = mediaExtractor.getTrackFormat(i).getString("mime");
            n = string3.startsWith(string2 = "audio/") ? 1 : 0;
            if (n == 0) continue;
            return i;
        }
        return -1;
    }
}

