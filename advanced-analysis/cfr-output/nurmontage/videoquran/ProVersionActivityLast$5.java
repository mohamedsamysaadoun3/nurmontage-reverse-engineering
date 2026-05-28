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
import hazem.nurmontage.videoquran.R$drawable;
import java.util.Objects;

class ProVersionActivityLast$5
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$5(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void onClick(View object) {
        Object object2;
        object = ProVersionActivityLast.cfr_renamed_92(this.this$0);
        boolean bl = Objects.equals(object, object2 = ProVersionActivityLast.cfr_renamed_108());
        if (!bl) {
            object = ProVersionActivityLast.cfr_renamed_84(this.this$0);
            int n = R$drawable.bg_price_select;
            object.setBackgroundResource(n);
            object = ProVersionActivityLast.cfr_renamed_83(this.this$0);
            n = R$drawable.bg_price;
            object.setBackgroundResource(n);
            object = ProVersionActivityLast.cfr_renamed_375(this.this$0);
            n = R$drawable.bg_price;
            object.setBackgroundResource(n);
            object = this.this$0;
            object2 = ProVersionActivityLast.cfr_renamed_108();
            ProVersionActivityLast.cfr_renamed_99((ProVersionActivityLast)((Object)object), object2);
            object = ProVersionActivityLast.cfr_renamed_89(this.this$0);
            n = R$drawable.checked;
            object.setImageResource(n);
            object = ProVersionActivityLast.cfr_renamed_88(this.this$0);
            n = R$drawable.unchecked;
            object.setImageResource(n);
            object = ProVersionActivityLast.cfr_renamed_376(this.this$0);
            n = R$drawable.unchecked;
            object.setImageResource(n);
            object = ProVersionActivityLast.cfr_renamed_377(this.this$0);
            n = ProVersionActivityLast.cfr_renamed_378(this.this$0);
            object.setTextColor(n);
            object = ProVersionActivityLast.cfr_renamed_96(this.this$0);
            object2 = this.this$0;
            n = ProVersionActivityLast.cfr_renamed_378((ProVersionActivityLast)((Object)object2));
            object.setTextColor(n);
            object = ProVersionActivityLast.cfr_renamed_379(this.this$0);
            n = -1;
            object.setTextColor(n);
            ProVersionActivityLast.cfr_renamed_95(this.this$0).setTextColor(n);
            ProVersionActivityLast.cfr_renamed_380(this.this$0).setTextColor(n);
            object = ProVersionActivityLast.cfr_renamed_381(this.this$0);
            object.setTextColor(n);
        }
    }
}

