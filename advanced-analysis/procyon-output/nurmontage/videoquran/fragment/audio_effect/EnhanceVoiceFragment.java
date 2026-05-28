// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.CompoundButton$OnCheckedChangeListener;
import hazem.nurmontage.videoquran.R$id;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.List;
import hazem.nurmontage.videoquran.model.EffectAudio;
import android.text.TextUtils;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import java.util.Collection;
import java.util.Locale;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.databinding.FragmentRemoveNoiceBinding;
import androidx.fragment.app.Fragment;

public class EnhanceVoiceFragment extends Fragment
{
    public static EnhanceVoiceFragment instance;
    private FragmentRemoveNoiceBinding binding;
    private ImageButton btnPreview;
    private SwitchCompat btn_remove_noice;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private boolean isPlay;
    
    public EnhanceVoiceFragment() {
    }
    
    public EnhanceVoiceFragment(final EditMediaFragment$IEditMediaCallback iEditMediaCallback, final EntityAudio entityAudio) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }
    
    private void apply(final boolean b) {
        final EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        effectAudio.setEnhance(this.btn_remove_noice.isChecked());
        final float start = effectAudio.getStart();
        final float n = 1000.0f;
        final float f = start / n;
        final float f2 = effectAudio.getEnd() / n;
        final ArrayList list = new ArrayList();
        list.add(String.format(Locale.US, "atrim=start=%.2f:end=%.2f", f, f2));
        list.add("asetpts=N/SR/TB");
        if (effectAudio.isRemoveNoice()) {
            list.add("afftdn=nf=-25");
        }
        list.add(String.format(Locale.US, "volume=%.2f", effectAudio.getVolume()));
        if (effectAudio.getFade_in() > 0) {
            list.add("afade=t=in:st=0:d=" + (float)effectAudio.getFade_in());
        }
        if (effectAudio.getFade_out() > 0) {
            final float f3 = (float)effectAudio.getFade_out();
            list.add("afade=t=out:st=" + (f2 - f - f3) + ":d=" + f3);
        }
        if (effectAudio.isEnhance()) {
            list.add("equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3");
        }
        if (effectAudio.getReverbPreset() != null) {
            list.add(effectAudio.getReverbPreset());
        }
        final int decays = effectAudio.getDecays();
        final float f4 = 1.0f;
        if (decays > 0) {
            list.add(String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", f4, effectAudio.getOutGain(), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd()));
        }
        if (effectAudio.getSpeed() != f4) {
            list.addAll(this.buildSpeedFilters(effectAudio.getSpeed()));
        }
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (b) {
                iEditMediaCallback.updateEntity(EffectAudioType.ENHANCE, this.entityAudio);
                this.iEditMediaCallback.onCmdAll(effectAudio);
            }
            else {
                this.iEditMediaCallback.onCmd(TextUtils.join((CharSequence)",", (Iterable)list));
            }
        }
    }
    
    private List buildSpeedFilters(float f) {
        final ArrayList list = new ArrayList();
        final float n = 0.5f;
        final float n2 = fcmpg(f, n);
        final String format = "atempo=%.2f";
        if (n2 < 0) {
            while (f < n) {
                list.add("atempo=0.5");
                f /= n;
            }
            list.add(String.format(Locale.US, format, f));
        }
        else {
            final float n3 = 2.0f;
            if (f > n3) {
                while (f > n3) {
                    list.add("atempo=2.0");
                    f /= n3;
                }
                list.add(String.format(Locale.US, format, f));
            }
            else {
                list.add(String.format(Locale.US, format, f));
            }
        }
        return list;
    }
    
    public static EnhanceVoiceFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (EnhanceVoiceFragment.instance == null) {
            EnhanceVoiceFragment.instance = new EnhanceVoiceFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return EnhanceVoiceFragment.instance;
    }
    
    private void onDone() {
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.onDone();
        }
    }
    
    private void preview() {
        final boolean isPlay = this.isPlay;
        this.isPlay = (isPlay ^ true);
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (!isPlay) {
                iEditMediaCallback.startPreview();
                this.btnPreview.setImageResource(R$drawable.pause_24px);
            }
            else {
                iEditMediaCallback.pausePreview();
                this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
            }
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentRemoveNoiceBinding inflate = FragmentRemoveNoiceBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null) {
            if (this.entityAudio != null) {
                (this.btn_remove_noice = (SwitchCompat)((View)root).findViewById(R$id.btn_remove_noice)).setChecked(this.entityAudio.getEffectAudio().isEnhance());
                this.btn_remove_noice.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new EnhanceVoiceFragment$1(this));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_remove_noice)).setText((CharSequence)this.getResources().getString(R$string.enhance_voice));
                ((View)root).findViewById(R$id.btn_appl_all).setOnClickListener((View$OnClickListener)new EnhanceVoiceFragment$$ExternalSyntheticLambda0(this));
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new EnhanceVoiceFragment$$ExternalSyntheticLambda1(this));
                (this.btnPreview = (ImageButton)((View)root).findViewById(R$id.btn_play)).setOnClickListener((View$OnClickListener)new EnhanceVoiceFragment$$ExternalSyntheticLambda2(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        EnhanceVoiceFragment.instance = null;
        this.binding = null;
    }
    
    public void updateButton() {
        this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
        this.isPlay = false;
    }
}
