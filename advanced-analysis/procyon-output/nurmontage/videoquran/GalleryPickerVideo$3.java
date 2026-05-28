// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.io.File;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;

class GalleryPickerVideo$3 implements ExploreAdabters$IExplore
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$3(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void done() {
        final int visibility = GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).getVisibility();
        final int visibility2 = 4;
        if (visibility != visibility2) {
            GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).setVisibility(visibility2);
        }
    }
    
    public void folder(final File file, final String text, final String s) {
        final int visibility = GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).getVisibility();
        final int visibility2 = 4;
        if (visibility != visibility2) {
            GalleryPickerVideo.-$$Nest$fgetrv_explore(this.this$0).setVisibility(visibility2);
        }
        this.this$0.changeFolder(s);
        GalleryPickerVideo.-$$Nest$fgetbtnExplore(this.this$0).setText((CharSequence)text);
    }
}
