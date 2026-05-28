/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters$TransitionItem;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters$ViewHolder;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

class TransitionEntityAdabters$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ TransitionEntityAdabters$ViewHolder this$1;
    final /* synthetic */ TransitionEntityAdabters val$this$0;

    TransitionEntityAdabters$ViewHolder$1(TransitionEntityAdabters$ViewHolder transitionEntityAdabters$ViewHolder, TransitionEntityAdabters transitionEntityAdabters) {
        this.this$1 = transitionEntityAdabters$ViewHolder;
        this.val$this$0 = transitionEntityAdabters;
    }

    public void onClick(View object) {
        object = TransitionEntityAdabters.cfr_renamed_173(this.this$1.this$0);
        if (object != null) {
            Object object2;
            int n;
            object = this.this$1.this$0;
            int n2 = TransitionEntityAdabters.cfr_renamed_303((TransitionEntityAdabters)((Object)object));
            if (n2 == 0 && (n2 = (object = this.this$1).getAdapterPosition()) > (n = 10)) {
                TransitionEntityAdabters.cfr_renamed_173(this.this$1.this$0).toSubscribe();
                return;
            }
            object = this.this$1.this$0;
            n2 = TransitionEntityAdabters.cfr_renamed_304((TransitionEntityAdabters)((Object)object));
            if (n2 == (n = (object2 = this.this$1).getAdapterPosition())) {
                return;
            }
            n2 = TransitionEntityAdabters.cfr_renamed_304(this.this$1.this$0);
            object2 = this.this$1.this$0;
            Object object3 = this.this$1;
            int n3 = object3.getAdapterPosition();
            TransitionEntityAdabters.cfr_renamed_305((TransitionEntityAdabters)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n2);
            object = this.this$1.this$0;
            object2 = this.this$1.this$0;
            n = TransitionEntityAdabters.cfr_renamed_304((TransitionEntityAdabters)((Object)object2));
            object.notifyItemChanged(n);
            object = TransitionEntityAdabters.cfr_renamed_306(this.this$1.this$0);
            if (object != null) {
                object = TransitionEntityAdabters.cfr_renamed_306(this.this$1.this$0);
                n2 = object.equals(object2 = "in") ? 1 : 0;
                if (n2 != 0) {
                    object = TransitionEntityAdabters.cfr_renamed_173(this.this$1.this$0);
                    object2 = TransitionEntityAdabters.cfr_renamed_307(this.this$1.this$0);
                    n3 = this.this$1.getAdapterPosition();
                    object2 = ((TransitionEntityAdabters$TransitionItem)object2.get(n3)).getType();
                    object3 = TransitionEntityAdabters.cfr_renamed_174(this.this$1.this$0);
                    object.in((String)object2, (EntityQuranTimeline)object3);
                } else {
                    object = TransitionEntityAdabters.cfr_renamed_306(this.this$1.this$0);
                    n2 = object.equals(object2 = "out") ? 1 : 0;
                    if (n2 != 0) {
                        object = TransitionEntityAdabters.cfr_renamed_173(this.this$1.this$0);
                        object2 = TransitionEntityAdabters.cfr_renamed_307(this.this$1.this$0);
                        n3 = this.this$1.getAdapterPosition();
                        object2 = ((TransitionEntityAdabters$TransitionItem)object2.get(n3)).getType();
                        object3 = TransitionEntityAdabters.cfr_renamed_174(this.this$1.this$0);
                        object.out((String)object2, (EntityQuranTimeline)object3);
                    }
                }
            }
        }
    }
}

