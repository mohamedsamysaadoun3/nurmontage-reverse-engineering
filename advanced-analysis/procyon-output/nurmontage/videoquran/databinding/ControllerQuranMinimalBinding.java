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
import android.widget.FrameLayout;
import androidx.media3.ui.DefaultTimeBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class ControllerQuranMinimalBinding implements ViewBinding
{
    public final LinearLayout bottomBar;
    public final ImageButton btnBack;
    public final ImageButton btnPlayPause;
    public final ImageButton btnRotate;
    public final TextCustumFont exoDuration;
    public final TextCustumFont exoPosition;
    public final DefaultTimeBar exoProgress;
    private final FrameLayout rootView;
    public final LinearLayout topBar;
    
    private ControllerQuranMinimalBinding(final FrameLayout rootView, final LinearLayout bottomBar, final ImageButton btnBack, final ImageButton btnPlayPause, final ImageButton btnRotate, final TextCustumFont exoDuration, final TextCustumFont exoPosition, final DefaultTimeBar exoProgress, final LinearLayout topBar) {
        this.rootView = rootView;
        this.bottomBar = bottomBar;
        this.btnBack = btnBack;
        this.btnPlayPause = btnPlayPause;
        this.btnRotate = btnRotate;
        this.exoDuration = exoDuration;
        this.exoPosition = exoPosition;
        this.exoProgress = exoProgress;
        this.topBar = topBar;
    }
    
    public static ControllerQuranMinimalBinding bind(final View view) {
        int n = R$id.bottomBar;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btnBack;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_play_pause;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.btnRotate;
                    final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton3 != null) {
                        n = androidx.media3.ui.R$id.exo_duration;
                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont != null) {
                            n = androidx.media3.ui.R$id.exo_position;
                            final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont2 != null) {
                                n = androidx.media3.ui.R$id.exo_progress;
                                final DefaultTimeBar defaultTimeBar = (DefaultTimeBar)ViewBindings.findChildViewById(view, n);
                                if (defaultTimeBar != null) {
                                    n = R$id.topBar;
                                    final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                    if (linearLayout2 != null) {
                                        return new ControllerQuranMinimalBinding((FrameLayout)view, linearLayout, imageButton, imageButton2, imageButton3, textCustumFont, textCustumFont2, defaultTimeBar, linearLayout2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ControllerQuranMinimalBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ControllerQuranMinimalBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.controller_quran_minimal, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
