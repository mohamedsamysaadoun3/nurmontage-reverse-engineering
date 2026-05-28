/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.appcompat.widget.AppCompatSeekBar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutEditGradientBinding
implements ViewBinding {
    public final LinearLayout layout;
    private final View rootView;
    public final AppCompatSeekBar seekbar;
    public final TextCustumFont tvAngle;

    private LayoutEditGradientBinding(View view, LinearLayout linearLayout, AppCompatSeekBar appCompatSeekBar, TextCustumFont textCustumFont) {
        this.rootView = view;
        this.layout = linearLayout;
        this.seekbar = appCompatSeekBar;
        this.tvAngle = textCustumFont;
    }

    public static LayoutEditGradientBinding bind(View object) {
        TextCustumFont textCustumFont;
        int n = R$id.layout;
        Object object2 = (LinearLayout)ViewBindings.findChildViewById((View)object, (int)n);
        int n2 = R$id.seekbar;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)ViewBindings.findChildViewById((View)object, (int)n2);
        if (appCompatSeekBar != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n2 = R$id.tv_angle))) != null) {
            LayoutEditGradientBinding layoutEditGradientBinding = new LayoutEditGradientBinding((View)object, (LinearLayout)object2, appCompatSeekBar, textCustumFont);
            return layoutEditGradientBinding;
        }
        object = object.getResources().getResourceName(n2);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutEditGradientBinding inflate(LayoutInflater layoutInflater) {
        return LayoutEditGradientBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutEditGradientBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_edit_gradient;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutEditGradientBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

