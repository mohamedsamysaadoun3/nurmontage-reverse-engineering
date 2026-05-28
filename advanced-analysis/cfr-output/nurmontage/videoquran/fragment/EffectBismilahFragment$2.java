/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;

class EffectBismilahFragment$2
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ EffectBismilahFragment this$0;

    EffectBismilahFragment$2(EffectBismilahFragment effectBismilahFragment) {
        this.this$0 = effectBismilahFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        object = EffectBismilahFragment.cfr_renamed_193(this.this$0);
        String string2 = String.valueOf((float)n / 10.0f);
        object.setText((CharSequence)string2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar object) {
        Object object2 = EffectBismilahFragment.cfr_renamed_173(this.this$0);
        if (object2 != null) {
            object2 = this.this$0;
            int n = EffectBismilahFragment.cfr_renamed_190((EffectBismilahFragment)((Object)object2));
            float f = 4.0f;
            if (n == 0) {
                object2 = EffectBismilahFragment.cfr_renamed_173(this.this$0);
                int n2 = object.getProgress();
                float f2 = (float)n2 / f;
                EntityBismilahTimeline entityBismilahTimeline = EffectBismilahFragment.cfr_renamed_174(this.this$0);
                object2.updateDurationIn(f2, entityBismilahTimeline);
            } else {
                int n3;
                object2 = this.this$0;
                n = EffectBismilahFragment.cfr_renamed_190((EffectBismilahFragment)((Object)object2));
                if (n == (n3 = 1)) {
                    object2 = EffectBismilahFragment.cfr_renamed_173(this.this$0);
                    int n4 = object.getProgress();
                    float f3 = (float)n4 / f;
                    EntityBismilahTimeline entityBismilahTimeline = EffectBismilahFragment.cfr_renamed_174(this.this$0);
                    object2.updateDurationOut(f3, entityBismilahTimeline);
                }
            }
            object = this.this$0;
            ((EffectBismilahFragment)((Object)object)).visibleApplyAll();
        }
    }
}

