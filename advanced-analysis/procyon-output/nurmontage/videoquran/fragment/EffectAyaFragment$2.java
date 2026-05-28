// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class EffectAyaFragment$2 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ EffectAyaFragment this$0;
    
    EffectAyaFragment$2(final EffectAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        EffectAyaFragment.-$$Nest$fgettvDuration(this.this$0).setText((CharSequence)String.valueOf(n / 10.0f));
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        if (EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0) != null) {
            final int -$$Nest$fgettab_selected = EffectAyaFragment.-$$Nest$fgettab_selected(this.this$0);
            final float n = 4.0f;
            if (-$$Nest$fgettab_selected == 0) {
                EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0).updateDurationIn(seekBar.getProgress() / n, EffectAyaFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            }
            else if (EffectAyaFragment.-$$Nest$fgettab_selected(this.this$0) == 1) {
                EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0).updateDurationOut(seekBar.getProgress() / n, EffectAyaFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            }
            this.this$0.visibleApplyAll();
        }
    }
}
