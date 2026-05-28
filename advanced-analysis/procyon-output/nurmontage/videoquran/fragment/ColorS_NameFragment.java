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
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.TextView;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.databinding.FragmentColorAyaBinding;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import androidx.fragment.app.Fragment;

public class ColorS_NameFragment extends Fragment
{
    public static ColorS_NameFragment instance;
    private ColorAdabter adapter;
    private FragmentColorAyaBinding binding;
    private SurahNameEntity entity_select;
    private ColorAdabter$IColor iColor;
    private EditS_NameFragment$IEditS_Name iEditSName;
    private RecyclerView recyclerView;
    private Resources resources;
    
    public ColorS_NameFragment() {
        this.iColor = new ColorS_NameFragment$2(this);
    }
    
    public ColorS_NameFragment(final EditS_NameFragment$IEditS_Name iEditSName, final SurahNameEntity entity_select, final Resources resources) {
        this.iColor = new ColorS_NameFragment$2(this);
        this.iEditSName = iEditSName;
        this.entity_select = entity_select;
        this.resources = resources;
    }
    
    public static ColorS_NameFragment getInstance(final EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name, final SurahNameEntity surahNameEntity, final Resources resources) {
        if (ColorS_NameFragment.instance == null) {
            ColorS_NameFragment.instance = new ColorS_NameFragment(editS_NameFragment$IEditS_Name, surahNameEntity, resources);
        }
        return ColorS_NameFragment.instance;
    }
    
    private void initTab(final View view) {
        view.findViewById(R$id.tab_layout).setVisibility(8);
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
            array[i].setOnClickListener((View$OnClickListener)new ColorS_NameFragment$$ExternalSyntheticLambda0(this, array, i, array2));
        }
        final SurahNameEntity entity_select = this.entity_select;
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
        if (this.iEditSName != null && this.entity_select != null) {
            if (this.resources != null) {
                this.recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv_color);
                this.adapter = new ColorAdabter(this.iColor, Common.MUSLIM_AYA_COLORS, Utils.indexOf(Common.MUSLIM_AYA_COLORS, this.entity_select.getClrS_name()));
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
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ColorS_NameFragment$1(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.binding = null;
        ColorS_NameFragment.instance = null;
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
