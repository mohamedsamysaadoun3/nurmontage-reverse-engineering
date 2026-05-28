/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.databinding.FragmentAddAudioBinding;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$1;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$2;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$3;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$IAudioCallback;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class AddAudioFragment
extends Fragment {
    public static AddAudioFragment instance;
    private FragmentAddAudioBinding addAudioBinding;
    private AddAudioFragment$IAudioCallback iAudioCallback;
    private Resources resources;

    static /* bridge */ /* synthetic */ AddAudioFragment$IAudioCallback cfr_renamed_197(AddAudioFragment addAudioFragment) {
        return addAudioFragment.iAudioCallback;
    }

    public AddAudioFragment(AddAudioFragment$IAudioCallback addAudioFragment$IAudioCallback, Resources resources) {
        this.iAudioCallback = addAudioFragment$IAudioCallback;
        this.resources = resources;
    }

    public static AddAudioFragment getInstance(AddAudioFragment$IAudioCallback addAudioFragment$IAudioCallback, Resources resources) {
        AddAudioFragment addAudioFragment = instance;
        if (addAudioFragment == null) {
            instance = addAudioFragment = new AddAudioFragment(addAudioFragment$IAudioCallback, resources);
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentAddAudioBinding.inflate((LayoutInflater)object, object2, false);
        this.addAudioBinding = object;
        object = ((FragmentAddAudioBinding)object).getRoot();
        object2 = this.resources;
        if (object2 != null && (object2 = this.iAudioCallback) != null) {
            int n = R$id.tv_extract;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            int n2 = R$string.extract_audio;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_audio;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.audio;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.btn_upload;
            object2 = object.findViewById(n);
            object3 = new AddAudioFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_extract;
            object2 = object.findViewById(n);
            object3 = new AddAudioFragment$2(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_close;
            object2 = object.findViewById(n);
            object3 = new AddAudioFragment$3(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        this.addAudioBinding = null;
        instance = null;
        this.iAudioCallback = null;
        super.onDestroyView();
    }
}

