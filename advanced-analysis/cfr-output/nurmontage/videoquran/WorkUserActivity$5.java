/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.WorkUserActivity;
import hazem.nurmontage.videoquran.model.Template;

class WorkUserActivity$5
implements View.OnClickListener {
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ int val$pos;
    final /* synthetic */ Template val$template;

    WorkUserActivity$5(WorkUserActivity workUserActivity, int n, Template template) {
        this.this$0 = workUserActivity;
        this.val$pos = n;
        this.val$template = template;
    }

    public void onClick(View object) {
        object = this.this$0;
        int n = this.val$pos;
        Template template = this.val$template;
        String string2 = template.getUri_video();
        string2 = Uri.parse((String)string2);
        try {
            ((WorkUserActivity)((Object)object)).dialog(n, template, (Uri)string2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

