/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;

class EngineActivity$71
implements ActivityResultCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$71(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onActivityResult(ActivityResult object) {
        Object object2 = this.this$0;
        String string2 = null;
        EngineActivity.cfr_renamed_117(object2, false);
        int bl = object.getResultCode();
        int bl2 = -1;
        if (bl == bl2 && (object = object.getData()) != null) {
            object2 = object.getStringExtra("reader");
            string2 = "isBg";
            boolean bl3 = true;
            boolean bl4 = object.getBooleanExtra(string2, bl3);
            TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            String string3 = "clrBg";
            int n = -16777216;
            int n2 = object.getIntExtra(string3, n);
            translationQuranEntity.setClrBg(n2);
            translationQuranEntity.setTxt((String)object2);
            translationQuranEntity.setHaveBg(bl4);
            object = EngineActivity.cfr_renamed_64(this.this$0);
            object.invalidate();
        }
    }
}

