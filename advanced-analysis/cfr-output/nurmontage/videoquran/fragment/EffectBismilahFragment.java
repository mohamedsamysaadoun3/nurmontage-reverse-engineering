/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.google.android.material.tabs.TabLayout
 *  com.google.android.material.tabs.TabLayout$OnTabSelectedListener
 *  com.google.android.material.tabs.TabLayout$Tab
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$TransitionItem;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.databinding.FragmentEffectAyaBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$1;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$2;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$3;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$4;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$5;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$6;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EffectBismilahFragment
extends Fragment {
    public static EffectBismilahFragment instance;
    private LinearLayout btnApplyAll;
    private ImageButton btn_unEffect;
    private EntityBismilahTimeline entityQuranTimeline;
    private EffectBismilahFragment$ITransition iTransition;
    int index;
    private ImageView iv_apply_all;
    private RecyclerView recyclerView;
    private Resources resources;
    private SeekBar seekBarDuration;
    private int tab_selected = 0;
    private float time;
    private Transition transition;
    private TransitionBismilahAdabters transitionEntityAdabters;
    private FragmentEffectAyaBinding transitionEntityBinding;
    private TextCustumFont tvDuration;
    private TextCustumFont tv_apply_all;

    static /* bridge */ /* synthetic */ ImageButton cfr_renamed_188(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.btn_unEffect;
    }

    static /* bridge */ /* synthetic */ EntityBismilahTimeline cfr_renamed_174(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.entityQuranTimeline;
    }

    static /* bridge */ /* synthetic */ EffectBismilahFragment$ITransition cfr_renamed_173(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.iTransition;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_93(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.recyclerView;
    }

    static /* bridge */ /* synthetic */ SeekBar cfr_renamed_189(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.seekBarDuration;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_190(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.tab_selected;
    }

    static /* bridge */ /* synthetic */ Transition cfr_renamed_191(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.transition;
    }

    static /* bridge */ /* synthetic */ TransitionBismilahAdabters cfr_renamed_192(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.transitionEntityAdabters;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_193(EffectBismilahFragment effectBismilahFragment) {
        return effectBismilahFragment.tvDuration;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_194(EffectBismilahFragment effectBismilahFragment, int n) {
        effectBismilahFragment.tab_selected = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_195(EffectBismilahFragment effectBismilahFragment, TransitionBismilahAdabters transitionBismilahAdabters) {
        effectBismilahFragment.transitionEntityAdabters = transitionBismilahAdabters;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_175(EffectBismilahFragment effectBismilahFragment) {
        effectBismilahFragment.invisibleApplyAll();
    }

    public EffectBismilahFragment() {
    }

    public EffectBismilahFragment(Transition transition, Resources resources, EffectBismilahFragment$ITransition effectBismilahFragment$ITransition, EntityBismilahTimeline entityBismilahTimeline) {
        this.resources = resources;
        this.iTransition = effectBismilahFragment$ITransition;
        this.transition = transition;
        float f = entityBismilahTimeline.getRect().width();
        float f2 = entityBismilahTimeline.getSecond_in_screen();
        this.time = f = f / f2 * 0.5f;
        this.entityQuranTimeline = entityBismilahTimeline;
    }

    private void addCustomViewToTab(TabLayout.Tab tab) {
        LayoutInflater layoutInflater = this.getLayoutInflater();
        int n = R$layout.layout_tablayout;
        layoutInflater = layoutInflater.inflate(n, null);
        n = R$id.name;
        TextCustumFont textCustumFont = (TextCustumFont)layoutInflater.findViewById(n);
        int n2 = R$id.icon;
        layoutInflater.findViewById(n2).setVisibility(8);
        String string2 = ((Object)tab.getText()).toString();
        textCustumFont.setText(string2);
        tab.setCustomView((View)layoutInflater);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static EffectBismilahFragment get(Transition object, Resources resources, EffectBismilahFragment$ITransition effectBismilahFragment$ITransition, EntityBismilahTimeline entityBismilahTimeline) {
        Class<EffectBismilahFragment> clazz = EffectBismilahFragment.class;
        synchronized (clazz) {
            Class<EffectBismilahFragment> clazz2 = EffectBismilahFragment.class;
            synchronized (clazz2) {
                EffectBismilahFragment effectBismilahFragment = instance;
                if (effectBismilahFragment != null) return instance;
                instance = effectBismilahFragment = new EffectBismilahFragment((Transition)object, resources, effectBismilahFragment$ITransition, entityBismilahTimeline);
                return instance;
            }
        }
    }

    private List getOutTransition() {
        ArrayList<TransitionBismilahAdabters$TransitionItem> arrayList = new ArrayList<TransitionBismilahAdabters$TransitionItem>();
        String string2 = TransitionType.FADE_OUT.getValue();
        int n = R$drawable.ic_linear_gradient;
        TransitionBismilahAdabters$TransitionItem transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 0);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        string2 = TransitionType.SLIDE_TO_RIGHT.getValue();
        n = R$drawable.ic_btn_back;
        transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 180);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        string2 = TransitionType.SLIDE_TO_LEFT.getValue();
        n = R$drawable.ic_btn_back;
        transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 0);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        return arrayList;
    }

    private void invisibleApplyAll() {
        Object object = this.btnApplyAll;
        boolean bl = object.isEnabled();
        if (!bl) {
            return;
        }
        this.btnApplyAll.setEnabled(false);
        this.btnApplyAll.setClickable(false);
        object = this.tv_apply_all;
        int n = -8355712;
        object.setTextColor(n);
        object = this.iv_apply_all;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        object.setColorFilter(n, mode);
    }

    private void invisibleSeekbar() {
        SeekBar seekBar = this.seekBarDuration;
        int n = 8;
        seekBar.setVisibility(n);
        this.tvDuration.setVisibility(n);
    }

    private void updateSeek(float f, boolean bl) {
        Object object = this.seekBarDuration;
        int n = (int)(f * 4.0f);
        object.setProgress(n);
        TextCustumFont textCustumFont = this.tvDuration;
        object = String.valueOf((float)this.seekBarDuration.getProgress() / 10.0f);
        textCustumFont.setText((CharSequence)object);
    }

    private void visibleSeekbar() {
        this.seekBarDuration.setVisibility(0);
        this.tvDuration.setVisibility(0);
    }

    public List getInTransition() {
        ArrayList<TransitionBismilahAdabters$TransitionItem> arrayList = new ArrayList<TransitionBismilahAdabters$TransitionItem>();
        String string2 = TransitionType.FADE_IN.getValue();
        int n = R$drawable.ic_linear_gradient;
        TransitionBismilahAdabters$TransitionItem transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 0);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        string2 = TransitionType.SLIDE_TO_RIGHT.getValue();
        n = R$drawable.ic_btn_back;
        transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 180);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        string2 = TransitionType.SLIDE_TO_LEFT.getValue();
        n = R$drawable.ic_btn_back;
        transitionBismilahAdabters$TransitionItem = new TransitionBismilahAdabters$TransitionItem(string2, n, 0);
        arrayList.add(transitionBismilahAdabters$TransitionItem);
        return arrayList;
    }

    public int getIndex(List list, String string2) {
        int n;
        for (int i = 0; i < (n = list.size()); ++i) {
            String string3 = ((TransitionBismilahAdabters$TransitionItem)list.get(i)).getType();
            n = string2.equals(string3) ? 1 : 0;
            if (n == 0) continue;
            return i;
        }
        return -1;
    }

    public void loadTransition(int n) {
        int n2;
        this.index = n2 = -1;
        if (n == 0) {
            Object object;
            Object object2 = this.getInTransition();
            Object object3 = this.transition;
            if (object3 != null) {
                boolean bl = ((Transition)object3).isIn();
                if (bl) {
                    int n3;
                    object3 = this.transition.getType_in();
                    this.index = n3 = this.getIndex((List)object2, (String)object3);
                    if (n3 != n2) {
                        this.visibleSeekbar();
                        object = this.iTransition;
                        object3 = this.transition;
                        float f = ((Transition)object3).getDuration_in();
                        EntityBismilahTimeline entityBismilahTimeline = this.entityQuranTimeline;
                        object.updateDurationIn(f, entityBismilahTimeline);
                        object = this.btn_unEffect;
                        int n4 = R$drawable.circle_effect;
                        object.setBackgroundResource(n4);
                    } else {
                        this.entityQuranTimeline.getQuranEntity().endAnimator();
                        this.invisibleSeekbar();
                        object = this.btn_unEffect;
                        int n5 = R$drawable.circle_item_menu_select;
                        object.setBackgroundResource(n5);
                    }
                } else {
                    this.entityQuranTimeline.getQuranEntity().endAnimator();
                    this.invisibleSeekbar();
                    object = this.btn_unEffect;
                    int n6 = R$drawable.circle_item_menu_select;
                    object.setBackgroundResource(n6);
                }
            }
            object = this.transitionEntityAdabters;
            object3 = "in";
            int n7 = this.index;
            ((TransitionBismilahAdabters)((Object)object)).update((List)object2, (String)object3, n7);
            n = this.index;
            this.scroll(n);
            object2 = this.transition;
            if (object2 != null) {
                float f = ((Transition)object2).getDuration_in();
                object = this.transition;
                boolean bl = ((Transition)object).isIn();
                this.updateSeek(f, bl);
            }
        } else {
            int n8 = 1;
            float f = Float.MIN_VALUE;
            if (n == n8) {
                Object object;
                Object object4 = this.getOutTransition();
                Object object5 = this.transition;
                if (object5 != null) {
                    boolean bl = ((Transition)object5).isOut();
                    if (bl) {
                        int n9;
                        object5 = this.transition.getType_out();
                        this.index = n9 = this.getIndex((List)object4, (String)object5);
                        if (n9 != n2) {
                            this.visibleSeekbar();
                            object = this.iTransition;
                            object5 = this.transition;
                            f = ((Transition)object5).getDuration_out();
                            EntityBismilahTimeline entityBismilahTimeline = this.entityQuranTimeline;
                            object.updateDurationOut(f, entityBismilahTimeline);
                            object = this.btn_unEffect;
                            int n10 = R$drawable.circle_effect;
                            object.setBackgroundResource(n10);
                        } else {
                            this.entityQuranTimeline.getQuranEntity().endAnimator();
                            this.invisibleSeekbar();
                            object = this.btn_unEffect;
                            int n11 = R$drawable.circle_item_menu_select;
                            object.setBackgroundResource(n11);
                        }
                    } else {
                        this.entityQuranTimeline.getQuranEntity().endAnimator();
                        this.invisibleSeekbar();
                        object = this.btn_unEffect;
                        int n12 = R$drawable.circle_item_menu_select;
                        object.setBackgroundResource(n12);
                    }
                }
                object = this.transitionEntityAdabters;
                object5 = "out";
                int n13 = this.index;
                ((TransitionBismilahAdabters)((Object)object)).update((List)object4, (String)object5, n13);
                n = this.index;
                this.scroll(n);
                object4 = this.transition;
                if (object4 != null) {
                    float f2 = ((Transition)object4).getDuration_out();
                    object = this.transition;
                    boolean bl = ((Transition)object).isOut();
                    this.updateSeek(f2, bl);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentEffectAyaBinding.inflate((LayoutInflater)object, object2, false);
        this.transitionEntityBinding = object;
        object = ((FragmentEffectAyaBinding)object).getRoot();
        object2 = this.resources;
        if (object2 != null && (object2 = this.iTransition) != null) {
            Object object4 = this.entityQuranTimeline;
            object2.playing((EntityBismilahTimeline)object4);
            int n = R$id.tab_layout;
            object2 = (TabLayout)object.findViewById(n);
            int n2 = R$id.status_duration;
            object4 = (TextCustumFont)object.findViewById(n2);
            this.tvDuration = object4;
            object4 = object2.newTab();
            Object object5 = this.resources;
            int n3 = R$string.in_transition;
            object5 = object5.getString(n3);
            object4.setText((CharSequence)object5);
            object2.addTab((TabLayout.Tab)object4);
            this.addCustomViewToTab((TabLayout.Tab)object4);
            object4 = object2.newTab();
            object5 = this.resources;
            n3 = R$string.out_transition;
            object5 = object5.getString(n3);
            object4.setText((CharSequence)object5);
            object2.addTab((TabLayout.Tab)object4);
            this.addCustomViewToTab((TabLayout.Tab)object4);
            object4 = new EffectBismilahFragment$1(this);
            object2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener)object4);
            Objects.requireNonNull(object2.getTabAt(0)).select();
            n = R$id.seekbar;
            object2 = (SeekBar)object.findViewById(n);
            this.seekBarDuration = object2;
            float f = this.time;
            int n4 = 0x40800000;
            float f2 = 4.0f;
            n2 = (int)(f *= f2);
            object2.setMax(n2);
            object2 = this.seekBarDuration;
            object4 = new EffectBismilahFragment$2(this);
            object2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object4);
            n = R$id.btn_unEffect;
            object2 = (ImageButton)object.findViewById(n);
            this.btn_unEffect = object2;
            object2 = this.transition;
            if (object2 != null && (n = (int)(object2.isIn() ? 1 : 0)) != 0) {
                float f3 = this.transition.getDuration_in();
                f = this.time;
                f3 = Math.min(f3, f);
                object4 = this.seekBarDuration;
                n4 = (int)(f2 * f3);
                object4.setProgress(n4);
                object4 = this.tvDuration;
                n4 = this.seekBarDuration.getProgress();
                f2 = n4;
                n3 = 1092616192;
                float f4 = 10.0f;
                object5 = String.valueOf(f2 /= f4);
                object4.setText((CharSequence)object5);
                object4 = this.iTransition;
                object5 = this.entityQuranTimeline;
                object4.updateDurationIn(f3, (EntityBismilahTimeline)object5);
                object2 = this.btn_unEffect;
                n2 = R$drawable.circle_effect;
                object2.setBackgroundResource(n2);
            } else {
                object2 = this.seekBarDuration;
                n2 = 8;
                f = 1.1E-44f;
                object2.setVisibility(n2);
                this.tvDuration.setVisibility(n2);
                object2 = this.btn_unEffect;
                n2 = R$drawable.circle_item_menu_select;
                object2.setBackgroundResource(n2);
            }
            n = R$id.rv;
            object2 = (RecyclerView)object.findViewById(n);
            this.recyclerView = object2;
            n2 = 1;
            object2.setHasFixedSize(n2 != 0);
            object2 = this.recyclerView;
            Context context = this.getContext();
            object5 = new LinearLayoutManager(context, 0, false);
            object2.setLayoutManager((RecyclerView.LayoutManager)object5);
            object2 = this.recyclerView;
            f2 = 2.8E-44f;
            object2.setItemViewCacheSize(20);
            this.recyclerView.setDrawingCacheEnabled(n2 != 0);
            this.recyclerView.setItemAnimator(null);
            object2 = this.recyclerView;
            n2 = 0x100000;
            f = 1.469368E-39f;
            object2.setDrawingCacheQuality(n2);
            object2 = this.btn_unEffect;
            object4 = new EffectBismilahFragment$3(this);
            object2.setOnClickListener((View.OnClickListener)object4);
            n = R$id.btn_close;
            object2 = object.findViewById(n);
            object4 = new EffectBismilahFragment$4(this);
            object2.setOnClickListener((View.OnClickListener)object4);
            n = R$id.btn_appl_all;
            object2 = (LinearLayout)object.findViewById(n);
            this.btnApplyAll = object2;
            n = R$id.tv_apply_all;
            object2 = (TextCustumFont)object.findViewById(n);
            this.tv_apply_all = object2;
            n = R$id.iv_apply_all;
            object2 = (ImageView)object.findViewById(n);
            this.iv_apply_all = object2;
            object2 = this.tv_apply_all;
            object4 = this.resources;
            n4 = R$string.applyall;
            object4 = object4.getString(n4);
            object2.setText((CharSequence)object4);
            this.btnApplyAll.setEnabled(false);
            this.btnApplyAll.setClickable(false);
            object2 = this.btnApplyAll;
            object3 = new EffectBismilahFragment$5(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            object2 = new EffectBismilahFragment$6(this);
            object.post((Runnable)object2);
        }
        return object;
    }

    public void onDestroyView() {
        EntityBismilahTimeline entityBismilahTimeline;
        Object object = this.iTransition;
        if (object != null) {
            entityBismilahTimeline = this.entityQuranTimeline;
            object.destroy(entityBismilahTimeline);
        }
        object = this.transitionEntityBinding;
        entityBismilahTimeline = null;
        if (object != null) {
            object = ((FragmentEffectAyaBinding)object).getRoot();
            object.removeAllViews();
            this.transitionEntityBinding = null;
        }
        instance = null;
        super.onDestroyView();
    }

    public void scroll(int n) {
        int n2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        View view = linearLayoutManager.findViewByPosition(n);
        RecyclerView recyclerView = this.recyclerView;
        int n3 = recyclerView.getWidth();
        if (view != null) {
            n2 = view.getWidth();
        } else {
            n2 = 0;
            view = null;
        }
        n3 = (n3 - n2) / 2;
        linearLayoutManager.scrollToPositionWithOffset(n, n3);
    }

    public void updateButton(Transition transition) {
        this.transition = transition;
        transition = this.btn_unEffect;
        int n = R$drawable.circle_effect;
        transition.setBackgroundResource(n);
        this.visibleSeekbar();
    }

    public void updateView(float f, Transition object) {
        int n;
        this.transition = object;
        object = this.seekBarDuration;
        int n2 = object.getVisibility();
        if (n2 != 0) {
            object = this.seekBarDuration;
            n = 0;
            object.setVisibility(0);
            object = this.tvDuration;
            object.setVisibility(0);
        }
        object = this.btn_unEffect;
        n = R$drawable.circle_effect;
        object.setBackgroundResource(n);
        this.updateSeek(f, true);
        this.visibleApplyAll();
    }

    public void visibleApplyAll() {
        Object object = this.btnApplyAll;
        boolean bl = object.isEnabled();
        if (bl) {
            return;
        }
        object = this.btnApplyAll;
        int n = 1;
        object.setEnabled(n != 0);
        this.btnApplyAll.setClickable(n != 0);
        object = this.tv_apply_all;
        n = -1;
        object.setTextColor(n);
        object = this.iv_apply_all;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        object.setColorFilter(n, mode);
    }
}

