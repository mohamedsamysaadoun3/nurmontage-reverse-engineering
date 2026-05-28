// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.model.Template;
import android.view.View$OnClickListener;

class WorkUserActivity$5 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ int val$pos;
    final /* synthetic */ Template val$template;
    
    WorkUserActivity$5(final WorkUserActivity this$0, final int val$pos, final Template val$template) {
        this.this$0 = this$0;
        this.val$pos = val$pos;
        this.val$template = val$template;
    }
    
    public void onClick(final View view) {
        try {
            final WorkUserActivity this$0 = this.this$0;
            try {
                final int val$pos = this.val$pos;
                try {
                    final Template val$template = this.val$template;
                    try {
                        final String uri_video = val$template.getUri_video();
                        try {
                            this$0.dialog(val$pos, val$template, Uri.parse(uri_video));
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex3) {}
            }
            catch (final Exception ex4) {}
        }
        catch (final Exception ex5) {}
    }
}
