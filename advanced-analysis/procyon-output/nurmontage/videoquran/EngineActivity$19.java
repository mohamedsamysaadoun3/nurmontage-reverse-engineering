// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import kotlin.Pair;
import hazem.nurmontage.videoquran.Utils.AspectRatioCalculator;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;

class EngineActivity$19 implements CustomDiscreteSeekBar$OnProgressChangeListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$19(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onProgressChanged(final CustomDiscreteSeekBar customDiscreteSeekBar, final int n, final String s, final boolean b) {
    }
    
    public void onStartTrackingTouch(final CustomDiscreteSeekBar customDiscreteSeekBar) {
    }
    
    public void onStopTrackingTouch(final CustomDiscreteSeekBar customDiscreteSeekBar) {
        if (EngineActivity.-$$Nest$fgetmTemplate(this.this$0) != null) {
            EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setResolution(EngineActivity.-$$Nest$fgetseekBar_res(this.this$0).getCurrentLabel());
            final Pair size = AspectRatioCalculator.getSize(EngineActivity.-$$Nest$fgetmTemplate(this.this$0).geTypeResize(), EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getResolution());
            EngineActivity.-$$Nest$fgettv_resolution(this.this$0).setText((CharSequence)EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getResolution());
            EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setWidthAndHeight((int)size.getFirst(), (int)size.getSecond());
        }
    }
}
