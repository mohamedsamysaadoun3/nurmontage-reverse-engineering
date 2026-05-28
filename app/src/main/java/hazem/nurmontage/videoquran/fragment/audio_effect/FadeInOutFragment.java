package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.databinding.FragmentFadeInOutBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class FadeInOutFragment extends Fragment {
    public static FadeInOutFragment instance;
    private FragmentFadeInOutBinding binding;
    private ImageButton btnPreview;
    private EntityAudio entityAudio;
    private SeekBar fadeInSeekBar;
    private SeekBar fadeOutSeekBar;
    private TextCustumFont hint_fade_in;
    private TextCustumFont hint_fade_out;
    private EditMediaFragment.IEditMediaCallback iEditMediaCallback;
    private boolean isPlay;

    public static FadeInOutFragment getInstance(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        if (instance == null) {
            instance = new FadeInOutFragment(iEditMediaCallback, entityAudio);
        }
        return instance;
    }

    public FadeInOutFragment(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    public FadeInOutFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentFadeInOutBinding inflate = FragmentFadeInOutBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        EntityAudio entityAudio = this.entityAudio;
        if (entityAudio == null || entityAudio.getMediaPlayer() == null) {
            return root;
        }
        this.hint_fade_in = (TextCustumFont) root.findViewById(C2014R.id.hint_fade_in);
        this.hint_fade_out = (TextCustumFont) root.findViewById(C2014R.id.hint_fade_out);
        this.fadeInSeekBar = (SeekBar) root.findViewById(C2014R.id.fadeInSeekBar);
        this.fadeOutSeekBar = (SeekBar) root.findViewById(C2014R.id.fadeOutSeekBar);
        int second_in_screen = (int) (((this.entityAudio.getRect().right / this.entityAudio.getSecond_in_screen()) - (this.entityAudio.getRect().left / this.entityAudio.getSecond_in_screen())) * 0.5f);
        this.fadeInSeekBar.setMax(second_in_screen);
        this.fadeOutSeekBar.setMax(second_in_screen);
        this.fadeInSeekBar.setProgress(this.entityAudio.getEffectAudio().getFade_in());
        this.fadeOutSeekBar.setProgress(this.entityAudio.getEffectAudio().getFade_out());
        this.hint_fade_in.setText(String.valueOf(this.fadeInSeekBar.getProgress()));
        this.hint_fade_out.setText(String.valueOf(this.fadeOutSeekBar.getProgress()));
        this.fadeInSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int resourceId, boolean isFlag) {
                FadeInOutFragment.this.hint_fade_in.setText(String.valueOf(resourceId));
            }
        });
        this.fadeOutSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int resourceId, boolean isFlag) {
                FadeInOutFragment.this.hint_fade_out.setText(String.valueOf(resourceId));
            }
        });
        root.findViewById(C2014R.id.btn_done).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FadeInOutFragment.this.m650x60214ebc(view);
            }
        });
        ImageButton imageButton = (ImageButton) root.findViewById(C2014R.id.btn_play);
        this.btnPreview = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FadeInOutFragment.this.m651x5172de3d(view);
            }
        });
        root.findViewById(C2014R.id.btn_appl_all).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FadeInOutFragment.this.m652x42c46dbe(view);
            }
        });
        return root;
    }

    /* renamed from: lambda$onCreateView$0$hazem-nurmontage-videoquran-fragment-audio_effect-FadeInOutFragment */
    /* synthetic */ void m650x60214ebc(View view) {
        done();
    }

    /* renamed from: lambda$onCreateView$1$hazem-nurmontage-videoquran-fragment-audio_effect-FadeInOutFragment */
    /* synthetic */ void m651x5172de3d(View view) {
        previewAudio();
    }

    /* renamed from: lambda$onCreateView$2$hazem-nurmontage-videoquran-fragment-audio_effect-FadeInOutFragment */
    /* synthetic */ void m652x42c46dbe(View view) {
        applyFade(true, false);
    }

    private void done() {
        if (this.iEditMediaCallback != null) {
            if (this.entityAudio.getEffectAudio().getFade_in() != this.fadeInSeekBar.getProgress() || this.entityAudio.getEffectAudio().getFade_out() != this.fadeOutSeekBar.getProgress()) {
                applyFade(false, false);
            }
            this.iEditMediaCallback.pausePreview();
            this.iEditMediaCallback.onDone();
        }
    }

    private void previewAudio() {
        boolean isFlag = this.isPlay;
        this.isPlay = !isFlag;
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (!isFlag) {
                applyFade(false, true);
                this.btnPreview.setImageResource(C2014R.drawable.pause_24px);
            } else {
                iEditMediaCallback.pausePreview();
                this.btnPreview.setImageResource(C2014R.drawable.play_arrow_24px);
            }
        }
    }

    private void applyFade(boolean isFlag, boolean isPremium) {
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        if (this.entityAudio.getFade_in() == this.fadeInSeekBar.getProgress() && this.entityAudio.getFade_out() == this.fadeOutSeekBar.getProgress()) {
            if (isFlag) {
                this.iEditMediaCallback.onDone();
                return;
            }
            return;
        }
        effectAudio.setFade_in(this.fadeInSeekBar.getProgress());
        effectAudio.setFade_out(this.fadeOutSeekBar.getProgress());
        float start = effectAudio.getStart() / 1000.0f;
        float end = effectAudio.getEnd() / 1000.0f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format(Locale.US, "atrim=start=%.2f:end=%.2f", Float.valueOf(start), Float.valueOf(end)));
        arrayList.add("asetpts=N/SR/TB");
        if (effectAudio.isRemoveNoice()) {
            arrayList.add("afftdn=nf=-25");
        }
        arrayList.add(String.format(Locale.US, "volume=%.2f", Float.valueOf(effectAudio.getVolume())));
        if (effectAudio.getFade_in() > 0) {
            arrayList.add("afade=t=in:st=0:d=" + effectAudio.getFade_in());
        }
        if (effectAudio.getFade_out() > 0) {
            float fade_out = effectAudio.getFade_out();
            arrayList.add("afade=t=out:st=" + ((end - start) - fade_out) + ":d=" + fade_out);
        }
        if (effectAudio.isEnhance()) {
            arrayList.add(Common.ENHANCE_CMD);
        }
        if (effectAudio.getReverbPreset() != null) {
            arrayList.add(effectAudio.getReverbPreset());
        }
        if (effectAudio.getDecays() > 0) {
            arrayList.add(String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", Float.valueOf(1.0f), Float.valueOf(effectAudio.getOutGain()), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd()));
        }
        if (effectAudio.getSpeed() != 1.0f) {
            arrayList.addAll(buildSpeedFilters(effectAudio.getSpeed()));
        }
        String join = TextUtils.join(",", arrayList);
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            if (isFlag) {
                iEditMediaCallback.updateEntity(EffectAudioType.FADE, this.entityAudio);
                this.iEditMediaCallback.onCmdAll(effectAudio);
            } else if (isPremium) {
                iEditMediaCallback.onCmdPlay(join);
            } else {
                iEditMediaCallback.onCmd(join);
            }
        }
    }

    private List<String> buildSpeedFilters(float speed) {
        ArrayList arrayList = new ArrayList();
        if (speed < 0.5f) {
            while (speed < 0.5f) {
                arrayList.add("atempo=0.5");
                speed /= 0.5f;
            }
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(speed)));
        } else if (speed > 2.0f) {
            while (speed > 2.0f) {
                arrayList.add("atempo=2.0");
                speed /= 2.0f;
            }
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(speed)));
        } else {
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(speed)));
        }
        return arrayList;
    }

    public void updateButton() {
        this.btnPreview.setImageResource(C2014R.drawable.play_arrow_24px);
        this.isPlay = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
        }
        super.onDestroyView();
        instance = null;
        this.binding = null;
    }
}
