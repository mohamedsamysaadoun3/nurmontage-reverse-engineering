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
 *  android.widget.ProgressBar
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
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class ActivityProgressViewBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnSupportTeam;
    public final LinearLayout layoutError;
    public final FrameLayout main;
    public final ProgressBar progress;
    public final SquareOutlineProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustumFont tvError;
    public final TextCustumFont tvHint;
    public final TextCustumFont tvProgress;

    private ActivityProgressViewBinding(FrameLayout frameLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, LinearLayout linearLayout, FrameLayout frameLayout2, ProgressBar progressBar, SquareOutlineProgressBar squareOutlineProgressBar, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3) {
        this.rootView = frameLayout;
        this.btnCancel = imageButton;
        this.btnSupportTeam = buttonCustumFont;
        this.layoutError = linearLayout;
        this.main = frameLayout2;
        this.progress = progressBar;
        this.progressHorizontal = squareOutlineProgressBar;
        this.tvError = textCustumFont;
        this.tvHint = textCustumFont2;
        this.tvProgress = textCustumFont3;
    }

    public static ActivityProgressViewBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_support_team;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (ButtonCustumFont)view;
            if (object2 != null) {
                n = R$id.layout_error;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    Object object3 = object;
                    object3 = (FrameLayout)object;
                    n = R$id.progress;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (ProgressBar)view;
                    if (view4 != null) {
                        n = R$id.progress_horizontal;
                        View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view5 = (SquareOutlineProgressBar)view;
                        if (view5 != null) {
                            n = R$id.tv_error;
                            Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object4 = (TextCustumFont)view;
                            if (object4 != null) {
                                n = R$id.tv_hint;
                                Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                object5 = (TextCustumFont)view;
                                if (object5 != null) {
                                    n = R$id.tv_progress;
                                    Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    object6 = (TextCustumFont)view;
                                    if (object6 != null) {
                                        object = new ActivityProgressViewBinding((FrameLayout)object3, (ImageButton)view2, (ButtonCustumFont)((Object)object2), (LinearLayout)view3, (FrameLayout)object3, (ProgressBar)view4, (SquareOutlineProgressBar)view5, (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6));
                                        return object;
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

    public static ActivityProgressViewBinding inflate(LayoutInflater layoutInflater) {
        return ActivityProgressViewBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_progress_view;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProgressViewBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

