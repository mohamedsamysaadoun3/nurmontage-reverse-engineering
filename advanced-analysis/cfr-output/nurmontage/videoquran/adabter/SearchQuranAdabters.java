/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ISearchQuranCallback;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ViewHolder;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import java.util.ArrayList;
import java.util.List;

public class SearchQuranAdabters
extends RecyclerView.Adapter {
    private final SearchQuranAdabters$ISearchQuranCallback callback;
    private int maxSelected;
    private int minSelected;
    private final List searchList;

    static /* bridge */ /* synthetic */ SearchQuranAdabters$ISearchQuranCallback cfr_renamed_340(SearchQuranAdabters searchQuranAdabters) {
        return searchQuranAdabters.callback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_339(SearchQuranAdabters searchQuranAdabters) {
        return searchQuranAdabters.maxSelected;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_336(SearchQuranAdabters searchQuranAdabters) {
        return searchQuranAdabters.minSelected;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_341(SearchQuranAdabters searchQuranAdabters) {
        return searchQuranAdabters.searchList;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_338(SearchQuranAdabters searchQuranAdabters, int n) {
        searchQuranAdabters.maxSelected = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_337(SearchQuranAdabters searchQuranAdabters, int n) {
        searchQuranAdabters.minSelected = n;
    }

    public SearchQuranAdabters(SearchQuranAdabters$ISearchQuranCallback searchQuranAdabters$ISearchQuranCallback) {
        int n;
        ArrayList arrayList;
        this.searchList = arrayList = new ArrayList();
        this.minSelected = n = -1;
        this.maxSelected = n;
        this.callback = searchQuranAdabters$ISearchQuranCallback;
    }

    public void add(ItemQuranSearch itemQuranSearch) {
        this.searchList.add(itemQuranSearch);
        int n = this.searchList.size() + -1;
        this.notifyItemInserted(n);
    }

    public void clear() {
        List list = this.searchList;
        int n = list.size();
        if (n == 0) {
            return;
        }
        this.searchList.clear();
        this.notifyItemRangeRemoved(0, n);
    }

    public int getItemCount() {
        return this.searchList.size();
    }

    public int getMaxSelected() {
        return this.maxSelected;
    }

    public int getMinSelected() {
        return this.minSelected;
    }

    public int getSize() {
        return this.searchList.size();
    }

    public void onBindViewHolder(SearchQuranAdabters$ViewHolder searchQuranAdabters$ViewHolder, int n) {
        int n2;
        int n3;
        Object object = (ItemQuranSearch)this.searchList.get(n);
        String string2 = ((ItemQuranSearch)object).getAya();
        int n4 = -1;
        if (string2 != null) {
            string2 = searchQuranAdabters$ViewHolder.name;
            CharSequence charSequence = new StringBuilder();
            String string3 = ((ItemQuranSearch)object).getSurahName();
            charSequence = charSequence.append(string3).append(" (");
            int n5 = ((ItemQuranSearch)object).getTo();
            charSequence = charSequence.append(n5);
            string3 = ")";
            charSequence = charSequence.append(string3).toString();
            string2.setText(charSequence);
            n3 = ((ItemQuranSearch)object).getStartSpannable();
            if (n3 != n4) {
                charSequence = ((ItemQuranSearch)object).getAya();
                string2 = new SpannableString(charSequence);
                charSequence = new ForegroundColorSpan(-10929);
                n5 = ((ItemQuranSearch)object).getStartSpannable();
                n2 = ((ItemQuranSearch)object).getEndSpannble();
                int n6 = 33;
                string2.setSpan((Object)charSequence, n5, n2, n6);
                object = searchQuranAdabters$ViewHolder.aya;
                object.setText((CharSequence)string2);
            } else {
                string2 = searchQuranAdabters$ViewHolder.aya;
                object = ((ItemQuranSearch)object).getAya();
                string2.setText((CharSequence)object);
            }
        } else {
            string2 = searchQuranAdabters$ViewHolder.name;
            n2 = ((ItemQuranSearch)object).getSurahIndex();
            object = String.valueOf(n2);
            string2.setText((CharSequence)object);
        }
        n2 = this.minSelected;
        n3 = 0;
        string2 = null;
        n = n2 != n4 && n >= n2 && n <= (n2 = this.maxSelected) ? 1 : 0;
        searchQuranAdabters$ViewHolder = searchQuranAdabters$ViewHolder.itemView;
        if (n != 0) {
            n3 = -14540254;
        }
        searchQuranAdabters$ViewHolder.setBackgroundColor(n3);
    }

    public SearchQuranAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_search_quran;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new SearchQuranAdabters$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void setList(List list) {
        this.searchList.clear();
        this.searchList.addAll(list);
        this.notifyDataSetChanged();
    }
}

