/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
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
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.adabter.GradientAdabter;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$IColor;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.databinding.FragmentColorsBinding;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.fragment.GradientFragment$1;
import hazem.nurmontage.videoquran.fragment.GradientFragment$2;
import hazem.nurmontage.videoquran.model.Gradient;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.List;

public class GradientFragment
extends Fragment {
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

    static /* bridge */ /* synthetic */ FragmentColorsBinding cfr_renamed_168(GradientFragment gradientFragment) {
        return gradientFragment.binding;
    }

    static /* bridge */ /* synthetic */ Gradient cfr_renamed_167(GradientFragment gradientFragment) {
        return gradientFragment.gradient;
    }

    static /* bridge */ /* synthetic */ EditIpadFragment$IIpadEditCallback cfr_renamed_172(GradientFragment gradientFragment) {
        return gradientFragment.iIpadEditCallback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_203(GradientFragment gradientFragment) {
        return gradientFragment.index;
    }

    static /* bridge */ /* synthetic */ SeekBar cfr_renamed_170(GradientFragment gradientFragment) {
        return gradientFragment.seekBar_angle;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_204(GradientFragment gradientFragment) {
        return gradientFragment.tv_angle;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_169(GradientFragment gradientFragment, Gradient gradient) {
        gradientFragment.gradient = gradient;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_171(GradientFragment gradientFragment, int n) {
        gradientFragment.index = n;
    }

    public GradientFragment(EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n) {
        GradientFragment$2 gradientFragment$2 = new GradientFragment$2(this);
        this.iColor = gradientFragment$2;
        this.iIpadEditCallback = editIpadFragment$IIpadEditCallback;
        this.index = n;
    }

    public static GradientFragment getInstance(EditIpadFragment$IIpadEditCallback editIpadFragment$IIpadEditCallback, int n) {
        GradientFragment gradientFragment = instance;
        if (gradientFragment == null) {
            instance = gradientFragment = new GradientFragment(editIpadFragment$IIpadEditCallback, n);
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        block5: {
            int n = 0;
            object3 = null;
            object = FragmentColorsBinding.inflate((LayoutInflater)object, object2, false);
            this.binding = object;
            object = ((FragmentColorsBinding)object).getRoot();
            int n2 = R$id.rv_color;
            object2 = (RecyclerView)object.findViewById(n2);
            this.recyclerView = object2;
            Object object4 = this.iColor;
            List list = Common.getListGradientColor();
            Context context = this.getContext();
            boolean bl = BillingPreferences.isSubscribed(context);
            int n3 = this.index;
            object2 = new GradientAdabter((GradientAdabter$IColor)object4, list, bl, n3);
            this.adapter = object2;
            object2 = this.recyclerView;
            list = this.getContext();
            object4 = new LinearLayoutManager((Context)list, 0, false);
            object2.setLayoutManager((RecyclerView.LayoutManager)object4);
            this.recyclerView.setItemAnimator(null);
            object2 = this.recyclerView;
            boolean bl2 = true;
            object2.setHasFixedSize(bl2);
            object2 = this.recyclerView;
            object4 = this.adapter;
            object2.setAdapter((RecyclerView.Adapter)object4);
            object2 = this.adapter.getSelect();
            this.gradient = object2;
            n2 = R$id.tv_angle;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_angle = object2;
            n2 = R$id.seekbar;
            object2 = (SeekBar)object.findViewById(n2);
            this.seekBar_angle = object2;
            object2 = this.gradient;
            if (object2 != null) {
                n2 = R$id.layout_edit_gradient;
                object.findViewById(n2).setVisibility(0);
                object2 = this.seekBar_angle;
                object3 = this.gradient;
                n = ((Gradient)object3).getAngle();
                object2.setProgress(n);
            }
            object2 = this.tv_angle;
            n = this.seekBar_angle.getProgress();
            object3 = String.valueOf(n);
            object2.setText((CharSequence)object3);
            object2 = this.seekBar_angle;
            object3 = new GradientFragment$1(this);
            object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object3);
            n2 = this.index;
            n = 3;
            if (n2 <= n) break block5;
            object4 = this.recyclerView;
            n2 -= n;
            try {
                object4.scrollToPosition(n2);
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
            GradientAdabter gradientAdabter = this.adapter;
            int n = gradientAdabter.getPos_select();
            RecyclerView recyclerView = this.recyclerView;
            int n2 = recyclerView.getWidth() / 2 + -50;
            linearLayoutManager.scrollToPositionWithOffset(n, n2);
        }
    }
}

