// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerVideo$6 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$6(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0) != null) {
            if (GalleryPickerVideo.-$$Nest$fgetbtnExplore(this.this$0) != null) {
                if (GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).getVisibility() != 0) {
                    GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).setVisibility(0);
                    GalleryPickerVideo.-$$Nest$fgetbtnExplore(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 17301507, 0);
                }
                else {
                    GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).setVisibility(4);
                    GalleryPickerVideo.-$$Nest$fgetbtnExplore(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 17301506, 0);
                }
            }
        }
    }
}
