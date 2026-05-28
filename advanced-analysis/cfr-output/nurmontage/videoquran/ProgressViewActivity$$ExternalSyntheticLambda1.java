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
import hazem.nurmontage.videoquran.ProgressViewActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public final class ProgressViewActivity$$ExternalSyntheticLambda1
implements FFmpegSessionCompleteCallback {
    public final /* synthetic */ ProgressViewActivity f$0;
    public final /* synthetic */ CountDownLatch f$1;
    public final /* synthetic */ Semaphore f$2;

    public /* synthetic */ ProgressViewActivity$$ExternalSyntheticLambda1(ProgressViewActivity progressViewActivity, CountDownLatch countDownLatch, Semaphore semaphore) {
        this.f$0 = progressViewActivity;
        this.f$1 = countDownLatch;
        this.f$2 = semaphore;
    }

    public final void apply(FFmpegSession fFmpegSession) {
        ProgressViewActivity progressViewActivity = this.f$0;
        CountDownLatch countDownLatch = this.f$1;
        Semaphore semaphore = this.f$2;
        progressViewActivity.cfr_renamed_43(countDownLatch, semaphore, fFmpegSession);
    }
}

