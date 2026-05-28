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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.databinding.FragmentProgressViewBinding;
import androidx.fragment.app.Fragment;

public class ProgressViewFragment extends Fragment
{
    public static ProgressViewFragment instance;
    private FragmentProgressViewBinding binding;
    private TextCustumFont tv_progress;
    
    public static ProgressViewFragment getInstance() {
        if (ProgressViewFragment.instance == null) {
            ProgressViewFragment.instance = new ProgressViewFragment();
        }
        return ProgressViewFragment.instance;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentProgressViewBinding inflate = FragmentProgressViewBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final FrameLayout root = inflate.getRoot();
        this.tv_progress = (TextCustumFont)((View)root).findViewById(R$id.tv_progress);
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        ProgressViewFragment.instance = null;
    }
    
    public void update(final int i, final int j) {
        final TextCustumFont tv_progress = this.tv_progress;
        if (tv_progress != null) {
            tv_progress.setText((CharSequence)(i + "/" + j));
        }
    }
}
