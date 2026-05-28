// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class RatingBottomSheetDialog$3 implements View$OnClickListener
{
    final /* synthetic */ RatingBottomSheetDialog this$0;
    
    RatingBottomSheetDialog$3(final RatingBottomSheetDialog this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        RatingBottomSheetDialog.setNeverAskAgain(this.this$0.getContext(), true);
        this.this$0.dismiss();
    }
}
