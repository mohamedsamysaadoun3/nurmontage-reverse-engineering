/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran.Utils;

import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecCallback;

public final class FfmpegCodecChecker$$ExternalSyntheticLambda0
implements FFmpegSessionCompleteCallback {
    public final /* synthetic */ FfmpegCodecChecker$CodecCallback f$0;

    public /* synthetic */ FfmpegCodecChecker$$ExternalSyntheticLambda0(FfmpegCodecChecker$CodecCallback ffmpegCodecChecker$CodecCallback) {
        this.f$0 = ffmpegCodecChecker$CodecCallback;
    }

    public final void apply(FFmpegSession fFmpegSession) {
        FfmpegCodecChecker.lambda$detectCodecsAsync$0(this.f$0, fFmpegSession);
    }
}

