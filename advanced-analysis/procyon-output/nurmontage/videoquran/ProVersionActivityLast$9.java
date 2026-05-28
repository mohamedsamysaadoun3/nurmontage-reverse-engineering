// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class ProVersionActivityLast$9 implements View$OnClickListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$9(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final Uri parse = Uri.parse("vnd.youtube:3xtsWfMQ5KM");
        final String s = "android.intent.action.VIEW";
        final Intent intent = new Intent(s, parse);
        final Intent intent2 = new Intent(s, Uri.parse("https://youtu.be/3xtsWfMQ5KM"));
        try {
            this.this$0.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            this.this$0.startActivity(intent2);
        }
    }
}
