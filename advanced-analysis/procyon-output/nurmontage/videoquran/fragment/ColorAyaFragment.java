// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.common.Common;
import android.os.Bundle;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.widget.TextView;
import hazem.nurmontage.videoquran.R$string;
import android.view.View;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.R$layout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayout;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.databinding.FragmentColorAyaBinding;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import androidx.fragment.app.Fragment;

public class ColorAyaFragment extends Fragment
{
    public static ColorAyaFragment instance;
    private ColorAdabter adapter;
    private FragmentColorAyaBinding binding;
    private QuranEntity entity_select;
    private ColorAdabter$IColor iColor;
    private EditEntityFragment$IEditEntityCallback iEditEntityCallback;
    private RecyclerView recyclerView;
    private Resources resources;
    private TabLayout tabLayout;
    
    public ColorAyaFragment() {
        this.iColor = new ColorAyaFragment$2(this);
    }
    
    public ColorAyaFragment(final EditEntityFragment$IEditEntityCallback iEditEntityCallback, final QuranEntity entity_select, final Resources resources) {
        this.iColor = new ColorAyaFragment$2(this);
        this.iEditEntityCallback = iEditEntityCallback;
        this.entity_select = entity_select;
        this.resources = resources;
    }
    
    private void addCustomViewToTab(final TabLayout$Tab tabLayout$Tab) {
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final int layout_tablayout = R$layout.layout_tablayout;
        final ViewGroup viewGroup = null;
        final View inflate = layoutInflater.inflate(layout_tablayout, (ViewGroup)null);
        ((TextCustumFont)inflate.findViewById(R$id.name)).setText((CharSequence)tabLayout$Tab.getText().toString());
        tabLayout$Tab.setCustomView(inflate);
    }
    
    public static ColorAyaFragment getInstance(final EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback, final QuranEntity quranEntity, final Resources resources) {
        if (ColorAyaFragment.instance == null) {
            ColorAyaFragment.instance = new ColorAyaFragment(editEntityFragment$IEditEntityCallback, quranEntity, resources);
        }
        return ColorAyaFragment.instance;
    }
    
    private void initTab(final View view) {
        if (this.entity_select.getTranslation() == null) {
            view.findViewById(R$id.tab_layout).setVisibility(8);
            return;
        }
        final TabLayout tabLayout = (TabLayout)view.findViewById(R$id.tab_layout);
        this.tabLayout = tabLayout;
        final TabLayout$Tab tab = tabLayout.newTab();
        tab.setText((CharSequence)this.resources.getString(R$string.tab_aya));
        this.addCustomViewToTab(tab);
        final TabLayout$Tab tab2 = this.tabLayout.newTab();
        tab2.setText((CharSequence)this.resources.getString(R$string.tv_translation));
        this.addCustomViewToTab(tab2);
        this.tabLayout.addTab(tab, true);
        this.tabLayout.addTab(tab2, false);
        this.tabLayout.setTabMode(0);
    }
    
    private void selectPreset(final TextView[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            array[i].setSelected(i == n);
        }
    }
    
    private void setupPresetButtons(final View view) {
        final TextCustumFont textCustumFont = (TextCustumFont)view.findViewById(R$id.btnNone);
        final TextCustumFont textCustumFont2 = (TextCustumFont)view.findViewById(R$id.btnOutline);
        final TextCustumFont textCustumFont3 = (TextCustumFont)view.findViewById(R$id.btnShadow);
        final TextCustumFont textCustumFont4 = (TextCustumFont)view.findViewById(R$id.btnGlow);
        textCustumFont.setText((CharSequence)this.resources.getString(R$string.preset_none));
        textCustumFont2.setText((CharSequence)this.resources.getString(R$string.preset_outline));
        textCustumFont3.setText((CharSequence)this.resources.getString(R$string.preset_shadow));
        textCustumFont4.setText((CharSequence)this.resources.getString(R$string.preset_glow));
        final int n = 4;
        final TextView[] array = new TextView[n];
        int n2 = 0;
        array[0] = (TextView)textCustumFont;
        final int n3 = 1;
        array[n3] = (TextView)textCustumFont2;
        final int n4 = 2;
        array[n4] = (TextView)textCustumFont3;
        final int n5 = 3;
        array[n5] = (TextView)textCustumFont4;
        final AyaTextPreset[] array2 = new AyaTextPreset[n];
        array2[0] = AyaTextPreset.NONE;
        array2[n3] = AyaTextPreset.OUTLINE;
        array2[n4] = AyaTextPreset.SHADOW;
        array2[n5] = AyaTextPreset.GLOW;
        for (int i = 0; i < n; ++i) {
            array[i].setOnClickListener((View$OnClickListener)new ColorAyaFragment$$ExternalSyntheticLambda0(this, array, i, array2));
        }
        final QuranEntity entity_select = this.entity_select;
        final AyaTextPreset value = entity_select.get(entity_select.getmPreset());
        if (value != AyaTextPreset.NONE) {
            if (value == AyaTextPreset.OUTLINE) {
                n2 = n3;
            }
            else if (value == AyaTextPreset.SHADOW) {
                n2 = n4;
            }
            else {
                n2 = n5;
            }
        }
        this.selectPreset(array, n2);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentColorAyaBinding inflate = FragmentColorAyaBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.iEditEntityCallback != null && this.entity_select != null) {
            if (this.resources != null) {
                this.recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv_color);
                this.adapter = new ColorAdabter(this.iColor, Common.MUSLIM_AYA_COLORS, Utils.indexOf(Common.MUSLIM_AYA_COLORS, this.entity_select.getClrAya()));
                this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
                this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
                this.recyclerView.setHasFixedSize(true);
                this.recyclerView.setAdapter((RecyclerView$Adapter)this.adapter);
                final int pos_select = this.adapter.getPos_select();
                final int n = 2;
                if (pos_select > n) {
                    this.scrollToSelectedPosition(this.adapter.getPos_select() - n);
                }
                this.initTab((View)root);
                this.setupPresetButtons((View)root);
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ColorAyaFragment$1(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.binding = null;
        ColorAyaFragment.instance = null;
        this.iColor = null;
        super.onDestroyView();
    }
    
    public void scrollToSelectedPosition() {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.adapter.getPos_select(), this.recyclerView.getWidth() / 2 - 50);
        }
    }
    
    public void scrollToSelectedPosition(final int n) {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(n, this.recyclerView.getWidth() / 2);
        }
    }
}
