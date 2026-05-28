// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import android.view.View;
import android.view.View$OnClickListener;

class WorkUserActivity$3 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$3(final WorkUserActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (BillingPreferences.isSubscribed(this.this$0.getApplicationContext())) {
            return;
        }
        final WorkUserActivity this$0 = this.this$0;
        final int -$$Nest$fgetcountClick = WorkUserActivity.-$$Nest$fgetcountClick(this$0);
        final int n = 1;
        WorkUserActivity.-$$Nest$fputcountClick(this$0, -$$Nest$fgetcountClick + n);
        if (WorkUserActivity.-$$Nest$fgetcountClick(this.this$0) >= 5) {
            BillingPreferences.saveSubscriptionStatus(this.this$0.getApplicationContext(), (boolean)(n != 0));
            Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)"Subscribed", 0).show();
        }
    }
}
