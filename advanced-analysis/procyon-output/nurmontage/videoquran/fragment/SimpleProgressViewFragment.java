// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.databinding.FragmentProgressViewBinding;
import androidx.fragment.app.Fragment;

public class SimpleProgressViewFragment extends Fragment
{
    public static SimpleProgressViewFragment instance;
    private FragmentProgressViewBinding fragmentBinding;
    
    public static SimpleProgressViewFragment getInstance() {
        if (SimpleProgressViewFragment.instance == null) {
            SimpleProgressViewFragment.instance = new SimpleProgressViewFragment();
        }
        return SimpleProgressViewFragment.instance;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentProgressViewBinding inflate = FragmentProgressViewBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final FrameLayout root = inflate.getRoot();
        ((View)root).setBackgroundColor(0);
        final View viewById = ((View)root).findViewById(R$id.view_1);
        final int n = 8;
        viewById.setVisibility(n);
        ((View)root).findViewById(R$id.view_2).setVisibility(n);
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.fragmentBinding = null;
        SimpleProgressViewFragment.instance = null;
    }
}
