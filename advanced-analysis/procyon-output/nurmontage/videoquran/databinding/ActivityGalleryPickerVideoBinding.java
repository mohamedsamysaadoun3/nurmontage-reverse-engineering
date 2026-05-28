// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.widget.ProgressBar;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityGalleryPickerVideoBinding implements ViewBinding
{
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
    
    private ActivityGalleryPickerVideoBinding(final RelativeLayout rootView, final ImageButton btnOnBack, final RelativeLayout layout1, final RelativeLayout main, final RecyclerView rv, final RecyclerView rvExplore, final TabLayout tabLayout, final LayoutPermissionLimetedBinding toSetting, final ImageButton tvDone, final TextCustumFont tvFolders, final View view1, final ProgressBar viewProgress) {
        this.rootView = rootView;
        this.btnOnBack = btnOnBack;
        this.layout1 = layout1;
        this.main = main;
        this.rv = rv;
        this.rvExplore = rvExplore;
        this.tabLayout = tabLayout;
        this.toSetting = toSetting;
        this.tvDone = tvDone;
        this.tvFolders = tvFolders;
        this.view1 = view1;
        this.viewProgress = viewProgress;
    }
    
    public static ActivityGalleryPickerVideoBinding bind(final View view) {
        int n = R$id.btn_onBack;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.layout_1;
            final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
            if (relativeLayout != null) {
                final RelativeLayout relativeLayout2 = (RelativeLayout)view;
                n = R$id.rv;
                final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                if (recyclerView != null) {
                    n = R$id.rv_explore;
                    final RecyclerView recyclerView2 = (RecyclerView)ViewBindings.findChildViewById(view, n);
                    if (recyclerView2 != null) {
                        n = R$id.tab_layout;
                        final TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById(view, n);
                        if (tabLayout != null) {
                            n = R$id.to_setting;
                            final View childViewById = ViewBindings.findChildViewById(view, n);
                            if (childViewById != null) {
                                final LayoutPermissionLimetedBinding bind = LayoutPermissionLimetedBinding.bind(childViewById);
                                n = R$id.tv_done;
                                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                if (imageButton2 != null) {
                                    n = R$id.tv_folders;
                                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont != null) {
                                        n = R$id.view_1;
                                        final View childViewById2 = ViewBindings.findChildViewById(view, n);
                                        if (childViewById2 != null) {
                                            n = R$id.view_progress;
                                            final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
                                            if (progressBar != null) {
                                                return new ActivityGalleryPickerVideoBinding(relativeLayout2, imageButton, relativeLayout, relativeLayout2, recyclerView, recyclerView2, tabLayout, bind, imageButton2, textCustumFont, childViewById2, progressBar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityGalleryPickerVideoBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityGalleryPickerVideoBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_gallery_picker_video, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
