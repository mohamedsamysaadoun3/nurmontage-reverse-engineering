/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package hazem.nurmontage.videoquran;

import android.graphics.Typeface;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.model.SurahNameEntity;

class EngineActivity$94
implements FontFragment$IFontCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$94(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onAdd(String var1_1, Typeface var2_2) {
        block15: {
            try {
                var3_3 /* !! */  = this.this$0;
            }
            catch (Exception v0) {
                ** continue;
            }
            var3_3 /* !! */  = EngineActivity.cfr_renamed_64(var3_3 /* !! */ );
            var3_3 /* !! */  = var3_3 /* !! */ .getEntity_select();
            var4_4 = var3_3 /* !! */  instanceof SurahNameEntity;
            if (!var4_4) break block15;
            var3_3 /* !! */  = this.this$0;
            var3_3 /* !! */  = EngineActivity.cfr_renamed_64(var3_3 /* !! */ );
            var3_3 /* !! */  = var3_3 /* !! */ .getSurahNameEntity();
            var3_3 /* !! */ .setTypeface(var2_2, var1_1);
            var3_3 /* !! */  = this.this$0;
            var3_3 /* !! */  = EngineActivity.cfr_renamed_64(var3_3 /* !! */ );
            var3_3 /* !! */ .invalidate();
            ** GOTO lbl33
        }
        if (var1_1 == null || var2_2 == null) ** GOTO lbl33
        var3_3 /* !! */  = this.this$0;
        var3_3 /* !! */  = EngineActivity.cfr_renamed_64(var3_3 /* !! */ );
        var3_3 /* !! */ .setTypeface(var2_2, var1_1);
lbl33:
        // 3 sources

        var3_3 /* !! */  = FontFragment.instance;
        var3_3 /* !! */ .add(var2_2, var1_1);
lbl36:
        // 2 sources

    }

    /*
     * Unable to fully structure code
     */
    public void onCancel(String var1_1, Typeface var2_2) {
        block21: {
            try {
                var3_3 = this.this$0;
            }
            catch (Exception v0) {
                ** continue;
            }
            var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            var3_3 = var3_3.getEntity_select();
            var4_4 = var3_3 instanceof SurahNameEntity;
            if (var4_4 == 0) break block21;
            var3_3 = this.this$0;
            var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            var3_3 = var3_3.getSurahNameEntity();
            var3_3.setTypeface((Typeface)var2_2, (String)var1_1);
            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_64((EngineActivity)var1_1);
            var1_1.invalidate();
            var1_1 = this.this$0;
            EngineActivity.cfr_renamed_129((EngineActivity)var1_1);
            ** GOTO lbl52
        }
        if (var1_1 == null || var2_2 == null) ** GOTO lbl36
        var3_3 = this.this$0;
        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
        var3_3.setTypeface((Typeface)var2_2, (String)var1_1);
lbl36:
        // 2 sources

        var1_1 = this.this$0;
        EngineActivity.cfr_renamed_75((EngineActivity)var1_1);
        var1_1 = this.this$0;
        var1_1 = EngineActivity.cfr_renamed_73((EngineActivity)var1_1);
        var2_2 = this.this$0;
        var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
        var2_2 = var2_2.getSelectedEntity();
        var4_4 = -1082130432;
        var5_5 = -1.0f;
        var1_1.onSelectEntity((Entity)var2_2, var5_5);
lbl52:
        // 3 sources

    }

    /*
     * Unable to fully structure code
     */
    public void onDone(String var1_1, Typeface var2_2) {
        try {
            var1_1 = this.this$0;
        }
        catch (Exception v0) {
            ** continue;
        }
        EngineActivity.cfr_renamed_75((EngineActivity)var1_1);
        var1_1 = this.this$0;
        var1_1 = EngineActivity.cfr_renamed_64((EngineActivity)var1_1);
        var1_1 = var1_1.getEntity_select();
        var3_3 = var1_1 instanceof SurahNameEntity;
        if (!var3_3) ** GOTO lbl19
        var1_1 = this.this$0;
        EngineActivity.cfr_renamed_129((EngineActivity)var1_1);
        ** GOTO lbl31
lbl19:
        // 1 sources

        var1_1 = this.this$0;
        var1_1 = EngineActivity.cfr_renamed_73((EngineActivity)var1_1);
        var2_2 = this.this$0;
        var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
        var2_2 = var2_2.getSelectedEntity();
        var4_4 = -1.0f;
        var1_1.onSelectEntity((Entity)var2_2, var4_4);
lbl31:
        // 3 sources

    }
}

