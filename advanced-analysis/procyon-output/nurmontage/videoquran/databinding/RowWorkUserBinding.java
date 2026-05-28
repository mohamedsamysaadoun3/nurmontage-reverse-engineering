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
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class RowWorkUserBinding implements ViewBinding
{
    public final ImageButton btnMenu;
    public final MaterialCardView crdIv;
    public final ImageView imageView;
    public final ImageView ivRatio;
    private final RelativeLayout rootView;
    public final TextCustumFont tvDate;
    public final TextCustumFontBold tvName;
    
    private RowWorkUserBinding(final RelativeLayout rootView, final ImageButton btnMenu, final MaterialCardView crdIv, final ImageView imageView, final ImageView ivRatio, final TextCustumFont tvDate, final TextCustumFontBold tvName) {
        this.rootView = rootView;
        this.btnMenu = btnMenu;
        this.crdIv = crdIv;
        this.imageView = imageView;
        this.ivRatio = ivRatio;
        this.tvDate = tvDate;
        this.tvName = tvName;
    }
    
    public static RowWorkUserBinding bind(final View view) {
        int n = R$id.btn_menu;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.crd_iv;
            final MaterialCardView materialCardView = (MaterialCardView)ViewBindings.findChildViewById(view, n);
            if (materialCardView != null) {
                n = R$id.imageView;
                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView != null) {
                    n = R$id.iv_ratio;
                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView2 != null) {
                        n = R$id.tv_date;
                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont != null) {
                            n = R$id.tv_name;
                            final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                            if (textCustumFontBold != null) {
                                return new RowWorkUserBinding((RelativeLayout)view, imageButton, materialCardView, imageView, imageView2, textCustumFont, textCustumFontBold);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowWorkUserBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowWorkUserBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_work_user, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
