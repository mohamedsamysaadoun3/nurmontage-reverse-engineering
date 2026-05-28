/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.common.DataDimension;
import hazem.nurmontage.videoquran.databinding.FragmentResizeBinding;
import hazem.nurmontage.videoquran.fragment.ResizeFragment$1;
import hazem.nurmontage.videoquran.model.ItemDimension;
import java.util.ArrayList;
import java.util.List;

public class ResizeFragment
extends Fragment {
    public static ResizeFragment instance;
    private DimensionAdabters adabter;
    private FragmentResizeBinding binding;
    private DimensionAdabters$IDimensionCallback iDimensionCallback;
    private int posSelectResize = -1;
    private RecyclerView recyclerView;
    private Resources res;
    private String selectResize;

    static /* bridge */ /* synthetic */ DimensionAdabters$IDimensionCallback cfr_renamed_201(ResizeFragment resizeFragment) {
        return resizeFragment.iDimensionCallback;
    }

    public ResizeFragment() {
    }

    public ResizeFragment(DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback, Resources resources, String string2) {
        this.iDimensionCallback = dimensionAdabters$IDimensionCallback;
        this.selectResize = string2;
        this.res = resources;
    }

    public static ResizeFragment getInstance(DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback, Resources resources, String string2) {
        ResizeFragment resizeFragment = instance;
        if (resizeFragment == null) {
            instance = resizeFragment = new ResizeFragment(dimensionAdabters$IDimensionCallback, resources, string2);
        }
        return instance;
    }

    public List getListDimension(Activity activity, List list) {
        int n;
        float f = ScreenUtils.getScreenWidth(activity);
        float f2 = 0.27f;
        int n2 = (int)(f *= f2);
        ArrayList<ItemDimension> arrayList = new ArrayList<ItemDimension>();
        for (int i = 0; i < (n = list.size()); ++i) {
            String string2;
            ItemDimension itemDimension = (ItemDimension)list.get(i);
            String string3 = itemDimension.getId();
            boolean bl = string3.equals(string2 = this.selectResize);
            if (bl) {
                this.posSelectResize = i;
            }
            itemDimension = Utils.getDimension(itemDimension.getResizeType(), n2);
            arrayList.add(itemDimension);
        }
        return arrayList;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentResizeBinding.inflate((LayoutInflater)object, object2, false);
        this.binding = object;
        object = ((FragmentResizeBinding)object).getRoot();
        object2 = this.res;
        if (object2 != null && (object2 = this.iDimensionCallback) != null) {
            int n = R$id.btn_done;
            object2 = object.findViewById(n);
            ResizeFragment$1 resizeFragment$1 = new ResizeFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)resizeFragment$1);
            n = R$id.rv;
            object2 = (RecyclerView)object.findViewById(n);
            this.recyclerView = object2;
            int n2 = 1;
            object2.setHasFixedSize(n2 != 0);
            object2 = this.recyclerView;
            Object object4 = this.getActivity();
            Object object5 = new LinearLayoutManager((Context)object4, 0, false);
            object2.setLayoutManager((RecyclerView.LayoutManager)object5);
            this.recyclerView.setItemAnimator(null);
            object2 = DataDimension.getALl(this.res);
            object5 = this.iDimensionCallback;
            object4 = this.getActivity();
            object4 = this.getListDimension((Activity)object4, (List)object2);
            int n3 = this.posSelectResize;
            object3 = new DimensionAdabters((List)object2, (DimensionAdabters$IDimensionCallback)object5, (List)object4, n3);
            this.adabter = object3;
            object2 = this.recyclerView;
            object2.setAdapter((RecyclerView.Adapter)object3);
            n = this.posSelectResize;
            if (n > 0) {
                object3 = this.recyclerView;
                object3.scrollToPosition(n -= n2);
            } else {
                object3 = this.recyclerView;
                object3.scrollToPosition(n);
            }
        }
        return object;
    }

    public void onDestroyView() {
        this.iDimensionCallback = null;
        instance = null;
        FragmentResizeBinding fragmentResizeBinding = this.binding;
        if (fragmentResizeBinding != null) {
            fragmentResizeBinding = fragmentResizeBinding.getRoot();
            fragmentResizeBinding.removeAllViews();
            this.binding = null;
        }
        super.onDestroyView();
    }

    public void scrollToSelectedPosition() {
        block10: {
            RecyclerView recyclerView = this.recyclerView;
            recyclerView = recyclerView.getLayoutManager();
            recyclerView = (LinearLayoutManager)recyclerView;
            if (recyclerView == null) break block10;
            DimensionAdabters dimensionAdabters = this.adabter;
            int n = dimensionAdabters.getSelected();
            RecyclerView recyclerView2 = this.recyclerView;
            int n2 = recyclerView2.getWidth();
            n2 = n2 / 2 + -50;
            try {
                recyclerView.scrollToPositionWithOffset(n, n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

