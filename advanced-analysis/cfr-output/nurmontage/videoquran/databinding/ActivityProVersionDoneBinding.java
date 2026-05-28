/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  nl.dionsegijn.konfetti.xml.KonfettiView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public final class ActivityProVersionDoneBinding
implements ViewBinding {
    public final LinearLayout btn;
    public final ImageButton btnOnBack;
    public final ImageButton btnShowPro;
    public final TextCustumFont hintReview;
    public final KonfettiView konfettiView;
    public final RelativeLayout main;
    public final TextCustumFontBold mtittle;
    public final Button restore;
    private final RelativeLayout rootView;
    public final RecyclerView rvImg;
    public final TextCustumFont tvThanks;

    private ActivityProVersionDoneBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, TextCustumFont textCustumFont, KonfettiView konfettiView, RelativeLayout relativeLayout2, TextCustumFontBold textCustumFontBold, Button button, RecyclerView recyclerView, TextCustumFont textCustumFont2) {
        this.rootView = relativeLayout;
        this.btn = linearLayout;
        this.btnOnBack = imageButton;
        this.btnShowPro = imageButton2;
        this.hintReview = textCustumFont;
        this.konfettiView = konfettiView;
        this.main = relativeLayout2;
        this.mtittle = textCustumFontBold;
        this.restore = button;
        this.rvImg = recyclerView;
        this.tvThanks = textCustumFont2;
    }

    public static ActivityProVersionDoneBinding bind(View object) {
        View view;
        int n = R$id.btn;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_on_back;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.btn_show_pro;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.hint_review;
                    Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object2 = (TextCustumFont)view;
                    if (object2 != null) {
                        n = R$id.konfettiView;
                        View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view5 = (KonfettiView)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (RelativeLayout)object;
                            n = R$id.mtittle;
                            Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object4 = (TextCustumFontBold)view;
                            if (object4 != null) {
                                n = R$id.restore;
                                View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view6 = (Button)view;
                                if (view6 != null) {
                                    n = R$id.rv_img;
                                    View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view7 = (RecyclerView)view;
                                    if (view7 != null) {
                                        n = R$id.tv_thanks;
                                        Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object5 = (TextCustumFont)view;
                                        if (object5 != null) {
                                            object = new ActivityProVersionDoneBinding((RelativeLayout)object3, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (TextCustumFont)((Object)object2), (KonfettiView)view5, (RelativeLayout)object3, (TextCustumFontBold)((Object)object4), (Button)view6, (RecyclerView)view7, (TextCustumFont)((Object)object5));
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
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityProVersionDoneBinding inflate(LayoutInflater layoutInflater) {
        return ActivityProVersionDoneBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionDoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_pro_version_done;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProVersionDoneBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

