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
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityTimeLineBinding implements ViewBinding
{
    public final LinearLayout btnAddQuran;
    public final LinearLayout btnBg;
    public final ImageButton btnCancel;
    public final LinearLayout btnChangeAspect;
    public final ButtonCustumFont btnExport;
    public final LinearLayout btnIpad;
    public final ImageButton btnPlayPause;
    public final ImageButton btnRedo;
    public final LinearLayout btnSetupFps;
    public final ImageButton btnToEnd;
    public final ImageButton btnToStart;
    public final ImageButton btnUndo;
    public final FrameLayout containerProgress;
    public final ImageView ivIpod;
    public final ImageView ivRatio;
    public final LinearLayout layoutMenu;
    public final LayoutResolutionBinding layoutResolution;
    public final RelativeLayout layoutTime;
    public final FrameLayout mContainer;
    public final FrameLayout main;
    private final FrameLayout rootView;
    public final TrackEntityView timeLineView;
    public final ImageButton toPro;
    public final TextCustumFont tvBg;
    public final TextCustumFont tvCurrentTime;
    public final TextCustumFont tvEndTime;
    public final TextCustumFont tvIpad;
    public final TextCustumFont tvQuran;
    public final TextCustumFont tvRatio;
    public final TextCustumFont tvResolution;
    public final TextCustumFont tvTittleFragment;
    public final BlurredImageView view;
    
    private ActivityTimeLineBinding(final FrameLayout rootView, final LinearLayout btnAddQuran, final LinearLayout btnBg, final ImageButton btnCancel, final LinearLayout btnChangeAspect, final ButtonCustumFont btnExport, final LinearLayout btnIpad, final ImageButton btnPlayPause, final ImageButton btnRedo, final LinearLayout btnSetupFps, final ImageButton btnToEnd, final ImageButton btnToStart, final ImageButton btnUndo, final FrameLayout containerProgress, final ImageView ivIpod, final ImageView ivRatio, final LinearLayout layoutMenu, final LayoutResolutionBinding layoutResolution, final RelativeLayout layoutTime, final FrameLayout mContainer, final FrameLayout main, final TrackEntityView timeLineView, final ImageButton toPro, final TextCustumFont tvBg, final TextCustumFont tvCurrentTime, final TextCustumFont tvEndTime, final TextCustumFont tvIpad, final TextCustumFont tvQuran, final TextCustumFont tvRatio, final TextCustumFont tvResolution, final TextCustumFont tvTittleFragment, final BlurredImageView view) {
        this.rootView = rootView;
        this.btnAddQuran = btnAddQuran;
        this.btnBg = btnBg;
        this.btnCancel = btnCancel;
        this.btnChangeAspect = btnChangeAspect;
        this.btnExport = btnExport;
        this.btnIpad = btnIpad;
        this.btnPlayPause = btnPlayPause;
        this.btnRedo = btnRedo;
        this.btnSetupFps = btnSetupFps;
        this.btnToEnd = btnToEnd;
        this.btnToStart = btnToStart;
        this.btnUndo = btnUndo;
        this.containerProgress = containerProgress;
        this.ivIpod = ivIpod;
        this.ivRatio = ivRatio;
        this.layoutMenu = layoutMenu;
        this.layoutResolution = layoutResolution;
        this.layoutTime = layoutTime;
        this.mContainer = mContainer;
        this.main = main;
        this.timeLineView = timeLineView;
        this.toPro = toPro;
        this.tvBg = tvBg;
        this.tvCurrentTime = tvCurrentTime;
        this.tvEndTime = tvEndTime;
        this.tvIpad = tvIpad;
        this.tvQuran = tvQuran;
        this.tvRatio = tvRatio;
        this.tvResolution = tvResolution;
        this.tvTittleFragment = tvTittleFragment;
        this.view = view;
    }
    
    public static ActivityTimeLineBinding bind(final View view) {
        int n = R$id.btn_add_quran;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_bg;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.btn_cancel;
                final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton != null) {
                    n = R$id.btn_change_aspect;
                    final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                    if (linearLayout3 != null) {
                        n = R$id.btn_export;
                        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                        if (buttonCustumFont != null) {
                            n = R$id.btn_ipad;
                            final LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout4 != null) {
                                n = R$id.btn_play_pause;
                                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                if (imageButton2 != null) {
                                    n = R$id.btn_redo;
                                    final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                    if (imageButton3 != null) {
                                        n = R$id.btn_setup_fps;
                                        final LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                        if (linearLayout5 != null) {
                                            n = R$id.btn_to_end;
                                            final ImageButton imageButton4 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                            if (imageButton4 != null) {
                                                n = R$id.btn_to_start;
                                                final ImageButton imageButton5 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                if (imageButton5 != null) {
                                                    n = R$id.btn_undo;
                                                    final ImageButton imageButton6 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                    if (imageButton6 != null) {
                                                        n = R$id.container_progress;
                                                        final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                                                        if (frameLayout != null) {
                                                            n = R$id.iv_ipod;
                                                            final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                                            if (imageView != null) {
                                                                n = R$id.iv_ratio;
                                                                final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                if (imageView2 != null) {
                                                                    n = R$id.layout_menu;
                                                                    final LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                    if (linearLayout6 != null) {
                                                                        n = R$id.layout_resolution;
                                                                        final View childViewById = ViewBindings.findChildViewById(view, n);
                                                                        if (childViewById != null) {
                                                                            final LayoutResolutionBinding bind = LayoutResolutionBinding.bind(childViewById);
                                                                            n = R$id.layout_time;
                                                                            final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                                                            if (relativeLayout != null) {
                                                                                n = R$id.m_container;
                                                                                final FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById(view, n);
                                                                                if (frameLayout2 != null) {
                                                                                    final FrameLayout frameLayout3 = (FrameLayout)view;
                                                                                    n = R$id.time_line_view;
                                                                                    final TrackEntityView trackEntityView = (TrackEntityView)ViewBindings.findChildViewById(view, n);
                                                                                    if (trackEntityView != null) {
                                                                                        n = R$id.to_pro;
                                                                                        final ImageButton imageButton7 = (ImageButton)ViewBindings.findChildViewById(view, n);
                                                                                        if (imageButton7 != null) {
                                                                                            n = R$id.tv_bg;
                                                                                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                            if (textCustumFont != null) {
                                                                                                n = R$id.tv_current_time;
                                                                                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont2 != null) {
                                                                                                    n = R$id.tv_end_time;
                                                                                                    final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                    if (textCustumFont3 != null) {
                                                                                                        n = R$id.tv_ipad;
                                                                                                        final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                        if (textCustumFont4 != null) {
                                                                                                            n = R$id.tv_quran;
                                                                                                            final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                            if (textCustumFont5 != null) {
                                                                                                                n = R$id.tv_ratio;
                                                                                                                final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                if (textCustumFont6 != null) {
                                                                                                                    n = R$id.tv_resolution;
                                                                                                                    final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                    if (textCustumFont7 != null) {
                                                                                                                        n = R$id.tv_tittle_fragment;
                                                                                                                        final TextCustumFont textCustumFont8 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                        if (textCustumFont8 != null) {
                                                                                                                            n = R$id.view;
                                                                                                                            final BlurredImageView blurredImageView = (BlurredImageView)ViewBindings.findChildViewById(view, n);
                                                                                                                            if (blurredImageView != null) {
                                                                                                                                return new ActivityTimeLineBinding(frameLayout3, linearLayout, linearLayout2, imageButton, linearLayout3, buttonCustumFont, linearLayout4, imageButton2, imageButton3, linearLayout5, imageButton4, imageButton5, imageButton6, frameLayout, imageView, imageView2, linearLayout6, bind, relativeLayout, frameLayout2, frameLayout3, trackEntityView, imageButton7, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, textCustumFont8, blurredImageView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityTimeLineBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityTimeLineBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_time_line, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
