package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.C2014R;

/* loaded from: classes2.dex */
public final class FragmentFontBinding implements ViewBinding {
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    private final LinearLayout rootView;

    /* renamed from: rv */
    public final RecyclerView f406rv;

    private FragmentFontBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.btnCancel = imageButton;
        this.btnDone = imageButton2;
        this.f406rv = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFontBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFontBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2014R.layout.fragment_font, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFontBinding bind(View view) {
        int i = C2014R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = C2014R.id.btn_done;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton2 != null) {
                i = C2014R.id.f358rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentFontBinding((LinearLayout) view, imageButton, imageButton2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
