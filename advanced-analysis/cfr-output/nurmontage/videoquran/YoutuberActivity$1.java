/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.YoutuberActivity;

class YoutuberActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ YoutuberActivity this$0;

    YoutuberActivity$1(YoutuberActivity youtuberActivity, boolean bl) {
        this.this$0 = youtuberActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.finish();
    }
}

