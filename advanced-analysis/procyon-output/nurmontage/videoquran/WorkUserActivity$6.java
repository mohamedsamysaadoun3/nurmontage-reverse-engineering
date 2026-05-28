// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import android.view.View;
import hazem.nurmontage.videoquran.model.Template;
import android.view.View$OnClickListener;

class WorkUserActivity$6 implements View$OnClickListener
{
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ int val$pos;
    final /* synthetic */ Template val$template;
    
    WorkUserActivity$6(final WorkUserActivity this$0, final Template val$template, final int val$pos) {
        this.this$0 = this$0;
        this.val$template = val$template;
        this.val$pos = val$pos;
    }
    
    public void onClick(final View view) {
        try {
            final Template val$template = this.val$template;
            try {
                final Template duplicate = val$template.duplicate();
                try {
                    try {
                        final StringBuilder append = new StringBuilder().append(duplicate.getIdTemplate()).append("_copy");
                        try {
                            final String string = append.toString();
                            duplicate.setIdTemplate(string);
                            LocalPersistence.duplicateTemplate((Context)this.this$0, duplicate, string);
                            final WorkUserActivity this$0 = this.this$0;
                            try {
                                final WorkUserAdabter -$$Nest$fgetworkUserAdabter = WorkUserActivity.-$$Nest$fgetworkUserAdabter(this$0);
                                try {
                                    -$$Nest$fgetworkUserAdabter.add(this.val$pos + 1, duplicate);
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
        if (WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0) != null) {
            WorkUserActivity.-$$Nest$fgetpopupWindow(this.this$0).dismiss();
        }
    }
}
