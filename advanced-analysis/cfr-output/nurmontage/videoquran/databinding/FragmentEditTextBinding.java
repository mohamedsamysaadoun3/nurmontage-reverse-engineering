/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class FragmentEditTextBinding
implements ViewBinding {
    public final ImageButton btnClose;
    private final LinearLayout rootView;
    public final RecyclerView rv;

    private FragmentEditTextBinding(LinearLayout linearLayout, ImageButton imageButton, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.btnClose = imageButton;
        this.rv = recyclerView;
    }

    public static FragmentEditTextBinding bind(View object) {
        RecyclerView recyclerView;
        int n = R$id.btn_close;
        ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageButton != null && (recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.rv))) != null) {
            object = (LinearLayout)object;
            FragmentEditTextBinding fragmentEditTextBinding = new FragmentEditTextBinding((LinearLayout)object, imageButton, recyclerView);
            return fragmentEditTextBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentEditTextBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditTextBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_text;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditTextBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

