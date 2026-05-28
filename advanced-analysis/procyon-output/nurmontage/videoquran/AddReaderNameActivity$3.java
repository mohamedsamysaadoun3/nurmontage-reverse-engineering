// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class AddReaderNameActivity$3 implements View$OnClickListener
{
    final /* synthetic */ AddReaderNameActivity this$0;
    
    AddReaderNameActivity$3(final AddReaderNameActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        this.this$0.closeKeyboard();
        final Intent intent = new Intent();
        intent.putExtra("name", AddReaderNameActivity.-$$Nest$fgeteditText(this.this$0).getText().toString().trim().replaceAll("\n", " "));
        final Intent intent2 = this.this$0.getIntent();
        final String s = "audio";
        intent.putExtra(s, intent2.getStringExtra(s));
        final Intent intent3 = this.this$0.getIntent();
        final String s2 = "path_video_copy";
        intent.putExtra(s2, intent3.getStringExtra(s2));
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }
}
