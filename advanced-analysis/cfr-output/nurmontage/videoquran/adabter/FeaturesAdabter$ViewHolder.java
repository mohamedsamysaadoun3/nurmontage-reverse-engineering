/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.FeaturesAdabter;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class FeaturesAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    private TextCustumFont text;
    final /* synthetic */ FeaturesAdabter this$0;

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_324(FeaturesAdabter$ViewHolder featuresAdabter$ViewHolder) {
        return featuresAdabter$ViewHolder.text;
    }

    public FeaturesAdabter$ViewHolder(FeaturesAdabter object, View view) {
        this.this$0 = object;
        super(view);
        int n = R$id.tv_feature;
        object = (TextCustumFont)view.findViewById(n);
        this.text = object;
    }
}

