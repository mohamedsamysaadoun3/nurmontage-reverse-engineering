/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$IWordAya;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.List;

public class WordAyaAdabter
extends RecyclerView.Adapter {
    private WordAyaAdabter$IWordAya iWordAya;
    private List list;

    static /* bridge */ /* synthetic */ WordAyaAdabter$IWordAya cfr_renamed_334(WordAyaAdabter wordAyaAdabter) {
        return wordAyaAdabter.iWordAya;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_307(WordAyaAdabter wordAyaAdabter) {
        return wordAyaAdabter.list;
    }

    public WordAyaAdabter(WordAyaAdabter$IWordAya wordAyaAdabter$IWordAya, List list) {
        this.list = list;
        this.iWordAya = wordAyaAdabter$IWordAya;
    }

    public WordAyaAdabter(List list) {
        this.list = list;
    }

    public int getItemCount() {
        List list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List getList() {
        return this.list;
    }

    public void onBindViewHolder(WordAyaAdabter$ViewHolder object, int n) {
        Object object2 = (WordModel)this.list.get(n);
        TextCustumFont textCustumFont = WordAyaAdabter$ViewHolder.cfr_renamed_324(object);
        String string2 = object2.getW();
        textCustumFont.setText(string2);
        n = object2.isSelected() ? 1 : 0;
        if (n != 0) {
            object2 = WordAyaAdabter$ViewHolder.cfr_renamed_324(object);
            int n2 = R$drawable.round_btn_quran_select;
            object2.setBackgroundResource(n2);
            object = WordAyaAdabter$ViewHolder.cfr_renamed_324(object);
            n = -12434878;
            object.setTextColor(n);
        } else {
            object2 = WordAyaAdabter$ViewHolder.cfr_renamed_324(object);
            int n3 = R$drawable.round_btn_in_dark;
            object2.setBackgroundResource(n3);
            object = WordAyaAdabter$ViewHolder.cfr_renamed_324(object);
            n = -1;
            object.setTextColor(n);
        }
    }

    public WordAyaAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_word_aya;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new WordAyaAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void setList(List list) {
        this.list = list;
        this.notifyDataSetChanged();
    }
}

