/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ProgressBar
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
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutPermissionLimetedBinding;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityGalleryPickerVideoBinding
implements ViewBinding {
    public final ImageButton btnOnBack;
    public final RelativeLayout layout1;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final RecyclerView rvExplore;
    public final TabLayout tabLayout;
    public final LayoutPermissionLimetedBinding toSetting;
    public final ImageButton tvDone;
    public final TextCustumFont tvFolders;
    public final View view1;
    public final ProgressBar viewProgress;

    private ActivityGalleryPickerVideoBinding(RelativeLayout relativeLayout, ImageButton imageButton, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, TabLayout tabLayout, LayoutPermissionLimetedBinding layoutPermissionLimetedBinding, ImageButton imageButton2, TextCustumFont textCustumFont, View view, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.btnOnBack = imageButton;
        this.layout1 = relativeLayout2;
        this.main = relativeLayout3;
        this.rv = recyclerView;
        this.rvExplore = recyclerView2;
        this.tabLayout = tabLayout;
        this.toSetting = layoutPermissionLimetedBinding;
        this.tvDone = imageButton2;
        this.tvFolders = textCustumFont;
        this.view1 = view;
        this.viewProgress = progressBar;
    }

    public static ActivityGalleryPickerVideoBinding bind(View object) {
        View view;
        int n = R$id.btn_onBack;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.layout_1;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                Object object2 = object;
                object2 = (RelativeLayout)object;
                n = R$id.rv;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (RecyclerView)view;
                if (view4 != null) {
                    n = R$id.rv_explore;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (RecyclerView)view;
                    if (view5 != null) {
                        n = R$id.tab_layout;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (TabLayout)view;
                        if (view6 != null && (view = ViewBindings.findChildViewById((View)object, (int)(n = R$id.to_setting))) != null) {
                            LayoutPermissionLimetedBinding layoutPermissionLimetedBinding = LayoutPermissionLimetedBinding.bind(view);
                            n = R$id.tv_done;
                            View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view7 = (ImageButton)view;
                            if (view7 != null) {
                                View view8;
                                n = R$id.tv_folders;
                                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object3 = (TextCustumFont)view;
                                if (object3 != null && (view8 = ViewBindings.findChildViewById((View)object, (int)(n = R$id.view_1))) != null) {
                                    n = R$id.view_progress;
                                    View view9 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view9 = (ProgressBar)view;
                                    if (view9 != null) {
                                        object = new ActivityGalleryPickerVideoBinding((RelativeLayout)object2, (ImageButton)view2, (RelativeLayout)view3, (RelativeLayout)object2, (RecyclerView)view4, (RecyclerView)view5, (TabLayout)view6, layoutPermissionLimetedBinding, (ImageButton)view7, (TextCustumFont)((Object)object3), view8, (ProgressBar)view9);
                                        return object;
                                    }
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

    public static ActivityGalleryPickerVideoBinding inflate(LayoutInflater layoutInflater) {
        return ActivityGalleryPickerVideoBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityGalleryPickerVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_gallery_picker_video;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityGalleryPickerVideoBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

