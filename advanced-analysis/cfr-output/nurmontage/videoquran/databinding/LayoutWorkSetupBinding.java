/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutWorkSetupBinding
implements ViewBinding {
    public final RelativeLayout btnDelete;
    public final RelativeLayout btnDuplicate;
    public final RelativeLayout btnShare;
    private final LinearLayout rootView;
    public final TextCustumFont tvDelete;
    public final TextCustumFont tvDuplicate;
    public final TextCustumFont tvShare;

    private LayoutWorkSetupBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3) {
        this.rootView = linearLayout;
        this.btnDelete = relativeLayout;
        this.btnDuplicate = relativeLayout2;
        this.btnShare = relativeLayout3;
        this.tvDelete = textCustumFont;
        this.tvDuplicate = textCustumFont2;
        this.tvShare = textCustumFont3;
    }

    public static LayoutWorkSetupBinding bind(View object) {
        View view;
        int n = R$id.btn_delete;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n = R$id.btn_duplicate;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n = R$id.btn_share;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n = R$id.tv_delete;
                    Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object2 = (TextCustumFont)view;
                    if (object2 != null) {
                        n = R$id.tv_duplicate;
                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object3 = (TextCustumFont)view;
                        if (object3 != null) {
                            n = R$id.tv_share;
                            Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object4 = (TextCustumFont)view;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                LayoutWorkSetupBinding layoutWorkSetupBinding = new LayoutWorkSetupBinding((LinearLayout)object5, (RelativeLayout)view2, (RelativeLayout)view3, (RelativeLayout)view4, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4));
                                return layoutWorkSetupBinding;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutWorkSetupBinding inflate(LayoutInflater layoutInflater) {
        return LayoutWorkSetupBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutWorkSetupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_work_setup;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutWorkSetupBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

