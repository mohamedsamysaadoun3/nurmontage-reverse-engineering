// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivityLast$19 implements Runnable
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$19(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        ProVersionActivityLast.-$$Nest$mhideProgressFragment(this.this$0);
        Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)ProVersionActivityLast.-$$Nest$fgetmResources(this.this$0).getString(R$string.not_have_susbcribe), 0).show();
    }
}
