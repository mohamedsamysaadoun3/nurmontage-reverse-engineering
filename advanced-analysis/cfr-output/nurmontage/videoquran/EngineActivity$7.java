/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import java.util.List;

class EngineActivity$7
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ List val$list;

    EngineActivity$7(EngineActivity engineActivity, List list) {
        this.this$0 = engineActivity;
        this.val$list = list;
    }

    public void onClick(View object) {
        object = this.this$0;
        boolean bl = NetworkUtils.isNetworkAvailable((Context)object);
        if (bl) {
            EngineActivity.cfr_renamed_392(this.this$0);
            object = this.this$0;
            List list = this.val$list;
            EngineActivity.cfr_renamed_6((EngineActivity)((Object)object), list, 0, null);
        }
    }
}

