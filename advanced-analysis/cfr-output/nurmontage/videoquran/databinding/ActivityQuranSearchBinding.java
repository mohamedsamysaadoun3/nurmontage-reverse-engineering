/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityQuranSearchBinding
implements ViewBinding {
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

    private ActivityQuranSearchBinding(LinearLayout linearLayout, ButtonCustumFont buttonCustumFont, ImageButton imageButton, ImageButton imageButton2, EditText editText, LinearLayout linearLayout2, ProgressBar progressBar, RecyclerView recyclerView, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.btnDone = buttonCustumFont;
        this.btnOnBack = imageButton;
        this.btnSearch = imageButton2;
        this.edtSearchQuran = editText;
        this.main = linearLayout2;
        this.progress = progressBar;
        this.rvSearchQuran = recyclerView;
        this.tvCountAya = textCustumFont;
        this.tvTittle = textCustumFont2;
    }

    public static ActivityQuranSearchBinding bind(View object) {
        View view;
        int n = R$id.btn_done;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (ButtonCustumFont)view;
        if (object2 != null) {
            n = R$id.btn_onBack;
            View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view2 = (ImageButton)view;
            if (view2 != null) {
                n = R$id.btn_search;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (ImageButton)view;
                if (view3 != null) {
                    n = R$id.edt_search_quran;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (EditText)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (LinearLayout)object;
                        n = R$id.progress;
                        View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view5 = (ProgressBar)view;
                        if (view5 != null) {
                            n = R$id.rv_search_quran;
                            View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view6 = (RecyclerView)view;
                            if (view6 != null) {
                                n = R$id.tv_count_aya;
                                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object4 = (TextCustumFont)view;
                                if (object4 != null) {
                                    n = R$id.tv_tittle;
                                    Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    object5 = (TextCustumFont)view;
                                    if (object5 != null) {
                                        object = new ActivityQuranSearchBinding((LinearLayout)object3, (ButtonCustumFont)((Object)object2), (ImageButton)view2, (ImageButton)view3, (EditText)view4, (LinearLayout)object3, (ProgressBar)view5, (RecyclerView)view6, (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5));
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

    public static ActivityQuranSearchBinding inflate(LayoutInflater layoutInflater) {
        return ActivityQuranSearchBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityQuranSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_quran_search;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityQuranSearchBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

