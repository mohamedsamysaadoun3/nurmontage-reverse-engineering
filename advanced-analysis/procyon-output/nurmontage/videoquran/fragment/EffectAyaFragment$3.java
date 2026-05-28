// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.R$drawable;
import android.view.View;
import android.view.View$OnClickListener;

class EffectAyaFragment$3 implements View$OnClickListener
{
    final /* synthetic */ EffectAyaFragment this$0;
    
    EffectAyaFragment$3(final EffectAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EffectAyaFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0).isHaveSelect()) {
            EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0).remove(EffectAyaFragment.-$$Nest$fgettab_selected(this.this$0), EffectAyaFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            EffectAyaFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0).unselect();
            EffectAyaFragment.-$$Nest$fgetbtn_unEffect(this.this$0).setBackgroundResource(R$drawable.circle_item_menu_select);
            final SeekBar -$$Nest$fgetseekBarDuration = EffectAyaFragment.-$$Nest$fgetseekBarDuration(this.this$0);
            final int n = 8;
            -$$Nest$fgetseekBarDuration.setVisibility(n);
            EffectAyaFragment.-$$Nest$fgettvDuration(this.this$0).setVisibility(n);
            this.this$0.visibleApplyAll();
        }
    }
}
