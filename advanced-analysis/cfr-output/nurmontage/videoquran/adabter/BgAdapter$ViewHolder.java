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
import hazem.nurmontage.videoquran.adabter.BgAdapter;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.model.BgItem;

public class BgAdapter$ViewHolder
extends RecyclerView.ViewHolder {
    ImageView imageView;
    final /* synthetic */ BgAdapter this$0;

    public BgAdapter$ViewHolder(BgAdapter object, View view) {
        this.this$0 = object;
        super(view);
        int n = R$id.img;
        object = (ImageView)view.findViewById(n);
        this.imageView = object;
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
    }

    /* synthetic */ void cfr_renamed_357(View object) {
        Object object2;
        int n;
        int n2 = this.getAdapterPosition();
        if (n2 == (n = -1)) {
            return;
        }
        Object object3 = this.this$0;
        int n3 = BgAdapter.cfr_renamed_309(object3);
        if (n2 == n3) {
            ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback = BgAdapter.cfr_renamed_333(this.this$0);
            if (changeBgFragment$IChangeBgCallback != null) {
                changeBgFragment$IChangeBgCallback = BgAdapter.cfr_renamed_333(this.this$0);
                object3 = BgAdapter.cfr_renamed_316(this.this$0);
                object = (BgItem)object3.get(n2);
                changeBgFragment$IChangeBgCallback.onAdd((BgItem)object);
            }
            return;
        }
        object3 = this.this$0;
        n3 = BgAdapter.cfr_renamed_309(object3);
        BgAdapter.cfr_renamed_310(this.this$0, n2);
        String string2 = "alpha";
        if (n3 != n) {
            object2 = this.this$0;
            object2.notifyItemChanged(n3, (Object)string2);
        }
        object2 = this.this$0;
        n3 = BgAdapter.cfr_renamed_309((BgAdapter)((Object)object2));
        object2.notifyItemChanged(n3, (Object)string2);
        object2 = BgAdapter.cfr_renamed_333(this.this$0);
        if (object2 != null) {
            object2 = BgAdapter.cfr_renamed_333(this.this$0);
            object3 = BgAdapter.cfr_renamed_316(this.this$0);
            object = (BgItem)object3.get(n2);
            object2.onAdd((BgItem)object);
        }
    }
}

