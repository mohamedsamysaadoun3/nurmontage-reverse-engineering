// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppSettingsHelper;
import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerVideo$5 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$5(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        GalleryPickerVideo.-$$Nest$fputisUpdate(this.this$0, true);
        AppSettingsHelper.openAppSettings((Context)this.this$0);
    }
}
