/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.WorkUserActivity;

class WorkUserActivity$9
implements View.OnClickListener {
    final /* synthetic */ WorkUserActivity this$0;

    WorkUserActivity$9(WorkUserActivity workUserActivity) {
        this.this$0 = workUserActivity;
    }

    public void onClick(View view) {
        WorkUserActivity workUserActivity = this.this$0;
        view = new Intent((Context)workUserActivity, EngineActivity.class);
        view.addFlags(65536);
        this.this$0.startActivity((Intent)view);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}

