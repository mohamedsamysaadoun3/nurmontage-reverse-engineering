/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.HorizontalScrollView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentEditMediaBinding
implements ViewBinding {
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

    private FragmentEditMediaBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ImageView imageView, ImageView imageView2, LinearLayout linearLayout11, LinearLayout linearLayout12, ImageView imageView3, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, TextCustumFont textCustumFont8, TextCustumFont textCustumFont9, TextCustumFont textCustumFont10, TextCustumFont textCustumFont11, TextCustumFont textCustumFont12, HorizontalScrollView horizontalScrollView) {
        this.rootView = relativeLayout;
        this.btnCut = linearLayout;
        this.btnDelete = linearLayout2;
        this.btnDuplicate = linearLayout3;
        this.btnEcho = linearLayout4;
        this.btnEnhanceVoice = linearLayout5;
        this.btnFade = linearLayout6;
        this.btnPitch = linearLayout7;
        this.btnRemoveNoice = linearLayout8;
        this.btnReplace = linearLayout9;
        this.btnReverb = linearLayout10;
        this.btnShowLeft = imageView;
        this.btnShowRight = imageView2;
        this.btnSpeed = linearLayout11;
        this.btnVolume = linearLayout12;
        this.ivCut = imageView3;
        this.tvCut = textCustumFont;
        this.tvDelete = textCustumFont2;
        this.tvDuplicate = textCustumFont3;
        this.tvEcho = textCustumFont4;
        this.tvEnhance = textCustumFont5;
        this.tvFade = textCustumFont6;
        this.tvNoice = textCustumFont7;
        this.tvPitch = textCustumFont8;
        this.tvReplace = textCustumFont9;
        this.tvReverbe = textCustumFont10;
        this.tvSpeed = textCustumFont11;
        this.tvVolume = textCustumFont12;
        this.viewScroll = horizontalScrollView;
    }

    public static FragmentEditMediaBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_cut;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_delete;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n = R$id.btn_duplicate;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (LinearLayout)view2;
                if (view5 != null) {
                    n = R$id.btn_echo;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n = R$id.btn_enhance_voice;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n = R$id.btn_fade;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (LinearLayout)view2;
                            if (view8 != null) {
                                n = R$id.btn_pitch;
                                View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view9 = (LinearLayout)view2;
                                if (view9 != null) {
                                    n = R$id.btn_remove_noice;
                                    View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view10 = (LinearLayout)view2;
                                    if (view10 != null) {
                                        n = R$id.btn_replace;
                                        View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view11 = (LinearLayout)view2;
                                        if (view11 != null) {
                                            n = R$id.btn_reverb;
                                            View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view12 = (LinearLayout)view2;
                                            if (view12 != null) {
                                                n = R$id.btn_show_left;
                                                View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view13 = (ImageView)view2;
                                                if (view13 != null) {
                                                    n = R$id.btn_show_right;
                                                    View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view14 = (ImageView)view2;
                                                    if (view14 != null) {
                                                        n = R$id.btn_speed;
                                                        View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view15 = (LinearLayout)view2;
                                                        if (view15 != null) {
                                                            n = R$id.btn_volume;
                                                            View view16 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view16 = (LinearLayout)view2;
                                                            if (view16 != null) {
                                                                n = R$id.iv_cut;
                                                                View view17 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                view17 = (ImageView)view2;
                                                                if (view17 != null) {
                                                                    n = R$id.tv_cut;
                                                                    Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    object2 = (TextCustumFont)view2;
                                                                    if (object2 != null) {
                                                                        n = R$id.tv_delete;
                                                                        Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        object3 = (TextCustumFont)view2;
                                                                        if (object3 != null) {
                                                                            n = R$id.tv_duplicate;
                                                                            Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            object4 = (TextCustumFont)view2;
                                                                            if (object4 != null) {
                                                                                n = R$id.tv_echo;
                                                                                Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                object5 = (TextCustumFont)view2;
                                                                                if (object5 != null) {
                                                                                    n = R$id.tv_enhance;
                                                                                    Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    object6 = (TextCustumFont)view2;
                                                                                    if (object6 != null) {
                                                                                        n = R$id.tv_fade;
                                                                                        Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        object7 = (TextCustumFont)view2;
                                                                                        if (object7 != null) {
                                                                                            n = R$id.tv_noice;
                                                                                            Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            object8 = (TextCustumFont)view2;
                                                                                            if (object8 != null) {
                                                                                                n = R$id.tv_pitch;
                                                                                                Object object9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                object9 = (TextCustumFont)view2;
                                                                                                if (object9 != null) {
                                                                                                    n = R$id.tv_replace;
                                                                                                    Object object10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    object10 = (TextCustumFont)view2;
                                                                                                    if (object10 != null) {
                                                                                                        n = R$id.tv_reverbe;
                                                                                                        Object object11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                        object11 = (TextCustumFont)view2;
                                                                                                        if (object11 != null) {
                                                                                                            n = R$id.tv_speed;
                                                                                                            Object object12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                            object12 = (TextCustumFont)view2;
                                                                                                            if (object12 != null) {
                                                                                                                n = R$id.tv_volume;
                                                                                                                Object object13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                object13 = (TextCustumFont)view2;
                                                                                                                if (object13 != null) {
                                                                                                                    n = R$id.view_scroll;
                                                                                                                    View view18 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                    view18 = (HorizontalScrollView)view2;
                                                                                                                    if (view18 != null) {
                                                                                                                        View view19 = view;
                                                                                                                        view19 = (RelativeLayout)view;
                                                                                                                        FragmentEditMediaBinding fragmentEditMediaBinding = new FragmentEditMediaBinding((RelativeLayout)view19, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (LinearLayout)view8, (LinearLayout)view9, (LinearLayout)view10, (LinearLayout)view11, (LinearLayout)view12, (ImageView)view13, (ImageView)view14, (LinearLayout)view15, (LinearLayout)view16, (ImageView)view17, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (TextCustumFont)((Object)object9), (TextCustumFont)((Object)object10), (TextCustumFont)((Object)object11), (TextCustumFont)((Object)object12), (TextCustumFont)((Object)object13), (HorizontalScrollView)view18);
                                                                                                                        return fragmentEditMediaBinding;
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentEditMediaBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditMediaBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_media;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditMediaBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

