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
import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.views.SquareImageView;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class RowGallerySelectBinding implements ViewBinding
{
    public final ImageButton btnDeleted;
    public final SquareImageView img;
    private final FrameLayout rootView;
    public final TextCustumFont tvTime;
    
    private RowGallerySelectBinding(final FrameLayout rootView, final ImageButton btnDeleted, final SquareImageView img, final TextCustumFont tvTime) {
        this.rootView = rootView;
        this.btnDeleted = btnDeleted;
        this.img = img;
        this.tvTime = tvTime;
    }
    
    public static RowGallerySelectBinding bind(final View view) {
        int n = R$id.btn_deleted;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.img;
            final SquareImageView squareImageView = (SquareImageView)ViewBindings.findChildViewById(view, n);
            if (squareImageView != null) {
                n = R$id.tv_time;
                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont != null) {
                    return new RowGallerySelectBinding((FrameLayout)view, imageButton, squareImageView, textCustumFont);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowGallerySelectBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowGallerySelectBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_gallery_select, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
