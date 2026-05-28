/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran;

import android.net.Uri;
import hazem.nurmontage.videoquran.ProgressViewActivity;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;

class ProgressViewActivity$6
implements Runnable {
    final /* synthetic */ ProgressViewActivity this$0;

    ProgressViewActivity$6(ProgressViewActivity progressViewActivity) {
        this.this$0 = progressViewActivity;
    }

    public void run() {
        Object object = this.this$0;
        int n = ProgressViewActivity.cfr_renamed_21(object);
        if (n != 0) {
            return;
        }
        object = this.this$0;
        float f = ProgressViewActivity.cfr_renamed_20(object);
        float f2 = ProgressViewActivity.cfr_renamed_20(this.this$0);
        float f3 = 100.0f;
        f2 = f3 - f2;
        int n2 = 0x3EE66666;
        float f4 = 0.45f;
        ProgressViewActivity.cfr_renamed_31(object, f += (f2 *= f4));
        n = Math.round(ProgressViewActivity.cfr_renamed_20(this.this$0));
        int n3 = 0;
        f = 0.0f;
        Uri uri = null;
        n = Math.max(n, 0);
        int n4 = ProgressViewActivity.cfr_renamed_25(this.this$0).getMax();
        n = Math.min(n, n4);
        SquareOutlineProgressBar squareOutlineProgressBar = ProgressViewActivity.cfr_renamed_25(this.this$0);
        squareOutlineProgressBar.setProgress(n);
        object = ProgressViewActivity.cfr_renamed_25(this.this$0);
        float f5 = ((SquareOutlineProgressBar)((Object)object)).getProgress();
        n = f5 == f3 ? 0 : (f5 > f3 ? 1 : -1);
        n4 = 1;
        f2 = Float.MIN_VALUE;
        if (n >= 0) {
            n = n4;
            f5 = f2;
        } else {
            n = 0;
            object = null;
            f5 = 0.0f;
        }
        ProgressViewActivity progressViewActivity = this.this$0;
        f4 = Math.abs(ProgressViewActivity.cfr_renamed_20(progressViewActivity) - f3);
        float f6 = 0.1f;
        n2 = f4 == f6 ? 0 : (f4 < f6 ? -1 : 1);
        if (n2 < 0) {
            n3 = n4;
            f = f2;
        }
        if (n == 0 && n3 == 0) {
            ProgressViewActivity.cfr_renamed_30(this.this$0).postDelayed((Runnable)this, (long)16);
            return;
        }
        ProgressViewActivity.cfr_renamed_25(this.this$0).setProgress(100);
        ProgressViewActivity.cfr_renamed_31(this.this$0, f3);
        ProgressViewActivity.cfr_renamed_35(this.this$0, f3);
        object = this.this$0;
        uri = Uri.parse((String)ProgressViewActivity.cfr_renamed_23(object));
        ProgressViewActivity.cfr_renamed_39(object, uri);
        ProgressViewActivity.cfr_renamed_41(this.this$0);
    }
}

