// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class FadeInOutFragment$1 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ FadeInOutFragment this$0;
    
    FadeInOutFragment$1(final FadeInOutFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int i, final boolean b) {
        FadeInOutFragment.-$$Nest$fgethint_fade_in(this.this$0).setText((CharSequence)String.valueOf(i));
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
