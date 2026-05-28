// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter;
import hazem.nurmontage.videoquran.R$string;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.R$id;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import java.util.Collection;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$IReverbPresetCallback;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.databinding.FragmentReverbePresetBinding;
import androidx.fragment.app.Fragment;

public class ReverbePresetFragment extends Fragment
{
    public static ReverbePresetFragment instance;
    private FragmentReverbePresetBinding binding;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private ReverbeAdabter$IReverbPresetCallback iReverbPresetCallback;
    
    public ReverbePresetFragment() {
        this.iReverbPresetCallback = new ReverbePresetFragment$2(this);
    }
    
    public ReverbePresetFragment(final EditMediaFragment$IEditMediaCallback iEditMediaCallback, final EntityAudio entityAudio) {
        this.iReverbPresetCallback = new ReverbePresetFragment$2(this);
        this.iEditMediaCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }
    
    private void applyAll() {
        final EffectAudio effectAudio = this.entityAudio.getEffectAudio();
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
        this.iEditMediaCallback.updateEntity(EffectAudioType.REVERB, this.entityAudio);
        this.iEditMediaCallback.onCmdAll(effectAudio);
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
    
    public static ReverbePresetFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (ReverbePresetFragment.instance == null) {
            ReverbePresetFragment.instance = new ReverbePresetFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return ReverbePresetFragment.instance;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentReverbePresetBinding inflate = FragmentReverbePresetBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null) {
            if (this.entityAudio != null) {
                final RecyclerView recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv);
                recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
                final ArrayList list = new ArrayList();
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_normal), null));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_masjid), "aecho=0.9:0.4:900|1800:0.20|0.15"));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_masjid_2), "aecho=0.9:0.4:900:0.18"));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_studio), "aecho=0.8:0.35:400|700:0.20|0.15"));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_quiet_room), "aecho=0.6:0.3:300:0.12"));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_tiled_room), "aecho=0.9:0.4:600|1200:0.20|0.15"));
                list.add(new Reverbe(this.getResources().getString(R$string.reverb_deep), "aecho=0.6:0.35:1000:0.20"));
                recyclerView.setAdapter((RecyclerView$Adapter)new ReverbeAdabter(list, this.iReverbPresetCallback, this.entityAudio.getEffectAudio().getReverbPreset_index_list()));
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ReverbePresetFragment$1(this));
                ((View)root).findViewById(R$id.btn_appl_all).setOnClickListener((View$OnClickListener)new ReverbePresetFragment$$ExternalSyntheticLambda0(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        final EditMediaFragment$IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
        }
        this.iReverbPresetCallback = null;
        super.onDestroyView();
        ReverbePresetFragment.instance = null;
        this.binding = null;
    }
}
