/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.audio_effect.SpeedFragment;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.Locale;

class SpeedFragment$1
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ SpeedFragment this$0;

    SpeedFragment$1(SpeedFragment speedFragment) {
        this.this$0 = speedFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        if (bl) {
            float f = (float)n / 375.0f * 3.75f;
            n = 1048576000;
            float f2 = 0.25f;
            TextCustumFont textCustumFont = SpeedFragment.cfr_renamed_220(this.this$0);
            Locale locale = Locale.US;
            object = Float.valueOf(f += f2);
            object = new Object[]{object};
            String string2 = "%.2fx";
            object = String.format(locale, string2, object);
            textCustumFont.setText((CharSequence)object);
        }
    }

    public void onStartTrackingTouch(SeekBar object) {
        object = this.this$0;
        boolean bl = SpeedFragment.cfr_renamed_213((SpeedFragment)((Object)object));
        if (bl) {
            object = this.this$0;
            SpeedFragment.cfr_renamed_222((SpeedFragment)((Object)object));
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SpeedFragment.cfr_renamed_221(this.this$0, false);
    }
}

