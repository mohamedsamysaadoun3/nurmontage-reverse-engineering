// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class RowFeatureBinding implements ViewBinding
{
    public final ImageView btnRadioYear;
    public final ImageView ivCheck;
    public final ImageView ivCheckFree;
    public final View line;
    private final LinearLayout rootView;
    public final TextCustumFont tvFeature;
    public final RelativeLayout view;
    
    private RowFeatureBinding(final LinearLayout rootView, final ImageView btnRadioYear, final ImageView ivCheck, final ImageView ivCheckFree, final View line, final TextCustumFont tvFeature, final RelativeLayout view) {
        this.rootView = rootView;
        this.btnRadioYear = btnRadioYear;
        this.ivCheck = ivCheck;
        this.ivCheckFree = ivCheckFree;
        this.line = line;
        this.tvFeature = tvFeature;
        this.view = view;
    }
    
    public static RowFeatureBinding bind(final View view) {
        int n = R$id.btn_radio_year;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.iv_check;
            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
            if (imageView2 != null) {
                n = R$id.iv_check_free;
                final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView3 != null) {
                    n = R$id.line;
                    final View childViewById = ViewBindings.findChildViewById(view, n);
                    if (childViewById != null) {
                        n = R$id.tv_feature;
                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont != null) {
                            n = R$id.view;
                            final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                            if (relativeLayout != null) {
                                return new RowFeatureBinding((LinearLayout)view, imageView, imageView2, imageView3, childViewById, textCustumFont, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowFeatureBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowFeatureBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_feature, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
