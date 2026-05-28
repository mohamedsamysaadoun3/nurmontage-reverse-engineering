/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.IpadAdabter;
import hazem.nurmontage.videoquran.adabter.IpadAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.IpadItem;

class IpadAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ IpadAdabter$ViewHolder this$1;
    final /* synthetic */ IpadAdabter val$this$0;

    IpadAdabter$ViewHolder$1(IpadAdabter$ViewHolder ipadAdabter$ViewHolder, IpadAdabter ipadAdabter) {
        this.this$1 = ipadAdabter$ViewHolder;
        this.val$this$0 = ipadAdabter;
    }

    public void onClick(View object) {
        object = this.this$1.this$0;
        int n = IpadAdabter.cfr_renamed_320((IpadAdabter)((Object)object));
        Object object2 = this.this$1;
        int n2 = object2.getAdapterPosition();
        int n3 = 1;
        if (n == n2) {
            object = this.this$1.this$0;
            object2 = this.this$1;
            n2 = object2.getAdapterPosition();
            n = IpadAdabter.cfr_renamed_326((IpadAdabter)((Object)object), n2) ? 1 : 0;
            if (n != 0) {
                object = this.this$1.this$0;
                n2 = IpadAdabter.cfr_renamed_327(this.this$1.this$0) ^ n3;
                IpadAdabter.cfr_renamed_328((IpadAdabter)((Object)object), n2 != 0);
                object = this.this$1.this$0.ipadEditCallback;
                object2 = this.this$1.this$0;
                n2 = IpadAdabter.cfr_renamed_327((IpadAdabter)((Object)object2)) ? 1 : 0;
                object.onGlassType(n2 != 0);
            } else {
                return;
            }
        }
        if ((n = (int)(IpadAdabter.cfr_renamed_303((IpadAdabter)((Object)(object = this.this$1.this$0))) ? 1 : 0)) == 0 && (n = (object = this.this$1).getAdapterPosition()) > n3) {
            this.this$1.this$0.ipadEditCallback.onDialogPremium();
            return;
        }
        object = this.this$1.this$0.ipadEditCallback;
        if (object != null) {
            object = IpadAdabter.cfr_renamed_329(this.this$1.this$0);
            n2 = this.this$1.getAdapterPosition();
            object = (IpadItem)object.get(n2);
            n2 = IpadAdabter.cfr_renamed_320(this.this$1.this$0);
            this.this$1.this$0.notifyItemChanged(n2);
            object2 = this.this$1.this$0;
            IpadAdabter$ViewHolder ipadAdabter$ViewHolder = this.this$1;
            n3 = ipadAdabter$ViewHolder.getAdapterPosition();
            IpadAdabter.cfr_renamed_321((IpadAdabter)((Object)object2), n3);
            object2 = this.this$1.this$0;
            n = object.getIpadType().ordinal();
            IpadAdabter.cfr_renamed_330((IpadAdabter)((Object)object2), n);
            object = this.this$1.this$0;
            n2 = IpadAdabter.cfr_renamed_320(this.this$1.this$0);
            object.notifyItemChanged(n2);
            object = this.this$1.this$0.ipadEditCallback;
            object2 = this.this$1.this$0;
            n2 = IpadAdabter.cfr_renamed_331((IpadAdabter)((Object)object2));
            object.onChangeType(n2);
        }
    }
}

