// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.view.View$OnClickListener;

class VideoViewActivity$3 implements View$OnClickListener
{
    final /* synthetic */ VideoViewActivity this$0;
    final /* synthetic */ Uri val$uri;
    
    VideoViewActivity$3(final VideoViewActivity this$0, final Uri val$uri) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent(this.this$0.getApplicationContext(), (Class)VideoPlayerActivity.class);
        intent.setData(this.val$uri);
        intent.addFlags(65536);
        this.this$0.startActivity(intent);
        this.this$0.overridePendingTransition(0, 0);
    }
}
