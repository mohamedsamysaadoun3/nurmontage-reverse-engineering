/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$IReverbPresetCallback;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.databinding.FragmentReverbePresetBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.Reverbe;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment$1;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment$2;
import hazem.nurmontage.videoquran.model.EffectAudio;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReverbePresetFragment
extends Fragment {
    public static ReverbePresetFragment instance;
    private FragmentReverbePresetBinding binding;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private ReverbeAdabter$IReverbPresetCallback iReverbPresetCallback;

    static /* bridge */ /* synthetic */ EntityAudio cfr_renamed_225(ReverbePresetFragment reverbePresetFragment) {
        return reverbePresetFragment.entityAudio;
    }

    static /* bridge */ /* synthetic */ EditMediaFragment$IEditMediaCallback cfr_renamed_69(ReverbePresetFragment reverbePresetFragment) {
        return reverbePresetFragment.iEditMediaCallback;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_226(ReverbePresetFragment reverbePresetFragment, float f) {
        return reverbePresetFragment.buildSpeedFilters(f);
    }

    public ReverbePresetFragment() {
        ReverbePresetFragment$2 reverbePresetFragment$2 = new ReverbePresetFragment$2(this);
        this.iReverbPresetCallback = reverbePresetFragment$2;
    }

    public ReverbePresetFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        ReverbePresetFragment$2 reverbePresetFragment$2 = new ReverbePresetFragment$2(this);
        this.iReverbPresetCallback = reverbePresetFragment$2;
        this.iEditMediaCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void applyAll() {
        float f;
        int n;
        Object object;
        Object object2;
        float f2;
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        float f3 = effectAudio.getStart();
        float f4 = 1000.0f;
        float f5 = effectAudio.getEnd() / f4;
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
        int n2 = effectAudio.isRemoveNoice();
        if (n2 != 0) {
            objectArray = "afftdn=nf=-25";
            object3.add(objectArray);
        }
        objectArray = Locale.US;
        float f6 = effectAudio.getVolume();
        object4 = Float.valueOf(f6);
        object4 = new Object[]{object4};
        object5 = "volume=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object5, (Object[])object4);
        object3.add(objectArray);
        n2 = effectAudio.getFade_in();
        if (n2 > 0) {
            n2 = effectAudio.getFade_in();
            f2 = n2;
            object5 = "afade=t=in:st=0:d=";
            object4 = new StringBuilder((String)object5);
            objectArray = ((StringBuilder)object4).append(f2).toString();
            object3.add(objectArray);
        }
        if ((n2 = effectAudio.getFade_out()) > 0) {
            n2 = effectAudio.getFade_out();
            f2 = n2;
            f5 = f5 - f3 - f2;
            object4 = "afade=t=out:st=";
            object2 = new StringBuilder((String)object4);
            object2 = ((StringBuilder)object2).append(f5);
            object = ":d=";
            object2 = ((StringBuilder)object2).append((String)object).append(f2).toString();
            object3.add(object2);
        }
        if ((n = effectAudio.isEnhance()) != 0) {
            object2 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            object3.add(object2);
        }
        if ((object2 = effectAudio.getReverbPreset()) != null) {
            object2 = effectAudio.getReverbPreset();
            object3.add(object2);
        }
        n = effectAudio.getDecays();
        f5 = 1.0f;
        if (n > 0) {
            object2 = Locale.US;
            objectArray = Float.valueOf(f5);
            f6 = effectAudio.getOutGain();
            object4 = Float.valueOf(f6);
            object5 = effectAudio.getDelays_cmd();
            String string2 = effectAudio.getDecays_cmd();
            objectArray = new Object[]{objectArray, object4, object5, string2};
            object4 = "aecho=%.2f:%.2f:%s:%s";
            object2 = String.format((Locale)object2, (String)object4, objectArray);
            object3.add(object2);
        }
        if ((n = (int)((f = (f3 = effectAudio.getSpeed()) - f5) == 0.0f ? 0 : (f > 0.0f ? 1 : -1))) != 0) {
            f3 = effectAudio.getSpeed();
            object2 = this.buildSpeedFilters(f3);
            object3.addAll(object2);
        }
        object2 = this.iEditMediaCallback;
        object3 = EffectAudioType.REVERB;
        object = this.entityAudio;
        object2.updateEntity((EffectAudioType)((Object)object3), (EntityAudio)object);
        this.iEditMediaCallback.onCmdAll(effectAudio);
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

    public static ReverbePresetFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        ReverbePresetFragment reverbePresetFragment = instance;
        if (reverbePresetFragment == null) {
            instance = reverbePresetFragment = new ReverbePresetFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return instance;
    }

    /* synthetic */ void cfr_renamed_227(View view) {
        this.applyAll();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentReverbePresetBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentReverbePresetBinding)object).getRoot();
        object2 = this.iEditMediaCallback;
        if (object2 != null && (object2 = this.entityAudio) != null) {
            int n = R$id.rv;
            object2 = (RecyclerView)object.findViewById(n);
            Object object4 = this.getContext();
            object3 = new LinearLayoutManager((Context)object4);
            object2.setLayoutManager((RecyclerView.LayoutManager)object3);
            object2.setHasFixedSize(true);
            object2.setItemAnimator(null);
            object4 = new ArrayList();
            Object object5 = this.getResources();
            int n2 = R$string.reverb_normal;
            object5 = object5.getString(n2);
            Object object6 = new Reverbe((String)object5, null);
            object4.add(object6);
            object6 = this.getResources();
            int n3 = R$string.reverb_masjid;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.9:0.4:900|1800:0.20|0.15");
            object4.add(object3);
            object6 = this.getResources();
            n3 = R$string.reverb_masjid_2;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.9:0.4:900:0.18");
            object4.add(object3);
            object6 = this.getResources();
            n3 = R$string.reverb_studio;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.8:0.35:400|700:0.20|0.15");
            object4.add(object3);
            object6 = this.getResources();
            n3 = R$string.reverb_quiet_room;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.6:0.3:300:0.12");
            object4.add(object3);
            object6 = this.getResources();
            n3 = R$string.reverb_tiled_room;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.9:0.4:600|1200:0.20|0.15");
            object4.add(object3);
            object6 = this.getResources();
            n3 = R$string.reverb_deep;
            object6 = object6.getString(n3);
            object3 = new Reverbe((String)object6, "aecho=0.6:0.35:1000:0.20");
            object4.add(object3);
            object6 = this.iReverbPresetCallback;
            object5 = this.entityAudio.getEffectAudio();
            n3 = ((EffectAudio)object5).getReverbPreset_index_list();
            object3 = new ReverbeAdabter((List)object4, (ReverbeAdabter$IReverbPresetCallback)object6, n3);
            object2.setAdapter((RecyclerView.Adapter)object3);
            n = R$id.btn_done;
            object2 = object.findViewById(n);
            object3 = new ReverbePresetFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_appl_all;
            object2 = object.findViewById(n);
            object3 = new ReverbePresetFragment$$ExternalSyntheticLambda0(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iEditMediaCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback.pausePreview();
        }
        this.iReverbPresetCallback = null;
        super.onDestroyView();
        instance = null;
        this.binding = null;
    }
}

