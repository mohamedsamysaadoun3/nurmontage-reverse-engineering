// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import android.view.View;
import android.view.View$OnClickListener;

class QuranSearchActivity$1 implements View$OnClickListener
{
    final /* synthetic */ QuranSearchActivity this$0;
    
    QuranSearchActivity$1(final QuranSearchActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final int -$$Nest$fgetm = QuranSearchActivity.-$$Nest$fgetmFrom(this.this$0);
        final int result = -1;
        if (-$$Nest$fgetm == result) {
            return;
        }
        final QuranSearchActivity this$0 = this.this$0;
        QuranPreference.savePreferencesSearch((Context)this$0, QuranSearchActivity.-$$Nest$fgetindexSurah(this$0), QuranSearchActivity.-$$Nest$fgetmFrom(this.this$0), QuranSearchActivity.-$$Nest$fgetmTo(this.this$0), QuranSearchActivity.-$$Nest$fgeteditText(this.this$0).getText().toString());
        this.this$0.setResult(result);
        this.this$0.finish();
    }
}
