/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import hazem.nurmontage.videoquran.ShareWithMeActivity;
import hazem.nurmontage.videoquran.WorkUserActivity;

class ShareWithMeActivity$1
implements Runnable {
    final /* synthetic */ ShareWithMeActivity this$0;

    ShareWithMeActivity$1(ShareWithMeActivity shareWithMeActivity) {
        this.this$0 = shareWithMeActivity;
    }

    public void run() {
        ShareWithMeActivity shareWithMeActivity = this.this$0;
        Intent intent = new Intent((Context)shareWithMeActivity, WorkUserActivity.class);
        this.this$0.startActivity(intent);
        this.this$0.finish();
    }
}

