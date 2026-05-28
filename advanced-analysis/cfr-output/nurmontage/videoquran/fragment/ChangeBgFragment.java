/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.LinearSnapHelper
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.BgAdapter;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$$ExternalSyntheticLambda7;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.model.BgItem;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;

public class ChangeBgFragment
extends Fragment {
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

    public ChangeBgFragment(ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback, Resources resources, String string2) {
        this.callback = changeBgFragment$IChangeBgCallback;
        this.res = resources;
        this.selectedBg = string2;
    }

    private void bindViews(View object) {
        Object object2;
        int n = R$id.rv;
        this.recyclerView = object2 = (RecyclerView)object.findViewById(n);
        n = R$id.layout_bg_rv;
        object2 = object.findViewById(n);
        this.layoutBgRv = object2;
        n = R$id.layout_add_video_img;
        object2 = object.findViewById(n);
        this.layoutAddVideo = object2;
        object2 = this.res;
        if (object2 != null) {
            n = R$id.tv_img;
            object2 = (TextCustumFont)object.findViewById(n);
            Object object3 = this.res;
            int n2 = R$string.image;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_video;
            object = (TextCustumFont)object.findViewById(n);
            object2 = this.res;
            int n3 = R$string.video;
            object2 = object2.getString(n3);
            object.setText((CharSequence)object2);
        }
    }

    private int findSelectedIndex(List list) {
        int n;
        String string2 = this.selectedBg;
        if (string2 == null) {
            return 0;
        }
        string2 = null;
        for (int i = 0; i < (n = list.size()); ++i) {
            String string3 = this.selectedBg;
            String string4 = ((BgItem)list.get(i)).getName_drawable();
            n = string3.equals(string4) ? 1 : 0;
            if (n == 0) continue;
            return i;
        }
        return 0;
    }

    private List getBgData() {
        ArrayList<BgItem> arrayList = new ArrayList<BgItem>();
        int n = R$drawable.bg_21;
        float f = 0.1734694f;
        float f2 = 0.31632653f;
        BgItem bgItem = new BgItem(n, f, f2, "bg_21");
        arrayList.add(bgItem);
        n = R$drawable.bg_22;
        bgItem = new BgItem(n, f, f2, "bg_22");
        arrayList.add(bgItem);
        n = R$drawable.bg_23;
        bgItem = new BgItem(n, f, f2, "bg_23");
        arrayList.add(bgItem);
        n = R$drawable.bg_24;
        bgItem = new BgItem(n, f, f2, "bg_24");
        arrayList.add(bgItem);
        n = R$drawable.bg_25;
        bgItem = new BgItem(n, f, f2, "bg_25");
        arrayList.add(bgItem);
        n = R$drawable.bg_26;
        bgItem = new BgItem(n, f, f2, "bg_26");
        arrayList.add(bgItem);
        n = R$drawable.bg_27;
        bgItem = new BgItem(n, f, f2, "bg_27");
        arrayList.add(bgItem);
        n = R$drawable.bg_32;
        bgItem = new BgItem(n, f, f2, "bg_32");
        arrayList.add(bgItem);
        n = R$drawable.bg_33;
        bgItem = new BgItem(n, f, f2, "bg_33");
        arrayList.add(bgItem);
        n = R$drawable.bg_34;
        bgItem = new BgItem(n, f, f2, "bg_34");
        arrayList.add(bgItem);
        n = R$drawable.bg_35;
        bgItem = new BgItem(n, f, f2, "bg_35");
        arrayList.add(bgItem);
        n = R$drawable.bg_36;
        bgItem = new BgItem(n, f, f2, "bg_36");
        arrayList.add(bgItem);
        n = R$drawable.bg_37;
        bgItem = new BgItem(n, f, f2, "bg_37");
        arrayList.add(bgItem);
        n = R$drawable.bg_38;
        bgItem = new BgItem(n, f, f2, "bg_38");
        arrayList.add(bgItem);
        n = R$drawable.bg_28;
        bgItem = new BgItem(n, f, f2, "bg_28");
        arrayList.add(bgItem);
        n = R$drawable.bg_29;
        bgItem = new BgItem(n, f, f2, "bg_29");
        arrayList.add(bgItem);
        n = R$drawable.bg_30;
        bgItem = new BgItem(n, f, f2, "bg_30");
        arrayList.add(bgItem);
        n = R$drawable.bg_31;
        bgItem = new BgItem(n, f, f2, "bg_31");
        arrayList.add(bgItem);
        n = R$drawable.bg_1;
        bgItem = new BgItem(n, f, 0.51632655f, "bg_1");
        arrayList.add(bgItem);
        n = R$drawable.bg_2;
        f2 = 0.45918366f;
        bgItem = new BgItem(n, f2, 0.3392857f, "bg_2");
        arrayList.add(bgItem);
        n = R$drawable.bg_3;
        bgItem = new BgItem(n, 0.21683674f, 0.073979594f, "bg_3");
        arrayList.add(bgItem);
        n = R$drawable.bg_4;
        bgItem = new BgItem(n, 0.3469388f, 0.30612245f, "bg_4");
        arrayList.add(bgItem);
        n = R$drawable.bg_5;
        bgItem = new BgItem(n, 0.19132653f, 0.26785713f, "bg_5");
        arrayList.add(bgItem);
        n = R$drawable.bg_6;
        bgItem = new BgItem(n, 0.4486844f, 0.093112245f, "bg_6");
        arrayList.add(bgItem);
        n = R$drawable.bg_7;
        bgItem = new BgItem(n, 0.41326532f, f2, "bg_7");
        arrayList.add(bgItem);
        n = R$drawable.bg_8;
        bgItem = new BgItem(n, 0.42091838f, 0.44005102f, "bg_8");
        arrayList.add(bgItem);
        n = R$drawable.bg_9;
        bgItem = new BgItem(n, 0.3482143f, 0.2614796f, "bg_9");
        arrayList.add(bgItem);
        n = R$drawable.bg_10;
        f2 = 0.17219388f;
        bgItem = new BgItem(n, 0.3137755f, f2, "bg_10");
        arrayList.add(bgItem);
        n = R$drawable.bg_11;
        bgItem = new BgItem(n, 0.49107143f, f2, "bg_11");
        arrayList.add(bgItem);
        n = R$drawable.bg_12;
        bgItem = new BgItem(n, 0.2755102f, 0.16709183f, "bg_12");
        arrayList.add(bgItem);
        n = R$drawable.bg_13;
        f = 0.35841838f;
        f2 = 0.1747449f;
        bgItem = new BgItem(n, f, f2, "bg_13");
        arrayList.add(bgItem);
        n = R$drawable.bg_14;
        bgItem = new BgItem(n, f, f2, "bg_14");
        arrayList.add(bgItem);
        n = R$drawable.bg_15;
        bgItem = new BgItem(n, f, f2, "bg_15");
        arrayList.add(bgItem);
        n = R$drawable.bg_16;
        bgItem = new BgItem(n, f, f2, "bg_16");
        arrayList.add(bgItem);
        n = R$drawable.bg_17;
        bgItem = new BgItem(n, f, f2, "bg_17");
        arrayList.add(bgItem);
        n = R$drawable.bg_18;
        bgItem = new BgItem(n, f, f2, "bg_18");
        arrayList.add(bgItem);
        n = R$drawable.bg_19;
        bgItem = new BgItem(n, f, f2, "bg_19");
        arrayList.add(bgItem);
        n = R$drawable.bg_20;
        bgItem = new BgItem(n, f, f2, "bg_20");
        arrayList.add(bgItem);
        return arrayList;
    }

    public static ChangeBgFragment getInstance(ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback, Resources resources, String string2) {
        ChangeBgFragment changeBgFragment = instance;
        if (changeBgFragment == null) {
            instance = changeBgFragment = new ChangeBgFragment(changeBgFragment$IChangeBgCallback, resources, string2);
        }
        return instance;
    }

    private void setupButtons(View view) {
        int n = R$id.btn_add;
        View view2 = view.findViewById(n);
        Object object = new ChangeBgFragment$$ExternalSyntheticLambda1(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_close;
        view2 = view.findViewById(n);
        object = new ChangeBgFragment$$ExternalSyntheticLambda2(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_add_img;
        view2 = view.findViewById(n);
        object = new ChangeBgFragment$$ExternalSyntheticLambda3(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_add_video;
        view2 = view.findViewById(n);
        object = new ChangeBgFragment$$ExternalSyntheticLambda4(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_done;
        view2 = view.findViewById(n);
        object = new ChangeBgFragment$$ExternalSyntheticLambda5(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_cancel;
        view2 = view.findViewById(n);
        object = new ChangeBgFragment$$ExternalSyntheticLambda6(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = R$id.btn_crop;
        view2 = (ImageButton)view.findViewById(n);
        int n2 = this.isSubscribed;
        if (n2 == 0) {
            n2 = -8355712;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            view2.setColorFilter(n2, mode);
        }
        object = new ChangeBgFragment$$ExternalSyntheticLambda7(this);
        view2.setOnClickListener((View.OnClickListener)object);
        n = this.isSubscribed ? 1 : 0;
        if (n == 0) {
            n = R$id.iv_data_disable;
            view = view.findViewById(n);
            n = 0;
            view2 = null;
            view.setVisibility(0);
        }
    }

    private void setupRecycler() {
        BgAdapter bgAdapter;
        int n = (int)((float)ScreenUtils.getScreenWidth((Activity)this.requireActivity()) * 0.2f);
        List list = this.getBgData();
        Object object = AppUtils.getAppVersionName(this.getContext());
        ChangeBgFragment$IChangeBgCallback changeBgFragment$IChangeBgCallback = this.callback;
        int n2 = this.findSelectedIndex(list);
        Object object2 = bgAdapter;
        this.adapter = bgAdapter = new BgAdapter((String)object, changeBgFragment$IChangeBgCallback, list, n, n2);
        object2 = this.getContext();
        bgAdapter = new LinearLayoutManager((Context)object2, 0, false);
        boolean bl = true;
        bgAdapter.setItemPrefetchEnabled(bl);
        bgAdapter.setInitialPrefetchItemCount(6);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)bgAdapter);
        bgAdapter = this.recyclerView;
        object = this.adapter;
        bgAdapter.setAdapter((RecyclerView.Adapter)object);
        this.recyclerView.setHasFixedSize(bl);
        this.recyclerView.setItemViewCacheSize(12);
        this.recyclerView.setItemAnimator(null);
        bgAdapter = new LinearSnapHelper();
        object2 = this.recyclerView;
        bgAdapter.attachToRecyclerView((RecyclerView)object2);
        bgAdapter = this.recyclerView;
        object2 = new ChangeBgFragment$$ExternalSyntheticLambda0(this);
        bgAdapter.post((Runnable)object2);
    }

    /* synthetic */ void cfr_renamed_178(View view) {
        this.layoutAddVideo.setVisibility(0);
        this.layoutBgRv.setVisibility(4);
    }

    /* synthetic */ void cfr_renamed_179(View view) {
        this.layoutAddVideo.setVisibility(8);
        this.layoutBgRv.setVisibility(0);
    }

    /* synthetic */ void cfr_renamed_180(View object) {
        object = this.callback;
        if (object != null) {
            object.onUploadImg();
        }
    }

    /* synthetic */ void cfr_renamed_181(View object) {
        object = this.callback;
        if (object == null) {
            return;
        }
        boolean bl = this.isSubscribed;
        if (!bl) {
            object.onSubscribe();
        } else {
            object.onUploadVideo();
        }
    }

    /* synthetic */ void cfr_renamed_182(View object) {
        object = this.callback;
        if (object != null) {
            object.onDone();
        }
    }

    /* synthetic */ void cfr_renamed_183(View object) {
        object = this.callback;
        if (object != null) {
            object.onCancel();
        }
    }

    /* synthetic */ void cfr_renamed_184(View view) {
        this.callback.onCrop();
    }

    public void onCreate(Bundle object) {
        boolean bl;
        super.onCreate(object);
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            String string2 = "bg_select";
            object = object.getString(string2);
            this.selectedBg = object;
        }
        this.isSubscribed = bl = BillingPreferences.isSubscribed(this.requireContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n = R$layout.fragment_change_bg;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        this.bindViews((View)layoutInflater);
        this.setupRecycler();
        this.setupButtons((View)layoutInflater);
        return layoutInflater;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.callback = null;
        instance = null;
    }

    public void scrollToSelected() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        int n = (recyclerView = recyclerView.getLayoutManager()) instanceof LinearLayoutManager;
        if (n != 0) {
            recyclerView = (LinearLayoutManager)recyclerView;
            BgAdapter bgAdapter = this.adapter;
            n = bgAdapter.getSelectedPosition();
            RecyclerView recyclerView2 = this.recyclerView;
            int n2 = recyclerView2.getWidth() / 2;
            recyclerView.scrollToPositionWithOffset(n, n2);
        }
    }
}

