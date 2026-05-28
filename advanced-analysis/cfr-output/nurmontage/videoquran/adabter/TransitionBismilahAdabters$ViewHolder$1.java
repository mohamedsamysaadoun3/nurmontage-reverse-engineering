/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$TransitionItem;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$ViewHolder;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;

class TransitionBismilahAdabters$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ TransitionBismilahAdabters$ViewHolder this$1;
    final /* synthetic */ TransitionBismilahAdabters val$this$0;

    TransitionBismilahAdabters$ViewHolder$1(TransitionBismilahAdabters$ViewHolder transitionBismilahAdabters$ViewHolder, TransitionBismilahAdabters transitionBismilahAdabters) {
        this.this$1 = transitionBismilahAdabters$ViewHolder;
        this.val$this$0 = transitionBismilahAdabters;
    }

    public void onClick(View object) {
        object = TransitionBismilahAdabters.cfr_renamed_173(this.this$1.this$0);
        if (object != null) {
            Object object2;
            int n;
            object = this.this$1.this$0;
            int n2 = TransitionBismilahAdabters.cfr_renamed_304((TransitionBismilahAdabters)((Object)object));
            if (n2 == (n = (object2 = this.this$1).getAdapterPosition())) {
                return;
            }
            n2 = TransitionBismilahAdabters.cfr_renamed_304(this.this$1.this$0);
            object2 = this.this$1.this$0;
            Object object3 = this.this$1;
            int n3 = object3.getAdapterPosition();
            TransitionBismilahAdabters.cfr_renamed_305((TransitionBismilahAdabters)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n2);
            object = this.this$1.this$0;
            object2 = this.this$1.this$0;
            n = TransitionBismilahAdabters.cfr_renamed_304((TransitionBismilahAdabters)((Object)object2));
            object.notifyItemChanged(n);
            object = TransitionBismilahAdabters.cfr_renamed_306(this.this$1.this$0);
            if (object != null) {
                object = TransitionBismilahAdabters.cfr_renamed_306(this.this$1.this$0);
                n2 = object.equals(object2 = "in") ? 1 : 0;
                if (n2 != 0) {
                    object = TransitionBismilahAdabters.cfr_renamed_173(this.this$1.this$0);
                    object2 = TransitionBismilahAdabters.cfr_renamed_307(this.this$1.this$0);
                    n3 = this.this$1.getAdapterPosition();
                    object2 = ((TransitionBismilahAdabters$TransitionItem)object2.get(n3)).getType();
                    object3 = TransitionBismilahAdabters.cfr_renamed_174(this.this$1.this$0);
                    object.in((String)object2, (EntityBismilahTimeline)object3);
                } else {
                    object = TransitionBismilahAdabters.cfr_renamed_306(this.this$1.this$0);
                    n2 = object.equals(object2 = "out") ? 1 : 0;
                    if (n2 != 0) {
                        object = TransitionBismilahAdabters.cfr_renamed_173(this.this$1.this$0);
                        object2 = TransitionBismilahAdabters.cfr_renamed_307(this.this$1.this$0);
                        n3 = this.this$1.getAdapterPosition();
                        object2 = ((TransitionBismilahAdabters$TransitionItem)object2.get(n3)).getType();
                        object3 = TransitionBismilahAdabters.cfr_renamed_174(this.this$1.this$0);
                        object.out((String)object2, (EntityBismilahTimeline)object3);
                    }
                }
            }
        }
    }
}

