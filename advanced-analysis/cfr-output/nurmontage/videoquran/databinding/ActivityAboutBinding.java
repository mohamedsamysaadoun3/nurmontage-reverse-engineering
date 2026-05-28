/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class ActivityAboutBinding
implements ViewBinding {
    public final ImageButton btnOnBack;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final RelativeLayout toolbar;

    private ActivityAboutBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, RecyclerView recyclerView, RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.btnOnBack = imageButton;
        this.main = linearLayout2;
        this.rv = recyclerView;
        this.toolbar = relativeLayout;
    }

    public static ActivityAboutBinding bind(View object) {
        View view;
        int n = R$id.btn_on_back;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (LinearLayout)object;
            n = R$id.rv;
            View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view4 = (RecyclerView)view;
            if (view4 != null) {
                n = R$id.toolbar;
                View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view5 = (RelativeLayout)view;
                if (view5 != null) {
                    object = new ActivityAboutBinding((LinearLayout)view3, (ImageButton)view2, (LinearLayout)view3, (RecyclerView)view4, (RelativeLayout)view5);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAboutBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_about;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAboutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

