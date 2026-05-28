/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran;

import android.net.Uri;
import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$11
implements Runnable {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;

    EngineActivity$11(EngineActivity engineActivity, Uri uri) {
        this.this$0 = engineActivity;
        this.val$uri = uri;
    }

    public void run() {
        EngineActivity engineActivity = this.this$0;
        Uri uri = this.val$uri;
        engineActivity.dialogNoInternet(uri);
    }
}

