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
import java.util.ArrayList;

public class UltraFastWaveform {
    private static short[] decodeToPCM(String arrayList) {
        String string2;
        Object object;
        short s;
        Object object2;
        Object object3;
        short s3;
        MediaFormat mediaFormat;
        short s4;
        Object object4;
        block10: {
            object4 = new MediaExtractor();
            object4.setDataSource(arrayList);
            arrayList = null;
            s4 = 0;
            mediaFormat = null;
            s3 = 0;
            object3 = null;
            while (true) {
                short s2 = object4.getTrackCount();
                object2 = "mime";
                s = -1;
                if (s3 >= s2) break;
                mediaFormat = object4.getTrackFormat((int)s3);
                object = mediaFormat.getString((String)object2);
                s2 = (short)(((String)object).startsWith(string2 = "audio/") ? 1 : 0);
                if (s2 == 0) {
                    ++s3;
                    continue;
                }
                break block10;
                break;
            }
            s3 = s;
        }
        if (s3 != s) {
            object4.selectTrack((int)s3);
            object3 = MediaCodec.createDecoderByType((String)mediaFormat.getString((String)object2));
            object3.configure(mediaFormat, null, null, 0);
            object3.start();
            arrayList = new ArrayList<Short>();
            mediaFormat = new MediaCodec.BufferInfo();
            short s2 = 0;
            while (s2 == 0) {
                int n;
                Short s5;
                long l = 1000L;
                int n2 = object3.dequeueInputBuffer(l);
                short s6 = 1;
                if (n2 >= 0) {
                    int n3;
                    long l2;
                    object = object3.getInputBuffer(n2);
                    int n4 = object4.readSampleData((ByteBuffer)object, 0);
                    if (n4 < 0) {
                        l2 = 0L;
                        n3 = 4;
                        s = 0;
                        s5 = null;
                        n4 = 0;
                        string2 = null;
                        object = object3;
                        object3.queueInputBuffer(n2, 0, 0, l2, n3);
                        s2 = s6;
                    } else {
                        l2 = object4.getSampleTime();
                        n3 = 0;
                        s = 0;
                        s5 = null;
                        object = object3;
                        object3.queueInputBuffer(n2, 0, n4, l2, 0);
                        object4.advance();
                    }
                }
                while ((n = object3.dequeueOutputBuffer((MediaCodec.BufferInfo)mediaFormat, l)) >= 0) {
                    object2 = object3.getOutputBuffer(n);
                    ((ByteBuffer)object2).position(0);
                    while ((s = ((Buffer)object2).remaining()) > s6) {
                        s = ((ByteBuffer)object2).getShort();
                        s5 = s;
                        arrayList.add(s5);
                    }
                    object3.releaseOutputBuffer(n, false);
                }
            }
            object3.stop();
            object3.release();
            object4.release();
            int n = arrayList.size();
            object4 = new short[n];
            while (s4 < (s3 = arrayList.size())) {
                object3 = (Short)arrayList.get(s4);
                s3 = (Short)object3;
                object4[s4] = (MediaExtractor)s3;
                ++s4;
            }
            return object4;
        }
        arrayList = new ArrayList<Short>("No audio track found");
        throw arrayList;
    }

    public static float[] extractAmplitudes(String object, int n) {
        object = UltraFastWaveform.decodeToPCM((String)object);
        int n2 = ((Object)object).length;
        float[] fArray = new float[n];
        double d = n2;
        double d2 = n;
        d /= d2;
        int n3 = 0;
        while (n3 < n) {
            double d3 = (double)n3 * d;
            int n4 = n3 + 1;
            double d4 = (double)n4 * d;
            int n5 = Math.min((int)d4, n2);
            float f = 0.0f;
            for (int i = (int)d3; i < n5; ++i) {
                int n6 = Math.abs((int)object[i]);
                float f2 = n6;
                float f3 = 32767.0f;
                f = Math.max(f, f2 /= f3);
            }
            fArray[n3] = f;
            n3 = n4;
        }
        return fArray;
    }
}

