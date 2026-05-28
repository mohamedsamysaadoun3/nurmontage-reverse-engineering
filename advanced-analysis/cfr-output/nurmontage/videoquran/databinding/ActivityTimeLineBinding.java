/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutResolutionBinding;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TrackEntityView;

public final class ActivityTimeLineBinding
implements ViewBinding {
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

    private ActivityTimeLineBinding(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, LinearLayout linearLayout3, ButtonCustumFont buttonCustumFont, LinearLayout linearLayout4, ImageButton imageButton2, ImageButton imageButton3, LinearLayout linearLayout5, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout6, LayoutResolutionBinding layoutResolutionBinding, RelativeLayout relativeLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, TrackEntityView trackEntityView, ImageButton imageButton7, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, TextCustumFont textCustumFont8, BlurredImageView blurredImageView) {
        this.rootView = frameLayout;
        this.btnAddQuran = linearLayout;
        this.btnBg = linearLayout2;
        this.btnCancel = imageButton;
        this.btnChangeAspect = linearLayout3;
        this.btnExport = buttonCustumFont;
        this.btnIpad = linearLayout4;
        this.btnPlayPause = imageButton2;
        this.btnRedo = imageButton3;
        this.btnSetupFps = linearLayout5;
        this.btnToEnd = imageButton4;
        this.btnToStart = imageButton5;
        this.btnUndo = imageButton6;
        this.containerProgress = frameLayout2;
        this.ivIpod = imageView;
        this.ivRatio = imageView2;
        this.layoutMenu = linearLayout6;
        this.layoutResolution = layoutResolutionBinding;
        this.layoutTime = relativeLayout;
        this.mContainer = frameLayout3;
        this.main = frameLayout4;
        this.timeLineView = trackEntityView;
        this.toPro = imageButton7;
        this.tvBg = textCustumFont;
        this.tvCurrentTime = textCustumFont2;
        this.tvEndTime = textCustumFont3;
        this.tvIpad = textCustumFont4;
        this.tvQuran = textCustumFont5;
        this.tvRatio = textCustumFont6;
        this.tvResolution = textCustumFont7;
        this.tvTittleFragment = textCustumFont8;
        this.view = blurredImageView;
    }

    public static ActivityTimeLineBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_add_quran;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_bg;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n = R$id.btn_cancel;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (ImageButton)view2;
                if (view5 != null) {
                    n = R$id.btn_change_aspect;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n = R$id.btn_export;
                        Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        object2 = (ButtonCustumFont)view2;
                        if (object2 != null) {
                            n = R$id.btn_ipad;
                            View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n = R$id.btn_play_pause;
                                View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view8 = (ImageButton)view2;
                                if (view8 != null) {
                                    n = R$id.btn_redo;
                                    View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view9 = (ImageButton)view2;
                                    if (view9 != null) {
                                        n = R$id.btn_setup_fps;
                                        View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view10 = (LinearLayout)view2;
                                        if (view10 != null) {
                                            n = R$id.btn_to_end;
                                            View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view11 = (ImageButton)view2;
                                            if (view11 != null) {
                                                n = R$id.btn_to_start;
                                                View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view12 = (ImageButton)view2;
                                                if (view12 != null) {
                                                    n = R$id.btn_undo;
                                                    View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view13 = (ImageButton)view2;
                                                    if (view13 != null) {
                                                        n = R$id.container_progress;
                                                        View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view14 = (FrameLayout)view2;
                                                        if (view14 != null) {
                                                            n = R$id.iv_ipod;
                                                            View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view15 = (ImageView)view2;
                                                            if (view15 != null) {
                                                                n = R$id.iv_ratio;
                                                                View view16 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                view16 = (ImageView)view2;
                                                                if (view16 != null) {
                                                                    n = R$id.layout_menu;
                                                                    View view17 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    view17 = (LinearLayout)view2;
                                                                    if (view17 != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.layout_resolution))) != null) {
                                                                        LayoutResolutionBinding layoutResolutionBinding = LayoutResolutionBinding.bind(view2);
                                                                        n = R$id.layout_time;
                                                                        View view18 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        view18 = (RelativeLayout)view2;
                                                                        if (view18 != null) {
                                                                            n = R$id.m_container;
                                                                            View view19 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            view19 = (FrameLayout)view2;
                                                                            if (view19 != null) {
                                                                                View view20 = view;
                                                                                view20 = (FrameLayout)view;
                                                                                n = R$id.time_line_view;
                                                                                Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                object3 = (TrackEntityView)view2;
                                                                                if (object3 != null) {
                                                                                    n = R$id.to_pro;
                                                                                    View view21 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    view21 = (ImageButton)view2;
                                                                                    if (view21 != null) {
                                                                                        n = R$id.tv_bg;
                                                                                        Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        object4 = (TextCustumFont)view2;
                                                                                        if (object4 != null) {
                                                                                            n = R$id.tv_current_time;
                                                                                            Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            object5 = (TextCustumFont)view2;
                                                                                            if (object5 != null) {
                                                                                                n = R$id.tv_end_time;
                                                                                                Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                object6 = (TextCustumFont)view2;
                                                                                                if (object6 != null) {
                                                                                                    n = R$id.tv_ipad;
                                                                                                    Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    object7 = (TextCustumFont)view2;
                                                                                                    if (object7 != null) {
                                                                                                        n = R$id.tv_quran;
                                                                                                        Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                        object8 = (TextCustumFont)view2;
                                                                                                        if (object8 != null) {
                                                                                                            n = R$id.tv_ratio;
                                                                                                            Object object9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                            object9 = (TextCustumFont)view2;
                                                                                                            if (object9 != null) {
                                                                                                                n = R$id.tv_resolution;
                                                                                                                Object object10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                object10 = (TextCustumFont)view2;
                                                                                                                if (object10 != null) {
                                                                                                                    n = R$id.tv_tittle_fragment;
                                                                                                                    Object object11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                    object11 = (TextCustumFont)view2;
                                                                                                                    if (object11 != null) {
                                                                                                                        n = R$id.view;
                                                                                                                        View view22 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                        view22 = (BlurredImageView)view2;
                                                                                                                        if (view22 != null) {
                                                                                                                            object = new ActivityTimeLineBinding((FrameLayout)view20, (LinearLayout)view3, (LinearLayout)view4, (ImageButton)view5, (LinearLayout)view6, (ButtonCustumFont)((Object)object2), (LinearLayout)view7, (ImageButton)view8, (ImageButton)view9, (LinearLayout)view10, (ImageButton)view11, (ImageButton)view12, (ImageButton)view13, (FrameLayout)view14, (ImageView)view15, (ImageView)view16, (LinearLayout)view17, layoutResolutionBinding, (RelativeLayout)view18, (FrameLayout)view19, (FrameLayout)view20, (TrackEntityView)((Object)object3), (ImageButton)view21, (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (TextCustumFont)((Object)object9), (TextCustumFont)((Object)object10), (TextCustumFont)((Object)object11), (BlurredImageView)view22);
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityTimeLineBinding inflate(LayoutInflater layoutInflater) {
        return ActivityTimeLineBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityTimeLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_time_line;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityTimeLineBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

