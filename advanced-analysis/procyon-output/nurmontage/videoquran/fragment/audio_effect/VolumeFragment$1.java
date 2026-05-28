// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class VolumeFragment$1 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ VolumeFragment this$0;
    
    VolumeFragment$1(final VolumeFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int i, final boolean b) {
        if (b) {
            VolumeFragment.-$$Nest$fgettvProgress(this.this$0).setText((CharSequence)String.valueOf(i));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (VolumeFragment.-$$Nest$fgetisPlay(this.this$0)) {
            VolumeFragment.-$$Nest$mpreviewAudio(this.this$0);
        }
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        VolumeFragment.-$$Nest$mapplyVolume(this.this$0, false);
    }
}
