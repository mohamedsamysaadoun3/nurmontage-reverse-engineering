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
import hazem.nurmontage.videoquran.databinding.FragmentFadeInOutBinding;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$1;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$2;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FadeInOutFragment
extends Fragment {
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

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_230(FadeInOutFragment fadeInOutFragment) {
        return fadeInOutFragment.hint_fade_in;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_231(FadeInOutFragment fadeInOutFragment) {
        return fadeInOutFragment.hint_fade_out;
    }

    public FadeInOutFragment() {
    }

    public FadeInOutFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        this.iEditMediaCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void applyFade(boolean bl, boolean bl2) {
        float f;
        float f2;
        float f3;
        Object object;
        int n;
        float f4;
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        Object object2 = this.entityAudio;
        float f5 = ((Entity)object2).getFade_in();
        float f6 = f5 - (f4 = (float)(n = (object = this.fadeInSeekBar).getProgress()));
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 == false && (f7 = (f3 = (f5 = ((Entity)(object2 = this.entityAudio)).getFade_out()) - (f4 = (float)(n = (object = this.fadeOutSeekBar).getProgress()))) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1)) == false) {
            if (bl) {
                EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
                editMediaFragment$IEditMediaCallback.onDone();
            }
            return;
        }
        f7 = this.fadeInSeekBar.getProgress();
        effectAudio.setFade_in((int)f7);
        object2 = this.fadeOutSeekBar;
        f7 = object2.getProgress();
        effectAudio.setFade_out((int)f7);
        f5 = effectAudio.getStart();
        n = 1148846080;
        f4 = 1000.0f;
        float f8 = effectAudio.getEnd() / f4;
        object = new ArrayList();
        Object[] objectArray = Locale.US;
        Object object3 = Float.valueOf(f5 /= f4);
        Object object4 = Float.valueOf(f8);
        object3 = new Object[]{object3, object4};
        object4 = "atrim=start=%.2f:end=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        object.add(objectArray);
        objectArray = "asetpts=N/SR/TB";
        object.add(objectArray);
        int n2 = effectAudio.isRemoveNoice();
        if (n2 != 0) {
            objectArray = "afftdn=nf=-25";
            object.add(objectArray);
        }
        objectArray = Locale.US;
        float f9 = effectAudio.getVolume();
        object3 = Float.valueOf(f9);
        object3 = new Object[]{object3};
        object4 = "volume=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        object.add(objectArray);
        n2 = effectAudio.getFade_in();
        if (n2 > 0) {
            n2 = effectAudio.getFade_in();
            f2 = n2;
            object4 = "afade=t=in:st=0:d=";
            object3 = new StringBuilder((String)object4);
            objectArray = ((StringBuilder)object3).append(f2).toString();
            object.add(objectArray);
        }
        if ((n2 = effectAudio.getFade_out()) > 0) {
            n2 = effectAudio.getFade_out();
            f2 = n2;
            f8 = f8 - f5 - f2;
            object3 = "afade=t=out:st=";
            object2 = new StringBuilder((String)object3);
            object2 = ((StringBuilder)object2).append(f8);
            String string2 = ":d=";
            object2 = ((StringBuilder)object2).append(string2).append(f2).toString();
            object.add(object2);
        }
        if ((f7 = (float)effectAudio.isEnhance()) != false) {
            object2 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            object.add(object2);
        }
        if ((object2 = effectAudio.getReverbPreset()) != null) {
            object2 = effectAudio.getReverbPreset();
            object.add(object2);
        }
        f7 = effectAudio.getDecays();
        f8 = 1.0f;
        if (f7 > 0) {
            object2 = Locale.US;
            objectArray = Float.valueOf(f8);
            f9 = effectAudio.getOutGain();
            object3 = Float.valueOf(f9);
            object4 = effectAudio.getDelays_cmd();
            String string3 = effectAudio.getDecays_cmd();
            objectArray = new Object[]{objectArray, object3, object4, string3};
            object3 = "aecho=%.2f:%.2f:%s:%s";
            object2 = String.format((Locale)object2, (String)object3, objectArray);
            object.add(object2);
        }
        if ((f7 = (f = (f5 = effectAudio.getSpeed()) - f8) == 0.0f ? 0 : (f > 0.0f ? 1 : -1)) != false) {
            f5 = effectAudio.getSpeed();
            object2 = this.buildSpeedFilters(f5);
            object.addAll(object2);
        }
        object2 = TextUtils.join((CharSequence)",", (Iterable)object);
        object = this.iEditMediaCallback;
        if (object != null) {
            if (bl) {
                Object object5 = EffectAudioType.FADE;
                EntityAudio entityAudio = this.entityAudio;
                object.updateEntity((EffectAudioType)((Object)object5), entityAudio);
                object5 = this.iEditMediaCallback;
                object5.onCmdAll(effectAudio);
            } else if (bl2) {
                object.onCmdPlay((String)object2);
            } else {
                object.onCmd((String)object2);
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
        Object object = this.iEditMediaCallback;
        if (object != null) {
            SeekBar seekBar;
            int n;
            object = this.entityAudio.getEffectAudio();
            int n2 = ((EffectAudio)object).getFade_in();
            if (n2 != (n = (seekBar = this.fadeInSeekBar).getProgress()) || (n2 = ((EffectAudio)(object = this.entityAudio.getEffectAudio())).getFade_out()) != (n = (seekBar = this.fadeOutSeekBar).getProgress())) {
                n2 = 0;
                object = null;
                this.applyFade(false, false);
            }
            this.iEditMediaCallback.pausePreview();
            object = this.iEditMediaCallback;
            object.onDone();
        }
    }

    public static FadeInOutFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        FadeInOutFragment fadeInOutFragment = instance;
        if (fadeInOutFragment == null) {
            instance = fadeInOutFragment = new FadeInOutFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return instance;
    }

    private void previewAudio() {
        int n;
        int n2 = this.isPlay;
        this.isPlay = n = n2 ^ 1;
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            if (n2 == 0) {
                boolean bl = false;
                this.applyFade(false, true);
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

    /* synthetic */ void cfr_renamed_232(View view) {
        this.done();
    }

    /* synthetic */ void cfr_renamed_233(View view) {
        this.previewAudio();
    }

    /* synthetic */ void cfr_renamed_229(View view) {
        this.applyFade(true, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        float f = 0.0f;
        object3 = null;
        object = FragmentFadeInOutBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentFadeInOutBinding)object).getRoot();
        object2 = this.entityAudio;
        if (object2 == null) {
            return object;
        }
        if ((object2 = object2.getMediaPlayer()) == null) {
            return object;
        }
        int n2 = R$id.hint_fade_in;
        object2 = (TextCustumFont)object.findViewById(n2);
        this.hint_fade_in = object2;
        n2 = R$id.hint_fade_out;
        object2 = (TextCustumFont)object.findViewById(n2);
        this.hint_fade_out = object2;
        n2 = R$id.fadeInSeekBar;
        object2 = (SeekBar)object.findViewById(n2);
        this.fadeInSeekBar = object2;
        n2 = R$id.fadeOutSeekBar;
        object2 = (SeekBar)object.findViewById(n2);
        this.fadeOutSeekBar = object2;
        float f2 = this.entityAudio.getRect().right;
        f = this.entityAudio.getSecond_in_screen();
        f2 /= f;
        f = this.entityAudio.getRect().left;
        float f3 = this.entityAudio.getSecond_in_screen();
        n2 = (int)((f2 - (f /= f3)) * 0.5f);
        this.fadeInSeekBar.setMax(n2);
        this.fadeOutSeekBar.setMax(n2);
        object2 = this.fadeInSeekBar;
        n = this.entityAudio.getEffectAudio().getFade_in();
        object2.setProgress(n);
        object2 = this.fadeOutSeekBar;
        n = this.entityAudio.getEffectAudio().getFade_out();
        object2.setProgress(n);
        object2 = this.hint_fade_in;
        object3 = String.valueOf(this.fadeInSeekBar.getProgress());
        object2.setText((CharSequence)object3);
        object2 = this.hint_fade_out;
        object3 = String.valueOf(this.fadeOutSeekBar.getProgress());
        object2.setText((CharSequence)object3);
        object2 = this.fadeInSeekBar;
        object3 = new FadeInOutFragment$1(this);
        object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
        object2 = this.fadeOutSeekBar;
        object3 = new FadeInOutFragment$2(this);
        object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
        n2 = R$id.btn_done;
        object2 = object.findViewById(n2);
        object3 = new FadeInOutFragment$$ExternalSyntheticLambda0(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_play;
        object2 = (ImageButton)object.findViewById(n2);
        this.btnPreview = object2;
        object3 = new FadeInOutFragment$$ExternalSyntheticLambda1(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_appl_all;
        object2 = object.findViewById(n2);
        object3 = new FadeInOutFragment$$ExternalSyntheticLambda2(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        return object;
    }

    public void onDestroyView() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
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

