// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppSettingsHelper;
import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerOneImage$5 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$5(final GalleryPickerOneImage this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        GalleryPickerOneImage.-$$Nest$fputisUpdate(this.this$0, true);
        AppSettingsHelper.openAppSettings((Context)this.this$0);
    }
}
