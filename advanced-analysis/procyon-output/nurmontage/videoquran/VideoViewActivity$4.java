// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.Utils;
import android.view.View;
import android.view.View$OnClickListener;

class VideoViewActivity$4 implements View$OnClickListener
{
    final /* synthetic */ VideoViewActivity this$0;
    
    VideoViewActivity$4(final VideoViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final VideoViewActivity this$0 = this.this$0;
        final String s = "hazem.tuffah.quranaudio";
        if (Utils.isAppInstalled((Context)this$0, s)) {
            final Intent launchIntentForPackage = this.this$0.getPackageManager().getLaunchIntentForPackage(s);
            if (launchIntentForPackage != null) {
                this.this$0.startActivity(launchIntentForPackage);
            }
        }
        else {
            VideoViewActivity.-$$Nest$minslallTuffah(this.this$0);
        }
    }
}
