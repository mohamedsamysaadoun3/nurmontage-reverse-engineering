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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityWorkUserBinding implements ViewBinding
{
    public final ImageButton btnMenu;
    public final ButtonCustumFont btnToStudio;
    public final RelativeLayout card;
    public final ImageView iv;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvAya;
    public final TextCustumFontBold tvSecret;
    
    private ActivityWorkUserBinding(final RelativeLayout rootView, final ImageButton btnMenu, final ButtonCustumFont btnToStudio, final RelativeLayout card, final ImageView iv, final RelativeLayout main, final RecyclerView rv, final TextCustumFont tvAya, final TextCustumFontBold tvSecret) {
        this.rootView = rootView;
        this.btnMenu = btnMenu;
        this.btnToStudio = btnToStudio;
        this.card = card;
        this.iv = iv;
        this.main = main;
        this.rv = rv;
        this.tvAya = tvAya;
        this.tvSecret = tvSecret;
    }
    
    public static ActivityWorkUserBinding bind(final View view) {
        int n = R$id.btn_menu;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_to_studio;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.card;
                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout != null) {
                    n = R$id.iv;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        final RelativeLayout relativeLayout2 = (RelativeLayout)view;
                        n = R$id.rv;
                        final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                        if (recyclerView != null) {
                            n = R$id.tv_aya;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.tv_secret;
                                final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                if (textCustumFontBold != null) {
                                    return new ActivityWorkUserBinding(relativeLayout2, imageButton, buttonCustumFont, relativeLayout, imageView, relativeLayout2, recyclerView, textCustumFont, textCustumFontBold);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityWorkUserBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityWorkUserBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_work_user, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
