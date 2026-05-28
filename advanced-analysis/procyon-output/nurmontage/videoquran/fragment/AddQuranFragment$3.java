// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class AddQuranFragment$3 implements View$OnClickListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$3(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (AddQuranFragment.-$$Nest$fgetiAddQuran(this.this$0) != null) {
            new Thread(new AddQuranFragment$3$1(this, AddQuranFragment.-$$Nest$fgetspinnerFrom(this.this$0).getSelectedItemPosition() + 1, AddQuranFragment.-$$Nest$fgetspinnerTo(this.this$0).getSelectedItemPosition() + 1, AddQuranFragment.-$$Nest$fgetspinnerSurah(this.this$0).getSelectedItemPosition() + 1)).start();
        }
    }
}
