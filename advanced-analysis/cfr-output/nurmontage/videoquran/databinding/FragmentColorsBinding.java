/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutEditGradientBinding;

public final class FragmentColorsBinding
implements ViewBinding {
    public final LayoutEditGradientBinding layoutEditGradient;
    private final LinearLayout rootView;
    public final RecyclerView rvColor;

    private FragmentColorsBinding(LinearLayout linearLayout, LayoutEditGradientBinding layoutEditGradientBinding, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.layoutEditGradient = layoutEditGradientBinding;
        this.rvColor = recyclerView;
    }

    public static FragmentColorsBinding bind(View object) {
        Object object2;
        int n = R$id.layout_edit_gradient;
        Object object3 = ViewBindings.findChildViewById((View)object, (int)n);
        if (object3 != null) {
            object2 = LayoutEditGradientBinding.bind(object3);
            int n2 = R$id.rv_color;
            RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)object, (int)n2);
            if (recyclerView != null) {
                object = (LinearLayout)object;
                object3 = new FragmentColorsBinding((LinearLayout)object, (LayoutEditGradientBinding)object2, recyclerView);
                return object3;
            }
            n = n2;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FragmentColorsBinding inflate(LayoutInflater layoutInflater) {
        return FragmentColorsBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentColorsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_colors;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentColorsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

