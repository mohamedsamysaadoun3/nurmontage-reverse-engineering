/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;

public final class ActivityAddReaderNameBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    public final EditTextCustumFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;

    private ActivityAddReaderNameBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, EditTextCustumFont editTextCustumFont, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = imageButton2;
        this.edtReader = editTextCustumFont;
        this.main = relativeLayout2;
    }

    public static ActivityAddReaderNameBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_done;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.edt_reader;
                Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object2 = (EditTextCustumFont)view;
                if (object2 != null) {
                    Object object3 = object;
                    object3 = (RelativeLayout)object;
                    object = new ActivityAddReaderNameBinding((RelativeLayout)object3, (ImageButton)view2, (ImageButton)view3, (EditTextCustumFont)((Object)object2), (RelativeLayout)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityAddReaderNameBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAddReaderNameBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAddReaderNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_add_reader_name;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAddReaderNameBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

