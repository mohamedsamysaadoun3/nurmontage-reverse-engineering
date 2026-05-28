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
import android.widget.HorizontalScrollView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentEditMediaBinding implements ViewBinding
{
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final LinearLayout btnDuplicate;
    public final LinearLayout btnEcho;
    public final LinearLayout btnEnhanceVoice;
    public final LinearLayout btnFade;
    public final LinearLayout btnPitch;
    public final LinearLayout btnRemoveNoice;
    public final LinearLayout btnReplace;
    public final LinearLayout btnReverb;
    public final ImageView btnShowLeft;
    public final ImageView btnShowRight;
    public final LinearLayout btnSpeed;
    public final LinearLayout btnVolume;
    public final ImageView ivCut;
    private final RelativeLayout rootView;
    public final TextCustumFont tvCut;
    public final TextCustumFont tvDelete;
    public final TextCustumFont tvDuplicate;
    public final TextCustumFont tvEcho;
    public final TextCustumFont tvEnhance;
    public final TextCustumFont tvFade;
    public final TextCustumFont tvNoice;
    public final TextCustumFont tvPitch;
    public final TextCustumFont tvReplace;
    public final TextCustumFont tvReverbe;
    public final TextCustumFont tvSpeed;
    public final TextCustumFont tvVolume;
    public final HorizontalScrollView viewScroll;
    
    private FragmentEditMediaBinding(final RelativeLayout rootView, final LinearLayout btnCut, final LinearLayout btnDelete, final LinearLayout btnDuplicate, final LinearLayout btnEcho, final LinearLayout btnEnhanceVoice, final LinearLayout btnFade, final LinearLayout btnPitch, final LinearLayout btnRemoveNoice, final LinearLayout btnReplace, final LinearLayout btnReverb, final ImageView btnShowLeft, final ImageView btnShowRight, final LinearLayout btnSpeed, final LinearLayout btnVolume, final ImageView ivCut, final TextCustumFont tvCut, final TextCustumFont tvDelete, final TextCustumFont tvDuplicate, final TextCustumFont tvEcho, final TextCustumFont tvEnhance, final TextCustumFont tvFade, final TextCustumFont tvNoice, final TextCustumFont tvPitch, final TextCustumFont tvReplace, final TextCustumFont tvReverbe, final TextCustumFont tvSpeed, final TextCustumFont tvVolume, final HorizontalScrollView viewScroll) {
        this.rootView = rootView;
        this.btnCut = btnCut;
        this.btnDelete = btnDelete;
        this.btnDuplicate = btnDuplicate;
        this.btnEcho = btnEcho;
        this.btnEnhanceVoice = btnEnhanceVoice;
        this.btnFade = btnFade;
        this.btnPitch = btnPitch;
        this.btnRemoveNoice = btnRemoveNoice;
        this.btnReplace = btnReplace;
        this.btnReverb = btnReverb;
        this.btnShowLeft = btnShowLeft;
        this.btnShowRight = btnShowRight;
        this.btnSpeed = btnSpeed;
        this.btnVolume = btnVolume;
        this.ivCut = ivCut;
        this.tvCut = tvCut;
        this.tvDelete = tvDelete;
        this.tvDuplicate = tvDuplicate;
        this.tvEcho = tvEcho;
        this.tvEnhance = tvEnhance;
        this.tvFade = tvFade;
        this.tvNoice = tvNoice;
        this.tvPitch = tvPitch;
        this.tvReplace = tvReplace;
        this.tvReverbe = tvReverbe;
        this.tvSpeed = tvSpeed;
        this.tvVolume = tvVolume;
        this.viewScroll = viewScroll;
    }
    
    public static FragmentEditMediaBinding bind(final View view) {
        int n = R$id.btn_cut;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_delete;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.btn_duplicate;
                final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                if (linearLayout3 != null) {
                    n = R$id.btn_echo;
                    final LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                    if (linearLayout4 != null) {
                        n = R$id.btn_enhance_voice;
                        final LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                        if (linearLayout5 != null) {
                            n = R$id.btn_fade;
                            final LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout6 != null) {
                                n = R$id.btn_pitch;
                                final LinearLayout linearLayout7 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                if (linearLayout7 != null) {
                                    n = R$id.btn_remove_noice;
                                    final LinearLayout linearLayout8 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                    if (linearLayout8 != null) {
                                        n = R$id.btn_replace;
                                        final LinearLayout linearLayout9 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                        if (linearLayout9 != null) {
                                            n = R$id.btn_reverb;
                                            final LinearLayout linearLayout10 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                            if (linearLayout10 != null) {
                                                n = R$id.btn_show_left;
                                                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                                if (imageView != null) {
                                                    n = R$id.btn_show_right;
                                                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                    if (imageView2 != null) {
                                                        n = R$id.btn_speed;
                                                        final LinearLayout linearLayout11 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                        if (linearLayout11 != null) {
                                                            n = R$id.btn_volume;
                                                            final LinearLayout linearLayout12 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                            if (linearLayout12 != null) {
                                                                n = R$id.iv_cut;
                                                                final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                if (imageView3 != null) {
                                                                    n = R$id.tv_cut;
                                                                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                    if (textCustumFont != null) {
                                                                        n = R$id.tv_delete;
                                                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                        if (textCustumFont2 != null) {
                                                                            n = R$id.tv_duplicate;
                                                                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                            if (textCustumFont3 != null) {
                                                                                n = R$id.tv_echo;
                                                                                final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                if (textCustumFont4 != null) {
                                                                                    n = R$id.tv_enhance;
                                                                                    final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                    if (textCustumFont5 != null) {
                                                                                        n = R$id.tv_fade;
                                                                                        final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                        if (textCustumFont6 != null) {
                                                                                            n = R$id.tv_noice;
                                                                                            final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                            if (textCustumFont7 != null) {
                                                                                                n = R$id.tv_pitch;
                                                                                                final TextCustumFont textCustumFont8 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont8 != null) {
                                                                                                    n = R$id.tv_replace;
                                                                                                    final TextCustumFont textCustumFont9 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                    if (textCustumFont9 != null) {
                                                                                                        n = R$id.tv_reverbe;
                                                                                                        final TextCustumFont textCustumFont10 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                        if (textCustumFont10 != null) {
                                                                                                            n = R$id.tv_speed;
                                                                                                            final TextCustumFont textCustumFont11 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                            if (textCustumFont11 != null) {
                                                                                                                n = R$id.tv_volume;
                                                                                                                final TextCustumFont textCustumFont12 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                if (textCustumFont12 != null) {
                                                                                                                    n = R$id.view_scroll;
                                                                                                                    final HorizontalScrollView horizontalScrollView = (HorizontalScrollView)ViewBindings.findChildViewById(view, n);
                                                                                                                    if (horizontalScrollView != null) {
                                                                                                                        return new FragmentEditMediaBinding((RelativeLayout)view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, imageView, imageView2, linearLayout11, linearLayout12, imageView3, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, textCustumFont8, textCustumFont9, textCustumFont10, textCustumFont11, textCustumFont12, horizontalScrollView);
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
    
    public static FragmentEditMediaBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditMediaBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_media, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
