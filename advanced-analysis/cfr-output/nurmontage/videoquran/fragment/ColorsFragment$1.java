/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.ColorsFragment;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;

class ColorsFragment$1
implements ColorAdabter$IColor {
    final /* synthetic */ ColorsFragment this$0;

    ColorsFragment$1(ColorsFragment colorsFragment) {
        this.this$0 = colorsFragment;
    }

    public void onColor(int n, int n2) {
        this.this$0.scrollToSelectedPosition();
        EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback = ColorsFragment.cfr_renamed_172(this.this$0);
        if (editIpadFragment$IIpadEditCallback != null) {
            editIpadFragment$IIpadEditCallback = ColorsFragment.cfr_renamed_172(this.this$0);
            editIpadFragment$IIpadEditCallback.onClick(n, n2);
        }
    }
}

