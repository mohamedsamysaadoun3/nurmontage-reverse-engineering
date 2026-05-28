/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran.Utils;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecCallback;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecInfo;

public class FfmpegCodecChecker {
    private static FfmpegCodecChecker$CodecInfo cachedCodecs;

    public static void detectCodecsAsync(FfmpegCodecChecker$CodecCallback ffmpegCodecChecker$CodecCallback) {
        Object object = cachedCodecs;
        if (object != null) {
            ffmpegCodecChecker$CodecCallback.onResult((FfmpegCodecChecker$CodecInfo)object);
            return;
        }
        object = new FfmpegCodecChecker$$ExternalSyntheticLambda0(ffmpegCodecChecker$CodecCallback);
        FFmpegKit.executeAsync((String)"-hide_banner -encoders", (FFmpegSessionCompleteCallback)object);
    }

    static /* synthetic */ void lambda$detectCodecsAsync$0(FfmpegCodecChecker$CodecCallback ffmpegCodecChecker$CodecCallback, FFmpegSession object) {
        object = FfmpegCodecChecker.parseEncoders(object);
        cachedCodecs = object;
        ffmpegCodecChecker$CodecCallback.onResult((FfmpegCodecChecker$CodecInfo)object);
    }

    private static FfmpegCodecChecker$CodecInfo parseEncoders(FFmpegSession object) {
        String string2;
        String string3;
        String string4;
        FfmpegCodecChecker$CodecInfo ffmpegCodecChecker$CodecInfo = new FfmpegCodecChecker$CodecInfo();
        Object object2 = object.getReturnCode();
        int n = ReturnCode.isSuccess((ReturnCode)object2);
        if (n == 0) {
            Log.e((String)"CodecCheck", (String)"Failed to query FFmpeg encoders");
            return ffmpegCodecChecker$CodecInfo;
        }
        if ((object = object.getOutput()) == null) {
            return ffmpegCodecChecker$CodecInfo;
        }
        object2 = "\n";
        object = ((String)object).split((String)object2);
        n = ((Object)object).length;
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        while (true) {
            boolean bl4;
            boolean bl5;
            boolean bl6;
            string4 = "aac";
            string3 = "libfdk_aac";
            string2 = "libx264";
            if (n2 >= n) break;
            String string5 = ((String)object[n2]).trim().toLowerCase();
            boolean bl7 = true;
            if (!bl && (bl6 = string5.contains(string2))) {
                bl = bl7;
            }
            if (!bl2 && (bl5 = string5.contains(string3))) {
                bl2 = bl7;
            }
            if (!bl3 && (bl4 = string5.contains(string4))) {
                bl3 = bl7;
            }
            ++n2;
        }
        object = null;
        if (bl) {
            ffmpegCodecChecker$CodecInfo.videoCodec = string2;
            ffmpegCodecChecker$CodecInfo.isVideoHwAccelerated = false;
        } else {
            ffmpegCodecChecker$CodecInfo.videoCodec = null;
            ffmpegCodecChecker$CodecInfo.isVideoHwAccelerated = false;
        }
        ffmpegCodecChecker$CodecInfo.audioCodec = bl2 ? string3 : (bl3 ? string4 : null);
        return ffmpegCodecChecker$CodecInfo;
    }
}

