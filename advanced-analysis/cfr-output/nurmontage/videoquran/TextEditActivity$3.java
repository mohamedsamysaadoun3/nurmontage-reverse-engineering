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
import hazem.nurmontage.videoquran.TextEditActivity;

class TextEditActivity$3
implements View.OnClickListener {
    final /* synthetic */ TextEditActivity this$0;

    TextEditActivity$3(TextEditActivity textEditActivity) {
        this.this$0 = textEditActivity;
    }

    public void onClick(View object) {
        object = " \u0646\u0635";
        Intent intent = new Intent();
        CharSequence charSequence = TextEditActivity.cfr_renamed_151(this.this$0);
        int n = TextEditActivity.findFirstDigitIndex((String)charSequence);
        int n2 = TextEditActivity.cfr_renamed_152(this.this$0);
        intent.putExtra("start_index", n2);
        n2 = TextEditActivity.cfr_renamed_153(this.this$0);
        String string2 = "end_index";
        intent.putExtra(string2, n2);
        String string3 = "aya";
        int n3 = -1;
        if (n == n3) {
            intent.putExtra(string3, (String)charSequence);
        } else {
            String string4 = ((String)charSequence).substring(0, n);
            charSequence = ((String)charSequence).substring(n);
            int n4 = Integer.parseInt((String)charSequence);
            int n5 = 286;
            if (n4 > n5) {
                n4 = n5;
            }
            String string5 = "number";
            intent.putExtra(string5, n4);
            charSequence = "index";
            intent.putExtra((String)charSequence, n);
            charSequence = new StringBuilder();
            charSequence = ((StringBuilder)charSequence).append(string4);
            object = ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)object).toString();
            try {
                intent.putExtra(string3, (String)object);
            }
            catch (Exception exception) {
                intent.putExtra(string3, string4);
            }
        }
        this.this$0.setResult(n3, intent);
        this.this$0.finish();
    }
}

