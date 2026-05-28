/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.cardview.widget.CardView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivitySupportBillingBinding
implements ViewBinding {
    public final ImageButton btnBilling;
    public final ButtonCustumFont btnLaunch;
    public final ImageButton btnOnBack;
    public final CardView card;
    public final ImageView ivBilling;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvAya;
    public final ButtonCustumFont view10;
    public final ButtonCustumFont view100;
    public final ButtonCustumFont view1000;
    public final ButtonCustumFont view50;

    private ActivitySupportBillingBinding(LinearLayout linearLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, ImageButton imageButton2, CardView cardView, ImageView imageView, LinearLayout linearLayout2, RecyclerView recyclerView, TextCustumFont textCustumFont, ButtonCustumFont buttonCustumFont2, ButtonCustumFont buttonCustumFont3, ButtonCustumFont buttonCustumFont4, ButtonCustumFont buttonCustumFont5) {
        this.rootView = linearLayout;
        this.btnBilling = imageButton;
        this.btnLaunch = buttonCustumFont;
        this.btnOnBack = imageButton2;
        this.card = cardView;
        this.ivBilling = imageView;
        this.main = linearLayout2;
        this.rv = recyclerView;
        this.tvAya = textCustumFont;
        this.view10 = buttonCustumFont2;
        this.view100 = buttonCustumFont3;
        this.view1000 = buttonCustumFont4;
        this.view50 = buttonCustumFont5;
    }

    public static ActivitySupportBillingBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_billing;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (ImageButton)view2;
        if (view3 != null) {
            n = R$id.btn_launch;
            Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            object2 = (ButtonCustumFont)view2;
            if (object2 != null) {
                n = R$id.btn_on_back;
                View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view4 = (ImageButton)view2;
                if (view4 != null) {
                    n = R$id.card;
                    View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view5 = (CardView)view2;
                    if (view5 != null) {
                        n = R$id.iv_billing;
                        View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            View view7 = view;
                            view7 = (LinearLayout)view;
                            n = R$id.rv;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (RecyclerView)view2;
                            if (view8 != null) {
                                n = R$id.tv_aya;
                                Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                object3 = (TextCustumFont)view2;
                                if (object3 != null) {
                                    n = R$id.view_10;
                                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object4 = (ButtonCustumFont)view2;
                                    if (object4 != null) {
                                        n = R$id.view_100;
                                        Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        object5 = (ButtonCustumFont)view2;
                                        if (object5 != null) {
                                            n = R$id.view_1000;
                                            Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            object6 = (ButtonCustumFont)view2;
                                            if (object6 != null) {
                                                n = R$id.view_50;
                                                Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object7 = (ButtonCustumFont)view2;
                                                if (object7 != null) {
                                                    object = new ActivitySupportBillingBinding((LinearLayout)view7, (ImageButton)view3, (ButtonCustumFont)((Object)object2), (ImageButton)view4, (CardView)view5, (ImageView)view6, (LinearLayout)view7, (RecyclerView)view8, (TextCustumFont)((Object)object3), (ButtonCustumFont)((Object)object4), (ButtonCustumFont)((Object)object5), (ButtonCustumFont)((Object)object6), (ButtonCustumFont)((Object)object7));
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

    public static ActivitySupportBillingBinding inflate(LayoutInflater layoutInflater) {
        return ActivitySupportBillingBinding.inflate(layoutInflater, null, false);
    }

    public static ActivitySupportBillingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_support_billing;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySupportBillingBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

