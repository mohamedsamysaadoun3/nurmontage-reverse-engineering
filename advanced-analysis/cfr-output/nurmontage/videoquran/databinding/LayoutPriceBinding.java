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
 *  com.google.android.material.card.MaterialCardView
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
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class LayoutPriceBinding
implements ViewBinding {
    public final MaterialCardView btnForeiver;
    public final MaterialCardView btnMonth;
    public final ImageView btnRadioForeiver;
    public final ImageView btnRadioMonth;
    public final ImageView btnRadioYear;
    public final MaterialCardView btnYear;
    public final LinearLayout foreiverPriceBox;
    public final LinearLayout monthPriceBox;
    private final RelativeLayout rootView;
    public final TextCustumFont tvBestValue;
    public final TextCustumFontBold tvForeiver;
    public final TextCustumFont tvForeiverSubtitle;
    public final TextCustumFontBold tvPriceForeiver;
    public final TextCustumFontBold tvPriceMonth;
    public final TextCustumFontBold tvPriceYear;
    public final TextCustumFont tvYearBymonth;
    public final LinearLayout yearlyPriceBox;

    private LayoutPriceBinding(RelativeLayout relativeLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, MaterialCardView materialCardView3, LinearLayout linearLayout, LinearLayout linearLayout2, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold, TextCustumFont textCustumFont2, TextCustumFontBold textCustumFontBold2, TextCustumFontBold textCustumFontBold3, TextCustumFontBold textCustumFontBold4, TextCustumFont textCustumFont3, LinearLayout linearLayout3) {
        this.rootView = relativeLayout;
        this.btnForeiver = materialCardView;
        this.btnMonth = materialCardView2;
        this.btnRadioForeiver = imageView;
        this.btnRadioMonth = imageView2;
        this.btnRadioYear = imageView3;
        this.btnYear = materialCardView3;
        this.foreiverPriceBox = linearLayout;
        this.monthPriceBox = linearLayout2;
        this.tvBestValue = textCustumFont;
        this.tvForeiver = textCustumFontBold;
        this.tvForeiverSubtitle = textCustumFont2;
        this.tvPriceForeiver = textCustumFontBold2;
        this.tvPriceMonth = textCustumFontBold3;
        this.tvPriceYear = textCustumFontBold4;
        this.tvYearBymonth = textCustumFont3;
        this.yearlyPriceBox = linearLayout3;
    }

    public static LayoutPriceBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_foreiver;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (MaterialCardView)view2;
        if (view3 != null) {
            n = R$id.btn_month;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (MaterialCardView)view2;
            if (view4 != null) {
                n = R$id.btn_radio_foreiver;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (ImageView)view2;
                if (view5 != null) {
                    n = R$id.btn_radio_month;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (ImageView)view2;
                    if (view6 != null) {
                        n = R$id.btn_radio_year;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n = R$id.btn_year;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (MaterialCardView)view2;
                            if (view8 != null) {
                                n = R$id.foreiverPriceBox;
                                View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view9 = (LinearLayout)view2;
                                if (view9 != null) {
                                    n = R$id.monthPriceBox;
                                    View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view10 = (LinearLayout)view2;
                                    if (view10 != null) {
                                        n = R$id.tv_best_value;
                                        Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        object2 = (TextCustumFont)view2;
                                        if (object2 != null) {
                                            n = R$id.tv_foreiver;
                                            Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            object3 = (TextCustumFontBold)view2;
                                            if (object3 != null) {
                                                n = R$id.tvForeiverSubtitle;
                                                Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object4 = (TextCustumFont)view2;
                                                if (object4 != null) {
                                                    n = R$id.tv_price_foreiver;
                                                    Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    object5 = (TextCustumFontBold)view2;
                                                    if (object5 != null) {
                                                        n = R$id.tv_price_month;
                                                        Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        object6 = (TextCustumFontBold)view2;
                                                        if (object6 != null) {
                                                            n = R$id.tv_price_year;
                                                            Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            object7 = (TextCustumFontBold)view2;
                                                            if (object7 != null) {
                                                                n = R$id.tv_year_bymonth;
                                                                Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                object8 = (TextCustumFont)view2;
                                                                if (object8 != null) {
                                                                    n = R$id.yearlyPriceBox;
                                                                    View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    view11 = (LinearLayout)view2;
                                                                    if (view11 != null) {
                                                                        View view12 = view;
                                                                        view12 = (RelativeLayout)view;
                                                                        LayoutPriceBinding layoutPriceBinding = new LayoutPriceBinding((RelativeLayout)view12, (MaterialCardView)view3, (MaterialCardView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (MaterialCardView)view8, (LinearLayout)view9, (LinearLayout)view10, (TextCustumFont)((Object)object2), (TextCustumFontBold)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFontBold)((Object)object5), (TextCustumFontBold)((Object)object6), (TextCustumFontBold)((Object)object7), (TextCustumFont)((Object)object8), (LinearLayout)view11);
                                                                        return layoutPriceBinding;
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

    public static LayoutPriceBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPriceBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_price;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPriceBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

