/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaExtractor
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FastWaveform {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float[] decodeWaveform(Context var0, Uri var1_1, int var2_2) {
        block41: {
            var3_3 = var2_2;
            var4_4 = new float[var2_2];
            var5_5 = new MediaExtractor();
            var6_6 = 0;
            var7_7 = null;
            var8_8 /* !! */  = var1_1;
            var5_5.setDataSource(var0, var1_1, null);
            var9_9 = 0;
            var8_8 /* !! */  = null;
            while (true) {
                var10_10 = var5_5.getTrackCount();
                var11_11 = "mime";
                if (var9_9 >= var10_10) break;
                var12_12 = var5_5.getTrackFormat(var9_9);
                var13_13 = var12_12.getString((String)var11_11);
                var14_14 = "audio/";
                var15_15 = var13_13.startsWith((String)var14_14);
                if (var15_15 == 0) {
                    ++var9_9;
                    continue;
                }
                break block41;
                break;
            }
            var9_9 = -1;
            var10_10 = 0;
            var12_12 = null;
        }
        if (var9_9 < 0) {
            return var4_4;
        }
        var5_5.selectTrack(var9_9);
        var8_8 /* !! */  = var12_12.getString((String)var11_11);
        var8_8 /* !! */  = MediaCodec.createDecoderByType((String)var8_8 /* !! */ );
        var8_8 /* !! */ .configure(var12_12, null, null, 0);
        var8_8 /* !! */ .start();
        var7_7 = "durationUs";
        var16_16 = var12_12.getLong(var7_7);
        var7_7 = "sample-rate";
        var6_6 = var12_12.getInteger(var7_7);
        var18_17 = 1000000L;
        var16_16 /= var18_17;
        var18_17 = var6_6;
        var16_16 *= var18_17;
        var18_17 = var3_3;
        var20_18 = var16_16 / var18_17;
        var7_7 = new MediaCodec.BufferInfo();
        var10_10 = 0;
        var12_12 = null;
        var22_19 = 0L;
        var24_20 = 0;
        var25_21 = 0;
        var26_22 = 0.0f;
        var27_23 = var22_19;
        while (var24_20 == 0) {
            block44: {
                block42: {
                    block43: {
                        var29_24 = 10000L;
                        var15_15 = var8_8 /* !! */ .dequeueInputBuffer(var29_24);
                        if (var15_15 < 0) break block42;
                        var11_11 = var8_8 /* !! */ .getInputBuffer(var15_15);
                        var31_25 = var5_5.readSampleData((ByteBuffer)var11_11, 0);
                        if (var31_25 >= 0) break block43;
                        var32_26 = 0L;
                        var34_27 = 0.0;
                        var36_28 = 4;
                        var37_29 = 0;
                        var38_30 = 0.0f;
                        var14_14 = null;
                        var31_25 = 0;
                        var11_11 = var8_8 /* !! */ ;
                        var29_24 = var32_26;
                        var8_8 /* !! */ .queueInputBuffer(var15_15, 0, 0, var32_26, var36_28);
lbl87:
                        // 2 sources

                        while (true) {
                            var16_16 = 10000L;
                            break block44;
                            break;
                        }
                    }
                    var29_24 = var5_5.getSampleTime();
                    var37_29 = 0;
                    var38_30 = 0.0f;
                    var14_14 = null;
                    var36_28 = 0;
                    var11_11 = var8_8 /* !! */ ;
                    var8_8 /* !! */ .queueInputBuffer(var15_15, 0, var31_25, var29_24, 0);
                    var5_5.advance();
                    ** continue;
                }
                var16_16 = var29_24;
            }
            var39_31 = var8_8 /* !! */ .dequeueOutputBuffer((MediaCodec.BufferInfo)var7_7, var16_16);
            if (var39_31 < 0) continue;
            var13_13 = var8_8 /* !! */ .getOutputBuffer(var39_31);
            var14_14 = ByteOrder.LITTLE_ENDIAN;
            var13_13.order((ByteOrder)var14_14);
            ** while ((var37_29 = var13_13.remaining()) > (var31_25 = 1))
lbl-1000:
            // 1 sources

            {
                var37_29 = var13_13.getShort();
                var37_29 = Math.abs(var37_29);
                var38_30 = var37_29;
                var40_32 = 32768.0f;
                cfr_temp_0 = (var38_30 /= var40_32) - var26_22;
                var41_33 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var41_33 > 0) {
                    var26_22 = var38_30;
                }
                if ((var37_29 = (int)((cfr_temp_1 = (var27_23 += (var29_24 = 1L)) - var20_18) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) continue;
                var4_4[var25_21] = var26_22;
                var37_29 = var25_21 + 1;
                if (var37_29 >= var3_3) {
                    var25_21 = var37_29;
                    var24_20 = var31_25;
                    break;
                }
                var26_22 = 0.0f;
                var25_21 = var37_29;
                var27_23 = var22_19;
                continue;
            }
lbl140:
            // 3 sources

            var8_8 /* !! */ .releaseOutputBuffer(var39_31, false);
            var39_31 = var7_7.flags & 4;
            if (var39_31 == 0) continue;
            var24_20 = var31_25;
        }
        try {
            var8_8 /* !! */ .stop();
            var8_8 /* !! */ .release();
            var5_5.release();
        }
        catch (Exception var42_34) {
            var42_34.printStackTrace();
        }
        return var4_4;
    }
}

