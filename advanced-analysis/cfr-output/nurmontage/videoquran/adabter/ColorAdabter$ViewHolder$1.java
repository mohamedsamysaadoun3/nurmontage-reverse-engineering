/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$ViewHolder;

class ColorAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ ColorAdabter$ViewHolder this$1;
    final /* synthetic */ ColorAdabter val$this$0;

    ColorAdabter$ViewHolder$1(ColorAdabter$ViewHolder colorAdabter$ViewHolder, ColorAdabter colorAdabter) {
        this.this$1 = colorAdabter$ViewHolder;
        this.val$this$0 = colorAdabter;
    }

    public void onClick(View object) {
        Object object2;
        Object object3;
        int n;
        object = this.this$1.this$0.iColorCallback;
        if (object != null && (n = ColorAdabter.cfr_renamed_320((ColorAdabter)((Object)(object = this.this$1.this$0)))) != (object3 = (object2 = this.this$1).getAdapterPosition()) && (n = (int)(ColorAdabter.cfr_renamed_319((ColorAdabter)((Object)(object = this.this$1.this$0))) ? 1 : 0)) != 0) {
            n = ColorAdabter.cfr_renamed_320(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n2 = this.this$1.getAdapterPosition();
            ColorAdabter.cfr_renamed_321((ColorAdabter)((Object)object2), n2);
            this.this$1.this$0.notifyItemChanged(n);
            object = this.this$1.this$0;
            object3 = ColorAdabter.cfr_renamed_320(this.this$1.this$0);
            object.notifyItemChanged(object3);
            object = this.this$1.this$0.iColorCallback;
            object2 = ColorAdabter.cfr_renamed_318(this.this$1.this$0);
            n2 = this.this$1.getAdapterPosition();
            object3 = (Object)object2[n2];
            ColorAdabter$ViewHolder colorAdabter$ViewHolder = this.this$1;
            n2 = colorAdabter$ViewHolder.getAdapterPosition();
            object.onColor((int)object3, n2);
        }
    }
}

