/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.WorkUserActivity;

class WorkUserActivity$3
implements View.OnClickListener {
    final /* synthetic */ WorkUserActivity this$0;

    WorkUserActivity$3(WorkUserActivity workUserActivity) {
        this.this$0 = workUserActivity;
    }

    public void onClick(View object) {
        object = this.this$0.getApplicationContext();
        int n = BillingPreferences.isSubscribed((Context)object);
        if (n != 0) {
            return;
        }
        object = this.this$0;
        int n2 = WorkUserActivity.cfr_renamed_539((WorkUserActivity)((Object)object));
        int n3 = 1;
        WorkUserActivity.cfr_renamed_540((WorkUserActivity)((Object)object), n2 += n3);
        object = this.this$0;
        n = WorkUserActivity.cfr_renamed_539((WorkUserActivity)((Object)object));
        n2 = 5;
        if (n >= n2) {
            BillingPreferences.saveSubscriptionStatus(this.this$0.getApplicationContext(), n3 != 0);
            object = this.this$0.getApplicationContext();
            String string2 = "Subscribed";
            n3 = 0;
            object = Toast.makeText((Context)object, (CharSequence)string2, (int)0);
            object.show();
        }
    }
}

