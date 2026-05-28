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
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.card.MaterialCardView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutBtnShareBinding;
import hazem.nurmontage.videoquran.databinding.LayoutBtnUnlockBinding;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityVideoViewBinding
implements ViewBinding {
    public final ImageButton btnBilling;
    public final ButtonCustumFont btnEdit;
    public final ImageButton btnHome;
    public final ButtonCustumFont btnHome1;
    public final ImageButton btnOnBack;
    public final ImageView btnPlayPause;
    public final LayoutBtnUnlockBinding btnPremium;
    public final LayoutBtnShareBinding btnShare;
    public final ImageButton btnSharePost;
    public final MaterialCardView btnTuffah;
    public final LinearLayout frame;
    public final RelativeLayout main;
    public final RelativeLayout parentLayout;
    private final RelativeLayout rootView;
    public final TextCustumFont txtShare;
    public final ImageView videoView;

    private ActivityVideoViewBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, ImageButton imageButton2, ButtonCustumFont buttonCustumFont2, ImageButton imageButton3, ImageView imageView, LayoutBtnUnlockBinding layoutBtnUnlockBinding, LayoutBtnShareBinding layoutBtnShareBinding, ImageButton imageButton4, MaterialCardView materialCardView, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextCustumFont textCustumFont, ImageView imageView2) {
        this.rootView = relativeLayout;
        this.btnBilling = imageButton;
        this.btnEdit = buttonCustumFont;
        this.btnHome = imageButton2;
        this.btnHome1 = buttonCustumFont2;
        this.btnOnBack = imageButton3;
        this.btnPlayPause = imageView;
        this.btnPremium = layoutBtnUnlockBinding;
        this.btnShare = layoutBtnShareBinding;
        this.btnSharePost = imageButton4;
        this.btnTuffah = materialCardView;
        this.frame = linearLayout;
        this.main = relativeLayout2;
        this.parentLayout = relativeLayout3;
        this.txtShare = textCustumFont;
        this.videoView = imageView2;
    }

    public static ActivityVideoViewBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_billing;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (ImageButton)view2;
        if (view3 != null) {
            n = R$id.btn_edit;
            Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            object2 = (ButtonCustumFont)view2;
            if (object2 != null) {
                n = R$id.btn_home;
                View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view4 = (ImageButton)view2;
                if (view4 != null) {
                    n = R$id.btn_home_;
                    Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    object3 = (ButtonCustumFont)view2;
                    if (object3 != null) {
                        n = R$id.btn_on_back;
                        View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view5 = (ImageButton)view2;
                        if (view5 != null) {
                            n = R$id.btn_play_pause;
                            View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view6 = (ImageView)view2;
                            if (view6 != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.btn_premium))) != null) {
                                LayoutBtnUnlockBinding layoutBtnUnlockBinding = LayoutBtnUnlockBinding.bind(view2);
                                n = R$id.btn_share;
                                view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                if (view2 != null) {
                                    LayoutBtnShareBinding layoutBtnShareBinding = LayoutBtnShareBinding.bind(view2);
                                    n = R$id.btn_share_post;
                                    View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view7 = (ImageButton)view2;
                                    if (view7 != null) {
                                        n = R$id.btn_tuffah;
                                        View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view8 = (MaterialCardView)view2;
                                        if (view8 != null) {
                                            n = R$id.frame;
                                            View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view9 = (LinearLayout)view2;
                                            if (view9 != null) {
                                                View view10 = view;
                                                view10 = (RelativeLayout)view;
                                                n = R$id.parentLayout;
                                                View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view11 = (RelativeLayout)view2;
                                                if (view11 != null) {
                                                    n = R$id.txt_share;
                                                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    object4 = (TextCustumFont)view2;
                                                    if (object4 != null) {
                                                        n = R$id.videoView;
                                                        View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view12 = (ImageView)view2;
                                                        if (view12 != null) {
                                                            object = new ActivityVideoViewBinding((RelativeLayout)view10, (ImageButton)view3, (ButtonCustumFont)((Object)object2), (ImageButton)view4, (ButtonCustumFont)((Object)object3), (ImageButton)view5, (ImageView)view6, layoutBtnUnlockBinding, layoutBtnShareBinding, (ImageButton)view7, (MaterialCardView)view8, (LinearLayout)view9, (RelativeLayout)view10, (RelativeLayout)view11, (TextCustumFont)((Object)object4), (ImageView)view12);
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
            }
        }
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityVideoViewBinding inflate(LayoutInflater layoutInflater) {
        return ActivityVideoViewBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityVideoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_video_view;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityVideoViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

