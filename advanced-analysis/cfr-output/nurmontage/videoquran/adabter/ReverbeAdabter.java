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
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$IReverbPresetCallback;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$ViewHolder;
import hazem.nurmontage.videoquran.fragment.audio_effect.Reverbe;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.List;

public class ReverbeAdabter
extends RecyclerView.Adapter {
    private final ReverbeAdabter$IReverbPresetCallback iReverbCallback;
    private List list;
    private int select;

    static /* bridge */ /* synthetic */ ReverbeAdabter$IReverbPresetCallback cfr_renamed_325(ReverbeAdabter reverbeAdabter) {
        return reverbeAdabter.iReverbCallback;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_307(ReverbeAdabter reverbeAdabter) {
        return reverbeAdabter.list;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_304(ReverbeAdabter reverbeAdabter) {
        return reverbeAdabter.select;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_305(ReverbeAdabter reverbeAdabter, int n) {
        reverbeAdabter.select = n;
    }

    public ReverbeAdabter(List list, ReverbeAdabter$IReverbPresetCallback reverbeAdabter$IReverbPresetCallback, int n) {
        this.list = list;
        this.select = n;
        this.iReverbCallback = reverbeAdabter$IReverbPresetCallback;
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

    public void onBindViewHolder(ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder, int n) {
        Object object = (Reverbe)this.list.get(n);
        TextCustumFont textCustumFont = ReverbeAdabter$ViewHolder.cfr_renamed_324(reverbeAdabter$ViewHolder);
        object = ((Reverbe)object).getName();
        textCustumFont.setText((CharSequence)object);
        int n2 = this.select;
        if (n2 == n) {
            View view = reverbeAdabter$ViewHolder.itemView;
            n2 = R$drawable.item_reverb_select;
            view.setBackgroundResource(n2);
            reverbeAdabter$ViewHolder = ReverbeAdabter$ViewHolder.cfr_renamed_335(reverbeAdabter$ViewHolder);
            n = R$drawable.pause_24px;
            reverbeAdabter$ViewHolder.setImageResource(n);
        } else {
            View view = reverbeAdabter$ViewHolder.itemView;
            n2 = R$drawable.round_btn_in_dark;
            view.setBackgroundResource(n2);
            reverbeAdabter$ViewHolder = ReverbeAdabter$ViewHolder.cfr_renamed_335(reverbeAdabter$ViewHolder);
            n = R$drawable.play_arrow_24px;
            reverbeAdabter$ViewHolder.setImageResource(n);
        }
    }

    public ReverbeAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_reverbe;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new ReverbeAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }
}

