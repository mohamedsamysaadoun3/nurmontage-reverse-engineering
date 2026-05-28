/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.view.View;
import hazem.nurmontage.videoquran.EditS_NameActivity;
import java.util.Objects;

class EditS_NameActivity$5
implements View.OnClickListener {
    final /* synthetic */ EditS_NameActivity this$0;

    EditS_NameActivity$5(EditS_NameActivity editS_NameActivity) {
        this.this$0 = editS_NameActivity;
    }

    public void onClick(View view) {
        view = new Intent();
        String string2 = Objects.requireNonNull(EditS_NameActivity.cfr_renamed_402(this.this$0).getText()).toString();
        view.putExtra("reader", string2);
        int n = EditS_NameActivity.cfr_renamed_403(this.this$0);
        view.putExtra("style", n);
        n = EditS_NameActivity.cfr_renamed_404(this.this$0);
        view.putExtra("index", n);
        n = EditS_NameActivity.cfr_renamed_358(this.this$0).isChecked() ? 1 : 0;
        view.putExtra("isBg", n != 0);
        n = EditS_NameActivity.cfr_renamed_405(this.this$0);
        view.putExtra("clrBg", n);
        this.this$0.setResult(-1, (Intent)view);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}

