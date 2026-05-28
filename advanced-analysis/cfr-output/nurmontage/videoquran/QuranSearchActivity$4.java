/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.QuranSearchActivity;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ISearchQuranCallback;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;

class QuranSearchActivity$4
implements SearchQuranAdabters$ISearchQuranCallback {
    final /* synthetic */ QuranSearchActivity this$0;

    QuranSearchActivity$4(QuranSearchActivity quranSearchActivity) {
        this.this$0 = quranSearchActivity;
    }

    public void onClick(int n, int n2, ItemQuranSearch object) {
        QuranSearchActivity quranSearchActivity = this.this$0;
        int n3 = object.getSurahIndex();
        QuranSearchActivity.cfr_renamed_513(quranSearchActivity, n3);
        quranSearchActivity = this.this$0;
        int n4 = QuranSearchActivity.cfr_renamed_514(quranSearchActivity);
        if (n4 == 0) {
            QuranSearchActivity quranSearchActivity2 = this.this$0;
            n2 = object.getTo() + -1;
            QuranSearchActivity.cfr_renamed_515(quranSearchActivity2, n2);
            QuranSearchActivity.cfr_renamed_516(quranSearchActivity2, n2);
            QuranSearchActivity.cfr_renamed_517(this.this$0).performClick();
            return;
        }
        QuranSearchActivity.cfr_renamed_516(this.this$0, n);
        QuranSearchActivity.cfr_renamed_515(this.this$0, n2);
        object = QuranSearchActivity.cfr_renamed_517(this.this$0);
        int n5 = object.getVisibility();
        if (n5 != 0) {
            object = QuranSearchActivity.cfr_renamed_517(this.this$0);
            n4 = 0;
            quranSearchActivity = null;
            object.setVisibility(0);
        }
        object = this.this$0.getResources();
        n4 = R$string.from_to;
        Object object2 = Integer.valueOf(n + 1);
        Integer n6 = n2 + 1;
        object2 = new Object[]{object2, n6};
        object2 = object.getString(n4, object2);
        QuranSearchActivity.cfr_renamed_517(this.this$0).setText((CharSequence)object2);
    }
}

