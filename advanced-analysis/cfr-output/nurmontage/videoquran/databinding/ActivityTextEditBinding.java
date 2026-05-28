/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;

public final class ActivityTextEditBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final EditTextCustumFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final View view;

    private ActivityTextEditBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, EditTextCustumFont editTextCustumFont, RelativeLayout relativeLayout2, RecyclerView recyclerView, View view) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustumFont;
        this.edtReader = editTextCustumFont;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.view = view;
    }

    public static ActivityTextEditBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_done;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (ButtonCustumFont)view;
            if (object2 != null) {
                n = R$id.edt_reader;
                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object3 = (EditTextCustumFont)view;
                if (object3 != null) {
                    View view3;
                    Object object4 = object;
                    object4 = (RelativeLayout)object;
                    n = R$id.rv;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (RecyclerView)view;
                    if (view4 != null && (view3 = ViewBindings.findChildViewById((View)object, (int)(n = R$id.view))) != null) {
                        object = new ActivityTextEditBinding((RelativeLayout)object4, (ImageButton)view2, (ButtonCustumFont)((Object)object2), (EditTextCustumFont)((Object)object3), (RelativeLayout)object4, (RecyclerView)view4, view3);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater) {
        return ActivityTextEditBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_text_edit;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityTextEditBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

