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
import hazem.nurmontage.videoquran.views.WaveformView;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityAdsTuufahBinding implements ViewBinding
{
    public final RelativeLayout btnBefore;
    public final ImageButton btnOnBack;
    public final ImageButton btnPlayPause;
    public final ImageButton btnPlayPauseAfter;
    public final MaterialCardView btnTuffah;
    public final ImageView ivAr;
    public final ImageView ivEn;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvAfter;
    public final TextCustumFont tvBefore;
    public final TextCustumFont tvDownload;
    public final TextCustumFontBold tvTittle;
    public final WaveformView waveformView;
    public final WaveformView waveformViewAfter;
    
    private ActivityAdsTuufahBinding(final RelativeLayout rootView, final RelativeLayout btnBefore, final ImageButton btnOnBack, final ImageButton btnPlayPause, final ImageButton btnPlayPauseAfter, final MaterialCardView btnTuffah, final ImageView ivAr, final ImageView ivEn, final RelativeLayout main, final TextCustumFont tvAfter, final TextCustumFont tvBefore, final TextCustumFont tvDownload, final TextCustumFontBold tvTittle, final WaveformView waveformView, final WaveformView waveformViewAfter) {
        this.rootView = rootView;
        this.btnBefore = btnBefore;
        this.btnOnBack = btnOnBack;
        this.btnPlayPause = btnPlayPause;
        this.btnPlayPauseAfter = btnPlayPauseAfter;
        this.btnTuffah = btnTuffah;
        this.ivAr = ivAr;
        this.ivEn = ivEn;
        this.main = main;
        this.tvAfter = tvAfter;
        this.tvBefore = tvBefore;
        this.tvDownload = tvDownload;
        this.tvTittle = tvTittle;
        this.waveformView = waveformView;
        this.waveformViewAfter = waveformViewAfter;
    }
    
    public static ActivityAdsTuufahBinding bind(final View view) {
        int n = R$id.btn_before;
        final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
        if (relativeLayout != null) {
            n = R$id.btn_on_back;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btnPlayPause;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.btnPlayPause_after;
                    final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton3 != null) {
                        n = R$id.btn_tuffah;
                        final MaterialCardView materialCardView = (MaterialCardView)ViewBindings.findChildViewById(view, n);
                        if (materialCardView != null) {
                            n = R$id.iv_ar;
                            final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                            if (imageView != null) {
                                n = R$id.iv_en;
                                final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                if (imageView2 != null) {
                                    final RelativeLayout relativeLayout2 = (RelativeLayout)view;
                                    n = R$id.tv_after;
                                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (textCustumFont != null) {
                                        n = R$id.tv_before;
                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont2 != null) {
                                            n = R$id.tv_download;
                                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFont3 != null) {
                                                n = R$id.tv_tittle;
                                                final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                                if (textCustumFontBold != null) {
                                                    n = R$id.waveformView;
                                                    final WaveformView waveformView = (WaveformView)ViewBindings.findChildViewById(view, n);
                                                    if (waveformView != null) {
                                                        n = R$id.waveformView_after;
                                                        final WaveformView waveformView2 = (WaveformView)ViewBindings.findChildViewById(view, n);
                                                        if (waveformView2 != null) {
                                                            return new ActivityAdsTuufahBinding(relativeLayout2, relativeLayout, imageButton, imageButton2, imageButton3, materialCardView, imageView, imageView2, relativeLayout2, textCustumFont, textCustumFont2, textCustumFont3, textCustumFontBold, waveformView, waveformView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityAdsTuufahBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityAdsTuufahBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_ads_tuufah, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
