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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentReverbePresetBinding
implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvApplyAll;

    private FragmentReverbePresetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageView imageView, RecyclerView recyclerView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.ivApplyAll = imageView;
        this.rv = recyclerView;
        this.tvApplyAll = textCustumFont;
    }

    public static FragmentReverbePresetBinding bind(View object) {
        View view;
        int n = R$id.btn_appl_all;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_done;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.iv_apply_all;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n = R$id.rv;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (RecyclerView)view;
                    if (view5 != null) {
                        n = R$id.tv_apply_all;
                        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object2 = (TextCustumFont)view;
                        if (object2 != null) {
                            Object object3 = object;
                            object3 = (LinearLayout)object;
                            FragmentReverbePresetBinding fragmentReverbePresetBinding = new FragmentReverbePresetBinding((LinearLayout)object3, (LinearLayout)view2, (ImageButton)view3, (ImageView)view4, (RecyclerView)view5, (TextCustumFont)((Object)object2));
                            return fragmentReverbePresetBinding;
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

    public static FragmentReverbePresetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReverbePresetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReverbePresetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_reverbe_preset;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReverbePresetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

