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
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import hazem.nurmontage.videoquran.ProVersionActivityDone$6$$ExternalSyntheticLambda0;
import java.util.List;

class ProVersionActivityDone$6
implements ProductDetailsResponseListener {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$6(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    /* synthetic */ void cfr_renamed_520(ProductDetails productDetails) {
        ProVersionActivityDone.cfr_renamed_56(this.this$0, productDetails);
    }

    public void onProductDetailsResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0 && list != null) {
            boolean bl;
            object = list.iterator();
            while (bl = object.hasNext()) {
                list = (ProductDetails)object.next();
                Object object2 = ProVersionActivityDone.cfr_renamed_57(this.this$0);
                Object object3 = list.getProductId();
                object2.put(object3, list);
                object2 = this.this$0;
                object3 = new ProVersionActivityDone$6$$ExternalSyntheticLambda0(this, (ProductDetails)list);
                object2.runOnUiThread((Runnable)object3);
            }
        }
    }
}

