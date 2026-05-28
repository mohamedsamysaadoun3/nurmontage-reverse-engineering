// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;

class ProVersionActivity$20 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$20(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        new MyVibrationHelper((Context)this.this$0).vibrate(250L);
    }
}
