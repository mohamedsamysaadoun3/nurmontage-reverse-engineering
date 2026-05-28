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
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentProgressViewBinding
implements ViewBinding {
    public final ProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustumFont tvProgress;
    public final FrameLayout view1;
    public final FrameLayout view2;
    public final FrameLayout viewProgress;

    private FragmentProgressViewBinding(FrameLayout frameLayout, ProgressBar progressBar, TextCustumFont textCustumFont, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.rootView = frameLayout;
        this.progressHorizontal = progressBar;
        this.tvProgress = textCustumFont;
        this.view1 = frameLayout2;
        this.view2 = frameLayout3;
        this.viewProgress = frameLayout4;
    }

    public static FragmentProgressViewBinding bind(View object) {
        View view;
        int n = R$id.progress_horizontal;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ProgressBar)view;
        if (view2 != null) {
            n = R$id.tv_progress;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (TextCustumFont)view;
            if (object2 != null) {
                n = R$id.view_1;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (FrameLayout)view;
                if (view3 != null) {
                    n = R$id.view_2;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (FrameLayout)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (FrameLayout)object;
                        object = new FragmentProgressViewBinding((FrameLayout)object3, (ProgressBar)view2, (TextCustumFont)((Object)object2), (FrameLayout)view3, (FrameLayout)view4, (FrameLayout)object3);
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

    public static FragmentProgressViewBinding inflate(LayoutInflater layoutInflater) {
        return FragmentProgressViewBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_progress_view;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentProgressViewBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

