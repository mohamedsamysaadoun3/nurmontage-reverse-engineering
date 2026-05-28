/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  android.widget.VideoView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class ActivityPlayVideoBinding
implements ViewBinding {
    public final ImageButton btnOnBack;
    public final RelativeLayout main;
    public final RelativeLayout parentLayout;
    private final RelativeLayout rootView;
    public final VideoView videoView;

    private ActivityPlayVideoBinding(RelativeLayout relativeLayout, ImageButton imageButton, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, VideoView videoView) {
        this.rootView = relativeLayout;
        this.btnOnBack = imageButton;
        this.main = relativeLayout2;
        this.parentLayout = relativeLayout3;
        this.videoView = videoView;
    }

    public static ActivityPlayVideoBinding bind(View object) {
        View view;
        int n = R$id.btn_on_back;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (RelativeLayout)object;
            n = R$id.parentLayout;
            View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view4 = (RelativeLayout)view;
            if (view4 != null) {
                n = R$id.videoView;
                View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view5 = (VideoView)view;
                if (view5 != null) {
                    object = new ActivityPlayVideoBinding((RelativeLayout)view3, (ImageButton)view2, (RelativeLayout)view3, (RelativeLayout)view4, (VideoView)view5);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityPlayVideoBinding inflate(LayoutInflater layoutInflater) {
        return ActivityPlayVideoBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityPlayVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_play_video;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityPlayVideoBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

