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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityProgressViewBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnSupportTeam;
    public final LinearLayout layoutError;
    public final FrameLayout main;
    public final ProgressBar progress;
    public final SquareOutlineProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustumFont tvError;
    public final TextCustumFont tvHint;
    public final TextCustumFont tvProgress;
    
    private ActivityProgressViewBinding(final FrameLayout rootView, final ImageButton btnCancel, final ButtonCustumFont btnSupportTeam, final LinearLayout layoutError, final FrameLayout main, final ProgressBar progress, final SquareOutlineProgressBar progressHorizontal, final TextCustumFont tvError, final TextCustumFont tvHint, final TextCustumFont tvProgress) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnSupportTeam = btnSupportTeam;
        this.layoutError = layoutError;
        this.main = main;
        this.progress = progress;
        this.progressHorizontal = progressHorizontal;
        this.tvError = tvError;
        this.tvHint = tvHint;
        this.tvProgress = tvProgress;
    }
    
    public static ActivityProgressViewBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_support_team;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.layout_error;
                final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                if (linearLayout != null) {
                    final FrameLayout frameLayout = (FrameLayout)view;
                    n = R$id.progress;
                    final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
                    if (progressBar != null) {
                        n = R$id.progress_horizontal;
                        final SquareOutlineProgressBar squareOutlineProgressBar = (SquareOutlineProgressBar)ViewBindings.findChildViewById(view, n);
                        if (squareOutlineProgressBar != null) {
                            n = R$id.tv_error;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.tv_hint;
                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont2 != null) {
                                    n = R$id.tv_progress;
                                    final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont3 != null) {
                                        return new ActivityProgressViewBinding(frameLayout, imageButton, buttonCustumFont, linearLayout, frameLayout, progressBar, squareOutlineProgressBar, textCustumFont, textCustumFont2, textCustumFont3);
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
    
    public static ActivityProgressViewBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityProgressViewBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_progress_view, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
