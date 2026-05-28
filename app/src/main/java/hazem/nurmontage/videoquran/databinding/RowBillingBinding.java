package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public final class RowBillingBinding implements ViewBinding {
    public final ImageView img;
    private final LinearLayout rootView;

    /* renamed from: tv */
    public final TextCustumFont f409tv;

    private RowBillingBinding(LinearLayout linearLayout, ImageView imageView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.img = imageView;
        this.f409tv = textCustumFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean isFlag) {
        View inflate = layoutInflater.inflate(C2014R.layout.row_billing, viewGroup, false);
        if (isFlag) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowBillingBinding bind(View view) {
        int i = C2014R.id.img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C2014R.id.f359tv;
            TextCustumFont textCustumFont = (TextCustumFont) ViewBindings.findChildViewById(view, i);
            if (textCustumFont != null) {
                return new RowBillingBinding((LinearLayout) view, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
