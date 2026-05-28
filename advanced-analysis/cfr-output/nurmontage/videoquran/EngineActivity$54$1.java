/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  androidx.fragment.app.FragmentActivity
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 *  com.bumptech.glide.Glide
 */
package hazem.nurmontage.videoquran;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import com.bumptech.glide.Glide;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$54;
import hazem.nurmontage.videoquran.EngineActivity$54$1$1;
import java.io.File;
import java.util.List;

class EngineActivity$54$1
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity$54 this$1;
    final /* synthetic */ File val$file;
    final /* synthetic */ String val$path;

    EngineActivity$54$1(EngineActivity$54 engineActivity$54, File file, String string2) {
        this.this$1 = engineActivity$54;
        this.val$file = file;
        this.val$path = string2;
    }

    public void apply(FFmpegSession object) {
        Object object2;
        int n = ReturnCode.isSuccess((ReturnCode)(object = object.getReturnCode()));
        if (n != 0) {
            object = this.this$1;
            object = object.this$0;
            object = Glide.with((FragmentActivity)object);
            object = object.asBitmap();
            object2 = this.val$file;
            object2 = Uri.fromFile((File)object2);
            object = object.load((Uri)object2);
            object = object.submit();
            object = object.get();
            object = (Bitmap)object;
            object = this.this$1;
            object = object.val$entityAudio;
            object2 = this.val$path;
            object.setPath_ffmpeg((String)object2);
            object = this.this$1;
            object = object.this$0;
            object2 = new EngineActivity$54$1$1(this);
            try {
                object.runOnUiThread((Runnable)object2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                object = this.this$1.this$0;
                EngineActivity.cfr_renamed_13((EngineActivity)((Object)object));
            }
        }
        n = this.this$1.val$index + 1;
        object2 = this.this$1.this$0;
        List list = this.this$1.val$recitersModels;
        EngineActivity.cfr_renamed_390(object2, list, n);
    }
}

