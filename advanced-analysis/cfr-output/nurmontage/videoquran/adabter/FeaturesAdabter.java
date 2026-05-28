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
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.FeaturesAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import java.util.List;

public class FeaturesAdabter
extends RecyclerView.Adapter {
    private boolean isSubscibe;
    private List list;

    public FeaturesAdabter(List list) {
        this.list = list;
    }

    public int getItemCount() {
        List list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void onBindViewHolder(FeaturesAdabter$ViewHolder object, int n) {
        Object object2 = (ModelFeatures)this.list.get(n);
        object = FeaturesAdabter$ViewHolder.cfr_renamed_324(object);
        object2 = ((ModelFeatures)object2).getName();
        object.setText((CharSequence)object2);
    }

    public FeaturesAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_feature;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new FeaturesAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void setSubscribe(boolean bl) {
        this.isSubscibe = bl;
        this.notifyDataSetChanged();
    }
}

