// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.ArrayList;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import hazem.nurmontage.videoquran.R$string;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.model.IpadItem;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.R$layout;
import com.google.android.material.tabs.TabLayout$Tab;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.adabter.IpadAdabter;
import hazem.nurmontage.videoquran.databinding.FragmentEditIpadBinding;
import androidx.fragment.app.Fragment;

public class EditIpadFragment extends Fragment
{
    public static EditIpadFragment instance;
    private FragmentEditIpadBinding fragmentBinding;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private int index_select;
    private IpadAdabter ipadAdabter;
    private int ipadType;
    private boolean isGlass;
    private boolean isGradient;
    private int mCurrentPosFragment;
    private Resources resources;
    private RecyclerView rv_type;
    
    public EditIpadFragment() {
        this.mCurrentPosFragment = 0;
    }
    
    public EditIpadFragment(final Resources resources, final int ipadType, final EditIpadFragment$IIpadEditCallback iIpadEditCallback, final int index_select, final boolean isGradient, final boolean isGlass) {
        this.mCurrentPosFragment = 0;
        this.iIpadEditCallback = iIpadEditCallback;
        this.ipadType = ipadType;
        this.isGlass = isGlass;
        this.resources = resources;
        this.index_select = index_select;
        this.isGradient = isGradient;
    }
    
    private void addCustomViewToTab(final TabLayout$Tab tabLayout$Tab) {
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final int layout_tablayout = R$layout.layout_tablayout;
        final ViewGroup viewGroup = null;
        final View inflate = layoutInflater.inflate(layout_tablayout, (ViewGroup)null);
        ((TextCustumFont)inflate.findViewById(R$id.name)).setText((CharSequence)tabLayout$Tab.getText().toString());
        tabLayout$Tab.setCustomView(inflate);
    }
    
    private Fragment getFragment(final int n) {
        if (n == 1) {
            return GradientFragment.getInstance(this.iIpadEditCallback, this.index_select);
        }
        return ColorsFragment.getInstance(this.iIpadEditCallback, this.index_select);
    }
    
    public static EditIpadFragment getInstance(final Resources resources, final int n, final EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, final int n2, final boolean b, final boolean b2) {
        if (EditIpadFragment.instance == null) {
            EditIpadFragment.instance = new EditIpadFragment(resources, n, editIpadFragment$IIpadEditCallback, n2, b, b2);
        }
        return EditIpadFragment.instance;
    }
    
    private int getPosSelect(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            if (((IpadItem)list.get(i)).getIpadType().ordinal() == n) {
                return i;
            }
        }
        return 0;
    }
    
    private void initTab(final View view) {
        final TabLayout tabLayout = (TabLayout)view.findViewById(R$id.tab_layout);
        final TabLayout$Tab tab = tabLayout.newTab();
        tab.setText((CharSequence)this.resources.getString(R$string.color));
        this.addCustomViewToTab(tab);
        final TabLayout$Tab tab2 = tabLayout.newTab();
        tab2.setText((CharSequence)this.resources.getString(R$string.gradient));
        this.addCustomViewToTab(tab2);
        final boolean isGradient = this.isGradient;
        final boolean b = true;
        if (isGradient) {
            tabLayout.addTab(tab, false);
            tabLayout.addTab(tab2, b);
        }
        else {
            tabLayout.addTab(tab, b);
            tabLayout.addTab(tab2, false);
        }
        tabLayout.setTabMode(0);
        this.mCurrentPosFragment = (this.isGradient ? 1 : 0);
        tabLayout.addOnTabSelectedListener((TabLayout$OnTabSelectedListener)new EditIpadFragment$2(this));
        this.getChildFragmentManager().beginTransaction().replace(R$id.container, this.getFragment(this.mCurrentPosFragment)).addToBackStack((String)null).commit();
        this.index_select = -1;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(LayoutInflater root, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEditIpadBinding inflate = FragmentEditIpadBinding.inflate(root, viewGroup, false);
        this.fragmentBinding = inflate;
        root = (LayoutInflater)inflate.getRoot();
        this.rv_type = (RecyclerView)((View)root).findViewById(R$id.rv_type);
        final ArrayList list = new ArrayList();
        list.add(new IpadItem(R$drawable.ipad_t, IpadType.IPAD));
        list.add(new IpadItem(R$drawable.ipad_unblur, IpadType.IPAD_UNBLUR));
        list.add(new IpadItem(R$drawable.ipad_classic, IpadType.IPAD_CLASSIC));
        list.add(new IpadItem(R$drawable.ipad_neomorphic, IpadType.IPAD_NEOMORPHIC));
        list.add(new IpadItem(R$drawable.ipad_caset, IpadType.CASSET));
        list.add(new IpadItem(R$drawable.ipad_caset_img, IpadType.CASSET_IMG));
        list.add(new IpadItem(R$drawable.ipad_caset_img_blur, IpadType.CASSET_IMG_BLUR));
        list.add(new IpadItem(R$drawable.ipad_rect, IpadType.RECT));
        list.add(new IpadItem(R$drawable.ipad_rect_round, IpadType.ROUND_RECT));
        list.add(new IpadItem(R$drawable.ipad_bottom_rect, IpadType.BOTTOM_RECT));
        list.add(new IpadItem(R$drawable.ipad_layer_black, IpadType.BLACK_LAYER));
        list.add(new IpadItem(R$drawable.ipad_gradient, IpadType.GRADIENT));
        list.add(new IpadItem(R$drawable.ipad_mask, IpadType.MASK_BRUSH));
        list.add(new IpadItem(R$drawable.ipad_blue_type, IpadType.BLUE_TYPE));
        list.add(new IpadItem(R$drawable.ic_heart_ipad, IpadType.HEART));
        list.add(new IpadItem(R$drawable.ic_battery, IpadType.BATTERY));
        final int posSelect = this.getPosSelect(this.ipadType, list);
        this.ipadAdabter = new IpadAdabter(BillingPreferences.isSubscribed(this.getContext()), posSelect, this.ipadType, this.iIpadEditCallback, list, this.isGlass);
        this.rv_type.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
        this.rv_type.setHasFixedSize(true);
        this.rv_type.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.rv_type.setAdapter((RecyclerView$Adapter)this.ipadAdabter);
        final int n = 3;
        if (posSelect > n) {
            try {
                this.rv_type.scrollToPosition(posSelect - n);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new EditIpadFragment$1(this));
        this.initTab((View)root);
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        EditIpadFragment.instance = null;
        this.fragmentBinding = null;
        this.iIpadEditCallback = null;
    }
    
    public void scrollToSelectedPosition() {
        try {
            final RecyclerView rv_type = this.rv_type;
            try {
                final RecyclerView$LayoutManager layoutManager = rv_type.getLayoutManager();
                try {
                    final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    final IpadAdabter ipadAdabter = this.ipadAdabter;
                    try {
                        final int pos_select = ipadAdabter.getPos_select();
                        try {
                            final RecyclerView rv_type2 = this.rv_type;
                            try {
                                linearLayoutManager.scrollToPositionWithOffset(pos_select, rv_type2.getWidth() / 2 - 50);
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
