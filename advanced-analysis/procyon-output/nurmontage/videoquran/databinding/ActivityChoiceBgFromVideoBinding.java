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
import android.widget.RelativeLayout;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityChoiceBgFromVideoBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    public final VideoFrameSelectorView frameSelectorView;
    public final ImageView ivView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvTittleFragment;
    
    private ActivityChoiceBgFromVideoBinding(final RelativeLayout rootView, final ImageButton btnCancel, final ImageButton btnDone, final VideoFrameSelectorView frameSelectorView, final ImageView ivView, final RelativeLayout main, final TextCustumFont tvTittleFragment) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.frameSelectorView = frameSelectorView;
        this.ivView = ivView;
        this.main = main;
        this.tvTittleFragment = tvTittleFragment;
    }
    
    public static ActivityChoiceBgFromVideoBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_done;
            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton2 != null) {
                n = R$id.frameSelectorView;
                final VideoFrameSelectorView videoFrameSelectorView = (VideoFrameSelectorView)ViewBindings.findChildViewById(view, n);
                if (videoFrameSelectorView != null) {
                    n = R$id.iv_view;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        final RelativeLayout relativeLayout = (RelativeLayout)view;
                        n = R$id.tv_tittle_fragment;
                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont != null) {
                            return new ActivityChoiceBgFromVideoBinding(relativeLayout, imageButton, imageButton2, videoFrameSelectorView, imageView, relativeLayout, textCustumFont);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityChoiceBgFromVideoBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityChoiceBgFromVideoBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_choice_bg_from_video, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
