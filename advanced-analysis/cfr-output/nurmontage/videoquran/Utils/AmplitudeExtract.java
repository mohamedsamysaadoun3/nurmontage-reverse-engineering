/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaExtractor
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$AmplitudeDataCallback;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AmplitudeExtract {
    private static final String TAG = "AudioAmplitudeReader";
    private final ExecutorService executorService;
    private final Handler mainHandler;

    public AmplitudeExtract() {
        ExecutorService executorService;
        this.executorService = executorService = Executors.newSingleThreadExecutor();
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.mainHandler = executorService;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    private List extractAmplitudeData(String var1_1, int var2_5) {
        block60: {
            block65: {
                block64: {
                    block62: {
                        block59: {
                            if (var1_1 != null && !(var3_6 = var1_1.isEmpty())) {
                                if (var2_5 <= 0) {
                                    var1_1 = new IllegalArgumentException("Target samples must be greater than zero.");
                                    throw var1_1;
                                }
                                var4_7 = new ArrayList();
                                var5_8 = null;
                                try {
                                    var6_9 = new MediaExtractor();
                                }
                                catch (Throwable var1_3) {
                                    // empty catch block
                                    break block60;
                                }
                                var6_9.setDataSource((String)var1_1);
                                var7_10 = 0;
                                var8_11 = 0;
                                var9_12 = null;
                                break block59;
                            }
                            var1_1 = new IllegalArgumentException("File path cannot be null or empty.");
                            throw var1_1;
                        }
                        while (true) {
                            block61: {
                                var10_13 = var6_9.getTrackCount();
                                var11_14 = -1;
                                if (var8_11 >= var10_13) break;
                                var5_8 = var6_9.getTrackFormat(var8_11);
                                var12_15 = "mime";
                                var12_15 = var5_8.getString((String)var12_15);
                                if (var12_15 == null) break block61;
                                var13_16 = "audio/";
                                var10_13 = (int)var12_15.startsWith((String)var13_16);
                                if (var10_13 != 0) break block62;
                            }
                            ++var8_11;
                        }
                        var8_11 = var11_14;
                    }
                    if (var8_11 != var11_14 && var5_8 != null) {
                        block63: {
                            var6_9.selectTrack(var8_11);
                            var1_1 = "durationUs";
                            var14_17 = var5_8.getLong((String)var1_1);
                            var16_18 = 0L;
                            var18_19 = var14_17 == var16_18 ? 0 : (var14_17 < var16_18 ? -1 : 1);
                            if (var18_19 > 0) break block63;
                            var1_1 = "AudioAmplitudeReader";
                            var5_8 = "Duration not available or invalid, results might be inaccurate for downsampling.";
                            Log.w((String)var1_1, (String)var5_8);
                        }
                        var18_19 = 16384;
                        var1_1 = ByteBuffer.allocate((int)var18_19);
                        var5_8 = ByteOrder.nativeOrder();
                        var1_1.order((ByteOrder)var5_8);
                        var5_8 = new ArrayList();
                        break block64;
                    }
                    var4_7 = new StringBuilder();
                    var5_8 = "No audio track found in ";
                    var4_7 = var4_7.append((String)var5_8);
                    var1_1 = var4_7.append((String)var1_1);
                    var1_1 = var1_1.toString();
                    try {
                        var28_29 = new IOException((String)var1_1);
                        throw var28_29;
                    }
lbl179:
                    // 40 sources

                    catch (Throwable var1_2) {
                        var5_8 = var6_9;
                    }
                }
                while (true) {
                    var8_11 = var6_9.readSampleData((ByteBuffer)var1_1, 0);
                    if (var8_11 < 0) ** GOTO lbl-1000
                    if (var8_11 <= 0) ** GOTO lbl118
                    var1_1.position(0);
                    var1_1.limit(var8_11);
                    var9_12 = var1_1.asShortBuffer();
                    ** GOTO lbl106
lbl-1000:
                    // 1 sources

                    {
                        var18_19 = (long)var5_8.isEmpty();
                        var8_11 = 0;
                        var9_12 = null;
                        if (var18_19 != false) break;
                        var18_19 = var5_8.size();
                        var10_13 = (int)(var18_19 / var2_5);
                        var11_14 = 1;
                        var10_13 = Math.max(var11_14, var10_13);
                        var11_14 = 0;
                        break block65;
lbl106:
                        // 1 sources

                        while (true) {
                            var10_13 = (int)var9_12.hasRemaining();
                            if (var10_13 == 0) break;
                            var10_13 = var9_12.get();
                            var12_15 = (short)var10_13;
                            ** try [egrp 20[TRYBLOCK] [22 : 291->323)] { 
lbl115:
                            // 1 sources

                            var5_8.add(var12_15);
                        }
lbl118:
                        // 2 sources

                        var1_1.clear();
                        var6_9.advance();
                        continue;
                    }
                    break;
                }
                while (true) {
                    if (var7_10 >= var2_5) {
                        var6_9.release();
                        return var4_7;
                    }
                    var1_1 = Float.valueOf(0.0f);
                    var4_7.add(var1_1);
                    ++var7_10;
                    continue;
                    break;
                }
            }
            while (true) {
                block67: {
                    block66: {
                        if (var11_14 >= var2_5) {
                            var6_9.release();
                            return var4_7;
                        }
                        var20_21 = var19_20 + var10_13;
                        var20_21 = Math.min(var20_21, (int)var18_19);
                        if (var19_20 < var18_19) break block66;
                        var13_16 = Float.valueOf(0.0f);
                        var4_7.add(var13_16);
                        break block67;
                    }
                    var21_22 = 0;
                    for (var19_20 = var11_14 * var10_13; var19_20 < var20_21; ++var19_20) {
                        var22_23 = var5_8.get(var19_20);
                        var22_23 = (Short)var22_23;
                        var23_24 = var22_23.shortValue();
                        var24_25 = Math.abs(var23_24);
                        var25_26 = Math.abs(var21_22);
                        if (var24_25 <= var25_26) continue;
                        var21_22 = var23_24;
                    }
                    var19_20 = Math.abs(var21_22);
                    var26_27 = var19_20;
                    var20_21 = 1191181824;
                    var27_28 = 32767.0f;
                    var26_27 /= var27_28;
                    var13_16 = Float.valueOf(var26_27);
                    var4_7.add(var13_16);
                }
                ++var11_14;
            }
        }
        if (var5_8 != null) {
            var5_8.release();
        }
        throw var1_4;
    }

    static /* synthetic */ void lambda$extractAmplitudeDataAsync$0(AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback, List list) {
        amplitudeExtract$AmplitudeDataCallback.onComplete(list);
    }

    static /* synthetic */ void lambda$extractAmplitudeDataAsync$1(AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback, Exception exception) {
        amplitudeExtract$AmplitudeDataCallback.onError(exception);
    }

    public void extractAmplitudeDataAsync(String string2, int n, AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback) {
        ExecutorService executorService = this.executorService;
        AmplitudeExtract$$ExternalSyntheticLambda0 amplitudeExtract$$ExternalSyntheticLambda0 = new AmplitudeExtract$$ExternalSyntheticLambda0(this, string2, n, amplitudeExtract$AmplitudeDataCallback);
        executorService.execute(amplitudeExtract$$ExternalSyntheticLambda0);
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ void cfr_renamed_523(String object, int n, AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback) {
        block7: {
            void var1_4;
            object = this.extractAmplitudeData((String)object, n);
            Handler handler = this.mainHandler;
            Runnable runnable = new AmplitudeExtract$$ExternalSyntheticLambda1(amplitudeExtract$AmplitudeDataCallback, (List)object);
            try {
                handler.post(runnable);
                break block7;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Log.e((String)TAG, (String)"Error extracting amplitude data", (Throwable)var1_4);
            handler = this.mainHandler;
            runnable = new AmplitudeExtract$$ExternalSyntheticLambda2(amplitudeExtract$AmplitudeDataCallback, (Exception)var1_4);
            handler.post(runnable);
        }
    }
}

