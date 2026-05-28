package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.C2014R;

/* loaded from: classes2.dex */
public final class ActivityAboutBinding implements ViewBinding {
    public final ImageButton btnOnBack;
    public final LinearLayout main;
    private final LinearLayout rootView;

    /* renamed from: rv */
    public final RecyclerView f393rv;
    public final RelativeLayout toolbar;

    private ActivityAboutBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, RecyclerView recyclerView, RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.btnOnBack = imageButton;
        this.main = linearLayout2;
        this.f393rv = recyclerView;
        this.toolbar = relativeLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean isFlag) {
        View inflate = layoutInflater.inflate(C2014R.layout.activity_about, viewGroup, false);
        if (isFlag) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAboutBinding bind(View view) {
        int i = C2014R.id.btn_on_back;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = C2014R.id.f358rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C2014R.id.toolbar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    return new ActivityAboutBinding(linearLayout, imageButton, linearLayout, recyclerView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
