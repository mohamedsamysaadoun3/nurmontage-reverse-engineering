// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivity$4 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$4(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (!Objects.equals(ProVersionActivity.-$$Nest$fgetproduct_id_current(this.this$0), ProVersionActivity.-$$Nest$sfgetPRODUCT_ID_MONTH())) {
            ProVersionActivity.-$$Nest$fgetbtn_foreiver(this.this$0).setStrokeColor(-932849);
            ProVersionActivity.-$$Nest$fgetbtn_year(this.this$0).setStrokeColor(-13617603);
            ProVersionActivity.-$$Nest$fgetivForeiver(this.this$0).setImageResource(R$drawable.checked);
            final TextCustumFontBold -$$Nest$fgettv_price_foreiver = ProVersionActivity.-$$Nest$fgettv_price_foreiver(this.this$0);
            final int n = -1;
            -$$Nest$fgettv_price_foreiver.setTextColor(n);
            ProVersionActivity.-$$Nest$fgettv_price_year(this.this$0).setTextColor(n);
            ProVersionActivity.-$$Nest$fgetivYear(this.this$0).setImageResource(R$drawable.unchecked);
            ProVersionActivity.-$$Nest$fputproduct_id_current(this.this$0, ProVersionActivity.-$$Nest$sfgetPRODUCT_ID_MONTH());
            ProVersionActivity.-$$Nest$fgettv_best(this.this$0).setBackgroundResource(R$drawable.bg_badge_inactive);
        }
    }
}
