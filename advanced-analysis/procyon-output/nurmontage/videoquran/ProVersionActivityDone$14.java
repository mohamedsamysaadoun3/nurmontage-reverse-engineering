// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivityDone$14 implements Runnable
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$14(final ProVersionActivityDone this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        ProVersionActivityDone.-$$Nest$mhideProgressFragment(this.this$0);
        if (ProVersionActivityDone.-$$Nest$fgetisBtnRestore(this.this$0)) {
            Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)ProVersionActivityDone.-$$Nest$fgetmResources(this.this$0).getString(R$string.not_have_susbcribe), 0).show();
        }
    }
}
