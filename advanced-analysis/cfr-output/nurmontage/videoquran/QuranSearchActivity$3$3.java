/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.QuranSearchActivity;
import hazem.nurmontage.videoquran.QuranSearchActivity$3;

class QuranSearchActivity$3$3
implements Runnable {
    final /* synthetic */ QuranSearchActivity$3 this$1;

    QuranSearchActivity$3$3(QuranSearchActivity$3 quranSearchActivity$3) {
        this.this$1 = quranSearchActivity$3;
    }

    public void run() {
        int n;
        Object object = QuranSearchActivity.cfr_renamed_535(this.this$1.this$0);
        if (object != null && (n = (object = QuranSearchActivity.cfr_renamed_535(this.this$1.this$0)).getSize()) == 0) {
            object = this.this$1.this$0;
            QuranSearchActivity.cfr_renamed_538((QuranSearchActivity)((Object)object));
        }
        if ((object = QuranSearchActivity.cfr_renamed_556(this.this$1.this$0)) != null) {
            object = QuranSearchActivity.cfr_renamed_556(this.this$1.this$0);
            int n2 = 8;
            object.setVisibility(n2);
        }
    }
}

