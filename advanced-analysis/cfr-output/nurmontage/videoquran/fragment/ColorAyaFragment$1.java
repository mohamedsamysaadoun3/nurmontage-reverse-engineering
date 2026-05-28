/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.ColorAyaFragment;

class ColorAyaFragment$1
implements View.OnClickListener {
    final /* synthetic */ ColorAyaFragment this$0;

    ColorAyaFragment$1(ColorAyaFragment colorAyaFragment) {
        this.this$0 = colorAyaFragment;
    }

    public void onClick(View object) {
        object = ColorAyaFragment.cfr_renamed_164(this.this$0);
        if (object != null) {
            object = ColorAyaFragment.cfr_renamed_164(this.this$0);
            object.onDone();
        }
    }
}

