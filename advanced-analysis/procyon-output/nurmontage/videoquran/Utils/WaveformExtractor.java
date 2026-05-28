// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.nio.ShortBuffer;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import android.media.MediaExtractor;

public class WaveformExtractor
{
    public static float[] extractAmplitudes(final String dataSource, final int n) {
        final MediaExtractor mediaExtractor2;
        final MediaExtractor mediaExtractor = mediaExtractor2 = new MediaExtractor();
        try {
            mediaExtractor2.setDataSource(dataSource);
            final int selectAudioTrack = selectAudioTrack(mediaExtractor);
            if (selectAudioTrack < 0) {
                return new float[n];
            }
            mediaExtractor.selectTrack(selectAudioTrack);
            final MediaExtractor mediaExtractor3 = mediaExtractor;
            try {
                final MediaFormat trackFormat = mediaExtractor3.getTrackFormat(selectAudioTrack);
                trackFormat.getInteger("sample-rate");
                final String string = trackFormat.getString("mime");
                try {
                    final MediaCodec decoderByType = MediaCodec.createDecoderByType(string);
                    decoderByType.configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
                    decoderByType.start();
                    ByteBuffer[] inputBuffers = decoderByType.getInputBuffers();
                    try {
                        final ByteBuffer[] outputBuffers = decoderByType.getOutputBuffers();
                        try {
                            final float[] array = new float[n];
                            try {
                                float[] array2 = new float[n];
                                final float n2 = (float)trackFormat.getLong("durationUs");
                                final float n3 = 1000000.0f;
                                final float n4 = n2 / n3 / n;
                                MediaCodec$BufferInfo mediaCodec$BufferInfo = new(android.media.MediaCodec$BufferInfo.class)();
                                try {
                                    new MediaCodec$BufferInfo();
                                    int n5 = 0;
                                Label_0183:
                                    while (true) {
                                        final long n6 = 10000L;
                                        long n9 = 0L;
                                        float[] array4 = null;
                                        MediaCodec$BufferInfo mediaCodec$BufferInfo2 = null;
                                        Label_0366: {
                                            if (n5 == 0) {
                                                final int dequeueInputBuffer = decoderByType.dequeueInputBuffer(n6);
                                                if (dequeueInputBuffer >= 0) {
                                                    final int sampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                                                    if (sampleData < 0) {
                                                        final long n7 = 0L;
                                                        final int n8 = 4;
                                                        final ByteBuffer[] array3 = inputBuffers;
                                                        n9 = n6;
                                                        array4 = array2;
                                                        mediaCodec$BufferInfo2 = mediaCodec$BufferInfo;
                                                        decoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, n7, n8);
                                                        n5 = 1;
                                                        break Label_0366;
                                                    }
                                                    final ByteBuffer[] array3 = inputBuffers;
                                                    array4 = array2;
                                                    n9 = n6;
                                                    mediaCodec$BufferInfo2 = mediaCodec$BufferInfo;
                                                    decoderByType.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                                    mediaExtractor.advance();
                                                    break Label_0366;
                                                }
                                            }
                                            final ByteBuffer[] array3 = inputBuffers;
                                            array4 = array2;
                                            n9 = n6;
                                            mediaCodec$BufferInfo2 = mediaCodec$BufferInfo;
                                        }
                                        final int dequeueOutputBuffer = decoderByType.dequeueOutputBuffer(mediaCodec$BufferInfo2, n9);
                                        Label_0677: {
                                            if (dequeueOutputBuffer < 0) {
                                                break Label_0677;
                                            }
                                            final ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                            try {
                                                byteBuffer.position();
                                                final int offset = mediaCodec$BufferInfo2.offset;
                                                try {
                                                    byteBuffer.limit();
                                                    final ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
                                                    try {
                                                        final int remaining = shortBuffer.remaining();
                                                        int n10 = 0;
                                                        final ByteBuffer[] array3;
                                                        short value;
                                                        float n11;
                                                        int n12;
                                                        float[] array5;
                                                        int n13;
                                                        float n14;
                                                        Label_0651_Outer:Block_34_Outer:
                                                        while (true) {
                                                            Label_0573: {
                                                                if (n10 >= remaining) {
                                                                    break Label_0573;
                                                                }
                                                                value = shortBuffer.get(n10);
                                                                try {
                                                                    n11 = Math.abs(value) / 32768.0f;
                                                                    n12 = (int)(mediaCodec$BufferInfo2.presentationTimeUs / n3 / n4);
                                                                    Label_0564: {
                                                                        if (n12 >= n) {
                                                                            break Label_0564;
                                                                        }
                                                                        array[n12] += n11;
                                                                        array5 = array4;
                                                                        try {
                                                                            array4[n12] = array5[n12] + 1.0f;
                                                                            ++n10;
                                                                            continue;
                                                                            decoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                                            iftrue(Label_0683:)((mediaCodec$BufferInfo2.flags & 0x4) == 0x0);
                                                                            Block_32: {
                                                                                break Block_32;
                                                                                while (true) {
                                                                                    Block_33: {
                                                                                        while (true) {
                                                                                            Label_0683: {
                                                                                                while (true) {
                                                                                                    iftrue(Label_0660:)(n13 >= n);
                                                                                                    break Block_33;
                                                                                                    break Label_0683;
                                                                                                    ++n13;
                                                                                                    continue Label_0651_Outer;
                                                                                                }
                                                                                                Label_0660: {
                                                                                                    decoderByType.stop();
                                                                                                }
                                                                                                decoderByType.release();
                                                                                                mediaExtractor.release();
                                                                                                return array;
                                                                                            }
                                                                                            mediaCodec$BufferInfo = mediaCodec$BufferInfo2;
                                                                                            array2 = array4;
                                                                                            inputBuffers = array3;
                                                                                            continue Label_0183;
                                                                                            array[n13] /= n14;
                                                                                            continue Block_34_Outer;
                                                                                        }
                                                                                    }
                                                                                    n14 = array4[n13];
                                                                                    iftrue(Label_0651:)(n14 <= 0.0f);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            n13 = 0;
                                                                        }
                                                                        catch (final Exception ex) {
                                                                            ex.printStackTrace();
                                                                            return new float[n];
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
                                    }
                                }
                                catch (final Exception ex6) {}
                            }
                            catch (final Exception ex7) {}
                        }
                        catch (final Exception ex8) {}
                    }
                    catch (final Exception ex9) {}
                }
                catch (final Exception ex10) {}
            }
            catch (final Exception ex11) {}
        }
        catch (final Exception ex12) {}
    }
    
    private static int selectAudioTrack(final MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); ++i) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("audio/")) {
                return i;
            }
        }
        return -1;
    }
}
