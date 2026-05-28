// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.fragment.audio_effect.Reverbe;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ReverbeAdabter extends RecyclerView$Adapter
{
    private final ReverbeAdabter$IReverbPresetCallback iReverbCallback;
    private List list;
    private int select;
    
    public ReverbeAdabter(final List list, final ReverbeAdabter$IReverbPresetCallback iReverbCallback, final int select) {
        this.list = list;
        this.select = select;
        this.iReverbCallback = iReverbCallback;
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
    
    public void onBindViewHolder(final ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder, int n) {
        ReverbeAdabter$ViewHolder.-$$Nest$fgettext(reverbeAdabter$ViewHolder).setText((CharSequence)this.list.get(n).getName());
        if (this.select == n) {
            reverbeAdabter$ViewHolder.itemView.setBackgroundResource(R$drawable.item_reverb_select);
            final ImageView -$$Nest$fgetiv_btn_play = ReverbeAdabter$ViewHolder.-$$Nest$fgetiv_btn_play(reverbeAdabter$ViewHolder);
            n = R$drawable.pause_24px;
            -$$Nest$fgetiv_btn_play.setImageResource(n);
        }
        else {
            reverbeAdabter$ViewHolder.itemView.setBackgroundResource(R$drawable.round_btn_in_dark);
            final ImageView -$$Nest$fgetiv_btn_play2 = ReverbeAdabter$ViewHolder.-$$Nest$fgetiv_btn_play(reverbeAdabter$ViewHolder);
            n = R$drawable.play_arrow_24px;
            -$$Nest$fgetiv_btn_play2.setImageResource(n);
        }
    }
    
    public ReverbeAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ReverbeAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_reverbe, viewGroup, false));
    }
}
