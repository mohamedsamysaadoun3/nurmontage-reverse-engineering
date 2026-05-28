// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class GradientFragment$1 implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ GradientFragment this$0;
    
    GradientFragment$1(final GradientFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (GradientFragment.-$$Nest$fgetgradient(this.this$0) != null && GradientFragment.-$$Nest$fgetiIpadEditCallback(this.this$0) != null) {
            GradientFragment.-$$Nest$fgetgradient(this.this$0).setAngle(n);
            GradientFragment.-$$Nest$fgettv_angle(this.this$0).setText((CharSequence)String.valueOf(n));
            GradientFragment.-$$Nest$fgetiIpadEditCallback(this.this$0).onClick(GradientFragment.-$$Nest$fgetgradient(this.this$0), GradientFragment.-$$Nest$fgetindex(this.this$0));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
