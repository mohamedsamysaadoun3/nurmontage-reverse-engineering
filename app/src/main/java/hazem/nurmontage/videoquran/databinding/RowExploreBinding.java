package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public final class RowExploreBinding implements ViewBinding {
    public final SquareImageViewSimple img;
    private final LinearLayout rootView;
    public final TextCustumFont tvName;
    public final TextCustumFont tvSize;

    private RowExploreBinding(LinearLayout linearLayout, SquareImageViewSimple squareImageViewSimple, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.img = squareImageViewSimple;
        this.tvName = textCustumFont;
        this.tvSize = textCustumFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2014R.layout.row_explore, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowExploreBinding bind(View view) {
        int i = C2014R.id.img;
        SquareImageViewSimple squareImageViewSimple = (SquareImageViewSimple) ViewBindings.findChildViewById(view, i);
        if (squareImageViewSimple != null) {
            i = C2014R.id.tv_name;
            TextCustumFont textCustumFont = (TextCustumFont) ViewBindings.findChildViewById(view, i);
            if (textCustumFont != null) {
                i = C2014R.id.tv_size;
                TextCustumFont textCustumFont2 = (TextCustumFont) ViewBindings.findChildViewById(view, i);
                if (textCustumFont2 != null) {
                    return new RowExploreBinding((LinearLayout) view, squareImageViewSimple, textCustumFont, textCustumFont2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
