/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.databinding.FragmentColorAyaBinding;
import hazem.nurmontage.videoquran.fragment.ColorBismilahFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.ColorBismilahFragment$1;
import hazem.nurmontage.videoquran.fragment.ColorBismilahFragment$2;
import hazem.nurmontage.videoquran.fragment.EditBismilahEntityFragment$IBismilahEntityCallback;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class ColorBismilahFragment
extends Fragment {
    public static ColorBismilahFragment instance;
    private ColorAdabter adapter;
    private FragmentColorAyaBinding binding;
    private BismilahEntity entity_select;
    private ColorAdabter$IColor iColor;
    private EditBismilahEntityFragment$IBismilahEntityCallback iEditSName;
    private RecyclerView recyclerView;
    private Resources resources;

    static /* bridge */ /* synthetic */ BismilahEntity cfr_renamed_177(ColorBismilahFragment colorBismilahFragment) {
        return colorBismilahFragment.entity_select;
    }

    static /* bridge */ /* synthetic */ EditBismilahEntityFragment$IBismilahEntityCallback cfr_renamed_176(ColorBismilahFragment colorBismilahFragment) {
        return colorBismilahFragment.iEditSName;
    }

    public ColorBismilahFragment() {
        ColorBismilahFragment$2 colorBismilahFragment$2 = new ColorBismilahFragment$2(this);
        this.iColor = colorBismilahFragment$2;
    }

    public ColorBismilahFragment(EditBismilahEntityFragment$IBismilahEntityCallback editBismilahEntityFragment$IBismilahEntityCallback, BismilahEntity bismilahEntity, Resources resources) {
        ColorBismilahFragment$2 colorBismilahFragment$2 = new ColorBismilahFragment$2(this);
        this.iColor = colorBismilahFragment$2;
        this.iEditSName = editBismilahEntityFragment$IBismilahEntityCallback;
        this.entity_select = bismilahEntity;
        this.resources = resources;
    }

    public static ColorBismilahFragment getInstance(EditBismilahEntityFragment$IBismilahEntityCallback editBismilahEntityFragment$IBismilahEntityCallback, BismilahEntity bismilahEntity, Resources resources) {
        ColorBismilahFragment colorBismilahFragment = instance;
        if (colorBismilahFragment == null) {
            instance = colorBismilahFragment = new ColorBismilahFragment(editBismilahEntityFragment$IBismilahEntityCallback, bismilahEntity, resources);
        }
        return instance;
    }

    private void initTab(View view) {
        int n = R$id.tab_layout;
        view.findViewById(n).setVisibility(8);
    }

    private void selectPreset(TextView[] textViewArray, int n) {
        int n2;
        for (int i = 0; i < (n2 = textViewArray.length); ++i) {
            TextView textView = textViewArray[i];
            boolean bl = i == n;
            textView.setSelected(bl);
        }
    }

    private void setupPresetButtons(View ayaTextPresetArray) {
        AyaTextPreset ayaTextPreset;
        int n = R$id.btnNone;
        Object object = (TextCustumFont)ayaTextPresetArray.findViewById(n);
        int n2 = R$id.btnOutline;
        TextCustumFont textCustumFont = (TextCustumFont)ayaTextPresetArray.findViewById(n2);
        int n3 = R$id.btnShadow;
        TextCustumFont textCustumFont2 = (TextCustumFont)ayaTextPresetArray.findViewById(n3);
        int n4 = R$id.btnGlow;
        ayaTextPresetArray = (TextCustumFont)ayaTextPresetArray.findViewById(n4);
        Object object2 = this.resources;
        int n5 = R$string.preset_none;
        object2 = object2.getString(n5);
        object.setText((CharSequence)object2);
        object2 = this.resources;
        n5 = R$string.preset_outline;
        object2 = object2.getString(n5);
        textCustumFont.setText((CharSequence)object2);
        object2 = this.resources;
        n5 = R$string.preset_shadow;
        object2 = object2.getString(n5);
        textCustumFont2.setText((CharSequence)object2);
        object2 = this.resources;
        n5 = R$string.preset_glow;
        object2 = object2.getString(n5);
        ayaTextPresetArray.setText((CharSequence)object2);
        n4 = 4;
        TextView[] textViewArray = new TextView[n4];
        int n6 = 0;
        textViewArray[0] = object;
        n = 1;
        textViewArray[n] = textCustumFont;
        n2 = 2;
        textViewArray[n2] = textCustumFont2;
        n3 = 3;
        textViewArray[n3] = ayaTextPresetArray;
        ayaTextPresetArray = new AyaTextPreset[n4];
        ayaTextPresetArray[0] = ayaTextPreset = AyaTextPreset.NONE;
        ayaTextPresetArray[n] = ayaTextPreset = AyaTextPreset.OUTLINE;
        ayaTextPresetArray[n2] = ayaTextPreset = AyaTextPreset.SHADOW;
        ayaTextPresetArray[n3] = ayaTextPreset = AyaTextPreset.GLOW;
        ayaTextPreset = null;
        for (int i = 0; i < n4; ++i) {
            TextView textView = textViewArray[i];
            ColorBismilahFragment$$ExternalSyntheticLambda0 colorBismilahFragment$$ExternalSyntheticLambda0 = new ColorBismilahFragment$$ExternalSyntheticLambda0(this, textViewArray, i, ayaTextPresetArray);
            textView.setOnClickListener((View.OnClickListener)colorBismilahFragment$$ExternalSyntheticLambda0);
        }
        ayaTextPresetArray = this.entity_select;
        n4 = ayaTextPresetArray.getmPreset();
        if ((ayaTextPresetArray = ayaTextPresetArray.get(n4)) != (object2 = AyaTextPreset.NONE)) {
            object2 = AyaTextPreset.OUTLINE;
            n6 = ayaTextPresetArray == object2 ? n : (ayaTextPresetArray == (object = AyaTextPreset.SHADOW) ? n2 : n3);
        }
        this.selectPreset(textViewArray, n6);
    }

    /* synthetic */ void cfr_renamed_159(TextView[] object, int n, AyaTextPreset[] ayaTextPresetArray, View view) {
        this.selectPreset((TextView[])object, n);
        object = this.iEditSName;
        if (object != null) {
            AyaTextPreset ayaTextPreset = ayaTextPresetArray[n];
            object.updatePreset(ayaTextPreset);
        }
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        object3 = null;
        object = FragmentColorAyaBinding.inflate((LayoutInflater)object, (ViewGroup)object2, false);
        this.binding = object;
        object = ((FragmentColorAyaBinding)object).getRoot();
        object2 = this.iEditSName;
        if (object2 != null && (object2 = this.entity_select) != null && (object2 = this.resources) != null) {
            int n2 = R$id.rv_color;
            object2 = (RecyclerView)object.findViewById(n2);
            this.recyclerView = object2;
            ColorAdabter$IColor colorAdabter$IColor = this.iColor;
            Object object4 = Common.MUSLIM_AYA_COLORS;
            int[] nArray = Common.MUSLIM_AYA_COLORS;
            BismilahEntity bismilahEntity = this.entity_select;
            int n3 = bismilahEntity.getClrAya();
            int n4 = Utils.indexOf(nArray, n3);
            object2 = new ColorAdabter(colorAdabter$IColor, (int[])object4, n4);
            this.adapter = object2;
            object2 = this.recyclerView;
            object4 = this.getContext();
            colorAdabter$IColor = new LinearLayoutManager((Context)object4, 0, false);
            object2.setLayoutManager((RecyclerView.LayoutManager)colorAdabter$IColor);
            this.recyclerView.setItemAnimator(null);
            this.recyclerView.setHasFixedSize(true);
            object2 = this.recyclerView;
            object3 = this.adapter;
            object2.setAdapter((RecyclerView.Adapter)object3);
            object2 = this.adapter;
            n2 = ((ColorAdabter)((Object)object2)).getPos_select();
            n = 2;
            if (n2 > n) {
                object2 = this.adapter;
                n2 = ((ColorAdabter)((Object)object2)).getPos_select() - n;
                this.scrollToSelectedPosition(n2);
            }
            this.initTab((View)object);
            this.setupPresetButtons((View)object);
            n2 = R$id.btn_done;
            object2 = object.findViewById(n2);
            object3 = new ColorBismilahFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        this.binding = null;
        instance = null;
        this.iColor = null;
        super.onDestroyView();
    }

    public void scrollToSelectedPosition() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            ColorAdabter colorAdabter = this.adapter;
            int n = colorAdabter.getPos_select();
            RecyclerView recyclerView = this.recyclerView;
            int n2 = recyclerView.getWidth() / 2 + -50;
            linearLayoutManager.scrollToPositionWithOffset(n, n2);
        }
    }

    public void scrollToSelectedPosition(int n) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            RecyclerView recyclerView = this.recyclerView;
            int n2 = recyclerView.getWidth() / 2;
            linearLayoutManager.scrollToPositionWithOffset(n, n2);
        }
    }
}

