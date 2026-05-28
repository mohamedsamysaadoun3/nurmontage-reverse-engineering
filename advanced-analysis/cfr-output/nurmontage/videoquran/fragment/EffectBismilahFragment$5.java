/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;

class EffectBismilahFragment$5
implements View.OnClickListener {
    final /* synthetic */ EffectBismilahFragment this$0;

    EffectBismilahFragment$5(EffectBismilahFragment effectBismilahFragment) {
        this.this$0 = effectBismilahFragment;
    }

    public void onClick(View object) {
        object = EffectBismilahFragment.cfr_renamed_173(this.this$0);
        if (object != null) {
            object = EffectBismilahFragment.cfr_renamed_173(this.this$0);
            EntityBismilahTimeline entityBismilahTimeline = EffectBismilahFragment.cfr_renamed_174(this.this$0);
            object.applyAll(entityBismilahTimeline);
            object = this.this$0;
            EffectBismilahFragment.cfr_renamed_175((EffectBismilahFragment)((Object)object));
        }
    }
}

