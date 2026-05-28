// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.model.WordModel;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class WordAyaAdabter extends RecyclerView$Adapter
{
    private WordAyaAdabter$IWordAya iWordAya;
    private List list;
    
    public WordAyaAdabter(final WordAyaAdabter$IWordAya iWordAya, final List list) {
        this.list = list;
        this.iWordAya = iWordAya;
    }
    
    public WordAyaAdabter(final List list) {
        this.list = list;
    }
    
    public int getItemCount() {
        final List list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
    
    public List getList() {
        return this.list;
    }
    
    public void onBindViewHolder(final WordAyaAdabter$ViewHolder wordAyaAdabter$ViewHolder, int selected) {
        final WordModel wordModel = this.list.get(selected);
        WordAyaAdabter$ViewHolder.-$$Nest$fgettext(wordAyaAdabter$ViewHolder).setText((CharSequence)wordModel.getW());
        selected = (wordModel.isSelected() ? 1 : 0);
        if (selected != 0) {
            WordAyaAdabter$ViewHolder.-$$Nest$fgettext(wordAyaAdabter$ViewHolder).setBackgroundResource(R$drawable.round_btn_quran_select);
            final TextCustumFont -$$Nest$fgettext = WordAyaAdabter$ViewHolder.-$$Nest$fgettext(wordAyaAdabter$ViewHolder);
            selected = -12434878;
            -$$Nest$fgettext.setTextColor(selected);
        }
        else {
            WordAyaAdabter$ViewHolder.-$$Nest$fgettext(wordAyaAdabter$ViewHolder).setBackgroundResource(R$drawable.round_btn_in_dark);
            final TextCustumFont -$$Nest$fgettext2 = WordAyaAdabter$ViewHolder.-$$Nest$fgettext(wordAyaAdabter$ViewHolder);
            selected = -1;
            -$$Nest$fgettext2.setTextColor(selected);
        }
    }
    
    public WordAyaAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new WordAyaAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_word_aya, viewGroup, false));
    }
    
    public void setList(final List list) {
        this.list = list;
        this.notifyDataSetChanged();
    }
}
