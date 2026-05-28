/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import hazem.nurmontage.videoquran.R$layout;

public final class LayoutTutoFeaturesBinding
implements ViewBinding {
    private final LinearLayout rootView;

    private LayoutTutoFeaturesBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutTutoFeaturesBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LayoutTutoFeaturesBinding layoutTutoFeaturesBinding = new LayoutTutoFeaturesBinding((LinearLayout)object);
            return layoutTutoFeaturesBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutTutoFeaturesBinding inflate(LayoutInflater layoutInflater) {
        return LayoutTutoFeaturesBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutTutoFeaturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_tuto_features;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutTutoFeaturesBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

