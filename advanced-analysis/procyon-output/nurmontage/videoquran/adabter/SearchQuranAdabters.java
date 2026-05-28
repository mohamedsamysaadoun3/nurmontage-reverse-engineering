// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import java.util.Collection;
import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class SearchQuranAdabters extends RecyclerView$Adapter
{
    private final SearchQuranAdabters$ISearchQuranCallback callback;
    private int maxSelected;
    private int minSelected;
    private final List searchList;
    
    public SearchQuranAdabters(final SearchQuranAdabters$ISearchQuranCallback callback) {
        this.searchList = new ArrayList();
        final int n = -1;
        this.minSelected = n;
        this.maxSelected = n;
        this.callback = callback;
    }
    
    public void add(final ItemQuranSearch itemQuranSearch) {
        this.searchList.add(itemQuranSearch);
        this.notifyItemInserted(this.searchList.size() - 1);
    }
    
    public void clear() {
        final int size = this.searchList.size();
        if (size == 0) {
            return;
        }
        this.searchList.clear();
        this.notifyItemRangeRemoved(0, size);
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
    
    public void onBindViewHolder(final SearchQuranAdabters$ViewHolder searchQuranAdabters$ViewHolder, int n) {
        final ItemQuranSearch itemQuranSearch = this.searchList.get(n);
        final String aya = itemQuranSearch.getAya();
        final int n2 = -1;
        if (aya != null) {
            searchQuranAdabters$ViewHolder.name.setText((CharSequence)(itemQuranSearch.getSurahName() + " (" + itemQuranSearch.getTo() + ")"));
            if (itemQuranSearch.getStartSpannable() != n2) {
                final SpannableString text = new SpannableString((CharSequence)itemQuranSearch.getAya());
                text.setSpan((Object)new ForegroundColorSpan(-10929), itemQuranSearch.getStartSpannable(), itemQuranSearch.getEndSpannble(), 33);
                searchQuranAdabters$ViewHolder.aya.setText((CharSequence)text);
            }
            else {
                searchQuranAdabters$ViewHolder.aya.setText((CharSequence)itemQuranSearch.getAya());
            }
        }
        else {
            searchQuranAdabters$ViewHolder.name.setText((CharSequence)String.valueOf(itemQuranSearch.getSurahIndex()));
        }
        final int minSelected = this.minSelected;
        int backgroundColor = 0;
        if (minSelected != n2 && n >= minSelected && n <= this.maxSelected) {
            n = 1;
        }
        else {
            n = 0;
        }
        final View itemView = searchQuranAdabters$ViewHolder.itemView;
        if (n != 0) {
            backgroundColor = -14540254;
        }
        itemView.setBackgroundColor(backgroundColor);
    }
    
    public SearchQuranAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new SearchQuranAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_search_quran, viewGroup, false));
    }
    
    public void setList(final List list) {
        this.searchList.clear();
        this.searchList.addAll(list);
        this.notifyDataSetChanged();
    }
}
