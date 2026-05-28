/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.card.MaterialCardView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class RowWorkUserBinding
implements ViewBinding {
    public final ImageButton btnMenu;
    public final MaterialCardView crdIv;
    public final ImageView imageView;
    public final ImageView ivRatio;
    private final RelativeLayout rootView;
    public final TextCustumFont tvDate;
    public final TextCustumFontBold tvName;

    private RowWorkUserBinding(RelativeLayout relativeLayout, ImageButton imageButton, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold) {
        this.rootView = relativeLayout;
        this.btnMenu = imageButton;
        this.crdIv = materialCardView;
        this.imageView = imageView;
        this.ivRatio = imageView2;
        this.tvDate = textCustumFont;
        this.tvName = textCustumFontBold;
    }

    public static RowWorkUserBinding bind(View object) {
        View view;
        int n = R$id.btn_menu;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.crd_iv;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (MaterialCardView)view;
            if (view3 != null) {
                n = R$id.imageView;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n = R$id.iv_ratio;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n = R$id.tv_date;
                        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object2 = (TextCustumFont)view;
                        if (object2 != null) {
                            n = R$id.tv_name;
                            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object3 = (TextCustumFontBold)view;
                            if (object3 != null) {
                                Object object4 = object;
                                object4 = (RelativeLayout)object;
                                RowWorkUserBinding rowWorkUserBinding = new RowWorkUserBinding((RelativeLayout)object4, (ImageButton)view2, (MaterialCardView)view3, (ImageView)view4, (ImageView)view5, (TextCustumFont)((Object)object2), (TextCustumFontBold)((Object)object3));
                                return rowWorkUserBinding;
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

    public static RowWorkUserBinding inflate(LayoutInflater layoutInflater) {
        return RowWorkUserBinding.inflate(layoutInflater, null, false);
    }

    public static RowWorkUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_work_user;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowWorkUserBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

