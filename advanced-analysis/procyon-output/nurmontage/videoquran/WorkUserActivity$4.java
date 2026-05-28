// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.os.Parcelable;
import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import hazem.nurmontage.videoquran.model.Template;
import android.view.View$OnClickListener;

class WorkUserActivity$4 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ Template val$template;
    
    WorkUserActivity$4(final WorkUserActivity this$0, final Template val$template) {
        this.this$0 = this$0;
        this.val$template = val$template;
    }
    
    public void onClick(final View view) {
        final String s = "Send To";
        try {
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("act", "ACT_SHARE");
            intent.putExtra("android.intent.extra.TITLE", s);
            final String s2 = "android.intent.extra.STREAM";
            final WorkUserActivity this$0 = this.this$0;
            try {
                final Resources resources = this$0.getResources();
                try {
                    final String string = resources.getString(R$string.file_provider);
                    try {
                        try {
                            final Template val$template = this.val$template;
                            try {
                                final String uri_video = val$template.getUri_video();
                                try {
                                    final Uri parse = Uri.parse(uri_video);
                                    try {
                                        intent.putExtra(s2, (Parcelable)FileProvider.getUriForFile((Context)this$0, string, new File(parse.getPath())));
                                        intent.setType("video/mp4");
                                        this.this$0.startActivity(Intent.createChooser(intent, (CharSequence)s));
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
                catch (final Exception ex6) {}
            }
            catch (final Exception ex7) {}
        }
        catch (final Exception ex8) {}
        if (WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0) != null) {
            WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0).dismiss();
        }
    }
}
