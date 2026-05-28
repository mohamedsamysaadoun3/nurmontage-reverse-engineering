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
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
import android.widget.Button;
import androidx.viewbinding.ViewBinding;

public final class LayoutContactUsBinding implements ViewBinding
{
    public final Button btnContact;
    public final Button btnHelp;
    public final MaterialCardView btnSupportFinacial;
    public final MaterialCardView layoutHelp;
    private final LinearLayout rootView;
    
    private LayoutContactUsBinding(final LinearLayout rootView, final Button btnContact, final Button btnHelp, final MaterialCardView btnSupportFinacial, final MaterialCardView layoutHelp) {
        this.rootView = rootView;
        this.btnContact = btnContact;
        this.btnHelp = btnHelp;
        this.btnSupportFinacial = btnSupportFinacial;
        this.layoutHelp = layoutHelp;
    }
    
    public static LayoutContactUsBinding bind(final View view) {
        int n = R$id.btn_contact;
        final Button button = (Button)ViewBindings.findChildViewById(view, n);
        if (button != null) {
            n = R$id.btn_help;
            final Button button2 = (Button)ViewBindings.findChildViewById(view, n);
            if (button2 != null) {
                n = R$id.btn_support_finacial;
                final MaterialCardView materialCardView = (MaterialCardView)ViewBindings.findChildViewById(view, n);
                if (materialCardView != null) {
                    n = R$id.layout_help;
                    final MaterialCardView materialCardView2 = (MaterialCardView)ViewBindings.findChildViewById(view, n);
                    if (materialCardView2 != null) {
                        return new LayoutContactUsBinding((LinearLayout)view, button, button2, materialCardView, materialCardView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutContactUsBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutContactUsBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_contact_us, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
