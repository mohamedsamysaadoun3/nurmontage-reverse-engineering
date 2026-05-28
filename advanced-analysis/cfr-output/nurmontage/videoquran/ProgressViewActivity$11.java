/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.Statistics
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.Statistics;
import hazem.nurmontage.videoquran.ProgressViewActivity;

class ProgressViewActivity$11
implements Runnable {
    final /* synthetic */ ProgressViewActivity this$0;

    ProgressViewActivity$11(ProgressViewActivity progressViewActivity) {
        this.this$0 = progressViewActivity;
    }

    public void run() {
        ProgressViewActivity progressViewActivity = this.this$0;
        Statistics statistics = ProgressViewActivity.cfr_renamed_28(progressViewActivity);
        progressViewActivity.updateProgressDialog(statistics);
    }
}

