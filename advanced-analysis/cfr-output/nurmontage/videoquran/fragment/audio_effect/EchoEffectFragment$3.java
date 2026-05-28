/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment;

class EchoEffectFragment$3
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ EchoEffectFragment this$0;

    EchoEffectFragment$3(EchoEffectFragment echoEffectFragment) {
        this.this$0 = echoEffectFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        object = EchoEffectFragment.cfr_renamed_219(this.this$0);
        String string2 = String.valueOf(n);
        object.setText((CharSequence)string2);
    }

    public void onStartTrackingTouch(SeekBar object) {
        object = this.this$0;
        boolean bl = EchoEffectFragment.cfr_renamed_213((EchoEffectFragment)((Object)object));
        if (bl) {
            EchoEffectFragment.cfr_renamed_214(this.this$0).pausePreview();
            object = this.this$0;
            object.updateButton();
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}

