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
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

/* loaded from: classes2.dex */
public final class ActivityWorkUserBinding implements ViewBinding {
    public final ImageButton btnMenu;
    public final ButtonCustumFont btnToStudio;
    public final RelativeLayout card;

    /* renamed from: iv */
    public final ImageView f398iv;
    public final RelativeLayout main;
    private final RelativeLayout rootView;

    /* renamed from: rv */
    public final RecyclerView f399rv;
    public final TextCustumFont tvAya;
    public final TextCustumFontBold tvSecret;

    private ActivityWorkUserBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, RelativeLayout relativeLayout2, ImageView imageView, RelativeLayout relativeLayout3, RecyclerView recyclerView, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold) {
        this.rootView = relativeLayout;
        this.btnMenu = imageButton;
        this.btnToStudio = buttonCustumFont;
        this.card = relativeLayout2;
        this.f398iv = imageView;
        this.main = relativeLayout3;
        this.f399rv = recyclerView;
        this.tvAya = textCustumFont;
        this.tvSecret = textCustumFontBold;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2014R.layout.activity_work_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWorkUserBinding bind(View view) {
        int i = C2014R.id.btn_menu;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = C2014R.id.btn_to_studio;
            ButtonCustumFont buttonCustumFont = (ButtonCustumFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustumFont != null) {
                i = C2014R.id.card;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = C2014R.id.f357iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                        i = C2014R.id.f358rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C2014R.id.tv_aya;
                            TextCustumFont textCustumFont = (TextCustumFont) ViewBindings.findChildViewById(view, i);
                            if (textCustumFont != null) {
                                i = C2014R.id.tv_secret;
                                TextCustumFontBold textCustumFontBold = (TextCustumFontBold) ViewBindings.findChildViewById(view, i);
                                if (textCustumFontBold != null) {
                                    return new ActivityWorkUserBinding(relativeLayout2, imageButton, buttonCustumFont, relativeLayout, imageView, relativeLayout2, recyclerView, textCustumFont, textCustumFontBold);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
