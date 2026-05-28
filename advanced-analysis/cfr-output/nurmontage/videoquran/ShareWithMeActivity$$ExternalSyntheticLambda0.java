/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.ShareWithMeActivity;

public final class ShareWithMeActivity$$ExternalSyntheticLambda0
implements FFmpegSessionCompleteCallback {
    public final /* synthetic */ ShareWithMeActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ShareWithMeActivity$$ExternalSyntheticLambda0(ShareWithMeActivity shareWithMeActivity, String string2, String string3) {
        this.f$0 = shareWithMeActivity;
        this.f$1 = string2;
        this.f$2 = string3;
    }

    public final void apply(FFmpegSession fFmpegSession) {
        ShareWithMeActivity shareWithMeActivity = this.f$0;
        String string2 = this.f$1;
        String string3 = this.f$2;
        shareWithMeActivity.cfr_renamed_367(string2, string3, fFmpegSession);
    }
}

