// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ISearchQuranCallback;

class QuranSearchActivity$4 implements SearchQuranAdabters$ISearchQuranCallback
{
    final /* synthetic */ QuranSearchActivity this$0;
    
    QuranSearchActivity$4(final QuranSearchActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final int n, int n2, final ItemQuranSearch itemQuranSearch) {
        QuranSearchActivity.-$$Nest$fputindexSurah(this.this$0, itemQuranSearch.getSurahIndex());
        if (!QuranSearchActivity.-$$Nest$fgetisFullSurah(this.this$0)) {
            final QuranSearchActivity this$0 = this.this$0;
            n2 = itemQuranSearch.getTo() - 1;
            QuranSearchActivity.-$$Nest$fputmTo(this$0, n2);
            QuranSearchActivity.-$$Nest$fputmFrom(this$0, n2);
            QuranSearchActivity.-$$Nest$fgetbtnDone(this.this$0).performClick();
            return;
        }
        QuranSearchActivity.-$$Nest$fputmFrom(this.this$0, n);
        QuranSearchActivity.-$$Nest$fputmTo(this.this$0, n2);
        if (QuranSearchActivity.-$$Nest$fgetbtnDone(this.this$0).getVisibility() != 0) {
            QuranSearchActivity.-$$Nest$fgetbtnDone(this.this$0).setVisibility(0);
        }
        QuranSearchActivity.-$$Nest$fgetbtnDone(this.this$0).setText((CharSequence)this.this$0.getResources().getString(R$string.from_to, new Object[] { n + 1, n2 + 1 }));
    }
}
