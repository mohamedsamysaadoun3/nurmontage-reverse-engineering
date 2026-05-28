// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivity$19 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$19(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        ProVersionActivity.-$$Nest$mhideProgressFragment(this.this$0);
        if (ProVersionActivity.-$$Nest$fgetisBtnRestore(this.this$0)) {
            Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)ProVersionActivity.-$$Nest$fgetmResources(this.this$0).getString(R$string.not_have_susbcribe), 0).show();
        }
    }
}
