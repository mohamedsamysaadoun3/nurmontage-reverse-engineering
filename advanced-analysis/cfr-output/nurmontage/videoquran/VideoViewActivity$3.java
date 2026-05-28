/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.VideoPlayerActivity;
import hazem.nurmontage.videoquran.VideoViewActivity;

class VideoViewActivity$3
implements View.OnClickListener {
    final /* synthetic */ VideoViewActivity this$0;
    final /* synthetic */ Uri val$uri;

    VideoViewActivity$3(VideoViewActivity videoViewActivity, Uri uri) {
        this.this$0 = videoViewActivity;
        this.val$uri = uri;
    }

    public void onClick(View view) {
        Context context = this.this$0.getApplicationContext();
        view = new Intent(context, VideoPlayerActivity.class);
        context = this.val$uri;
        view.setData((Uri)context);
        view.addFlags(65536);
        this.this$0.startActivity((Intent)view);
        this.this$0.overridePendingTransition(0, 0);
    }
}

