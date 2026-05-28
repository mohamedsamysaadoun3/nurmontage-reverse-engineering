/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
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
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentColorAyaBinding
implements ViewBinding {
    public final ImageButton btnDone;
    public final TextCustumFont btnGlow;
    public final TextCustumFont btnNone;
    public final TextCustumFont btnOutline;
    public final TextCustumFont btnShadow;
    public final LinearLayout presetContainer;
    private final LinearLayout rootView;
    public final RecyclerView rvColor;
    public final TabLayout tabLayout;

    private FragmentColorAyaBinding(LinearLayout linearLayout, ImageButton imageButton, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, LinearLayout linearLayout2, RecyclerView recyclerView, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.btnDone = imageButton;
        this.btnGlow = textCustumFont;
        this.btnNone = textCustumFont2;
        this.btnOutline = textCustumFont3;
        this.btnShadow = textCustumFont4;
        this.presetContainer = linearLayout2;
        this.rvColor = recyclerView;
        this.tabLayout = tabLayout;
    }

    public static FragmentColorAyaBinding bind(View object) {
        View view;
        int n = R$id.btn_done;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btnGlow;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (TextCustumFont)view;
            if (object2 != null) {
                n = R$id.btnNone;
                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object3 = (TextCustumFont)view;
                if (object3 != null) {
                    n = R$id.btnOutline;
                    Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object4 = (TextCustumFont)view;
                    if (object4 != null) {
                        n = R$id.btnShadow;
                        Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object5 = (TextCustumFont)view;
                        if (object5 != null) {
                            n = R$id.presetContainer;
                            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n = R$id.rv_color;
                                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view4 = (RecyclerView)view;
                                if (view4 != null) {
                                    n = R$id.tab_layout;
                                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view5 = (TabLayout)view;
                                    if (view5 != null) {
                                        Object object6 = object;
                                        object6 = (LinearLayout)object;
                                        FragmentColorAyaBinding fragmentColorAyaBinding = new FragmentColorAyaBinding((LinearLayout)object6, (ImageButton)view2, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (LinearLayout)view3, (RecyclerView)view4, (TabLayout)view5);
                                        return fragmentColorAyaBinding;
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

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater) {
        return FragmentColorAyaBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_color_aya;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentColorAyaBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

