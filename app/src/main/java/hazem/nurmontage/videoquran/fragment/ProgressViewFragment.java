package hazem.nurmontage.videoquran.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.databinding.FragmentProgressViewBinding;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public class ProgressViewFragment extends Fragment {
    public static ProgressViewFragment instance;
    private FragmentProgressViewBinding binding;
    private TextCustumFont tv_progress;

    public static ProgressViewFragment getInstance() {
        if (instance == null) {
            instance = new ProgressViewFragment();
        }
        return instance;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentProgressViewBinding inflate = FragmentProgressViewBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        FrameLayout root = inflate.getRoot();
        this.tv_progress = (TextCustumFont) root.findViewById(C2014R.id.tv_progress);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        instance = null;
    }

    public void update(int i, int resourceId) {
        TextCustumFont textCustumFont = this.tv_progress;
        if (textCustumFont != null) {
            textCustumFont.setText(i + "/" + resourceId);
        }
    }
}
