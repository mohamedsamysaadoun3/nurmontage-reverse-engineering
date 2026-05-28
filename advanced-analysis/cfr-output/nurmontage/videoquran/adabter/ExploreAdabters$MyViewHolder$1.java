/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.ExploreItem;
import java.io.File;

class ExploreAdabters$MyViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ ExploreAdabters$MyViewHolder this$1;
    final /* synthetic */ ExploreAdabters val$this$0;

    ExploreAdabters$MyViewHolder$1(ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder, ExploreAdabters exploreAdabters) {
        this.this$1 = exploreAdabters$MyViewHolder;
        this.val$this$0 = exploreAdabters;
    }

    public void onClick(View object) {
        object = ExploreAdabters.cfr_renamed_342(this.this$1.this$0);
        if (object != null) {
            object = ExploreAdabters.cfr_renamed_343(this.this$1.this$0);
            int n = this.this$1.getAdapterPosition();
            object = (ExploreItem)object.get(n);
            ExploreAdabters$IExplore exploreAdabters$IExplore = ExploreAdabters.cfr_renamed_342(this.this$1.this$0);
            File file = ((ExploreItem)object).getFolder();
            String string2 = ((ExploreItem)object).getName();
            object = ((ExploreItem)object).getPath();
            exploreAdabters$IExplore.folder(file, string2, (String)object);
        }
    }
}

