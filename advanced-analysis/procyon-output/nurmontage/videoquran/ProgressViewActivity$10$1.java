// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.LinearLayout;

class ProgressViewActivity$10$1 implements Runnable
{
    final /* synthetic */ ProgressViewActivity$10 this$1;
    final /* synthetic */ LinearLayout val$layout;
    final /* synthetic */ StringBuilder val$sb;
    
    ProgressViewActivity$10$1(final ProgressViewActivity$10 this$1, final LinearLayout val$layout, final StringBuilder val$sb) {
        this.this$1 = this$1;
        this.val$layout = val$layout;
        this.val$sb = val$sb;
    }
    
    public void run() {
        this.val$layout.setVisibility(0);
        final TextCustumFont textCustumFont = (TextCustumFont)this.this$1.this$0.findViewById(R$id.tv_error);
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)this.this$1.this$0.findViewById(R$id.btn_support_team);
        if (LocaleHelper.getLanguage(this.this$1.this$0.getApplicationContext()).equals("ar")) {
            buttonCustumFont.setText((CharSequence)"\u0641\u0631\u064a\u0642 \u0627\u0644\u062f\u0639\u0645");
            textCustumFont.setText((CharSequence)"\u064a\u0648\u062c\u062f \u0645\u0634\u0643\u0644\u0629 \u0641\u064a \u0647\u0630\u0627 \u0627\u0644\u062a\u0635\u0645\u064a\u0645 \u060c \u0644\u0646 \u064a\u062a\u0645 \u062d\u0641\u0638 \u0647\u0630\u0627 \u0627\u0644\u0641\u064a\u062f\u064a\u0648 \u0623\u062e\u0628\u0631 \u0641\u0631\u064a\u0642 \u0627\u0644\u062f\u0639\u0645 ");
        }
        else {
            buttonCustumFont.setText((CharSequence)"Support Team");
            textCustumFont.setText((CharSequence)"There is a problem with this design, this video won't be saved. Tell the support team.");
        }
        buttonCustumFont.setOnClickListener((View$OnClickListener)new ProgressViewActivity$10$1$1(this, buttonCustumFont));
    }
}
