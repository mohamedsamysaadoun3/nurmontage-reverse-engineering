/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
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
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class ActivityWorkUserBinding
implements ViewBinding {
    public final ImageButton btnMenu;
    public final ButtonCustumFont btnToStudio;
    public final RelativeLayout card;
    public final ImageView iv;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvAya;
    public final TextCustumFontBold tvSecret;

    private ActivityWorkUserBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, RelativeLayout relativeLayout2, ImageView imageView, RelativeLayout relativeLayout3, RecyclerView recyclerView, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold) {
        this.rootView = relativeLayout;
        this.btnMenu = imageButton;
        this.btnToStudio = buttonCustumFont;
        this.card = relativeLayout2;
        this.iv = imageView;
        this.main = relativeLayout3;
        this.rv = recyclerView;
        this.tvAya = textCustumFont;
        this.tvSecret = textCustumFontBold;
    }

    public static ActivityWorkUserBinding bind(View object) {
        View view;
        int n = R$id.btn_menu;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_to_studio;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (ButtonCustumFont)view;
            if (object2 != null) {
                n = R$id.card;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (RelativeLayout)view;
                if (view3 != null) {
                    n = R$id.iv;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (RelativeLayout)object;
                        n = R$id.rv;
                        View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view5 = (RecyclerView)view;
                        if (view5 != null) {
                            n = R$id.tv_aya;
                            Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object4 = (TextCustumFont)view;
                            if (object4 != null) {
                                n = R$id.tv_secret;
                                Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object5 = (TextCustumFontBold)view;
                                if (object5 != null) {
                                    object = new ActivityWorkUserBinding((RelativeLayout)object3, (ImageButton)view2, (ButtonCustumFont)((Object)object2), (RelativeLayout)view3, (ImageView)view4, (RelativeLayout)object3, (RecyclerView)view5, (TextCustumFont)((Object)object4), (TextCustumFontBold)((Object)object5));
                                    return object;
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

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater) {
        return ActivityWorkUserBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_work_user;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityWorkUserBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

