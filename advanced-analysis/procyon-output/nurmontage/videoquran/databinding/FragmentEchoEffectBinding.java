// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentEchoEffectBinding implements ViewBinding
{
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final AppCompatSeekBar delaySeekBar;
    public final ImageView ivApplyAll;
    public final AppCompatSeekBar repeatSeekBar;
    private final LinearLayout rootView;
    public final TextCustumFont tvApplyAll;
    public final TextCustumFont tvDelaySize;
    public final TextCustumFont tvDeley;
    public final TextCustumFont tvRepeat;
    public final TextCustumFont tvRepeatSize;
    public final TextCustumFont tvVolume;
    public final TextCustumFont tvVolumeSize;
    public final AppCompatSeekBar volumeSeekBar;
    
    private FragmentEchoEffectBinding(final LinearLayout rootView, final LinearLayout btnApplAll, final ImageButton btnDone, final ImageButton btnPlay, final AppCompatSeekBar delaySeekBar, final ImageView ivApplyAll, final AppCompatSeekBar repeatSeekBar, final TextCustumFont tvApplyAll, final TextCustumFont tvDelaySize, final TextCustumFont tvDeley, final TextCustumFont tvRepeat, final TextCustumFont tvRepeatSize, final TextCustumFont tvVolume, final TextCustumFont tvVolumeSize, final AppCompatSeekBar volumeSeekBar) {
        this.rootView = rootView;
        this.btnApplAll = btnApplAll;
        this.btnDone = btnDone;
        this.btnPlay = btnPlay;
        this.delaySeekBar = delaySeekBar;
        this.ivApplyAll = ivApplyAll;
        this.repeatSeekBar = repeatSeekBar;
        this.tvApplyAll = tvApplyAll;
        this.tvDelaySize = tvDelaySize;
        this.tvDeley = tvDeley;
        this.tvRepeat = tvRepeat;
        this.tvRepeatSize = tvRepeatSize;
        this.tvVolume = tvVolume;
        this.tvVolumeSize = tvVolumeSize;
        this.volumeSeekBar = volumeSeekBar;
    }
    
    public static FragmentEchoEffectBinding bind(final View view) {
        int n = R$id.btn_appl_all;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_done;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_play;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.delaySeekBar;
                    final AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
                    if (appCompatSeekBar != null) {
                        n = R$id.iv_apply_all;
                        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView != null) {
                            n = R$id.repeatSeekBar;
                            final AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
                            if (appCompatSeekBar2 != null) {
                                n = R$id.tv_apply_all;
                                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont != null) {
                                    n = R$id.tv_delay_size;
                                    final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont2 != null) {
                                        n = R$id.tv_deley;
                                        final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont3 != null) {
                                            n = R$id.tv_repeat;
                                            final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFont4 != null) {
                                                n = R$id.tv_repeat_size;
                                                final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                if (textCustumFont5 != null) {
                                                    n = R$id.tv_volume;
                                                    final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                    if (textCustumFont6 != null) {
                                                        n = R$id.tv_volume_size;
                                                        final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                        if (textCustumFont7 != null) {
                                                            n = R$id.volumeSeekBar;
                                                            final AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
                                                            if (appCompatSeekBar3 != null) {
                                                                return new FragmentEchoEffectBinding((LinearLayout)view, linearLayout, imageButton, imageButton2, appCompatSeekBar, imageView, appCompatSeekBar2, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, appCompatSeekBar3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEchoEffectBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEchoEffectBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_echo_effect, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
