// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.io.File;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;

class GalleryPickerOneImage$3 implements ExploreAdabters$IExplore
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$3(final GalleryPickerOneImage this$0) {
        this.this$0 = this$0;
    }
    
    public void done() {
        final int visibility = GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).getVisibility();
        final int visibility2 = 4;
        if (visibility != visibility2) {
            GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).setVisibility(visibility2);
        }
    }
    
    public void folder(final File file, final String text, final String s) {
        final int visibility = GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).getVisibility();
        final int visibility2 = 4;
        if (visibility != visibility2) {
            GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$0).setVisibility(visibility2);
        }
        this.this$0.changeFolder(s);
        GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$0).setText((CharSequence)text);
    }
}
