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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityYoutuberBinding
implements ViewBinding {
    public final TextCustumFont btnGasadi;
    public final TextCustumFont btnHecham;
    public final TextCustumFont btnHilal;
    public final ImageButton btnOnBack;
    public final TextCustumFont btnPakistain;
    public final LinearLayout btnSendLnk;
    public final ImageView btnToAbout;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvHintSendLnk;
    public final TextCustumFont tvTutorial;

    private ActivityYoutuberBinding(RelativeLayout relativeLayout, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, ImageButton imageButton, TextCustumFont textCustumFont4, LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6) {
        this.rootView = relativeLayout;
        this.btnGasadi = textCustumFont;
        this.btnHecham = textCustumFont2;
        this.btnHilal = textCustumFont3;
        this.btnOnBack = imageButton;
        this.btnPakistain = textCustumFont4;
        this.btnSendLnk = linearLayout;
        this.btnToAbout = imageView;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.tvHintSendLnk = textCustumFont5;
        this.tvTutorial = textCustumFont6;
    }

    public static ActivityYoutuberBinding bind(View object) {
        View view;
        int n = R$id.btn_gasadi;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (TextCustumFont)view;
        if (object2 != null) {
            n = R$id.btn_hecham;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (TextCustumFont)view;
            if (object3 != null) {
                n = R$id.btn_hilal;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (TextCustumFont)view;
                if (object4 != null) {
                    n = R$id.btn_on_back;
                    View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view2 = (ImageButton)view;
                    if (view2 != null) {
                        n = R$id.btn_pakistain;
                        Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object5 = (TextCustumFont)view;
                        if (object5 != null) {
                            n = R$id.btn_send_lnk;
                            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n = R$id.btn_to_about;
                                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view4 = (ImageView)view;
                                if (view4 != null) {
                                    Object object6 = object;
                                    object6 = (RelativeLayout)object;
                                    n = R$id.rv;
                                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view5 = (RecyclerView)view;
                                    if (view5 != null) {
                                        n = R$id.tv_hint_send_lnk;
                                        Object object7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object7 = (TextCustumFont)view;
                                        if (object7 != null) {
                                            n = R$id.tv_tutorial;
                                            Object object8 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                            object8 = (TextCustumFont)view;
                                            if (object8 != null) {
                                                object = new ActivityYoutuberBinding((RelativeLayout)object6, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (ImageButton)view2, (TextCustumFont)((Object)object5), (LinearLayout)view3, (ImageView)view4, (RelativeLayout)object6, (RecyclerView)view5, (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8));
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

    public static ActivityYoutuberBinding inflate(LayoutInflater layoutInflater) {
        return ActivityYoutuberBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityYoutuberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_youtuber;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityYoutuberBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

