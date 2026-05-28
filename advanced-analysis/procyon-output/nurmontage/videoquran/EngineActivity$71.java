// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

class EngineActivity$71 implements ActivityResultCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$71(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onActivityResult(final ActivityResult activityResult) {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, false);
        if (activityResult.getResultCode() == -1) {
            final Intent data = activityResult.getData();
            if (data != null) {
                final String stringExtra = data.getStringExtra("reader");
                final boolean booleanExtra = data.getBooleanExtra("isBg", true);
                final TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select();
                translationQuranEntity.setClrBg(data.getIntExtra("clrBg", -16777216));
                translationQuranEntity.setTxt(stringExtra);
                translationQuranEntity.setHaveBg(booleanExtra);
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
            }
        }
    }
}
