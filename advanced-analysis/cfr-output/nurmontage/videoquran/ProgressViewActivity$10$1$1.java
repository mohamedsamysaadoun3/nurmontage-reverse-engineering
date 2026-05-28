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
import hazem.nurmontage.videoquran.ProgressViewActivity$10$1;
import hazem.nurmontage.videoquran.Utils.Feadback;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;

class ProgressViewActivity$10$1$1
implements View.OnClickListener {
    final /* synthetic */ ProgressViewActivity$10$1 this$2;
    final /* synthetic */ ButtonCustumFont val$btnTeam;

    ProgressViewActivity$10$1$1(ProgressViewActivity$10$1 progressViewActivity$10$1, ButtonCustumFont buttonCustumFont) {
        this.this$2 = progressViewActivity$10$1;
        this.val$btnTeam = buttonCustumFont;
    }

    public void onClick(View object) {
        object = this.this$2.this$1.this$0;
        String string2 = this.this$2.val$sb.toString();
        String string3 = ((Object)this.val$btnTeam.getText()).toString();
        Feadback.reportBug((Context)object, string2, string3);
    }
}

