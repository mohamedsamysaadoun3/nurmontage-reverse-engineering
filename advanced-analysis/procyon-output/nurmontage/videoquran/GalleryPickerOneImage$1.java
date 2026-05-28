// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.common.Common;
import androidx.activity.OnBackPressedCallback;

class GalleryPickerOneImage$1 extends OnBackPressedCallback
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$1(final GalleryPickerOneImage this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0) != null && GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).getVisibility() == 0) {
            GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$0).performClick();
            return;
        }
        Common.LIST_SELECT = null;
        Common.INDEX_LIST_SELECT = 1;
        this.this$0.finish();
    }
}
