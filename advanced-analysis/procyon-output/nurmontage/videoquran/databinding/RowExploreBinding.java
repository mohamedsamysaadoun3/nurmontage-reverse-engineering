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
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import androidx.viewbinding.ViewBinding;

public final class RowExploreBinding implements ViewBinding
{
    public final SquareImageViewSimple img;
    private final LinearLayout rootView;
    public final TextCustumFont tvName;
    public final TextCustumFont tvSize;
    
    private RowExploreBinding(final LinearLayout rootView, final SquareImageViewSimple img, final TextCustumFont tvName, final TextCustumFont tvSize) {
        this.rootView = rootView;
        this.img = img;
        this.tvName = tvName;
        this.tvSize = tvSize;
    }
    
    public static RowExploreBinding bind(final View view) {
        int n = R$id.img;
        final SquareImageViewSimple squareImageViewSimple = (SquareImageViewSimple)ViewBindings.findChildViewById(view, n);
        if (squareImageViewSimple != null) {
            n = R$id.tv_name;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                n = R$id.tv_size;
                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont2 != null) {
                    return new RowExploreBinding((LinearLayout)view, squareImageViewSimple, textCustumFont, textCustumFont2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowExploreBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowExploreBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_explore, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
