/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import hazem.nurmontage.videoquran.VideoViewActivity;
import hazem.nurmontage.videoquran.WorkUserActivity;

class VideoViewActivity$5
implements View.OnClickListener {
    final /* synthetic */ VideoViewActivity this$0;

    VideoViewActivity$5(VideoViewActivity videoViewActivity) {
        this.this$0 = videoViewActivity;
    }

    public void onClick(View view) {
        VideoViewActivity videoViewActivity = this.this$0;
        view = new Intent((Context)videoViewActivity, WorkUserActivity.class);
        this.this$0.startActivity((Intent)view);
        this.this$0.finish();
    }
}

