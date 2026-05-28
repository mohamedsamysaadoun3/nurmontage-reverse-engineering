// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Iterator;
import java.util.List;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;

class ProVersionActivity$10 implements ProductDetailsResponseListener
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$10(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onProductDetailsResponse(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            for (final ProductDetails productDetails : list) {
                ProVersionActivity.-$$Nest$fgetproductDetailsMap(this.this$0).put(productDetails.getProductId(), productDetails);
                this.this$0.runOnUiThread((Runnable)new ProVersionActivity$10$$ExternalSyntheticLambda0(this, productDetails));
            }
        }
    }
}
