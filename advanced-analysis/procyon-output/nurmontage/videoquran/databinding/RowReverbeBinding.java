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

public final class RowReverbeBinding implements ViewBinding
{
    public final ImageView ivBtnPlay;
    private final LinearLayout rootView;
    public final TextCustumFont wordAya;
    
    private RowReverbeBinding(final LinearLayout rootView, final ImageView ivBtnPlay, final TextCustumFont wordAya) {
        this.rootView = rootView;
        this.ivBtnPlay = ivBtnPlay;
        this.wordAya = wordAya;
    }
    
    public static RowReverbeBinding bind(final View view) {
        int n = R$id.iv_btn_play;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.word_aya;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new RowReverbeBinding((LinearLayout)view, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowReverbeBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowReverbeBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_reverbe, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
