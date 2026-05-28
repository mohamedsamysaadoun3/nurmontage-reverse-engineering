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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import androidx.viewbinding.ViewBinding;

public final class LayoutPriceBinding implements ViewBinding
{
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
    
    private LayoutPriceBinding(final RelativeLayout rootView, final MaterialCardView btnForeiver, final MaterialCardView btnMonth, final ImageView btnRadioForeiver, final ImageView btnRadioMonth, final ImageView btnRadioYear, final MaterialCardView btnYear, final LinearLayout foreiverPriceBox, final LinearLayout monthPriceBox, final TextCustumFont tvBestValue, final TextCustumFontBold tvForeiver, final TextCustumFont tvForeiverSubtitle, final TextCustumFontBold tvPriceForeiver, final TextCustumFontBold tvPriceMonth, final TextCustumFontBold tvPriceYear, final TextCustumFont tvYearBymonth, final LinearLayout yearlyPriceBox) {
        this.rootView = rootView;
        this.btnForeiver = btnForeiver;
        this.btnMonth = btnMonth;
        this.btnRadioForeiver = btnRadioForeiver;
        this.btnRadioMonth = btnRadioMonth;
        this.btnRadioYear = btnRadioYear;
        this.btnYear = btnYear;
        this.foreiverPriceBox = foreiverPriceBox;
        this.monthPriceBox = monthPriceBox;
        this.tvBestValue = tvBestValue;
        this.tvForeiver = tvForeiver;
        this.tvForeiverSubtitle = tvForeiverSubtitle;
        this.tvPriceForeiver = tvPriceForeiver;
        this.tvPriceMonth = tvPriceMonth;
        this.tvPriceYear = tvPriceYear;
        this.tvYearBymonth = tvYearBymonth;
        this.yearlyPriceBox = yearlyPriceBox;
    }
    
    public static LayoutPriceBinding bind(final View view) {
        int n = R$id.btn_foreiver;
        final MaterialCardView materialCardView = (MaterialCardView)ViewBindings.findChildViewById(view, n);
        if (materialCardView != null) {
            n = R$id.btn_month;
            final MaterialCardView materialCardView2 = (MaterialCardView)ViewBindings.findChildViewById(view, n);
            if (materialCardView2 != null) {
                n = R$id.btn_radio_foreiver;
                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView != null) {
                    n = R$id.btn_radio_month;
                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView2 != null) {
                        n = R$id.btn_radio_year;
                        final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView3 != null) {
                            n = R$id.btn_year;
                            final MaterialCardView materialCardView3 = (MaterialCardView)ViewBindings.findChildViewById(view, n);
                            if (materialCardView3 != null) {
                                n = R$id.foreiverPriceBox;
                                final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                if (linearLayout != null) {
                                    n = R$id.monthPriceBox;
                                    final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                    if (linearLayout2 != null) {
                                        n = R$id.tv_best_value;
                                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont != null) {
                                            n = R$id.tv_foreiver;
                                            final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFontBold != null) {
                                                n = R$id.tvForeiverSubtitle;
                                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                if (textCustumFont2 != null) {
                                                    n = R$id.tv_price_foreiver;
                                                    final TextCustumFontBold textCustumFontBold2 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                    if (textCustumFontBold2 != null) {
                                                        n = R$id.tv_price_month;
                                                        final TextCustumFontBold textCustumFontBold3 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                        if (textCustumFontBold3 != null) {
                                                            n = R$id.tv_price_year;
                                                            final TextCustumFontBold textCustumFontBold4 = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                            if (textCustumFontBold4 != null) {
                                                                n = R$id.tv_year_bymonth;
                                                                final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                if (textCustumFont3 != null) {
                                                                    n = R$id.yearlyPriceBox;
                                                                    final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                    if (linearLayout3 != null) {
                                                                        return new LayoutPriceBinding((RelativeLayout)view, materialCardView, materialCardView2, imageView, imageView2, imageView3, materialCardView3, linearLayout, linearLayout2, textCustumFont, textCustumFontBold, textCustumFont2, textCustumFontBold2, textCustumFontBold3, textCustumFontBold4, textCustumFont3, linearLayout3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutPriceBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutPriceBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_price, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
