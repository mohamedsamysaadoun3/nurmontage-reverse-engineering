// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.databinding.FragmentColorsBinding;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import androidx.fragment.app.Fragment;

public class ColorsFragment extends Fragment
{
    public static ColorsFragment instance;
    private ColorAdabter adapter;
    private FragmentColorsBinding binding;
    private ColorAdabter$IColor iColor;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private int index;
    private RecyclerView recyclerView;
    
    public ColorsFragment(final EditIpadFragment$IIpadEditCallback iIpadEditCallback, final int index) {
        this.iColor = new ColorsFragment$1(this);
        this.iIpadEditCallback = iIpadEditCallback;
        this.index = index;
    }
    
    public static ColorsFragment getInstance(final EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, final int n) {
        if (ColorsFragment.instance == null) {
            ColorsFragment.instance = new ColorsFragment(editIpadFragment$IIpadEditCallback, n);
        }
        return ColorsFragment.instance;
    }
    
    public View onCreateView(LayoutInflater root, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentColorsBinding inflate = FragmentColorsBinding.inflate(root, viewGroup, false);
        this.binding = inflate;
        root = (LayoutInflater)inflate.getRoot();
        this.recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv_color);
        this.adapter = new ColorAdabter(this.iColor, Common.MUSLIM_COLORS, this.index);
        this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setAdapter((RecyclerView$Adapter)this.adapter);
        try {
            final int index = this.index;
            final int n = 3;
            if (index > n) {
                this.recyclerView.scrollToPosition(index - n);
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        ColorsFragment.instance = null;
        this.binding = null;
        this.iColor = null;
    }
    
    public void scrollToSelectedPosition() {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.adapter.getPos_select(), this.recyclerView.getWidth() / 2 - 50);
        }
    }
}
