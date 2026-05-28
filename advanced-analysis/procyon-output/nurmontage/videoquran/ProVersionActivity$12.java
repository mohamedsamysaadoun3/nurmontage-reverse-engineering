// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.Toast;

class ProVersionActivity$12 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$12(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        Toast.makeText(this.this$0.getApplicationContext(), (CharSequence)"Purchase is pending", 0).show();
    }
}
