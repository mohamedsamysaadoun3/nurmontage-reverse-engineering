/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Intent
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import hazem.nurmontage.videoquran.YoutuberActivity;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$IYoutuber;

class YoutuberActivity$2
implements YoutuberAdabter$IYoutuber {
    final /* synthetic */ YoutuberActivity this$0;

    YoutuberActivity$2(YoutuberActivity youtuberActivity) {
        this.this$0 = youtuberActivity;
    }

    public void onClick(String object) {
        StringBuilder stringBuilder = new StringBuilder("vnd.youtube:");
        stringBuilder = Uri.parse((String)stringBuilder.append((String)object).toString());
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2, (Uri)stringBuilder);
        String string3 = "https://youtu.be/";
        StringBuilder stringBuilder2 = new StringBuilder(string3);
        object = Uri.parse((String)stringBuilder2.append((String)object).toString());
        stringBuilder = new Intent(string2, (Uri)object);
        object = this.this$0;
        try {
            object.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = this.this$0;
            try {
                object.startActivity((Intent)stringBuilder);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

