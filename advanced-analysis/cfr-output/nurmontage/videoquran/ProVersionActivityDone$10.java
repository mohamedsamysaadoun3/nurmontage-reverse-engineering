/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.LinearLayoutManager
 */
package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.ProVersionActivityDone;

class ProVersionActivityDone$10
implements Runnable {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$10(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    /*
     * Unable to fully structure code
     */
    public void run() {
        block25: {
            block24: {
                var1_1 = this.this$0;
                var1_1 = ProVersionActivityDone.cfr_renamed_93(var1_1);
                if (var1_1 == null) ** GOTO lbl69
                var1_1 = this.this$0;
                var2_3 = ProVersionActivityDone.cfr_renamed_87(var1_1);
                if (var2_3 != 0) ** GOTO lbl69
                var1_1 = this.this$0;
                var1_1 = ProVersionActivityDone.cfr_renamed_93(var1_1);
                var1_1 = var1_1.getLayoutManager();
                var1_1 = (LinearLayoutManager)var1_1;
                if (var1_1 != null) break block24;
                return;
            }
            var3_4 = var1_1.findFirstVisibleItemPosition();
            var4_5 = -1;
            var5_6 = 16;
            if (var3_4 != var4_5) ** GOTO lbl35
            var1_1 = this.this$0;
            var1_1 = ProVersionActivityDone.cfr_renamed_82(var1_1);
            var1_1.postDelayed(this, var5_6);
            return;
lbl35:
            // 1 sources

            var2_3 = var1_1.getItemCount();
            var4_5 = (var2_3 /= 3) * 2;
            if (var3_4 < var4_5) break block25;
            var3_4 -= var2_3;
            var1_1 = this.this$0;
            var1_1 = ProVersionActivityDone.cfr_renamed_93(var1_1);
            var1_1.scrollToPosition(var3_4);
            ** GOTO lbl64
        }
        if (var3_4 >= var2_3) ** GOTO lbl57
        var3_4 += var2_3;
        var1_1 = this.this$0;
        var1_1 = ProVersionActivityDone.cfr_renamed_93(var1_1);
        var1_1.scrollToPosition(var3_4);
        ** GOTO lbl64
lbl57:
        // 1 sources

        var1_1 = this.this$0;
        var1_1 = ProVersionActivityDone.cfr_renamed_93(var1_1);
        var3_4 = 0;
        var4_5 = 2;
        var1_1.scrollBy(var4_5, 0);
lbl64:
        // 3 sources

        var1_1 = this.this$0;
        var1_1 = ProVersionActivityDone.cfr_renamed_82(var1_1);
        try {
            block26: {
                break block26;
lbl69:
                // 2 sources

                return;
            }
            var1_1.postDelayed(this, var5_6);
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

