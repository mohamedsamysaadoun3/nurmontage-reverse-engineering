/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.ProVersionActivityLast;
import hazem.nurmontage.videoquran.ProVersionActivityLast$15$1;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class ProVersionActivityLast$15
implements Runnable {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$15(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void run() {
        Object object = this.this$0;
        int n = R$id.restore;
        object = object.findViewById(n);
        n = 8;
        object.setVisibility(n);
        object = this.this$0;
        int n2 = R$id.layout_price;
        object.findViewById(n2).setVisibility(n);
        object = this.this$0;
        n2 = R$id.view_success;
        object.findViewById(n2).setVisibility(0);
        object = this.this$0;
        n2 = R$id.tv_thanks;
        object = (TextCustumFont)object.findViewById(n2);
        Object object2 = ProVersionActivityLast.cfr_renamed_90(this.this$0);
        int n3 = R$string.thanks_hint;
        object2 = object2.getString(n3);
        object.setText((CharSequence)object2);
        object = this.this$0;
        n2 = R$id.tv_tittle_billing;
        object.findViewById(n2).setVisibility(n);
        object = this.this$0;
        n = R$id.btn_done;
        Object object3 = (ButtonCustumFont)object.findViewById(n);
        ProVersionActivityLast.cfr_renamed_126(object, object3);
        object = ProVersionActivityLast.cfr_renamed_127(this.this$0);
        object3 = ProVersionActivityLast.cfr_renamed_90(this.this$0);
        n2 = R$string.done;
        object3 = object3.getString(n2);
        object.setText((CharSequence)object3);
        object = ProVersionActivityLast.cfr_renamed_127(this.this$0);
        object3 = new ProVersionActivityLast$15$1(this);
        object.setOnClickListener((View.OnClickListener)object3);
        ProVersionActivityLast.cfr_renamed_128(this.this$0).setSubscribe(true);
        this.this$0.explode();
    }
}

