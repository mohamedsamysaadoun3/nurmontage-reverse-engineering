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
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;

public final class ActivityChoiceBgFromVideoBinding
implements ViewBinding {
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    public final VideoFrameSelectorView frameSelectorView;
    public final ImageView ivView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvTittleFragment;

    private ActivityChoiceBgFromVideoBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, VideoFrameSelectorView videoFrameSelectorView, ImageView imageView, RelativeLayout relativeLayout2, TextCustumFont textCustumFont) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = imageButton2;
        this.frameSelectorView = videoFrameSelectorView;
        this.ivView = imageView;
        this.main = relativeLayout2;
        this.tvTittleFragment = textCustumFont;
    }

    public static ActivityChoiceBgFromVideoBinding bind(View object) {
        View view;
        int n = R$id.btn_cancel;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.btn_done;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.frameSelectorView;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (VideoFrameSelectorView)view;
                if (view4 != null) {
                    n = R$id.iv_view;
                    View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (RelativeLayout)object;
                        n = R$id.tv_tittle_fragment;
                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object3 = (TextCustumFont)view;
                        if (object3 != null) {
                            object = new ActivityChoiceBgFromVideoBinding((RelativeLayout)object2, (ImageButton)view2, (ImageButton)view3, (VideoFrameSelectorView)view4, (ImageView)view5, (RelativeLayout)object2, (TextCustumFont)((Object)object3));
                            return object;
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

    public static ActivityChoiceBgFromVideoBinding inflate(LayoutInflater layoutInflater) {
        return ActivityChoiceBgFromVideoBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityChoiceBgFromVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_choice_bg_from_video;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityChoiceBgFromVideoBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

