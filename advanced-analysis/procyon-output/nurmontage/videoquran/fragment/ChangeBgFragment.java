// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import android.graphics.PorterDuff$Mode;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.model.BgItem;
import java.util.List;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.R$id;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import hazem.nurmontage.videoquran.adabter.BgAdapter;
import androidx.fragment.app.Fragment;

public class ChangeBgFragment extends Fragment
{
    public static ChangeBgFragment instance;
    private BgAdapter adapter;
    private ChangeBgFragment$IChangeBgCallback callback;
    private boolean isSubscribed;
    private View layoutAddVideo;
    private View layoutBgRv;
    private RecyclerView recyclerView;
    private Resources res;
    private String selectedBg;
    
    public ChangeBgFragment() {
    }
    
    public ChangeBgFragment(final ChangeBgFragment$IChangeBgCallback callback, final Resources res, final String selectedBg) {
        this.callback = callback;
        this.res = res;
        this.selectedBg = selectedBg;
    }
    
    private void bindViews(final View view) {
        this.recyclerView = (RecyclerView)view.findViewById(R$id.rv);
        this.layoutBgRv = view.findViewById(R$id.layout_bg_rv);
        this.layoutAddVideo = view.findViewById(R$id.layout_add_video_img);
        if (this.res != null) {
            ((TextCustumFont)view.findViewById(R$id.tv_img)).setText((CharSequence)this.res.getString(R$string.image));
            ((TextCustumFont)view.findViewById(R$id.tv_video)).setText((CharSequence)this.res.getString(R$string.video));
        }
    }
    
    private int findSelectedIndex(final List list) {
        if (this.selectedBg == null) {
            return 0;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (this.selectedBg.equals(((BgItem)list.get(i)).getName_drawable())) {
                return i;
            }
        }
        return 0;
    }
    
    private List getBgData() {
        final ArrayList list = new ArrayList();
        final int bg_21 = R$drawable.bg_21;
        final float n = 0.1734694f;
        final float n2 = 0.31632653f;
        list.add(new BgItem(bg_21, n, n2, "bg_21"));
        list.add(new BgItem(R$drawable.bg_22, n, n2, "bg_22"));
        list.add(new BgItem(R$drawable.bg_23, n, n2, "bg_23"));
        list.add(new BgItem(R$drawable.bg_24, n, n2, "bg_24"));
        list.add(new BgItem(R$drawable.bg_25, n, n2, "bg_25"));
        list.add(new BgItem(R$drawable.bg_26, n, n2, "bg_26"));
        list.add(new BgItem(R$drawable.bg_27, n, n2, "bg_27"));
        list.add(new BgItem(R$drawable.bg_32, n, n2, "bg_32"));
        list.add(new BgItem(R$drawable.bg_33, n, n2, "bg_33"));
        list.add(new BgItem(R$drawable.bg_34, n, n2, "bg_34"));
        list.add(new BgItem(R$drawable.bg_35, n, n2, "bg_35"));
        list.add(new BgItem(R$drawable.bg_36, n, n2, "bg_36"));
        list.add(new BgItem(R$drawable.bg_37, n, n2, "bg_37"));
        list.add(new BgItem(R$drawable.bg_38, n, n2, "bg_38"));
        list.add(new BgItem(R$drawable.bg_28, n, n2, "bg_28"));
        list.add(new BgItem(R$drawable.bg_29, n, n2, "bg_29"));
        list.add(new BgItem(R$drawable.bg_30, n, n2, "bg_30"));
        list.add(new BgItem(R$drawable.bg_31, n, n2, "bg_31"));
        list.add(new BgItem(R$drawable.bg_1, n, 0.51632655f, "bg_1"));
        final int bg_22 = R$drawable.bg_2;
        final float n3 = 0.45918366f;
        list.add(new BgItem(bg_22, n3, 0.3392857f, "bg_2"));
        list.add(new BgItem(R$drawable.bg_3, 0.21683674f, 0.073979594f, "bg_3"));
        list.add(new BgItem(R$drawable.bg_4, 0.3469388f, 0.30612245f, "bg_4"));
        list.add(new BgItem(R$drawable.bg_5, 0.19132653f, 0.26785713f, "bg_5"));
        list.add(new BgItem(R$drawable.bg_6, 0.4486844f, 0.093112245f, "bg_6"));
        list.add(new BgItem(R$drawable.bg_7, 0.41326532f, n3, "bg_7"));
        list.add(new BgItem(R$drawable.bg_8, 0.42091838f, 0.44005102f, "bg_8"));
        list.add(new BgItem(R$drawable.bg_9, 0.3482143f, 0.2614796f, "bg_9"));
        final int bg_23 = R$drawable.bg_10;
        final float n4 = 0.17219388f;
        list.add(new BgItem(bg_23, 0.3137755f, n4, "bg_10"));
        list.add(new BgItem(R$drawable.bg_11, 0.49107143f, n4, "bg_11"));
        list.add(new BgItem(R$drawable.bg_12, 0.2755102f, 0.16709183f, "bg_12"));
        final int bg_24 = R$drawable.bg_13;
        final float n5 = 0.35841838f;
        final float n6 = 0.1747449f;
        list.add(new BgItem(bg_24, n5, n6, "bg_13"));
        list.add(new BgItem(R$drawable.bg_14, n5, n6, "bg_14"));
        list.add(new BgItem(R$drawable.bg_15, n5, n6, "bg_15"));
        list.add(new BgItem(R$drawable.bg_16, n5, n6, "bg_16"));
        list.add(new BgItem(R$drawable.bg_17, n5, n6, "bg_17"));
        list.add(new BgItem(R$drawable.bg_18, n5, n6, "bg_18"));
        list.add(new BgItem(R$drawable.bg_19, n5, n6, "bg_19"));
        list.add(new BgItem(R$drawable.bg_20, n5, n6, "bg_20"));
        return list;
    }
    
