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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutAddImgVideoBinding implements ViewBinding
{
    public final LinearLayout btnAddImg;
    public final RelativeLayout btnAddVideo;
    public final ImageButton btnClose;
    public final ImageView img;
    public final ImageView ivDataDisable;
    private final LinearLayout rootView;
    public final TextCustumFont tvImg;
    public final TextCustumFont tvVideo;
    
    private LayoutAddImgVideoBinding(final LinearLayout rootView, final LinearLayout btnAddImg, final RelativeLayout btnAddVideo, final ImageButton btnClose, final ImageView img, final ImageView ivDataDisable, final TextCustumFont tvImg, final TextCustumFont tvVideo) {
        this.rootView = rootView;
        this.btnAddImg = btnAddImg;
        this.btnAddVideo = btnAddVideo;
        this.btnClose = btnClose;
        this.img = img;
        this.ivDataDisable = ivDataDisable;
        this.tvImg = tvImg;
        this.tvVideo = tvVideo;
    }
    
    public static LayoutAddImgVideoBinding bind(final View view) {
        int n = R$id.btn_add_img;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_add_video;
            final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
            if (relativeLayout != null) {
                n = R$id.btn_close;
                final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton != null) {
                    n = R$id.img;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        n = R$id.iv_data_disable;
                        final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView2 != null) {
                            n = R$id.tv_img;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.tv_video;
                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont2 != null) {
                                    return new LayoutAddImgVideoBinding((LinearLayout)view, linearLayout, relativeLayout, imageButton, imageView, imageView2, textCustumFont, textCustumFont2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutAddImgVideoBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutAddImgVideoBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_add_img_video, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
