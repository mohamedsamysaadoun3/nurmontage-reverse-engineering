// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar$OnSeekBarChangeListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$IColor;
import hazem.nurmontage.videoquran.model.Gradient;
import hazem.nurmontage.videoquran.databinding.FragmentColorsBinding;
import hazem.nurmontage.videoquran.adabter.GradientAdabter;
import androidx.fragment.app.Fragment;

public class GradientFragment extends Fragment
{
    public static GradientFragment instance;
    private GradientAdabter adapter;
    private FragmentColorsBinding binding;
    private Gradient gradient;
    private GradientAdabter$IColor iColor;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private int index;
    private RecyclerView recyclerView;
    private SeekBar seekBar_angle;
    private TextCustumFont tv_angle;
    
    public GradientFragment(final EditIpadFragment$IIpadEditCallback iIpadEditCallback, final int index) {
        this.iColor = new GradientFragment$2(this);
        this.iIpadEditCallback = iIpadEditCallback;
        this.index = index;
    }
    
    public static GradientFragment getInstance(final EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, final int n) {
        if (GradientFragment.instance == null) {
            GradientFragment.instance = new GradientFragment(editIpadFragment$IIpadEditCallback, n);
        }
        return GradientFragment.instance;
    }
    
    public View onCreateView(LayoutInflater root, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentColorsBinding inflate = FragmentColorsBinding.inflate(root, viewGroup, false);
        this.binding = inflate;
        root = (LayoutInflater)inflate.getRoot();
        this.recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv_color);
        this.adapter = new GradientAdabter(this.iColor, Common.getListGradientColor(), BillingPreferences.isSubscribed(this.getContext()), this.index);
        this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setAdapter((RecyclerView$Adapter)this.adapter);
        this.gradient = this.adapter.getSelect();
        this.tv_angle = (TextCustumFont)((View)root).findViewById(R$id.tv_angle);
        this.seekBar_angle = (SeekBar)((View)root).findViewById(R$id.seekbar);
        if (this.gradient != null) {
            ((View)root).findViewById(R$id.layout_edit_gradient).setVisibility(0);
            this.seekBar_angle.setProgress(this.gradient.getAngle());
        }
        this.tv_angle.setText((CharSequence)String.valueOf(this.seekBar_angle.getProgress()));
        this.seekBar_angle.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new GradientFragment$1(this));
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
        GradientFragment.instance = null;
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
