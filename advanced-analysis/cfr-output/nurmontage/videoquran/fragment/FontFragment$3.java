/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.graphics.Typeface;
import android.view.View;
import hazem.nurmontage.videoquran.fragment.FontFragment;

class FontFragment$3
implements View.OnClickListener {
    final /* synthetic */ FontFragment this$0;

    FontFragment$3(FontFragment fontFragment) {
        this.this$0 = fontFragment;
    }

    public void onClick(View object) {
        object = FontFragment.cfr_renamed_156(this.this$0);
        if (object != null && (object = FontFragment.cfr_renamed_157(this.this$0)) != null && (object = FontFragment.cfr_renamed_158(this.this$0)) != null) {
            object = FontFragment.cfr_renamed_156(this.this$0);
            String string2 = FontFragment.cfr_renamed_157(this.this$0);
            Typeface typeface = FontFragment.cfr_renamed_158(this.this$0);
            object.onCancel(string2, typeface);
        }
    }
}

