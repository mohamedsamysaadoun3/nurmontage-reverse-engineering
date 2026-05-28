/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.ProVersionActivity;

class ProVersionActivity$3
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$3(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onClick(View var1_1) {
        block11: {
            var1_1 /* !! */  = this.this$0;
            var2_3 = true;
            ProVersionActivity.cfr_renamed_58((ProVersionActivity)var1_1 /* !! */ , var2_3);
            var1_1 /* !! */  = this.this$0;
            var1_1 /* !! */  = ProVersionActivity.cfr_renamed_59((ProVersionActivity)var1_1 /* !! */ );
            if (var1_1 /* !! */  == null) ** GOTO lbl25
            var1_1 /* !! */  = this.this$0;
            var1_1 /* !! */  = ProVersionActivity.cfr_renamed_59((ProVersionActivity)var1_1 /* !! */ );
            var3_4 = var1_1 /* !! */ .isReady();
            if (!var3_4) ** GOTO lbl25
            var1_1 /* !! */  = this.this$0;
            ProVersionActivity.cfr_renamed_60((ProVersionActivity)var1_1 /* !! */ );
            var1_1 /* !! */  = this.this$0;
            ProVersionActivity.cfr_renamed_61((ProVersionActivity)var1_1 /* !! */ );
            break block11;
lbl25:
            // 2 sources

            var1_1 /* !! */  = this.this$0;
            try {
                ProVersionActivity.cfr_renamed_62((ProVersionActivity)var1_1 /* !! */ );
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }
}

