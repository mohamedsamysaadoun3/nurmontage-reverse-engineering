// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.WordModel;
import android.view.View;
import android.view.View$OnClickListener;

class WordAyaAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ WordAyaAdabter$ViewHolder this$1;
    final /* synthetic */ WordAyaAdabter val$this$0;
    
    WordAyaAdabter$ViewHolder$1(final WordAyaAdabter$ViewHolder this$1, final WordAyaAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        final WordModel wordModel = WordAyaAdabter.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition());
        wordModel.setSelected(wordModel.isSelected() ^ true);
        this.this$1.this$0.notifyItemChanged(this.this$1.getAdapterPosition());
        if (WordAyaAdabter.-$$Nest$fgetiWordAya(this.this$1.this$0) != null) {
            WordAyaAdabter.-$$Nest$fgetiWordAya(this.this$1.this$0).onClick();
        }
    }
}
