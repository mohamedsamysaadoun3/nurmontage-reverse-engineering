/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import android.content.Intent;
import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.AddReaderNameActivity;

class AddReaderNameActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ AddReaderNameActivity this$0;

    AddReaderNameActivity$1(AddReaderNameActivity addReaderNameActivity, boolean bl) {
        this.this$0 = addReaderNameActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        Intent intent = new Intent();
        Object object = this.this$0.getIntent();
        String string2 = "name";
        object = object.getStringExtra(string2);
        intent.putExtra(string2, (String)object);
        object = this.this$0.getIntent();
        string2 = "audio";
        object = object.getStringExtra(string2);
        intent.putExtra(string2, (String)object);
        object = this.this$0.getIntent();
        string2 = "path_video_copy";
        object = object.getStringExtra(string2);
        intent.putExtra(string2, (String)object);
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }
}

