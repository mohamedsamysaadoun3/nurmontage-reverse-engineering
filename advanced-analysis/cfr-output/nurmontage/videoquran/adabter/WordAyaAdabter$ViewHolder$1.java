/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.WordModel;

class WordAyaAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ WordAyaAdabter$ViewHolder this$1;
    final /* synthetic */ WordAyaAdabter val$this$0;

    WordAyaAdabter$ViewHolder$1(WordAyaAdabter$ViewHolder wordAyaAdabter$ViewHolder, WordAyaAdabter wordAyaAdabter) {
        this.this$1 = wordAyaAdabter$ViewHolder;
        this.val$this$0 = wordAyaAdabter;
    }

    public void onClick(View object) {
        object = WordAyaAdabter.cfr_renamed_307(this.this$1.this$0);
        int n = this.this$1.getAdapterPosition();
        object = (WordModel)object.get(n);
        n = ((WordModel)object).isSelected() ^ 1;
        ((WordModel)object).setSelected(n != 0);
        object = this.this$1.this$0;
        WordAyaAdabter$ViewHolder wordAyaAdabter$ViewHolder = this.this$1;
        n = wordAyaAdabter$ViewHolder.getAdapterPosition();
        object.notifyItemChanged(n);
        object = WordAyaAdabter.cfr_renamed_334(this.this$1.this$0);
        if (object != null) {
            object = WordAyaAdabter.cfr_renamed_334(this.this$1.this$0);
            object.onClick();
        }
    }
}

