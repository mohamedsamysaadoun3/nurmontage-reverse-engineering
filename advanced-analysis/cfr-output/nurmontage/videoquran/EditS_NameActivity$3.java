/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EditS_NameActivity;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class EditS_NameActivity$3
implements View.OnClickListener {
    final /* synthetic */ EditS_NameActivity this$0;

    EditS_NameActivity$3(EditS_NameActivity editS_NameActivity) {
        this.this$0 = editS_NameActivity;
    }

    public void onClick(View object) {
        object = this.this$0;
        int n = SurahNameStyle.ZAGHRAFAT.ordinal();
        EditS_NameActivity.cfr_renamed_14((EditS_NameActivity)((Object)object), n);
        object = this.this$0;
        TextCustumFont textCustumFont = EditS_NameActivity.cfr_renamed_15((EditS_NameActivity)((Object)object));
        TextCustumFont textCustumFont2 = EditS_NameActivity.cfr_renamed_16(this.this$0);
        EditS_NameActivity.cfr_renamed_17((EditS_NameActivity)((Object)object), textCustumFont, textCustumFont2);
    }
}

