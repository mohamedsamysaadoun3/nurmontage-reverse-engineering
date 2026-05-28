// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Objects;
import android.text.Editable;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class EditTrslTxtActivity$3 implements View$OnClickListener
{
    final /* synthetic */ EditTrslTxtActivity this$0;
    
    EditTrslTxtActivity$3(final EditTrslTxtActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent();
        intent.putExtra("reader", Objects.requireNonNull(EditTrslTxtActivity.-$$Nest$fgeteditText(this.this$0).getText()).toString());
        intent.putExtra("style", EditTrslTxtActivity.-$$Nest$fgetstyle(this.this$0));
        intent.putExtra("index", EditTrslTxtActivity.-$$Nest$fgetindex_surah(this.this$0));
        intent.putExtra("isBg", EditTrslTxtActivity.-$$Nest$fgetcheckBg(this.this$0).isChecked());
        intent.putExtra("clrBg", EditTrslTxtActivity.-$$Nest$fgetclrBg(this.this$0));
        this.this$0.setResult(-1, intent);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}
