// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

class SearchQuranAdabters$ViewHolder extends RecyclerView$ViewHolder
{
    TextView aya;
    TextView name;
    final /* synthetic */ SearchQuranAdabters this$0;
    
    public SearchQuranAdabters$ViewHolder(final SearchQuranAdabters this$0, final View view) {
        this.this$0 = this$0;
        super(view);
        this.name = (TextView)view.findViewById(R$id.tv_surah_name_and_number);
        this.aya = (TextView)view.findViewById(R$id.tv_surah);
        view.setOnClickListener((View$OnClickListener)new SearchQuranAdabters$ViewHolder$$ExternalSyntheticLambda0(this));
    }
}
