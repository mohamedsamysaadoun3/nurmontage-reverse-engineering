/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.ColorS_NameFragment;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$IEditS_Name;
import hazem.nurmontage.videoquran.model.SurahNameEntity;

class ColorS_NameFragment$2
implements ColorAdabter$IColor {
    final /* synthetic */ ColorS_NameFragment this$0;

    ColorS_NameFragment$2(ColorS_NameFragment colorS_NameFragment) {
        this.this$0 = colorS_NameFragment;
    }

    public void onColor(int n, int n2) {
        Object object = ColorS_NameFragment.cfr_renamed_176(this.this$0);
        if (object != null && (object = ColorS_NameFragment.cfr_renamed_177(this.this$0)) != null) {
            this.this$0.scrollToSelectedPosition();
            object = ColorS_NameFragment.cfr_renamed_177(this.this$0);
            ((SurahNameEntity)object).setColor(n);
            EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name = ColorS_NameFragment.cfr_renamed_176(this.this$0);
            editS_NameFragment$IEditS_Name.update();
        }
    }
}

