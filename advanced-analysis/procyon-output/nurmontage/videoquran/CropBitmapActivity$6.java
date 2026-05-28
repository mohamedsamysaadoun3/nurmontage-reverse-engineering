// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import android.view.View;
import android.view.View$OnClickListener;

class CropBitmapActivity$6 implements View$OnClickListener
{
    final /* synthetic */ CropBitmapActivity this$0;
    
    CropBitmapActivity$6(final CropBitmapActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (!BillingPreferences.isSubscribed((Context)this.this$0)) {
            this.this$0.dialogPremium();
            return;
        }
        if (!MyPrefereces.isShowHint((Context)this.this$0)) {
            MyPrefereces.putShowHint((Context)this.this$0);
        }
        Common.bitmap = CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getCroppedBitmap();
        Common.rect = CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getRectSquare();
        final Intent intent = new Intent();
        intent.putExtra("x", CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getmX());
        intent.putExtra("y", CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getmY());
        intent.putExtra("w", CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getmW());
        intent.putExtra("h", CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).getmH());
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }
}
