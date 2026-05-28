// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.os.Build$VERSION;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$28 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$28(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        EngineActivity.-$$Nest$fputisSaveTmpTemplate(this.this$0, false);
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        if (Build$VERSION.SDK_INT >= 33) {
            EngineActivity.-$$Nest$msave(this.this$0);
        }
        else {
            final EngineActivity this$0 = this.this$0;
            final String s = "android.permission.WRITE_EXTERNAL_STORAGE";
            if (ContextCompat.checkSelfPermission((Context)this$0, s) == 0) {
                EngineActivity.-$$Nest$msave(this.this$0);
            }
            else {
                final EngineActivity this$2 = this.this$0;
                final int n = 1;
                final String[] array = new String[n];
                array[0] = s;
                ActivityCompat.requestPermissions((Activity)this$2, array, n);
            }
        }
    }
}
