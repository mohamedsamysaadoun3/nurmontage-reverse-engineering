// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.common.DataDimension;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.model.ItemDimension;
import android.util.Pair;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import java.util.List;
import android.app.Activity;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.databinding.FragmentResizeBinding;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters;
import androidx.fragment.app.Fragment;

public class ResizeFragment extends Fragment
{
    public static ResizeFragment instance;
    private DimensionAdabters adabter;
    private FragmentResizeBinding binding;
    private DimensionAdabters$IDimensionCallback iDimensionCallback;
    private int posSelectResize;
    private RecyclerView recyclerView;
    private Resources res;
    private String selectResize;
    
    public ResizeFragment() {
        this.posSelectResize = -1;
    }
    
    public ResizeFragment(final DimensionAdabters$IDimensionCallback iDimensionCallback, final Resources res, final String selectResize) {
        this.posSelectResize = -1;
        this.iDimensionCallback = iDimensionCallback;
        this.selectResize = selectResize;
        this.res = res;
    }
    
    public static ResizeFragment getInstance(final DimensionAdabters$IDimensionCallback dimensionAdabters$IDimensionCallback, final Resources resources, final String s) {
        if (ResizeFragment.instance == null) {
            ResizeFragment.instance = new ResizeFragment(dimensionAdabters$IDimensionCallback, resources, s);
        }
        return ResizeFragment.instance;
    }
    
    public List getListDimension(final Activity activity, final List list) {
        final int n = (int)(ScreenUtils.getScreenWidth(activity) * 0.27f);
        final ArrayList<Pair> list2 = new ArrayList<Pair>();
        for (int i = 0; i < list.size(); ++i) {
            final ItemDimension itemDimension = list.get(i);
            if (itemDimension.getId().equals(this.selectResize)) {
                this.posSelectResize = i;
            }
            list2.add(Utils.getDimension(itemDimension.getResizeType(), n));
        }
        return list2;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentResizeBinding inflate = FragmentResizeBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final RelativeLayout root = inflate.getRoot();
        if (this.res != null && this.iDimensionCallback != null) {
            ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ResizeFragment$1(this));
            final RecyclerView recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv);
            this.recyclerView = recyclerView;
            final int hasFixedSize = 1;
            recyclerView.setHasFixedSize((boolean)(hasFixedSize != 0));
            this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this.getActivity(), 0, false));
            this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
            final List aLl = DataDimension.getALl(this.res);
            final DimensionAdabters dimensionAdabters = new DimensionAdabters(aLl, this.iDimensionCallback, this.getListDimension((Activity)this.getActivity(), aLl), this.posSelectResize);
            this.adabter = dimensionAdabters;
            this.recyclerView.setAdapter((RecyclerView$Adapter)dimensionAdabters);
            final int posSelectResize = this.posSelectResize;
            if (posSelectResize > 0) {
                this.recyclerView.scrollToPosition(posSelectResize - hasFixedSize);
            }
            else {
                this.recyclerView.scrollToPosition(posSelectResize);
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.iDimensionCallback = null;
        ResizeFragment.instance = null;
        final FragmentResizeBinding binding = this.binding;
        if (binding != null) {
            binding.getRoot().removeAllViews();
            this.binding = null;
        }
        super.onDestroyView();
    }
    
    public void scrollToSelectedPosition() {
        try {
            final RecyclerView recyclerView = this.recyclerView;
            try {
                final RecyclerView$LayoutManager layoutManager = recyclerView.getLayoutManager();
                try {
                    final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    final DimensionAdabters adabter = this.adabter;
                    try {
                        final int selected = adabter.getSelected();
                        try {
                            final RecyclerView recyclerView2 = this.recyclerView;
                            try {
                                linearLayoutManager.scrollToPositionWithOffset(selected, recyclerView2.getWidth() / 2 - 50);
                            }
                            catch (final Exception ex) {
                                ex.printStackTrace();
                            }
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
}
