// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import java.util.Locale;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class SpeedFragment$1 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ SpeedFragment this$0;
    
    SpeedFragment$1(final SpeedFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, int n, final boolean b) {
        if (b) {
            final float n2 = n / 375.0f * 3.75f;
            n = 1048576000;
            SpeedFragment.-$$Nest$fgettvProgress(this.this$0).setText((CharSequence)String.format(Locale.US, "%.2fx", n2 + 0.25f));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (SpeedFragment.-$$Nest$fgetisPlay(this.this$0)) {
            SpeedFragment.-$$Nest$mpreviewAudio(this.this$0);
        }
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        SpeedFragment.-$$Nest$mapplyVolume(this.this$0, false);
    }
}
