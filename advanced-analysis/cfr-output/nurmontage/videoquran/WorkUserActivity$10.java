/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.WorkUserActivity;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;
import hazem.nurmontage.videoquran.model.Template;

class WorkUserActivity$10
implements WorkUserAdabter$IWorkUserCallback {
    final /* synthetic */ WorkUserActivity this$0;

    WorkUserActivity$10(WorkUserActivity workUserActivity) {
        this.this$0 = workUserActivity;
    }

    public void onClick(Template object) {
        Object object2 = this.this$0;
        Class<EngineActivity> clazz = EngineActivity.class;
        Intent intent = new Intent((Context)object2, clazz);
        object2 = ((Template)object).getIdTemplate();
        if (object2 == null) {
            object2 = ((Template)object).getUri_video();
            ((Template)object).setIdTemplate((String)object2);
        }
        object = ((Template)object).getIdTemplate();
        intent.putExtra("template", (String)object);
        intent.addFlags(65536);
        this.this$0.startActivity(intent);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }

    public void toMenu(Template template, View view, int n) {
        WorkUserActivity.cfr_renamed_362(this.this$0, view, template, n);
    }
}

