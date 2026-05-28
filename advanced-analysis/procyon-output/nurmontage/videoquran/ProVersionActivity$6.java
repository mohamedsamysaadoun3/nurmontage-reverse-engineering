// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Map;
import com.android.billingclient.api.ProductDetails;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivity$6 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$6(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        try {
            final ProVersionActivity this$0 = this.this$0;
            try {
                if (ProVersionActivity.-$$Nest$fgetisClick(this$0)) {
                    return;
                }
                ProVersionActivity.-$$Nest$fputisClick(this.this$0, true);
                final ProVersionActivity this$2 = this.this$0;
                try {
                    ProVersionActivity.-$$Nest$mshowProgress(this$2);
                    final ProVersionActivity this$3 = this.this$0;
                    try {
                        final Map -$$Nest$fgetproductDetailsMap = ProVersionActivity.-$$Nest$fgetproductDetailsMap(this$3);
                        try {
                            final ProVersionActivity this$4 = this.this$0;
                            try {
                                final Object value = -$$Nest$fgetproductDetailsMap.get(ProVersionActivity.-$$Nest$fgetproduct_id_current(this$4));
                                try {
                                    final ProductDetails productDetails = (ProductDetails)value;
                                    if (productDetails == null) {
                                        return;
                                    }
                                    final ProVersionActivity this$5 = this.this$0;
                                    try {
                                        final String -$$Nest$fgetproduct_id_current = ProVersionActivity.-$$Nest$fgetproduct_id_current(this$5);
                                        try {
                                            if (-$$Nest$fgetproduct_id_current.equals(ProVersionActivity.-$$Nest$sfgetPRODUCT_ID_FOREIVER())) {
                                                ProVersionActivity.-$$Nest$mlaunchPurchaseFlowINAPP(this.this$0, productDetails);
                                                return;
                                            }
                                            ProVersionActivity.-$$Nest$mlaunchPurchaseFlowSUB(this.this$0, productDetails);
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
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
            catch (final Exception ex8) {}
        }
        catch (final Exception ex9) {}
    }
}
