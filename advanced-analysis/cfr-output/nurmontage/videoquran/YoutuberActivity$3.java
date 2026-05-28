/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.YoutuberActivity;

class YoutuberActivity$3
implements View.OnClickListener {
    final /* synthetic */ YoutuberActivity this$0;

    YoutuberActivity$3(YoutuberActivity youtuberActivity) {
        this.this$0 = youtuberActivity;
    }

    public void onClick(View view) {
        YoutuberActivity.cfr_renamed_91(this.this$0).handleOnBackPressed();
    }
}

