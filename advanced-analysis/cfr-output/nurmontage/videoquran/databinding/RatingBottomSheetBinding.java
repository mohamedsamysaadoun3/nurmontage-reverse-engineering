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
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class RatingBottomSheetBinding
implements ViewBinding {
    public final ButtonCustumFont laterButton;
    public final ButtonCustumFont neverButton;
    public final ButtonCustumFont rateButton;
    private final LinearLayout rootView;
    public final TextCustumFont tvSubtittle;
    public final TextCustumFont tvTittle;

    private RatingBottomSheetBinding(LinearLayout linearLayout, ButtonCustumFont buttonCustumFont, ButtonCustumFont buttonCustumFont2, ButtonCustumFont buttonCustumFont3, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.laterButton = buttonCustumFont;
        this.neverButton = buttonCustumFont2;
        this.rateButton = buttonCustumFont3;
        this.tvSubtittle = textCustumFont;
        this.tvTittle = textCustumFont2;
    }

    public static RatingBottomSheetBinding bind(View object) {
        View view;
        int n = R$id.laterButton;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (ButtonCustumFont)view;
        if (object2 != null) {
            n = R$id.neverButton;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (ButtonCustumFont)view;
            if (object3 != null) {
                n = R$id.rateButton;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (ButtonCustumFont)view;
                if (object4 != null) {
                    n = R$id.tv_subtittle;
                    Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object5 = (TextCustumFont)view;
                    if (object5 != null) {
                        n = R$id.tv_tittle;
                        Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object6 = (TextCustumFont)view;
                        if (object6 != null) {
                            Object object7 = object;
                            object7 = (LinearLayout)object;
                            RatingBottomSheetBinding ratingBottomSheetBinding = new RatingBottomSheetBinding((LinearLayout)object7, (ButtonCustumFont)((Object)object2), (ButtonCustumFont)((Object)object3), (ButtonCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6));
                            return ratingBottomSheetBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RatingBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return RatingBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static RatingBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.rating_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RatingBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

