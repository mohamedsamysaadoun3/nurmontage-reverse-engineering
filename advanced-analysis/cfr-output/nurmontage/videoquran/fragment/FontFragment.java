/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.LinearSnapHelper
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.recyclerview.widget.SnapHelper
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters;
import hazem.nurmontage.videoquran.databinding.FragmentFontBinding;
import hazem.nurmontage.videoquran.fragment.FontFragment$1;
import hazem.nurmontage.videoquran.fragment.FontFragment$2;
import hazem.nurmontage.videoquran.fragment.FontFragment$3;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;

public class FontFragment
extends Fragment {
    public static FontFragment instance;
    private String font_select;
    private FragmentFontBinding fragmentBinding;
    private FontFragment$IFontCallback iFontCallback;
    private boolean isInit = true;
    private Typeface lastTypeface;
    private String last_font;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;
    private Typeface typeface;

    static /* bridge */ /* synthetic */ String cfr_renamed_205(FontFragment fontFragment) {
        return fontFragment.font_select;
    }

    static /* bridge */ /* synthetic */ FontFragment$IFontCallback cfr_renamed_156(FontFragment fontFragment) {
        return fontFragment.iFontCallback;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_250(FontFragment fontFragment) {
        return fontFragment.isInit;
    }

    static /* bridge */ /* synthetic */ Typeface cfr_renamed_158(FontFragment fontFragment) {
        return fontFragment.lastTypeface;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_157(FontFragment fontFragment) {
        return fontFragment.last_font;
    }

    static /* bridge */ /* synthetic */ LinearLayoutManager cfr_renamed_265(FontFragment fontFragment) {
        return fontFragment.linearLayoutManager;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_93(FontFragment fontFragment) {
        return fontFragment.recyclerView;
    }

    static /* bridge */ /* synthetic */ Typeface cfr_renamed_206(FontFragment fontFragment) {
        return fontFragment.typeface;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_263(FontFragment fontFragment, boolean bl) {
        fontFragment.isInit = bl;
    }

    public FontFragment() {
    }

    public FontFragment(FontFragment$IFontCallback fontFragment$IFontCallback, String string2, Typeface typeface) {
        this.iFontCallback = fontFragment$IFontCallback;
        this.last_font = string2;
        this.lastTypeface = typeface;
    }

    public static FontFragment getInstance(FontFragment$IFontCallback fontFragment$IFontCallback, String string2, Typeface typeface) {
        FontFragment fontFragment = instance;
        if (fontFragment == null) {
            instance = fontFragment = new FontFragment(fontFragment$IFontCallback, string2, typeface);
        }
        return instance;
    }

    public void add(Typeface typeface, String string2) {
        this.typeface = typeface;
        this.font_select = string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public View onCreateView(LayoutInflater var1_1, ViewGroup var2_2, Bundle var3_3) {
        block39: {
            var4_4 = 0;
            var3_3 /* !! */  = null;
            var1_1 = FragmentFontBinding.inflate((LayoutInflater)var1_1, (ViewGroup)var2_2, false);
            this.fragmentBinding = var1_1;
            var1_1 = var1_1.getRoot();
            try {
                var5_5 /* !! */  = this.getResources();
            }
            catch (Exception v0) {
                ** continue;
            }
            var2_2 = new FontProvider(var5_5 /* !! */ );
            var6_6 = R$id.rv;
            var5_5 /* !! */  = var1_1.findViewById(var6_6);
            var5_5 /* !! */  = (RecyclerView)var5_5 /* !! */ ;
            this.recyclerView = var5_5 /* !! */ ;
            var5_5 /* !! */  = var2_2.getFontNamesQuran();
            var7_7 = this.last_font;
            var8_8 = var7_7.length() + -4;
            var3_3 /* !! */  = var7_7.substring(0, var8_8);
            var4_4 = var5_5 /* !! */ .indexOf(var3_3 /* !! */ );
            var7_7 = this.iFontCallback;
            var9_9 = var2_2.getFontNamesQuran();
            var5_5 /* !! */  = new FontTextAdabters((FontProvider)var2_2, (FontFragment$IFontCallback)var7_7, var9_9, var4_4);
            var7_7 = this.getContext();
            var2_2 = new LinearLayoutManager((Context)var7_7);
            this.linearLayoutManager = var2_2;
            var7_7 = this.recyclerView;
            var7_7.setLayoutManager((RecyclerView.LayoutManager)var2_2);
            var2_2 = this.recyclerView;
            var10_10 = 1;
            var2_2.setHasFixedSize((boolean)var10_10);
            var2_2 = this.recyclerView;
            var2_2.setAdapter((RecyclerView.Adapter)var5_5 /* !! */ );
            var2_2 = new LinearSnapHelper();
            var9_9 = this.recyclerView;
            var2_2.attachToRecyclerView((RecyclerView)var9_9);
            var9_9 = this.recyclerView;
            var11_11 = new FontFragment$1(this, (SnapHelper)var2_2, (FontTextAdabters)var5_5 /* !! */ );
            var9_9.addOnScrollListener(var11_11);
            if (var4_4 <= var10_10) break block39;
            var2_2 = this.recyclerView;
            var4_4 -= var10_10;
            var2_2.scrollToPosition(var4_4);
            ** GOTO lbl73
        }
        if (var4_4 < 0) ** GOTO lbl73
        var2_2 = this.recyclerView;
        var2_2.scrollToPosition(var4_4);
lbl73:
        // 3 sources

        var12_12 = R$id.btn_done;
        var2_2 = var1_1.findViewById(var12_12);
        var3_3 /* !! */  = new FontFragment$2(this);
        var2_2.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
        var12_12 = R$id.btn_cancel;
        var2_2 = var1_1.findViewById(var12_12);
        var3_3 /* !! */  = new FontFragment$3(this);
        var2_2.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
lbl87:
        // 2 sources

        return var1_1;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.fragmentBinding = null;
        this.iFontCallback = null;
        instance = null;
    }
}

