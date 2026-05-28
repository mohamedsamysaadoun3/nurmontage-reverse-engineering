/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$ViewHolder;

class IconQuranAdabters$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ IconQuranAdabters$ViewHolder this$1;
    final /* synthetic */ IconQuranAdabters val$this$0;

    IconQuranAdabters$ViewHolder$1(IconQuranAdabters$ViewHolder iconQuranAdabters$ViewHolder, IconQuranAdabters iconQuranAdabters) {
        this.this$1 = iconQuranAdabters$ViewHolder;
        this.val$this$0 = iconQuranAdabters;
    }

    public void onClick(View object) {
        object = IconQuranAdabters.cfr_renamed_349(this.this$1.this$0);
        if (object != null) {
            Object object2;
            int n;
            object = this.this$1.this$0;
            int n2 = IconQuranAdabters.cfr_renamed_304((IconQuranAdabters)((Object)object));
            if (n2 == (n = (object2 = this.this$1).getAdapterPosition())) {
                return;
            }
            n2 = IconQuranAdabters.cfr_renamed_304(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n3 = this.this$1.getAdapterPosition();
            IconQuranAdabters.cfr_renamed_305((IconQuranAdabters)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n2);
            object = this.this$1.this$0;
            n = IconQuranAdabters.cfr_renamed_304(this.this$1.this$0);
            object.notifyItemChanged(n);
            object = IconQuranAdabters.cfr_renamed_349(this.this$1.this$0);
            object2 = IconQuranAdabters.cfr_renamed_307(this.this$1.this$0);
            IconQuranAdabters$ViewHolder iconQuranAdabters$ViewHolder = this.this$1;
            n3 = iconQuranAdabters$ViewHolder.getAdapterPosition();
            object2 = (String)object2.get(n3);
            object.onIcon((String)object2);
        }
    }
}

