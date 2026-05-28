// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import androidx.activity.OnBackPressedCallback;

class AddReaderNameActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ AddReaderNameActivity this$0;
    
    AddReaderNameActivity$1(final AddReaderNameActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        final Intent intent = new Intent();
        final Intent intent2 = this.this$0.getIntent();
        final String s = "name";
        intent.putExtra(s, intent2.getStringExtra(s));
        final Intent intent3 = this.this$0.getIntent();
        final String s2 = "audio";
        intent.putExtra(s2, intent3.getStringExtra(s2));
        final Intent intent4 = this.this$0.getIntent();
        final String s3 = "path_video_copy";
        intent.putExtra(s3, intent4.getStringExtra(s3));
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }
}
