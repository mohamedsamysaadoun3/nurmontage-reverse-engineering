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

public final class FragmentVolumeBinding
implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustumFont tvApplyAll;
    public final TextCustumFont tvVolume;
    public final TextCustumFont tvVolumeSize;
    public final AppCompatSeekBar volumeSeekBar;

    private FragmentVolumeBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, AppCompatSeekBar appCompatSeekBar) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.ivApplyAll = imageView;
        this.tvApplyAll = textCustumFont;
        this.tvVolume = textCustumFont2;
        this.tvVolumeSize = textCustumFont3;
        this.volumeSeekBar = appCompatSeekBar;
    }

    public static FragmentVolumeBinding bind(View object) {
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
                    n = R$id.iv_apply_all;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n = R$id.tv_apply_all;
                        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object2 = (TextCustumFont)view;
                        if (object2 != null) {
                            n = R$id.tv_volume;
                            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object3 = (TextCustumFont)view;
                            if (object3 != null) {
                                n = R$id.tv_volume_size;
                                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object4 = (TextCustumFont)view;
                                if (object4 != null) {
                                    n = R$id.volumeSeekBar;
                                    View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view6 = (AppCompatSeekBar)view;
                                    if (view6 != null) {
                                        Object object5 = object;
                                        object5 = (LinearLayout)object;
                                        FragmentVolumeBinding fragmentVolumeBinding = new FragmentVolumeBinding((LinearLayout)object5, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (ImageView)view5, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (AppCompatSeekBar)view6);
                                        return fragmentVolumeBinding;
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

    public static FragmentVolumeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentVolumeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentVolumeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_volume;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentVolumeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

