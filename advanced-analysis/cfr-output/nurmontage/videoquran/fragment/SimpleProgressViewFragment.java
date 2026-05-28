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

public class SimpleProgressViewFragment
extends Fragment {
    public static SimpleProgressViewFragment instance;
    private FragmentProgressViewBinding fragmentBinding;

    public static SimpleProgressViewFragment getInstance() {
        SimpleProgressViewFragment simpleProgressViewFragment = instance;
        if (simpleProgressViewFragment == null) {
            instance = simpleProgressViewFragment = new SimpleProgressViewFragment();
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        object = FragmentProgressViewBinding.inflate((LayoutInflater)object, viewGroup, false);
        this.fragmentBinding = object;
        object = ((FragmentProgressViewBinding)object).getRoot();
        object.setBackgroundColor(0);
        int n = R$id.view_1;
        viewGroup = object.findViewById(n);
        int n2 = 8;
        viewGroup.setVisibility(n2);
        n = R$id.view_2;
        object.findViewById(n).setVisibility(n2);
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.fragmentBinding = null;
        instance = null;
    }
}

