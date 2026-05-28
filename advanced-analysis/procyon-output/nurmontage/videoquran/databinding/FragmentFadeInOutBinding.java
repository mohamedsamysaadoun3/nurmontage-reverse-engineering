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
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentFadeInOutBinding implements ViewBinding
{
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final AppCompatSeekBar fadeInSeekBar;
    public final AppCompatSeekBar fadeOutSeekBar;
    public final TextCustumFont hintFadeIn;
    public final TextCustumFont hintFadeOut;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustumFont tvApplyAll;
    public final TextCustumFont tvDeley;
    public final TextCustumFont tvRepeat;
    
    private FragmentFadeInOutBinding(final LinearLayout rootView, final LinearLayout btnApplAll, final ImageButton btnDone, final ImageButton btnPlay, final AppCompatSeekBar fadeInSeekBar, final AppCompatSeekBar fadeOutSeekBar, final TextCustumFont hintFadeIn, final TextCustumFont hintFadeOut, final ImageView ivApplyAll, final TextCustumFont tvApplyAll, final TextCustumFont tvDeley, final TextCustumFont tvRepeat) {
        this.rootView = rootView;
        this.btnApplAll = btnApplAll;
        this.btnDone = btnDone;
        this.btnPlay = btnPlay;
        this.fadeInSeekBar = fadeInSeekBar;
        this.fadeOutSeekBar = fadeOutSeekBar;
        this.hintFadeIn = hintFadeIn;
        this.hintFadeOut = hintFadeOut;
        this.ivApplyAll = ivApplyAll;
        this.tvApplyAll = tvApplyAll;
        this.tvDeley = tvDeley;
        this.tvRepeat = tvRepeat;
    }
    
    public static FragmentFadeInOutBinding bind(final View view) {
        int n = R$id.btn_appl_all;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_done;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_play;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.fadeInSeekBar;
                    final AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
                    if (appCompatSeekBar != null) {
                        n = R$id.fadeOutSeekBar;
                        final AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
                        if (appCompatSeekBar2 != null) {
                            n = R$id.hint_fade_in;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.hint_fade_out;
                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont2 != null) {
                                    n = R$id.iv_apply_all;
                                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                    if (imageView != null) {
                                        n = R$id.tv_apply_all;
                                        final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont3 != null) {
                                            n = R$id.tv_deley;
                                            final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFont4 != null) {
                                                n = R$id.tv_repeat;
                                                final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                if (textCustumFont5 != null) {
                                                    return new FragmentFadeInOutBinding((LinearLayout)view, linearLayout, imageButton, imageButton2, appCompatSeekBar, appCompatSeekBar2, textCustumFont, textCustumFont2, imageView, textCustumFont3, textCustumFont4, textCustumFont5);
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
    
    public static FragmentFadeInOutBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentFadeInOutBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_fade_in_out, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
