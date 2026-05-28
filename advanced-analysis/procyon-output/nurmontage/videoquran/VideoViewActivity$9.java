// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog;
import android.view.View;
import android.view.View$OnClickListener;

class VideoViewActivity$9 implements View$OnClickListener
{
    final /* synthetic */ VideoViewActivity this$0;
    
    VideoViewActivity$9(final VideoViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        try {
            final VideoViewActivity this$0 = this.this$0;
            try {
                VideoViewActivity.-$$Nest$mopenPlayStoreForRating(this$0);
                RatingBottomSheetDialog.setNeverAskAgain((Context)this.this$0, true);
                final VideoViewActivity this$2 = this.this$0;
                try {
                    VideoViewActivity.-$$Nest$mcancelDialog(this$2);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
