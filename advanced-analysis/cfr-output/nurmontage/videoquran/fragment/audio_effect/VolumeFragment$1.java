/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment;

class VolumeFragment$1
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ VolumeFragment this$0;

    VolumeFragment$1(VolumeFragment volumeFragment) {
        this.this$0 = volumeFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        if (bl) {
            object = VolumeFragment.cfr_renamed_220(this.this$0);
            String string2 = String.valueOf(n);
            object.setText((CharSequence)string2);
        }
    }

    public void onStartTrackingTouch(SeekBar object) {
        object = this.this$0;
        boolean bl = VolumeFragment.cfr_renamed_213((VolumeFragment)((Object)object));
        if (bl) {
            object = this.this$0;
            VolumeFragment.cfr_renamed_222((VolumeFragment)((Object)object));
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        VolumeFragment.cfr_renamed_221(this.this$0, false);
    }
}

