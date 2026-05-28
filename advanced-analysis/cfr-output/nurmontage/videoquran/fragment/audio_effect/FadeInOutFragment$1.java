/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment;

class FadeInOutFragment$1
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ FadeInOutFragment this$0;

    FadeInOutFragment$1(FadeInOutFragment fadeInOutFragment) {
        this.this$0 = fadeInOutFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        object = FadeInOutFragment.cfr_renamed_230(this.this$0);
        String string2 = String.valueOf(n);
        object.setText((CharSequence)string2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}

