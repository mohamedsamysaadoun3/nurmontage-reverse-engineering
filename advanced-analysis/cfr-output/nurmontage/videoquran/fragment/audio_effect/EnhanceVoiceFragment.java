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
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageButton
 *  androidx.appcompat.widget.SwitchCompat
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.databinding.FragmentRemoveNoiceBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment$1;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EnhanceVoiceFragment
extends Fragment {
    public static EnhanceVoiceFragment instance;
    private FragmentRemoveNoiceBinding binding;
    private ImageButton btnPreview;
    private SwitchCompat btn_remove_noice;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private boolean isPlay;

    static /* bridge */ /* synthetic */ void cfr_renamed_210(EnhanceVoiceFragment enhanceVoiceFragment, boolean bl) {
        enhanceVoiceFragment.apply(bl);
    }

    public EnhanceVoiceFragment() {
    }

    public EnhanceVoiceFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        this.iEditMediaCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void apply(boolean bl) {
        float f;
        int n;
        float f2;
        Object object = this.entityAudio.getEffectAudio();
        Object object2 = this.btn_remove_noice;
        int n2 = object2.isChecked();
        ((EffectAudio)object).setEnhance(n2 != 0);
        float f3 = ((EffectAudio)object).getStart();
        float f4 = 1000.0f;
        float f5 = ((EffectAudio)object).getEnd() / f4;
        Object object3 = new ArrayList();
        Object[] objectArray = Locale.US;
        Object object4 = Float.valueOf(f3 /= f4);
        Object object5 = Float.valueOf(f5);
        object4 = new Object[]{object4, object5};
        object5 = "atrim=start=%.2f:end=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object5, (Object[])object4);
        object3.add(objectArray);
        objectArray = "asetpts=N/SR/TB";
        object3.add(objectArray);
        boolean n22 = ((EffectAudio)object).isRemoveNoice();
        if (n22) {
            objectArray = "afftdn=nf=-25";
            object3.add(objectArray);
        }
        objectArray = Locale.US;
        float f6 = ((EffectAudio)object).getVolume();
        object4 = Float.valueOf(f6);
        object4 = new Object[]{object4};
        object5 = "volume=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object5, (Object[])object4);
        object3.add(objectArray);
        int n3 = ((EffectAudio)object).getFade_in();
        if (n3 > 0) {
            int n4 = ((EffectAudio)object).getFade_in();
            f2 = n4;
            object5 = "afade=t=in:st=0:d=";
            object4 = new StringBuilder((String)object5);
            objectArray = ((StringBuilder)object4).append(f2).toString();
            object3.add(objectArray);
        }
        if ((n = ((EffectAudio)object).getFade_out()) > 0) {
            int n5 = ((EffectAudio)object).getFade_out();
            f2 = n5;
            f5 = f5 - f3 - f2;
            object4 = "afade=t=out:st=";
            object2 = new StringBuilder((String)object4);
            object2 = ((StringBuilder)object2).append(f5);
            String string2 = ":d=";
            object2 = ((StringBuilder)object2).append(string2).append(f2).toString();
            object3.add(object2);
        }
        if ((n2 = ((EffectAudio)object).isEnhance()) != 0) {
            object2 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            object3.add(object2);
        }
        if ((object2 = ((EffectAudio)object).getReverbPreset()) != null) {
            object2 = ((EffectAudio)object).getReverbPreset();
            object3.add(object2);
        }
        n2 = ((EffectAudio)object).getDecays();
        f5 = 1.0f;
        if (n2 > 0) {
            object2 = Locale.US;
            objectArray = Float.valueOf(f5);
            f6 = ((EffectAudio)object).getOutGain();
            object4 = Float.valueOf(f6);
            object5 = ((EffectAudio)object).getDelays_cmd();
            String string3 = ((EffectAudio)object).getDecays_cmd();
            objectArray = new Object[]{objectArray, object4, object5, string3};
            object4 = "aecho=%.2f:%.2f:%s:%s";
            object2 = String.format((Locale)object2, (String)object4, objectArray);
            object3.add(object2);
        }
        if ((n2 = (int)((f = (f3 = ((EffectAudio)object).getSpeed()) - f5) == 0.0f ? 0 : (f > 0.0f ? 1 : -1))) != 0) {
            f3 = ((EffectAudio)object).getSpeed();
            object2 = this.buildSpeedFilters(f3);
            object3.addAll(object2);
        }
        if ((object2 = this.iEditMediaCallback) != null) {
            if (bl) {
                Object object6 = EffectAudioType.ENHANCE;
                object3 = this.entityAudio;
                object2.updateEntity((EffectAudioType)((Object)object6), (EntityAudio)object3);
                object6 = this.iEditMediaCallback;
                object6.onCmdAll((EffectAudio)object);
            } else {
                String string4 = TextUtils.join((CharSequence)",", object3);
                object = this.iEditMediaCallback;
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

    public static EnhanceVoiceFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        EnhanceVoiceFragment enhanceVoiceFragment = instance;
        if (enhanceVoiceFragment == null) {
            instance = enhanceVoiceFragment = new EnhanceVoiceFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return instance;
    }

    private void onDone() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback.onDone();
        }
    }

    private void preview() {
        int n;
        int n2 = this.isPlay;
        this.isPlay = n = n2 ^ 1;
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
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

    /* synthetic */ void cfr_renamed_218(View view) {
        this.apply(true);
    }

    /* synthetic */ void cfr_renamed_216(View view) {
        this.onDone();
    }

    /* synthetic */ void cfr_renamed_215(View view) {
        this.preview();
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        boolean bl = false;
        object3 = null;
        object = FragmentRemoveNoiceBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentRemoveNoiceBinding)object).getRoot();
        object2 = this.iEditMediaCallback;
        if (object2 != null && (object2 = this.entityAudio) != null) {
            int n = R$id.btn_remove_noice;
            object2 = (SwitchCompat)object.findViewById(n);
            this.btn_remove_noice = object2;
            bl = this.entityAudio.getEffectAudio().isEnhance();
            object2.setChecked(bl);
            object2 = this.btn_remove_noice;
            object3 = new EnhanceVoiceFragment$1(this);
            object2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object3);
            n = R$id.tv_remove_noice;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.getResources();
            int n2 = R$string.enhance_voice;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.btn_appl_all;
            object2 = object.findViewById(n);
            object3 = new EnhanceVoiceFragment$$ExternalSyntheticLambda0(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_done;
            object2 = object.findViewById(n);
            object3 = new EnhanceVoiceFragment$$ExternalSyntheticLambda1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_play;
            object2 = (ImageButton)object.findViewById(n);
            this.btnPreview = object2;
            object3 = new EnhanceVoiceFragment$$ExternalSyntheticLambda2(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
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

