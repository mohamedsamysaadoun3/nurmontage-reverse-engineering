// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class EchoEffectFragment$3 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ EchoEffectFragment this$0;
    
    EchoEffectFragment$3(final EchoEffectFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int i, final boolean b) {
        EchoEffectFragment.-$$Nest$fgettv_hint_volume(this.this$0).setText((CharSequence)String.valueOf(i));
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (EchoEffectFragment.-$$Nest$fgetisPlay(this.this$0)) {
            EchoEffectFragment.-$$Nest$fgetiEchoCallback(this.this$0).pausePreview();
            this.this$0.updateButton();
        }
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
