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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentEffectAyaBinding implements ViewBinding
{
    public final LinearLayout btnApplAll;
    public final ImageButton btnClose;
    public final ImageButton btnUnEffect;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final SeekBar seekbar;
    public final TextCustumFont statusDuration;
    public final TabLayout tabLayout;
    public final TextCustumFont tvApplyAll;
    
    private FragmentEffectAyaBinding(final LinearLayout rootView, final LinearLayout btnApplAll, final ImageButton btnClose, final ImageButton btnUnEffect, final ImageView ivApplyAll, final RecyclerView rv, final SeekBar seekbar, final TextCustumFont statusDuration, final TabLayout tabLayout, final TextCustumFont tvApplyAll) {
        this.rootView = rootView;
        this.btnApplAll = btnApplAll;
        this.btnClose = btnClose;
        this.btnUnEffect = btnUnEffect;
        this.ivApplyAll = ivApplyAll;
        this.rv = rv;
        this.seekbar = seekbar;
        this.statusDuration = statusDuration;
        this.tabLayout = tabLayout;
        this.tvApplyAll = tvApplyAll;
    }
    
    public static FragmentEffectAyaBinding bind(final View view) {
        int n = R$id.btn_appl_all;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_close;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_unEffect;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.iv_apply_all;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        n = R$id.rv;
                        final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                        if (recyclerView != null) {
                            n = R$id.seekbar;
                            final SeekBar seekBar = (SeekBar)ViewBindings.findChildViewById(view, n);
                            if (seekBar != null) {
                                n = R$id.status_duration;
                                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont != null) {
                                    n = R$id.tab_layout;
                                    final TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById(view, n);
                                    if (tabLayout != null) {
                                        n = R$id.tv_apply_all;
                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont2 != null) {
                                            return new FragmentEffectAyaBinding((LinearLayout)view, linearLayout, imageButton, imageButton2, imageView, recyclerView, seekBar, textCustumFont, tabLayout, textCustumFont2);
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
    
    public static FragmentEffectAyaBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEffectAyaBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_effect_aya, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
