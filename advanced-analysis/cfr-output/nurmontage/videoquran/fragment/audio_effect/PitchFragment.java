/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.databinding.FragmentVolumeBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment$1;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class PitchFragment
extends Fragment {
    public static PitchFragment instance;
    private FragmentVolumeBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iVolumeCallback;
    private boolean isPlay;
    private TextCustumFont tvProgress;
    private SeekBar volumeSeekBar;

    static /* bridge */ /* synthetic */ boolean cfr_renamed_213(PitchFragment pitchFragment) {
        return pitchFragment.isPlay;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_220(PitchFragment pitchFragment) {
        return pitchFragment.tvProgress;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_221(PitchFragment pitchFragment) {
        pitchFragment.applyVolume();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_222(PitchFragment pitchFragment) {
        pitchFragment.previewAudio();
    }

    public PitchFragment() {
    }

    public PitchFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        this.iVolumeCallback = editMediaFragment$IEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    private void applyVolume() {
        double d = 2.0;
        double d2 = 0.08333333333333333;
        Math.pow(d, d2);
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            String string2 = "asetrate=44100*1.2,atempo=0.8333";
            editMediaFragment$IEditMediaCallback.onCmd(string2);
        }
    }

    private void done() {
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback.pausePreview();
            editMediaFragment$IEditMediaCallback = this.iVolumeCallback;
            editMediaFragment$IEditMediaCallback.onDone();
        }
    }

    public static PitchFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, EntityAudio entityAudio) {
        PitchFragment pitchFragment = instance;
        if (pitchFragment == null) {
            instance = pitchFragment = new PitchFragment(editMediaFragment$IEditMediaCallback, entityAudio);
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

    /* synthetic */ void cfr_renamed_240(View view) {
        this.done();
    }

    /* synthetic */ void cfr_renamed_241(View view) {
        this.previewAudio();
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
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
        int n = R$id.tv_volume_size;
        object2 = (TextCustumFont)object.findViewById(n);
        this.tvProgress = object2;
        n = R$id.volumeSeekBar;
        object2 = (SeekBar)object.findViewById(n);
        this.volumeSeekBar = object2;
        object2.setMax(40);
        this.volumeSeekBar.setProgress(20);
        object2 = this.volumeSeekBar;
        object3 = new PitchFragment$1(this);
        object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
        n = R$id.btn_done;
        object2 = object.findViewById(n);
        object3 = new PitchFragment$$ExternalSyntheticLambda0(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_play;
        object2 = (ImageButton)object.findViewById(n);
        this.btnPreview = object2;
        object3 = new PitchFragment$$ExternalSyntheticLambda1(this);
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
}

