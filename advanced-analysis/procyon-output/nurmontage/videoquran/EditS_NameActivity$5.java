// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Objects;
import android.text.Editable;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class EditS_NameActivity$5 implements View$OnClickListener
{
    final /* synthetic */ EditS_NameActivity this$0;
    
    EditS_NameActivity$5(final EditS_NameActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent();
        intent.putExtra("reader", Objects.requireNonNull(EditS_NameActivity.-$$Nest$fgeteditText(this.this$0).getText()).toString());
        intent.putExtra("style", EditS_NameActivity.-$$Nest$fgetstyle(this.this$0));
        intent.putExtra("index", EditS_NameActivity.-$$Nest$fgetindex_surah(this.this$0));
        intent.putExtra("isBg", EditS_NameActivity.-$$Nest$fgetcheckBg(this.this$0).isChecked());
        intent.putExtra("clrBg", EditS_NameActivity.-$$Nest$fgetclrBg(this.this$0));
        this.this$0.setResult(-1, intent);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}
