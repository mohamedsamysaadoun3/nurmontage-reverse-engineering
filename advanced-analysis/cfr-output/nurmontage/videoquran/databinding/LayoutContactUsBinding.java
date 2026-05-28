/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.card.MaterialCardView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class LayoutContactUsBinding
implements ViewBinding {
    public final Button btnContact;
    public final Button btnHelp;
    public final MaterialCardView btnSupportFinacial;
    public final MaterialCardView layoutHelp;
    private final LinearLayout rootView;

    private LayoutContactUsBinding(LinearLayout linearLayout, Button button, Button button2, MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        this.rootView = linearLayout;
        this.btnContact = button;
        this.btnHelp = button2;
        this.btnSupportFinacial = materialCardView;
        this.layoutHelp = materialCardView2;
    }

    public static LayoutContactUsBinding bind(View object) {
        View view;
        int n = R$id.btn_contact;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (Button)view;
        if (view2 != null) {
            n = R$id.btn_help;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (Button)view;
            if (view3 != null) {
                n = R$id.btn_support_finacial;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (MaterialCardView)view;
                if (view4 != null) {
                    n = R$id.layout_help;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (MaterialCardView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        LayoutContactUsBinding layoutContactUsBinding = new LayoutContactUsBinding((LinearLayout)object2, (Button)view2, (Button)view3, (MaterialCardView)view4, (MaterialCardView)view5);
                        return layoutContactUsBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutContactUsBinding inflate(LayoutInflater layoutInflater) {
        return LayoutContactUsBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutContactUsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_contact_us;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutContactUsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

