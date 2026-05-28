// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.Template;
import java.util.Comparator;

class WorkUserActivity$7 implements Comparator
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$7(final WorkUserActivity this$0) {
        this.this$0 = this$0;
    }
    
    public int compare(final Template template, final Template template2) {
        if (template.getIdTemplate() != null && template2.getIdTemplate() != null) {
            return template2.getIdTemplate().compareTo(template.getIdTemplate());
        }
        return 0;
    }
}
