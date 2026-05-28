// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivityLast$6 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$6(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (!Objects.equals(ProVersionActivityLast.-$$Nest$fgetproduct_id_current(this.this$0), ProVersionActivityLast.-$$Nest$sfgetPRODUCT_ID_MONTH())) {
            ProVersionActivityLast.-$$Nest$fgetbtn_month(this.this$0).setBackgroundResource(R$drawable.bg_price_select);
            ProVersionActivityLast.-$$Nest$fgetbtn_foreiver(this.this$0).setBackgroundResource(R$drawable.bg_price);
            ProVersionActivityLast.-$$Nest$fgetbtn_year(this.this$0).setBackgroundResource(R$drawable.bg_price);
            ProVersionActivityLast.-$$Nest$fputproduct_id_current(this.this$0, ProVersionActivityLast.-$$Nest$sfgetPRODUCT_ID_MONTH());
            ProVersionActivityLast.-$$Nest$fgetivMonth(this.this$0).setImageResource(R$drawable.checked);
            ProVersionActivityLast.-$$Nest$fgetivYear(this.this$0).setImageResource(R$drawable.unchecked);
            ProVersionActivityLast.-$$Nest$fgetivForeiver(this.this$0).setImageResource(R$drawable.unchecked);
            ProVersionActivityLast.-$$Nest$fgettv_month(this.this$0).setTextColor(ProVersionActivityLast.-$$Nest$fgetcolor_select(this.this$0));
            ProVersionActivityLast.-$$Nest$fgettv_price_month(this.this$0).setTextColor(ProVersionActivityLast.-$$Nest$fgetcolor_select(this.this$0));
            final TextCustumFont -$$Nest$fgettv_year = ProVersionActivityLast.-$$Nest$fgettv_year(this.this$0);
            final int n = -1;
            -$$Nest$fgettv_year.setTextColor(n);
            ProVersionActivityLast.-$$Nest$fgettv_price_year(this.this$0).setTextColor(n);
            ProVersionActivityLast.-$$Nest$fgettv_foreiver(this.this$0).setTextColor(n);
            ProVersionActivityLast.-$$Nest$fgettv_price_foreiver(this.this$0).setTextColor(n);
        }
    }
}
