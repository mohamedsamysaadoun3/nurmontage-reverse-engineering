/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.android.billingclient.api.ProductDetails
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import com.android.billingclient.api.ProductDetails;
import hazem.nurmontage.videoquran.ProVersionActivityLast;

class ProVersionActivityLast$7
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$7(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onClick(View var1_1) {
        block20: {
            block19: {
                block18: {
                    var1_1 /* !! */  = this.this$0;
                    var2_3 = ProVersionActivityLast.cfr_renamed_86((ProVersionActivityLast)var1_1 /* !! */ );
                    if (!var2_3) break block18;
                    return;
                }
                var1_1 /* !! */  = this.this$0;
                var3_4 = true;
                ProVersionActivityLast.cfr_renamed_97((ProVersionActivityLast)var1_1 /* !! */ , var3_4);
                var1_1 /* !! */  = this.this$0;
                ProVersionActivityLast.cfr_renamed_60((ProVersionActivityLast)var1_1 /* !! */ );
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = ProVersionActivityLast.cfr_renamed_57((ProVersionActivityLast)var1_1 /* !! */ );
                var4_5 /* !! */  = this.this$0;
                var4_5 /* !! */  = ProVersionActivityLast.cfr_renamed_92(var4_5 /* !! */ );
                var1_1 /* !! */  = var1_1 /* !! */ .get((Object)var4_5 /* !! */ );
                var1_1 /* !! */  = (ProductDetails)var1_1 /* !! */ ;
                if (var1_1 /* !! */  != null) break block19;
                return;
            }
            var4_5 /* !! */  = this.this$0;
            var4_5 /* !! */  = ProVersionActivityLast.cfr_renamed_92(var4_5 /* !! */ );
            var5_6 = ProVersionActivityLast.cfr_renamed_106();
            var3_4 = var4_5 /* !! */ .equals(var5_6);
            if (!var3_4) ** GOTO lbl44
            var4_5 /* !! */  = this.this$0;
            ProVersionActivityLast.cfr_renamed_101(var4_5 /* !! */ , (ProductDetails)var1_1 /* !! */ );
            break block20;
lbl44:
            // 1 sources

            var4_5 /* !! */  = this.this$0;
            try {
                ProVersionActivityLast.cfr_renamed_102(var4_5 /* !! */ , (ProductDetails)var1_1 /* !! */ );
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }
}

