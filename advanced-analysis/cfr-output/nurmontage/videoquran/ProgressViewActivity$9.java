/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.Statistics
 *  com.arthenica.ffmpegkit.StatisticsCallback
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;
import hazem.nurmontage.videoquran.ProgressViewActivity;

class ProgressViewActivity$9
implements StatisticsCallback {
    final /* synthetic */ ProgressViewActivity this$0;

    ProgressViewActivity$9(ProgressViewActivity progressViewActivity) {
        this.this$0 = progressViewActivity;
    }

    public void apply(Statistics object) {
        ProgressViewActivity.cfr_renamed_34(this.this$0, object);
        object = this.this$0;
        Runnable runnable = ProgressViewActivity.cfr_renamed_27((ProgressViewActivity)((Object)object));
        object.runOnUiThread(runnable);
    }
}

