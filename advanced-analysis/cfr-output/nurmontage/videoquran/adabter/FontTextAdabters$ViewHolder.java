/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class FontTextAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    TextCustumFont nameFont;
    final /* synthetic */ FontTextAdabters this$0;
    TextCustumFont tvNumber;

    public FontTextAdabters$ViewHolder(FontTextAdabters fontTextAdabters, View object) {
        Object object2;
        this.this$0 = fontTextAdabters;
        super(object);
        int n = R$id.tv_font;
        this.nameFont = object2 = (TextCustumFont)object.findViewById(n);
        n = R$id.tv_number;
        object = (TextCustumFont)object.findViewById(n);
        this.tvNumber = object;
        object = this.nameFont;
        super(this, fontTextAdabters);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

