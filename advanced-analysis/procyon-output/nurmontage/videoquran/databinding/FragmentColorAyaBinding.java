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
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class FragmentColorAyaBinding implements ViewBinding
{
    public final ImageButton btnDone;
    public final TextCustumFont btnGlow;
    public final TextCustumFont btnNone;
    public final TextCustumFont btnOutline;
    public final TextCustumFont btnShadow;
    public final LinearLayout presetContainer;
    private final LinearLayout rootView;
    public final RecyclerView rvColor;
    public final TabLayout tabLayout;
    
    private FragmentColorAyaBinding(final LinearLayout rootView, final ImageButton btnDone, final TextCustumFont btnGlow, final TextCustumFont btnNone, final TextCustumFont btnOutline, final TextCustumFont btnShadow, final LinearLayout presetContainer, final RecyclerView rvColor, final TabLayout tabLayout) {
        this.rootView = rootView;
        this.btnDone = btnDone;
        this.btnGlow = btnGlow;
        this.btnNone = btnNone;
        this.btnOutline = btnOutline;
        this.btnShadow = btnShadow;
        this.presetContainer = presetContainer;
        this.rvColor = rvColor;
        this.tabLayout = tabLayout;
    }
    
    public static FragmentColorAyaBinding bind(final View view) {
        int n = R$id.btn_done;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btnGlow;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                n = R$id.btnNone;
                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont2 != null) {
                    n = R$id.btnOutline;
                    final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont3 != null) {
                        n = R$id.btnShadow;
                        final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont4 != null) {
                            n = R$id.presetContainer;
                            final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout != null) {
                                n = R$id.rv_color;
                                final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                if (recyclerView != null) {
                                    n = R$id.tab_layout;
                                    final TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById(view, n);
                                    if (tabLayout != null) {
                                        return new FragmentColorAyaBinding((LinearLayout)view, imageButton, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, linearLayout, recyclerView, tabLayout);
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
    
    public static FragmentColorAyaBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentColorAyaBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_color_aya, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
