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

public final class LayoutPermissionLimetedBinding
implements ViewBinding {
    private final LinearLayout rootView;

    private LayoutPermissionLimetedBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutPermissionLimetedBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LayoutPermissionLimetedBinding layoutPermissionLimetedBinding = new LayoutPermissionLimetedBinding((LinearLayout)object);
            return layoutPermissionLimetedBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutPermissionLimetedBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPermissionLimetedBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPermissionLimetedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_permission_limeted;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPermissionLimetedBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

