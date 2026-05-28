// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivitySeettingBinding implements ViewBinding
{
    public final LinearLayout btnAbout;
    public final LinearLayout btnCopyRight;
    public final LinearLayout btnImBloger;
    public final ImageButton btnInstagram;
    public final LinearLayout btnLang;
    public final LinearLayout btnMoreApp;
    public final ImageButton btnOnBack;
    public final LinearLayout btnRateApp;
    public final LinearLayout btnRestore;
    public final LinearLayout btnShare;
    public final ImageButton btnTicktock;
    public final LinearLayout btnToPro;
    public final ImageButton btnWhatsap;
    public final ImageButton btnYoutbe;
    public final ImageView ict;
    public final ImageView ivEngAbout;
    public final ImageView ivEngBloger;
    public final ImageView ivEngPremium;
    public final ImageView ivEngRate;
    public final ImageView ivEngShare;
    public final LinearLayout main;
    public final ProgressBar progress;
    private final LinearLayout rootView;
    public final View toInstagram;
    public final TextCustumFont tvRestore;
    public final TextCustumFontBold tvSetting;
    public final TextCustumFont tvVersion;
    public final TextCustumFontBold tvYourPro;
    
    private ActivitySeettingBinding(final LinearLayout rootView, final LinearLayout btnAbout, final LinearLayout btnCopyRight, final LinearLayout btnImBloger, final ImageButton btnInstagram, final LinearLayout btnLang, final LinearLayout btnMoreApp, final ImageButton btnOnBack, final LinearLayout btnRateApp, final LinearLayout btnRestore, final LinearLayout btnShare, final ImageButton btnTicktock, final LinearLayout btnToPro, final ImageButton btnWhatsap, final ImageButton btnYoutbe, final ImageView ict, final ImageView ivEngAbout, final ImageView ivEngBloger, final ImageView ivEngPremium, final ImageView ivEngRate, final ImageView ivEngShare, final LinearLayout main, final ProgressBar progress, final View toInstagram, final TextCustumFont tvRestore, final TextCustumFontBold tvSetting, final TextCustumFont tvVersion, final TextCustumFontBold tvYourPro) {
        this.rootView = rootView;
        this.btnAbout = btnAbout;
        this.btnCopyRight = btnCopyRight;
        this.btnImBloger = btnImBloger;
        this.btnInstagram = btnInstagram;
        this.btnLang = btnLang;
        this.btnMoreApp = btnMoreApp;
        this.btnOnBack = btnOnBack;
        this.btnRateApp = btnRateApp;
        this.btnRestore = btnRestore;
        this.btnShare = btnShare;
        this.btnTicktock = btnTicktock;
        this.btnToPro = btnToPro;
        this.btnWhatsap = btnWhatsap;
        this.btnYoutbe = btnYoutbe;
        this.ict = ict;
        this.ivEngAbout = ivEngAbout;
        this.ivEngBloger = ivEngBloger;
        this.ivEngPremium = ivEngPremium;
        this.ivEngRate = ivEngRate;
        this.ivEngShare = ivEngShare;
        this.main = main;
        this.progress = progress;
        this.toInstagram = toInstagram;
        this.tvRestore = tvRestore;
        this.tvSetting = tvSetting;
        this.tvVersion = tvVersion;
        this.tvYourPro = tvYourPro;
    }
    
    public static ActivitySeettingBinding bind(final View view) {
        int n = R$id.btn_about;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_copyRight;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.btn_im_bloger;
                final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                if (linearLayout3 != null) {
                    n = R$id.btn_instagram;
                    final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton != null) {
                        n = R$id.btn_lang;
                        final LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                        if (linearLayout4 != null) {
                            n = R$id.btn_more_app;
                            final LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout5 != null) {
                                n = R$id.btn_on_back;
                                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                if (imageButton2 != null) {
                                    n = R$id.btn_rate_app;
                                    final LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                    if (linearLayout6 != null) {
                                        n = R$id.btn_restore;
                                        final LinearLayout linearLayout7 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                        if (linearLayout7 != null) {
                                            n = R$id.btn_share;
                                            final LinearLayout linearLayout8 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                            if (linearLayout8 != null) {
                                                n = R$id.btn_ticktock;
                                                final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                if (imageButton3 != null) {
                                                    n = R$id.btn_to_pro;
                                                    final LinearLayout linearLayout9 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                    if (linearLayout9 != null) {
                                                        n = R$id.btn_whatsap;
                                                        final ImageButton imageButton4 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                        if (imageButton4 != null) {
                                                            n = R$id.btn_youtbe;
                                                            final ImageButton imageButton5 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                            if (imageButton5 != null) {
                                                                n = R$id.ict;
                                                                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                if (imageView != null) {
                                                                    n = R$id.iv_eng_about;
                                                                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                    if (imageView2 != null) {
                                                                        n = R$id.iv_eng_bloger;
                                                                        final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                        if (imageView3 != null) {
                                                                            n = R$id.iv_eng_premium;
                                                                            final ImageView imageView4 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                            if (imageView4 != null) {
                                                                                n = R$id.iv_eng_rate;
                                                                                final ImageView imageView5 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                                if (imageView5 != null) {
                                                                                    n = R$id.iv_eng_share;
                                                                                    final ImageView imageView6 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                                    if (imageView6 != null) {
                                                                                        final LinearLayout linearLayout10 = (LinearLayout)view;
                                                                                        n = R$id.progress;
                                                                                        final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
                                                                                        if (progressBar != null) {
                                                                                            n = R$id.to_instagram;
                                                                                            final View childViewById = ViewBindings.findChildViewById(view, n);
                                                                                            if (childViewById != null) {
                                                                                                n = R$id.tv_restore;
                                                                                                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont != null) {
                                                                                                    n = R$id.tv_setting;
                                                                                                    final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                                                                    if (textCustumFontBold != null) {
                                                                                                        n = R$id.tv_version;
                                                                                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                        if (textCustumFont2 != null) {
                                                                                                            n = R$id.tv_your_pro;
                                                                                                            final TextCustumFontBold textCustumFontBold2 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                                                                            if (textCustumFontBold2 != null) {
                                                                                                                return new ActivitySeettingBinding(linearLayout10, linearLayout, linearLayout2, linearLayout3, imageButton, linearLayout4, linearLayout5, imageButton2, linearLayout6, linearLayout7, linearLayout8, imageButton3, linearLayout9, imageButton4, imageButton5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout10, progressBar, childViewById, textCustumFont, textCustumFontBold, textCustumFont2, textCustumFontBold2);
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
    
    public static ActivitySeettingBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivitySeettingBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_seetting, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
