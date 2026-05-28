/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.graphics.Typeface;
import android.view.View;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters$ViewHolder;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;

class FontTextAdabters$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ FontTextAdabters$ViewHolder this$1;
    final /* synthetic */ FontTextAdabters val$this$0;

    FontTextAdabters$ViewHolder$1(FontTextAdabters$ViewHolder fontTextAdabters$ViewHolder, FontTextAdabters fontTextAdabters) {
        this.this$1 = fontTextAdabters$ViewHolder;
        this.val$this$0 = fontTextAdabters;
    }

    public void onClick(View object) {
        Object object2;
        int n;
        int n2;
        object = FontTextAdabters.cfr_renamed_156(this.this$1.this$0);
        if (object != null && (n2 = FontTextAdabters.cfr_renamed_309((FontTextAdabters)((Object)(object = this.this$1.this$0)))) != (n = (object2 = this.this$1).getAdapterPosition())) {
            n2 = FontTextAdabters.cfr_renamed_309(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n3 = this.this$1.getAdapterPosition();
            FontTextAdabters.cfr_renamed_310((FontTextAdabters)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n2);
            object = this.this$1.this$0;
            n = FontTextAdabters.cfr_renamed_309(this.this$1.this$0);
            object.notifyItemChanged(n);
            object = FontTextAdabters.cfr_renamed_347(this.this$1.this$0);
            n = FontTextAdabters.cfr_renamed_309(this.this$1.this$0);
            object = (String)object.get(n);
            object2 = FontTextAdabters.cfr_renamed_348(this.this$1.this$0).getFullName((String)object);
            FontFragment$IFontCallback fontFragment$IFontCallback = FontTextAdabters.cfr_renamed_156(this.this$1.this$0);
            FontProvider fontProvider = FontTextAdabters.cfr_renamed_348(this.this$1.this$0);
            object = fontProvider.getTypeface((String)object);
            fontFragment$IFontCallback.onAdd((String)object2, (Typeface)object);
        }
    }
}

