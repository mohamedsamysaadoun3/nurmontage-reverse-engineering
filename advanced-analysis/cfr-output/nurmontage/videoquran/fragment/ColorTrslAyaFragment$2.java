/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.ColorTrslAyaFragment;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment$IEditEntityCallback;

class ColorTrslAyaFragment$2
implements ColorAdabter$IColor {
    final /* synthetic */ ColorTrslAyaFragment this$0;

    ColorTrslAyaFragment$2(ColorTrslAyaFragment colorTrslAyaFragment) {
        this.this$0 = colorTrslAyaFragment;
    }

    public void onColor(int n, int n2) {
        EditTrslEntityFragment$IEditEntityCallback editTrslEntityFragment$IEditEntityCallback = ColorTrslAyaFragment.cfr_renamed_164(this.this$0);
        if (editTrslEntityFragment$IEditEntityCallback == null) {
            return;
        }
        this.this$0.scrollToSelectedPosition();
        ColorTrslAyaFragment.cfr_renamed_164(this.this$0).updateAya(n);
    }
}

