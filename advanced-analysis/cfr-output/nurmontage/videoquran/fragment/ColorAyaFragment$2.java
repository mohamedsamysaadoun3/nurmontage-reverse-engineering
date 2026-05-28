/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.ColorAyaFragment;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$IEditEntityCallback;

class ColorAyaFragment$2
implements ColorAdabter$IColor {
    final /* synthetic */ ColorAyaFragment this$0;

    ColorAyaFragment$2(ColorAyaFragment colorAyaFragment) {
        this.this$0 = colorAyaFragment;
    }

    public void onColor(int n, int n2) {
        EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback = ColorAyaFragment.cfr_renamed_164(this.this$0);
        if (editEntityFragment$IEditEntityCallback == null) {
            return;
        }
        this.this$0.scrollToSelectedPosition();
        editEntityFragment$IEditEntityCallback = ColorAyaFragment.cfr_renamed_198(this.this$0);
        if (editEntityFragment$IEditEntityCallback != null && (n2 = (editEntityFragment$IEditEntityCallback = ColorAyaFragment.cfr_renamed_198(this.this$0)).getSelectedTabPosition()) != 0) {
            editEntityFragment$IEditEntityCallback = ColorAyaFragment.cfr_renamed_164(this.this$0);
            editEntityFragment$IEditEntityCallback.updateTrsl(n);
        } else {
            editEntityFragment$IEditEntityCallback = ColorAyaFragment.cfr_renamed_164(this.this$0);
            editEntityFragment$IEditEntityCallback.updateAya(n);
        }
    }
}

