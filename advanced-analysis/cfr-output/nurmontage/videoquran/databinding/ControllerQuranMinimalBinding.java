/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.media3.ui.DefaultTimeBar
 *  androidx.media3.ui.R$id
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.R;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ControllerQuranMinimalBinding
implements ViewBinding {
    public final LinearLayout bottomBar;
    public final ImageButton btnBack;
    public final ImageButton btnPlayPause;
    public final ImageButton btnRotate;
    public final TextCustumFont exoDuration;
    public final TextCustumFont exoPosition;
    public final DefaultTimeBar exoProgress;
    private final FrameLayout rootView;
    public final LinearLayout topBar;

    private ControllerQuranMinimalBinding(FrameLayout frameLayout, LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, DefaultTimeBar defaultTimeBar, LinearLayout linearLayout2) {
        this.rootView = frameLayout;
        this.bottomBar = linearLayout;
        this.btnBack = imageButton;
        this.btnPlayPause = imageButton2;
        this.btnRotate = imageButton3;
        this.exoDuration = textCustumFont;
        this.exoPosition = textCustumFont2;
        this.exoProgress = defaultTimeBar;
        this.topBar = linearLayout2;
    }

    public static ControllerQuranMinimalBinding bind(View object) {
        View view;
        int n = R$id.bottomBar;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btnBack;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.btn_play_pause;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    n = R$id.btnRotate;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageButton)view;
                    if (view5 != null) {
                        n = R.id.exo_duration;
                        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object2 = (TextCustumFont)view;
                        if (object2 != null) {
                            n = R.id.exo_position;
                            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object3 = (TextCustumFont)view;
                            if (object3 != null) {
                                n = R.id.exo_progress;
                                View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view6 = (DefaultTimeBar)view;
                                if (view6 != null) {
                                    n = R$id.topBar;
                                    View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view7 = (LinearLayout)view;
                                    if (view7 != null) {
                                        Object object4 = object;
                                        object4 = (FrameLayout)object;
                                        ControllerQuranMinimalBinding controllerQuranMinimalBinding = new ControllerQuranMinimalBinding((FrameLayout)object4, (LinearLayout)view2, (ImageButton)view3, (ImageButton)view4, (ImageButton)view5, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (DefaultTimeBar)view6, (LinearLayout)view7);
                                        return controllerQuranMinimalBinding;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ControllerQuranMinimalBinding inflate(LayoutInflater layoutInflater) {
        return ControllerQuranMinimalBinding.inflate(layoutInflater, null, false);
    }

    public static ControllerQuranMinimalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.controller_quran_minimal;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ControllerQuranMinimalBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

