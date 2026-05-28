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
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$ViewHolder$1;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class WordAyaAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    private TextCustumFont text;
    final /* synthetic */ WordAyaAdabter this$0;

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_324(WordAyaAdabter$ViewHolder wordAyaAdabter$ViewHolder) {
        return wordAyaAdabter$ViewHolder.text;
    }

    public WordAyaAdabter$ViewHolder(WordAyaAdabter wordAyaAdabter, View object) {
        this.this$0 = wordAyaAdabter;
        super(object);
        int n = R$id.word_aya;
        object = (TextCustumFont)object.findViewById(n);
        this.text = object;
        WordAyaAdabter$ViewHolder$1 wordAyaAdabter$ViewHolder$1 = new WordAyaAdabter$ViewHolder$1(this, wordAyaAdabter);
        object.setOnClickListener((View.OnClickListener)wordAyaAdabter$ViewHolder$1);
    }
}

