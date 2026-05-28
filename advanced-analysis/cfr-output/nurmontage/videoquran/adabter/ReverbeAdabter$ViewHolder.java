/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class ReverbeAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    private ImageView iv_btn_play;
    private TextCustumFont text;
    final /* synthetic */ ReverbeAdabter this$0;

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_335(ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder) {
        return reverbeAdabter$ViewHolder.iv_btn_play;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_324(ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder) {
        return reverbeAdabter$ViewHolder.text;
    }

    public ReverbeAdabter$ViewHolder(ReverbeAdabter reverbeAdabter, View view) {
        Object object;
        this.this$0 = reverbeAdabter;
        super(view);
        int n = R$id.word_aya;
        this.text = object = (TextCustumFont)view.findViewById(n);
        n = R$id.iv_btn_play;
        object = (ImageView)view.findViewById(n);
        this.iv_btn_play = object;
        super(this, reverbeAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

