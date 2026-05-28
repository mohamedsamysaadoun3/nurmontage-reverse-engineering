// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerOneImage$6 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$6(final GalleryPickerOneImage this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0) != null) {
            if (GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$0) != null) {
                if (GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).getVisibility() != 0) {
                    GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).setVisibility(0);
                    GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 17301507, 0);
                }
                else {
                    GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).setVisibility(4);
                    GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 17301506, 0);
                }
            }
        }
    }
}
