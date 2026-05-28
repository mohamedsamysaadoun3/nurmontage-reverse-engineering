/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.ColorBismilahFragment;

class ColorBismilahFragment$2
implements ColorAdabter$IColor {
    final /* synthetic */ ColorBismilahFragment this$0;

    ColorBismilahFragment$2(ColorBismilahFragment colorBismilahFragment) {
        this.this$0 = colorBismilahFragment;
    }

    public void onColor(int n, int n2) {
        Object object = ColorBismilahFragment.cfr_renamed_176(this.this$0);
        if (object != null && (object = ColorBismilahFragment.cfr_renamed_177(this.this$0)) != null) {
            this.this$0.scrollToSelectedPosition();
            object = ColorBismilahFragment.cfr_renamed_176(this.this$0);
            object.updateAya(n);
        }
    }
}

