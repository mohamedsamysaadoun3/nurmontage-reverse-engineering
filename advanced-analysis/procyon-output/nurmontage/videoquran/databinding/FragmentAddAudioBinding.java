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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class FragmentAddAudioBinding implements ViewBinding
{
    public final ImageButton btnClose;
    public final LinearLayout btnExtract;
    public final RelativeLayout btnUpload;
    public final ImageView img;
    public final ImageView ivDataDisable;
    private final LinearLayout rootView;
    public final TextCustumFont tvAudio;
    public final TextCustumFont tvExtract;
    
    private FragmentAddAudioBinding(final LinearLayout rootView, final ImageButton btnClose, final LinearLayout btnExtract, final RelativeLayout btnUpload, final ImageView img, final ImageView ivDataDisable, final TextCustumFont tvAudio, final TextCustumFont tvExtract) {
        this.rootView = rootView;
        this.btnClose = btnClose;
        this.btnExtract = btnExtract;
        this.btnUpload = btnUpload;
        this.img = img;
        this.ivDataDisable = ivDataDisable;
        this.tvAudio = tvAudio;
        this.tvExtract = tvExtract;
    }
    
    public static FragmentAddAudioBinding bind(final View view) {
        int n = R$id.btn_close;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_extract;
            final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout != null) {
                n = R$id.btn_upload;
                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout != null) {
                    n = R$id.img;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        n = R$id.iv_data_disable;
                        final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView2 != null) {
                            n = R$id.tv_audio;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.tv_extract;
                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont2 != null) {
                                    return new FragmentAddAudioBinding((LinearLayout)view, imageButton, linearLayout, relativeLayout, imageView, imageView2, textCustumFont, textCustumFont2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentAddAudioBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentAddAudioBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_add_audio, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
