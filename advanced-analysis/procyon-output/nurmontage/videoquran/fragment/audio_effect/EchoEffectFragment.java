// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.widget.SeekBar;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.databinding.FragmentEchoEffectBinding;
import androidx.fragment.app.Fragment;

public class EchoEffectFragment extends Fragment
{
    public static EchoEffectFragment instance;
    private FragmentEchoEffectBinding binding;
    private ImageButton btnPreview;
    private SeekBar delaySeekBar;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iEchoCallback;
    private boolean isPlay;
    private SeekBar repeatSeekBar;
    private TextCustumFont tv_hint_delay;
    private TextCustumFont tv_hint_repeat;
    private TextCustumFont tv_hint_volume;
    private SeekBar volumeSeekBar;
    
    public EchoEffectFragment() {
    }
    
    public EchoEffectFragment(final EditMediaFragment$IEditMediaCallback iEchoCallback, final EntityAudio entityAudio) {
        this.iEchoCallback = iEchoCallback;
        this.entityAudio = entityAudio;
    }
    
    private void applyEchoEffect(final boolean b, final boolean b2) {
        int progress = this.delaySeekBar.getProgress();
        final int progress2 = this.repeatSeekBar.getProgress();
        int i = 1;
        final int n = progress2 + i;
        final int progress3 = this.volumeSeekBar.getProgress();
        final EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        if (!b && effectAudio.getDelays() == progress && effectAudio.getDecays() == this.repeatSeekBar.getProgress() && effectAudio.getVolume_echo() == progress3) {
            this.iEchoCallback.startPreview();
            return;
        }
        final float start = effectAudio.getStart();
        final float n2 = 1000.0f;
        final float f = start / n2;
        final float f2 = effectAudio.getEnd() / n2;
        effectAudio.setDecays(this.repeatSeekBar.getProgress());
        effectAudio.setDelays(progress);
        effectAudio.setVolume_echo(progress3);
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
        final float n3 = 1.0f;
        float f4;
        if (decays > 0 && effectAudio.getDelays() > 0) {
            final float b3 = progress3 / 100.0f;
            final float b4 = n3 - b3;
            float n4 = 0.01f;
            final float max = Math.max(n4, b4);
            final StringBuilder sb = new StringBuilder();
            final StringBuilder sb2 = new StringBuilder();
            while (i <= n) {
                final int j = progress * i;
                final double n5 = max;
                final double b5 = i - 1;
                final int n6 = progress;
                final float max2 = Math.max(0.01f, (float)(n5 * Math.pow(0.8, b5)));
                sb.append(j);
                sb2.append(String.format(Locale.US, "%.2f", max2));
                if (i < n) {
                    final String s = "|";
                    sb.append(s);
                    sb2.append(s);
                }
                ++i;
                progress = n6;
                n4 = 0.01f;
            }
            final float max3 = Math.max(n4, b3);
            effectAudio.setOutGain(max3);
            effectAudio.setDecays_cmd(sb2.toString());
            effectAudio.setDelays_cmd(sb.toString());
            final Locale us = Locale.US;
            f4 = 1.0f;
            list.add(String.format(us, "aecho=%.2f:%.2f:%s:%s", f4, max3, sb, sb2));
        }
        else {
            f4 = n3;
        }
        EchoEffectFragment echoEffectFragment;
        if (effectAudio.getSpeed() != f4) {
            final float speed = effectAudio.getSpeed();
            echoEffectFragment = this;
            list.addAll(this.buildSpeedFilters(speed));
        }
        else {
            echoEffectFragment = this;
        }
        final EditMediaFragment$IEditMediaCallback iEchoCallback = echoEffectFragment.iEchoCallback;
        if (iEchoCallback != null) {
            if (b) {
                iEchoCallback.updateEntity(EffectAudioType.ECHO, echoEffectFragment.entityAudio);
                echoEffectFragment.iEchoCallback.onCmdAll(effectAudio);
            }
            else {
                final String join = TextUtils.join((CharSequence)",", (Iterable)list);
                if (b2) {
                    echoEffectFragment.iEchoCallback.onCmdPlay(join);
                }
                else {
                    echoEffectFragment.iEchoCallback.onCmd(join);
                }
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
    
    private void done() {
        if (this.iEchoCallback != null) {
            if (this.entityAudio.getEffectAudio().getDelays() != this.delaySeekBar.getProgress() || this.entityAudio.getEffectAudio().getDecays() != this.repeatSeekBar.getProgress() || this.entityAudio.getEffectAudio().getVolume_echo() != this.volumeSeekBar.getProgress()) {
                this.applyEchoEffect(false, false);
            }
            this.iEchoCallback.pausePreview();
            this.iEchoCallback.onDone();
        }
    }
    
    public static EchoEffectFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (EchoEffectFragment.instance == null) {
            EchoEffectFragment.instance = new EchoEffectFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return EchoEffectFragment.instance;
    }
    
    private void previewAudio() {
        final boolean isPlay = this.isPlay;
        this.isPlay = (isPlay ^ true);
        final EditMediaFragment$IEditMediaCallback iEchoCallback = this.iEchoCallback;
        if (iEchoCallback != null) {
            if (!isPlay) {
                this.applyEchoEffect(false, true);
                this.btnPreview.setImageResource(R$drawable.pause_24px);
            }
            else {
                iEchoCallback.pausePreview();
                this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
            }
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEchoEffectBinding inflate = FragmentEchoEffectBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.entityAudio != null) {
            if (this.iEchoCallback != null) {
                this.tv_hint_delay = (TextCustumFont)((View)root).findViewById(R$id.tv_delay_size);
                this.tv_hint_repeat = (TextCustumFont)((View)root).findViewById(R$id.tv_repeat_size);
                this.tv_hint_volume = (TextCustumFont)((View)root).findViewById(R$id.tv_volume_size);
                (this.delaySeekBar = (SeekBar)((View)root).findViewById(R$id.delaySeekBar)).setProgress(this.entityAudio.getEffectAudio().getDelays());
                this.delaySeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new EchoEffectFragment$1(this));
                (this.repeatSeekBar = (SeekBar)((View)root).findViewById(R$id.repeatSeekBar)).setProgress(this.entityAudio.getEffectAudio().getDecays());
                this.repeatSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new EchoEffectFragment$2(this));
                (this.volumeSeekBar = (SeekBar)((View)root).findViewById(R$id.volumeSeekBar)).setProgress(this.entityAudio.getEffectAudio().getVolume_echo());
                this.volumeSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new EchoEffectFragment$3(this));
                this.tv_hint_delay.setText((CharSequence)String.valueOf(this.delaySeekBar.getProgress()));
                this.tv_hint_repeat.setText((CharSequence)String.valueOf(this.repeatSeekBar.getProgress()));
                this.tv_hint_volume.setText((CharSequence)String.valueOf(this.volumeSeekBar.getProgress()));
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new EchoEffectFragment$$ExternalSyntheticLambda0(this));
                (this.btnPreview = (ImageButton)((View)root).findViewById(R$id.btn_play)).setOnClickListener((View$OnClickListener)new EchoEffectFragment$$ExternalSyntheticLambda1(this));
                ((View)root).findViewById(R$id.btn_appl_all).setOnClickListener((View$OnClickListener)new EchoEffectFragment$$ExternalSyntheticLambda2(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        final EditMediaFragment$IEditMediaCallback iEchoCallback = this.iEchoCallback;
        if (iEchoCallback != null) {
            iEchoCallback.pausePreview();
        }
        super.onDestroyView();
        EchoEffectFragment.instance = null;
        this.binding = null;
    }
    
    public void updateButton() {
        this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
        this.isPlay = false;
    }
}
