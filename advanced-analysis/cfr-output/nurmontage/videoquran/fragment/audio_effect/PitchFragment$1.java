/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment;

class PitchFragment$1
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ PitchFragment this$0;

    PitchFragment$1(PitchFragment pitchFragment) {
        this.this$0 = pitchFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        if (bl) {
            object = PitchFragment.cfr_renamed_220(this.this$0);
            String string2 = String.valueOf(n);
            object.setText((CharSequence)string2);
        }
    }

    public void onStartTrackingTouch(SeekBar object) {
        object = this.this$0;
        boolean bl = PitchFragment.cfr_renamed_213((PitchFragment)((Object)object));
        if (bl) {
            object = this.this$0;
            PitchFragment.cfr_renamed_222((PitchFragment)((Object)object));
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        PitchFragment.cfr_renamed_221(this.this$0);
    }
}

