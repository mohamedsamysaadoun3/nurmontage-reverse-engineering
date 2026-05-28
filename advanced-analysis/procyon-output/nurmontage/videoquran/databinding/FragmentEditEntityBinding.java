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
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentEditEntityBinding implements ViewBinding
{
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
    
    private FragmentEditEntityBinding(final RelativeLayout rootView, final LinearLayout btnAnim, final LinearLayout btnColor, final LinearLayout btnCut, final LinearLayout btnDelete, final LinearLayout btnDuplicate, final LinearLayout btnEdit, final LinearLayout btnFont, final LinearLayout btnFromNow, final LinearLayout btnFromTheStart, final LinearLayout btnIcon, final ImageView btnShowLeft, final ImageView btnShowRight, final LinearLayout btnUntilNow, final LinearLayout btnUntilTheEnd, final ImageView ivCut, final ImageView ivFromNow, final ImageView ivIcon, final ImageView ivUntilNow, final HorizontalScrollView scrollMenu, final TextCustumFont tvAnim, final TextCustumFont tvColor, final TextCustumFont tvCut, final TextCustumFont tvDelete, final TextCustumFont tvDuplicate, final TextCustumFont tvEdit, final TextCustumFont tvFont, final TextCustumFont tvFromNow, final TextCustumFont tvFromTheStart, final TextCustumFont tvIcon, final TextCustumFont tvUntilNow, final TextCustumFont tvUntilTheEnd, final View view, final LinearLayout viewTime) {
        this.rootView = rootView;
        this.btnAnim = btnAnim;
        this.btnColor = btnColor;
        this.btnCut = btnCut;
        this.btnDelete = btnDelete;
        this.btnDuplicate = btnDuplicate;
        this.btnEdit = btnEdit;
        this.btnFont = btnFont;
        this.btnFromNow = btnFromNow;
        this.btnFromTheStart = btnFromTheStart;
        this.btnIcon = btnIcon;
        this.btnShowLeft = btnShowLeft;
        this.btnShowRight = btnShowRight;
        this.btnUntilNow = btnUntilNow;
        this.btnUntilTheEnd = btnUntilTheEnd;
        this.ivCut = ivCut;
        this.ivFromNow = ivFromNow;
        this.ivIcon = ivIcon;
        this.ivUntilNow = ivUntilNow;
        this.scrollMenu = scrollMenu;
        this.tvAnim = tvAnim;
        this.tvColor = tvColor;
        this.tvCut = tvCut;
        this.tvDelete = tvDelete;
        this.tvDuplicate = tvDuplicate;
        this.tvEdit = tvEdit;
        this.tvFont = tvFont;
        this.tvFromNow = tvFromNow;
        this.tvFromTheStart = tvFromTheStart;
        this.tvIcon = tvIcon;
        this.tvUntilNow = tvUntilNow;
        this.tvUntilTheEnd = tvUntilTheEnd;
        this.view = view;
        this.viewTime = viewTime;
    }
    
    public static FragmentEditEntityBinding bind(final View view) {
        int n = R$id.btn_anim;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_color;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.btn_cut;
                final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                if (linearLayout3 != null) {
                    n = R$id.btn_delete;
                    final LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                    if (linearLayout4 != null) {
                        n = R$id.btn_duplicate;
                        final LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                        if (linearLayout5 != null) {
                            n = R$id.btn_edit;
                            final LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                            if (linearLayout6 != null) {
                                n = R$id.btn_font;
                                final LinearLayout linearLayout7 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                if (linearLayout7 != null) {
                                    n = R$id.btn_from_now;
                                    final LinearLayout linearLayout8 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                    if (linearLayout8 != null) {
                                        n = R$id.btn_from_the_start;
                                        final LinearLayout linearLayout9 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                        if (linearLayout9 != null) {
                                            n = R$id.btn_icon;
                                            final LinearLayout linearLayout10 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                            if (linearLayout10 != null) {
                                                n = R$id.btn_show_left;
                                                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                                if (imageView != null) {
                                                    n = R$id.btn_show_right;
                                                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                    if (imageView2 != null) {
                                                        n = R$id.btn_until_now;
                                                        final LinearLayout linearLayout11 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                        if (linearLayout11 != null) {
                                                            n = R$id.btn_until_the_end;
                                                            final LinearLayout linearLayout12 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                            if (linearLayout12 != null) {
                                                                n = R$id.iv_cut;
                                                                final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                if (imageView3 != null) {
                                                                    n = R$id.iv_from_now;
                                                                    final ImageView imageView4 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                    if (imageView4 != null) {
                                                                        n = R$id.iv_icon;
                                                                        final ImageView imageView5 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                        if (imageView5 != null) {
                                                                            n = R$id.iv_until_now;
                                                                            final ImageView imageView6 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                            if (imageView6 != null) {
                                                                                n = R$id.scroll_menu;
                                                                                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView)ViewBindings.findChildViewById(view, n);
                                                                                if (horizontalScrollView != null) {
                                                                                    n = R$id.tv_anim;
                                                                                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                    if (textCustumFont != null) {
                                                                                        n = R$id.tv_color;
                                                                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                        if (textCustumFont2 != null) {
                                                                                            n = R$id.tv_cut;
                                                                                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                            if (textCustumFont3 != null) {
                                                                                                n = R$id.tv_delete;
                                                                                                final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont4 != null) {
                                                                                                    n = R$id.tv_duplicate;
                                                                                                    final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                    if (textCustumFont5 != null) {
                                                                                                        n = R$id.tv_edit;
                                                                                                        final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                        if (textCustumFont6 != null) {
                                                                                                            n = R$id.tv_font;
                                                                                                            final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                            if (textCustumFont7 != null) {
                                                                                                                n = R$id.tv_from_now;
                                                                                                                final TextCustumFont textCustumFont8 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                if (textCustumFont8 != null) {
                                                                                                                    n = R$id.tv_from_the_start;
                                                                                                                    final TextCustumFont textCustumFont9 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                    if (textCustumFont9 != null) {
                                                                                                                        n = R$id.tv_icon;
                                                                                                                        final TextCustumFont textCustumFont10 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                        if (textCustumFont10 != null) {
                                                                                                                            n = R$id.tv_until_now;
                                                                                                                            final TextCustumFont textCustumFont11 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                            if (textCustumFont11 != null) {
                                                                                                                                n = R$id.tv_until_the_end;
                                                                                                                                final TextCustumFont textCustumFont12 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                                                if (textCustumFont12 != null) {
                                                                                                                                    n = R$id.view;
                                                                                                                                    final View childViewById = ViewBindings.findChildViewById(view, n);
                                                                                                                                    if (childViewById != null) {
                                                                                                                                        n = R$id.view_time;
                                                                                                                                        final LinearLayout linearLayout13 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                                                                                        if (linearLayout13 != null) {
                                                                                                                                            return new FragmentEditEntityBinding((RelativeLayout)view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, imageView, imageView2, linearLayout11, linearLayout12, imageView3, imageView4, imageView5, imageView6, horizontalScrollView, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, textCustumFont8, textCustumFont9, textCustumFont10, textCustumFont11, textCustumFont12, childViewById, linearLayout13);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEditEntityBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditEntityBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_entity, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
