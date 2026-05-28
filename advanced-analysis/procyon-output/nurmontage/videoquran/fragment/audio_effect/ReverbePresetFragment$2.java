// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import hazem.nurmontage.videoquran.model.EffectAudio;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Locale;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$IReverbPresetCallback;

class ReverbePresetFragment$2 implements ReverbeAdabter$IReverbPresetCallback
{
    final /* synthetic */ ReverbePresetFragment this$0;
    
    ReverbePresetFragment$2(final ReverbePresetFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void cmd(String reverbPreset, int reverbPreset_index_list) {
        if (ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            final EffectAudio effectAudio = ReverbePresetFragment.-$$Nest$fgetentityAudio(this.this$0).getEffectAudio();
            if (reverbPreset == null && ReverbePresetFragment.-$$Nest$fgetentityAudio(this.this$0).getEffectAudio().getReverbPreset() == null) {
                ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).startPreview();
                return;
            }
            effectAudio.setReverbPreset(reverbPreset);
            effectAudio.setReverbPreset_index_list(reverbPreset_index_list);
            final float start = effectAudio.getStart();
            reverbPreset_index_list = 1148846080;
            final float n = 1000.0f;
            final float f = start / n;
            final float f2 = effectAudio.getEnd() / n;
            final float n2 = f2 - f;
            final ArrayList list = new ArrayList();
            reverbPreset = String.format(Locale.US, "atrim=start=%.2f:end=%.2f", f, f2);
            list.add(reverbPreset);
            reverbPreset = "asetpts=N/SR/TB";
            list.add(reverbPreset);
            if (effectAudio.isRemoveNoice()) {
                reverbPreset = "afftdn=nf=-25";
                list.add(reverbPreset);
            }
            reverbPreset = String.format(Locale.US, "volume=%.2f", effectAudio.getVolume());
            list.add(reverbPreset);
            if (effectAudio.getFade_in() > 0) {
                reverbPreset = String.format(Locale.US, "afade=t=in:st=0:d=%.2f", effectAudio.getFade_in() / n);
                list.add(reverbPreset);
            }
            if (effectAudio.getFade_out() > 0) {
                final float f3 = effectAudio.getFade_out() / n;
                reverbPreset = String.format(Locale.US, "afade=t=out:st=%.2f:d=%.2f", n2 - f3, f3);
                list.add(reverbPreset);
            }
            if (effectAudio.isEnhance()) {
                reverbPreset = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
                list.add(reverbPreset);
            }
            reverbPreset = effectAudio.getReverbPreset();
            if (reverbPreset != null) {
                reverbPreset = effectAudio.getReverbPreset();
                list.add(reverbPreset);
            }
            final int decays = effectAudio.getDecays();
            reverbPreset_index_list = 1065353216;
            final float f4 = 1.0f;
            if (decays > 0) {
                reverbPreset = String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", f4, effectAudio.getOutGain(), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd());
                list.add(reverbPreset);
            }
            if (effectAudio.getSpeed() != f4) {
                list.addAll(ReverbePresetFragment.-$$Nest$mbuildSpeedFilters(this.this$0, effectAudio.getSpeed()));
            }
            reverbPreset = TextUtils.join((CharSequence)",", (Iterable)list);
            ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).onCmdPlay(reverbPreset);
        }
    }
    
    public void pause() {
        if (ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            ReverbePresetFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).pausePreview();
        }
    }
}
