/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;

class EffectBismilahFragment$3
implements View.OnClickListener {
    final /* synthetic */ EffectBismilahFragment this$0;

    EffectBismilahFragment$3(EffectBismilahFragment effectBismilahFragment) {
        this.this$0 = effectBismilahFragment;
    }

    public void onClick(View object) {
        object = EffectBismilahFragment.cfr_renamed_192(this.this$0);
        boolean bl = object.isHaveSelect();
        if (bl) {
            object = EffectBismilahFragment.cfr_renamed_173(this.this$0);
            EffectBismilahFragment effectBismilahFragment = this.this$0;
            int n = EffectBismilahFragment.cfr_renamed_190(effectBismilahFragment);
            EntityBismilahTimeline entityBismilahTimeline = EffectBismilahFragment.cfr_renamed_174(this.this$0);
            object.remove(n, entityBismilahTimeline);
            EffectBismilahFragment.cfr_renamed_192(this.this$0).unselect();
            object = EffectBismilahFragment.cfr_renamed_188(this.this$0);
            n = R$drawable.circle_item_menu_select;
            object.setBackgroundResource(n);
            object = EffectBismilahFragment.cfr_renamed_189(this.this$0);
            n = 8;
            object.setVisibility(n);
            EffectBismilahFragment.cfr_renamed_193(this.this$0).setVisibility(n);
            object = this.this$0;
            object.visibleApplyAll();
        }
    }
}

