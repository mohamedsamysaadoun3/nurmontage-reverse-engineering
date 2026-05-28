/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.databinding.FragmentProgressViewBinding;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class ProgressViewFragment
extends Fragment {
    public static ProgressViewFragment instance;
    private FragmentProgressViewBinding binding;
    private TextCustumFont tv_progress;

    public static ProgressViewFragment getInstance() {
        ProgressViewFragment progressViewFragment = instance;
        if (progressViewFragment == null) {
            instance = progressViewFragment = new ProgressViewFragment();
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        object = FragmentProgressViewBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentProgressViewBinding)object).getRoot();
        int n = R$id.tv_progress;
        object2 = (TextCustumFont)object.findViewById(n);
        this.tv_progress = object2;
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        instance = null;
    }

    public void update(int n, int n2) {
        TextCustumFont textCustumFont = this.tv_progress;
        if (textCustumFont != null) {
            CharSequence charSequence = new StringBuilder();
            CharSequence charSequence2 = charSequence.append(n);
            charSequence = "/";
            charSequence2 = charSequence2.append((String)charSequence).append(n2).toString();
            textCustumFont.setText(charSequence2);
        }
    }
}

