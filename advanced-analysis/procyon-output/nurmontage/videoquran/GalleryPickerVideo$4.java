// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerVideo$4 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$4(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (GalleryPickerVideo.-$$Nest$fgetvideoItem(this.this$0) != null) {
            final Intent intent = new Intent();
            intent.setData(Uri.parse(GalleryPickerVideo.-$$Nest$fgetvideoItem(this.this$0).getPath()));
            this.this$0.setResult(-1, intent);
        }
        this.this$0.finish();
    }
}
