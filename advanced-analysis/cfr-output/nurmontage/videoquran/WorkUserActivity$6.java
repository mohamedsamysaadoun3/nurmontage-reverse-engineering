/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.view.View;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.WorkUserActivity;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import hazem.nurmontage.videoquran.model.Template;

class WorkUserActivity$6
implements View.OnClickListener {
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ int val$pos;
    final /* synthetic */ Template val$template;

    WorkUserActivity$6(WorkUserActivity workUserActivity, Template template, int n) {
        this.this$0 = workUserActivity;
        this.val$template = template;
        this.val$pos = n;
    }

    public void onClick(View object) {
        object = this.val$template;
        object = ((Template)object).duplicate();
        Object object2 = new StringBuilder();
        Object object3 = ((Template)object).getIdTemplate();
        object2 = ((StringBuilder)object2).append((String)object3);
        object3 = "_copy";
        object2 = ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        ((Template)object).setIdTemplate((String)object2);
        object3 = this.this$0;
        LocalPersistence.duplicateTemplate((Context)object3, object, (String)object2);
        object2 = this.this$0;
        object2 = WorkUserActivity.cfr_renamed_300((WorkUserActivity)((Object)object2));
        int n = this.val$pos + 1;
        try {
            ((WorkUserAdabter)((Object)object2)).add(n, (Template)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object = WorkUserActivity.cfr_renamed_301(this.this$0);
        if (object != null) {
            object = WorkUserActivity.cfr_renamed_301(this.this$0);
            object.dismiss();
        }
    }
}

