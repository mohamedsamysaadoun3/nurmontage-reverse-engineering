// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class PitchFragment$1 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ PitchFragment this$0;
    
    PitchFragment$1(final PitchFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int i, final boolean b) {
        if (b) {
            PitchFragment.-$$Nest$fgettvProgress(this.this$0).setText((CharSequence)String.valueOf(i));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (PitchFragment.-$$Nest$fgetisPlay(this.this$0)) {
            PitchFragment.-$$Nest$mpreviewAudio(this.this$0);
        }
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        PitchFragment.-$$Nest$mapplyVolume(this.this$0);
    }
}
