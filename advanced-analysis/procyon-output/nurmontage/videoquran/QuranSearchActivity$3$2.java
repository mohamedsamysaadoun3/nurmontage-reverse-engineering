// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.ItemQuranSearch;

class QuranSearchActivity$3$2 implements Runnable
{
    final /* synthetic */ QuranSearchActivity$3 this$1;
    final /* synthetic */ String[] val$strArrSplit;
    final /* synthetic */ int val$surah;
    final /* synthetic */ int val$to;
    
    QuranSearchActivity$3$2(final QuranSearchActivity$3 this$1, final String[] val$strArrSplit, final int val$to, final int val$surah) {
        this.this$1 = this$1;
        this.val$strArrSplit = val$strArrSplit;
        this.val$to = val$to;
        this.val$surah = val$surah;
    }
    
    public void run() {
        if (QuranSearchActivity.-$$Nest$fgetsearchQuranAdapter(this.this$1.this$0) != null) {
            QuranSearchActivity.-$$Nest$fgetsearchQuranAdapter(this.this$1.this$0).add(new ItemQuranSearch(this.val$strArrSplit[2], QuranSearchActivity.-$$Nest$fgetsurahNames(this.this$1.this$0)[QuranSearchActivity.-$$Nest$fgetindexSurah(this.this$1.this$0)], this.val$to, this.val$surah, -1, -1));
            QuranSearchActivity.-$$Nest$mupdateCount(this.this$1.this$0);
        }
    }
}
