// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;

class ProVersionActivityDone$15 implements Runnable
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$15(final ProVersionActivityDone this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        new MyVibrationHelper((Context)this.this$0).vibrate(250L);
    }
}
