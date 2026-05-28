// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$IYoutuber;

class YoutuberActivity$2 implements YoutuberAdabter$IYoutuber
{
    final /* synthetic */ YoutuberActivity this$0;
    
    YoutuberActivity$2(final YoutuberActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final String s) {
        final Uri parse = Uri.parse("vnd.youtube:" + s);
        final String s2 = "android.intent.action.VIEW";
        final Intent intent = new Intent(s2, parse);
        final Intent intent2 = new Intent(s2, Uri.parse("https://youtu.be/" + s));
        try {
            this.this$0.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            try {
                this.this$0.startActivity(intent2);
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
}
