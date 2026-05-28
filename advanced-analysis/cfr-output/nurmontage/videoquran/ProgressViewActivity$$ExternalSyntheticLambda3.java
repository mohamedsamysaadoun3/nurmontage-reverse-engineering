/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.ProgressViewActivity;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecCallback;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecInfo;

public final class ProgressViewActivity$$ExternalSyntheticLambda3
implements FfmpegCodecChecker$CodecCallback {
    public final /* synthetic */ ProgressViewActivity f$0;

    public /* synthetic */ ProgressViewActivity$$ExternalSyntheticLambda3(ProgressViewActivity progressViewActivity) {
        this.f$0 = progressViewActivity;
    }

    public final void onResult(FfmpegCodecChecker$CodecInfo ffmpegCodecChecker$CodecInfo) {
        this.f$0.setupCommand(ffmpegCodecChecker$CodecInfo);
    }
}

