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
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.google.android.material.tabs.TabLayout
 *  com.google.android.material.tabs.TabLayout$OnTabSelectedListener
 *  com.google.android.material.tabs.TabLayout$Tab
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.adabter.IpadAdabter;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.databinding.FragmentEditIpadBinding;
import hazem.nurmontage.videoquran.fragment.ColorsFragment;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$1;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$2;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.fragment.GradientFragment;
import hazem.nurmontage.videoquran.model.IpadItem;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;

public class EditIpadFragment
extends Fragment {
    public static EditIpadFragment instance;
    private FragmentEditIpadBinding fragmentBinding;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private int index_select;
    private IpadAdabter ipadAdabter;
    private int ipadType;
    private boolean isGlass;
    private boolean isGradient;
    private int mCurrentPosFragment = 0;
    private Resources resources;
    private RecyclerView rv_type;

    static /* bridge */ /* synthetic */ EditIpadFragment$IIpadEditCallback cfr_renamed_172(EditIpadFragment editIpadFragment) {
        return editIpadFragment.iIpadEditCallback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_268(EditIpadFragment editIpadFragment) {
        return editIpadFragment.mCurrentPosFragment;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_269(EditIpadFragment editIpadFragment, int n) {
        editIpadFragment.mCurrentPosFragment = n;
    }

    static /* bridge */ /* synthetic */ Fragment cfr_renamed_270(EditIpadFragment editIpadFragment, int n) {
        return editIpadFragment.getFragment(n);
    }

    public EditIpadFragment() {
    }

    public EditIpadFragment(Resources resources, int n, EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n2, boolean bl, boolean bl2) {
        this.iIpadEditCallback = editIpadFragment$IIpadEditCallback;
        this.ipadType = n;
        this.isGlass = bl2;
        this.resources = resources;
        this.index_select = n2;
        this.isGradient = bl;
    }

    private void addCustomViewToTab(TabLayout.Tab tab) {
        LayoutInflater layoutInflater = this.getLayoutInflater();
        int n = R$layout.layout_tablayout;
        layoutInflater = layoutInflater.inflate(n, null);
        n = R$id.name;
        TextCustumFont textCustumFont = (TextCustumFont)layoutInflater.findViewById(n);
        String string2 = ((Object)tab.getText()).toString();
        textCustumFont.setText(string2);
        tab.setCustomView((View)layoutInflater);
    }

    private Fragment getFragment(int n) {
        int n2 = 1;
        if (n == n2) {
            EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback = this.iIpadEditCallback;
            n2 = this.index_select;
            return GradientFragment.getInstance(editIpadFragment$IIpadEditCallback, n2);
        }
        EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback = this.iIpadEditCallback;
        n2 = this.index_select;
        return ColorsFragment.getInstance(editIpadFragment$IIpadEditCallback, n2);
    }

    public static EditIpadFragment getInstance(Resources resources, int n, EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n2, boolean bl, boolean bl2) {
        EditIpadFragment editIpadFragment = instance;
        if (editIpadFragment == null) {
            instance = editIpadFragment = new EditIpadFragment(resources, n, editIpadFragment$IIpadEditCallback, n2, bl, bl2);
        }
        return instance;
    }

    private int getPosSelect(int n, List list) {
        int n2;
        for (int i = 0; i < (n2 = list.size()); ++i) {
            IpadType ipadType = ((IpadItem)list.get(i)).getIpadType();
            n2 = ipadType.ordinal();
            if (n2 != n) continue;
            return i;
        }
        return 0;
    }

    private void initTab(View view) {
        int n = R$id.tab_layout;
        view = (TabLayout)view.findViewById(n);
        Object object = view.newTab();
        Object object2 = this.resources;
        int n2 = R$string.color;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        this.addCustomViewToTab((TabLayout.Tab)object);
        object2 = view.newTab();
        Object object3 = this.resources;
        int bl = R$string.gradient;
        object3 = object3.getString(bl);
        object2.setText((CharSequence)object3);
        this.addCustomViewToTab((TabLayout.Tab)object2);
        n2 = this.isGradient ? 1 : 0;
        boolean bl2 = true;
        if (n2 != 0) {
            view.addTab(object, false);
            view.addTab((TabLayout.Tab)object2, bl2);
        } else {
            view.addTab(object, bl2);
            view.addTab((TabLayout.Tab)object2, false);
        }
        view.setTabMode(0);
        this.mCurrentPosFragment = n = (int)(this.isGradient ? 1 : 0);
        object = new EditIpadFragment$2(this);
        view.addOnTabSelectedListener((TabLayout.OnTabSelectedListener)object);
        view = this.getChildFragmentManager().beginTransaction();
        n = R$id.container;
        int n3 = this.mCurrentPosFragment;
        object2 = this.getFragment(n3);
        view.replace(n, (Fragment)object2).addToBackStack(null).commit();
        this.index_select = -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        IpadAdabter ipadAdabter;
        object = FragmentEditIpadBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditIpadBinding)object).getRoot();
        int n = R$id.rv_type;
        object2 = (RecyclerView)object.findViewById(n);
        this.rv_type = object2;
        ArrayList<ViewGroup> arrayList = new ArrayList<ViewGroup>();
        int n2 = R$drawable.ipad_t;
        IpadType ipadType = IpadType.IPAD;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_unblur;
        ipadType = IpadType.IPAD_UNBLUR;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_classic;
        ipadType = IpadType.IPAD_CLASSIC;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_neomorphic;
        ipadType = IpadType.IPAD_NEOMORPHIC;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_caset;
        ipadType = IpadType.CASSET;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_caset_img;
        ipadType = IpadType.CASSET_IMG;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_caset_img_blur;
        ipadType = IpadType.CASSET_IMG_BLUR;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_rect;
        ipadType = IpadType.RECT;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_rect_round;
        ipadType = IpadType.ROUND_RECT;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_bottom_rect;
        ipadType = IpadType.BOTTOM_RECT;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_layer_black;
        ipadType = IpadType.BLACK_LAYER;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_gradient;
        ipadType = IpadType.GRADIENT;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_mask;
        ipadType = IpadType.MASK_BRUSH;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ipad_blue_type;
        ipadType = IpadType.BLUE_TYPE;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ic_heart_ipad;
        ipadType = IpadType.HEART;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n2 = R$drawable.ic_battery;
        ipadType = IpadType.BATTERY;
        object2 = new IpadItem(n2, ipadType);
        arrayList.add((ViewGroup)object2);
        n = this.ipadType;
        n = this.getPosSelect(n, arrayList);
        boolean bl = BillingPreferences.isSubscribed(this.getContext());
        int n3 = this.ipadType;
        EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback = this.iIpadEditCallback;
        boolean bl2 = this.isGlass;
        IpadAdabter ipadAdabter2 = ipadAdabter;
        this.ipadAdabter = ipadAdabter = new IpadAdabter(bl, n, n3, editIpadFragment$IIpadEditCallback, arrayList, bl2);
        ipadAdabter2 = this.rv_type;
        Context context = this.getContext();
        ipadType = new LinearLayoutManager(context, 0, false);
        ipadAdabter2.setLayoutManager((RecyclerView.LayoutManager)ipadType);
        this.rv_type.setHasFixedSize(true);
        object3 = this.rv_type;
        n2 = 0;
        object3.setItemAnimator(null);
        object3 = this.rv_type;
        ipadAdabter2 = this.ipadAdabter;
        object3.setAdapter((RecyclerView.Adapter)ipadAdabter2);
        int n4 = 3;
        if (n > n4) {
            ipadAdabter2 = this.rv_type;
            n -= n4;
            try {
                ipadAdabter2.scrollToPosition(n);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        n = R$id.btn_done;
        object2 = object.findViewById(n);
        object3 = new EditIpadFragment$1(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        this.initTab((View)object);
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        instance = null;
        this.fragmentBinding = null;
        this.iIpadEditCallback = null;
    }

    public void scrollToSelectedPosition() {
        block10: {
            RecyclerView recyclerView = this.rv_type;
            recyclerView = recyclerView.getLayoutManager();
            recyclerView = (LinearLayoutManager)recyclerView;
            if (recyclerView == null) break block10;
            IpadAdabter ipadAdabter = this.ipadAdabter;
            int n = ipadAdabter.getPos_select();
            RecyclerView recyclerView2 = this.rv_type;
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

