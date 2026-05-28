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

public final class FragmentFontBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    private final LinearLayout rootView;
    public final RecyclerView rv;

    private FragmentFontBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.btnCancel = imageButton;
        this.btnDone = imageButton2;
        this.rv = recyclerView;
    }

    public static FragmentFontBinding bind(View object) {
        RecyclerView recyclerView;
        ImageButton imageButton;
        int n = R$id.btn_cancel;
        ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageButton2 != null && (imageButton = (ImageButton)ViewBindings.findChildViewById((View)object, (int)(n = R$id.btn_done))) != null && (recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.rv))) != null) {
            object = (LinearLayout)object;
            FragmentFontBinding fragmentFontBinding = new FragmentFontBinding((LinearLayout)object, imageButton2, imageButton, recyclerView);
            return fragmentFontBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentFontBinding inflate(LayoutInflater layoutInflater) {
        return FragmentFontBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentFontBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_font;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentFontBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

