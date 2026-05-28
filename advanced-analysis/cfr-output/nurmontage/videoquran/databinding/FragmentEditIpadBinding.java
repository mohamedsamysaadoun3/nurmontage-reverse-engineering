/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.tabs.TabLayout
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class FragmentEditIpadBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ImageButton btnChange;
    public final ImageButton btnClose;
    public final ImageButton btnDone;
    public final FrameLayout container;
    private final RelativeLayout rootView;
    public final RecyclerView rvType;
    public final TabLayout tabLayout;

    private FragmentEditIpadBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, FrameLayout frameLayout, RecyclerView recyclerView, TabLayout tabLayout) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnChange = imageButton2;
        this.btnClose = imageButton3;
        this.btnDone = imageButton4;
        this.container = frameLayout;
        this.rvType = recyclerView;
        this.tabLayout = tabLayout;
    }

    public static FragmentEditIpadBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_change;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.btn_close;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.btn_done;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageButton)view;
                    if (view5 != null) {
                        n = R$id.container;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (FrameLayout)view;
                        if (view6 != null) {
                            n = R$id.rv_type;
                            View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view7 = (RecyclerView)view;
                            if (view7 != null) {
                                n = R$id.tab_layout;
                                View view8 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view8 = (TabLayout)view;
                                if (view8 != null) {
                                    Object object2 = object;
                                    object2 = (RelativeLayout)object;
                                    FragmentEditIpadBinding fragmentEditIpadBinding = new FragmentEditIpadBinding((RelativeLayout)object2, (ImageButton)view2, (ImageButton)view3, (ImageButton)view4, (ImageButton)view5, (FrameLayout)view6, (RecyclerView)view7, (TabLayout)view8);
                                    return fragmentEditIpadBinding;
                                }
                            }
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

    public static FragmentEditIpadBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditIpadBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditIpadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_ipad;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditIpadBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

