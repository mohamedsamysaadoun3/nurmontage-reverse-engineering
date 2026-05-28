// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import hazem.nurmontage.videoquran.R$string;
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
import android.widget.SeekBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.databinding.FragmentVolumeBinding;
import androidx.fragment.app.Fragment;

public class SpeedFragment extends Fragment
{
    public static SpeedFragment instance;
    private FragmentVolumeBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iVolumeCallback;
    private boolean isPlay;
    private TextCustumFont tvProgress;
    private SeekBar volumeSeekBar;
    
    public SpeedFragment() {
    }
    
    public SpeedFragment(final EditMediaFragment$IEditMediaCallback iVolumeCallback, final EntityAudio entityAudio) {
        this.iVolumeCallback = iVolumeCallback;
        this.entityAudio = entityAudio;
    }
    
    private void applyVolume(final boolean b) {
        final EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        effectAudio.setSpeed(this.volumeSeekBar.getProgress() / 375.0f * 3.75f + 0.25f);
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
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            if (b) {
                iVolumeCallback.updateEntity(EffectAudioType.SPEED, this.entityAudio);
                this.iVolumeCallback.onCmdAll(effectAudio);
            }
            else {
                this.iVolumeCallback.onCmd(TextUtils.join((CharSequence)",", (Iterable)list));
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
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            iVolumeCallback.pausePreview();
            this.iVolumeCallback.onDone();
        }
    }
    
    public static SpeedFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (SpeedFragment.instance == null) {
            SpeedFragment.instance = new SpeedFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return SpeedFragment.instance;
    }
    
    private void previewAudio() {
        final boolean isPlay = this.isPlay;
        this.isPlay = (isPlay ^ true);
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            if (!isPlay) {
                iVolumeCallback.startPreview();
                this.btnPreview.setImageResource(R$drawable.pause_24px);
            }
            else {
                iVolumeCallback.pausePreview();
                this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
            }
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentVolumeBinding inflate = FragmentVolumeBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        final EntityAudio entityAudio = this.entityAudio;
        if (entityAudio != null && entityAudio.getMediaPlayer() != null) {
            if (this.iVolumeCallback != null) {
                this.tvProgress = (TextCustumFont)((View)root).findViewById(R$id.tv_volume_size);
                ((TextCustumFont)((View)root).findViewById(R$id.tv_volume)).setText((CharSequence)this.getResources().getString(R$string.speed));
                (this.volumeSeekBar = (SeekBar)((View)root).findViewById(R$id.volumeSeekBar)).setMax(375);
                final float speed = this.entityAudio.getEffectAudio().getSpeed();
                final float n = 0.25f;
                final float n2 = speed - n;
                final float n3 = 3.75f;
                final int progress = (int)(n2 / n3 * this.volumeSeekBar.getMax());
                this.volumeSeekBar.setProgress(progress);
                this.tvProgress.setText((CharSequence)String.format(Locale.US, "%.2fx", progress / 375.0f * n3 + n));
                this.volumeSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SpeedFragment$1(this));
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new SpeedFragment$$ExternalSyntheticLambda0(this));
                (this.btnPreview = (ImageButton)((View)root).findViewById(R$id.btn_play)).setOnClickListener((View$OnClickListener)new SpeedFragment$$ExternalSyntheticLambda1(this));
                ((View)root).findViewById(R$id.btn_appl_all).setOnClickListener((View$OnClickListener)new SpeedFragment$$ExternalSyntheticLambda2(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            iVolumeCallback.pausePreview();
        }
        super.onDestroyView();
        SpeedFragment.instance = null;
        this.binding = null;
    }
    
    public void updateButton() {
        this.btnPreview.setImageResource(R$drawable.play_arrow_24px);
        this.isPlay = false;
    }
}
