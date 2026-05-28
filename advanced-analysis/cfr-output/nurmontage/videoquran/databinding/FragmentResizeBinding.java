/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;

public final class FragmentResizeBinding
implements ViewBinding {
    public final ButtonCustumFont btnDone;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final View view;

    private FragmentResizeBinding(RelativeLayout relativeLayout, ButtonCustumFont buttonCustumFont, RecyclerView recyclerView, View view) {
        this.rootView = relativeLayout;
        this.btnDone = buttonCustumFont;
        this.rv = recyclerView;
        this.view = view;
    }

    public static FragmentResizeBinding bind(View object) {
        View view;
        RecyclerView recyclerView;
        int n = R$id.btn_done;
        ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById((View)object, (int)n);
        if (buttonCustumFont != null && (recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.rv))) != null && (view = ViewBindings.findChildViewById((View)object, (int)(n = R$id.view))) != null) {
            object = (RelativeLayout)object;
            FragmentResizeBinding fragmentResizeBinding = new FragmentResizeBinding((RelativeLayout)object, buttonCustumFont, recyclerView, view);
            return fragmentResizeBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentResizeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentResizeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentResizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_resize;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentResizeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

