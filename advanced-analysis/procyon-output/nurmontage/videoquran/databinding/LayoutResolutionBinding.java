// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutResolutionBinding implements ViewBinding
{
    private final LinearLayout rootView;
    public final CustomDiscreteSeekBar seekbarFps;
    public final CustomDiscreteSeekBar seekbarResolution;
    
    private LayoutResolutionBinding(final LinearLayout rootView, final CustomDiscreteSeekBar seekbarFps, final CustomDiscreteSeekBar seekbarResolution) {
        this.rootView = rootView;
        this.seekbarFps = seekbarFps;
        this.seekbarResolution = seekbarResolution;
    }
    
    public static LayoutResolutionBinding bind(final View view) {
        int n = R$id.seekbar_fps;
        final CustomDiscreteSeekBar customDiscreteSeekBar = (CustomDiscreteSeekBar)ViewBindings.findChildViewById(view, n);
        if (customDiscreteSeekBar != null) {
            n = R$id.seekbar_resolution;
            final CustomDiscreteSeekBar customDiscreteSeekBar2 = (CustomDiscreteSeekBar)ViewBindings.findChildViewById(view, n);
            if (customDiscreteSeekBar2 != null) {
                return new LayoutResolutionBinding((LinearLayout)view, customDiscreteSeekBar, customDiscreteSeekBar2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutResolutionBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutResolutionBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_resolution, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
