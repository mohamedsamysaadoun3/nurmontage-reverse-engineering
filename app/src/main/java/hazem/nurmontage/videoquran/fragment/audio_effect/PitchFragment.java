package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.databinding.FragmentVolumeBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public class PitchFragment extends Fragment {
    public static PitchFragment instance;
    private FragmentVolumeBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private EditMediaFragment.IEditMediaCallback iVolumeCallback;
    private boolean isPlay;
    private TextCustumFont tvProgress;
    private SeekBar volumeSeekBar;

    public static PitchFragment getInstance(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        if (instance == null) {
            instance = new PitchFragment(iEditMediaCallback, entityAudio);
        }
        return instance;
    }

    public PitchFragment(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        this.iVolumeCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    public PitchFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentVolumeBinding inflate = FragmentVolumeBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        EntityAudio entityAudio = this.entityAudio;
        if (entityAudio == null || entityAudio.getMediaPlayer() == null) {
            return root;
        }
        this.tvProgress = (TextCustumFont) root.findViewById(C2014R.id.tv_volume_size);
        SeekBar seekBar = (SeekBar) root.findViewById(C2014R.id.volumeSeekBar);
        this.volumeSeekBar = seekBar;
        seekBar.setMax(40);
        this.volumeSeekBar.setProgress(20);
        this.volumeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int resourceId, boolean isFlag) {
                if (isFlag) {
                    PitchFragment.this.tvProgress.setText(String.valueOf(resourceId));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
                if (PitchFragment.this.isPlay) {
                    PitchFragment.this.previewAudio();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
                PitchFragment.this.applyVolume();
            }
        });
        root.findViewById(C2014R.id.btn_done).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PitchFragment.this.m653x317f43af(view);
            }
        });
        ImageButton imageButton = (ImageButton) root.findViewById(C2014R.id.btn_play);
        this.btnPreview = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PitchFragment.this.m654x7f3ebbb0(view);
            }
        });
        return root;
    }

    /* renamed from: lambda$onCreateView$0$hazem-nurmontage-videoquran-fragment-audio_effect-PitchFragment */
    /* synthetic */ void m653x317f43af(View view) {
        done();
    }

    /* renamed from: lambda$onCreateView$1$hazem-nurmontage-videoquran-fragment-audio_effect-PitchFragment */
    /* synthetic */ void m654x7f3ebbb0(View view) {
        previewAudio();
    }

    private void done() {
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iVolumeCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
            this.iVolumeCallback.onDone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previewAudio() {
        boolean isFlag = this.isPlay;
        this.isPlay = !isFlag;
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iVolumeCallback;
        if (iEditMediaCallback != null) {
            if (!isFlag) {
                iEditMediaCallback.startPreview();
                this.btnPreview.setImageResource(C2014R.drawable.pause_24px);
            } else {
                iEditMediaCallback.pausePreview();
                this.btnPreview.setImageResource(C2014R.drawable.play_arrow_24px);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyVolume() {
        Math.pow(2.0d, 0.08333333333333333d);
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iVolumeCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.onCmd("asetrate=44100*1.2,atempo=0.8333");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iVolumeCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
        }
        super.onDestroyView();
        instance = null;
        this.binding = null;
    }
}
