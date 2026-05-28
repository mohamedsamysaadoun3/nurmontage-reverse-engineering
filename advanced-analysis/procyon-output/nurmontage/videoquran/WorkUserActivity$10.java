// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.content.Context;
import android.content.Intent;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;

class WorkUserActivity$10 implements WorkUserAdabter$IWorkUserCallback
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$10(final WorkUserActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final Template template) {
        final Intent intent = new Intent((Context)this.this$0, (Class)EngineActivity.class);
        if (template.getIdTemplate() == null) {
            template.setIdTemplate(template.getUri_video());
        }
        intent.putExtra("template", template.getIdTemplate());
        intent.addFlags(65536);
        this.this$0.startActivity(intent);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
    
    public void toMenu(final Template template, final View view, final int n) {
        WorkUserActivity.-$$Nest$mshowPopup(this.this$0, view, template, n);
    }
}
