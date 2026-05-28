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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.viewbinding.ViewBinding;

public final class ActivityYoutuberBinding implements ViewBinding
{
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
    
    private ActivityYoutuberBinding(final RelativeLayout rootView, final TextCustumFont btnGasadi, final TextCustumFont btnHecham, final TextCustumFont btnHilal, final ImageButton btnOnBack, final TextCustumFont btnPakistain, final LinearLayout btnSendLnk, final ImageView btnToAbout, final RelativeLayout main, final RecyclerView rv, final TextCustumFont tvHintSendLnk, final TextCustumFont tvTutorial) {
        this.rootView = rootView;
        this.btnGasadi = btnGasadi;
        this.btnHecham = btnHecham;
        this.btnHilal = btnHilal;
        this.btnOnBack = btnOnBack;
        this.btnPakistain = btnPakistain;
        this.btnSendLnk = btnSendLnk;
        this.btnToAbout = btnToAbout;
        this.main = main;
        this.rv = rv;
        this.tvHintSendLnk = tvHintSendLnk;
        this.tvTutorial = tvTutorial;
    }
    
    public static ActivityYoutuberBinding bind(final View view) {
        int n = R$id.btn_gasadi;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.btn_hecham;
            final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont2 != null) {
                n = R$id.btn_hilal;
                final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont3 != null) {
                    n = R$id.btn_on_back;
                    final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton != null) {
                        n = R$id.btn_pakistain;
                        final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont4 != null) {
                            n = R$id.btn_send_lnk;
                            final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout != null) {
                                n = R$id.btn_to_about;
                                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                if (imageView != null) {
                                    final RelativeLayout relativeLayout = (RelativeLayout)view;
                                    n = R$id.rv;
                                    final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                    if (recyclerView != null) {
                                        n = R$id.tv_hint_send_lnk;
                                        final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont5 != null) {
                                            n = R$id.tv_tutorial;
                                            final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFont6 != null) {
                                                return new ActivityYoutuberBinding(relativeLayout, textCustumFont, textCustumFont2, textCustumFont3, imageButton, textCustumFont4, linearLayout, imageView, relativeLayout, recyclerView, textCustumFont5, textCustumFont6);
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
    
    public static ActivityYoutuberBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityYoutuberBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_youtuber, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
