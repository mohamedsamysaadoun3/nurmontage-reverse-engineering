/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.FullscreenActivity;
import hazem.nurmontage.videoquran.SeettingActivity;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.WorkUserActivity;
import java.util.Map;

class FullscreenActivity$1
implements Runnable {
    final /* synthetic */ FullscreenActivity this$0;
    final /* synthetic */ Map val$all;

    FullscreenActivity$1(FullscreenActivity fullscreenActivity, Map map) {
        this.this$0 = fullscreenActivity;
        this.val$all = map;
    }

    public void run() {
        boolean bl;
        Class clazz;
        Object object;
        Object object2 = this.this$0.getIntent();
        if (object2 != null) {
            object2 = this.this$0.getIntent();
            object = "from_setting";
            clazz = null;
            bl = object2.getBooleanExtra(object, false);
            if (bl) {
                object = this.this$0;
                object2 = new Intent((Context)object, SeettingActivity.class);
                this.this$0.startActivity((Intent)object2);
                this.this$0.finish();
                return;
            }
        }
        object2 = this.this$0;
        object = "template_tmp";
        if ((object2 = LocalPersistence.readObjectFromFile((Context)object2, object)) == null && (object2 = this.val$all) != null && !(bl = object2.isEmpty())) {
            object = this.this$0;
            clazz = WorkUserActivity.class;
            object2 = new Intent((Context)object, clazz);
        } else {
            object = this.this$0;
            clazz = EngineActivity.class;
            object2 = new Intent((Context)object, clazz);
        }
        this.this$0.startActivity((Intent)object2);
        this.this$0.finish();
    }
}

