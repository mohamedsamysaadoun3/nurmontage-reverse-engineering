/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.text.TextUtils;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$IReverbPresetCallback;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment;
import hazem.nurmontage.videoquran.model.EffectAudio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

class ReverbePresetFragment$2
implements ReverbeAdabter$IReverbPresetCallback {
    final /* synthetic */ ReverbePresetFragment this$0;

    ReverbePresetFragment$2(ReverbePresetFragment reverbePresetFragment) {
        this.this$0 = reverbePresetFragment;
    }

    public void cmd(String object, int n) {
        Object object2 = ReverbePresetFragment.cfr_renamed_69(this.this$0);
        if (object2 != null) {
            float f;
            float f2;
            boolean bl;
            Object object3;
            int n2;
            Object[] objectArray;
            object2 = ReverbePresetFragment.cfr_renamed_225(this.this$0).getEffectAudio();
            if (object == null && (objectArray = ReverbePresetFragment.cfr_renamed_225(this.this$0).getEffectAudio().getReverbPreset()) == null) {
                ReverbePresetFragment.cfr_renamed_69(this.this$0).startPreview();
                return;
            }
            ((EffectAudio)object2).setReverbPreset((String)object);
            ((EffectAudio)object2).setReverbPreset_index_list(n);
            float f22 = ((EffectAudio)object2).getStart();
            n = 1148846080;
            float f3 = 1000.0f;
            float f4 = ((EffectAudio)object2).getEnd() / f3;
            float f5 = f4 - (f22 /= f3);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Object object4 = Locale.US;
            object = Float.valueOf(f22);
            objectArray = Float.valueOf(f4);
            object = new Object[]{object, objectArray};
            objectArray = "atrim=start=%.2f:end=%.2f";
            object = String.format((Locale)object4, (String)objectArray, object);
            arrayList.add(object);
            object = "asetpts=N/SR/TB";
            arrayList.add(object);
            boolean n22 = ((EffectAudio)object2).isRemoveNoice();
            if (n22) {
                object = "afftdn=nf=-25";
                arrayList.add(object);
            }
            object = Locale.US;
            f4 = ((EffectAudio)object2).getVolume();
            objectArray = Float.valueOf(f4);
            objectArray = new Object[]{objectArray};
            object4 = "volume=%.2f";
            object = String.format((Locale)object, (String)object4, objectArray);
            arrayList.add(object);
            int n3 = ((EffectAudio)object2).getFade_in();
            if (n3 > 0) {
                int n4 = ((EffectAudio)object2).getFade_in();
                f22 = (float)n4 / f3;
                objectArray = Locale.US;
                object = Float.valueOf(f22);
                object = new Object[]{object};
                object4 = "afade=t=in:st=0:d=%.2f";
                object = String.format((Locale)objectArray, (String)object4, object);
                arrayList.add(object);
            }
            if ((n2 = ((EffectAudio)object2).getFade_out()) > 0) {
                int n5 = ((EffectAudio)object2).getFade_out();
                f22 = (float)n5 / f3;
                object3 = Locale.US;
                objectArray = Float.valueOf(f5 -= f22);
                object = Float.valueOf(f22);
                object = new Object[]{objectArray, object};
                objectArray = "afade=t=out:st=%.2f:d=%.2f";
                object = String.format((Locale)object3, (String)objectArray, object);
                arrayList.add(object);
            }
            if (bl = ((EffectAudio)object2).isEnhance()) {
                object = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
                arrayList.add(object);
            }
            if ((object = ((EffectAudio)object2).getReverbPreset()) != null) {
                object = ((EffectAudio)object2).getReverbPreset();
                arrayList.add(object);
            }
            int n6 = ((EffectAudio)object2).getDecays();
            n = 1065353216;
            f3 = 1.0f;
            if (n6 > 0) {
                object = Locale.US;
                objectArray = Float.valueOf(f3);
                f5 = ((EffectAudio)object2).getOutGain();
                Object object5 = Float.valueOf(f5);
                object4 = ((EffectAudio)object2).getDelays_cmd();
                String string2 = ((EffectAudio)object2).getDecays_cmd();
                objectArray = new Object[]{objectArray, object5, object4, string2};
                object5 = "aecho=%.2f:%.2f:%s:%s";
                object = String.format((Locale)object, (String)object5, objectArray);
                arrayList.add(object);
            }
            if ((f2 = (f = (f22 = ((EffectAudio)object2).getSpeed()) - f3) == 0.0f ? 0 : (f > 0.0f ? 1 : -1)) != false) {
                object = this.this$0;
                f3 = ((EffectAudio)object2).getSpeed();
                object = ReverbePresetFragment.cfr_renamed_226((ReverbePresetFragment)((Object)object), f3);
                arrayList.addAll((Collection<Object>)object);
            }
            object = TextUtils.join((CharSequence)",", arrayList);
            object3 = ReverbePresetFragment.cfr_renamed_69(this.this$0);
            object3.onCmdPlay((String)object);
        }
    }

    public void pause() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = ReverbePresetFragment.cfr_renamed_69(this.this$0);
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback = ReverbePresetFragment.cfr_renamed_69(this.this$0);
            editMediaFragment$IEditMediaCallback.pausePreview();
        }
    }
}

