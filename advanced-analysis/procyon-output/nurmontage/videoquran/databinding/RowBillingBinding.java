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
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class RowBillingBinding implements ViewBinding
{
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustumFont tv;
    
    private RowBillingBinding(final LinearLayout rootView, final ImageView img, final TextCustumFont tv) {
        this.rootView = rootView;
        this.img = img;
        this.tv = tv;
    }
    
    public static RowBillingBinding bind(final View view) {
        int n = R$id.img;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.tv;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new RowBillingBinding((LinearLayout)view, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowBillingBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowBillingBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_billing, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
