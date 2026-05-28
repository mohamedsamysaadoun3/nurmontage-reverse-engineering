/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$66$1;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.model.Template;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

class EngineActivity$66
implements Runnable {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ List val$pathes;

    EngineActivity$66(EngineActivity engineActivity, List list, int n, String string2) {
        this.this$0 = engineActivity;
        this.val$pathes = list;
        this.val$index = n;
        this.val$path_video = string2;
    }

    public void run() {
        Object object;
        Object object2;
        Object object3;
        String string2 = "0:a";
        Object object4 = "-map";
        Object object5 = "-f";
        Object object6 = new ArrayList();
        object6 = new ArrayList();
        object6 = new StringBuilder();
        Object object7 = this.val$pathes;
        object7 = object7.iterator();
        int n = 0;
        Object object8 = null;
        while (true) {
            block88: {
                block87: {
                    boolean bl = object7.hasNext();
                    if (!bl) break;
                    object3 = object7.next();
                    object3 = (String)object3;
                    object3 = Uri.parse(object3);
                    object2 = object3.toString();
                    object = "http://";
                    boolean bl2 = ((String)object2).startsWith((String)object);
                    if (bl2) break block87;
                    object = "https://";
                    bl2 = ((String)object2).startsWith((String)object);
                    if (bl2) break block87;
                    object2 = this.this$0;
                    object = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object2));
                    object = ((Template)object).getFolder_template();
                    object3 = AudioUtils.copyFromUri((Context)object2, object3, (String)object);
                    break block88;
                }
                object3 = this.this$0;
                object = EngineActivity.cfr_renamed_2(object3);
                object = ((Template)object).getFolder_template();
                object3 = AudioUtils.downloadFile(object3, (String)object2, (String)object);
            }
            if (object3 == null) continue;
            object2 = "file '";
            object2 = ((StringBuilder)object6).append((String)object2);
            object = "'";
            String string3 = "\\'";
            object3 = ((String)object3).replace((CharSequence)object, string3);
            object3 = ((StringBuilder)object2).append((String)object3);
            object2 = "'\n";
            ((StringBuilder)object3).append((String)object2);
            ++n;
            object3 = this.this$0;
            object2 = this.val$pathes;
            int n2 = object2.size();
            EngineActivity.cfr_renamed_393(object3, n, n2);
            continue;
            break;
        }
        object8 = this.this$0;
        object8 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object8));
        object8 = ((Template)object8).getFolder_template();
        object3 = "concat.txt";
        object7 = new File((String)object8, (String)object3);
        object8 = new FileOutputStream((File)object7);
        object6 = ((StringBuilder)object6).toString();
        object6 = ((String)object6).getBytes();
        ((FileOutputStream)object8).write((byte[])object6);
        ((FileOutputStream)object8).close();
        object8 = this.this$0;
        object8 = EngineActivity.cfr_renamed_2((EngineActivity)((Object)object8));
        object8 = ((Template)object8).getFolder_template();
        object3 = new StringBuilder();
        long l = System.currentTimeMillis();
        object3 = ((StringBuilder)object3).append(l);
        object2 = "_output.mp3";
        object3 = ((StringBuilder)object3).append((String)object2);
        object3 = ((StringBuilder)object3).toString();
        object6 = new File((String)object8, (String)object3);
        object3 = this.this$0;
        object3 = EngineActivity.cfr_renamed_2(object3);
        object3 = ((Template)object3).getFolder_template();
        object2 = new StringBuilder();
        long l2 = System.currentTimeMillis();
        object2 = ((StringBuilder)object2).append(l2);
        object = "_output.pcm";
        object2 = ((StringBuilder)object2).append((String)object);
        object2 = ((StringBuilder)object2).toString();
        object8 = new File((String)object3, (String)object2);
        object3 = new ArrayList();
        object3.add(object5);
        object2 = "concat";
        object3.add(object2);
        object2 = "-safe";
        object3.add(object2);
        object2 = "0";
        object3.add(object2);
        object2 = "-i";
        object3.add(object2);
        object7 = ((File)object7).getAbsolutePath();
        object3.add(object7);
        object3.add(object4);
        object3.add(string2);
        object7 = "-c";
        object3.add(object7);
        object7 = "copy";
        object3.add(object7);
        object7 = ((File)object6).getAbsolutePath();
        object3.add(object7);
        object3.add(object4);
        object3.add(string2);
        String string4 = "-ac";
        object3.add(string4);
        String string5 = "1";
        object3.add(string5);
        String string6 = "-ar";
        object3.add(string6);
        String string7 = "44100";
        object3.add(string7);
        object3.add(object5);
        String string8 = "s16le";
        object3.add(string8);
        String string9 = ((File)object8).getAbsolutePath();
        object3.add(string9);
        String string10 = "-y";
        object3.add(string10);
        String[] stringArray3 = new String[]{};
        stringArray3 = object3.toArray(stringArray3);
        stringArray3 = stringArray3;
        object4 = this.this$0;
        object4 = EngineActivity.cfr_renamed_296((EngineActivity)((Object)object4));
        object5 = new EngineActivity$66$1(this, (File)object6, (File)object8);
        FFmpegSession fFmpegSession = FFmpegKit.executeWithArgumentsAsync((String[])stringArray3, (FFmpegSessionCompleteCallback)object5);
        long l3 = fFmpegSession.getSessionId();
        Long l4 = l3;
        try {
            object4.add(l4);
        }
        catch (Exception exception) {
            EngineActivity.cfr_renamed_13(this.this$0);
            object4 = this.this$0;
            EngineActivity.cfr_renamed_75((EngineActivity)((Object)object4));
            exception.printStackTrace();
        }
    }
}

