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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityVideoViewBinding implements ViewBinding
{
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
    
    private ActivityVideoViewBinding(final RelativeLayout rootView, final ImageButton btnBilling, final ButtonCustumFont btnEdit, final ImageButton btnHome, final ButtonCustumFont btnHome2, final ImageButton btnOnBack, final ImageView btnPlayPause, final LayoutBtnUnlockBinding btnPremium, final LayoutBtnShareBinding btnShare, final ImageButton btnSharePost, final MaterialCardView btnTuffah, final LinearLayout frame, final RelativeLayout main, final RelativeLayout parentLayout, final TextCustumFont txtShare, final ImageView videoView) {
        this.rootView = rootView;
        this.btnBilling = btnBilling;
        this.btnEdit = btnEdit;
        this.btnHome = btnHome;
        this.btnHome1 = btnHome2;
        this.btnOnBack = btnOnBack;
        this.btnPlayPause = btnPlayPause;
        this.btnPremium = btnPremium;
        this.btnShare = btnShare;
        this.btnSharePost = btnSharePost;
        this.btnTuffah = btnTuffah;
        this.frame = frame;
        this.main = main;
        this.parentLayout = parentLayout;
        this.txtShare = txtShare;
        this.videoView = videoView;
    }
    
    public static ActivityVideoViewBinding bind(final View view) {
        int n = R$id.btn_billing;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_edit;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.btn_home;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.btn_home_;
                    final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                    if (buttonCustumFont2 != null) {
                        n = R$id.btn_on_back;
                        final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                        if (imageButton3 != null) {
                            n = R$id.btn_play_pause;
                            final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                            if (imageView != null) {
                                n = R$id.btn_premium;
                                final View childViewById = ViewBindings.findChildViewById(view, n);
                                if (childViewById != null) {
                                    final LayoutBtnUnlockBinding bind = LayoutBtnUnlockBinding.bind(childViewById);
                                    n = R$id.btn_share;
                                    final View childViewById2 = ViewBindings.findChildViewById(view, n);
                                    if (childViewById2 != null) {
                                        final LayoutBtnShareBinding bind2 = LayoutBtnShareBinding.bind(childViewById2);
                                        n = R$id.btn_share_post;
                                        final ImageButton imageButton4 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                        if (imageButton4 != null) {
                                            n = R$id.btn_tuffah;
                                            final MaterialCardView materialCardView = (MaterialCardView)ViewBindings.findChildViewById(view, n);
                                            if (materialCardView != null) {
                                                n = R$id.frame;
                                                final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                if (linearLayout != null) {
                                                    final RelativeLayout relativeLayout = (RelativeLayout)view;
                                                    n = R$id.parentLayout;
                                                    final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                                    if (relativeLayout2 != null) {
                                                        n = R$id.txt_share;
                                                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                        if (textCustumFont != null) {
                                                            n = R$id.videoView;
                                                            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                            if (imageView2 != null) {
                                                                return new ActivityVideoViewBinding(relativeLayout, imageButton, buttonCustumFont, imageButton2, buttonCustumFont2, imageButton3, imageView, bind, bind2, imageButton4, materialCardView, linearLayout, relativeLayout, relativeLayout2, textCustumFont, imageView2);
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
    
    public static ActivityVideoViewBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityVideoViewBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_video_view, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
