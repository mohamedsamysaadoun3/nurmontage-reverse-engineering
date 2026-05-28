/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivityChoiceLangBinding
implements ViewBinding {
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

    private ActivityChoiceLangBinding(LinearLayout linearLayout, ButtonCustumFont buttonCustumFont, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFontBold textCustumFontBold) {
        this.rootView = linearLayout;
        this.btnConfirm = buttonCustumFont;
        this.iconAr = textCustumFont;
        this.iconEn = textCustumFont2;
        this.layoutArabic = relativeLayout;
        this.layoutEnglish = relativeLayout2;
        this.main = linearLayout2;
        this.radioArabic = imageView;
        this.radioEnglish = imageView2;
        this.tvCancel = textCustumFont3;
        this.tvSubTittle = textCustumFont4;
        this.tvTittle = textCustumFontBold;
    }

    public static ActivityChoiceLangBinding bind(View object) {
        View view;
        int n = R$id.btn_confirm;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (ButtonCustumFont)view;
        if (object2 != null) {
            n = R$id.icon_ar;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (TextCustumFont)view;
            if (object3 != null) {
                n = R$id.icon_en;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (TextCustumFont)view;
                if (object4 != null) {
                    n = R$id.layout_arabic;
                    View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view2 = (RelativeLayout)view;
                    if (view2 != null) {
                        n = R$id.layout_english;
                        View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view3 = (RelativeLayout)view;
                        if (view3 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            n = R$id.radio_arabic;
                            View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view4 = (ImageView)view;
                            if (view4 != null) {
                                n = R$id.radio_english;
                                View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view5 = (ImageView)view;
                                if (view5 != null) {
                                    n = R$id.tv_cancel;
                                    Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    object6 = (TextCustumFont)view;
                                    if (object6 != null) {
                                        n = R$id.tv_subTittle;
                                        Object object7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object7 = (TextCustumFont)view;
                                        if (object7 != null) {
                                            n = R$id.tv_tittle;
                                            Object object8 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                            object8 = (TextCustumFontBold)view;
                                            if (object8 != null) {
                                                object = new ActivityChoiceLangBinding((LinearLayout)object5, (ButtonCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (RelativeLayout)view2, (RelativeLayout)view3, (LinearLayout)object5, (ImageView)view4, (ImageView)view5, (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFontBold)((Object)object8));
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
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityChoiceLangBinding inflate(LayoutInflater layoutInflater) {
        return ActivityChoiceLangBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityChoiceLangBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_choice_lang;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityChoiceLangBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

