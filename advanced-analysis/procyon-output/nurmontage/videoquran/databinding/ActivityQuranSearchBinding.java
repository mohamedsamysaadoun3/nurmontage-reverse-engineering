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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class ActivityQuranSearchBinding implements ViewBinding
{
    public final ButtonCustumFont btnDone;
    public final ImageButton btnOnBack;
    public final ImageButton btnSearch;
    public final EditText edtSearchQuran;
    public final LinearLayout main;
    public final ProgressBar progress;
    private final LinearLayout rootView;
    public final RecyclerView rvSearchQuran;
    public final TextCustumFont tvCountAya;
    public final TextCustumFont tvTittle;
    
    private ActivityQuranSearchBinding(final LinearLayout rootView, final ButtonCustumFont btnDone, final ImageButton btnOnBack, final ImageButton btnSearch, final EditText edtSearchQuran, final LinearLayout main, final ProgressBar progress, final RecyclerView rvSearchQuran, final TextCustumFont tvCountAya, final TextCustumFont tvTittle) {
        this.rootView = rootView;
        this.btnDone = btnDone;
        this.btnOnBack = btnOnBack;
        this.btnSearch = btnSearch;
        this.edtSearchQuran = edtSearchQuran;
        this.main = main;
        this.progress = progress;
        this.rvSearchQuran = rvSearchQuran;
        this.tvCountAya = tvCountAya;
        this.tvTittle = tvTittle;
    }
    
    public static ActivityQuranSearchBinding bind(final View view) {
        int n = R$id.btn_done;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.btn_onBack;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_search;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.edt_search_quran;
                    final EditText editText = (EditText)ViewBindings.findChildViewById(view, n);
                    if (editText != null) {
                        final LinearLayout linearLayout = (LinearLayout)view;
                        n = R$id.progress;
                        final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
                        if (progressBar != null) {
                            n = R$id.rv_search_quran;
                            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                            if (recyclerView != null) {
                                n = R$id.tv_count_aya;
                                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont != null) {
                                    n = R$id.tv_tittle;
                                    final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont2 != null) {
                                        return new ActivityQuranSearchBinding(linearLayout, buttonCustumFont, imageButton, imageButton2, editText, linearLayout, progressBar, recyclerView, textCustumFont, textCustumFont2);
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
    
    public static ActivityQuranSearchBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityQuranSearchBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_quran_search, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
