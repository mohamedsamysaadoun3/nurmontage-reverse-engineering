package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;

/* loaded from: classes2.dex */
public final class ActivityTextEditBinding implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final EditTextCustumFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;

    /* renamed from: rv */
    public final RecyclerView f397rv;
    public final View view;

    private ActivityTextEditBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, EditTextCustumFont editTextCustumFont, RelativeLayout relativeLayout2, RecyclerView recyclerView, View view) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustumFont;
        this.edtReader = editTextCustumFont;
        this.main = relativeLayout2;
        this.f397rv = recyclerView;
        this.view = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2014R.layout.activity_text_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTextEditBinding bind(View view) {
        View findChildViewById;
        int i = C2014R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = C2014R.id.btn_done;
            ButtonCustumFont buttonCustumFont = (ButtonCustumFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustumFont != null) {
                i = C2014R.id.edt_reader;
                EditTextCustumFont editTextCustumFont = (EditTextCustumFont) ViewBindings.findChildViewById(view, i);
                if (editTextCustumFont != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = C2014R.id.f358rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C2014R.id.view))) != null) {
                        return new ActivityTextEditBinding(relativeLayout, imageButton, buttonCustumFont, editTextCustumFont, relativeLayout, recyclerView, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
