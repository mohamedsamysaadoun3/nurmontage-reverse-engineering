// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.List;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Locale;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.SeekBar;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.databinding.FragmentFadeInOutBinding;
import androidx.fragment.app.Fragment;

public class FadeInOutFragment extends Fragment
{
    public static FadeInOutFragment instance;
    private FragmentFadeInOutBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private SeekBar fadeInSeekBar;
    private SeekBar fadeOutSeekBar;
    private TextCustumFont hint_fade_in;
    private TextCustumFont hint_fade_out;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private boolean isPlay;
    
    public FadeInOutFragment() {
    }
    
    public FadeInOutFragment(final EditMediaFragment$IEditMediaCallback iEditMediaCallback, final EntityAudio entityAudio) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }
    
    private void applyFade(final boolean b, final boolean b2) {
        final EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        if (this.entityAudio.getFade_in() == this.fadeInSeekBar.getProgress() && this.entityAudio.getFade_out() == this.fadeOutSeekBar.getProgress()) {
            if (b) {
                this.iEditMediaCallback.onDone();
            }
            return;
        }
        effectAudio.setFade_in(this.fadeInSeekBar.getProgress());
        effectAudio.setFade_out(this.fadeOutSeekBar.getProgress());
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
        final String join = TextUtils.join((CharSequence)",", (Iterable)list);
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (b) {
                iEditMediaCallback.updateEntity(EffectAudioType.FADE, this.entityAudio);
                this.iEditMediaCallback.onCmdAll(effectAudio);
            }
            else if (b2) {
                iEditMediaCallback.onCmdPlay(join);
            }
            else {
                iEditMediaCallback.onCmd(join);
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
        if (this.iEditMediaCallback != null) {
            if (this.entityAudio.getEffectAudio().getFade_in() != this.fadeInSeekBar.getProgress() || this.entityAudio.getEffectAudio().getFade_out() != this.fadeOutSeekBar.getProgress()) {
                this.applyFade(false, false);
            }
            this.iEditMediaCallback.pausePreview();
            this.iEditMediaCallback.onDone();
        }
    }
    
    public static FadeInOutFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (FadeInOutFragment.instance == null) {
            FadeInOutFragment.instance = new FadeInOutFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return FadeInOutFragment.instance;
    }
    
    private void previewAudio() {
        final boolean isPlay = this.isPlay;
        this.isPlay = (isPlay ^ true);
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (!isPlay) {
                this.applyFade(false, true);
                this.btnPreview.setImageResource(R$drawable.pause_24px);
            }
            else {
                iEditMediaCallback.pausePreview();
                this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentFadeInOutBinding inflate = FragmentFadeInOutBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        final EntityAudio entityAudio = this.entityAudio;
        if (entityAudio == null) {
            return (View)root;
        }
        if (entityAudio.getMediaPlayer() == null) {
            return (View)root;
        }
        this.hint_fade_in = (TextCustumFont)((View)root).findViewById(R$id.hint_fade_in);
        this.hint_fade_out = (TextCustumFont)((View)root).findViewById(R$id.hint_fade_out);
        this.fadeInSeekBar = (SeekBar)((View)root).findViewById(R$id.fadeInSeekBar);
        this.fadeOutSeekBar = (SeekBar)((View)root).findViewById(R$id.fadeOutSeekBar);
        final int n = (int)((this.entityAudio.getRect().right / this.entityAudio.getSecond_in_screen() - this.entityAudio.getRect().left / this.entityAudio.getSecond_in_screen()) * 0.5f);
        this.fadeInSeekBar.setMax(n);
        this.fadeOutSeekBar.setMax(n);
        this.fadeInSeekBar.setProgress(this.entityAudio.getEffectAudio().getFade_in());
        this.fadeOutSeekBar.setProgress(this.entityAudio.getEffectAudio().getFade_out());
        this.hint_fade_in.setText((CharSequence)String.valueOf(this.fadeInSeekBar.getProgress()));
        this.hint_fade_out.setText((CharSequence)String.valueOf(this.fadeOutSeekBar.getProgress()));
        this.fadeInSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new FadeInOutFragment$1(this));
        this.fadeOutSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new FadeInOutFragment$2(this));
        ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new FadeInOutFragment$$ExternalSyntheticLambda0(this));
        (this.btnPreview = (ImageButton)((View)root).findViewById(R$id.btn_play)).setOnClickListener((View$OnClickListener)new FadeInOutFragment$$ExternalSyntheticLambda1(this));
        ((View)root).findViewById(R$id.btn_appl_all).setOnClickListener((View$OnClickListener)new FadeInOutFragment$$ExternalSyntheticLambda2(this));
        return (View)root;
    }
    
    public void onDestroyView() {
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
        }
        super.onDestroyView();
        FadeInOutFragment.instance = null;
        this.binding = null;
    }
    
    public void updateButton() {
        this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
        this.isPlay = false;
    }
}
