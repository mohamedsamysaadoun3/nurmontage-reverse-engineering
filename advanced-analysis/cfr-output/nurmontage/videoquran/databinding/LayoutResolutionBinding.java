/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;

public final class LayoutResolutionBinding
implements ViewBinding {
    private final LinearLayout rootView;
    public final CustomDiscreteSeekBar seekbarFps;
    public final CustomDiscreteSeekBar seekbarResolution;

    private LayoutResolutionBinding(LinearLayout linearLayout, CustomDiscreteSeekBar customDiscreteSeekBar, CustomDiscreteSeekBar customDiscreteSeekBar2) {
        this.rootView = linearLayout;
        this.seekbarFps = customDiscreteSeekBar;
        this.seekbarResolution = customDiscreteSeekBar2;
    }

    public static LayoutResolutionBinding bind(View object) {
        CustomDiscreteSeekBar customDiscreteSeekBar;
        int n = R$id.seekbar_fps;
        CustomDiscreteSeekBar customDiscreteSeekBar2 = (CustomDiscreteSeekBar)ViewBindings.findChildViewById((View)object, (int)n);
        if (customDiscreteSeekBar2 != null && (customDiscreteSeekBar = (CustomDiscreteSeekBar)ViewBindings.findChildViewById((View)object, (int)(n = R$id.seekbar_resolution))) != null) {
            object = (LinearLayout)object;
            LayoutResolutionBinding layoutResolutionBinding = new LayoutResolutionBinding((LinearLayout)object, customDiscreteSeekBar2, customDiscreteSeekBar);
            return layoutResolutionBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutResolutionBinding inflate(LayoutInflater layoutInflater) {
        return LayoutResolutionBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutResolutionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_resolution;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutResolutionBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

