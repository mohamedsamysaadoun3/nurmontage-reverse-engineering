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
 *  androidx.appcompat.widget.SwitchCompat
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
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentRemoveNoiceBinding
implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final SwitchCompat btnRemoveNoice;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustumFont tvApplyAll;
    public final TextCustumFont tvRemoveNoice;

    private FragmentRemoveNoiceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, SwitchCompat switchCompat, ImageView imageView, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.btnRemoveNoice = switchCompat;
        this.ivApplyAll = imageView;
        this.tvApplyAll = textCustumFont;
        this.tvRemoveNoice = textCustumFont2;
    }

    public static FragmentRemoveNoiceBinding bind(View object) {
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
                    n = R$id.btn_remove_noice;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (SwitchCompat)view;
                    if (view5 != null) {
                        n = R$id.iv_apply_all;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n = R$id.tv_apply_all;
                            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object2 = (TextCustumFont)view;
                            if (object2 != null) {
                                n = R$id.tv_remove_noice;
                                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object3 = (TextCustumFont)view;
                                if (object3 != null) {
                                    Object object4 = object;
                                    object4 = (LinearLayout)object;
                                    FragmentRemoveNoiceBinding fragmentRemoveNoiceBinding = new FragmentRemoveNoiceBinding((LinearLayout)object4, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (SwitchCompat)view5, (ImageView)view6, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3));
                                    return fragmentRemoveNoiceBinding;
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

    public static FragmentRemoveNoiceBinding inflate(LayoutInflater layoutInflater) {
        return FragmentRemoveNoiceBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentRemoveNoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_remove_noice;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentRemoveNoiceBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

