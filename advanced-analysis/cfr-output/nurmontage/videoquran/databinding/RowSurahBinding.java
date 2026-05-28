/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class RowSurahBinding
implements ViewBinding {
    public final TextView name;
    private final FrameLayout rootView;

    private RowSurahBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.name = textView;
    }

    public static RowSurahBinding bind(View object) {
        int n = R$id.name;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)object, (int)n);
        if (textView != null) {
            object = (FrameLayout)object;
            RowSurahBinding rowSurahBinding = new RowSurahBinding((FrameLayout)object, textView);
            return rowSurahBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSurahBinding inflate(LayoutInflater layoutInflater) {
        return RowSurahBinding.inflate(layoutInflater, null, false);
    }

    public static RowSurahBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_surah;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSurahBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

