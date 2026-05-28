// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.common.Common;
import androidx.activity.OnBackPressedCallback;

class GalleryPickerVideo$1 extends OnBackPressedCallback
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$1(final GalleryPickerVideo this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0) != null && GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).getVisibility() == 0) {
            GalleryPickerVideo.-$$Nest$fgetbtnExplore(this.this$0).performClick();
            return;
        }
        Common.LIST_SELECT = null;
        Common.INDEX_LIST_SELECT = 1;
        this.this$0.finish();
    }
}
