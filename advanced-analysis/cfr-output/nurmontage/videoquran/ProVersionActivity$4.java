/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.Objects;

class ProVersionActivity$4
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$4(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    public void onClick(View object) {
        String string2;
        object = ProVersionActivity.cfr_renamed_92(this.this$0);
        boolean bl = Objects.equals(object, string2 = ProVersionActivity.cfr_renamed_107());
        if (!bl) {
            ProVersionActivity.cfr_renamed_83(this.this$0).setStrokeColor(-932849);
            ProVersionActivity.cfr_renamed_84(this.this$0).setStrokeColor(-13617603);
            object = ProVersionActivity.cfr_renamed_88(this.this$0);
            int n = R$drawable.checked;
            object.setImageResource(n);
            object = ProVersionActivity.cfr_renamed_95(this.this$0);
            n = -1;
            object.setTextColor(n);
            ProVersionActivity.cfr_renamed_96(this.this$0).setTextColor(n);
            object = ProVersionActivity.cfr_renamed_89(this.this$0);
            n = R$drawable.unchecked;
            object.setImageResource(n);
            object = this.this$0;
            string2 = ProVersionActivity.cfr_renamed_107();
            ProVersionActivity.cfr_renamed_99((ProVersionActivity)((Object)object), string2);
            object = ProVersionActivity.cfr_renamed_94(this.this$0);
            n = R$drawable.bg_badge_inactive;
            object.setBackgroundResource(n);
        }
    }
}

