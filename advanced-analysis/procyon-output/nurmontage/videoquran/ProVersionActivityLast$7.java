// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Map;
import com.android.billingclient.api.ProductDetails;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivityLast$7 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$7(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        try {
            final ProVersionActivityLast this$0 = this.this$0;
            try {
                if (ProVersionActivityLast.-$$Nest$fgetisClick(this$0)) {
                    return;
                }
                ProVersionActivityLast.-$$Nest$fputisClick(this.this$0, true);
                final ProVersionActivityLast this$2 = this.this$0;
                try {
                    ProVersionActivityLast.-$$Nest$mshowProgress(this$2);
                    final ProVersionActivityLast this$3 = this.this$0;
                    try {
                        final Map -$$Nest$fgetproductDetailsMap = ProVersionActivityLast.-$$Nest$fgetproductDetailsMap(this$3);
                        try {
                            final ProVersionActivityLast this$4 = this.this$0;
                            try {
                                final Object value = -$$Nest$fgetproductDetailsMap.get(ProVersionActivityLast.-$$Nest$fgetproduct_id_current(this$4));
                                try {
                                    final ProductDetails productDetails = (ProductDetails)value;
                                    if (productDetails == null) {
                                        return;
                                    }
                                    final ProVersionActivityLast this$5 = this.this$0;
                                    try {
                                        final String -$$Nest$fgetproduct_id_current = ProVersionActivityLast.-$$Nest$fgetproduct_id_current(this$5);
                                        try {
                                            if (-$$Nest$fgetproduct_id_current.equals(ProVersionActivityLast.-$$Nest$sfgetPRODUCT_ID_FOREIVER())) {
                                                ProVersionActivityLast.-$$Nest$mlaunchPurchaseFlowINAPP(this.this$0, productDetails);
                                                return;
                                            }
                                            ProVersionActivityLast.-$$Nest$mlaunchPurchaseFlowSUB(this.this$0, productDetails);
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
