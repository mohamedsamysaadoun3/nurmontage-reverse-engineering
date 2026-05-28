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
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;

class EffectAyaFragment$3
implements View.OnClickListener {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$3(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void onClick(View object) {
        object = EffectAyaFragment.cfr_renamed_192(this.this$0);
        boolean bl = object.isHaveSelect();
        if (bl) {
            object = EffectAyaFragment.cfr_renamed_173(this.this$0);
            EffectAyaFragment effectAyaFragment = this.this$0;
            int n = EffectAyaFragment.cfr_renamed_190(effectAyaFragment);
            EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
            object.remove(n, entityQuranTimeline);
            EffectAyaFragment.cfr_renamed_192(this.this$0).unselect();
            object = EffectAyaFragment.cfr_renamed_188(this.this$0);
            n = R$drawable.circle_item_menu_select;
            object.setBackgroundResource(n);
            object = EffectAyaFragment.cfr_renamed_189(this.this$0);
            n = 8;
            object.setVisibility(n);
            EffectAyaFragment.cfr_renamed_193(this.this$0).setVisibility(n);
            object = this.this$0;
            object.visibleApplyAll();
        }
    }
}

