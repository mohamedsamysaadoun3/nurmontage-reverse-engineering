// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class EffectBismilahFragment$2 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ EffectBismilahFragment this$0;
    
    EffectBismilahFragment$2(final EffectBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        EffectBismilahFragment.-$$Nest$fgettvDuration(this.this$0).setText((CharSequence)String.valueOf(n / 10.0f));
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        if (EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0) != null) {
            final int -$$Nest$fgettab_selected = EffectBismilahFragment.-$$Nest$fgettab_selected(this.this$0);
            final float n = 4.0f;
            if (-$$Nest$fgettab_selected == 0) {
                EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0).updateDurationIn(seekBar.getProgress() / n, EffectBismilahFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            }
            else if (EffectBismilahFragment.-$$Nest$fgettab_selected(this.this$0) == 1) {
                EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0).updateDurationOut(seekBar.getProgress() / n, EffectBismilahFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            }
            this.this$0.visibleApplyAll();
        }
    }
}
