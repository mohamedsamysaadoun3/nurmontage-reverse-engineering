// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class VideoViewActivity$5 implements View$OnClickListener
{
    final /* synthetic */ VideoViewActivity this$0;
    
    VideoViewActivity$5(final VideoViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        this.this$0.startActivity(new Intent((Context)this.this$0, (Class)WorkUserActivity.class));
        this.this$0.finish();
    }
}
