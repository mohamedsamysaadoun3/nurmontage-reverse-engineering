/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ProgressBar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class ActivityShareWithMeBinding
implements ViewBinding {
    public final FrameLayout main;
    public final ProgressBar progressHorizontal;
    private final FrameLayout rootView;

    private ActivityShareWithMeBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.main = frameLayout2;
        this.progressHorizontal = progressBar;
    }

    public static ActivityShareWithMeBinding bind(View object) {
        Object object2 = object;
        object2 = (FrameLayout)object;
        int n = R$id.progress_horizontal;
        ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)object, (int)n);
        if (progressBar != null) {
            object = new ActivityShareWithMeBinding((FrameLayout)object2, (FrameLayout)object2, progressBar);
            return object;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ActivityShareWithMeBinding inflate(LayoutInflater layoutInflater) {
        return ActivityShareWithMeBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityShareWithMeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_share_with_me;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityShareWithMeBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

