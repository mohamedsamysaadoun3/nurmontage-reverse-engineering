/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivityFullscreenBinding
implements ViewBinding {
    public final TextCustumFontBold nur;
    private final FrameLayout rootView;

    private ActivityFullscreenBinding(FrameLayout frameLayout, TextCustumFontBold textCustumFontBold) {
        this.rootView = frameLayout;
        this.nur = textCustumFontBold;
    }

    public static ActivityFullscreenBinding bind(View object) {
        int n = R$id.nur;
        TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById((View)object, (int)n);
        if (textCustumFontBold != null) {
            object = (FrameLayout)object;
            ActivityFullscreenBinding activityFullscreenBinding = new ActivityFullscreenBinding((FrameLayout)object, textCustumFontBold);
            return activityFullscreenBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityFullscreenBinding inflate(LayoutInflater layoutInflater) {
        return ActivityFullscreenBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityFullscreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_fullscreen;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityFullscreenBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

