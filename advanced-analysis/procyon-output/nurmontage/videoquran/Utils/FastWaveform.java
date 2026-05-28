// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.nio.ByteOrder;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import java.util.Map;
import android.media.MediaExtractor;
import android.net.Uri;
import android.content.Context;

public class FastWaveform
{
    public static float[] decodeWaveform(final Context context, final Uri uri, final int n) {
        final float[] array = new float[n];
        try {
            try {
                final MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(context, uri, (Map)null);
                int n2 = 0;
                String s;
                MediaFormat trackFormat;
                while (true) {
                    final int trackCount = mediaExtractor.getTrackCount();
                    s = "mime";
                    if (n2 >= trackCount) {
                        n2 = -1;
                        trackFormat = null;
                        break;
                    }
                    trackFormat = mediaExtractor.getTrackFormat(n2);
                    if (trackFormat.getString(s).startsWith("audio/")) {
                        break;
                    }
                    ++n2;
                }
                if (n2 < 0) {
                    return array;
                }
                mediaExtractor.selectTrack(n2);
                final MediaFormat mediaFormat = trackFormat;
                try {
                    final String string = mediaFormat.getString(s);
                    try {
                        final MediaCodec decoderByType = MediaCodec.createDecoderByType(string);
                        decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
                        decoderByType.start();
                        final long n3 = trackFormat.getLong("durationUs") / 1000000L * trackFormat.getInteger("sample-rate") / n;
                        try {
                            try {
                                final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
                                final long n4 = 0L;
                                int n5 = 0;
                                int n6 = 0;
                                float n7 = 0.0f;
                                long n8 = n4;
                            Label_0254:
                                while (true) {
                                    Label_0597: {
                                        if (n5 != 0) {
                                            break Label_0597;
                                        }
                                        final long n9 = 10000L;
                                        final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n9);
                                        long n10;
                                        if (dequeueInputBuffer >= 0) {
                                            final int sampleData = mediaExtractor.readSampleData(decoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                            if (sampleData < 0) {
                                                decoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                            }
                                            else {
                                                decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                                mediaExtractor.advance();
                                            }
                                            n10 = 10000L;
                                        }
                                        else {
                                            n10 = n9;
                                        }
                                        final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo, n10);
                                        if (dequeueOutputBuffer < 0) {
                                            continue;
                                        }
                                        final ByteBuffer outputBuffer = decoderByType.getOutputBuffer(dequeueOutputBuffer);
                                        try {
                                            outputBuffer.order(ByteOrder.LITTLE_ENDIAN);
                                            while (true) {
                                                final int remaining = outputBuffer.remaining();
                                                final int n11 = 1;
                                                Label_0568: {
                                                    if (remaining <= n11) {
                                                        break Label_0568;
                                                    }
                                                    final short short1 = outputBuffer.getShort();
                                                    try {
                                                        final float n12 = Math.abs(short1) / 32768.0f;
                                                        if (n12 > n7) {
                                                            n7 = n12;
                                                        }
                                                        ++n8;
                                                        if (n8 < n3) {
                                                            continue;
                                                        }
                                                        array[n6] = n7;
                                                        final int n13 = n6 + 1;
                                                        if (n13 < n) {
                                                            n7 = 0.0f;
                                                            n6 = n13;
                                                            n8 = n4;
                                                            continue;
                                                        }
                                                        n6 = n13;
                                                        n5 = n11;
                                                        decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                        if ((mediaCodec$BufferInfo.flags & 0x4) != 0x0) {
                                                            n5 = n11;
                                                            continue Label_0254;
                                                        }
                                                        continue Label_0254;
                                                        decoderByType.stop();
                                                        decoderByType.release();
                                                        mediaExtractor.release();
                                                    }
                                                    catch (final Exception ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            }
                                        }
                                        catch (final Exception ex2) {}
                                    }
                                }
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
                catch (final Exception ex6) {}
            }
            catch (final Exception ex7) {}
        }
        catch (final Exception ex8) {}
        return array;
    }
}
