/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import java.util.List;

class SearchQuranAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    TextView aya;
    TextView name;
    final /* synthetic */ SearchQuranAdabters this$0;

    public SearchQuranAdabters$ViewHolder(SearchQuranAdabters object, View view) {
        this.this$0 = object;
        super(view);
        int n = R$id.tv_surah_name_and_number;
        object = (TextView)view.findViewById(n);
        this.name = object;
        n = R$id.tv_surah;
        object = (TextView)view.findViewById(n);
        this.aya = object;
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
    }

    /* synthetic */ void cfr_renamed_317(View object) {
        Object object2;
        int n;
        int n2 = this.getBindingAdapterPosition();
        if (n2 == (n = -1)) {
            return;
        }
        SearchQuranAdabters searchQuranAdabters = this.this$0;
        int n3 = SearchQuranAdabters.cfr_renamed_336(searchQuranAdabters);
        if (n3 == n) {
            SearchQuranAdabters.cfr_renamed_337(this.this$0, n2);
            object2 = this.this$0;
            SearchQuranAdabters.cfr_renamed_338(object2, n2);
        } else {
            object2 = this.this$0;
            n = SearchQuranAdabters.cfr_renamed_336(object2);
            if (n2 < n) {
                object2 = this.this$0;
                SearchQuranAdabters.cfr_renamed_337(object2, n2);
            } else {
                object2 = this.this$0;
                n = SearchQuranAdabters.cfr_renamed_339(object2);
                if (n2 > n) {
                    object2 = this.this$0;
                    SearchQuranAdabters.cfr_renamed_338(object2, n2);
                } else {
                    SearchQuranAdabters.cfr_renamed_337(this.this$0, n2);
                    object2 = this.this$0;
                    SearchQuranAdabters.cfr_renamed_338(object2, n2);
                }
            }
        }
        this.this$0.notifyDataSetChanged();
        object2 = SearchQuranAdabters.cfr_renamed_340(this.this$0);
        if (object2 != null) {
            object2 = SearchQuranAdabters.cfr_renamed_340(this.this$0);
            searchQuranAdabters = this.this$0;
            n3 = SearchQuranAdabters.cfr_renamed_336(searchQuranAdabters);
            SearchQuranAdabters searchQuranAdabters2 = this.this$0;
            int n4 = SearchQuranAdabters.cfr_renamed_339(searchQuranAdabters2);
            List list = SearchQuranAdabters.cfr_renamed_341(this.this$0);
            object = (ItemQuranSearch)list.get(n2);
            object2.onClick(n3, n4, (ItemQuranSearch)object);
        }
    }
}

