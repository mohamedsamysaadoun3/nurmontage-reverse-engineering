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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityTextEditBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final EditTextCustumFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final View view;
    
    private ActivityTextEditBinding(final RelativeLayout rootView, final ImageButton btnCancel, final ButtonCustumFont btnDone, final EditTextCustumFont edtReader, final RelativeLayout main, final RecyclerView rv, final View view) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.edtReader = edtReader;
        this.main = main;
        this.rv = rv;
        this.view = view;
    }
    
    public static ActivityTextEditBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_done;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.edt_reader;
                final EditTextCustumFont editTextCustumFont = (EditTextCustumFont)ViewBindings.findChildViewById(view, n);
                if (editTextCustumFont != null) {
                    final RelativeLayout relativeLayout = (RelativeLayout)view;
                    n = R$id.rv;
                    final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                    if (recyclerView != null) {
                        n = R$id.view;
                        final View childViewById = ViewBindings.findChildViewById(view, n);
                        if (childViewById != null) {
                            return new ActivityTextEditBinding(relativeLayout, imageButton, buttonCustumFont, editTextCustumFont, relativeLayout, recyclerView, childViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityTextEditBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityTextEditBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_text_edit, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
