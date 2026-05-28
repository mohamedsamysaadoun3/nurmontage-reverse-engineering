/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.HorizontalScrollView
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
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentEditEntityBinding
implements ViewBinding {
    public final LinearLayout btnAnim;
    public final LinearLayout btnColor;
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final LinearLayout btnDuplicate;
    public final LinearLayout btnEdit;
    public final LinearLayout btnFont;
    public final LinearLayout btnFromNow;
    public final LinearLayout btnFromTheStart;
    public final LinearLayout btnIcon;
    public final ImageView btnShowLeft;
    public final ImageView btnShowRight;
    public final LinearLayout btnUntilNow;
    public final LinearLayout btnUntilTheEnd;
    public final ImageView ivCut;
    public final ImageView ivFromNow;
    public final ImageView ivIcon;
    public final ImageView ivUntilNow;
    private final RelativeLayout rootView;
    public final HorizontalScrollView scrollMenu;
    public final TextCustumFont tvAnim;
    public final TextCustumFont tvColor;
    public final TextCustumFont tvCut;
    public final TextCustumFont tvDelete;
    public final TextCustumFont tvDuplicate;
    public final TextCustumFont tvEdit;
    public final TextCustumFont tvFont;
    public final TextCustumFont tvFromNow;
    public final TextCustumFont tvFromTheStart;
    public final TextCustumFont tvIcon;
    public final TextCustumFont tvUntilNow;
    public final TextCustumFont tvUntilTheEnd;
    public final View view;
    public final LinearLayout viewTime;

    private FragmentEditEntityBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ImageView imageView, ImageView imageView2, LinearLayout linearLayout11, LinearLayout linearLayout12, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, HorizontalScrollView horizontalScrollView, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, TextCustumFont textCustumFont8, TextCustumFont textCustumFont9, TextCustumFont textCustumFont10, TextCustumFont textCustumFont11, TextCustumFont textCustumFont12, View view, LinearLayout linearLayout13) {
        this.rootView = relativeLayout;
        this.btnAnim = linearLayout;
        this.btnColor = linearLayout2;
        this.btnCut = linearLayout3;
        this.btnDelete = linearLayout4;
        this.btnDuplicate = linearLayout5;
        this.btnEdit = linearLayout6;
        this.btnFont = linearLayout7;
        this.btnFromNow = linearLayout8;
        this.btnFromTheStart = linearLayout9;
        this.btnIcon = linearLayout10;
        this.btnShowLeft = imageView;
        this.btnShowRight = imageView2;
        this.btnUntilNow = linearLayout11;
        this.btnUntilTheEnd = linearLayout12;
        this.ivCut = imageView3;
        this.ivFromNow = imageView4;
        this.ivIcon = imageView5;
        this.ivUntilNow = imageView6;
        this.scrollMenu = horizontalScrollView;
        this.tvAnim = textCustumFont;
        this.tvColor = textCustumFont2;
        this.tvCut = textCustumFont3;
        this.tvDelete = textCustumFont4;
        this.tvDuplicate = textCustumFont5;
        this.tvEdit = textCustumFont6;
        this.tvFont = textCustumFont7;
        this.tvFromNow = textCustumFont8;
        this.tvFromTheStart = textCustumFont9;
        this.tvIcon = textCustumFont10;
        this.tvUntilNow = textCustumFont11;
        this.tvUntilTheEnd = textCustumFont12;
        this.view = view;
        this.viewTime = linearLayout13;
    }

    public static FragmentEditEntityBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn_anim;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_color;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n = R$id.btn_cut;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (LinearLayout)view2;
                if (view5 != null) {
                    n = R$id.btn_delete;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n = R$id.btn_duplicate;
                        View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n = R$id.btn_edit;
                            View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view8 = (LinearLayout)view2;
                            if (view8 != null) {
                                n = R$id.btn_font;
                                View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view9 = (LinearLayout)view2;
                                if (view9 != null) {
                                    n = R$id.btn_from_now;
                                    View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view10 = (LinearLayout)view2;
                                    if (view10 != null) {
                                        n = R$id.btn_from_the_start;
                                        View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view11 = (LinearLayout)view2;
                                        if (view11 != null) {
                                            n = R$id.btn_icon;
                                            View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view12 = (LinearLayout)view2;
                                            if (view12 != null) {
                                                n = R$id.btn_show_left;
                                                View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view13 = (ImageView)view2;
                                                if (view13 != null) {
                                                    n = R$id.btn_show_right;
                                                    View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view14 = (ImageView)view2;
                                                    if (view14 != null) {
                                                        n = R$id.btn_until_now;
                                                        View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view15 = (LinearLayout)view2;
                                                        if (view15 != null) {
                                                            n = R$id.btn_until_the_end;
                                                            View view16 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view16 = (LinearLayout)view2;
                                                            if (view16 != null) {
                                                                n = R$id.iv_cut;
                                                                View view17 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                view17 = (ImageView)view2;
                                                                if (view17 != null) {
                                                                    n = R$id.iv_from_now;
                                                                    View view18 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    view18 = (ImageView)view2;
                                                                    if (view18 != null) {
                                                                        n = R$id.iv_icon;
                                                                        View view19 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        view19 = (ImageView)view2;
                                                                        if (view19 != null) {
                                                                            n = R$id.iv_until_now;
                                                                            View view20 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            view20 = (ImageView)view2;
                                                                            if (view20 != null) {
                                                                                n = R$id.scroll_menu;
                                                                                View view21 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                view21 = (HorizontalScrollView)view2;
                                                                                if (view21 != null) {
                                                                                    n = R$id.tv_anim;
                                                                                    Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    object2 = (TextCustumFont)view2;
                                                                                    if (object2 != null) {
                                                                                        n = R$id.tv_color;
                                                                                        Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        object3 = (TextCustumFont)view2;
                                                                                        if (object3 != null) {
                                                                                            n = R$id.tv_cut;
                                                                                            Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            object4 = (TextCustumFont)view2;
                                                                                            if (object4 != null) {
                                                                                                n = R$id.tv_delete;
                                                                                                Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                object5 = (TextCustumFont)view2;
                                                                                                if (object5 != null) {
                                                                                                    n = R$id.tv_duplicate;
                                                                                                    Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    object6 = (TextCustumFont)view2;
                                                                                                    if (object6 != null) {
                                                                                                        n = R$id.tv_edit;
                                                                                                        Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                        object7 = (TextCustumFont)view2;
                                                                                                        if (object7 != null) {
                                                                                                            n = R$id.tv_font;
                                                                                                            Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                            object8 = (TextCustumFont)view2;
                                                                                                            if (object8 != null) {
                                                                                                                n = R$id.tv_from_now;
                                                                                                                Object object9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                object9 = (TextCustumFont)view2;
                                                                                                                if (object9 != null) {
                                                                                                                    n = R$id.tv_from_the_start;
                                                                                                                    Object object10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                    object10 = (TextCustumFont)view2;
                                                                                                                    if (object10 != null) {
                                                                                                                        n = R$id.tv_icon;
                                                                                                                        Object object11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                        object11 = (TextCustumFont)view2;
                                                                                                                        if (object11 != null) {
                                                                                                                            n = R$id.tv_until_now;
                                                                                                                            Object object12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                            object12 = (TextCustumFont)view2;
                                                                                                                            if (object12 != null) {
                                                                                                                                View view22;
                                                                                                                                n = R$id.tv_until_the_end;
                                                                                                                                Object object13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                                object13 = (TextCustumFont)view2;
                                                                                                                                if (object13 != null && (view22 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.view))) != null) {
                                                                                                                                    n = R$id.view_time;
                                                                                                                                    View view23 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                                    view23 = (LinearLayout)view2;
                                                                                                                                    if (view23 != null) {
                                                                                                                                        View view24 = view;
                                                                                                                                        view24 = (RelativeLayout)view;
                                                                                                                                        FragmentEditEntityBinding fragmentEditEntityBinding = new FragmentEditEntityBinding((RelativeLayout)view24, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (LinearLayout)view8, (LinearLayout)view9, (LinearLayout)view10, (LinearLayout)view11, (LinearLayout)view12, (ImageView)view13, (ImageView)view14, (LinearLayout)view15, (LinearLayout)view16, (ImageView)view17, (ImageView)view18, (ImageView)view19, (ImageView)view20, (HorizontalScrollView)view21, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (TextCustumFont)((Object)object9), (TextCustumFont)((Object)object10), (TextCustumFont)((Object)object11), (TextCustumFont)((Object)object12), (TextCustumFont)((Object)object13), view22, (LinearLayout)view23);
                                                                                                                                        return fragmentEditEntityBinding;
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
            }
        }
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentEditEntityBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditEntityBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditEntityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_entity;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditEntityBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

