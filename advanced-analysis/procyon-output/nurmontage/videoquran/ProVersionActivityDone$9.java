// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivityDone$9 implements Runnable
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$9(final ProVersionActivityDone this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)"Purchase is in unknown state", 0).show();
    }
}
