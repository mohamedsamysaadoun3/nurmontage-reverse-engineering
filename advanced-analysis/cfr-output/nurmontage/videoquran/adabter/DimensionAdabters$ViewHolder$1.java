/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$ViewHolder;
import hazem.nurmontage.videoquran.model.ItemDimension;

class DimensionAdabters$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ DimensionAdabters$ViewHolder this$1;
    final /* synthetic */ DimensionAdabters val$this$0;

    DimensionAdabters$ViewHolder$1(DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder, DimensionAdabters dimensionAdabters) {
        this.this$1 = dimensionAdabters$ViewHolder;
        this.val$this$0 = dimensionAdabters;
    }

    public void onClick(View object) {
        object = DimensionAdabters.cfr_renamed_308(this.this$1.this$0);
        if (object != null) {
            int n = DimensionAdabters.cfr_renamed_309(this.this$1.this$0);
            Object object2 = this.this$1.this$0;
            int n2 = this.this$1.getAdapterPosition();
            DimensionAdabters.cfr_renamed_310((DimensionAdabters)((Object)object2), n2);
            this.this$1.this$0.notifyItemChanged(n);
            object = this.this$1.this$0;
            int n3 = DimensionAdabters.cfr_renamed_309(this.this$1.this$0);
            object.notifyItemChanged(n3);
            object = DimensionAdabters.cfr_renamed_311(this.this$1.this$0);
            n3 = this.this$1.getAdapterPosition();
            object = (ItemDimension)object.get(n3);
            DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback = DimensionAdabters.cfr_renamed_308(this.this$1.this$0);
            int n4 = ((ItemDimension)object).getW();
            int n5 = ((ItemDimension)object).getH();
            object2 = ((ItemDimension)object).getResizeType();
            int n6 = ((Enum)object2).ordinal();
            String string2 = ((ItemDimension)object).getId();
            int n7 = ((ItemDimension)object).getImage();
            dimensionAdabters$IDimensionCallback.onCustumSize(n4, n5, n6, string2, n7);
        }
    }
}

