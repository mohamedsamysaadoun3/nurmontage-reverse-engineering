/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.SquareImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class RowGalleryBinding
implements ViewBinding {
    public final ImageButton btnDeleted;
    public final SquareImageView img;
    private final FrameLayout rootView;
    public final TextCustumFont tvTime;

    private RowGalleryBinding(FrameLayout frameLayout, ImageButton imageButton, SquareImageView squareImageView, TextCustumFont textCustumFont) {
        this.rootView = frameLayout;
        this.btnDeleted = imageButton;
        this.img = squareImageView;
        this.tvTime = textCustumFont;
    }

    public static RowGalleryBinding bind(View object) {
        TextCustumFont textCustumFont;
        SquareImageView squareImageView;
        int n = R$id.btn_deleted;
        ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageButton != null && (squareImageView = (SquareImageView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.img))) != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_time))) != null) {
            object = (FrameLayout)object;
            RowGalleryBinding rowGalleryBinding = new RowGalleryBinding((FrameLayout)object, imageButton, squareImageView, textCustumFont);
            return rowGalleryBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowGalleryBinding inflate(LayoutInflater layoutInflater) {
        return RowGalleryBinding.inflate(layoutInflater, null, false);
    }

    public static RowGalleryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_gallery;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowGalleryBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

