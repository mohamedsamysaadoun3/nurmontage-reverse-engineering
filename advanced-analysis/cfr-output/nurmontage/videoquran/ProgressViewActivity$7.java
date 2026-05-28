/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.ProgressViewActivity;

class ProgressViewActivity$7
implements Runnable {
    final /* synthetic */ ProgressViewActivity this$0;

    ProgressViewActivity$7(ProgressViewActivity progressViewActivity) {
        this.this$0 = progressViewActivity;
    }

    public void run() {
        ProgressViewActivity progressViewActivity = this.this$0;
        int n = ProgressViewActivity.cfr_renamed_22(progressViewActivity);
        if (n != 0) {
            return;
        }
        progressViewActivity = this.this$0;
        float f = ProgressViewActivity.cfr_renamed_20(progressViewActivity);
        float f2 = ProgressViewActivity.cfr_renamed_29(this.this$0);
        ProgressViewActivity progressViewActivity2 = this.this$0;
        float f3 = ProgressViewActivity.cfr_renamed_20(progressViewActivity2);
        f2 -= f3;
        f3 = 0.1f;
        ProgressViewActivity.cfr_renamed_31(progressViewActivity, f += (f2 *= f3));
        n = Math.round(ProgressViewActivity.cfr_renamed_20(this.this$0));
        int n2 = ProgressViewActivity.cfr_renamed_25(this.this$0).getMax();
        n = Math.min(n, n2);
        n2 = 0;
        f = 0.0f;
        n = Math.max(0, n);
        ProgressViewActivity.cfr_renamed_25(this.this$0).setProgress(n);
        progressViewActivity = this.this$0;
        float f4 = ProgressViewActivity.cfr_renamed_20(progressViewActivity);
        ProgressViewActivity progressViewActivity3 = this.this$0;
        f2 = ProgressViewActivity.cfr_renamed_29(progressViewActivity3);
        f4 = Math.abs(f4 - f2);
        n = f4 == f3 ? 0 : (f4 > f3 ? 1 : -1);
        if (n > 0) {
            progressViewActivity = ProgressViewActivity.cfr_renamed_30(this.this$0);
            long l = 16;
            progressViewActivity.postDelayed(this, l);
        } else {
            progressViewActivity = this.this$0;
            ProgressViewActivity.cfr_renamed_32(progressViewActivity, false);
        }
    }
}

