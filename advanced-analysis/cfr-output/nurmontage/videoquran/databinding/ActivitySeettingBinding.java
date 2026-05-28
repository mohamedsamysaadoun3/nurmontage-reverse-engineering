/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivitySeettingBinding
implements ViewBinding {
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

    private ActivitySeettingBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageButton imageButton, LinearLayout linearLayout5, LinearLayout linearLayout6, ImageButton imageButton2, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, ImageButton imageButton3, LinearLayout linearLayout10, ImageButton imageButton4, ImageButton imageButton5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout11, ProgressBar progressBar, View view, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold, TextCustumFont textCustumFont2, TextCustumFontBold textCustumFontBold2) {
        this.rootView = linearLayout;
        this.btnAbout = linearLayout2;
        this.btnCopyRight = linearLayout3;
        this.btnImBloger = linearLayout4;
        this.btnInstagram = imageButton;
        this.btnLang = linearLayout5;
        this.btnMoreApp = linearLayout6;
        this.btnOnBack = imageButton2;
        this.btnRateApp = linearLayout7;
        this.btnRestore = linearLayout8;
        this.btnShare = linearLayout9;
        this.btnTicktock = imageButton3;
        this.btnToPro = linearLayout10;
        this.btnWhatsap = imageButton4;
        this.btnYoutbe = imageButton5;
        this.ict = imageView;
        this.ivEngAbout = imageView2;
        this.ivEngBloger = imageView3;
        this.ivEngPremium = imageView4;
        this.ivEngRate = imageView5;
        this.ivEngShare = imageView6;
        this.main = linearLayout11;
        this.progress = progressBar;
        this.toInstagram = view;
        this.tvRestore = textCustumFont;
        this.tvSetting = textCustumFontBold;
        this.tvVersion = textCustumFont2;
        this.tvYourPro = textCustumFontBold2;
    }

    public static ActivitySeettingBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_about;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_copyRight;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n = R$id.btn_im_bloger;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (LinearLayout)view2;
                if (view5 != null) {
                    n = R$id.btn_instagram;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (ImageButton)view2;
                    if (view6 != null) {
                        n = R$id.btn_lang;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n = R$id.btn_more_app;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (LinearLayout)view2;
                            if (view8 != null) {
                                n = R$id.btn_on_back;
                                View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view9 = (ImageButton)view2;
                                if (view9 != null) {
                                    n = R$id.btn_rate_app;
                                    View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view10 = (LinearLayout)view2;
                                    if (view10 != null) {
                                        n = R$id.btn_restore;
                                        View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view11 = (LinearLayout)view2;
                                        if (view11 != null) {
                                            n = R$id.btn_share;
                                            View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view12 = (LinearLayout)view2;
                                            if (view12 != null) {
                                                n = R$id.btn_ticktock;
                                                View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view13 = (ImageButton)view2;
                                                if (view13 != null) {
                                                    n = R$id.btn_to_pro;
                                                    View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view14 = (LinearLayout)view2;
                                                    if (view14 != null) {
                                                        n = R$id.btn_whatsap;
                                                        View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view15 = (ImageButton)view2;
                                                        if (view15 != null) {
                                                            n = R$id.btn_youtbe;
                                                            View view16 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view16 = (ImageButton)view2;
                                                            if (view16 != null) {
                                                                n = R$id.ict;
                                                                View view17 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                view17 = (ImageView)view2;
                                                                if (view17 != null) {
                                                                    n = R$id.iv_eng_about;
                                                                    View view18 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    view18 = (ImageView)view2;
                                                                    if (view18 != null) {
                                                                        n = R$id.iv_eng_bloger;
                                                                        View view19 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        view19 = (ImageView)view2;
                                                                        if (view19 != null) {
                                                                            n = R$id.iv_eng_premium;
                                                                            View view20 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            view20 = (ImageView)view2;
                                                                            if (view20 != null) {
                                                                                n = R$id.iv_eng_rate;
                                                                                View view21 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                view21 = (ImageView)view2;
                                                                                if (view21 != null) {
                                                                                    n = R$id.iv_eng_share;
                                                                                    View view22 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    view22 = (ImageView)view2;
                                                                                    if (view22 != null) {
                                                                                        View view23;
                                                                                        View view24 = view;
                                                                                        view24 = (LinearLayout)view;
                                                                                        n = R$id.progress;
                                                                                        View view25 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        view25 = (ProgressBar)view2;
                                                                                        if (view25 != null && (view23 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.to_instagram))) != null) {
                                                                                            n = R$id.tv_restore;
                                                                                            Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            object2 = (TextCustumFont)view2;
                                                                                            if (object2 != null) {
                                                                                                n = R$id.tv_setting;
                                                                                                Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                object3 = (TextCustumFontBold)view2;
                                                                                                if (object3 != null) {
                                                                                                    n = R$id.tv_version;
                                                                                                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    object4 = (TextCustumFont)view2;
                                                                                                    if (object4 != null) {
                                                                                                        n = R$id.tv_your_pro;
                                                                                                        Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                        object5 = (TextCustumFontBold)view2;
                                                                                                        if (object5 != null) {
                                                                                                            object = new ActivitySeettingBinding((LinearLayout)view24, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (ImageButton)view6, (LinearLayout)view7, (LinearLayout)view8, (ImageButton)view9, (LinearLayout)view10, (LinearLayout)view11, (LinearLayout)view12, (ImageButton)view13, (LinearLayout)view14, (ImageButton)view15, (ImageButton)view16, (ImageView)view17, (ImageView)view18, (ImageView)view19, (ImageView)view20, (ImageView)view21, (ImageView)view22, (LinearLayout)view24, (ProgressBar)view25, view23, (TextCustumFont)((Object)object2), (TextCustumFontBold)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFontBold)((Object)object5));
                                                                                                            return object;
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivitySeettingBinding inflate(LayoutInflater layoutInflater) {
        return ActivitySeettingBinding.inflate(layoutInflater, null, false);
    }

    public static ActivitySeettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_seetting;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySeettingBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

