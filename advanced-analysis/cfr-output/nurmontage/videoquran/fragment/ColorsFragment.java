/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.databinding.FragmentColorsBinding;
import hazem.nurmontage.videoquran.fragment.ColorsFragment$1;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;

public class ColorsFragment
extends Fragment {
    public static ColorsFragment instance;
    private ColorAdabter adapter;
    private FragmentColorsBinding binding;
    private ColorAdabter$IColor iColor;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private int index;
    private RecyclerView recyclerView;

    static /* bridge */ /* synthetic */ EditIpadFragment$IIpadEditCallback cfr_renamed_172(ColorsFragment colorsFragment) {
        return colorsFragment.iIpadEditCallback;
    }

    public ColorsFragment(EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n) {
        ColorsFragment$1 colorsFragment$1 = new ColorsFragment$1(this);
        this.iColor = colorsFragment$1;
        this.iIpadEditCallback = editIpadFragment$IIpadEditCallback;
        this.index = n;
    }

    public static ColorsFragment getInstance(EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n) {
        ColorsFragment colorsFragment = instance;
        if (colorsFragment == null) {
            instance = colorsFragment = new ColorsFragment(editIpadFragment$IIpadEditCallback, n);
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        block4: {
            object = FragmentColorsBinding.inflate((LayoutInflater)object, object2, false);
            this.binding = object;
            object = ((FragmentColorsBinding)object).getRoot();
            int n = R$id.rv_color;
            object2 = (RecyclerView)object.findViewById(n);
            this.recyclerView = object2;
            ColorAdabter$IColor colorAdabter$IColor = this.iColor;
            Object object4 = Common.MUSLIM_COLORS;
            int n2 = this.index;
            object2 = new ColorAdabter(colorAdabter$IColor, (int[])object4, n2);
            this.adapter = object2;
            object2 = this.recyclerView;
            object4 = this.getContext();
            colorAdabter$IColor = new LinearLayoutManager((Context)object4, 0, false);
            object2.setLayoutManager((RecyclerView.LayoutManager)colorAdabter$IColor);
            this.recyclerView.setItemAnimator(null);
            object2 = this.recyclerView;
            int n3 = 1;
            object2.setHasFixedSize(n3 != 0);
            object2 = this.recyclerView;
            object3 = this.adapter;
            object2.setAdapter((RecyclerView.Adapter)object3);
            n = this.index;
            n3 = 3;
            if (n <= n3) break block4;
            colorAdabter$IColor = this.recyclerView;
            n -= n3;
            try {
                colorAdabter$IColor.scrollToPosition(n);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        instance = null;
        this.binding = null;
        this.iColor = null;
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
}

