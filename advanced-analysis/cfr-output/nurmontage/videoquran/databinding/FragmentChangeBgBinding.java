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
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutAddImgVideoBinding;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;

public final class FragmentChangeBgBinding
implements ViewBinding {
    public final ButtonCustumFont btnAdd;
    public final ImageButton btnCancel;
    public final ImageButton btnCrop;
    public final ImageButton btnDone;
    public final ButtonCustumFont btnVideoBg;
    public final LayoutAddImgVideoBinding layoutAddVideoImg;
    public final RelativeLayout layoutBgRv;
    private final FrameLayout rootView;
    public final RecyclerView rv;

    private FragmentChangeBgBinding(FrameLayout frameLayout, ButtonCustumFont buttonCustumFont, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ButtonCustumFont buttonCustumFont2, LayoutAddImgVideoBinding layoutAddImgVideoBinding, RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.btnAdd = buttonCustumFont;
        this.btnCancel = imageButton;
        this.btnCrop = imageButton2;
        this.btnDone = imageButton3;
        this.btnVideoBg = buttonCustumFont2;
        this.layoutAddVideoImg = layoutAddImgVideoBinding;
        this.layoutBgRv = relativeLayout;
        this.rv = recyclerView;
    }

    public static FragmentChangeBgBinding bind(View object) {
        View view;
        int n = R$id.btn_add;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (ButtonCustumFont)view;
        if (object2 != null) {
            n = R$id.btn_cancel;
            View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view2 = (ImageButton)view;
            if (view2 != null) {
                n = R$id.btn_crop;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (ImageButton)view;
                if (view3 != null) {
                    n = R$id.btn_done;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (ImageButton)view;
                    if (view4 != null) {
                        n = R$id.btn_video_bg;
                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object3 = (ButtonCustumFont)view;
                        if (object3 != null && (view = ViewBindings.findChildViewById((View)object, (int)(n = R$id.layout_add_video_img))) != null) {
                            LayoutAddImgVideoBinding layoutAddImgVideoBinding = LayoutAddImgVideoBinding.bind(view);
                            n = R$id.layout_bg_rv;
                            View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view5 = (RelativeLayout)view;
                            if (view5 != null) {
                                n = R$id.rv;
                                View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view6 = (RecyclerView)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (FrameLayout)object;
                                    FragmentChangeBgBinding fragmentChangeBgBinding = new FragmentChangeBgBinding((FrameLayout)object4, (ButtonCustumFont)((Object)object2), (ImageButton)view2, (ImageButton)view3, (ImageButton)view4, (ButtonCustumFont)((Object)object3), layoutAddImgVideoBinding, (RelativeLayout)view5, (RecyclerView)view6);
                                    return fragmentChangeBgBinding;
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

    public static FragmentChangeBgBinding inflate(LayoutInflater layoutInflater) {
        return FragmentChangeBgBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentChangeBgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_change_bg;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentChangeBgBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

