/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.ProVersionActivityLast;

class ProVersionActivityLast$9
implements View.OnClickListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$9(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void onClick(View object) {
        Uri uri = Uri.parse((String)"vnd.youtube:3xtsWfMQ5KM");
        Object object2 = "android.intent.action.VIEW";
        object = new Intent(object2, uri);
        Uri uri2 = Uri.parse((String)"https://youtu.be/3xtsWfMQ5KM");
        uri = new Intent(object2, uri2);
        object2 = this.this$0;
        try {
            object2.startActivity((Intent)object);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = this.this$0;
            object.startActivity((Intent)uri);
        }
    }
}

