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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import androidx.recyclerview.widget.RecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityEditSnameBinding implements ViewBinding
{
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
    
    private ActivityEditSnameBinding(final ConstraintLayout rootView, final ImageButton btnDone, final ImageButton btnOnBack, final CheckboxCustumFont checkboxBg, final EditTextCustumFont edtReader, final LinearLayout layoutBg, final ConstraintLayout main, final RecyclerView rvColor, final TextCustumFontBold tvAddBg, final TextCustumFont tvOption1, final TextCustumFont tvOption2, final TextCustumFontBold tvReaderName, final TextCustumFontBold tvTittle) {
        this.rootView = rootView;
        this.btnDone = btnDone;
        this.btnOnBack = btnOnBack;
        this.checkboxBg = checkboxBg;
        this.edtReader = edtReader;
        this.layoutBg = layoutBg;
        this.main = main;
        this.rvColor = rvColor;
        this.tvAddBg = tvAddBg;
        this.tvOption1 = tvOption1;
        this.tvOption2 = tvOption2;
        this.tvReaderName = tvReaderName;
        this.tvTittle = tvTittle;
    }
    
    public static ActivityEditSnameBinding bind(final View view) {
        int n = R$id.btn_done;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_on_back;
            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton2 != null) {
                n = R$id.checkbox_bg;
                final CheckboxCustumFont checkboxCustumFont = (CheckboxCustumFont)ViewBindings.findChildViewById(view, n);
                if (checkboxCustumFont != null) {
                    n = R$id.edt_reader;
                    final EditTextCustumFont editTextCustumFont = (EditTextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (editTextCustumFont != null) {
                        n = R$id.layout_bg;
                        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                        if (linearLayout != null) {
                            final ConstraintLayout constraintLayout = (ConstraintLayout)view;
                            n = R$id.rv_color;
                            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                            if (recyclerView != null) {
                                n = R$id.tv_add_bg;
                                final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                if (textCustumFontBold != null) {
                                    n = R$id.tv_option_1;
                                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont != null) {
                                        n = R$id.tv_option_2;
                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont2 != null) {
                                            n = R$id.tv_reader_name;
                                            final TextCustumFontBold textCustumFontBold2 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFontBold2 != null) {
                                                n = R$id.tv_tittle;
                                                final TextCustumFontBold textCustumFontBold3 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                if (textCustumFontBold3 != null) {
                                                    return new ActivityEditSnameBinding(constraintLayout, imageButton, imageButton2, checkboxCustumFont, editTextCustumFont, linearLayout, constraintLayout, recyclerView, textCustumFontBold, textCustumFont, textCustumFont2, textCustumFontBold2, textCustumFontBold3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityEditSnameBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityEditSnameBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_edit_sname, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
