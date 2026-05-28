// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import hazem.nurmontage.videoquran.common.Common;
import android.view.View;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;
import android.view.View$OnClickListener;

class ChoiceBgFromVideoActivity$4 implements View$OnClickListener
{
    final /* synthetic */ ChoiceBgFromVideoActivity this$0;
    final /* synthetic */ VideoFrameSelectorView val$frameSelectorView;
    
    ChoiceBgFromVideoActivity$4(final ChoiceBgFromVideoActivity this$0, final VideoFrameSelectorView val$frameSelectorView) {
        this.this$0 = this$0;
        this.val$frameSelectorView = val$frameSelectorView;
    }
    
    public void onClick(final View view) {
        Common.bitmap = this.val$frameSelectorView.getFrameBitmap().getBitmap();
        this.this$0.setResult(-1, new Intent());
        this.this$0.finish();
    }
}
