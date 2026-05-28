/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.core.content.FileProvider
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.FileProvider;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.VideoViewActivity;
import java.io.File;

class VideoViewActivity$6
implements View.OnClickListener {
    final /* synthetic */ VideoViewActivity this$0;

    VideoViewActivity$6(VideoViewActivity videoViewActivity) {
        this.this$0 = videoViewActivity;
    }

    public void onClick(View object) {
        Object object2;
        Object[] objectArray;
        Object object3;
        block42: {
            block41: {
                object = "Send To";
                object3 = this.this$0;
                object3 = VideoViewActivity.cfr_renamed_120(object3);
                boolean bl = Utils.isProbablyLArabic((String)object3);
                if (bl) break block41;
                object3 = "%s %s #NurMontage_app #\u0642\u0631\u0622\u0646_\u0643\u0631\u064a\u0645 ";
                objectArray = this.this$0;
                objectArray = VideoViewActivity.cfr_renamed_121((VideoViewActivity)objectArray);
                object2 = this.this$0;
                object2 = VideoViewActivity.cfr_renamed_120(object2);
                objectArray = new Object[]{objectArray, object2};
                object3 = String.format((String)object3, objectArray);
                break block42;
            }
            object3 = " %s \u0628\u0635\u0648\u062a %s #\u062a\u0637\u0628\u064a\u0642_NurMontage #\u0642\u0631\u0622\u0646_\u0643\u0631\u064a\u0645";
            objectArray = this.this$0;
            objectArray = VideoViewActivity.cfr_renamed_121((VideoViewActivity)objectArray);
            object2 = this.this$0;
            object2 = VideoViewActivity.cfr_renamed_120(object2);
            objectArray = new Object[]{objectArray, object2};
            object3 = String.format((String)object3, objectArray);
        }
        object2 = "android.intent.action.SEND";
        objectArray = new Intent((String)object2);
        object2 = "act";
        String string2 = "ACT_SHARE";
        objectArray.putExtra((String)object2, string2);
        object2 = "android.intent.extra.TITLE";
        objectArray.putExtra((String)object2, (String)object);
        object2 = "android.intent.extra.TEXT";
        objectArray.putExtra((String)object2, (String)object3);
        object3 = "android.intent.extra.SUBJECT";
        object2 = this.this$0;
        object2 = VideoViewActivity.cfr_renamed_90(object2);
        int n = R$string.nurmontage_app;
        object2 = object2.getString(n);
        objectArray.putExtra((String)object3, (String)object2);
        object3 = "android.intent.extra.STREAM";
        object2 = this.this$0;
        string2 = object2.getResources();
        int n2 = R$string.file_provider;
        string2 = string2.getString(n2);
        Object object4 = this.this$0;
        object4 = VideoViewActivity.cfr_renamed_23(object4);
        object4 = Uri.parse((String)object4);
        object4 = object4.getPath();
        File file = new File((String)object4);
        object2 = FileProvider.getUriForFile((Context)object2, (String)string2, (File)file);
        objectArray.putExtra((String)object3, (Parcelable)object2);
        object3 = "video/mp4";
        objectArray.setType((String)object3);
        object3 = this.this$0;
        object = Intent.createChooser((Intent)objectArray, (CharSequence)object);
        try {
            object3.startActivity((Intent)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

