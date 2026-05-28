/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.ProVersionActivityLast;

class ProVersionActivityLast$3
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$3(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onClick(View var1_1) {
        block10: {
            var1_1 /* !! */  = this.this$0;
            var1_1 /* !! */  = ProVersionActivityLast.cfr_renamed_59((ProVersionActivityLast)var1_1 /* !! */ );
            if (var1_1 /* !! */  == null) ** GOTO lbl21
            var1_1 /* !! */  = this.this$0;
            var1_1 /* !! */  = ProVersionActivityLast.cfr_renamed_59((ProVersionActivityLast)var1_1 /* !! */ );
            var2_3 = var1_1 /* !! */ .isReady();
            if (!var2_3) ** GOTO lbl21
            var1_1 /* !! */  = this.this$0;
            ProVersionActivityLast.cfr_renamed_60((ProVersionActivityLast)var1_1 /* !! */ );
            var1_1 /* !! */  = this.this$0;
            ProVersionActivityLast.cfr_renamed_61((ProVersionActivityLast)var1_1 /* !! */ );
            break block10;
lbl21:
            // 2 sources

            var1_1 /* !! */  = this.this$0;
            try {
                ProVersionActivityLast.cfr_renamed_62((ProVersionActivityLast)var1_1 /* !! */ );
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }
}

