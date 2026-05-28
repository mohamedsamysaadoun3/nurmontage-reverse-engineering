/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.YoutuberModel;

class YoutuberAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ YoutuberAdabter$ViewHolder this$1;
    final /* synthetic */ YoutuberAdabter val$this$0;

    YoutuberAdabter$ViewHolder$1(YoutuberAdabter$ViewHolder youtuberAdabter$ViewHolder, YoutuberAdabter youtuberAdabter) {
        this.this$1 = youtuberAdabter$ViewHolder;
        this.val$this$0 = youtuberAdabter;
    }

    public void onClick(View object) {
        object = YoutuberAdabter.cfr_renamed_344(this.this$1.this$0);
        if (object != null) {
            object = YoutuberAdabter.cfr_renamed_344(this.this$1.this$0);
            Object object2 = YoutuberAdabter.cfr_renamed_316(this.this$1.this$0);
            YoutuberAdabter$ViewHolder youtuberAdabter$ViewHolder = this.this$1;
            int n = youtuberAdabter$ViewHolder.getAdapterPosition();
            object2 = ((YoutuberModel)object2.get(n)).getLnk();
            object.onClick((String)object2);
        }
    }
}

