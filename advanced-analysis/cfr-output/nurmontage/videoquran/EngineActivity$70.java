/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Layout$Alignment
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultCallback
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.text.Layout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.model.SurahNameEntity;

class EngineActivity$70
implements ActivityResultCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$70(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onActivityResult(ActivityResult object) {
        Object object2 = this.this$0;
        int n = 0;
        EngineActivity.cfr_renamed_117(object2, false);
        int bl = object.getResultCode();
        int bl2 = -1;
        if (bl == bl2 && (object = object.getData()) != null) {
            int n2;
            object2 = object.getStringExtra("reader");
            String string2 = "isBg";
            boolean bl3 = object.getBooleanExtra(string2, false);
            n = object.getIntExtra("style", 0);
            Object object3 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
            int n3 = ((SurahNameEntity)object3).getIndex_surah();
            if (n3 == 0) {
                object3 = "index";
                n2 = 1;
                n3 = object.getIntExtra((String)object3, n2);
                SurahNameEntity surahNameEntity = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
                surahNameEntity.setIndex_surah(n3);
            }
            n2 = -16777216;
            int n4 = object.getIntExtra("clrBg", n2);
            object3 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
            ((SurahNameEntity)object3).setClrBg(n4);
            object = SurahNameStyle.NONE;
            n4 = object.ordinal();
            if (n == n4) {
                object = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
                object3 = EngineActivity.cfr_renamed_64(this.this$0).updateAlignmentSurah((String)object2);
                object.setAlignment((Layout.Alignment)object3);
            }
            object = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
            object3 = this.this$0;
            object.setStyle((Context)object3, n, (String)object2, bl3);
            object = EngineActivity.cfr_renamed_64(this.this$0);
            object.invalidate();
        }
    }
}

