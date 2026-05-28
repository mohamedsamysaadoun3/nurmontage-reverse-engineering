/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$ViewHolder;

class ColorBgAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ ColorBgAdabter$ViewHolder this$1;
    final /* synthetic */ ColorBgAdabter val$this$0;

    ColorBgAdabter$ViewHolder$1(ColorBgAdabter$ViewHolder colorBgAdabter$ViewHolder, ColorBgAdabter colorBgAdabter) {
        this.this$1 = colorBgAdabter$ViewHolder;
        this.val$this$0 = colorBgAdabter;
    }

    public void onClick(View object) {
        Object object2;
        Object object3;
        int n;
        object = this.this$1.this$0.iColorCallback;
        if (object != null && (n = ColorBgAdabter.cfr_renamed_320((ColorBgAdabter)((Object)(object = this.this$1.this$0)))) != (object3 = (object2 = this.this$1).getAdapterPosition()) && (n = (int)(ColorBgAdabter.cfr_renamed_319((ColorBgAdabter)((Object)(object = this.this$1.this$0))) ? 1 : 0)) != 0) {
            n = ColorBgAdabter.cfr_renamed_320(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n2 = this.this$1.getAdapterPosition();
            ColorBgAdabter.cfr_renamed_321((ColorBgAdabter)((Object)object2), n2);
            this.this$1.this$0.notifyItemChanged(n);
            object = this.this$1.this$0;
            object3 = ColorBgAdabter.cfr_renamed_320(this.this$1.this$0);
            object.notifyItemChanged(object3);
            object = this.this$1.this$0.iColorCallback;
            object2 = ColorBgAdabter.cfr_renamed_318(this.this$1.this$0);
            n2 = this.this$1.getAdapterPosition();
            object3 = (Object)object2[n2];
            ColorBgAdabter$ViewHolder colorBgAdabter$ViewHolder = this.this$1;
            n2 = colorBgAdabter$ViewHolder.getAdapterPosition();
            object.onColor((int)object3, n2);
        }
    }
}

