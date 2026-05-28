// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.R$drawable;
import android.view.View;
import android.view.View$OnClickListener;

class EffectBismilahFragment$3 implements View$OnClickListener
{
    final /* synthetic */ EffectBismilahFragment this$0;
    
    EffectBismilahFragment$3(final EffectBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EffectBismilahFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0).isHaveSelect()) {
            EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0).remove(EffectBismilahFragment.-$$Nest$fgettab_selected(this.this$0), EffectBismilahFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            EffectBismilahFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0).unselect();
            EffectBismilahFragment.-$$Nest$fgetbtn_unEffect(this.this$0).setBackgroundResource(R$drawable.circle_item_menu_select);
            final SeekBar -$$Nest$fgetseekBarDuration = EffectBismilahFragment.-$$Nest$fgetseekBarDuration(this.this$0);
            final int n = 8;
            -$$Nest$fgetseekBarDuration.setVisibility(n);
            EffectBismilahFragment.-$$Nest$fgettvDuration(this.this$0).setVisibility(n);
            this.this$0.visibleApplyAll();
        }
    }
}
