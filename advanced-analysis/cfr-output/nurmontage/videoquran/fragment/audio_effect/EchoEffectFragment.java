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
import hazem.nurmontage.videoquran.databinding.FragmentEchoEffectBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$1;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$2;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment$3;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EchoEffectFragment
extends Fragment {
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

    static /* bridge */ /* synthetic */ EditMediaFragment$IEditMediaCallback cfr_renamed_214(EchoEffectFragment echoEffectFragment) {
        return echoEffectFragment.iEchoCallback;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_213(EchoEffectFragment echoEffectFragment) {
        return echoEffectFragment.isPlay;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_212(EchoEffectFragment echoEffectFragment) {
        return echoEffectFragment.tv_hint_delay;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_234(EchoEffectFragment echoEffectFragment) {
        return echoEffectFragment.tv_hint_repeat;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_219(EchoEffectFragment echoEffectFragment) {
        return echoEffectFragment.tv_hint_volume;
    }

    public EchoEffectFragment() {
    }

    public EchoEffectFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        this.iEchoCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void applyEchoEffect(boolean bl, boolean bl2) {
        Object object;
        float f;
        float f2;
        float f3;
        String string2;
        CharSequence charSequence;
        float f4;
        Object object2;
        int n;
        int n2;
        Object object3 = this;
        Object object4 = this.delaySeekBar;
        int n3 = object4.getProgress();
        Object object5 = this.repeatSeekBar;
        int n4 = object5.getProgress();
        int n5 = 1;
        n4 += n5;
        SeekBar seekBar = this.volumeSeekBar;
        int n6 = seekBar.getProgress();
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        if (!bl && (n2 = effectAudio.getDelays()) == n3 && (n2 = effectAudio.getDecays()) == (n = (object2 = this.repeatSeekBar).getProgress()) && (n2 = effectAudio.getVolume_echo()) == n6) {
            this.iEchoCallback.startPreview();
            return;
        }
        float f5 = effectAudio.getStart();
        float f6 = 1000.0f;
        f5 /= f6;
        float f7 = effectAudio.getEnd() / f6;
        n = object3.repeatSeekBar.getProgress();
        effectAudio.setDecays(n);
        effectAudio.setDelays(n3);
        effectAudio.setVolume_echo(n6);
        object2 = new ArrayList();
        Object object6 = Locale.US;
        Object object7 = Float.valueOf(f5);
        Object object8 = Float.valueOf(f7);
        object7 = new Object[]{object7, object8};
        object8 = "atrim=start=%.2f:end=%.2f";
        object6 = String.format((Locale)object6, (String)object8, (Object[])object7);
        object2.add(object6);
        object6 = "asetpts=N/SR/TB";
        object2.add(object6);
        int n7 = effectAudio.isRemoveNoice();
        if (n7 != 0) {
            object6 = "afftdn=nf=-25";
            object2.add(object6);
        }
        object6 = Locale.US;
        float f8 = effectAudio.getVolume();
        object7 = Float.valueOf(f8);
        object7 = new Object[]{object7};
        object8 = "volume=%.2f";
        object6 = String.format((Locale)object6, (String)object8, (Object[])object7);
        object2.add(object6);
        n7 = effectAudio.getFade_in();
        if (n7 > 0) {
            n7 = effectAudio.getFade_in();
            f4 = n7;
            object8 = "afade=t=in:st=0:d=";
            object7 = new StringBuilder((String)object8);
            object6 = ((StringBuilder)object7).append(f4).toString();
            object2.add(object6);
        }
        if ((n7 = effectAudio.getFade_out()) > 0) {
            n7 = effectAudio.getFade_out();
            f4 = n7;
            f7 = f7 - f5 - f4;
            object7 = "afade=t=out:st=";
            charSequence = new StringBuilder((String)object7);
            charSequence = ((StringBuilder)charSequence).append(f7);
            string2 = ":d=";
            charSequence = ((StringBuilder)charSequence).append(string2).append(f4).toString();
            object2.add(charSequence);
        }
        if ((n2 = (int)(effectAudio.isEnhance() ? 1 : 0)) != 0) {
            charSequence = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            object2.add(charSequence);
        }
        if ((charSequence = effectAudio.getReverbPreset()) != null) {
            charSequence = effectAudio.getReverbPreset();
            object2.add(charSequence);
        }
        n2 = effectAudio.getDecays();
        int n8 = 1065353216;
        f7 = 1.0f;
        if (n2 > 0 && (n2 = effectAudio.getDelays()) > 0) {
            float f9 = n6;
            n2 = 1120403456;
            f5 = f7 - (f9 /= 100.0f);
            n7 = 1008981770;
            f4 = 0.01f;
            f5 = Math.max(f4, f5);
            object7 = new StringBuilder();
            object8 = new StringBuilder();
            while (n5 <= n4) {
                int n9 = n3 * n5;
                double d = f5;
                double d2 = n5 + -1;
                int n10 = n3;
                double d3 = Math.pow(0.8, d2);
                f3 = (float)(d *= d3);
                n3 = 1008981770;
                float f10 = 0.01f;
                f3 = Math.max(f10, f3);
                ((StringBuilder)object7).append(n9);
                object4 = Locale.US;
                object3 = Float.valueOf(f3);
                object3 = new Object[]{object3};
                string2 = "%.2f";
                object3 = String.format((Locale)object4, string2, (Object[])object3);
                ((StringBuilder)object8).append((String)object3);
                if (n5 < n4) {
                    object3 = "|";
                    ((StringBuilder)object7).append((String)object3);
                    ((StringBuilder)object8).append((String)object3);
                }
                ++n5;
                n3 = n10;
                n8 = 1065353216;
                f7 = 1.0f;
                n7 = 1008981770;
                f4 = 0.01f;
                object3 = this;
            }
            f2 = n7;
            f3 = f4;
            f3 = Math.max(f4, f9);
            effectAudio.setOutGain(f3);
            object4 = ((StringBuilder)object8).toString();
            effectAudio.setDecays_cmd((String)object4);
            object4 = ((StringBuilder)object7).toString();
            effectAudio.setDelays_cmd((String)object4);
            object4 = Locale.US;
            n4 = 1065353216;
            f = 1.0f;
            object = Float.valueOf(f);
            object3 = Float.valueOf(f3);
            object3 = new Object[]{object, object3, object7, object8};
            object = "aecho=%.2f:%.2f:%s:%s";
            object3 = String.format((Locale)object4, (String)object, (Object[])object3);
            object2.add(object3);
        } else {
            n4 = n8;
            f = f7;
        }
        f3 = effectAudio.getSpeed();
        f2 = f3 == f ? 0 : (f3 > f ? 1 : -1);
        if (f2 != false) {
            f3 = effectAudio.getSpeed();
            object4 = this;
            object3 = this.buildSpeedFilters(f3);
            object2.addAll(object3);
        } else {
            object4 = this;
        }
        object3 = object4.iEchoCallback;
        if (object3 != null) {
            if (bl) {
                object5 = EffectAudioType.ECHO;
                object = object4.entityAudio;
                object3.updateEntity((EffectAudioType)((Object)object5), (EntityAudio)object);
                object3 = object4.iEchoCallback;
                object3.onCmdAll(effectAudio);
            } else {
                object3 = TextUtils.join((CharSequence)",", (Iterable)object2);
                if (bl2) {
                    object5 = object4.iEchoCallback;
                    object5.onCmdPlay((String)object3);
                } else {
                    object5 = object4.iEchoCallback;
                    object5.onCmd((String)object3);
                }
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
        Object object = this.iEchoCallback;
        if (object != null) {
            SeekBar seekBar;
            int n;
            object = this.entityAudio.getEffectAudio();
            int n2 = ((EffectAudio)object).getDelays();
            if (n2 != (n = (seekBar = this.delaySeekBar).getProgress()) || (n2 = ((EffectAudio)(object = this.entityAudio.getEffectAudio())).getDecays()) != (n = (seekBar = this.repeatSeekBar).getProgress()) || (n2 = ((EffectAudio)(object = this.entityAudio.getEffectAudio())).getVolume_echo()) != (n = (seekBar = this.volumeSeekBar).getProgress())) {
                n2 = 0;
                object = null;
                this.applyEchoEffect(false, false);
            }
            this.iEchoCallback.pausePreview();
            object = this.iEchoCallback;
            object.onDone();
        }
    }

    public static EchoEffectFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        EchoEffectFragment echoEffectFragment = instance;
        if (echoEffectFragment == null) {
            instance = echoEffectFragment = new EchoEffectFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return instance;
    }

    private void previewAudio() {
        int n;
        int n2 = this.isPlay;
        this.isPlay = n = n2 ^ 1;
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEchoCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            if (n2 == 0) {
                boolean bl = false;
                this.applyEchoEffect(false, true);
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

    /* synthetic */ void cfr_renamed_235(View view) {
        this.done();
    }

    /* synthetic */ void cfr_renamed_236(View view) {
        this.previewAudio();
    }

    /* synthetic */ void cfr_renamed_237(View view) {
        this.applyEchoEffect(true, false);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        object3 = null;
        object = FragmentEchoEffectBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentEchoEffectBinding)object).getRoot();
        object2 = this.entityAudio;
        if (object2 != null && (object2 = this.iEchoCallback) != null) {
            int n2 = R$id.tv_delay_size;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_hint_delay = object2;
            n2 = R$id.tv_repeat_size;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_hint_repeat = object2;
            n2 = R$id.tv_volume_size;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_hint_volume = object2;
            n2 = R$id.delaySeekBar;
            object2 = (SeekBar)object.findViewById(n2);
            this.delaySeekBar = object2;
            n = this.entityAudio.getEffectAudio().getDelays();
            object2.setProgress(n);
            object2 = this.delaySeekBar;
            object3 = new EchoEffectFragment$1(this);
            object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
            n2 = R$id.repeatSeekBar;
            object2 = (SeekBar)object.findViewById(n2);
            this.repeatSeekBar = object2;
            n = this.entityAudio.getEffectAudio().getDecays();
            object2.setProgress(n);
            object2 = this.repeatSeekBar;
            object3 = new EchoEffectFragment$2(this);
            object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
            n2 = R$id.volumeSeekBar;
            object2 = (SeekBar)object.findViewById(n2);
            this.volumeSeekBar = object2;
            n = this.entityAudio.getEffectAudio().getVolume_echo();
            object2.setProgress(n);
            object2 = this.volumeSeekBar;
            object3 = new EchoEffectFragment$3(this);
            object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
            object2 = this.tv_hint_delay;
            object3 = String.valueOf(this.delaySeekBar.getProgress());
            object2.setText((CharSequence)object3);
            object2 = this.tv_hint_repeat;
            object3 = String.valueOf(this.repeatSeekBar.getProgress());
            object2.setText((CharSequence)object3);
            object2 = this.tv_hint_volume;
            n = this.volumeSeekBar.getProgress();
            object3 = String.valueOf(n);
            object2.setText((CharSequence)object3);
            n2 = R$id.btn_done;
            object2 = object.findViewById(n2);
            object3 = new EchoEffectFragment$$ExternalSyntheticLambda0(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_play;
            object2 = (ImageButton)object.findViewById(n2);
            this.btnPreview = object2;
            object3 = new EchoEffectFragment$$ExternalSyntheticLambda1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_appl_all;
            object2 = object.findViewById(n2);
            object3 = new EchoEffectFragment$$ExternalSyntheticLambda2(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEchoCallback;
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

