/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.databinding.FragmentVolumeBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment$1;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class VolumeFragment
extends Fragment {
    public static VolumeFragment instance;
    private FragmentVolumeBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iVolumeCallback;
    private boolean isPlay;
    private TextCustumFont tvProgress;
    private SeekBar volumeSeekBar;

    static /* bridge */ /* synthetic */ boolean cfr_renamed_213(VolumeFragment volumeFragment) {
        return volumeFragment.isPlay;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_220(VolumeFragment volumeFragment) {
        return volumeFragment.tvProgress;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_221(VolumeFragment volumeFragment, boolean bl) {
        volumeFragment.applyVolume(bl);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_222(VolumeFragment volumeFragment) {
        volumeFragment.previewAudio();
    }

    public VolumeFragment() {
    }

    public VolumeFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        this.iVolumeCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void applyVolume(boolean bl) {
        float f;
        float f2;
        Object object = this.volumeSeekBar;
        int n = object.getProgress();
        float f3 = n;
        float f4 = 100.0f;
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        effectAudio.setVolume(f3 /= f4);
        f3 = effectAudio.getStart();
        float f5 = 1000.0f;
        float f6 = effectAudio.getEnd() / f5;
        Object object2 = new ArrayList();
        Object[] objectArray = Locale.US;
        Object object3 = Float.valueOf(f3 /= f5);
        Object object4 = Float.valueOf(f6);
        object3 = new Object[]{object3, object4};
        object4 = "atrim=start=%.2f:end=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        object2.add(objectArray);
        objectArray = "asetpts=N/SR/TB";
        object2.add(objectArray);
        int n2 = effectAudio.isRemoveNoice();
        if (n2 != 0) {
            objectArray = "afftdn=nf=-25";
            object2.add(objectArray);
        }
        objectArray = Locale.US;
        float f7 = effectAudio.getVolume();
        object3 = Float.valueOf(f7);
        object3 = new Object[]{object3};
        object4 = "volume=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        object2.add(objectArray);
        n2 = effectAudio.getFade_in();
        if (n2 > 0) {
            n2 = effectAudio.getFade_in();
            f2 = n2;
            object4 = "afade=t=in:st=0:d=";
            object3 = new StringBuilder((String)object4);
            objectArray = ((StringBuilder)object3).append(f2).toString();
            object2.add(objectArray);
        }
        if ((n2 = effectAudio.getFade_out()) > 0) {
            n2 = effectAudio.getFade_out();
            f2 = n2;
            f6 = f6 - f3 - f2;
            object3 = "afade=t=out:st=";
            object = new StringBuilder((String)object3);
            object = ((StringBuilder)object).append(f6);
            String string2 = ":d=";
            object = ((StringBuilder)object).append(string2).append(f2).toString();
            object2.add(object);
        }
        if ((n = (int)(effectAudio.isEnhance() ? 1 : 0)) != 0) {
            object = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            object2.add(object);
        }
        if ((object = effectAudio.getReverbPreset()) != null) {
            object = effectAudio.getReverbPreset();
            object2.add(object);
        }
        n = effectAudio.getDecays();
        f6 = 1.0f;
        if (n > 0) {
            object = Locale.US;
            objectArray = Float.valueOf(f6);
            f7 = effectAudio.getOutGain();
            object3 = Float.valueOf(f7);
            object4 = effectAudio.getDelays_cmd();
            String string3 = effectAudio.getDecays_cmd();
            objectArray = new Object[]{objectArray, object3, object4, string3};
            object3 = "aecho=%.2f:%.2f:%s:%s";
            object = String.format((Locale)object, (String)object3, objectArray);
            object2.add(object);
        }
        if ((n = (int)((f = (f3 = effectAudio.getSpeed()) - f6) == 0.0f ? 0 : (f > 0.0f ? 1 : -1))) != 0) {
            f3 = effectAudio.getSpeed();
            object = this.buildSpeedFilters(f3);
            object2.addAll(object);
        }
        if ((object = this.iVolumeCallback) != null) {
            if (bl) {
                Object object5 = EffectAudioType.VOLUME;
                object2 = this.entityAudio;
                object.updateEntity((EffectAudioType)((Object)object5), (EntityAudio)object2);
                object5 = this.iVolumeCallback;
                object5.onCmdAll(effectAudio);
            } else {
                String string4 = TextUtils.join((CharSequence)",", object2);
                object = this.iVolumeCallback;
                object.onCmd(string4);
            }
        }
    }

    private List buildSpeedFilters(float f) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        float f2 = 0.5f;
        float f3 = f == f2 ? 0 : (f < f2 ? -1 : 1);
        String string2 = "atempo=%.2f";
        if (f3 < 0) {
            while ((f3 = f == f2 ? 0 : (f < f2 ? -1 : 1)) < 0) {
                String string3 = "atempo=0.5";
                arrayList.add(string3);
                f /= f2;
            }
            Locale locale = Locale.US;
            Object object = Float.valueOf(f);
            object = new Object[]{object};
            object = String.format(locale, string2, object);
            arrayList.add(object);
        } else {
            f2 = 2.0f;
            float f4 = f - f2;
            f3 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
            if (f3 > 0) {
                while ((f3 = f == f2 ? 0 : (f > f2 ? 1 : -1)) > 0) {
                    String string4 = "atempo=2.0";
                    arrayList.add(string4);
                    f /= f2;
                }
                Locale locale = Locale.US;
                Object object = Float.valueOf(f);
                object = new Object[]{object};
                object = String.format(locale, string2, object);
                arrayList.add(object);
            } else {
                Locale locale = Locale.US;
                Object object = Float.valueOf(f);
                object = new Object[]{object};
                object = String.format(locale, string2, object);
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    private void done() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback.pausePreview();
            editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
            editMediaFragment$IEditMediaCallback.onDone();
        }
    }

    public static VolumeFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        VolumeFragment volumeFragment = instance;
        if (volumeFragment == null) {
            instance = volumeFragment = new VolumeFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return instance;
    }

    private void previewAudio() {
        int n;
        int n2 = this.isPlay;
        this.isPlay = n = n2 ^ 1;
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            if (n2 == 0) {
                editMediaFragment$IEditMediaCallback.startPreview();
                ImageButton imageButton = this.btnPreview;
                n = R$drawable.pause_24px;
                imageButton.setImageResource(n);
            } else {
                editMediaFragment$IEditMediaCallback.pausePreview();
                ImageButton imageButton = this.btnPreview;
                n = R$drawable.play_arrow_24px;
                imageButton.setImageResource(n);
            }
        }
    }

    /* synthetic */ void cfr_renamed_243(View view) {
        this.done();
    }

    /* synthetic */ void cfr_renamed_211(View view) {
        this.previewAudio();
    }

    /* synthetic */ void cfr_renamed_238(View view) {
        this.applyVolume(true);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        object3 = null;
        object = FragmentVolumeBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentVolumeBinding)object).getRoot();
        object2 = this.entityAudio;
        if (object2 == null) {
            return object;
        }
        if ((object2 = object2.getMediaPlayer()) == null) {
            return object;
        }
        int n2 = R$id.tv_volume_size;
        object2 = (TextCustumFont)object.findViewById(n2);
        this.tvProgress = object2;
        n2 = (int)(this.entityAudio.getEffectAudio().getVolume() * 100.0f);
        object3 = this.tvProgress;
        String string2 = String.valueOf(n2);
        object3.setText((CharSequence)string2);
        n = R$id.volumeSeekBar;
        object3 = (SeekBar)object.findViewById(n);
        this.volumeSeekBar = object3;
        object3.setProgress(n2);
        object2 = this.volumeSeekBar;
        object3 = new VolumeFragment$1(this);
        object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
        n2 = R$id.btn_done;
        object2 = object.findViewById(n2);
        object3 = new VolumeFragment$$ExternalSyntheticLambda0(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_play;
        object2 = (ImageButton)object.findViewById(n2);
        this.btnPreview = object2;
        object3 = new VolumeFragment$$ExternalSyntheticLambda1(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_appl_all;
        object2 = object.findViewById(n2);
        object3 = new VolumeFragment$$ExternalSyntheticLambda2(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        return object;
    }

    public void onDestroyView() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback.pausePreview();
        }
        super.onDestroyView();
        instance = null;
        this.binding = null;
    }

    public void updateButton() {
        ImageButton imageButton = this.btnPreview;
        int n = R$drawable.play_arrow_24px;
        imageButton.setImageResource(n);
        this.isPlay = false;
    }
}

