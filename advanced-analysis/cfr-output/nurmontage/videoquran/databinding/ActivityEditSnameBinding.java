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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivityEditSnameBinding
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
    public final TextCustumFont tvOption1;
    public final TextCustumFont tvOption2;
    public final TextCustumFontBold tvReaderName;
    public final TextCustumFontBold tvTittle;

    private ActivityEditSnameBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, CheckboxCustumFont checkboxCustumFont, EditTextCustumFont editTextCustumFont, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextCustumFontBold textCustumFontBold, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFontBold textCustumFontBold2, TextCustumFontBold textCustumFontBold3) {
        this.rootView = constraintLayout;
        this.btnDone = imageButton;
        this.btnOnBack = imageButton2;
        this.checkboxBg = checkboxCustumFont;
        this.edtReader = editTextCustumFont;
        this.layoutBg = linearLayout;
        this.main = constraintLayout2;
        this.rvColor = recyclerView;
        this.tvAddBg = textCustumFontBold;
        this.tvOption1 = textCustumFont;
        this.tvOption2 = textCustumFont2;
        this.tvReaderName = textCustumFontBold2;
        this.tvTittle = textCustumFontBold3;
    }

    public static ActivityEditSnameBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_done;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (ImageButton)view2;
        if (view3 != null) {
            n = R$id.btn_on_back;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (ImageButton)view2;
            if (view4 != null) {
                n = R$id.checkbox_bg;
                Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                object2 = (CheckboxCustumFont)view2;
                if (object2 != null) {
                    n = R$id.edt_reader;
                    Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    object3 = (EditTextCustumFont)view2;
                    if (object3 != null) {
                        n = R$id.layout_bg;
                        View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            View view6 = view;
                            view6 = (ConstraintLayout)view;
                            n = R$id.rv_color;
                            View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view7 = (RecyclerView)view2;
                            if (view7 != null) {
                                n = R$id.tv_add_bg;
                                Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                object4 = (TextCustumFontBold)view2;
                                if (object4 != null) {
                                    n = R$id.tv_option_1;
                                    Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object5 = (TextCustumFont)view2;
                                    if (object5 != null) {
                                        n = R$id.tv_option_2;
                                        Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        object6 = (TextCustumFont)view2;
                                        if (object6 != null) {
                                            n = R$id.tv_reader_name;
                                            Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            object7 = (TextCustumFontBold)view2;
                                            if (object7 != null) {
                                                n = R$id.tv_tittle;
                                                Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object8 = (TextCustumFontBold)view2;
                                                if (object8 != null) {
                                                    object = new ActivityEditSnameBinding((ConstraintLayout)view6, (ImageButton)view3, (ImageButton)view4, (CheckboxCustumFont)((Object)object2), (EditTextCustumFont)((Object)object3), (LinearLayout)view5, (ConstraintLayout)view6, (RecyclerView)view7, (TextCustumFontBold)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFontBold)((Object)object7), (TextCustumFontBold)((Object)object8));
                                                    return object;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityEditSnameBinding inflate(LayoutInflater layoutInflater) {
        return ActivityEditSnameBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityEditSnameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_edit_sname;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityEditSnameBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

