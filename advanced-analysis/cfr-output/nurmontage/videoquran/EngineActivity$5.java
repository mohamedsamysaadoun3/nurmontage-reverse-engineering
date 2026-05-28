/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;

class EngineActivity$5
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;

    EngineActivity$5(EngineActivity engineActivity, Uri uri) {
        this.this$0 = engineActivity;
        this.val$uri = uri;
    }

    public void onClick(View object) {
        object = this.this$0;
        boolean bl = NetworkUtils.isNetworkAvailable((Context)object);
        if (bl) {
            EngineActivity.cfr_renamed_392(this.this$0);
            object = this.this$0;
            Uri uri = this.val$uri;
            EngineActivity.cfr_renamed_7((EngineActivity)((Object)object), uri, 0, null);
        }
    }
}

