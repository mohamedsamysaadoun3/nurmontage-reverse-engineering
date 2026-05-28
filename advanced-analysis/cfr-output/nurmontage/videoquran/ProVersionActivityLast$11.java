/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetails
 *  com.android.billingclient.api.ProductDetailsResponseListener
 */
package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import hazem.nurmontage.videoquran.ProVersionActivityLast;
import hazem.nurmontage.videoquran.ProVersionActivityLast$11$$ExternalSyntheticLambda0;
import java.util.List;

class ProVersionActivityLast$11
implements ProductDetailsResponseListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$11(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    /* synthetic */ void cfr_renamed_55(ProductDetails productDetails) {
        ProVersionActivityLast.cfr_renamed_56(this.this$0, productDetails);
    }

    public void onProductDetailsResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0 && list != null) {
            boolean bl;
            object = list.iterator();
            while (bl = object.hasNext()) {
                list = (ProductDetails)object.next();
                Object object2 = ProVersionActivityLast.cfr_renamed_57(this.this$0);
                Object object3 = list.getProductId();
                object2.put(object3, list);
                object2 = this.this$0;
                object3 = new ProVersionActivityLast$11$$ExternalSyntheticLambda0(this, (ProductDetails)list);
                object2.runOnUiThread((Runnable)object3);
            }
        }
    }
}

