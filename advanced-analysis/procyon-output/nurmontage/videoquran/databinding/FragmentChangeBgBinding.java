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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class FragmentChangeBgBinding implements ViewBinding
{
    public final ButtonCustumFont btnAdd;
    public final ImageButton btnCancel;
    public final ImageButton btnCrop;
    public final ImageButton btnDone;
    public final ButtonCustumFont btnVideoBg;
    public final LayoutAddImgVideoBinding layoutAddVideoImg;
    public final RelativeLayout layoutBgRv;
    private final FrameLayout rootView;
    public final RecyclerView rv;
    
    private FragmentChangeBgBinding(final FrameLayout rootView, final ButtonCustumFont btnAdd, final ImageButton btnCancel, final ImageButton btnCrop, final ImageButton btnDone, final ButtonCustumFont btnVideoBg, final LayoutAddImgVideoBinding layoutAddVideoImg, final RelativeLayout layoutBgRv, final RecyclerView rv) {
        this.rootView = rootView;
        this.btnAdd = btnAdd;
        this.btnCancel = btnCancel;
        this.btnCrop = btnCrop;
        this.btnDone = btnDone;
        this.btnVideoBg = btnVideoBg;
        this.layoutAddVideoImg = layoutAddVideoImg;
        this.layoutBgRv = layoutBgRv;
        this.rv = rv;
    }
    
    public static FragmentChangeBgBinding bind(final View view) {
        int n = R$id.btn_add;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.btn_cancel;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_crop;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.btn_done;
                    final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton3 != null) {
                        n = R$id.btn_video_bg;
                        final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                        if (buttonCustumFont2 != null) {
                            n = R$id.layout_add_video_img;
                            final View childViewById = ViewBindings.findChildViewById(view, n);
                            if (childViewById != null) {
                                final LayoutAddImgVideoBinding bind = LayoutAddImgVideoBinding.bind(childViewById);
                                n = R$id.layout_bg_rv;
                                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                if (relativeLayout != null) {
                                    n = R$id.rv;
                                    final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                    if (recyclerView != null) {
                                        return new FragmentChangeBgBinding((FrameLayout)view, buttonCustumFont, imageButton, imageButton2, imageButton3, buttonCustumFont2, bind, relativeLayout, recyclerView);
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
    
    public static FragmentChangeBgBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentChangeBgBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_change_bg, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
