// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.content.Context;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

class EngineActivity$70 implements ActivityResultCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$70(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onActivityResult(final ActivityResult activityResult) {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, false);
        if (activityResult.getResultCode() == -1) {
            final Intent data = activityResult.getData();
            if (data != null) {
                final String stringExtra = data.getStringExtra("reader");
                final boolean booleanExtra = data.getBooleanExtra("isBg", false);
                final int intExtra = data.getIntExtra("style", 0);
                if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().getIndex_surah() == 0) {
                    EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().setIndex_surah(data.getIntExtra("index", 1));
                }
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().setClrBg(data.getIntExtra("clrBg", -16777216));
                if (intExtra == SurahNameStyle.NONE.ordinal()) {
                    EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().setAlignment(EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).updateAlignmentSurah(stringExtra));
                }
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().setStyle((Context)this.this$0, intExtra, stringExtra, booleanExtra);
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
            }
        }
    }
}
