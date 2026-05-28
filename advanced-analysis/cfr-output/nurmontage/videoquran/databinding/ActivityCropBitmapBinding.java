/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.CropView;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityCropBitmapBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final CropView cropView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvTittleFragment;

    private ActivityCropBitmapBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, CropView cropView, RelativeLayout relativeLayout2, TextCustumFont textCustumFont) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustumFont;
        this.cropView = cropView;
        this.main = relativeLayout2;
        this.tvTittleFragment = textCustumFont;
    }

    public static ActivityCropBitmapBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_done;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (ButtonCustumFont)view;
            if (object2 != null) {
                n = R$id.crop_view;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (CropView)view;
                if (view3 != null) {
                    Object object3 = object;
                    object3 = (RelativeLayout)object;
                    n = R$id.tv_tittle_fragment;
                    Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object4 = (TextCustumFont)view;
                    if (object4 != null) {
                        object = new ActivityCropBitmapBinding((RelativeLayout)object3, (ImageButton)view2, (ButtonCustumFont)((Object)object2), (CropView)view3, (RelativeLayout)object3, (TextCustumFont)((Object)object4));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityCropBitmapBinding inflate(LayoutInflater layoutInflater) {
        return ActivityCropBitmapBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityCropBitmapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_crop_bitmap;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityCropBitmapBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

