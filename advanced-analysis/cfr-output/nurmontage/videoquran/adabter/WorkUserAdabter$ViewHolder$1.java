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
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.Template;

class WorkUserAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ WorkUserAdabter$ViewHolder this$1;
    final /* synthetic */ WorkUserAdabter val$this$0;

    WorkUserAdabter$ViewHolder$1(WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder, WorkUserAdabter workUserAdabter) {
        this.this$1 = workUserAdabter$ViewHolder;
        this.val$this$0 = workUserAdabter;
    }

    public void onClick(View view) {
        WorkUserAdabter$IWorkUserCallback workUserAdabter$IWorkUserCallback = this.this$1.this$0.iWorkUserCallback;
        if (workUserAdabter$IWorkUserCallback != null) {
            workUserAdabter$IWorkUserCallback = this.this$1.this$0.iWorkUserCallback;
            Object object = WorkUserAdabter.cfr_renamed_316(this.this$1.this$0);
            int n = this.this$1.getAdapterPosition();
            object = (Template)object.get(n);
            WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder = this.this$1;
            n = workUserAdabter$ViewHolder.getAdapterPosition();
            workUserAdabter$IWorkUserCallback.toMenu((Template)object, view, n);
        }
    }
}

