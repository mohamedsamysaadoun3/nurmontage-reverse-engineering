// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$OnScrollListener;
import androidx.recyclerview.widget.SnapHelper;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.databinding.FragmentFontBinding;
import androidx.fragment.app.Fragment;

public class FontFragment extends Fragment
{
    public static FontFragment instance;
    private String font_select;
    private FragmentFontBinding fragmentBinding;
    private FontFragment$IFontCallback iFontCallback;
    private boolean isInit;
    private Typeface lastTypeface;
    private String last_font;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;
    private Typeface typeface;
    
    public FontFragment() {
        this.isInit = true;
    }
    
    public FontFragment(final FontFragment$IFontCallback iFontCallback, final String last_font, final Typeface lastTypeface) {
        this.isInit = true;
        this.iFontCallback = iFontCallback;
        this.last_font = last_font;
        this.lastTypeface = lastTypeface;
    }
    
    public static FontFragment getInstance(final FontFragment$IFontCallback fontFragment$IFontCallback, final String s, final Typeface typeface) {
        if (FontFragment.instance == null) {
            FontFragment.instance = new FontFragment(fontFragment$IFontCallback, s, typeface);
        }
        return FontFragment.instance;
    }
    
    public void add(final Typeface typeface, final String font_select) {
        this.typeface = typeface;
        this.font_select = font_select;
    }
    
    public View onCreateView(LayoutInflater root, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentFontBinding inflate = FragmentFontBinding.inflate(root, viewGroup, false);
        this.fragmentBinding = inflate;
        root = (LayoutInflater)inflate.getRoot();
        try {
            try {
                final FontProvider fontProvider = new FontProvider(this.getResources());
                final View viewById = ((View)root).findViewById(R$id.rv);
                try {
                    this.recyclerView = (RecyclerView)viewById;
                    final List fontNamesQuran = fontProvider.getFontNamesQuran();
                    try {
                        final String last_font = this.last_font;
                        try {
                            final int index = fontNamesQuran.indexOf(last_font.substring(0, last_font.length() - 4));
                            try {
                                try {
                                    final FontFragment$IFontCallback iFontCallback = this.iFontCallback;
                                    try {
                                        final FontTextAdabters adapter = new FontTextAdabters(fontProvider, iFontCallback, fontProvider.getFontNamesQuran(), index);
                                        try {
                                            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
                                            try {
                                                this.linearLayoutManager = linearLayoutManager;
                                                this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)linearLayoutManager);
                                                final RecyclerView recyclerView = this.recyclerView;
                                                final int hasFixedSize = 1;
                                                recyclerView.setHasFixedSize((boolean)(hasFixedSize != 0));
                                                this.recyclerView.setAdapter((RecyclerView$Adapter)adapter);
                                                try {
                                                    final LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
                                                    ((SnapHelper)linearSnapHelper).attachToRecyclerView(this.recyclerView);
                                                    final RecyclerView recyclerView2 = this.recyclerView;
                                                    try {
                                                        final FontFragment$1 fontFragment$1 = new FontFragment$1(this, (SnapHelper)linearSnapHelper, adapter);
                                                        final RecyclerView recyclerView3 = recyclerView2;
                                                        try {
                                                            recyclerView3.addOnScrollListener((RecyclerView$OnScrollListener)fontFragment$1);
                                                            if (index > hasFixedSize) {
                                                                this.recyclerView.scrollToPosition(index - hasFixedSize);
                                                            }
                                                            else if (index >= 0) {
                                                                this.recyclerView.scrollToPosition(index);
                                                            }
                                                            final View viewById2 = ((View)root).findViewById(R$id.btn_done);
                                                            try {
                                                                final FontFragment$2 onClickListener = new FontFragment$2(this);
                                                                final View view = viewById2;
                                                                try {
                                                                    view.setOnClickListener((View$OnClickListener)onClickListener);
                                                                    final View viewById3 = ((View)root).findViewById(R$id.btn_cancel);
                                                                    try {
                                                                        final FontFragment$3 onClickListener2 = new FontFragment$3(this);
                                                                        final View view2 = viewById3;
                                                                        try {
                                                                            view2.setOnClickListener((View$OnClickListener)onClickListener2);
                                                                            return (View)root;
                                                                        }
                                                                        catch (final Exception ex) {}
                                                                    }
                                                                    catch (final Exception ex2) {}
                                                                }
                                                                catch (final Exception ex3) {}
                                                            }
                                                            catch (final Exception ex4) {}
                                                        }
                                                        catch (final Exception ex5) {}
                                                    }
                                                    catch (final Exception ex6) {}
                                                }
                                                catch (final Exception ex7) {}
                                            }
                                            catch (final Exception ex8) {}
                                        }
                                        catch (final Exception ex9) {}
                                    }
                                    catch (final Exception ex10) {}
                                }
                                catch (final Exception ex11) {}
                            }
                            catch (final Exception ex12) {}
                        }
                        catch (final Exception ex13) {}
                    }
                    catch (final Exception ex14) {}
                }
                catch (final Exception ex15) {}
            }
            catch (final Exception ex16) {}
        }
        catch (final Exception ex17) {}
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.fragmentBinding = null;
        this.iFontCallback = null;
        FontFragment.instance = null;
    }
}
