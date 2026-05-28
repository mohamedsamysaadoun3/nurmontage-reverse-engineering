/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;

class EffectAyaFragment$2
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$2(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        object = EffectAyaFragment.cfr_renamed_193(this.this$0);
        String string2 = String.valueOf((float)n / 10.0f);
        object.setText((CharSequence)string2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar object) {
        Object object2 = EffectAyaFragment.cfr_renamed_173(this.this$0);
        if (object2 != null) {
            object2 = this.this$0;
            int n = EffectAyaFragment.cfr_renamed_190((EffectAyaFragment)((Object)object2));
            float f = 4.0f;
            if (n == 0) {
                object2 = EffectAyaFragment.cfr_renamed_173(this.this$0);
                int n2 = object.getProgress();
                float f2 = (float)n2 / f;
                EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
                object2.updateDurationIn(f2, entityQuranTimeline);
            } else {
                int n3;
                object2 = this.this$0;
                n = EffectAyaFragment.cfr_renamed_190((EffectAyaFragment)((Object)object2));
                if (n == (n3 = 1)) {
                    object2 = EffectAyaFragment.cfr_renamed_173(this.this$0);
                    int n4 = object.getProgress();
                    float f3 = (float)n4 / f;
                    EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
                    object2.updateDurationOut(f3, entityQuranTimeline);
                }
            }
            object = this.this$0;
            ((EffectAyaFragment)((Object)object)).visibleApplyAll();
        }
    }
}

