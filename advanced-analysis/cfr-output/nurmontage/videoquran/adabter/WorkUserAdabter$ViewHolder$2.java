/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.Template;

class WorkUserAdabter$ViewHolder$2
implements View.OnClickListener {
    final /* synthetic */ WorkUserAdabter$ViewHolder this$1;
    final /* synthetic */ WorkUserAdabter val$this$0;

    WorkUserAdabter$ViewHolder$2(WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder, WorkUserAdabter workUserAdabter) {
        this.this$1 = workUserAdabter$ViewHolder;
        this.val$this$0 = workUserAdabter;
    }

    public void onClick(View object) {
        object = this.this$1.this$0.iWorkUserCallback;
        if (object != null) {
            object = this.this$1.this$0.iWorkUserCallback;
            Object object2 = WorkUserAdabter.cfr_renamed_316(this.this$1.this$0);
            WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder = this.this$1;
            int n = workUserAdabter$ViewHolder.getAdapterPosition();
            object2 = (Template)object2.get(n);
            object.onClick((Template)object2);
        }
    }
}

