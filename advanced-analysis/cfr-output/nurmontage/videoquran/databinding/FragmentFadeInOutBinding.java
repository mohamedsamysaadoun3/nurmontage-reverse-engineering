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
 *  androidx.appcompat.widget.AppCompatSeekBar
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
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentFadeInOutBinding
implements ViewBinding {
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

    private FragmentFadeInOutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, AppCompatSeekBar appCompatSeekBar, AppCompatSeekBar appCompatSeekBar2, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, ImageView imageView, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.fadeInSeekBar = appCompatSeekBar;
        this.fadeOutSeekBar = appCompatSeekBar2;
        this.hintFadeIn = textCustumFont;
        this.hintFadeOut = textCustumFont2;
        this.ivApplyAll = imageView;
        this.tvApplyAll = textCustumFont3;
        this.tvDeley = textCustumFont4;
        this.tvRepeat = textCustumFont5;
    }

    public static FragmentFadeInOutBinding bind(View object) {
        View view;
        int n = R$id.btn_appl_all;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_done;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.btn_play;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.fadeInSeekBar;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (AppCompatSeekBar)view;
                    if (view5 != null) {
                        n = R$id.fadeOutSeekBar;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (AppCompatSeekBar)view;
                        if (view6 != null) {
                            n = R$id.hint_fade_in;
                            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object2 = (TextCustumFont)view;
                            if (object2 != null) {
                                n = R$id.hint_fade_out;
                                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object3 = (TextCustumFont)view;
                                if (object3 != null) {
                                    n = R$id.iv_apply_all;
                                    View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view7 = (ImageView)view;
                                    if (view7 != null) {
                                        n = R$id.tv_apply_all;
                                        Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object4 = (TextCustumFont)view;
                                        if (object4 != null) {
                                            n = R$id.tv_deley;
                                            Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                            object5 = (TextCustumFont)view;
                                            if (object5 != null) {
                                                n = R$id.tv_repeat;
                                                Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                                object6 = (TextCustumFont)view;
                                                if (object6 != null) {
                                                    Object object7 = object;
                                                    object7 = (LinearLayout)object;
                                                    FragmentFadeInOutBinding fragmentFadeInOutBinding = new FragmentFadeInOutBinding((LinearLayout)object7, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (AppCompatSeekBar)view5, (AppCompatSeekBar)view6, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (ImageView)view7, (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6));
                                                    return fragmentFadeInOutBinding;
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
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentFadeInOutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentFadeInOutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentFadeInOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_fade_in_out;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentFadeInOutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

