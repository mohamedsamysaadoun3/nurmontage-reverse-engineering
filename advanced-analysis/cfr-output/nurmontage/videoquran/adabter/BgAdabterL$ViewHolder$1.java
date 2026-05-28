/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.BgAdabterL;
import hazem.nurmontage.videoquran.adabter.BgAdabterL$ViewHolder;
import hazem.nurmontage.videoquran.model.BgItem;

class BgAdabterL$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ BgAdabterL$ViewHolder this$1;
    final /* synthetic */ BgAdabterL val$this$0;

    BgAdabterL$ViewHolder$1(BgAdabterL$ViewHolder bgAdabterL$ViewHolder, BgAdabterL bgAdabterL) {
        this.this$1 = bgAdabterL$ViewHolder;
        this.val$this$0 = bgAdabterL;
    }

    public void onClick(View object) {
        object = this.this$1.this$0.iBgCallback;
        if (object != null) {
            object = this.this$1.this$0;
            int n = this.this$1.getAdapterPosition();
            BgAdabterL.cfr_renamed_310((BgAdabterL)((Object)object), n);
            object = this.this$1.this$0.iBgCallback;
            Object object2 = BgAdabterL.cfr_renamed_316(this.this$1.this$0);
            BgAdabterL$ViewHolder bgAdabterL$ViewHolder = this.this$1;
            int n2 = bgAdabterL$ViewHolder.getAdapterPosition();
            object2 = (BgItem)object2.get(n2);
            object.onAdd((BgItem)object2);
        }
    }
}

