// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Iterator;
import java.util.List;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;

class ProVersionActivityLast$11 implements ProductDetailsResponseListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$11(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onProductDetailsResponse(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            for (final ProductDetails productDetails : list) {
                ProVersionActivityLast.-$$Nest$fgetproductDetailsMap(this.this$0).put(productDetails.getProductId(), productDetails);
                this.this$0.runOnUiThread((Runnable)new ProVersionActivityLast$11$$ExternalSyntheticLambda0(this, productDetails));
            }
        }
    }
}