    public static ChangeBgFragment getInstance(final ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback, final Resources resources, final String s) {
        if (ChangeBgFragment.instance == null) {
            ChangeBgFragment.instance = new ChangeBgFragment(changeBgFragment$IChangeBgCallback, resources, s);
        }
        return ChangeBgFragment.instance;
    }
    
    private void setupButtons(View viewById) {
        viewById.findViewById(R$id.btn_add).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda1(this));
        viewById.findViewById(R$id.btn_close).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda2(this));
        viewById.findViewById(R$id.btn_add_img).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda3(this));
        viewById.findViewById(R$id.btn_add_video).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda4(this));
        viewById.findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda5(this));
        viewById.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda6(this));
        final ImageButton imageButton = (ImageButton)viewById.findViewById(R$id.btn_crop);
        if (!this.isSubscribed) {
            imageButton.setColorFilter(-8355712, PorterDuff$Mode.SRC_IN);
        }
        imageButton.setOnClickListener((View$OnClickListener)new ChangeBgFragment$$ExternalSyntheticLambda7(this));
        if (!this.isSubscribed) {
            viewById = viewById.findViewById(R$id.iv_data_disable);
            viewById.setVisibility(0);
        }
    }
    
    private void setupRecycler() {
        final int n = (int)(ScreenUtils.getScreenWidth((Activity)this.requireActivity()) * 0.2f);
        final List bgData = this.getBgData();
        this.adapter = new BgAdapter(AppUtils.getAppVersionName(this.getContext()), this.callback, bgData, n, this.findSelectedIndex(bgData));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext(), 0, false);
        final boolean b = true;
        layoutManager.setItemPrefetchEnabled(b);
        layoutManager.setInitialPrefetchItemCount(6);
        this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)layoutManager);
        this.recyclerView.setAdapter((RecyclerView$Adapter)this.adapter);
        this.recyclerView.setHasFixedSize(b);
        this.recyclerView.setItemViewCacheSize(12);
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        new LinearSnapHelper().attachToRecyclerView(this.recyclerView);
        this.recyclerView.post((Runnable)new ChangeBgFragment$$ExternalSyntheticLambda0(this));
    }
    
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getArguments();
        if (bundle != null) {
            bundle = this.getArguments();
            this.selectedBg = bundle.getString("bg_select");
        }
        this.isSubscribed = BillingPreferences.isSubscribed(this.requireContext());
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_change_bg, viewGroup, false);
        this.bindViews(inflate);
        this.setupRecycler();
        this.setupButtons(inflate);
        return inflate;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.callback = null;
        ChangeBgFragment.instance = null;
    }
    
    public void scrollToSelected() {
        final RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        final RecyclerView$LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager)layoutManager).scrollToPositionWithOffset(this.adapter.getSelectedPosition(), this.recyclerView.getWidth() / 2);
        }
    }
}
