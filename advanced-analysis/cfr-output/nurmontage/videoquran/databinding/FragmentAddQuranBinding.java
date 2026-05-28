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
 *  android.widget.Spinner
 *  androidx.recyclerview.widget.RecyclerView
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
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentAddQuranBinding
implements ViewBinding {
    public final LinearLayout addBismilah;
    public final Spinner ayaFrom;
    public final Spinner ayaTo;
    public final ImageButton btnCancel;
    public final ButtonCustumFont btnDone;
    public final ImageButton btnSearch;
    public final ButtonCustumFont btnUpload;
    public final CheckboxCustumFont checkbox;
    public final FrameLayout frameLayout;
    public final LinearLayout hintNoInternet;
    public final ImageView ivDone;
    public final LinearLayout nameReader;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final Spinner spinnerReciters;
    public final Spinner spinnerTranslation;
    public final Spinner suraName;
    public final TextCustumFont tvAddBismilah;
    public final TextCustumFont tvEndAyah;
    public final TextCustumFont tvHintReader;
    public final TextCustumFont tvIcon;
    public final TextCustumFont tvNumber;
    public final TextCustumFont tvOr;
    public final TextCustumFont tvReader;
    public final TextCustumFont tvSurah;
    public final TextCustumFont tvTranslation;
    public final View v;
    public final LinearLayout viewAya;
    public final View viewSurah;
    public final RelativeLayout viewTolbar;

    private FragmentAddQuranBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, Spinner spinner, Spinner spinner2, ImageButton imageButton, ButtonCustumFont buttonCustumFont, ImageButton imageButton2, ButtonCustumFont buttonCustumFont2, CheckboxCustumFont checkboxCustumFont, FrameLayout frameLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, RecyclerView recyclerView, Spinner spinner3, Spinner spinner4, Spinner spinner5, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, TextCustumFont textCustumFont8, TextCustumFont textCustumFont9, View view, LinearLayout linearLayout4, View view2, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.addBismilah = linearLayout;
        this.ayaFrom = spinner;
        this.ayaTo = spinner2;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustumFont;
        this.btnSearch = imageButton2;
        this.btnUpload = buttonCustumFont2;
        this.checkbox = checkboxCustumFont;
        this.frameLayout = frameLayout;
        this.hintNoInternet = linearLayout2;
        this.ivDone = imageView;
        this.nameReader = linearLayout3;
        this.rv = recyclerView;
        this.spinnerReciters = spinner3;
        this.spinnerTranslation = spinner4;
        this.suraName = spinner5;
        this.tvAddBismilah = textCustumFont;
        this.tvEndAyah = textCustumFont2;
        this.tvHintReader = textCustumFont3;
        this.tvIcon = textCustumFont4;
        this.tvNumber = textCustumFont5;
        this.tvOr = textCustumFont6;
        this.tvReader = textCustumFont7;
        this.tvSurah = textCustumFont8;
        this.tvTranslation = textCustumFont9;
        this.v = view;
        this.viewAya = linearLayout4;
        this.viewSurah = view2;
        this.viewTolbar = relativeLayout2;
    }

    public static FragmentAddQuranBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.add_bismilah;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.aya_from;
            View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            view4 = (Spinner)view2;
            if (view4 != null) {
                n = R$id.aya_to;
                View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view5 = (Spinner)view2;
                if (view5 != null) {
                    n = R$id.btn_cancel;
                    View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view6 = (ImageButton)view2;
                    if (view6 != null) {
                        n = R$id.btn_done;
                        Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        object2 = (ButtonCustumFont)view2;
                        if (object2 != null) {
                            n = R$id.btn_search;
                            View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view7 = (ImageButton)view2;
                            if (view7 != null) {
                                n = R$id.btn_upload;
                                Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                object3 = (ButtonCustumFont)view2;
                                if (object3 != null) {
                                    n = R$id.checkbox;
                                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object4 = (CheckboxCustumFont)view2;
                                    if (object4 != null) {
                                        n = R$id.frame_layout;
                                        View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view8 = (FrameLayout)view2;
                                        if (view8 != null) {
                                            n = R$id.hint_no_internet;
                                            View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view9 = (LinearLayout)view2;
                                            if (view9 != null) {
                                                n = R$id.iv_done;
                                                View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view10 = (ImageView)view2;
                                                if (view10 != null) {
                                                    n = R$id.name_reader;
                                                    View view11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view11 = (LinearLayout)view2;
                                                    if (view11 != null) {
                                                        n = R$id.rv;
                                                        View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view12 = (RecyclerView)view2;
                                                        if (view12 != null) {
                                                            n = R$id.spinner_reciters;
                                                            View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view13 = (Spinner)view2;
                                                            if (view13 != null) {
                                                                n = R$id.spinner_translation;
                                                                View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                view14 = (Spinner)view2;
                                                                if (view14 != null) {
                                                                    n = R$id.sura_name;
                                                                    View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    view15 = (Spinner)view2;
                                                                    if (view15 != null) {
                                                                        n = R$id.tv_add_bismilah;
                                                                        Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        object5 = (TextCustumFont)view2;
                                                                        if (object5 != null) {
                                                                            n = R$id.tv_end_ayah;
                                                                            Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            object6 = (TextCustumFont)view2;
                                                                            if (object6 != null) {
                                                                                n = R$id.tv_hint_reader;
                                                                                Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                object7 = (TextCustumFont)view2;
                                                                                if (object7 != null) {
                                                                                    n = R$id.tv_icon;
                                                                                    Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    object8 = (TextCustumFont)view2;
                                                                                    if (object8 != null) {
                                                                                        n = R$id.tv_number;
                                                                                        Object object9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        object9 = (TextCustumFont)view2;
                                                                                        if (object9 != null) {
                                                                                            n = R$id.tv_or;
                                                                                            Object object10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            object10 = (TextCustumFont)view2;
                                                                                            if (object10 != null) {
                                                                                                n = R$id.tv_reader;
                                                                                                Object object11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                object11 = (TextCustumFont)view2;
                                                                                                if (object11 != null) {
                                                                                                    n = R$id.tv_surah;
                                                                                                    Object object12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    object12 = (TextCustumFont)view2;
                                                                                                    if (object12 != null) {
                                                                                                        View view16;
                                                                                                        n = R$id.tv_translation;
                                                                                                        Object object13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                        object13 = (TextCustumFont)view2;
                                                                                                        if (object13 != null && (view16 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.v))) != null) {
                                                                                                            View view17;
                                                                                                            n = R$id.view_aya;
                                                                                                            View view18 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                            view18 = (LinearLayout)view2;
                                                                                                            if (view18 != null && (view17 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.view_surah))) != null) {
                                                                                                                n = R$id.view_tolbar;
                                                                                                                View view19 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                                view19 = (RelativeLayout)view2;
                                                                                                                if (view19 != null) {
                                                                                                                    View view20 = view;
                                                                                                                    view20 = (RelativeLayout)view;
                                                                                                                    FragmentAddQuranBinding fragmentAddQuranBinding = new FragmentAddQuranBinding((RelativeLayout)view20, (LinearLayout)view3, (Spinner)view4, (Spinner)view5, (ImageButton)view6, (ButtonCustumFont)((Object)object2), (ImageButton)view7, (ButtonCustumFont)((Object)object3), (CheckboxCustumFont)((Object)object4), (FrameLayout)view8, (LinearLayout)view9, (ImageView)view10, (LinearLayout)view11, (RecyclerView)view12, (Spinner)view13, (Spinner)view14, (Spinner)view15, (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (TextCustumFont)((Object)object9), (TextCustumFont)((Object)object10), (TextCustumFont)((Object)object11), (TextCustumFont)((Object)object12), (TextCustumFont)((Object)object13), view16, (LinearLayout)view18, view17, (RelativeLayout)view19);
                                                                                                                    return fragmentAddQuranBinding;
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

    public static FragmentAddQuranBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAddQuranBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAddQuranBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_add_quran;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAddQuranBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

