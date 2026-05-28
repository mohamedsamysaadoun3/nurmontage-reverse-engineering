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
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class ActivityChoiceLangBinding implements ViewBinding
{
    public final ButtonCustumFont btnConfirm;
    public final TextCustumFont iconAr;
    public final TextCustumFont iconEn;
    public final RelativeLayout layoutArabic;
    public final RelativeLayout layoutEnglish;
    public final LinearLayout main;
    public final ImageView radioArabic;
    public final ImageView radioEnglish;
    private final LinearLayout rootView;
    public final TextCustumFont tvCancel;
    public final TextCustumFont tvSubTittle;
    public final TextCustumFontBold tvTittle;
    
    private ActivityChoiceLangBinding(final LinearLayout rootView, final ButtonCustumFont btnConfirm, final TextCustumFont iconAr, final TextCustumFont iconEn, final RelativeLayout layoutArabic, final RelativeLayout layoutEnglish, final LinearLayout main, final ImageView radioArabic, final ImageView radioEnglish, final TextCustumFont tvCancel, final TextCustumFont tvSubTittle, final TextCustumFontBold tvTittle) {
        this.rootView = rootView;
        this.btnConfirm = btnConfirm;
        this.iconAr = iconAr;
        this.iconEn = iconEn;
        this.layoutArabic = layoutArabic;
        this.layoutEnglish = layoutEnglish;
        this.main = main;
        this.radioArabic = radioArabic;
        this.radioEnglish = radioEnglish;
        this.tvCancel = tvCancel;
        this.tvSubTittle = tvSubTittle;
        this.tvTittle = tvTittle;
    }
    
    public static ActivityChoiceLangBinding bind(final View view) {
        int n = R$id.btn_confirm;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.icon_ar;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                n = R$id.icon_en;
                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont2 != null) {
                    n = R$id.layout_arabic;
                    final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                    if (relativeLayout != null) {
                        n = R$id.layout_english;
                        final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                        if (relativeLayout2 != null) {
                            final LinearLayout linearLayout = (LinearLayout)view;
                            n = R$id.radio_arabic;
                            final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                            if (imageView != null) {
                                n = R$id.radio_english;
                                final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                if (imageView2 != null) {
                                    n = R$id.tv_cancel;
                                    final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont3 != null) {
                                        n = R$id.tv_subTittle;
                                        final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont4 != null) {
                                            n = R$id.tv_tittle;
                                            final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFontBold != null) {
                                                return new ActivityChoiceLangBinding(linearLayout, buttonCustumFont, textCustumFont, textCustumFont2, relativeLayout, relativeLayout2, linearLayout, imageView, imageView2, textCustumFont3, textCustumFont4, textCustumFontBold);
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
    
    public static ActivityChoiceLangBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityChoiceLangBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_choice_lang, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
