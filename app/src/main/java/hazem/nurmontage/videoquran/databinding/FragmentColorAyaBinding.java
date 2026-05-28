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
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public final class FragmentColorAyaBinding implements ViewBinding {
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

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean isFlag) {
        View inflate = layoutInflater.inflate(C2014R.layout.fragment_color_aya, viewGroup, false);
        if (isFlag) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentColorAyaBinding bind(View view) {
        int i = C2014R.id.btn_done;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = C2014R.id.btnGlow;
            TextCustumFont textCustumFont = (TextCustumFont) ViewBindings.findChildViewById(view, i);
            if (textCustumFont != null) {
                i = C2014R.id.btnNone;
                TextCustumFont textCustumFont2 = (TextCustumFont) ViewBindings.findChildViewById(view, i);
                if (textCustumFont2 != null) {
                    i = C2014R.id.btnOutline;
                    TextCustumFont textCustumFont3 = (TextCustumFont) ViewBindings.findChildViewById(view, i);
                    if (textCustumFont3 != null) {
                        i = C2014R.id.btnShadow;
                        TextCustumFont textCustumFont4 = (TextCustumFont) ViewBindings.findChildViewById(view, i);
                        if (textCustumFont4 != null) {
                            i = C2014R.id.presetContainer;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C2014R.id.rv_color;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C2014R.id.tab_layout;
                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                                    if (tabLayout != null) {
                                        return new FragmentColorAyaBinding((LinearLayout) view, imageButton, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, linearLayout, recyclerView, tabLayout);
                                    }
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
