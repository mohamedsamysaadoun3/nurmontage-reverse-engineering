/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.view.View;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog;

class RatingBottomSheetDialog$1
implements View.OnClickListener {
    final /* synthetic */ RatingBottomSheetDialog this$0;

    RatingBottomSheetDialog$1(RatingBottomSheetDialog ratingBottomSheetDialog) {
        this.this$0 = ratingBottomSheetDialog;
    }

    public void onClick(View object) {
        object = this.this$0;
        Context context = object.getContext();
        RatingBottomSheetDialog.cfr_renamed_166((RatingBottomSheetDialog)((Object)object), context);
        RatingBottomSheetDialog.setNeverAskAgain(this.this$0.getContext(), true);
        this.this$0.dismiss();
    }
}

