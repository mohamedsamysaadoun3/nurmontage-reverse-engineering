// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import org.apache.commons.io.FileUtils;
import java.io.File;
import android.view.View;
import android.net.Uri;
import hazem.nurmontage.videoquran.model.Template;
import android.view.View$OnClickListener;

class WorkUserActivity$11 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ int val$pos;
    final /* synthetic */ Template val$template;
    final /* synthetic */ Uri val$uri;
    
    WorkUserActivity$11(final WorkUserActivity this$0, final Uri val$uri, final Template val$template, final int val$pos) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
        this.val$template = val$template;
        this.val$pos = val$pos;
    }
    
    public void onClick(final View view) {
        try {
            Label_0032: {
                if (this.val$uri == null) {
                    break Label_0032;
                }
                try {
                    final Uri val$uri = this.val$uri;
                    try {
                        FileUtils.forceDeleteOnExit(new File(val$uri.getPath()));
                        final Template val$template = this.val$template;
                        try {
                            Label_0069: {
                                if (val$template.getIdTemplate() == null) {
                                    break Label_0069;
                                }
                                final WorkUserActivity this$0 = this.this$0;
                                try {
                                    final Template val$template2 = this.val$template;
                                    try {
                                        LocalPersistence.deleteTemplate((Context)this$0, val$template2.getIdTemplate());
                                        Label_0103: {
                                            break Label_0103;
                                            final Template val$template3 = this.val$template;
                                            try {
                                                if (val$template3.getUri_video() == null) {
                                                    break Label_0103;
                                                }
                                                final WorkUserActivity this$2 = this.this$0;
                                                try {
                                                    final Template val$template4 = this.val$template;
                                                    try {
                                                        LocalPersistence.deleteTemplate((Context)this$2, val$template4.getUri_video());
                                                        final WorkUserActivity this$3 = this.this$0;
                                                        try {
                                                            final WorkUserAdabter -$$Nest$fgetworkUserAdabter = WorkUserActivity.-$$Nest$fgetworkUserAdabter(this$3);
                                                            try {
                                                                -$$Nest$fgetworkUserAdabter.remove(this.val$pos);
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
                                    catch (final Exception ex6) {}
                                }
                                catch (final Exception ex7) {}
                            }
                        }
                        catch (final Exception ex8) {}
                    }
                    catch (final Exception ex9) {}
                }
                catch (final Exception ex10) {}
            }
        }
        catch (final Exception ex11) {}
        if (WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0) != null) {
            WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0).dismiss();
        }
        if (WorkUserActivity.-$$Nest$fgetdialog(this.this$0) != null) {
            WorkUserActivity.-$$Nest$fgetdialog(this.this$0).dismiss();
        }
    }
}
