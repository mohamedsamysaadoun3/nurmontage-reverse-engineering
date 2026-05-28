/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import android.net.Uri;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$66;
import hazem.nurmontage.videoquran.EngineActivity$66$1$1;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.model.EntityMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class EngineActivity$66$1
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity$66 this$1;
    final /* synthetic */ File val$outputFile;
    final /* synthetic */ File val$outputFilePcm;

    EngineActivity$66$1(EngineActivity$66 engineActivity$66, File file, File file2) {
        this.this$1 = engineActivity$66;
        this.val$outputFile = file;
        this.val$outputFilePcm = file2;
    }

    public void apply(FFmpegSession object) {
        int n = ReturnCode.isSuccess((ReturnCode)(object = object.getReturnCode()));
        if (n != 0) {
            Object object2;
            object = this.this$1;
            n = ((EngineActivity$66)object).val$index;
            if (n >= 0) {
                object = this.this$1;
                n = ((EngineActivity$66)object).val$index;
                object2 = EngineActivity.cfr_renamed_2(this.this$1.this$0).getEntityMediaList();
                int n2 = object2.size();
                if (n < n2) {
                    object = EngineActivity.cfr_renamed_2(this.this$1.this$0).getEntityMediaList();
                    object2 = this.this$1;
                    n2 = ((EngineActivity$66)object2).val$index;
                    if ((n2 = (int)(((EntityMedia)(object = (EntityMedia)object.get(n2))).isApplyEffectInPreview() ? 1 : 0)) != 0) {
                        float f;
                        int n3;
                        int n4;
                        float f2;
                        Object object3 = EngineActivity.cfr_renamed_2(this.this$1.this$0).getFolder_template();
                        String[] stringArray = new StringBuilder();
                        long l = System.currentTimeMillis();
                        stringArray = stringArray.append(l);
                        String string2 = "_audio_echo.mp3";
                        stringArray = stringArray.append(string2).toString();
                        object2 = new File((String)object3, (String)stringArray);
                        object = ((EntityMedia)object).getEffectAudio();
                        float f3 = ((EffectAudio)object).getStart();
                        float f4 = 1000.0f;
                        float f5 = ((EffectAudio)object).getEnd() / f4;
                        stringArray = new ArrayList();
                        Object[] objectArray = new StringBuilder("atrim=start=");
                        objectArray = objectArray.append(f3 /= f4);
                        Object object4 = ":end=";
                        objectArray = objectArray.append((String)object4).append(f5).toString();
                        stringArray.add(objectArray);
                        objectArray = "asetpts=N/SR/TB";
                        stringArray.add(objectArray);
                        boolean n42 = ((EffectAudio)object).isRemoveNoice();
                        if (n42) {
                            objectArray = "afftdn=nf=-25";
                            stringArray.add(objectArray);
                        }
                        objectArray = Locale.US;
                        float f6 = ((EffectAudio)object).getVolume();
                        object4 = Float.valueOf(f6);
                        object4 = new Object[]{object4};
                        String string3 = "volume=%.2f";
                        objectArray = String.format((Locale)objectArray, string3, (Object[])object4);
                        stringArray.add(objectArray);
                        int n5 = ((EffectAudio)object).getFade_in();
                        if (n5 > 0) {
                            int n6 = ((EffectAudio)object).getFade_in();
                            f2 = n6;
                            string3 = "afade=t=in:st=0:d=";
                            object4 = new StringBuilder(string3);
                            objectArray = ((StringBuilder)object4).append(f2).toString();
                            stringArray.add(objectArray);
                        }
                        if ((n4 = ((EffectAudio)object).getFade_out()) > 0) {
                            int n7 = ((EffectAudio)object).getFade_out();
                            f2 = n7;
                            f5 = f5 - f3 - f2;
                            object4 = "afade=t=out:st=";
                            object3 = new StringBuilder((String)object4);
                            object3 = ((StringBuilder)object3).append(f5);
                            string2 = ":d=";
                            object3 = ((StringBuilder)object3).append(string2).append(f2).toString();
                            stringArray.add(object3);
                        }
                        if ((n3 = ((EffectAudio)object).isEnhance()) != 0) {
                            object3 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
                            stringArray.add(object3);
                        }
                        if ((object3 = ((EffectAudio)object).getReverbPreset()) != null) {
                            object3 = ((EffectAudio)object).getReverbPreset();
                            stringArray.add(object3);
                        }
                        n3 = ((EffectAudio)object).getDecays();
                        int n8 = 1065353216;
                        f5 = 1.0f;
                        if (n3 > 0) {
                            object3 = Locale.US;
                            objectArray = Float.valueOf(f5);
                            f6 = ((EffectAudio)object).getOutGain();
                            object4 = Float.valueOf(f6);
                            string3 = ((EffectAudio)object).getDelays_cmd();
                            String string4 = ((EffectAudio)object).getDecays_cmd();
                            objectArray = new Object[]{objectArray, object4, string3, string4};
                            object4 = "aecho=%.2f:%.2f:%s:%s";
                            object3 = String.format((Locale)object3, (String)object4, objectArray);
                            stringArray.add(object3);
                        }
                        if ((n3 = (int)((f = (f3 = ((EffectAudio)object).getSpeed()) - f5) == 0.0f ? 0 : (f > 0.0f ? 1 : -1))) != 0) {
                            object3 = this.this$1.this$0;
                            float f7 = ((EffectAudio)object).getSpeed();
                            object = EngineActivity.cfr_renamed_226((EngineActivity)((Object)object3), f7);
                            stringArray.addAll(object);
                        }
                        object = TextUtils.join((CharSequence)",", stringArray);
                        object3 = EngineActivity.cfr_renamed_296(this.this$1.this$0);
                        string2 = this.val$outputFile.getAbsolutePath();
                        stringArray = new String[]{"-i", string2, "-af", object, "-y", string2 = ((File)object2).getAbsolutePath()};
                        object = new EngineActivity$66$1$1(this, (File)object2);
                        object = FFmpegKit.executeWithArgumentsAsync((String[])stringArray, (FFmpegSessionCompleteCallback)object).getSessionId();
                        object3.add(object);
                        return;
                    }
                }
            }
            object2 = this.this$1.this$0;
            Uri uri = Uri.fromFile((File)this.val$outputFile);
            List list = this.this$1.val$pathes;
            int n9 = this.this$1.val$index;
            String string5 = this.val$outputFile.getAbsolutePath();
            String string6 = this.val$outputFilePcm.getAbsolutePath();
            object = this.this$1;
            String string7 = ((EngineActivity$66)object).val$path_video;
            EngineActivity.cfr_renamed_521((EngineActivity)((Object)object2), uri, list, n9, string5, string6, string7);
        }
    }
}

