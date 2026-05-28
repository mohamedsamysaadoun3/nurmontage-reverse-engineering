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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentAddQuranBinding implements ViewBinding
{
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
    
    private FragmentAddQuranBinding(final RelativeLayout rootView, final LinearLayout addBismilah, final Spinner ayaFrom, final Spinner ayaTo, final ImageButton btnCancel, final ButtonCustumFont btnDone, final ImageButton btnSearch, final ButtonCustumFont btnUpload, final CheckboxCustumFont checkbox, final FrameLayout frameLayout, final LinearLayout hintNoInternet, final ImageView ivDone, final LinearLayout nameReader, final RecyclerView rv, final Spinner spinnerReciters, final Spinner spinnerTranslation, final Spinner suraName, final TextCustumFont tvAddBismilah, final TextCustumFont tvEndAyah, final TextCustumFont tvHintReader, final TextCustumFont tvIcon, final TextCustumFont tvNumber, final TextCustumFont tvOr, final TextCustumFont tvReader, final TextCustumFont tvSurah, final TextCustumFont tvTranslation, final View v, final LinearLayout viewAya, final View viewSurah, final RelativeLayout viewTolbar) {
        this.rootView = rootView;
        this.addBismilah = addBismilah;
        this.ayaFrom = ayaFrom;
        this.ayaTo = ayaTo;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.btnSearch = btnSearch;
        this.btnUpload = btnUpload;
        this.checkbox = checkbox;
        this.frameLayout = frameLayout;
        this.hintNoInternet = hintNoInternet;
        this.ivDone = ivDone;
        this.nameReader = nameReader;
        this.rv = rv;
        this.spinnerReciters = spinnerReciters;
        this.spinnerTranslation = spinnerTranslation;
        this.suraName = suraName;
        this.tvAddBismilah = tvAddBismilah;
        this.tvEndAyah = tvEndAyah;
        this.tvHintReader = tvHintReader;
        this.tvIcon = tvIcon;
        this.tvNumber = tvNumber;
        this.tvOr = tvOr;
        this.tvReader = tvReader;
        this.tvSurah = tvSurah;
        this.tvTranslation = tvTranslation;
        this.v = v;
        this.viewAya = viewAya;
        this.viewSurah = viewSurah;
        this.viewTolbar = viewTolbar;
    }
    
    public static FragmentAddQuranBinding bind(final View view) {
        int n = R$id.add_bismilah;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.aya_from;
            final Spinner spinner = (Spinner)ViewBindings.findChildViewById(view, n);
            if (spinner != null) {
                n = R$id.aya_to;
                final Spinner spinner2 = (Spinner)ViewBindings.findChildViewById(view, n);
                if (spinner2 != null) {
                    n = R$id.btn_cancel;
                    final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton != null) {
                        n = R$id.btn_done;
                        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                        if (buttonCustumFont != null) {
                            n = R$id.btn_search;
                            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                            if (imageButton2 != null) {
                                n = R$id.btn_upload;
                                final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                                if (buttonCustumFont2 != null) {
                                    n = R$id.checkbox;
                                    final CheckboxCustumFont checkboxCustumFont = (CheckboxCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (checkboxCustumFont != null) {
                                        n = R$id.frame_layout;
                                        final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                                        if (frameLayout != null) {
                                            n = R$id.hint_no_internet;
                                            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                            if (linearLayout2 != null) {
                                                n = R$id.iv_done;
                                                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                                if (imageView != null) {
                                                    n = R$id.name_reader;
                                                    final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                    if (linearLayout3 != null) {
                                                        n = R$id.rv;
                                                        final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                                        if (recyclerView != null) {
                                                            n = R$id.spinner_reciters;
                                                            final Spinner spinner3 = (Spinner)ViewBindings.findChildViewById(view, n);
                                                            if (spinner3 != null) {
                                                                n = R$id.spinner_translation;
                                                                final Spinner spinner4 = (Spinner)ViewBindings.findChildViewById(view, n);
                                                                if (spinner4 != null) {
                                                                    n = R$id.sura_name;
                                                                    final Spinner spinner5 = (Spinner)ViewBindings.findChildViewById(view, n);
                                                                    if (spinner5 != null) {
                                                                        n = R$id.tv_add_bismilah;
                                                                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                        if (textCustumFont != null) {
                                                                            n = R$id.tv_end_ayah;
                                                                            final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                            if (textCustumFont2 != null) {
                                                                                n = R$id.tv_hint_reader;
                                                                                final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                if (textCustumFont3 != null) {
                                                                                    n = R$id.tv_icon;
                                                                                    final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                    if (textCustumFont4 != null) {
                                                                                        n = R$id.tv_number;
                                                                                        final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                        if (textCustumFont5 != null) {
                                                                                            n = R$id.tv_or;
                                                                                            final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                            if (textCustumFont6 != null) {
                                                                                                n = R$id.tv_reader;
                                                                                                final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont7 != null) {
                                                                                                    n = R$id.tv_surah;
                                                                                                    final TextCustumFont textCustumFont8 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                    if (textCustumFont8 != null) {
                                                                                                        n = R$id.tv_translation;
                                                                                                        final TextCustumFont textCustumFont9 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                        if (textCustumFont9 != null) {
                                                                                                            n = R$id.v;
                                                                                                            final View childViewById = ViewBindings.findChildViewById(view, n);
                                                                                                            if (childViewById != null) {
                                                                                                                n = R$id.view_aya;
                                                                                                                final LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    n = R$id.view_surah;
                                                                                                                    final View childViewById2 = ViewBindings.findChildViewById(view, n);
                                                                                                                    if (childViewById2 != null) {
                                                                                                                        n = R$id.view_tolbar;
                                                                                                                        final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                                                                                                        if (relativeLayout != null) {
                                                                                                                            return new FragmentAddQuranBinding((RelativeLayout)view, linearLayout, spinner, spinner2, imageButton, buttonCustumFont, imageButton2, buttonCustumFont2, checkboxCustumFont, frameLayout, linearLayout2, imageView, linearLayout3, recyclerView, spinner3, spinner4, spinner5, textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, textCustumFont8, textCustumFont9, childViewById, linearLayout4, childViewById2, relativeLayout);
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
    
    public static FragmentAddQuranBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentAddQuranBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_add_quran, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
