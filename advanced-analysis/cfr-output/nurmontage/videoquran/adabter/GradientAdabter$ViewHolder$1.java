/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.GradientAdabter;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.Gradient;

class GradientAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ GradientAdabter$ViewHolder this$1;
    final /* synthetic */ GradientAdabter val$this$0;

    GradientAdabter$ViewHolder$1(GradientAdabter$ViewHolder gradientAdabter$ViewHolder, GradientAdabter gradientAdabter) {
        this.this$1 = gradientAdabter$ViewHolder;
        this.val$this$0 = gradientAdabter;
    }

    public void onClick(View object) {
        object = this.this$1.this$0.iColorCallback;
        if (object != null) {
            Object object2;
            int n;
            object = this.this$1.this$0;
            int n2 = GradientAdabter.cfr_renamed_303((GradientAdabter)((Object)object));
            if (n2 == 0 && (n2 = (object = this.this$1).getAdapterPosition()) > (n = 1)) {
                return;
            }
            object = this.this$1.this$0;
            n2 = GradientAdabter.cfr_renamed_320((GradientAdabter)((Object)object));
            if (n2 == (n = (object2 = this.this$1).getAdapterPosition())) {
                return;
            }
            n2 = GradientAdabter.cfr_renamed_320(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n3 = this.this$1.getAdapterPosition();
            GradientAdabter.cfr_renamed_321((GradientAdabter)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n2);
            object = this.this$1.this$0;
            n = GradientAdabter.cfr_renamed_320(this.this$1.this$0);
            object.notifyItemChanged(n);
            object = this.this$1.this$0.iColorCallback;
            object2 = GradientAdabter.cfr_renamed_318(this.this$1.this$0);
            n3 = this.this$1.getAdapterPosition();
            object2 = (Gradient)object2.get(n3);
            GradientAdabter$ViewHolder gradientAdabter$ViewHolder = this.this$1;
            n3 = gradientAdabter$ViewHolder.getAdapterPosition();
            object.onGradient((Gradient)object2, n3);
        }
    }
}

