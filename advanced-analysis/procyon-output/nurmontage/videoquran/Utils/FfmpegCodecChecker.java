// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.util.Log;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;

public class FfmpegCodecChecker
{
    private static FfmpegCodecChecker$CodecInfo cachedCodecs;
    
    public static void detectCodecsAsync(final FfmpegCodecChecker$CodecCallback ffmpegCodecChecker$CodecCallback) {
        final FfmpegCodecChecker$CodecInfo cachedCodecs = FfmpegCodecChecker.cachedCodecs;
        if (cachedCodecs != null) {
            ffmpegCodecChecker$CodecCallback.onResult(cachedCodecs);
            return;
        }
        FFmpegKit.executeAsync("-hide_banner -encoders", (FFmpegSessionCompleteCallback)new FfmpegCodecChecker$$ExternalSyntheticLambda0(ffmpegCodecChecker$CodecCallback));
    }
    
    private static FfmpegCodecChecker$CodecInfo parseEncoders(final FFmpegSession fFmpegSession) {
        final FfmpegCodecChecker$CodecInfo ffmpegCodecChecker$CodecInfo = new FfmpegCodecChecker$CodecInfo();
        if (!ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            Log.e("CodecCheck", "Failed to query FFmpeg encoders");
            return ffmpegCodecChecker$CodecInfo;
        }
        final String output = fFmpegSession.getOutput();
        if (output == null) {
            return ffmpegCodecChecker$CodecInfo;
        }
        final String[] split = output.split("\n");
        final int length = split.length;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String s;
        String s2;
        String s3;
        while (true) {
            s = "aac";
            s2 = "libfdk_aac";
            s3 = "libx264";
            if (n >= length) {
                break;
            }
            final String lowerCase = split[n].trim().toLowerCase();
            final int n5 = 1;
            if (n2 == 0 && lowerCase.contains(s3)) {
                n2 = n5;
            }
            if (n3 == 0 && lowerCase.contains(s2)) {
                n3 = n5;
            }
            if (n4 == 0 && lowerCase.contains(s)) {
                n4 = n5;
            }
            ++n;
        }
        if (n2 != 0) {
            ffmpegCodecChecker$CodecInfo.videoCodec = s3;
            ffmpegCodecChecker$CodecInfo.isVideoHwAccelerated = false;
        }
        else {
            ffmpegCodecChecker$CodecInfo.videoCodec = null;
            ffmpegCodecChecker$CodecInfo.isVideoHwAccelerated = false;
        }
        if (n3 != 0) {
            ffmpegCodecChecker$CodecInfo.audioCodec = s2;
        }
        else if (n4 != 0) {
            ffmpegCodecChecker$CodecInfo.audioCodec = s;
        }
        else {
            ffmpegCodecChecker$CodecInfo.audioCodec = null;
        }
        return ffmpegCodecChecker$CodecInfo;
    }
}
