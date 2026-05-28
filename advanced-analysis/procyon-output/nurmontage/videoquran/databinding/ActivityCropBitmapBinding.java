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
import hazem.nurmontage.videoquran.views.CropView;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityCropBitmapBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final CropView cropView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvTittleFragment;
    
    private ActivityCropBitmapBinding(final RelativeLayout rootView, final ImageButton btnCancel, final ButtonCustumFont btnDone, final CropView cropView, final RelativeLayout main, final TextCustumFont tvTittleFragment) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.cropView = cropView;
        this.main = main;
        this.tvTittleFragment = tvTittleFragment;
    }
    
    public static ActivityCropBitmapBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_done;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.crop_view;
                final CropView cropView = (CropView)ViewBindings.findChildViewById(view, n);
                if (cropView != null) {
                    final RelativeLayout relativeLayout = (RelativeLayout)view;
                    n = R$id.tv_tittle_fragment;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        return new ActivityCropBitmapBinding(relativeLayout, imageButton, buttonCustumFont, cropView, relativeLayout, textCustumFont);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityCropBitmapBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityCropBitmapBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_crop_bitmap, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
