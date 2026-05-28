/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.WorkUserActivity;
import hazem.nurmontage.videoquran.model.Template;
import java.util.Comparator;

class WorkUserActivity$7
implements Comparator {
    final /* synthetic */ WorkUserActivity this$0;

    WorkUserActivity$7(WorkUserActivity workUserActivity) {
        this.this$0 = workUserActivity;
    }

    public int compare(Template object, Template object2) {
        String string2 = ((Template)object).getIdTemplate();
        if (string2 != null && (string2 = ((Template)object2).getIdTemplate()) != null) {
            object2 = ((Template)object2).getIdTemplate();
            object = ((Template)object).getIdTemplate();
            return ((String)object2).compareTo((String)object);
        }
        return 0;
    }
}

