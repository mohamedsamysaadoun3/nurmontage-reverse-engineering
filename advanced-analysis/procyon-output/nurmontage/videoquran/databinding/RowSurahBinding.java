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
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

public final class RowSurahBinding implements ViewBinding
{
    public final TextView name;
    private final FrameLayout rootView;
    
    private RowSurahBinding(final FrameLayout rootView, final TextView name) {
        this.rootView = rootView;
        this.name = name;
    }
    
    public static RowSurahBinding bind(final View view) {
        final int name = R$id.name;
        final TextView textView = (TextView)ViewBindings.findChildViewById(view, name);
        if (textView != null) {
            return new RowSurahBinding((FrameLayout)view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(name)));
    }
    
    public static RowSurahBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowSurahBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_surah, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
