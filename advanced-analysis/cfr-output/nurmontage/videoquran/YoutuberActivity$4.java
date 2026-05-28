/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.view.View;
import hazem.nurmontage.videoquran.YoutuberActivity;

class YoutuberActivity$4
implements View.OnClickListener {
    final /* synthetic */ YoutuberActivity this$0;

    YoutuberActivity$4(YoutuberActivity youtuberActivity) {
        this.this$0 = youtuberActivity;
    }

    public void onClick(View object) {
        object = this.this$0;
        ((YoutuberActivity)((Object)object)).youtuberLnk((Context)object);
    }
}

