/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.QuranSearchActivity;
import hazem.nurmontage.videoquran.QuranSearchActivity$3;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;

class QuranSearchActivity$3$2
implements Runnable {
    final /* synthetic */ QuranSearchActivity$3 this$1;
    final /* synthetic */ String[] val$strArrSplit;
    final /* synthetic */ int val$surah;
    final /* synthetic */ int val$to;

    QuranSearchActivity$3$2(QuranSearchActivity$3 quranSearchActivity$3, String[] stringArray, int n, int n2) {
        this.this$1 = quranSearchActivity$3;
        this.val$strArrSplit = stringArray;
        this.val$to = n;
        this.val$surah = n2;
    }

    public void run() {
        Object object = QuranSearchActivity.cfr_renamed_535(this.this$1.this$0);
        if (object != null) {
            ItemQuranSearch itemQuranSearch;
            object = this.val$strArrSplit;
            int n = 2;
            String string2 = object[n];
            object = QuranSearchActivity.cfr_renamed_535(this.this$1.this$0);
            Object object2 = QuranSearchActivity.cfr_renamed_536(this.this$1.this$0);
            int n2 = QuranSearchActivity.cfr_renamed_537(this.this$1.this$0);
            String string3 = object2[n2];
            int n3 = this.val$to;
            int n4 = this.val$surah;
            int n5 = -1;
            int n6 = -1;
            object2 = itemQuranSearch;
            itemQuranSearch = new ItemQuranSearch(string2, string3, n3, n4, n5, n6);
            object.add(itemQuranSearch);
            object = this.this$1.this$0;
            QuranSearchActivity.cfr_renamed_538((QuranSearchActivity)((Object)object));
        }
    }
}

