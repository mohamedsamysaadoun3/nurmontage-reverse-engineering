/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.PlayVideoActivity;

class PlayVideoActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ PlayVideoActivity this$0;

    PlayVideoActivity$1(PlayVideoActivity playVideoActivity, boolean bl) {
        this.this$0 = playVideoActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        PlayVideoActivity.cfr_renamed_371(this.this$0);
        this.this$0.finish();
    }
}

