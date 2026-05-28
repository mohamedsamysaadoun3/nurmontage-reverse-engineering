/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.card.MaterialCardView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.WaveformView;

public final class ActivityAdsTuufahBinding
implements ViewBinding {
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

    private ActivityAdsTuufahBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout3, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFontBold textCustumFontBold, WaveformView waveformView, WaveformView waveformView2) {
        this.rootView = relativeLayout;
        this.btnBefore = relativeLayout2;
        this.btnOnBack = imageButton;
        this.btnPlayPause = imageButton2;
        this.btnPlayPauseAfter = imageButton3;
        this.btnTuffah = materialCardView;
        this.ivAr = imageView;
        this.ivEn = imageView2;
        this.main = relativeLayout3;
        this.tvAfter = textCustumFont;
        this.tvBefore = textCustumFont2;
        this.tvDownload = textCustumFont3;
        this.tvTittle = textCustumFontBold;
        this.waveformView = waveformView;
        this.waveformViewAfter = waveformView2;
    }

    public static ActivityAdsTuufahBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_before;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (RelativeLayout)view2;
        if (view3 != null) {
            n = R$id.btn_on_back;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (ImageButton)view2;
            if (view4 != null) {
                n = R$id.btnPlayPause;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (ImageButton)view2;
                if (view5 != null) {
                    n = R$id.btnPlayPause_after;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (ImageButton)view2;
                    if (view6 != null) {
                        n = R$id.btn_tuffah;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (MaterialCardView)view2;
                        if (view7 != null) {
                            n = R$id.iv_ar;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (ImageView)view2;
                            if (view8 != null) {
                                n = R$id.iv_en;
                                View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view9 = (ImageView)view2;
                                if (view9 != null) {
                                    View view10 = view;
                                    view10 = (RelativeLayout)view;
                                    n = R$id.tv_after;
                                    Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object2 = (TextCustumFont)view2;
                                    if (object2 != null) {
                                        n = R$id.tv_before;
                                        Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        object3 = (TextCustumFont)view2;
                                        if (object3 != null) {
                                            n = R$id.tv_download;
                                            Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            object4 = (TextCustumFont)view2;
                                            if (object4 != null) {
                                                n = R$id.tv_tittle;
                                                Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object5 = (TextCustumFontBold)view2;
                                                if (object5 != null) {
                                                    n = R$id.waveformView;
                                                    View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view11 = (WaveformView)view2;
                                                    if (view11 != null) {
                                                        n = R$id.waveformView_after;
                                                        View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view12 = (WaveformView)view2;
                                                        if (view12 != null) {
                                                            object = new ActivityAdsTuufahBinding((RelativeLayout)view10, (RelativeLayout)view3, (ImageButton)view4, (ImageButton)view5, (ImageButton)view6, (MaterialCardView)view7, (ImageView)view8, (ImageView)view9, (RelativeLayout)view10, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFontBold)((Object)object5), (WaveformView)view11, (WaveformView)view12);
                                                            return object;
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityAdsTuufahBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAdsTuufahBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAdsTuufahBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_ads_tuufah;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAdsTuufahBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

