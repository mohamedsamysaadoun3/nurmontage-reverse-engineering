/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.constraintlayout.widget.ConstraintLayout
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivityEditTrslBinding
implements ViewBinding {
    public final ImageButton btnDone;
    public final ImageButton btnOnBack;
    public final CheckboxCustumFont checkboxBg;
    public final EditTextCustumFont edtReader;
    public final LinearLayout layoutBg;
    public final ConstraintLayout main;
    private final ConstraintLayout rootView;
    public final RecyclerView rvColor;
    public final TextCustumFontBold tvAddBg;
    public final TextCustumFontBold tvTittle;

    private ActivityEditTrslBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, CheckboxCustumFont checkboxCustumFont, EditTextCustumFont editTextCustumFont, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextCustumFontBold textCustumFontBold, TextCustumFontBold textCustumFontBold2) {
        this.rootView = constraintLayout;
        this.btnDone = imageButton;
        this.btnOnBack = imageButton2;
        this.checkboxBg = checkboxCustumFont;
        this.edtReader = editTextCustumFont;
        this.layoutBg = linearLayout;
        this.main = constraintLayout2;
        this.rvColor = recyclerView;
        this.tvAddBg = textCustumFontBold;
        this.tvTittle = textCustumFontBold2;
    }

    public static ActivityEditTrslBinding bind(View object) {
        View view;
        int n = R$id.btn_done;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_on_back;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.checkbox_bg;
                Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object2 = (CheckboxCustumFont)view;
                if (object2 != null) {
                    n = R$id.edt_reader;
                    Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object3 = (EditTextCustumFont)view;
                    if (object3 != null) {
                        n = R$id.layout_bg;
                        View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view4 = (LinearLayout)view;
                        if (view4 != null) {
                            Object object4 = object;
                            object4 = (ConstraintLayout)object;
                            n = R$id.rv_color;
                            View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view5 = (RecyclerView)view;
                            if (view5 != null) {
                                n = R$id.tv_add_bg;
                                Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object5 = (TextCustumFontBold)view;
                                if (object5 != null) {
                                    n = R$id.tv_tittle;
                                    Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    object6 = (TextCustumFontBold)view;
                                    if (object6 != null) {
                                        object = new ActivityEditTrslBinding((ConstraintLayout)object4, (ImageButton)view2, (ImageButton)view3, (CheckboxCustumFont)((Object)object2), (EditTextCustumFont)((Object)object3), (LinearLayout)view4, (ConstraintLayout)object4, (RecyclerView)view5, (TextCustumFontBold)((Object)object5), (TextCustumFontBold)((Object)object6));
                                        return object;
                                    }
                                }
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

    public static ActivityEditTrslBinding inflate(LayoutInflater layoutInflater) {
        return ActivityEditTrslBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityEditTrslBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_edit_trsl;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityEditTrslBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

