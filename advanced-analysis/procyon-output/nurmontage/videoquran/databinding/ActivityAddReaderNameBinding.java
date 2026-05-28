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
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityAddReaderNameBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    public final EditTextCustumFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    
    private ActivityAddReaderNameBinding(final RelativeLayout rootView, final ImageButton btnCancel, final ImageButton btnDone, final EditTextCustumFont edtReader, final RelativeLayout main) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.edtReader = edtReader;
        this.main = main;
    }
    
    public static ActivityAddReaderNameBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_done;
            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton2 != null) {
                n = R$id.edt_reader;
                final EditTextCustumFont editTextCustumFont = (EditTextCustumFont)ViewBindings.findChildViewById(view, n);
                if (editTextCustumFont != null) {
                    final RelativeLayout relativeLayout = (RelativeLayout)view;
                    return new ActivityAddReaderNameBinding(relativeLayout, imageButton, imageButton2, editTextCustumFont, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityAddReaderNameBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityAddReaderNameBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_add_reader_name, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
