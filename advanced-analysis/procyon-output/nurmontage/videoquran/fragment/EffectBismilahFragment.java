// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.util.Objects;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import hazem.nurmontage.videoquran.R$string;
import com.google.android.material.tabs.TabLayout;
import android.os.Bundle;
import android.graphics.PorterDuff$Mode;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters$TransitionItem;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.R$id;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.R$layout;
import com.google.android.material.tabs.TabLayout$Tab;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.databinding.FragmentEffectAyaBinding;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;
import hazem.nurmontage.videoquran.model.Transition;
import android.widget.SeekBar;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class EffectBismilahFragment extends Fragment
{
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
    private int tab_selected;
    private float time;
    private Transition transition;
    private TransitionBismilahAdabters transitionEntityAdabters;
    private FragmentEffectAyaBinding transitionEntityBinding;
    private TextCustumFont tvDuration;
    private TextCustumFont tv_apply_all;
    
    public EffectBismilahFragment() {
        this.tab_selected = 0;
    }
    
    public EffectBismilahFragment(final Transition transition, final Resources resources, final EffectBismilahFragment$ITransition iTransition, final EntityBismilahTimeline entityQuranTimeline) {
        this.tab_selected = 0;
        this.resources = resources;
        this.iTransition = iTransition;
        this.transition = transition;
        this.time = entityQuranTimeline.getRect().width() / entityQuranTimeline.getSecond_in_screen() * 0.5f;
        this.entityQuranTimeline = entityQuranTimeline;
    }
    
    private void addCustomViewToTab(final TabLayout$Tab tabLayout$Tab) {
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final int layout_tablayout = R$layout.layout_tablayout;
        final ViewGroup viewGroup = null;
        final View inflate = layoutInflater.inflate(layout_tablayout, (ViewGroup)null);
        final TextCustumFont textCustumFont = (TextCustumFont)inflate.findViewById(R$id.name);
        inflate.findViewById(R$id.icon).setVisibility(8);
        textCustumFont.setText((CharSequence)tabLayout$Tab.getText().toString());
        tabLayout$Tab.setCustomView(inflate);
    }
    
    public static EffectBismilahFragment get(final Transition transition, final Resources resources, final EffectBismilahFragment$ITransition effectBismilahFragment$ITransition, final EntityBismilahTimeline entityBismilahTimeline) {
        final Class<EffectBismilahFragment> clazz = EffectBismilahFragment.class;
        monitorenter(clazz);
        final Class<EffectBismilahFragment> clazz2 = EffectBismilahFragment.class;
        try {
            synchronized (clazz2) {
                if (EffectBismilahFragment.instance == null) {
                    EffectBismilahFragment.instance = new EffectBismilahFragment(transition, resources, effectBismilahFragment$ITransition, entityBismilahTimeline);
                }
                return EffectBismilahFragment.instance;
            }
        }
        finally {
            monitorexit(clazz);
        }
    }
    
    private List getOutTransition() {
        final ArrayList<TransitionBismilahAdabters$TransitionItem> list = new ArrayList<TransitionBismilahAdabters$TransitionItem>();
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.FADE_OUT.getValue(), R$drawable.ic_linear_gradient, 0));
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.SLIDE_TO_RIGHT.getValue(), R$drawable.ic_btn_back, 180));
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.SLIDE_TO_LEFT.getValue(), R$drawable.ic_btn_back, 0));
        return list;
    }
    
    private void invisibleApplyAll() {
        if (!this.btnApplyAll.isEnabled()) {
            return;
        }
        this.btnApplyAll.setEnabled(false);
        this.btnApplyAll.setClickable(false);
        final TextCustumFont tv_apply_all = this.tv_apply_all;
        final int textColor = -8355712;
        tv_apply_all.setTextColor(textColor);
        this.iv_apply_all.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
    }
    
    private void invisibleSeekbar() {
        final SeekBar seekBarDuration = this.seekBarDuration;
        final int n = 8;
        seekBarDuration.setVisibility(n);
        this.tvDuration.setVisibility(n);
    }
    
    private void updateSeek(final float n, final boolean b) {
        this.seekBarDuration.setProgress((int)(n * 4.0f));
        this.tvDuration.setText((CharSequence)String.valueOf(this.seekBarDuration.getProgress() / 10.0f));
    }
    
    private void visibleSeekbar() {
        this.seekBarDuration.setVisibility(0);
        this.tvDuration.setVisibility(0);
    }
    
    public List getInTransition() {
        final ArrayList<TransitionBismilahAdabters$TransitionItem> list = new ArrayList<TransitionBismilahAdabters$TransitionItem>();
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.FADE_IN.getValue(), R$drawable.ic_linear_gradient, 0));
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.SLIDE_TO_RIGHT.getValue(), R$drawable.ic_btn_back, 180));
        list.add(new TransitionBismilahAdabters$TransitionItem(TransitionType.SLIDE_TO_LEFT.getValue(), R$drawable.ic_btn_back, 0));
        return list;
    }
    
    public int getIndex(final List list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            if (s.equals(((TransitionBismilahAdabters$TransitionItem)list.get(i)).getType())) {
                return i;
            }
        }
        return -1;
    }
    
    public void loadTransition(int n) {
        final int index = -1;
        this.index = index;
        if (n == 0) {
            final List inTransition = this.getInTransition();
            final Transition transition = this.transition;
            if (transition != null) {
                if (transition.isIn()) {
                    if ((this.index = this.getIndex(inTransition, this.transition.getType_in())) != index) {
                        this.visibleSeekbar();
                        this.iTransition.updateDurationIn(this.transition.getDuration_in(), this.entityQuranTimeline);
                        this.btn_unEffect.setBackgroundResource(R$drawable.circle_effect);
                    }
                    else {
                        this.entityQuranTimeline.getQuranEntity().endAnimator();
                        this.invisibleSeekbar();
                        this.btn_unEffect.setBackgroundResource(R$drawable.circle_item_menu_select);
                    }
                }
                else {
                    this.entityQuranTimeline.getQuranEntity().endAnimator();
                    this.invisibleSeekbar();
                    this.btn_unEffect.setBackgroundResource(R$drawable.circle_item_menu_select);
                }
            }
            this.transitionEntityAdabters.update(inTransition, "in", this.index);
            n = this.index;
            this.scroll(n);
            final Transition transition2 = this.transition;
            if (transition2 != null) {
                this.updateSeek(transition2.getDuration_in(), this.transition.isIn());
            }
        }
        else if (n == 1) {
            final List outTransition = this.getOutTransition();
            final Transition transition3 = this.transition;
            if (transition3 != null) {
                if (transition3.isOut()) {
                    if ((this.index = this.getIndex(outTransition, this.transition.getType_out())) != index) {
                        this.visibleSeekbar();
                        this.iTransition.updateDurationOut(this.transition.getDuration_out(), this.entityQuranTimeline);
                        this.btn_unEffect.setBackgroundResource(R$drawable.circle_effect);
                    }
                    else {
                        this.entityQuranTimeline.getQuranEntity().endAnimator();
                        this.invisibleSeekbar();
                        this.btn_unEffect.setBackgroundResource(R$drawable.circle_item_menu_select);
                    }
                }
                else {
                    this.entityQuranTimeline.getQuranEntity().endAnimator();
                    this.invisibleSeekbar();
                    this.btn_unEffect.setBackgroundResource(R$drawable.circle_item_menu_select);
                }
            }
            this.transitionEntityAdabters.update(outTransition, "out", this.index);
            n = this.index;
            this.scroll(n);
            final Transition transition4 = this.transition;
            if (transition4 != null) {
                this.updateSeek(transition4.getDuration_out(), this.transition.isOut());
            }
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEffectAyaBinding inflate = FragmentEffectAyaBinding.inflate(layoutInflater, viewGroup, false);
        this.transitionEntityBinding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.resources != null) {
            final EffectBismilahFragment$ITransition iTransition = this.iTransition;
            if (iTransition != null) {
                iTransition.playing(this.entityQuranTimeline);
                final TabLayout tabLayout = (TabLayout)((View)root).findViewById(R$id.tab_layout);
                this.tvDuration = (TextCustumFont)((View)root).findViewById(R$id.status_duration);
                final TabLayout$Tab tab = tabLayout.newTab();
                tab.setText((CharSequence)this.resources.getString(R$string.in_transition));
                tabLayout.addTab(tab);
                this.addCustomViewToTab(tab);
                final TabLayout$Tab tab2 = tabLayout.newTab();
                tab2.setText((CharSequence)this.resources.getString(R$string.out_transition));
                tabLayout.addTab(tab2);
                this.addCustomViewToTab(tab2);
                tabLayout.addOnTabSelectedListener((TabLayout$OnTabSelectedListener)new EffectBismilahFragment$1(this));
                Objects.requireNonNull(tabLayout.getTabAt(0)).select();
                final SeekBar seekBarDuration = (SeekBar)((View)root).findViewById(R$id.seekbar);
                this.seekBarDuration = seekBarDuration;
                final float time = this.time;
                final float n = 4.0f;
                seekBarDuration.setMax((int)(time * n));
                this.seekBarDuration.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new EffectBismilahFragment$2(this));
                this.btn_unEffect = (ImageButton)((View)root).findViewById(R$id.btn_unEffect);
                final Transition transition = this.transition;
                if (transition != null && transition.isIn()) {
                    final float min = Math.min(this.transition.getDuration_in(), this.time);
                    this.seekBarDuration.setProgress((int)(n * min));
                    this.tvDuration.setText((CharSequence)String.valueOf(this.seekBarDuration.getProgress() / 10.0f));
                    this.iTransition.updateDurationIn(min, this.entityQuranTimeline);
                    this.btn_unEffect.setBackgroundResource(R$drawable.circle_effect);
                }
                else {
                    final SeekBar seekBarDuration2 = this.seekBarDuration;
                    final int n2 = 8;
                    seekBarDuration2.setVisibility(n2);
                    this.tvDuration.setVisibility(n2);
                    this.btn_unEffect.setBackgroundResource(R$drawable.circle_item_menu_select);
                }
                final RecyclerView recyclerView = (RecyclerView)((View)root).findViewById(R$id.rv);
                this.recyclerView = recyclerView;
                final boolean b = true;
                recyclerView.setHasFixedSize(b);
                this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
                this.recyclerView.setItemViewCacheSize(20);
                this.recyclerView.setDrawingCacheEnabled(b);
                this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
                this.recyclerView.setDrawingCacheQuality(1048576);
                this.btn_unEffect.setOnClickListener((View$OnClickListener)new EffectBismilahFragment$3(this));
                ((View)root).findViewById(R$id.btn_close).setOnClickListener((View$OnClickListener)new EffectBismilahFragment$4(this));
                this.btnApplyAll = (LinearLayout)((View)root).findViewById(R$id.btn_appl_all);
                this.tv_apply_all = (TextCustumFont)((View)root).findViewById(R$id.tv_apply_all);
                this.iv_apply_all = (ImageView)((View)root).findViewById(R$id.iv_apply_all);
                this.tv_apply_all.setText((CharSequence)this.resources.getString(R$string.applyall));
                this.btnApplyAll.setEnabled(false);
                this.btnApplyAll.setClickable(false);
                this.btnApplyAll.setOnClickListener((View$OnClickListener)new EffectBismilahFragment$5(this));
                ((View)root).post((Runnable)new EffectBismilahFragment$6(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        final EffectBismilahFragment$ITransition iTransition = this.iTransition;
        if (iTransition != null) {
            iTransition.destroy(this.entityQuranTimeline);
        }
        final FragmentEffectAyaBinding transitionEntityBinding = this.transitionEntityBinding;
        if (transitionEntityBinding != null) {
            transitionEntityBinding.getRoot().removeAllViews();
            this.transitionEntityBinding = null;
        }
        EffectBismilahFragment.instance = null;
        super.onDestroyView();
    }
    
    public void scroll(final int n) {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        final View viewByPosition = linearLayoutManager.findViewByPosition(n);
        final int width = this.recyclerView.getWidth();
        int width2;
        if (viewByPosition != null) {
            width2 = viewByPosition.getWidth();
        }
        else {
            width2 = 0;
        }
        linearLayoutManager.scrollToPositionWithOffset(n, (width - width2) / 2);
    }
    
    public void updateButton(final Transition transition) {
        this.transition = transition;
        this.btn_unEffect.setBackgroundResource(R$drawable.circle_effect);
        this.visibleSeekbar();
    }
    
    public void updateView(final float n, final Transition transition) {
        this.transition = transition;
        if (this.seekBarDuration.getVisibility() != 0) {
            this.seekBarDuration.setVisibility(0);
            this.tvDuration.setVisibility(0);
        }
        this.btn_unEffect.setBackgroundResource(R$drawable.circle_effect);
        this.updateSeek(n, true);
        this.visibleApplyAll();
    }
    
    public void visibleApplyAll() {
        if (this.btnApplyAll.isEnabled()) {
            return;
        }
        final LinearLayout btnApplyAll = this.btnApplyAll;
        final boolean b = true;
        btnApplyAll.setEnabled(b);
        this.btnApplyAll.setClickable(b);
        final TextCustumFont tv_apply_all = this.tv_apply_all;
        final int textColor = -1;
        tv_apply_all.setTextColor(textColor);
        this.iv_apply_all.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
    }
}
