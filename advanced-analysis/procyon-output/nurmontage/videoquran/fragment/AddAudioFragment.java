// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.databinding.FragmentAddAudioBinding;
import androidx.fragment.app.Fragment;

public class AddAudioFragment extends Fragment
{
    public static AddAudioFragment instance;
    private FragmentAddAudioBinding addAudioBinding;
    private AddAudioFragment$IAudioCallback iAudioCallback;
    private Resources resources;
    
    public AddAudioFragment(final AddAudioFragment$IAudioCallback iAudioCallback, final Resources resources) {
        this.iAudioCallback = iAudioCallback;
        this.resources = resources;
    }
    
    public static AddAudioFragment getInstance(final AddAudioFragment$IAudioCallback addAudioFragment$IAudioCallback, final Resources resources) {
        if (AddAudioFragment.instance == null) {
            AddAudioFragment.instance = new AddAudioFragment(addAudioFragment$IAudioCallback, resources);
        }
        return AddAudioFragment.instance;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentAddAudioBinding inflate = FragmentAddAudioBinding.inflate(layoutInflater, viewGroup, false);
        this.addAudioBinding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.resources != null) {
            if (this.iAudioCallback != null) {
                ((TextCustumFont)((View)root).findViewById(R$id.tv_extract)).setText((CharSequence)this.resources.getString(R$string.extract_audio));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_audio)).setText((CharSequence)this.resources.getString(R$string.audio));
                ((View)root).findViewById(R$id.btn_upload).setOnClickListener((View$OnClickListener)new AddAudioFragment$1(this));
                ((View)root).findViewById(R$id.btn_extract).setOnClickListener((View$OnClickListener)new AddAudioFragment$2(this));
                ((View)root).findViewById(R$id.btn_close).setOnClickListener((View$OnClickListener)new AddAudioFragment$3(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.addAudioBinding = null;
        AddAudioFragment.instance = null;
        this.iAudioCallback = null;
        super.onDestroyView();
    }
}
