/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog;

class RatingBottomSheetDialog$3
implements View.OnClickListener {
    final /* synthetic */ RatingBottomSheetDialog this$0;

    RatingBottomSheetDialog$3(RatingBottomSheetDialog ratingBottomSheetDialog) {
        this.this$0 = ratingBottomSheetDialog;
    }

    public void onClick(View view) {
        RatingBottomSheetDialog.setNeverAskAgain(this.this$0.getContext(), true);
        this.this$0.dismiss();
    }
}

