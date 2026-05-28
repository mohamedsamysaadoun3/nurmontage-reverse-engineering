// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivityLast$13 implements Runnable
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$13(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)"Purchase is pending", 0).show();
    }
}
