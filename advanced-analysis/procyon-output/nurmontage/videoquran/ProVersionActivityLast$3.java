// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingClient;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivityLast$3 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$3(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        try {
            final ProVersionActivityLast this$0 = this.this$0;
            try {
                Label_0054: {
                    if (ProVersionActivityLast.-$$Nest$fgetbillingClient(this$0) == null) {
                        break Label_0054;
                    }
                    final ProVersionActivityLast this$2 = this.this$0;
                    try {
                        final BillingClient -$$Nest$fgetbillingClient = ProVersionActivityLast.-$$Nest$fgetbillingClient(this$2);
                        try {
                            if (!-$$Nest$fgetbillingClient.isReady()) {
                                break Label_0054;
                            }
                            final ProVersionActivityLast this$3 = this.this$0;
                            try {
                                ProVersionActivityLast.-$$Nest$mshowProgress(this$3);
                                final ProVersionActivityLast this$4 = this.this$0;
                                try {
                                    ProVersionActivityLast.-$$Nest$mcheckUserSubscriptionStatus(this$4);
                                    return;
                                    final ProVersionActivityLast this$5 = this.this$0;
                                    try {
                                        ProVersionActivityLast.-$$Nest$mstartBillingConnection(this$5);
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
