// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;

class EngineActivity$18 implements CustomDiscreteSeekBar$OnProgressChangeListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$18(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final CustomDiscreteSeekBar customDiscreteSeekBar, final int n, final String s, final boolean b) {
    }
    
    public void onStartTrackingTouch(final CustomDiscreteSeekBar customDiscreteSeekBar) {
    }
    
    public void onStopTrackingTouch(final CustomDiscreteSeekBar customDiscreteSeekBar) {
        if (EngineActivity.-$$Nest$fgetmTemplate(this.this$0) != null) {
            EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setFps(Integer.parseInt(EngineActivity.-$$Nest$fgetseekBar_fps(this.this$0).getCurrentLabel()));
        }
    }
}
