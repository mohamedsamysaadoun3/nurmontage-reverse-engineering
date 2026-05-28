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

public final class FragmentEchoEffectBinding
implements ViewBinding {
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

    private FragmentEchoEffectBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, AppCompatSeekBar appCompatSeekBar, ImageView imageView, AppCompatSeekBar appCompatSeekBar2, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, AppCompatSeekBar appCompatSeekBar3) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.delaySeekBar = appCompatSeekBar;
        this.ivApplyAll = imageView;
        this.repeatSeekBar = appCompatSeekBar2;
        this.tvApplyAll = textCustumFont;
        this.tvDelaySize = textCustumFont2;
        this.tvDeley = textCustumFont3;
        this.tvRepeat = textCustumFont4;
        this.tvRepeatSize = textCustumFont5;
        this.tvVolume = textCustumFont6;
        this.tvVolumeSize = textCustumFont7;
        this.volumeSeekBar = appCompatSeekBar3;
    }

    public static FragmentEchoEffectBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_appl_all;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_done;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (ImageButton)view2;
            if (view4 != null) {
                n = R$id.btn_play;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (ImageButton)view2;
                if (view5 != null) {
                    n = R$id.delaySeekBar;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (AppCompatSeekBar)view2;
                    if (view6 != null) {
                        n = R$id.iv_apply_all;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n = R$id.repeatSeekBar;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (AppCompatSeekBar)view2;
                            if (view8 != null) {
                                n = R$id.tv_apply_all;
                                Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                object2 = (TextCustumFont)view2;
                                if (object2 != null) {
                                    n = R$id.tv_delay_size;
                                    Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object3 = (TextCustumFont)view2;
                                    if (object3 != null) {
                                        n = R$id.tv_deley;
                                        Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        object4 = (TextCustumFont)view2;
                                        if (object4 != null) {
                                            n = R$id.tv_repeat;
                                            Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            object5 = (TextCustumFont)view2;
                                            if (object5 != null) {
                                                n = R$id.tv_repeat_size;
                                                Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object6 = (TextCustumFont)view2;
                                                if (object6 != null) {
                                                    n = R$id.tv_volume;
                                                    Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    object7 = (TextCustumFont)view2;
                                                    if (object7 != null) {
                                                        n = R$id.tv_volume_size;
                                                        Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        object8 = (TextCustumFont)view2;
                                                        if (object8 != null) {
                                                            n = R$id.volumeSeekBar;
                                                            View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view9 = (AppCompatSeekBar)view2;
                                                            if (view9 != null) {
                                                                View view10 = view;
                                                                view10 = (LinearLayout)view;
                                                                FragmentEchoEffectBinding fragmentEchoEffectBinding = new FragmentEchoEffectBinding((LinearLayout)view10, (LinearLayout)view3, (ImageButton)view4, (ImageButton)view5, (AppCompatSeekBar)view6, (ImageView)view7, (AppCompatSeekBar)view8, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (AppCompatSeekBar)view9);
                                                                return fragmentEchoEffectBinding;
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

    public static FragmentEchoEffectBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEchoEffectBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEchoEffectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_echo_effect;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEchoEffectBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

