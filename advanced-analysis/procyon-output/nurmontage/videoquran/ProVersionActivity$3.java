// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingClient;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivity$3 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$3(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        try {
            ProVersionActivity.-$$Nest$fputisBtnRestore(this.this$0, true);
            final ProVersionActivity this$0 = this.this$0;
            try {
                Label_0066: {
                    if (ProVersionActivity.-$$Nest$fgetbillingClient(this$0) == null) {
                        break Label_0066;
                    }
                    final ProVersionActivity this$2 = this.this$0;
                    try {
                        final BillingClient -$$Nest$fgetbillingClient = ProVersionActivity.-$$Nest$fgetbillingClient(this$2);
                        try {
                            if (!-$$Nest$fgetbillingClient.isReady()) {
                                break Label_0066;
                            }
                            final ProVersionActivity this$3 = this.this$0;
                            try {
                                ProVersionActivity.-$$Nest$mshowProgress(this$3);
                                final ProVersionActivity this$4 = this.this$0;
                                try {
                                    ProVersionActivity.-$$Nest$mcheckUserSubscriptionStatus(this$4);
                                    return;
                                    final ProVersionActivity this$5 = this.this$0;
                                    try {
                                        ProVersionActivity.-$$Nest$mstartBillingConnection(this$5);
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
            }
            catch (final Exception ex6) {}
        }
        catch (final Exception ex7) {}
    }
}
