/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutAddImgVideoBinding
implements ViewBinding {
    public final LinearLayout btnAddImg;
    public final RelativeLayout btnAddVideo;
    public final ImageButton btnClose;
    public final ImageView img;
    public final ImageView ivDataDisable;
    private final LinearLayout rootView;
    public final TextCustumFont tvImg;
    public final TextCustumFont tvVideo;

    private LayoutAddImgVideoBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, ImageButton imageButton, ImageView imageView, ImageView imageView2, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.btnAddImg = linearLayout2;
        this.btnAddVideo = relativeLayout;
        this.btnClose = imageButton;
        this.img = imageView;
        this.ivDataDisable = imageView2;
        this.tvImg = textCustumFont;
        this.tvVideo = textCustumFont2;
    }

    public static LayoutAddImgVideoBinding bind(View object) {
        View view;
        int n = R$id.btn_add_img;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_add_video;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n = R$id.btn_close;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.img;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n = R$id.iv_data_disable;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n = R$id.tv_img;
                            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object2 = (TextCustumFont)view;
                            if (object2 != null) {
                                n = R$id.tv_video;
                                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object3 = (TextCustumFont)view;
                                if (object3 != null) {
                                    Object object4 = object;
                                    object4 = (LinearLayout)object;
                                    LayoutAddImgVideoBinding layoutAddImgVideoBinding = new LayoutAddImgVideoBinding((LinearLayout)object4, (LinearLayout)view2, (RelativeLayout)view3, (ImageButton)view4, (ImageView)view5, (ImageView)view6, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3));
                                    return layoutAddImgVideoBinding;
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

    public static LayoutAddImgVideoBinding inflate(LayoutInflater layoutInflater) {
        return LayoutAddImgVideoBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutAddImgVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_add_img_video;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutAddImgVideoBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

