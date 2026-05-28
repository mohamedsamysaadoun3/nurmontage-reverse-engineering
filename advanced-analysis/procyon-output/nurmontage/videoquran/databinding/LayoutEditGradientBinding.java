// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutEditGradientBinding implements ViewBinding
{
    public final LinearLayout layout;
    private final View rootView;
    public final AppCompatSeekBar seekbar;
    public final TextCustumFont tvAngle;
    
    private LayoutEditGradientBinding(final View rootView, final LinearLayout layout, final AppCompatSeekBar seekbar, final TextCustumFont tvAngle) {
        this.rootView = rootView;
        this.layout = layout;
        this.seekbar = seekbar;
        this.tvAngle = tvAngle;
    }
    
    public static LayoutEditGradientBinding bind(final View view) {
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, R$id.layout);
        int n = R$id.seekbar;
        final AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)ViewBindings.findChildViewById(view, n);
        if (appCompatSeekBar != null) {
            n = R$id.tv_angle;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new LayoutEditGradientBinding(view, linearLayout, appCompatSeekBar, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutEditGradientBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutEditGradientBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_edit_gradient, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public View getRoot() {
        return this.rootView;
    }
}
