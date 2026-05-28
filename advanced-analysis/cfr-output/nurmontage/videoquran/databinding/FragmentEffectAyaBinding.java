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
 *  android.widget.SeekBar
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.tabs.TabLayout
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentEffectAyaBinding
implements ViewBinding {
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

    private FragmentEffectAyaBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, RecyclerView recyclerView, SeekBar seekBar, TextCustumFont textCustumFont, TabLayout tabLayout, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnClose = imageButton;
        this.btnUnEffect = imageButton2;
        this.ivApplyAll = imageView;
        this.rv = recyclerView;
        this.seekbar = seekBar;
        this.statusDuration = textCustumFont;
        this.tabLayout = tabLayout;
        this.tvApplyAll = textCustumFont2;
    }

    public static FragmentEffectAyaBinding bind(View object) {
        View view;
        int n = R$id.btn_appl_all;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_close;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.btn_unEffect;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.iv_apply_all;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n = R$id.rv;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (RecyclerView)view;
                        if (view6 != null) {
                            n = R$id.seekbar;
                            View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view7 = (SeekBar)view;
                            if (view7 != null) {
                                n = R$id.status_duration;
                                Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object2 = (TextCustumFont)view;
                                if (object2 != null) {
                                    n = R$id.tab_layout;
                                    View view8 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view8 = (TabLayout)view;
                                    if (view8 != null) {
                                        n = R$id.tv_apply_all;
                                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object3 = (TextCustumFont)view;
                                        if (object3 != null) {
                                            Object object4 = object;
                                            object4 = (LinearLayout)object;
                                            FragmentEffectAyaBinding fragmentEffectAyaBinding = new FragmentEffectAyaBinding((LinearLayout)object4, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (ImageView)view5, (RecyclerView)view6, (SeekBar)view7, (TextCustumFont)((Object)object2), (TabLayout)view8, (TextCustumFont)((Object)object3));
                                            return fragmentEffectAyaBinding;
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

    public static FragmentEffectAyaBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEffectAyaBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEffectAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_effect_aya;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEffectAyaBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

