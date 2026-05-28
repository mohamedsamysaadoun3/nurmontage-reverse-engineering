// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import hazem.nurmontage.videoquran.R$id;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import hazem.nurmontage.videoquran.R$drawable;
import android.widget.SeekBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.databinding.FragmentVolumeBinding;
import androidx.fragment.app.Fragment;

public class PitchFragment extends Fragment
{
    public static PitchFragment instance;
    private FragmentVolumeBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private EditMediaFragment$IEditMediaCallback iVolumeCallback;
    private boolean isPlay;
    private TextCustumFont tvProgress;
    private SeekBar volumeSeekBar;
    
    public PitchFragment() {
    }
    
    public PitchFragment(final EditMediaFragment$IEditMediaCallback iVolumeCallback, final EntityAudio entityAudio) {
        this.iVolumeCallback = iVolumeCallback;
        this.entityAudio = entityAudio;
    }
    
    private void applyVolume() {
        Math.pow(2.0, 0.08333333333333333);
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            iVolumeCallback.onCmd("asetrate=44100*1.2,atempo=0.8333");
        }
    }
    
    private void done() {
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            iVolumeCallback.pausePreview();
            this.iVolumeCallback.onDone();
        }
    }
    
    public static PitchFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final EntityAudio entityAudio) {
        if (PitchFragment.instance == null) {
            PitchFragment.instance = new PitchFragment(editMediaFragment$IEditMediaCallback, entityAudio);
        }
        return PitchFragment.instance;
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
        if (entityAudio == null) {
            return (View)root;
        }
        if (entityAudio.getMediaPlayer() == null) {
            return (View)root;
        }
        this.tvProgress = (TextCustumFont)((View)root).findViewById(R$id.tv_volume_size);
        (this.volumeSeekBar = (SeekBar)((View)root).findViewById(R$id.volumeSeekBar)).setMax(40);
        this.volumeSeekBar.setProgress(20);
        this.volumeSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new PitchFragment$1(this));
        ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new PitchFragment$$ExternalSyntheticLambda0(this));
        (this.btnPreview = (ImageButton)((View)root).findViewById(R$id.btn_play)).setOnClickListener((View$OnClickListener)new PitchFragment$$ExternalSyntheticLambda1(this));
        return (View)root;
    }
    
    public void onDestroyView() {
        final EditMediaFragment$IEditMediaCallback iVolumeCallback = this.iVolumeCallback;
        if (iVolumeCallback != null) {
            iVolumeCallback.pausePreview();
        }
        super.onDestroyView();
        PitchFragment.instance = null;
        this.binding = null;
    }
}
